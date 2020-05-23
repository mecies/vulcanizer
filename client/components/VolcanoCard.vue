<template>
  <div class="flex rounded-lg py-4 px-6 shadow-lg ">
    <img class="w-5 h-5 my-auto" src="@/static/volcano.png" alt="volcano" />
    <div class="flex flex-col ml-6">
      <div>Name: {{ name }}</div>
      <div>Country: {{ country }}</div>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    country: {
      type: String,
      required: false, // todo true
      default: 'Countryless'
    },
    name: {
      type: String,
      required: false, // todo true
      default: 'Nameless'
    }
  }
}
</script>
