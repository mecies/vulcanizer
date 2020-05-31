<template>
  <h2 :class="`text-2xl text-${color}`">
    <slot>Title</slot>
  </h2>
</template>

<script>
export default {
  props: {
    color: {
      type: String,
      default: 'volcano'
    }
  }
}
</script>
