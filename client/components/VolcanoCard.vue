<template>
  <div class="flex flex-col rounded-xl bg-volcano shadow-lg w-11/12 p-4">
    <div class="flex justify-between items-center" @click="toggleActive">
      <svg-icon class="self-start" width="50" iconName="volcano" />
      <div class="flex flex-col ml-6 w-full">
        <h2 class="text-cream text-l truncate w-48">{{ name }}</h2>
      </div>
      <svg-icon class="mx-4" :iconName="arrowDirection" />
    </div>
    <div class="w-full m-4" v-if="isActive">
      <div>
        <span class="text-cream">Country: </span>
        <span class="text-lava">{{ country }} </span>
      </div>
      <div>
        <span class="text-cream">Elevation: </span>
        <span class="text-lava">{{ elevation }} m.a.s.l</span>
      </div>
      <div>
        <span class="text-cream">Latitude: </span>
        <span class="text-lava">{{ latitude }} </span>
      </div>
      <div>
        <span class="text-cream">Longitude: </span>
        <span class="text-lava">{{ longitude }} </span>
      </div>
    </div>
  </div>
</template>

<script>
import SvgIcon from '@/components/shared/svg/SvgIcon.vue'

export default {
  data() {
    return {
      isActive: false
    }
  },
  components: { SvgIcon },
  props: {
    country: {
      type: String,
      required: false,
      default: 'Loading country'
    },
    name: {
      type: String,
      required: false,
      default: 'Loading name'
    },
    elevation: {
      type: Number,
      required: false
    },
    latitude: {
      type: Number,
      required: false
    },
    longitude: {
      type: Number,
      required: false
    }
  },
  computed: {
    arrowDirection() {
      return this.isActive ? 'arrowUp' : 'arrowDown'
    }
  },
  methods: {
    toggleActive() {
      return (this.isActive = !this.isActive)
    }
  }
}
</script>
