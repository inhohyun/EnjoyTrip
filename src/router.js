import { createWebHistory, createRouter } from "vue-router";

import Map from './components/Map.vue';
import Login from './components/LoginModal.vue'

const routes = [
  {
    path: "/map",
    component: Map,

    
  }, {
    path: "/login",
    component : Login,
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router; 