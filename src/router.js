import { createWebHistory, createRouter } from "vue-router";

import Map from './components/Map/BoardPlan.vue';
import Login from './components/LoginModal.vue';
import CreatePlan from './components/Map/CreatePlan';

const routes = [
  {
    path: "/map",
    component: Map,

    
  }, {
    path: "/login",
    component : Login,
  }, {
    path: "/createPlan",
    component : CreatePlan,
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router; 