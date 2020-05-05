<template>
  <ul>
    <li
      v-for="(volcano, index) in volcanoes"
      :key="`volcano-${volcano}-index-${index}`"
    >
      {{ volcano }}
    </li>
  </ul>
</template>

<script>
import { mapState } from 'vuex'

export default {
  computed: mapState('volcano', ['volcanoes'])
}
</script>

<style></style>
