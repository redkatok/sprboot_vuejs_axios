var app=new Vue({
    el:'#app',
    data:{
        customers:[]
    },
    mounted:
    function () {
        axios
            .get('http://localhost:8080/list')
            .then(response=>{
                this.customers=response.data}).catch(function (error) {
                    console.log(error)
        })
    }
})