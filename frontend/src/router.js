
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ProductManager from "./components/listers/ProductCards"
import ProductDetail from "./components/listers/ProductDetail"

import SaleManager from "./components/listers/SaleCards"
import SaleDetail from "./components/listers/SaleDetail"

import ExpertManager from "./components/listers/ExpertCards"
import ExpertDetail from "./components/listers/ExpertDetail"

import CustomerServiceManager from "./components/listers/CustomerServiceCards"
import CustomerServiceDetail from "./components/listers/CustomerServiceDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/products',
                name: 'ProductManager',
                component: ProductManager
            },
            {
                path: '/products/:id',
                name: 'ProductDetail',
                component: ProductDetail
            },

            {
                path: '/sales',
                name: 'SaleManager',
                component: SaleManager
            },
            {
                path: '/sales/:id',
                name: 'SaleDetail',
                component: SaleDetail
            },

            {
                path: '/experts',
                name: 'ExpertManager',
                component: ExpertManager
            },
            {
                path: '/experts/:id',
                name: 'ExpertDetail',
                component: ExpertDetail
            },

            {
                path: '/customerServices',
                name: 'CustomerServiceManager',
                component: CustomerServiceManager
            },
            {
                path: '/customerServices/:id',
                name: 'CustomerServiceDetail',
                component: CustomerServiceDetail
            },



    ]
})
