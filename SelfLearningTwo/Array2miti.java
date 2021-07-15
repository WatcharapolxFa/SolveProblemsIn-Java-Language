public class Array2miti {
    public static void main(String[] args) {
        //2 MITI
        String[][] product = { { "ที่นอน", "หมอน", "ผ้าปู" }, { "แป้นพิมพ์", "คอมพิวเตอร์", "ที่วางมือ" },
                { "แว่นตา", "กล่อง", "ขวดน้ำสิงห์" } };

        System.out.println(product[1][2]);
        product[2][2] = "แผ่นรองเมาส์";
        System.out.println(product[2][2]);
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        for (int row = 0; row < product.length; row++) {
            for (int colum = 0; colum < product[row].length; colum++) {
                System.out.println("แถวที่ " + row + " คอลัมที่ " + colum + " เก็บค่า = " + product[row][colum]);

            }
        }
    }

}
