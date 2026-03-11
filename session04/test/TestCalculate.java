import org.junit.jupiter.api.*;

public class TestCalculate {

    @BeforeAll
    public static void initData() {
        System.out.println("--------------------------");
        System.out.println("        Mina san          ");
        System.out.println("--------------------------");
    }

    @BeforeEach
    public void moicanhaoncam() {
        System.out.println("Dooki Dooki");
    }

    @AfterEach
    public void raubat(){
        System.out.println("Fuwwa Fuwwa");
    }

    @Test
    @DisplayName("kiểm thử phép cộng")
    public void testFeatureAdd(){
        // assertEqual
        int result = Calculate570.plus(10,5);
        Assertions.assertEquals(15,result);
        // true - kiểm thử về điều kiện phải trả về true
        // false - kiểm thử về điều kiện phải trả về false
        // null -- kiểm thử đối tượng
        // notnull -- kiểm thử đối tượng
        // throws
        // array equal
    }

    @Test
    @DisplayName("Kiểm thử về array equals")
    public void testArray() {
        Integer[] arr1 = {1,2,3};
        Integer[] arr2 = {1,2,3};
        Assertions.assertArrayEquals(arr1,arr2);
    }

    @Test
    @DisplayName("Kiểm thử ngoại lệ")
    public void testFeatureThrows() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            Calculate570.devide(5,0);
        });
    }

    @AfterAll
    public static void destroyData() {
        System.out.println("-------------------------");
        System.out.println("       Sai o na ra       ");
        System.out.println("-------------------------");
    }





}
