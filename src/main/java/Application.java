import com.dm.proxy.TransactionalServiceProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Object transactionalServiceProxy = TransactionalServiceProxy.class.newInstance();

        Method processMethod = TransactionalServiceProxy.class.getMethod("process");

        processMethod.invoke(transactionalServiceProxy);
    }
}
