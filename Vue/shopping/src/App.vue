<template>
  <div id="app" v-cloak>
    <header class="d-flex align-items-center px-5">
      <div class="title-part">
        <img src="./assets/logo.png">
        <span class="pl-3">{{title}}</span>
      </div>
    </header>
    <div class="main-body mt-4">
      <div class="container">
        <Shopping/>
      </div>
    </div>
  </div>
</template>

<script>
import Shopping from './components/Shopping'

export default {
  name: 'App',
  components: {
    Shopping
  },
  data(){
    return{
      title:'Shopping Cart'
    }
  }
}
</script>

<style>
@import 'https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css';

header{
  background-color: #fff;
  height: 80px;
  border-bottom: 2px solid #ddd;
}
header img{
  height: 70px;
}
header span{
  font-weight: 600;
  font-size: 40px;
}
</style>
