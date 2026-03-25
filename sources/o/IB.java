package o;

import co.nstant.in.cbor.CborException;

/* JADX INFO: loaded from: classes2.dex */
public class IB extends C5205It {
    public IB(IF r3, IF r4) throws CborException {
        EZpvd(30L);
        if (r3 == null) {
            throw new CborException("Numerator is null");
        }
        if (r4 == null) {
            throw new CborException("Denominator is null");
        }
        if (r4.KWHzl().equals(java.math.BigInteger.ZERO)) {
            throw new CborException("Denominator is zero");
        }
        EZpvd(r3);
        EZpvd(r4);
    }
}
