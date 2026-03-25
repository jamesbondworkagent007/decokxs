package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public final class u6 extends h7 {
    public static final u6 g = new u6(v6.FALSE);
    public static final u6 h = new u6(v6.TRUE);
    public static final u6 i = new u6(v6.NULL);
    public static final u6 j = new u6(v6.UNDEFINED);
    public final v6 e;
    public final int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u6(v6 v6Var) {
        super(k7.SIMPLE_VALUE);
        this.f = v6Var.getValue();
        this.e = v6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h7, com.geetest.gtc4.f3
    public final boolean equals(Object obj) {
        if (obj instanceof u6) {
            u6 u6Var = (u6) obj;
            if (super.equals(obj) && this.f == u6Var.f) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h7, com.geetest.gtc4.f3
    public final int hashCode() {
        return super.hashCode() ^ Integer.valueOf(this.f).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h7
    public final String toString() {
        return this.e.toString();
    }

    public u6(int i2) {
        super(i2 <= 23 ? k7.SIMPLE_VALUE : k7.SIMPLE_VALUE_NEXT_BYTE);
        this.f = i2;
        this.e = v6.ofByte(i2);
    }
}
