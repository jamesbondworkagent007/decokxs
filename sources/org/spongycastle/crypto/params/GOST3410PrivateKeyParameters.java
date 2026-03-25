package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes25.dex */
public class GOST3410PrivateKeyParameters extends GOST3410KeyParameters {
    private BigInteger x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigInteger getX() {
        return this.x;
    }

    public GOST3410PrivateKeyParameters(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        super(true, gOST3410Parameters);
        this.x = bigInteger;
    }
}
