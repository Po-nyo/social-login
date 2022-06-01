<template>
  <div class="sign-wrap">
    <p style="font-size: 30px; margin: 30px 0">로그인 하기</p>
    <form>
      <input id="username" v-model="username" class="form-control" type="text" placeholder="아이디">
      <input id="password" v-model="password" class="form-control" type="password" placeholder="비밀번호">
    </form>
    <button id="login-btn" @click="signIn" class="my-btn">로그인</button>
    <div class="oauth-btn-wrap">
      <button class="my-btn" @click="redirectToSocialLogin('google')"><img class="oauth-img float-start" src="/google.svg">구글 로그인하기</button>
      <button class="my-btn"><img class="oauth-img float-start" src="/facebook.svg">페이스북 로그인하기</button>
    </div>
    <div class="assistance">
      <button class="assistance-btn">회원가입</button>
      <button class="assistance-btn">비밀번호 찾기</button>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import { mapActions, mapMutations, mapGetters } from 'vuex'

const backend = 'http://localhost:1103'

export default {
  name: 'sign-in',
  created () {
    if (this.isAuthenticated) {
      this.$router.replace('/details')
    }
  },
  computed: {
    ...mapGetters(['token', 'user']),

    isAuthenticated() {
      return this.token != null
    }
  },
  data() {
    return {
      username: '',
      password: '',
    }
  },
  methods: {
     ...mapActions(['fetchUser']),
    ...mapMutations(['setToken', 'setUser']),
    signIn() {
      axios.post("/api/auth/sign-in",
      {
        'username': this.username,
        'password': this.password,
      }).then(res => {
        console.log(res.data)
        this.setUser(res.data)
      })
    },
    redirectToSocialLogin(socialType) {
      location.href = `${backend}/oauth2/authorization/${socialType}?redirect_uri=http://localhost:8080/oauth/redirect`
    }
  }
}
</script>

<style>
#username, #password {
  background: #EBECF0;
}
#username:focus, #password:focus {
  border-color: lightgray;
  background: #EBECF0;
  box-shadow: inset 5px 5px 5px #BABECC,
            inset -5px -5px 5px #ffffff;
}
.sign-wrap {
  margin: auto;
  width: 70%;
  height: 550px;
  min-height: 550px;
  max-width: 420px;
  border: 1px lightgray solid;
  padding: 15px 50px;
  border-radius: 30px;
  background: #EBECF0;
  box-shadow:  5px 5px 10px #BABECC,
             -2px -2px 10px #ffffff;
  text-align: center;
}
.form-control {
  border-radius: 10px;
  background: #EBECF0;
  box-shadow: inset 3px 3px 3px #BABECC,
            inset -3px -3px 3px #ffffff;
  height: 45px;
  line-height: 45px;
  margin-bottom: 13px;
  text-indent: 10px;
}
.oauth-btn-wrap {
  display: flex;
  width: 100%;
  margin-top: 30px;
  flex-direction: column;
}
.my-btn {
  width: 100%;
  background: transparent;
  border-radius: 10px;
  border-style: none;
  padding: 10px;
  margin: 10px 0px;
  background: #EBECF0;
  box-shadow: 6px 6px 10px #BABECC,
             -6px -6px 10px #fff;
  transition-duration: 0.3s;
}
.my-btn:hover {
  box-shadow: 2px 2px 5px #BABECC,
             -2px -2px 5px #fff;
}
.my-btn:active {
  box-shadow: inset 1px 1px 2px #BABECC,
              inset -1px -1px 2px #fff;
}
.oauth-img {
  width: 20px;
  height: 20px;
  filter: drop-shadow(3px 3px 3px #BABECC);
}
.assistance {
  margin-top: 40px;
  width: 100%;
  display: flex;
  justify-content: space-between;
}
.assistance-btn {
  color: grey;
  background: transparent;
  border-style: none;
}
</style>