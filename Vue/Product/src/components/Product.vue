<template>
  <div class="container">
    <div class="holder">
      <form @submit.prevent="addProduct">
        <input type="text" placeholder="Enter a product here" v-model="product" v-validate="'min:3'" name="product">
        <transition name="alert-in" enter-active-class="animated flipInX" leave-active-class="animated flipOutX">
          <p class="alert" v-if="errors.has('product')">
            {{errors.first('product')}}
          </p>
        </transition>
      </form>
      <ul>
        <transition-group name="productList" enter-active-class="animated bounceInUp" leave-active-class="animated bounceOutDown">
          <li v-for="(item,index) in products" :key="index">
            {{item.product}}
            <i class="fa fa-minus-circle" @click="removeProduct(index)"></i>
          </li>
        </transition-group>
      </ul>
      <p v-if="products.length >= 1">These are the products that you added.</p>
      <p v-else>They dont have any product</p>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Product',
  data () {
    return {
      msg: 'Welcome to Your Product App',
      product: [],
      products : [
        {"product" : "CPU"},
        {"product" : "Monitor"}
      ]
    }
  },
  methods: {
    addProduct(){
      this.$validator.validateAll().then((result) => {
        if(result){
          this.products.push({product: this.product});
          this.product = '';
        }
      })
    },
    removeProduct(id){
      this.products.splice(id,1);
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

  @import 'https://cdn.jsdelivr.net/npm/animate.css@3.5.1';
  @import 'https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css';

  .holder {
    background: #fff;
  }

  ul {
    margin: 0;
    padding: 0;
    list-style-type: none;
  }
  
  ul li {
    padding: 20px;
    font-size: 1.3em;
    background-color: #E0EDF4;
    border-left: 5px solid #3EB3F6;
    margin-bottom: 2px;
    color: #3E5252;
  }
  ul li i{ 
    float: right;
  }
  p {
    text-align:center;
    padding: 30px 0;
    color: gray;
  }

  .container {
    box-shadow: 0px 0px 40px lightgray;
  }
  input{
    width: calc(100% - 40px);
    border: 0;
    padding: 20px;
    font-size: 1.3rem;
    background-color: #323333;
    color: #687f7f;
  }
  p.alert {
    position: absolute;
    top: -25px;
    padding: 0px;
    margin: 0px;
    color: red;
  }
  form{
    position: relative;
  }

</style>
