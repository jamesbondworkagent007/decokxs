package com.geetest.gtc4;

import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public abstract class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5 f446a;
    public o7 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f3(p5 p5Var) {
        this.f446a = p5Var;
        Objects.requireNonNull(p5Var, "majorType is null");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        o7 o7Var = this.b;
        return o7Var != null ? o7Var.equals(f3Var.b) && this.f446a == f3Var.f446a : f3Var.b == null && this.f446a == f3Var.f446a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Objects.hash(this.f446a, this.b);
    }
}
