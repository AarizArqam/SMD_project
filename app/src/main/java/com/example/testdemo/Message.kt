package com.example.testdemo

class Message {
    var message: String? = null
    var senderId: String? = null
    //var recieverId: String? =null

    constructor(){}

    constructor(message: String?,reciever:String?){
        this.message = message
        this.senderId = senderId
        //this.recieverId= recieverId
    }
}