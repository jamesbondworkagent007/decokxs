package com.geetest.gtc4;

import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public abstract class s1 extends f3 {
    public boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s1(p5 p5Var) {
        super(p5Var);
        this.c = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f3
    public boolean equals(Object obj) {
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            if (super.equals(obj) && this.c == s1Var.c) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f3
    public int hashCode() {
        return Objects.hash(this.f446a, this.b) ^ Boolean.valueOf(this.c).hashCode();
    }
}
