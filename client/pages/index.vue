<template>
  <div class="pt-16">
    <div class="mt-16 grid grid-rows-3 grid-cols-1 items-home-mobile row-gap-6">
      <logo />
      <text-title class="text-center">
        explosive source of volcano information
      </text-title>
      <text-subtitle class="text-center">
        developed with love by <br />
        <span class="text-lava">Maciek</span>
        &#x00026;
        <span class="text-lava">Maciek</span>
      </text-subtitle>
    </div>
  </div>
</template>

<script>
import Logo from '@/components/shared/Logo.vue'
import TextTitle from '@/components/shared/text/TextTitle.vue'
import TextSubtitle from '@/components/shared/text/TextSubtitle.vue'

export default {
  layout: 'withHeader',
  components: {
    Logo,
    TextTitle,
    TextSubtitle
  }
}
</script>
