public int isDual(int[] a) {
    int rtnval = 1;

    if (a.Length > 0) {

        //should be even
        if (a.Length % 2 == 0) {
            for (int i = 2; i < a.Length; i = i + 2) {
                if (a[0] + a[1] != a[i] + a[i + 1]) {
                    rtnval = 0;
                    break;
                }
            }
        }
        else {
            rtnval = 0;
        }
    }

    return rtnval;
}