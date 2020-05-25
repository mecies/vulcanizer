<template>
  <div class="container">
    <app-header />
    <div
      class="my-12 h-full grid grid-rows-3 grid-cols-1 items-home-mobile row-gap-6"
    >
      <logo />
      <text-title class="text-center">
        explosive source of volcano information
      </text-title>
      <text-subtitle class="text-center">
        explosive source of volcano information
      </text-subtitle>
    </div>
  </div>
</template>

<script>
import Logo from '@/components/shared/Logo.vue'
import AppHeader from '@/components/shared/header/AppHeader.vue'
import TextTitle from '@/components/shared/text/TextTitle.vue'
import TextSubtitle from '@/components/shared/text/TextSubtitle.vue'

export default {
  components: {
    AppHeader,
    Logo,
    TextTitle,
    TextSubtitle
  }
}
</script>
