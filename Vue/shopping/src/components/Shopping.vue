<template>
  <div class="shopping mt-5">
   <div class="row">
      <div class="col-sm-9">
        <div class="row">
          <div class="col-sm-4" v-for="(service,index) in services" :key="index" @click="toggleActive(service)" :class="{ 'active': service.active}">
              <div class="card">
                <img :src="service.src">
                <div class="card-body">
                  <h5 class="card-title"> {{service.name}}</h5>
                  <p class="card-text">
                    <span class="text-right h6">{{service.price | dollarFormat}}</span>
                    Some quick example text to build on the card title and make up the bulk of the card's content.
                  </p>
                  <a href="#" class="btn btn-primary float-right">
                    {{service.active ? 'remove':'add'}}
                  </a>
                </div>
              </div>
          </div>
        </div>
      </div>
      <div class="col-sm-3">
        <div class="card-summary">
          <p class="headerText">Summary<i class="fa fa-shopping-cart"></i></p> 
          <hr>
          <ul>
            <li v-for="(service,index) in services" :key="index">
              <p v-show="service.active">
                {{service.name}}
                <span>{{service.price | dollarFormat}}</span>
              </p>
              
            </li>
          </ul>
          <hr>
          <p>
            Total:
            <span>{{total() | dollarFormat}}</span>
          </p>
        </div> 
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Shopping',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      services: [
          {
              name: 'CPU',
              price: 300,
              src:'https://images-na.ssl-images-amazon.com/images/I/41WifNcv-iL._SX466_.jpg',
              active:true
          },{
              name: 'Keyboard',
              price: 400,
              src:'https://3.imimg.com/data3/CT/HG/MY-9314814/computer-keyboard-500x500.jpg',
              active:false
          },{
              name: 'Monitor',
              price: 250,
              src:'https://image.shutterstock.com/image-photo/monitor-personal-computer-desktop-pc-260nw-1580807017.jpg',
              active:false
          },{
              name: 'Processor',
              src:'https://www.pcgamesn.com/wp-content/uploads/2019/01/Intel-i7-9700K-CPU.jpg',
              price: 220,
              active:false
          },{
              name: 'Ram',
              price: 220,
              src:'https://vsphere-land.com/wp-content/uploads/cpumemory.jpg',
              active:false
          }
      ],
      summary:[]
    }
  },
  methods: {
    toggleActive: function(s){
        s.active = !s.active;
    },
    total: function(){

        var total = 0;
        console.log( this.summary);
        this.services.forEach(function(s){
            
            if (s.active){
              
                total+= s.price;
            }
        });

        return total;
    }
  }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style >
@import url(https://fonts.googleapis.com/css?family=Cookie);
@import 'https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css';

/* Hide un-compiled mustache bindings
until the Vue instance is ready */

[v-cloak] {
  display: none;
}
.card {
  margin: 15px 0;
}
.card img {
    height: 150px;
}
.card-summary{
      margin-top: 15px;
    -webkit-box-shadow: 0px 0px 40px lightgrey;
    box-shadow: 0px 0px 10px lightgrey;
    padding: 10px;
}
a.btn-primary{
  color: #fff !important;
}
.card-summary .headerText{
  font-size: 18px;
}
.card-summary .headerText i{
    float: right;
}
.card-summary ul{
  padding: 0;
    margin: 0;
}
.card-summary ul li{
  display: block;
}
.card-summary  p span{
  float: right;
}
*{
    margin:0;
    padding:0;
}

body{
    font:15px/1.3 'Open Sans', sans-serif;
    color: #5e5b64;
}

a, a:visited {
    outline:none;
    color:#389dc1;
}

a:hover{
    text-decoration:none;
}

section, footer, header, aside, nav{
    display: block;
}

/*-------------------------
    The order form
--------------------------*/



.shopping h1{
    color:#fff;
    font-size:64px;
    font-family:'Cookie', cursive;
    font-weight: normal;
    line-height:1;
    text-shadow:0 3px 0 rgba(0,0,0,0.1);
}

</style>
