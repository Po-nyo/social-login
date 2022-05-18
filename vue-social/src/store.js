import axios from 'axios'
import { createStore } from 'vuex'

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
      axios.get(`/auth/sign-in`)
      .then(res => {
        context.commit('setUser', res.data)
      })
    }
  }
})

export default store