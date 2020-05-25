<template>
  <nuxt-link
    :class="
      `flex items-center justify-center h-16 w-full bg-${backgroundClass}`
    "
    :to="to"
  >
    <svg-icon :selected="selected" :iconName="icon"><slot></slot></svg-icon>
  </nuxt-link>
</template>

<script>
import SvgIcon from '@/components/shared/svg/SvgIcon.vue'

export default {
  components: {
    SvgIcon
  },
  props: {
    icon: {
      type: String,
      required: true
    },
    selected: {
      type: Boolean,
      default: false
    },
    to: {
      type: String,
      required: true
    }
  },
  computed: {
    backgroundClass() {
      return this.selected ? 'lava' : 'volcano'
    }
  }
}
</script>
