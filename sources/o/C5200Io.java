package o;

import co.nstant.in.cbor.CborException;

/* JADX INFO: renamed from: o.Io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C5200Io extends AbstractC5197Il<IH> {
    public C5200Io(HS hs, java.io.OutputStream outputStream) {
        super(hs, outputStream);
    }

    public void copydefault(IH ih) throws CborException {
        int iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(ih.EZpvd());
        AEQbTJ(-6, (byte) ((iFloatToRawIntBits >> 24) & 255), (byte) ((iFloatToRawIntBits >> 16) & 255), (byte) ((iFloatToRawIntBits >> 8) & 255), (byte) (iFloatToRawIntBits & 255));
    }
}
