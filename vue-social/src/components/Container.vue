<template>
  <div class="container">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'main-container',
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