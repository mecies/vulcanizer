<template>
  <div class="flex flex-col justify-center items-center mt-10">
    <h1 class="text-6xl my-2">
      <span class="text-red-400">VULCAN</span>
      <span>IZER</span>
    </h1>
    <h2 class="text-3xl my-2">
      Our extraordinary volcano project
    </h2>
    <h2 class="text-2xl my-2">Press the button to load list of volcanoes</h2>
    <button class="rounded-lg border p-4  mb-4" @click="fetchVolcanoes">
      🎉 CLICK ME
    </button>
    <VolcanoList />
  </div>
</template>

<script>
import { mapActions } from 'vuex'
import VolcanoList from '@/components/VolcanoList.vue'

export default {
  components: {
    VolcanoList
  },
  methods: {
    ...mapActions(mapActions('volcano', ['fetchVolcanoes']))
  }
}
</script>
