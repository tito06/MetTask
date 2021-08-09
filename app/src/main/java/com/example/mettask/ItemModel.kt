package com.example.mettask

class ItemModel(title:String, category:String, price:String, photo:Int) {

    private var title:String
    private var category:String
    private var price:String
    var photo:Int

    init {
        this.title = title
        this.category = category
        this.price = price
        this.photo = photo
    }

    fun getTitle():String?{
        return title
    }

    fun setTitle(name:String?){
        title = name!!
    }

    fun getCategory():String?{
        return category
    }

    fun setCategory(type:String?){
        category = type!!
    }

    fun getPrice():String?{
        return price
    }

    fun setPrice(amount:String?){
        price = amount!!
    }

 /*   fun getPhoto():String?{
        return photo
    }

    fun setPhoto(picture:String?){
        photo=picture!!
    }*/

}