package o;

import co.nstant.in.cbor.CborException;

/* JADX INFO: renamed from: o.Ip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C5201Ip extends AbstractC5197Il<IA> {
    public C5201Ip(HS hs, java.io.OutputStream outputStream) {
        super(hs, outputStream);
    }

    public void OLrzqt(IA ia) throws CborException {
        int iOLrzqt = OLrzqt(ia.EZpvd());
        AEQbTJ(-7, (byte) ((iOLrzqt >> 8) & 255), (byte) (iOLrzqt & 255));
    }

    public static int OLrzqt(float f) {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(f);
        int i = (iFloatToIntBits >>> 16) & 32768;
        int i2 = (iFloatToIntBits + 4096) & Integer.MAX_VALUE;
        if (i2 >= 1199570944) {
            return (Integer.MAX_VALUE & iFloatToIntBits) >= 1199570944 ? i2 < 2139095040 ? i | 31744 : ((iFloatToIntBits & 8388607) >>> 13) | i | 31744 : i | 31743;
        }
        if (i2 >= 947912704) {
            return ((i2 - 939524096) >>> 13) | i;
        }
        if (i2 < 855638016) {
            return i;
        }
        int i3 = (iFloatToIntBits & Integer.MAX_VALUE) >>> 23;
        return ((((iFloatToIntBits & 8388607) | 8388608) + (8388608 >>> (i3 - 102))) >>> (126 - i3)) | i;
    }
}
