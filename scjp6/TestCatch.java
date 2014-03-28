import java.io.IOException;
class TestCatch {
    void f() {
        throw new RuntimeException();
    }

    public static void main(String[] args) throws Exception {
        TestCatch t = new TestCatch();
        try {
           t.f();
        } catch (Throwable e) {
            try {
                throw new IOException();
            } catch (Exception ex) {
                System.out.print("catch1 ");
                throw new Exception();
            } catch (IOException ioEx) {
                System.out.print("io ");
                throw new IOException();
            } finally {
                 System.out.print("finally1 ");
            }
        } finally {
            System.out.print("finally2 ");
        }
    }
}