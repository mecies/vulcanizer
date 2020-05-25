<template>
  <div class="flex flex-row justify-around">
    <app-header-item
      v-for="(icon, index) in icons"
      :key="`icon-${icon}-index${index}`"
      :icon="icon.name"
      :selected="icon.selected"
    />
  </div>
</template>

<script>
import AppHeaderItem from '@/components/shared/header/AppHeaderItem.vue'

export default {
  components: {
    AppHeaderItem
  },
  data() {
    return {
      iconNames: [
        {
          name: 'index'
        },
        {
          name: 'dices'
        },
        {
          name: 'volcano'
        },
        {
          name: 'volcanoList'
        },
        {
          name: 'location'
        }
      ]
    }
  },
  computed: {
    icons() {
      return this.iconNames.map(({ name }) => ({
        name,
        selected: this.$router.history.current.name === name
      }))
    }
  }
}
</script>
