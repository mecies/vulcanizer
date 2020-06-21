<template>
  <div class="pt-16 lg:pt-24 min-h-screen">
    <div class="mt-12 grid grid-cols-1 row-gap-10">
      <text-title class="text-center">
        search for a volcano
      </text-title>
      <div class="w-full flex justify-center">
        <div class="bg-volcano h-0.5 w-11/12 opacity-75"></div>
      </div>
      <div class="flex justify-center w-full">
        <text-subtitle class="w-3/4 text-center">
          We have selected 10 volcanoes for you 🎉
        </text-subtitle>
      </div>
      <volcano-list />
    </div>
  </div>
</template>

<script>
import TextTitle from '@/components/shared/text/TextTitle.vue'
import TextSubtitle from '@/components/shared/text/TextSubtitle.vue'
import VolcanoList from '@/components/VolcanoList.vue'

export default {
  layout: 'withHeader',
  components: {
    TextTitle,
    TextSubtitle,
    VolcanoList
  }
}
</script>
