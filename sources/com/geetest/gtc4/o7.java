package com.geetest.gtc4;

import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class o7 extends f3 {
    public final long c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o7(long j) {
        super(p5.TAG);
        this.c = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f3
    public final boolean equals(Object obj) {
        if (obj instanceof o7) {
            o7 o7Var = (o7) obj;
            if (super.equals(obj) && this.c == o7Var.c) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f3
    public final int hashCode() {
        return Objects.hash(this.f446a, this.b) ^ Long.valueOf(this.c).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Tag(" + this.c + ")";
    }
}
