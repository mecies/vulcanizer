<template>
  <div class="pt-16 lg:pt-24 min-h-screen">
    <div class="mt-16 lg:mt-24 grid grid-cols-1 row-gap-10">
      <logo />
      <text-title class="text-center">
        explosive source of volcano information
      </text-title>
      <text-subtitle class="text-center">
        developed with love by <br />
        <a href="https://github.com/mecies" target="_blank" class="text-lava">
          Maciek
        </a>
        &#x00026;
        <a href="https://github.com/macryo" target="_blank" class="text-lava">
          Maciek
        </a>
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
