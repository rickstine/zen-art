class Parent {
    public Parent() {
        System.out.println("1. Parent constructor runs first ");
    }
}

class Child extends Parent {
    public Child() {
        // Java automatically adds super() here
        System.out.println("2. Child constructor runs second");
    }
}

Child obj = new Child();

void main() {
}

// Output:
// 1. Parent constructor runs first
// 2. Child constructor runs second