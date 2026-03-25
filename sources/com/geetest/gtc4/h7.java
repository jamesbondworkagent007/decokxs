package com.geetest.gtc4;

import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public class h7 extends f3 {
    public static final h7 d = new h7(k7.BREAK);
    public final k7 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h7(k7 k7Var) {
        super(p5.SPECIAL);
        Objects.requireNonNull(k7Var);
        this.c = k7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f3
    public boolean equals(Object obj) {
        if (obj instanceof h7) {
            h7 h7Var = (h7) obj;
            if (super.equals(obj) && this.c == h7Var.c) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f3
    public int hashCode() {
        return Objects.hash(this.f446a, this.b) ^ Objects.hashCode(this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.c.name();
    }
}
