package org.spongycastle.jce.spec;

import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes25.dex */
public class ECPublicKeySpec extends ECKeySpec {
    private ECPoint q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ECPoint getQ() {
        return this.q;
    }

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.q = eCPoint.getCurve() != null ? eCPoint.normalize() : eCPoint;
    }
}
