<template>
  <div
    :class="
      `flex items-center justify-center h-16 w-full bg-${backgroundClass}`
    "
  >
    <svg-icon :selected="selected" :iconName="icon"><slot></slot></svg-icon>
  </div>
</template>

<script>
import SvgIcon from '@/components/shared/svg/SvgIcon.vue'

export default {
  props: {
    icon: {
      type: String,
      required: true
    },
    selected: {
      type: Boolean,
      default: false
    }
  },
  computed: {
    backgroundClass() {
      return this.selected ? 'lava' : 'volcano'
    }
  },
  components: {
    SvgIcon
  }
}
</script>
