package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class p2 extends d0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p2(boolean z, int i, f fVar) {
        super(z, i, fVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int i;
        w wVarG = this.d.d().g();
        boolean zI = i();
        int iA = wVarG.a(zI);
        if (zI) {
            iA += u.a(iA);
        }
        if (z) {
            int i2 = this.c;
            if (i2 < 31) {
                i = 1;
            } else {
                int i3 = 2;
                while (true) {
                    i2 >>>= 7;
                    if (i2 == 0) {
                        break;
                    }
                    i3++;
                }
                i = i3;
            }
        } else {
            i = 0;
        }
        return iA + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.d0
    public final z c(w wVar) {
        return new m2(wVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return i() || this.d.d().g().f();
    }

    @Override // com.geetest.gtc4.d0, com.geetest.gtc4.w
    public final w g() {
        return this;
    }

    @Override // com.geetest.gtc4.d0, com.geetest.gtc4.w
    public final w h() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public p2(int i, int i2, int i3, f fVar) {
        super(i, i2, i3, fVar);
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        w wVarG = this.d.d().g();
        boolean zI = i();
        if (z) {
            int i = this.b;
            if (zI || wVarG.f()) {
                i |= 32;
            }
            uVar.a(i, this.c);
        }
        if (zI) {
            uVar.b(wVarG.a(true));
        }
        wVarG.a(uVar.a(), zI);
    }
}
