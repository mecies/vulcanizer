<template>
  <h2 :class="`text-xl text-${color}`">
    <slot>Subtitle</slot>
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
