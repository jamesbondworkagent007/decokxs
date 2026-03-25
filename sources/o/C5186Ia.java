package o;

import co.nstant.in.cbor.CborException;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: o.Ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5186Ia extends HV<IA> {
    public C5186Ia(HU hu, java.io.InputStream inputStream) {
        super(hu, inputStream);
    }

    public IA KWHzl(int i) throws CborException {
        byte[] bArrCopydefault = copydefault(2);
        return new IA(OLrzqt((bArrCopydefault[1] & UnsignedBytes.MAX_VALUE) | ((bArrCopydefault[0] & UnsignedBytes.MAX_VALUE) << 8)));
    }

    public static float OLrzqt(int i) {
        int i2 = (32768 & i) >> 15;
        int i3 = (i & 31744) >> 10;
        int i4 = i & 1023;
        if (i3 == 0) {
            return (float) (((double) (i2 == 0 ? 1 : -1)) * java.lang.Math.pow(2.0d, -14.0d) * (((double) i4) / java.lang.Math.pow(2.0d, 10.0d)));
        }
        if (i3 != 31) {
            return (float) (((double) (i2 == 0 ? 1 : -1)) * java.lang.Math.pow(2.0d, i3 - 15) * ((((double) i4) / java.lang.Math.pow(2.0d, 10.0d)) + 1.0d));
        }
        if (i4 != 0) {
            return Float.NaN;
        }
        return (i2 == 0 ? 1 : -1) * Float.POSITIVE_INFINITY;
    }
}
