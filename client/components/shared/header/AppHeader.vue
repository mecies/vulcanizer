<template>
  <div class="flex flex-row justify-around">
    <app-header-item
      v-for="(icon, index) in icons"
      :icon="icon.name"
      :selected="icon.selected"
      :key="`icon-${icon}-index${index}`"
    />
  </div>
</template>

<script>
import AppHeaderItem from '@/components/shared/header/AppHeaderItem.vue'

export default {
  components: {
    AppHeaderItem
  },
  computed: {
    icons() {
      return [
        {
          name: 'home',
          selected: this.$router.history.current.name === 'home'
        },
        {
          name: 'dices',
          selected: this.$router.history.current.name === 'dices'
        },
        {
          name: 'volcano',
          selected: this.$router.history.current.name === 'volcano'
        },
        {
          name: 'volcanoList',
          selected: this.$router.history.current.name === 'volcanoList'
        },
        {
          name: 'location',
          selected: this.$router.history.current.name === 'location'
        }
      ]
    }
  }
}
</script>
