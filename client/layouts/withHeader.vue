<template>
  <div class="container min-h-screen mx-auto bg-cream">
    <app-header />
    <nuxt />
  </div>
</template>

<script>
import AppHeader from '@/components/shared/header/AppHeader.vue'

export default {
  components: {
    AppHeader
  }
}
</script>

<style>
html {
  font-family: 'Short Stack', cursive;
}
</style>
