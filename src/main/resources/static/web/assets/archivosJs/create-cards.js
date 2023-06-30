let { createApp } = Vue

createApp({
    data() {
        return {
            cardType:"",
            cardColor:"",

            
        }
    },

    created() {

        console.log(this.cardType,this.cardColor+"hola")

    },


    methods: {
        
        createCards() {
            console.log(this.cardType,this.cardColor)
                axios.post("/api/clients/current/cards", `cardColor=${this.cardColor}&cardType=${this.cardType}`,
                    )
                    .then((res) => {
                        window.location.href = "/web/pages/cards.html"
                        

                    })
                    .catch(err => console.log(err))

            
                /*Swal.fire({
                    position: 'top-center',
                    icon: 'error',
                    title: 'already have a card of that type and color',
                    showConfirmButton: false,
                    timer: 2000,
                    customClass:{
                        popup: `alertCss`
                    }
                  })*/
                
            }

        },


    

}).mount("#app")