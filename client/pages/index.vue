<template>
  <div class="container">
    <div>
      <h1 class="title">
        vulcanizer
      </h1>
      <h2 class="subtitle">
        Our extraordinary vulcano project
      </h2>
      <h2 class="subtitle">volcanoes list</h2>
      <VolcanoList />
    </div>
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
    ...mapActions(['volcano/setVolcanoes'])
  }
}
</script>

<style>
.container {
  margin: 0 auto;
  min-height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
}

.title {
  font-family: 'Quicksand', 'Source Sans Pro', -apple-system, BlinkMacSystemFont,
    'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif;
  display: block;
  font-weight: 300;
  font-size: 100px;
  color: #35495e;
  letter-spacing: 1px;
}

.subtitle {
  font-weight: 300;
  font-size: 42px;
  color: #526488;
  word-spacing: 5px;
  padding-bottom: 15px;
}
</style>
