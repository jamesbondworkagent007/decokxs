package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class a3 implements f, i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f419a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a3(c0 c0Var) {
        this.f419a = c0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.i5
    public final w b() {
        g gVarA = this.f419a.a();
        return gVarA.b < 1 ? x2.f532a : new z2(gVarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f
    public final w d() {
        try {
            g gVarA = this.f419a.a();
            return gVarA.b < 1 ? x2.f532a : new z2(gVarA);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
