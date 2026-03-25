package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class z2 extends z {
    public int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z2() {
        this.b = -1;
    }

    @Override // com.geetest.gtc4.z, com.geetest.gtc4.w
    public final w h() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z
    public final b l() {
        return new u2(b1.a(i()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z
    public final s m() {
        return new i2(e1.a(j()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        if (this.b < 0) {
            int length = this.f540a.length;
            int iA = 0;
            for (int i = 0; i < length; i++) {
                iA += this.f540a[i].d().h().a(true);
            }
            this.b = iA;
        }
        int i2 = this.b;
        return d.a(i2, z ? 1 : 0, i2);
    }

    public z2(w wVar) {
        super(wVar);
        this.b = -1;
    }

    public z2(g gVar) {
        super(gVar);
        this.b = -1;
    }

    public z2(f[] fVarArr) {
        super(fVarArr);
        this.b = -1;
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 48);
        y2 y2VarB = uVar.b();
        f[] fVarArr = this.f540a;
        int length = fVarArr.length;
        int i = this.b;
        int i2 = 0;
        if (i < 0 && length <= 16) {
            w[] wVarArr = new w[length];
            int iA = 0;
            for (int i3 = 0; i3 < length; i3++) {
                w wVarH = this.f540a[i3].d().h();
                wVarArr[i3] = wVarH;
                iA += wVarH.a(true);
            }
            this.b = iA;
            uVar.b(iA);
            while (i2 < length) {
                y2VarB.a(wVarArr[i2]);
                i2++;
            }
            return;
        }
        if (i < 0) {
            int length2 = fVarArr.length;
            int iA2 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                iA2 += this.f540a[i4].d().h().a(true);
            }
            this.b = iA2;
        }
        uVar.b(this.b);
        while (i2 < length) {
            y2VarB.a(this.f540a[i2].d());
            i2++;
        }
    }
}
