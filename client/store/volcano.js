import { SET_VOLCANOES } from '@/types/mutation-types.js'
// getters get x vulcanoes
export const state = () => ({
  volcanoes: []
})

export const mutations = {
  [SET_VOLCANOES](state, volcanoes) {
    state.volcanoes = volcanoes
  }
}

export const actions = {
  async fetchVolcanoes({ commit }) {
    const volcanoes = await this.$axios.$get('/volcanoes')
    commit(SET_VOLCANOES, volcanoes.flat())
  }
}
