enum Days{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
class Enum {
    public static void main(String[] args) {
        for (Days alldays : Days.values())
        System.out.println(alldays);
    }
}
