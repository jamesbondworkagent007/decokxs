package o;

import co.nstant.in.cbor.CborException;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: o.Ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5188Ic extends HV<IH> {
    public C5188Ic(HU hu, java.io.InputStream inputStream) {
        super(hu, inputStream);
    }

    public IH KWHzl(int i) throws CborException {
        byte[] bArrCopydefault = copydefault(4);
        return new IH(java.lang.Float.intBitsToFloat((bArrCopydefault[3] & UnsignedBytes.MAX_VALUE) | ((((((bArrCopydefault[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArrCopydefault[1] & UnsignedBytes.MAX_VALUE)) << 8) | (bArrCopydefault[2] & UnsignedBytes.MAX_VALUE)) << 8)));
    }
}
