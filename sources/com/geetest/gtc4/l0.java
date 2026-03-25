package com.geetest.gtc4;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class l0 extends s1 {
    public final ArrayList d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l0() {
        super(p5.ARRAY);
        this.d = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.s1, com.geetest.gtc4.f3
    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (super.equals(obj) && this.d.equals(l0Var.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.s1, com.geetest.gtc4.f3
    public final int hashCode() {
        return super.hashCode() ^ this.d.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.c) {
            sb.append("_ ");
        }
        sb.append(Arrays.toString(this.d.toArray()).substring(1));
        return sb.toString();
    }

    public l0(int i) {
        super(p5.ARRAY);
        this.d = new ArrayList(i);
    }
}
