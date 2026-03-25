package o;

import com.google.android.exoplayer2.audio.WavUtil;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: o.acK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7037acK {
    public static boolean AEQbTJ(int i) {
        if ((i & WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE) == 65534) {
            return true;
        }
        return i >= 64976 && i <= 65007;
    }

    public static int EZpvd(char c, char c2) {
        return (c << 16) | c2;
    }

    public static int EZpvd(java.lang.String str, byte[] bArr, int i, int i2) {
        int length = str.length();
        byte b = 1;
        while (b != 0) {
            b = bArr[i2];
            i2++;
            if (b == 0) {
                break;
            }
            if (i == length || str.charAt(i) != ((char) (b & UnsignedBytes.MAX_VALUE))) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static int AEQbTJ(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = 1;
            while (b != 0) {
                b = bArr[i];
                i++;
            }
        }
        return i;
    }

    public static int AEQbTJ(byte[] bArr, int i, int i2, byte b) {
        int i3 = 0;
        while (i3 < i2) {
            byte b2 = bArr[i + i3];
            i3++;
            if (b2 == b) {
                break;
            }
        }
        return i3;
    }

    private C7037acK() {
    }
}
