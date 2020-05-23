<template>
  <div class="flex">
    <svg-icon iconName="home"></svg-icon>
    <svg-icon iconName="dices"></svg-icon>
    <svg-icon iconName="volcano"></svg-icon>
    <svg-icon iconName="volcanoList"></svg-icon>
    <svg-icon iconName="location"></svg-icon>
    <svg-icon iconName="home" selected></svg-icon>
    <svg-icon iconName="dices" selected></svg-icon>
    <svg-icon iconName="volcano" selected></svg-icon>
    <svg-icon iconName="volcanoList" selected></svg-icon>
    <svg-icon iconName="location" selected></svg-icon>
  </div>
</template>

<script>
import SvgIcon from '@/components/shared/svg/SvgIcon.vue'

export default {
  components: {
    SvgIcon
  }
}
</script>
