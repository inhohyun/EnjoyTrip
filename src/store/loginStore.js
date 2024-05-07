import { createStore } from 'vuex'

const store = createStore({

  state() {
    return {
      isLoggedIn: false,
    }
  },
  mutations: {
    setLoginState(state, status) {
      state.isLoggedIn = status;
    }
  }
})

export default store;