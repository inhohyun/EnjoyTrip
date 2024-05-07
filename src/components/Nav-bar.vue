<template>
<nav id="navbar-example2" class="navbar bg-body-tertiary px-3 mb-3">
  
  <router-link to="/" class="navbar-brand">EnjoyTrip</router-link>
  <ul class="nav nav-pills">
    <li class="nav-item">
      <router-link  to="/map" class="nav-link">여행지 계획</router-link>
    </li>
    <li class="nav-item">
      <router-link  to="/" class="nav-link">공지사항</router-link>
    </li>
    <li class="nav-item">
      <router-link  to="/" class="nav-link">여행 게시판</router-link>
    </li>
    <li class="nav-item">
      <router-link  to="/login" class="nav-link">로그인</router-link>
    </li>
    <li class="nav-item">
      <router-link  to="/" class="nav-link">회원가입</router-link>
    </li>
  
  </ul>
</nav>
</template>

<script>
export default {

}

</script>


<style>

</style>