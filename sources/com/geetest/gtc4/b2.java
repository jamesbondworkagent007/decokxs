package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class b2 implements f, i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f424a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b2(c0 c0Var) {
        this.f424a = c0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f
    public final w d() {
        try {
            return b();
        } catch (IOException e) {
            throw new v("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new v("unable to get DER object", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.i5
    public final w b() throws i {
        try {
            return new w2(new z2(this.f424a.a()));
        } catch (IllegalArgumentException e) {
            throw new i(e.getMessage(), e);
        }
    }
}
