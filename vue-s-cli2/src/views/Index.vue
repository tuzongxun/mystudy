<template>
    <div id="index">
        <tzx-header></tzx-header>
        <tzx-left></tzx-left>
        <tzx-main></tzx-main>
    </div>
</template>
<script>
import TzxLeft from '../components/TzxLeft.vue';
import TzxMain from '../components/TzxMain.vue';
import TzxHeader from '../components/TzxHeader.vue';

export default {
    name: 'Index',
    components:{
        TzxLeft,
        TzxMain,
        TzxHeader
    }
}
</script>
<style>
  #index{
      position: relative;
      left: 0px;
      top: 0px;
      width: 100%;
      height: 500px;
  }
  
</style>