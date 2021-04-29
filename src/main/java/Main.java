import org.dom4j.DocumentException;

public class Main {
    public static void main(String[] args) throws DocumentException {

        //系统类加载器
        ClassLoader classLoader = Main.class.getClassLoader();
        System.out.println(classLoader);
        //拓展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        //获取不到引导类加载器（加载核心类库，无法获取）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

    }

}
