<template>
  <div class="pt-16 lg:pt-24 min-h-screen">
    <div class="mt-12 grid grid-cols-1 row-gap-10">
      <text-title class="text-center">
        volcano list page
      </text-title>
      <volcano-list />
    </div>
  </div>
</template>

<script>
import TextTitle from '@/components/shared/text/TextTitle.vue'
import VolcanoList from '@/components/VolcanoList.vue'

export default {
  layout: 'withHeader',
  components: {
    TextTitle,
    VolcanoList
  }
}
</script>
