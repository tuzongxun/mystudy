<template>
  <div id="app">
    <!-- <div id="nav"> -->
      <!-- <el-button type="success">成功按钮</el-button> -->
      <!-- <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link> -->
    <!-- </div> -->
    <router-view/>
  </div>
</template>

<style>
*{
  margin: 0px;
  padding: 0px;
  /* background-color: rgb(241, 238, 238); */
}
#app {
  height:100%;
}

/* #nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
} */
</style>
