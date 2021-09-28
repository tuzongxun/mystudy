<template>
    <div class="son">
        <p>儿子组件，我的钱：{{mon}}
        </p>
        <p>儿子组件,{{car}}</p>
        <button @click="sendCar">给父组件</button>
    </div>
</template>
<script>
export default {
    data(){
        return{
            car:"奔驰"
        }
    },
    methods:{
        sendCar(){
            this.$emit("gift",this.car);
        }
    },
    props:["mon"]
}
</script>
<style scoped>
.son{
    width:200px;
    height: 200px;
    background-color: yellow;
}
</style>