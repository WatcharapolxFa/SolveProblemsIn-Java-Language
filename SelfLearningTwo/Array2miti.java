public class Array2miti {
    public static void main(String[] args) {
        String[][] product = { { "ที่นอน", "หมอน", "ผ้าปู" }, { "แป้นพิมพ์", "คอมพิวเตอร์", "ที่วางมือ" },
                { "แว่นตา", "กล่อง", "ขวดน้ำ" } };

        System.out.println(product[1][2]);
        product[2][2] = "แผ่นรองเมาส์";
        System.out.println(product[2][2]);
        System.out.println("-------------");

    }

}
