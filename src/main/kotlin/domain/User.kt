package domain

open class User {
    var email: String? = null
        protected set
    var age: Int? = null
        protected set
    var mainAddress: String? = null
        protected set
    var subAddress: String? = null
        protected set
    var mobilePhone: String? = null
        protected set

    fun changeAddress(mainAddress: String, subAddress: String) {
        this.mainAddress = mainAddress
        this.subAddress = subAddress
    }
}
