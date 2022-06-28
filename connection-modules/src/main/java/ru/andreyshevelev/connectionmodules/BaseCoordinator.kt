package ru.andreyshevelev.connectionmodules

abstract class BaseCoordinator<T: BaseEvent>{

    lateinit var mediator: BaseMediator

    abstract fun handleEvent(e: Any)

    abstract fun getEventInstance(): Class<T>
}