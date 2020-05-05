import { SET_VOLCANOES } from '@/store/mutation-types.js'

export const state = () => ({
  volcanoes: ['vesuvio', 'etna']
})

export const mutations = {
  [SET_VOLCANOES](state, volcanoes) {
    state.volcanoes = volcanoes
  }
}

export const actions = {
  setVolcanoes({ commit }, volcanoes) {
    commit(SET_VOLCANOES, volcanoes)
  }
}
