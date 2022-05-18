import { createApp } from 'vue'
import App from './App.vue'
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import axios from 'axios'
import store from './store.js'
import router from './router.js'

const BACKEND_URL = 'http://localhost:1103'
axios.defaults.baseURL = BACKEND_URL

createApp(App).use(router).use(store).mount('#app')
