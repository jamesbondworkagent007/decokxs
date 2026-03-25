package org.spongycastle.crypto.params;

import java.math.BigInteger;
import java.util.Vector;

/* JADX INFO: loaded from: classes25.dex */
public class NaccacheSternPrivateKeyParameters extends NaccacheSternKeyParameters {
    private BigInteger phi_n;
    private Vector smallPrimes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigInteger getPhi_n() {
        return this.phi_n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Vector getSmallPrimes() {
        return this.smallPrimes;
    }

    public NaccacheSternPrivateKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, int i, Vector vector, BigInteger bigInteger3) {
        super(true, bigInteger, bigInteger2, i);
        this.smallPrimes = vector;
        this.phi_n = bigInteger3;
    }
}
