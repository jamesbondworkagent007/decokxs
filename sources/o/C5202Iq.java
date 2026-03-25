package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.MajorType;

/* JADX INFO: renamed from: o.Iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C5202Iq extends AbstractC5197Il<ID> {
    public static final java.math.BigInteger EZpvd = java.math.BigInteger.valueOf(-1);

    public C5202Iq(HS hs, java.io.OutputStream outputStream) {
        super(hs, outputStream);
    }

    public void OLrzqt(ID id) throws CborException {
        copydefault(MajorType.NEGATIVE_INTEGER, EZpvd.subtract(id.KWHzl()).abs());
    }
}
