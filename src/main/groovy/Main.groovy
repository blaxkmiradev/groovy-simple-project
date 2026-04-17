class Main {

    static void main(String[] args) {
        println "Hello Groovy Project!"

        def name = "Mira"
        def age = 18

        println "Name: $name"
        println "Age: $age"

        def result = add(10, 20)
        println "10 + 20 = $result"

        listDemo()
    }

    static int add(int a, int b) {
        return a + b
    }

    static void listDemo() {
        def list = [1, 2, 3, 4, 5]

        println "List items:"
        list.each { item ->
            println "Item: $item"
        }
    }
}
