package o;

import co.nstant.in.cbor.CborException;

/* JADX INFO: renamed from: o.Ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C5196Ik extends AbstractC5197Il<C5209Ix> {
    public C5196Ik(HS hs, java.io.OutputStream outputStream) {
        super(hs, outputStream);
    }

    public void copydefault(C5209Ix c5209Ix) throws CborException {
        long jDoubleToRawLongBits = java.lang.Double.doubleToRawLongBits(c5209Ix.AEQbTJ());
        AEQbTJ(-5, (byte) ((jDoubleToRawLongBits >> 56) & 255), (byte) ((jDoubleToRawLongBits >> 48) & 255), (byte) ((jDoubleToRawLongBits >> 40) & 255), (byte) ((jDoubleToRawLongBits >> 32) & 255), (byte) ((jDoubleToRawLongBits >> 24) & 255), (byte) ((jDoubleToRawLongBits >> 16) & 255), (byte) ((jDoubleToRawLongBits >> 8) & 255), (byte) (jDoubleToRawLongBits & 255));
    }
}
