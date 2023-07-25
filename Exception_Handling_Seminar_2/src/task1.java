public class task1 {
    /*
     * java.lang.Object
       |
    java.lang.Throwable
       /           \
  java.lang.Error   java.lang.Exception
                        /       |
                    Checked    Unchecked
                                |
                              Runtime
     */
    // Пример пользовательского класса ошибки, наследующегося от Error
public class MyCustomError extends Error {
    public MyCustomError() {
        super("This is a custom error message.");
    }
}
}
