package com.muuv.publicsdk

import android.telephony.PhoneNumberUtils

object PublicSdkFacade {

    fun validatePhone(phone: String?): Boolean {
        if (phone == null) return false
        return (phone.matches(Regex("^[+]+[0-9]{10,14}")))
    }

    fun formatPhoneWithCountry(phone: String, countryISO: String): String? {
        return PhoneNumberUtils.formatNumber(phone, countryISO)
    }

    fun getMessage(phone: String, countryISO: String): String? {
        return "This is the PrivateSpikeSDK"
    }
}
