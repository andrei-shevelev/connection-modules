package ru.andreyshevelev.connectionmodules

class BaseMediator {

    private var coordinators: MutableList<BaseCoordinator<out BaseEvent>> = mutableListOf()

    fun addAll(coordinators: List<BaseCoordinator<out BaseEvent>>) {
        this.coordinators.addAll(coordinators)
    }

    fun sendEvent(event: BaseEvent) {
        coordinators.filter { it.getEventInstance().isInstance(event) }
            .map { it.handleEvent(event) }
    }

    fun init() {}
}