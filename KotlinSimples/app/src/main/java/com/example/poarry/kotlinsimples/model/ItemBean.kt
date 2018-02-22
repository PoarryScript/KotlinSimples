package com.example.poarry.kotlinsimples.model

/**
 * Created by j-yangbo on 2017/6/26.
 */
data class ItemBean(val name: String, val id: Int) {
    init {

    }

    open class BaseClass(name: String) {
        open fun featureOne() {

        }

        open fun v() {

        }

    }

    class ChildrenClass(userId: Int, userName: String) : BaseClass(userName)

}