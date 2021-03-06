// 050 가비지 컬렉션(Garbage Collection)

fun main(args: Array<String>)
{
    var result = ""
    var i = 1

    while (i <= 100)
    {
        result += "$i" // 반복문을 이용하여 100번의 문자열 덧셈을 하고 있다.
        i += 1 // 반복문 종료 후에 힙에는 수백 개의 미아 객체가 생겨나게 된다.
    }

    // 언제 실행될 지 확신할 수는 없지만 많은 미아 객체가 힙에 쌓이면 적당한 시점에 시스템이 자동으로 가비지 컬렉션을 수행하여 쓰레기 객체를 수거해 간다.
    // 가비지 컬렉션이 일어날 때는 삭제할 미아 객체를 탐색하기 때문에 순간적으로 프로그램이 멈추는 프리징 현상이 일어날 수 있다.
    
    println(result)
}