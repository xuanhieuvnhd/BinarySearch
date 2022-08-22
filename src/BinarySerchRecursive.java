public class BinarySerchRecursive {
    //Trả về giá trị của x nếu nó có trong mảng arr cho trc
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            //Nếu giá trị cần tìm bằng mid thì trả về chính nó
            if (arr[mid] == x)
                return mid;
            //Nếu giá trị cần tìm nhỏ hơn mid thì nó nằm ở mảng bên trái
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
                //Còn lại nó sẽ làm ở mảng bên phải
            else return binarySearch(arr, mid + 1, r, x);
        }
        //trường hợp giá trị cần tìm không thuộc mảng cho trc
        return -1;
    }

    public static void main(String args[]) {
        BinarySerchRecursive ob = new BinarySerchRecursive();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 4;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Phan tu khong ton tai trong mang");
        else
            System.out.println("Phan tu duoc tim thay tai vi tri "
                    + result);
    }
}
