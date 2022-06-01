<template>
  <div class="details" v-if="user">
    <div class="profile" :style="{backgroundImage: `url(${user.profileImageUrl})`}"></div>
    <table>
      <tr>
        <td>id</td>
        <td>{{ user.username }}</td>
      </tr>
      <tr>
        <td>email</td>
        <td>{{ user.email }}</td>
      </tr>
      <tr>
        <td>name</td>
        <td>{{ user.name }}</td>
      </tr>
      <tr>
        <td>providerType</td>
        <td>{{ user.providerType }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'
export default {
  name: 'user-details',
  created() {
    if (!this.isAuthenticated) {
      this.$router.replace('/')
    }
  },
  computed: {
    ...mapGetters(['token', 'user']),
    isAuthenticated() {
      return this.token != null
    }
  }
}
</script>

<style>
.profile {
  width: 50px;
  height: 50px;
  background-size: 100%;
  border-radius: 50%;
  margin: 30px auto;
}
.details {
  margin-top: 30px;
}
table, th, td {
  padding: 5px 15px;
  text-align: center;
}
</style>