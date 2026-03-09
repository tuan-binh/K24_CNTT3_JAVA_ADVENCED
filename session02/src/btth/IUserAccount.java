package btth;

public interface IUserAccount {

    String getRole();

    default boolean checkAccess() {
        // nó phải gì
        return getRole().equals("ADMIN");
    }

    static boolean isStandardLength(String username) {
        return username.length() > 5;
    }

}
