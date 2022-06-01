import axios from 'axios'
import store from '../store.js'

const wrap = url => `/api/${url}`
const appendAuth = config => {
  const token = store.getters.token
  if (token) {
    if (!config) config = { headers: {} }
    if (!config.headers) config.headers = {}
    config.headers.Authorization = `Bearer ${store.getters.token}`
  }
  return config
}

export default {
  get (url, success, fail = err => err.response.data.message, config) {
    axios.get(wrap(url), appendAuth(config))
      .then(success)
      .catch(fail)
  },
  post (url, body, success, fail = err => err.response.data.message, config) {
    axios.post(wrap(url), body, appendAuth(config))
      .then(success)
      .catch(fail)
  },
}
