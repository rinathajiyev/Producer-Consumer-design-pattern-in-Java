package threads;

public class MyConsumer implements Runnable{
    private String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            int lastIndex = Base.list.size() - 1;
            if (lastIndex > -1) {
                String result = Base.list.remove(lastIndex);
                System.out.println(name + " = " + result);
            }
        }
    }
}
