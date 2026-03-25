package o;

/* JADX INFO: renamed from: o.adG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7086adG {
    public static java.lang.String KWHzl(long j, TaskDescription taskDescription) {
        char c;
        char c2;
        char c3;
        long j2 = j;
        if (j2 < 0) {
            j2 = -j2;
        }
        if (j2 <= 10) {
            if (j2 == 2) {
                return java.lang.String.valueOf(taskDescription.AYXKKw);
            }
            return java.lang.String.valueOf(taskDescription.KWHzl[(int) j2]);
        }
        char[] cArr = new char[40];
        char[] charArray = java.lang.String.valueOf(j2).toCharArray();
        int length = charArray.length;
        int i = -1;
        int i2 = 40;
        int i3 = -1;
        int i4 = -1;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            length += i;
            if (length < 0) {
                break;
            }
            if (i3 == i) {
                if (i4 != i) {
                    i2--;
                    cArr[i2] = taskDescription.AhwBna[i4];
                    z = false;
                    z2 = true;
                }
                i3++;
            } else {
                i2--;
                int i5 = i3 + 1;
                cArr[i2] = taskDescription.gEmmrt[i3];
                if (i5 == 3) {
                    i4++;
                    i3 = -1;
                } else {
                    i3 = i5;
                }
            }
            int i6 = charArray[length] - '0';
            if (i6 == 0) {
                if (i2 < 39 && i3 != 0) {
                    cArr[i2] = '*';
                }
                if (z2 || z) {
                    i2--;
                    cArr[i2] = '*';
                } else {
                    i2--;
                    cArr[i2] = taskDescription.KWHzl[0];
                    z = i3 == 1;
                    z2 = true;
                }
            } else {
                i2--;
                cArr[i2] = taskDescription.KWHzl[i6];
                z2 = false;
            }
            i = -1;
        }
        if (j2 > 1000000) {
            int i7 = 37;
            boolean z3 = true;
            while (cArr[i7] != '0') {
                i7 -= 8;
                z3 = !z3;
                if (i7 <= i2) {
                    break;
                }
            }
            int i8 = 33;
            do {
                if (cArr[i8] == taskDescription.KWHzl[0] && !z3) {
                    cArr[i8] = '*';
                }
                i8 -= 8;
                z3 = !z3;
            } while (i8 > i2);
            if (j2 >= 100000000) {
                int i9 = 32;
                while (true) {
                    int i10 = i9 - 1;
                    int i11 = i9 - 8;
                    int iMax = java.lang.Math.max(i2 - 1, i11);
                    while (true) {
                        if (i10 > iMax) {
                            if (cArr[i10] != '*') {
                                break;
                            }
                            i10--;
                        } else {
                            char c4 = cArr[i9 + 1];
                            if (c4 != '*' && c4 != (c3 = taskDescription.KWHzl[0])) {
                                cArr[i9] = c3;
                            } else {
                                cArr[i9] = '*';
                            }
                        }
                    }
                    if (i11 <= i2) {
                        break;
                    }
                    i9 = i11;
                }
            }
        }
        for (int i12 = i2; i12 < 40; i12++) {
            char c5 = cArr[i12];
            char[] cArr2 = taskDescription.KWHzl;
            if (c5 == cArr2[2]) {
                if (i12 < 39) {
                    c = 0;
                    if (cArr[i12 + 1] == taskDescription.gEmmrt[0]) {
                    }
                } else {
                    c = 0;
                }
                if (i12 <= i2 || ((c2 = cArr[i12 - 1]) != taskDescription.gEmmrt[c] && c2 != cArr2[c] && c2 != '*')) {
                    cArr[i12] = taskDescription.AYXKKw;
                }
            }
        }
        if (cArr[i2] == taskDescription.KWHzl[1] && (taskDescription.djBIcL || cArr[i2 + 1] == taskDescription.gEmmrt[0])) {
            i2++;
        }
        int i13 = i2;
        int i14 = i13;
        while (i13 < 40) {
            char c6 = cArr[i13];
            if (c6 != '*') {
                cArr[i14] = c6;
                i14++;
            }
            i13++;
        }
        return new java.lang.String(cArr, i2, i14 - i2);
    }

    /* JADX INFO: renamed from: o.adG$TaskDescription */
    public static class TaskDescription {
        public final char AYXKKw;
        public final char[] AhwBna;
        public final char[] KWHzl;
        public final boolean djBIcL;
        public final char[] gEmmrt;
        public static final TaskDescription copydefault = new TaskDescription("0123456789s", "sbq", "WYZ", 'L', false);
        public static final TaskDescription OLrzqt = new TaskDescription("零一二三四五六七八九十", "十百千", "萬億兆", 20841, false);
        public static final TaskDescription AEQbTJ = new TaskDescription("零一二三四五六七八九十", "十百千", "万亿兆", 20004, false);
        public static final TaskDescription EZpvd = new TaskDescription("영일이삼사오육칠팔구십", "십백천", "만억?", 51060, true);

        public TaskDescription(java.lang.String str, java.lang.String str2, java.lang.String str3, char c, boolean z) {
            this.KWHzl = str.toCharArray();
            this.gEmmrt = str2.toCharArray();
            this.AhwBna = str3.toCharArray();
            this.AYXKKw = c;
            this.djBIcL = z;
        }
    }
}
