<template>
  <div
    class="flex justify-between items-center bg-volcano rounded-full py-4 px-6 shadow-lg w-11/12"
  >
    <svg-icon iconName="volcano" />
    <div class="flex flex-col ml-6 w-full">
      <!--  after expand
      <div>
        <span class="text-cream">Name: </span>
        <span class="text-lava">{{ name }} </span>
      </div>
       -->
      <h2 class="text-cream text-l truncate w-48">{{ name }}</h2>
    </div>
    <svg-icon class="ml-4" iconName="arrowDown" />
  </div>
</template>

<script>
import SvgIcon from '@/components/shared/svg/SvgIcon.vue'

export default {
  components: { SvgIcon },
  props: {
    country: {
      type: String,
      required: false, // todo true
      default: 'Loading country'
    },
    name: {
      type: String,
      required: false, // todo true
      default: 'Loading name'
    }
  }
}
</script>
