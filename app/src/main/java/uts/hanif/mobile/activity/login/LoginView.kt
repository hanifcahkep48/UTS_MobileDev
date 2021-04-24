package uts.hanif.mobile.activity.login

import uts.hanif.mobile.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}