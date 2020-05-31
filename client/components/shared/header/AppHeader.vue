<template>
  <div class="container fixed pb-8">
    <div class="flex flex-row justify-around">
      <app-header-item
        v-for="({ path, icon }, index) in options"
        :key="`icon-${icon}-index${index}`"
        :icon="icon"
        :to="path"
        :selected="$route.path === path"
      />
    </div>
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
      options: [
        {
          path: '/',
          icon: 'index'
        },
        {
          path: '/random',
          icon: 'dices'
        },
        {
          path: '/volcano',
          icon: 'volcano'
        },
        {
          path: '/volcanoes',
          icon: 'volcanoList'
        },
        {
          path: '/location',
          icon: 'location'
        }
      ]
    }
  }
}
</script>
