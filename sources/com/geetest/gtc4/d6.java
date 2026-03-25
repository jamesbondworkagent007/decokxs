package com.geetest.gtc4;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d6 extends f3 {
    public final BigInteger c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d6(p5 p5Var, BigInteger bigInteger) {
        super(p5Var);
        Objects.requireNonNull(bigInteger);
        this.c = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f3
    public final boolean equals(Object obj) {
        if (obj instanceof d6) {
            d6 d6Var = (d6) obj;
            if (super.equals(obj) && this.c.equals(d6Var.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f3
    public final int hashCode() {
        return super.hashCode() ^ this.c.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.c.toString();
    }
}
