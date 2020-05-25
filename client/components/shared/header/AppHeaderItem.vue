<template>
  <nuxt-link class="w-full" :to="to">
    <div
      :class="
        `flex items-center justify-center h-16 w-full bg-${backgroundClass}`
      "
    >
      <svg-icon :selected="selected" :iconName="icon" />
    </div>
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
