package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class n2 extends b0 {
    public int c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n2(f[] fVarArr) {
        super(true, fVarArr);
        this.c = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.b0, com.geetest.gtc4.w
    public final w g() {
        return this.b != null ? this : super.g();
    }

    @Override // com.geetest.gtc4.b0, com.geetest.gtc4.w
    public final w h() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        if (this.c < 0) {
            int length = this.f423a.length;
            int iA = 0;
            for (int i = 0; i < length; i++) {
                iA += this.f423a[i].d().g().a(true);
            }
            this.c = iA;
        }
        int i2 = this.c;
        return d.a(i2, z ? 1 : 0, i2);
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 49);
        k2 k2VarA = uVar.a();
        f[] fVarArr = this.f423a;
        int length = fVarArr.length;
        int i = this.c;
        int i2 = 0;
        if (i < 0 && length <= 16) {
            w[] wVarArr = new w[length];
            int iA = 0;
            for (int i3 = 0; i3 < length; i3++) {
                w wVarG = this.f423a[i3].d().g();
                wVarArr[i3] = wVarG;
                iA += wVarG.a(true);
            }
            this.c = iA;
            uVar.b(iA);
            while (i2 < length) {
                wVarArr[i2].a(k2VarA, true);
                i2++;
            }
            return;
        }
        if (i < 0) {
            int length2 = fVarArr.length;
            int iA2 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                iA2 += this.f423a[i4].d().g().a(true);
            }
            this.c = iA2;
        }
        uVar.b(this.c);
        while (i2 < length) {
            this.f423a[i2].d().g().a(k2VarA, true);
            i2++;
        }
    }
}
