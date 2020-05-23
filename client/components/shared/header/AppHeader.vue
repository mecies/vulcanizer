<template>
  <div class="flex flex-row justify-around">
    <app-header-item
      v-for="(icon, index) in icons"
      :icon="icon"
      :key="`icon-${icon}-index${index}`"
    />
  </div>
</template>

<script>
import AppHeaderItem from '@/components/shared/header/AppHeaderItem.vue'
import { headerData } from '@/data/headerData'

export default {
  components: {
    AppHeaderItem
  },
  data() {
    return {
      icons: headerData.icons
    }
  }
}
</script>
