public class Client {
    public static void main(String[] args) {

        CustomStack<Integer> customStack = new CustomStack<>();

        customStack.init();

        customStack.push(1);
        customStack.push(12);
        customStack.push(13);
        customStack.push(14);
        customStack.push(99);


        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());


        customStack.push(778);

        System.out.println(customStack.pop());

    }
}