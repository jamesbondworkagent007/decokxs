package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f443a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f0(Class cls) {
        this.f443a = cls;
    }

    public abstract w a(i2 i2Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w a(z zVar) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final w a(d0 d0Var) {
        int i = d0Var.b;
        if (i != 128) {
            throw new IllegalStateException("Expected CONTEXT tag but found ".concat(i != 64 ? i != 128 ? i != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
        }
        if (1 == d0Var.f434a) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        w wVarD = d0Var.d.d();
        int i2 = d0Var.f434a;
        if (i2 == 3) {
            wVarD = a(d0Var.c(wVarD));
        } else if (i2 == 4) {
            wVarD = wVarD instanceof z ? a((z) wVarD) : a((i2) wVarD);
        } else if (!this.f443a.isInstance(wVarD)) {
            throw new IllegalStateException("unexpected object: ".concat(wVarD.getClass().getName()));
        }
        if (this.f443a.isInstance(wVarD)) {
            return wVarD;
        }
        throw new IllegalStateException("unexpected object: ".concat(wVarD.getClass().getName()));
    }
}
