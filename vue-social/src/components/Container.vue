<template>
  <div class="container">
    <SignIn/>
  </div>
</template>

<script>
import SignIn from "./Sign-in.vue"

export default {
  name: 'main-container',
  components: {
    SignIn
  }
}
</script>

<style>
.container {
  width: 100vh;
  height: 100vh;
  min-width: 500px;
  display: flex;
  justify-content: center;
}
</style>