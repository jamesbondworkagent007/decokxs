package o;

import co.nstant.in.cbor.model.MajorType;

/* JADX INFO: loaded from: classes2.dex */
public class IL extends IF {
    public IL(long j) {
        this(java.math.BigInteger.valueOf(j));
        OLrzqt(j >= 0, "value " + j + " is not >= 0");
    }

    public IL(java.math.BigInteger bigInteger) {
        super(MajorType.UNSIGNED_INTEGER, bigInteger);
    }
}
