package com.example.qrapp.util

import java.net.URL

object ApiUtil {
    private const val baseUrl = "https://gokei.jp/qr/"

    enum class ApiName(var url:URL){
        PostMasterInfo(URL("$baseUrl/postMasterInfo.php")),
        GetMasterInfo(URL("$baseUrl/getMasterInfo.php"))
    }
}