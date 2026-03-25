package o;

/* JADX INFO: loaded from: classes3.dex */
public class Zm {
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;

    public static void EZpvd(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int AEQbTJ(int i) {
        YX yx = YX.KWHzl;
        return ((yx.OLrzqt[0][(i >>> 24) & 255] + yx.OLrzqt[1][(i >>> 16) & 255]) ^ yx.OLrzqt[2][(i >>> 8) & 255]) + yx.OLrzqt[3][i & 255];
    }
}
