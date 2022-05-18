import { createWebHistory, createRouter } from "vue-router";
import SignIn from './components/Sign-in.vue'

const routes = [
  {
    path: "/",
    component: SignIn, 
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
