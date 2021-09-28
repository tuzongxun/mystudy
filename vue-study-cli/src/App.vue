<template>
  <div id="app">
    <!-- <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/> -->
    <p>{{num}}</p>
    <button @click="add">加一</button>
    <hr/>
    <p>父组件，我的钱：{{money}}</p>
    <p>父组件，我的车：{{car}}</p>
    <hr/>
    <son :mon="money" @gift="show($event)"></son>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue';
import son from './components/Son';
import Son from './components/Son.vue';

export default {
  name: 'App',
  // components: {
  //   HelloWorld
  // }
  data(){
    return{
      num:0,
      car: "",
      money:"我有一个亿"
    };
  },
  methods:{
    add(){
      this.num++;
    },
    show($event){
      this.car=$event;
    }
  },
  components:{
    son
  }

}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
