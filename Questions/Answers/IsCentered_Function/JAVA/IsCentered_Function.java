public int isCentered(int[] a) {
    //array should contains odd numbers of elements.
    if(a.Length % 2 != 0) {
        for (int i = 0; i < a.Length; i++){
            //only one element is centred itself.
            if (a.Length == 1)
                break;

            //finding the value of central element
            centerVal = a[a.Length / 2];

            if(centerVal >= a[i])
            {
                sum = 0;
                break;
            }
        }
    }
    else {
        sum = 0;
    }

    return rtnval;
}