package o;

import androidx.core.view.InputDeviceCompat;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.acT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7046acT {
    public static long AEQbTJ(int i) {
        int i2 = i & 255;
        if (i2 < 192) {
            return (((long) ((-65536) & i)) << 32) | (((long) (i & 65280)) << 16) | ((long) (i2 << 8));
        }
        int i3 = i - i2;
        return (i & 15) == 1 ? (((long) i3) << 32) | 83887360 : ((long) i3) & BodyPartID.bodyIdMax;
    }

    public static long AEQbTJ(long j) {
        return (j << 32) | 83887360;
    }

    public static long AkhnZx(int i) {
        return ((((long) i) & 65280) << 16) | 1280;
    }

    public static int DbNXlk(int i) {
        return (i >> 8) & 31;
    }

    public static long EZpvd(int i) {
        return (((long) ((-65536) & i)) << 32) | (((long) (65280 & i)) << 16) | ((long) ((i & 255) << 8));
    }

    public static long KWHzl(int i) {
        return (((long) (i & InputDeviceCompat.SOURCE_ANY)) << 32) | 83887360;
    }

    public static long OLrzqt(int i) {
        return ((long) i) & 4294967040L;
    }

    public static char copydefault(int i) {
        return (char) ((i >> 8) & 15);
    }

    public static int djBIcL(int i) {
        return i >>> 13;
    }

    public static int fIwbmz(int i) {
        return i & 15;
    }

    public static long fetchVPNInfo(int i) {
        return ((long) i) & 4294967040L;
    }

    public static boolean isConnected(int i) {
        return (i & 255) >= 192;
    }

    public static long values(int i) {
        return (((long) ((-16777216) & i)) << 32) | 83886080 | ((long) ((i & 16711680) >> 8));
    }

    public static boolean KWHzl(int i, int i2) {
        return isConnected(i) && fIwbmz(i) == i2;
    }

    public static boolean AhwBna(int i) {
        return KWHzl(i, 1);
    }

    public static boolean gEmmrt(int i) {
        return !isConnected(i) || fIwbmz(i) == 1 || fIwbmz(i) == 2 || fIwbmz(i) == 4;
    }

    public static boolean AYXKKw(int i) {
        return KWHzl(i, 8);
    }

    public static boolean valueOf(int i) {
        return KWHzl(i, 9);
    }

    public static long EZpvd(long j, boolean z, int i) {
        long j2;
        int i2;
        int i3 = i + ((((int) (j >> 8)) & 255) - 2);
        long j3 = ((i3 % 254) + 2) << 8;
        int i4 = i3 / 254;
        if (z) {
            int i5 = i4 + ((((int) (j >> 16)) & 255) - 4);
            j2 = j3 | ((long) (((i5 % 251) + 4) << 16));
            i2 = i5 / 251;
        } else {
            int i6 = i4 + ((((int) (j >> 16)) & 255) - 2);
            j2 = j3 | ((long) (((i6 % 254) + 2) << 16));
            i2 = i6 / 254;
        }
        return ((j & 4278190080L) + (((long) i2) << 24)) | j2;
    }

    public static long KWHzl(int i, long j) {
        int i2 = (int) j;
        return EZpvd(j >>> 32, (i2 & 128) != 0, (i - (i2 >> 8)) * (i2 & 127));
    }

    public static long ejfBZ(int i) {
        int i2 = i + 1;
        long j = ((i2 % 18) * 14) + 2;
        int i3 = i2 / 18;
        return j | ((long) (((i3 % 254) + 2) << 8)) | ((long) ((((i3 / 254) % 251) + 4) << 16)) | 4261412864L;
    }

    public static long AuCTel(int i) {
        return AEQbTJ(ejfBZ(i));
    }
}
