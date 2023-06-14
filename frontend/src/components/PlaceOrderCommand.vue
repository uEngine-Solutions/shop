<template>

    <v-card outlined>
        <v-card-title>
            PlaceOrder
        </v-card-title>

        <v-card-text>
            <String label="ProductName" v-model="value.productName" :editMode="editMode"/>
            <Number label="Quantity" v-model="value.quantity" :editMode="editMode"/>
            <String label="CustomerName" v-model="value.customerName" :editMode="editMode"/>
            <String label="Address" v-model="value.address" :editMode="editMode"/>
            <String label="Email" v-model="value.email" :editMode="editMode"/>
            <String label="Phone" v-model="value.phone" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="placeOrder"
            >
                PlaceOrder
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'PlaceOrderCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.productName = '';
            this.value.quantity = 0;
            this.value.customerName = '';
            this.value.address = '';
            this.value.email = '';
            this.value.phone = '';
        },
        watch: {
        },
        methods: {
            placeOrder() {
                this.$emit('placeOrder', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

