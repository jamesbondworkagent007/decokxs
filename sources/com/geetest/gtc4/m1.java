package com.geetest.gtc4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public final class m1 extends s1 {
    public final byte[] d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m1(byte[] bArr) {
        super(p5.BYTE_STRING);
        if (bArr == null) {
            this.d = null;
        } else {
            this.d = bArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.s1, com.geetest.gtc4.f3
    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (super.equals(obj) && Arrays.equals(this.d, m1Var.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.s1, com.geetest.gtc4.f3
    public final int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.d);
    }
}
