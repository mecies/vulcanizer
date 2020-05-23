<template>
  <div class="flex items-center justify-center h-12 w-full bg-volcano">
    <svg-icon :iconName="icon"><slot></slot></svg-icon>
  </div>
</template>

<script>
import SvgIcon from '@/components/shared/svg/SvgIcon.vue'

export default {
  props: {
    icon: {
      type: String,
      required: true
    }
  },
  components: {
    SvgIcon
  }
}
</script>
