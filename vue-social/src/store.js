import { createStore } from 'vuex'
import apiRequest from './api/api-request'

const store = createStore({
  state(){
    return {
      user: null,
      token: null
    }
  },
  getters: {
    user: state => state.user,
    token: state => state.token
  },
  mutations: {
    setToken(state, token) {
      state.token = token
    },
    setUser(state, user) {
      state.user = user
    }
  },
  actions: {
    fetchUser(context) {
      apiRequest.get(`users`, res => {
        context.commit('setUser', res.data)
      })
    }
  }
})

export default store