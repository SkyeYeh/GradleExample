/* closure.groovy */

/* def 是 Groovy 內的萬用型別，不管是物件還是原生變數甚至 void 都能用它代替 */
String message = "hello groovy closure"
def codeBlock1 = { println message }

/* 加上小括號就當成 method 般呼叫 */
codeBlock1()

/* 也能呼叫 Closure 物件的 call() 方法 */
codeBlock1.call()

class JavaHello {
    def sayHello() { println "Hello Java" }
}

class GroovyHello {
    def sayHello() { println "Hello Groovy" }
}

/* 在可見的 scope 內依然沒有 sayHello() 方法 */
def codeBlock2 = { sayHello() }

codeBlock2()
