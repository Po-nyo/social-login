<template>
  <!-- 상단 -->
  <nav class="my-navbar navbar navbar-expand-sm navbar-light px-3">
    <div class="container-fluid">
      <a class="navbar-brand" href="#"><i style="color: dimgray; font-size: 30px;" class="fa-solid fa-house"></i></a>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarNav"
        aria-controls="navbarNav"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
      <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item my-nav-item">
            <a class="nav-link" aria-current="page" href="#"><i class="fa-solid fa-right-to-bracket"></i></a>
          </li>
          <li class="nav-item my-nav-item">
            <a class="nav-link" href="#"><i class="fa-solid fa-user-group"></i></a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
  <!-- 컨텐츠 -->
  <router-view/>

  <!-- 하단 -->
  <footer class="my-footer footer mt-auto py-3">
    <span class="text-muted">vue-social-login</span>
  </footer>
</template>

<script>

export default {
  name: "App",
};
</script>

<style>
html, body {
  height: 100vh;
}
button, p, h3, input, text, a {
  letter-spacing: -0.2px;
  text-shadow: 1px 1px 1px #fff;
  font-family: 'Roboto', sans-serif;
  color: dimgray;
  font-weight: 550;
  text-shadow: 1px 1px 4px rgba(0,0,0,.3), -2px -2px 4px rgba(255,255,255,1);
}
.my-footer {
  background: #EBECF0;
  box-shadow: 7px 7px 7px 7px rgba(0,0,0,.07);
  border-radius: 10px 10px 0 0;
  width: 90%;
  margin: 0 5%;
  text-align: center;
  bottom: 0;
}
.my-nav-item {
  font-size: 20px;
  margin: 0 1rem;
  padding: 0.3rem 1.3rem;
  border: 2px solid rgba(255,255,255,.3);
  box-shadow: 4px 4px 6px 0 rgba(0,0,0,.1), -4px -4px 6px rgba(255,255,255,1);
  border-radius: 10px;
  cursor: pointer;
  transition: color 0.2s ease-out, transform 0.2s ease-out;
  color: dimgray;
}
.my-nav-item:hover {
  transform: scale(0.95);
  box-shadow: 4px 4px 10px 0 rgba(0,0,0,.1),
  -4px -4px 10px rgba(255,255,255,1);
}
.my-nav-item:active {
  outline: none;
  transform: scale(0.95);
  box-shadow: 4px 4px 10px 0 rgba(0,0,0,.1),
  -4px -4px 10px rgba(255,255,255,1),
  4px 4px 10px 0 rgba(0,0,0,.1) inset,
  -4px -4px 10px rgba(255,255,255,1) inset;
}
#app {
  /* text-align: center; */
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 100%;
  height: 100%;
  background-color: #EBECF0;
  font-weight: bold;
  min-width: 500px;
  min-height: 700px;
}
.my-navbar {
  background-color: #EBECF0;
  color: dimgray;
  box-shadow: 7px 7px 12px 0 rgba(0,0,0,.07);
  border-radius: 0 0 10px 10px;
  width: 90%;
  margin: 0 5%;
}
</style>
