package com.e.loginmvvmapiretrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserRequest {

    @SerializedName("account")
    @Expose
    var account: String? = null

    @SerializedName("password")
    @Expose
    var password: String? = null
}