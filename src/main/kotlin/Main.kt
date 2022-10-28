import io.reactivex.rxjava3.core.Observable

fun main(args: Array<String>) {
    println("Hello World!")
}

private fun getSelectableThings(): Observable<String> {
    return Observable.just("Hello", "World")
}