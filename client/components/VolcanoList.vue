<template>
  <ul>
    <li
      v-for="(volcano, index) in volcanoes"
      :key="`volcano-${volcano}-index-${index}`"
      class="mb-4"
    >
      <VolcanoCard :name="volcano.name" :country="volcano.country" />
    </li>
  </ul>
</template>

<script>
import { mapState } from 'vuex'
import VolcanoCard from '@/components/VolcanoCard'

export default {
  components: {
    VolcanoCard
  },
  computed: mapState('volcano', ['volcanoes'])
}
</script>

<style></style>
