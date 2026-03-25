package o;

import co.nstant.in.cbor.CborException;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes2.dex */
public class HX extends HV<C5209Ix> {
    public HX(HU hu, java.io.InputStream inputStream) {
        super(hu, inputStream);
    }

    public C5209Ix OLrzqt(int i) throws CborException {
        byte[] bArrCopydefault = copydefault(8);
        long j = bArrCopydefault[0] & UnsignedBytes.MAX_VALUE;
        long j2 = bArrCopydefault[1] & UnsignedBytes.MAX_VALUE;
        long j3 = bArrCopydefault[2] & UnsignedBytes.MAX_VALUE;
        long j4 = bArrCopydefault[3] & UnsignedBytes.MAX_VALUE;
        long j5 = bArrCopydefault[4] & UnsignedBytes.MAX_VALUE;
        return new C5209Ix(java.lang.Double.longBitsToDouble(((long) (bArrCopydefault[7] & UnsignedBytes.MAX_VALUE)) | (((((((((((((j << 8) | j2) << 8) | j3) << 8) | j4) << 8) | j5) << 8) | (bArrCopydefault[5] & UnsignedBytes.MAX_VALUE)) << 8) | ((long) (bArrCopydefault[6] & UnsignedBytes.MAX_VALUE))) << 8)));
    }
}
