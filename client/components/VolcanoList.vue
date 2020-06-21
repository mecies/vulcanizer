<template>
  <ul class="space-y-4">
    <li
      v-for="(volcano, index) in volcanoes"
      :key="`volcano-${volcano}-index-${index}`"
      class="flex justify-center"
    >
      <VolcanoCard
        :name="volcano.name"
        :country="volcano.country"
        :elevation="volcano.elevation"
        :latitude="volcano.latitude"
        :longitude="volcano.longitude"
      />
    </li>
  </ul>
</template>

<script>
import VolcanoCard from '@/components/VolcanoCard'

export default {
  beforeMount() {
    this.$store.dispatch('volcano/fetchVolcanoes')
  },
  components: {
    VolcanoCard
  },
  computed: {
    volcanoes() {
      return this.$store.getters['volcano/getRandomTen']
    }
  }
}
</script>

<style></style>
