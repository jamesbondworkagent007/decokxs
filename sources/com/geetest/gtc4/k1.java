package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class k1 extends d0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k1(int i, int i2, int i3, f fVar) {
        super(i, i2, i3, fVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int i;
        w wVarD = this.d.d();
        boolean zI = i();
        int iA = wVarD.a(zI);
        if (zI) {
            iA += 3;
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
        return new g1(wVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return i() || this.d.d().f();
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        w wVarD = this.d.d();
        boolean zI = i();
        if (z) {
            int i = this.b;
            if (zI || wVarD.f()) {
                i |= 32;
            }
            uVar.a(i, this.c);
        }
        if (zI) {
            uVar.f516a.write(128);
            wVarD.a(uVar, true);
            uVar.f516a.write(0);
            uVar.f516a.write(0);
            return;
        }
        wVarD.a(uVar, false);
    }
}
