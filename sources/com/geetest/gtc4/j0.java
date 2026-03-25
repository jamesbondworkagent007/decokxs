package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public abstract class j0 extends h7 {
    public final float e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j0(k7 k7Var, float f) {
        super(k7Var);
        this.e = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h7, com.geetest.gtc4.f3
    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (super.equals(obj) && this.e == j0Var.e) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h7, com.geetest.gtc4.f3
    public final int hashCode() {
        return super.hashCode() ^ Float.valueOf(this.e).hashCode();
    }
}
