package o;

/* JADX INFO: renamed from: o.yqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57854yqK {
    public static int[] copydefault(char[] cArr, char[] cArr2, java.util.Set<java.lang.Character> set) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = i == cArr.length;
            boolean z2 = i2 == cArr2.length;
            if (z && z2) {
                break;
            }
            if (z) {
                copydefault(arrayList, cArr2.length - i2, 1);
                break;
            }
            if (z2) {
                copydefault(arrayList, cArr.length - i, 2);
                break;
            }
            boolean zContains = set.contains(java.lang.Character.valueOf(cArr[i]));
            boolean zContains2 = set.contains(java.lang.Character.valueOf(cArr2[i2]));
            if (zContains && zContains2) {
                int iKWHzl = KWHzl(cArr, i + 1, set);
                int iKWHzl2 = KWHzl(cArr2, i2 + 1, set);
                KWHzl(arrayList, cArr, cArr2, i, iKWHzl, i2, iKWHzl2);
                i = iKWHzl;
                i2 = iKWHzl2;
            } else {
                if (zContains) {
                    arrayList.add(1);
                } else if (zContains2) {
                    arrayList.add(2);
                    i++;
                } else {
                    arrayList.add(0);
                    i++;
                }
                i2++;
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = ((java.lang.Integer) arrayList.get(i3)).intValue();
        }
        return iArr;
    }

    public static int KWHzl(char[] cArr, int i, java.util.Set<java.lang.Character> set) {
        while (i < cArr.length) {
            if (!set.contains(java.lang.Character.valueOf(cArr[i]))) {
                return i;
            }
            i++;
        }
        return cArr.length;
    }

    public static void copydefault(java.util.List<java.lang.Integer> list, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            list.add(java.lang.Integer.valueOf(i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: java.util.List<java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public static void KWHzl(java.util.List<java.lang.Integer> list, char[] cArr, char[] cArr2, int i, int i2, int i3, int i4) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        int iMax = java.lang.Math.max(i5, i6);
        int i7 = 0;
        if (i5 == i6) {
            copydefault(list, iMax, 0);
            return;
        }
        int i8 = i5 + 1;
        int i9 = i6 + 1;
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i8, i9);
        for (int i10 = 0; i10 < i8; i10++) {
            iArr[i10][0] = i10;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            iArr[0][i11] = i11;
        }
        int i12 = 1;
        while (i12 < i8) {
            int i13 = 1;
            while (i13 < i9) {
                int i14 = i12 - 1;
                int i15 = i13 - 1;
                int i16 = cArr[i14 + i] == cArr2[i15 + i3] ? i7 : 1;
                int[] iArr2 = iArr[i12];
                int[] iArr3 = iArr[i14];
                iArr2[i13] = KWHzl(iArr3[i13] + 1, iArr2[i15] + 1, iArr3[i15] + i16);
                i13++;
                i7 = 0;
            }
            i12++;
            i7 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iMax * 2);
        while (true) {
            if (i5 <= 0 && i6 <= 0) {
                break;
            }
            if (i5 == 0) {
                arrayList.add(1);
            } else {
                if (i6 == 0) {
                    arrayList.add(2);
                } else {
                    int i17 = i6 - 1;
                    int i18 = iArr[i5][i17];
                    int[] iArr4 = iArr[i5 - 1];
                    int i19 = iArr4[i6];
                    int i20 = iArr4[i17];
                    if (i18 < i19 && i18 < i20) {
                        arrayList.add(1);
                    } else if (i19 < i20) {
                        arrayList.add(2);
                    } else {
                        arrayList.add(0);
                        i5--;
                    }
                }
                i5--;
            }
            i6--;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            list.add(arrayList.get(size));
        }
    }

    public static int KWHzl(int i, int i2, int i3) {
        return java.lang.Math.min(i, java.lang.Math.min(i2, i3));
    }
}
