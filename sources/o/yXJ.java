package o;

/* JADX INFO: loaded from: classes13.dex */
public class yXJ {
    public static final java.nio.ByteBuffer AEQbTJ;
    public static final byte[] EZpvd;

    public interface Activity {
        int getNumber();
    }

    public interface StateListAnimator<T extends Activity> {
        T AEQbTJ(int i);
    }

    public static boolean copydefault(byte[] bArr) {
        return yXZ.AEQbTJ(bArr);
    }

    public static java.lang.String AEQbTJ(byte[] bArr) {
        try {
            return new java.lang.String(bArr, com.google.android.exoplayer2.C.UTF8_NAME);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e);
        }
    }

    static {
        byte[] bArr = new byte[0];
        EZpvd = bArr;
        AEQbTJ = java.nio.ByteBuffer.wrap(bArr);
    }
}
