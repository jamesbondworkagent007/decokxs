package org.spongycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes25.dex */
public class ElGamalPrivateKeySpec extends ElGamalKeySpec {
    private BigInteger x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigInteger getX() {
        return this.x;
    }

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.x = bigInteger;
    }
}
