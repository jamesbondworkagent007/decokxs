package o;

import com.ibm.icu.util.UResourceBundle;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.agT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7258agT implements java.lang.Comparable<C7258agT> {
    public static volatile java.lang.String AEQbTJ;

    @java.lang.Deprecated
    public static final C7258agT AYXKKw;
    public static final C7258agT AkhnZx;
    public static final C7258agT EZpvd;

    @java.lang.Deprecated
    public static final C7258agT KWHzl;
    public static final C7258agT OLrzqt;
    public static final C7258agT OcIXYQ;
    public static final C7258agT valueOf;
    public int QVAiDq;
    public static final ConcurrentHashMap<java.lang.Integer, C7258agT> copydefault = new ConcurrentHashMap<>();
    public static final C7258agT isConnected = AEQbTJ(1, 0, 0, 0);
    public static final C7258agT values = AEQbTJ(1, 0, 1, 0);
    public static final C7258agT fetchVPNInfo = AEQbTJ(1, 1, 0, 0);
    public static final C7258agT ejfBZ = AEQbTJ(1, 1, 5, 0);
    public static final C7258agT fIwbmz = AEQbTJ(2, 0, 0, 0);
    public static final C7258agT AuCTel = AEQbTJ(2, 1, 2, 0);
    public static final C7258agT fARcdN = AEQbTJ(2, 1, 5, 0);
    public static final C7258agT fJNWhG = AEQbTJ(2, 1, 8, 0);
    public static final C7258agT getNewProxyInstance = AEQbTJ(2, 1, 9, 0);
    public static final C7258agT iwGUEr = AEQbTJ(3, 0, 0, 0);
    public static final C7258agT hDKMBd = AEQbTJ(3, 0, 1, 0);
    public static final C7258agT uzCIH = AEQbTJ(3, 1, 0, 0);
    public static final C7258agT getFieldNames = AEQbTJ(3, 1, 1, 0);
    public static final C7258agT zLjUOn = AEQbTJ(3, 2, 0, 0);
    public static final C7258agT wlaJM = AEQbTJ(4, 0, 0, 0);
    public static final C7258agT zsXlph = AEQbTJ(4, 0, 1, 0);
    public static final C7258agT AubY = AEQbTJ(4, 1, 0, 0);
    public static final C7258agT AuCTelauCTel = AEQbTJ(5, 0, 0, 0);
    public static final C7258agT AxsJAY = AEQbTJ(5, 1, 0, 0);
    public static final C7258agT zuBGHE = AEQbTJ(5, 2, 0, 0);
    public static final C7258agT gHZMYf = AEQbTJ(6, 0, 0, 0);
    public static final C7258agT AwvSrB = AEQbTJ(6, 1, 0, 0);
    public static final C7258agT sSMYrx = AEQbTJ(6, 2, 0, 0);
    public static final C7258agT ORxRYg = AEQbTJ(6, 3, 0, 0);
    public static final C7258agT QOLQEE = AEQbTJ(7, 0, 0, 0);
    public static final C7258agT QKVWgx = AEQbTJ(8, 0, 0, 0);
    public static final C7258agT DTwDnp = AEQbTJ(9, 0, 0, 0);
    public static final C7258agT AhwBna = AEQbTJ(10, 0, 0, 0);
    public static final C7258agT gEmmrt = AEQbTJ(11, 0, 0, 0);
    public static final C7258agT djBIcL = AEQbTJ(12, 0, 0, 0);
    public static final C7258agT DbNXlk = AEQbTJ(12, 1, 0, 0);

    public static int OLrzqt(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return (this.QVAiDq >> 8) & 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return (this.QVAiDq >> 16) & 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.QVAiDq & 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return (this.QVAiDq >> 24) & 255;
    }

    public boolean equals(java.lang.Object obj) {
        return obj == this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.QVAiDq;
    }

    public static C7258agT OLrzqt(java.lang.String str) {
        int length = str.length();
        int[] iArr = {0, 0, 0, 0};
        int i = 0;
        int i2 = 0;
        while (i < 4 && i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '.') {
                i++;
            } else {
                char c = (char) (cCharAt - '0');
                if (c < 0 || c > '\t') {
                    throw new java.lang.IllegalArgumentException("Invalid version number: Version number may be negative or greater than 255");
                }
                int i3 = iArr[i] * 10;
                iArr[i] = i3;
                iArr[i] = i3 + c;
            }
            i2++;
        }
        if (i2 != length) {
            throw new java.lang.IllegalArgumentException("Invalid version number: String '" + str + "' exceeds version format");
        }
        for (int i4 = 0; i4 < 4; i4++) {
            int i5 = iArr[i4];
            if (i5 < 0 || i5 > 255) {
                throw new java.lang.IllegalArgumentException("Invalid version number: Version number may be negative or greater than 255");
            }
        }
        return AEQbTJ(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public static C7258agT AEQbTJ(int i, int i2, int i3, int i4) {
        if (i < 0 || i > 255 || i2 < 0 || i2 > 255 || i3 < 0 || i3 > 255 || i4 < 0 || i4 > 255) {
            throw new java.lang.IllegalArgumentException("Invalid version number: Version number may be negative or greater than 255");
        }
        int iOLrzqt = OLrzqt(i, i2, i3, i4);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iOLrzqt);
        ConcurrentHashMap<java.lang.Integer, C7258agT> concurrentHashMap = copydefault;
        C7258agT c7258agT = concurrentHashMap.get(numValueOf);
        if (c7258agT != null) {
            return c7258agT;
        }
        C7258agT c7258agT2 = new C7258agT(iOLrzqt);
        C7258agT c7258agTPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, c7258agT2);
        return c7258agTPutIfAbsent != null ? c7258agTPutIfAbsent : c7258agT2;
    }

    public static C7258agT KWHzl(int i) {
        return AEQbTJ(i, 0, 0, 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(7);
        sb.append(copydefault());
        sb.append('.');
        sb.append(KWHzl());
        sb.append('.');
        sb.append(AEQbTJ());
        sb.append('.');
        sb.append(OLrzqt());
        return sb.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7258agT c7258agT) {
        int i = this.QVAiDq;
        int i2 = c7258agT.QVAiDq;
        int i3 = (i >>> 1) - (i2 >>> 1);
        return i3 != 0 ? i3 : (i & 1) - (i2 & 1);
    }

    static {
        C7258agT c7258agTAEQbTJ = AEQbTJ(13, 0, 0, 0);
        AkhnZx = c7258agTAEQbTJ;
        C7258agT c7258agTAEQbTJ2 = AEQbTJ(68, 1, 0, 0);
        OLrzqt = c7258agTAEQbTJ2;
        KWHzl = c7258agTAEQbTJ2;
        OcIXYQ = c7258agTAEQbTJ;
        valueOf = KWHzl(9);
        EZpvd = KWHzl(9);
        AYXKKw = KWHzl(1);
        AEQbTJ = null;
    }

    public C7258agT(int i) {
        this.QVAiDq = i;
    }

    public static java.lang.String EZpvd() {
        if (AEQbTJ == null) {
            synchronized (C7258agT.class) {
                if (AEQbTJ == null) {
                    AEQbTJ = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "zoneinfo64").getString("TZVersion");
                }
            }
        }
        return AEQbTJ;
    }
}
