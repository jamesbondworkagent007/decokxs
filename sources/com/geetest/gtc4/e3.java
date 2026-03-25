package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public final class e3 extends l1 {
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e3(int i, int i2, boolean z, c0 c0Var) {
        super(i, i2, c0Var);
        this.d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.l1, com.geetest.gtc4.i5
    public final w b() {
        c0 c0Var = this.c;
        int i = this.f472a;
        int i2 = this.b;
        if (!this.d) {
            return new d3(4, i, i2, new i2(((h3) c0Var.f428a).b()));
        }
        g gVarA = c0Var.a();
        int i3 = gVarA.b;
        if (i3 == 1) {
            return new d3(3, i, i2, gVarA.a(0));
        }
        z2 z2Var = x2.f532a;
        if (i3 >= 1) {
            z2Var = new z2(gVarA);
        }
        return new d3(4, i, i2, z2Var);
    }
}
