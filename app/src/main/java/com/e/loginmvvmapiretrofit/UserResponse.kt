package com.e.loginmvvmapiretrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserResponse {

    @SerializedName("data")
    @Expose
    var data: Userr? = null

    class Userr {
        @SerializedName("account")
        @Expose
        var account: String? = null

        @SerializedName("name")
        @Expose
        var name: String? = null

        @SerializedName("fcm_token")
        @Expose
        var fcm_token: String? = null
    }
}