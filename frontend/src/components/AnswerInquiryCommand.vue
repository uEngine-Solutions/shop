<template>

    <v-card outlined>
        <v-card-title>
            AnswerInquiry
        </v-card-title>

        <v-card-text>
            <String label="CustomerName" v-model="value.customerName" :editMode="editMode"/>
            <String label="Inquiry" v-model="value.inquiry" :editMode="editMode"/>
            <String label="Answer" v-model="value.answer" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="answerInquiry"
            >
                AnswerInquiry
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
        name: 'AnswerInquiryCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.customerName = '';
            this.value.inquiry = '';
            this.value.answer = '';
        },
        watch: {
        },
        methods: {
            answerInquiry() {
                this.$emit('answerInquiry', this.value);
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

