package uts.hanif.mobile.activity.register.presenter

interface RegisterView {
    fun onSuccessRegister()
    fun onErrorRegister(msg: String?)
}