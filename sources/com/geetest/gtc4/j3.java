package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public final class j3 extends h7 {
    public final double e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j3(double d) {
        super(k7.IEEE_754_DOUBLE_PRECISION_FLOAT);
        this.e = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h7, com.geetest.gtc4.f3
    public final boolean equals(Object obj) {
        if (obj instanceof j3) {
            j3 j3Var = (j3) obj;
            if (super.equals(obj) && this.e == j3Var.e) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h7, com.geetest.gtc4.f3
    public final int hashCode() {
        return super.hashCode() ^ Double.valueOf(this.e).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h7
    public final String toString() {
        return String.valueOf(this.e);
    }
}
