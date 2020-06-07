import { SET_VOLCANOES } from '@/types/mutation-types.js'
// getters get x vulcanoes
export const state = () => ({
  volcanoes: ['loading']
})

export const getters = {
  getRandomTen: (state) => {
    const randomTen = []
    for (let i = 0; i < 11; i++) {
      randomTen.push(
        state.volcanoes[Math.floor(Math.random() * state.volcanoes.length)]
      )
    }
    return randomTen
  }
}

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
