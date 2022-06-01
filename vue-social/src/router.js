import { createWebHistory, createRouter } from "vue-router";
import Container from './components/Container.vue'
import SignIn from './components/Sign-in.vue'
import Redirect from './components/Oauth-redirect.vue'
import UserDetails from './components/User-Details.vue'

const routes = [
  {
    path: "/",
    component: Container,
    children: [
      {
        path: '/',
        name: 'main',
        component: SignIn
      },
      {
        path: '/details',
        name: 'user-details',
        component: UserDetails
      },
      {
        path: '/oauth/redirect',
        name: 'OauthRedirect',
        component: Redirect
      }
    ]
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
