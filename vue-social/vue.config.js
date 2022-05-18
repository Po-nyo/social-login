module.exports = {
  devServer: {
    proxy: {
      '/auth': {
        target: 'http://localhost:1103',
        changeOrigin: true,
      }
    }
  }
}
