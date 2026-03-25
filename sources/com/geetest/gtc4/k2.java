package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes21.dex */
public final class k2 extends y2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k2(ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
    }

    @Override // com.geetest.gtc4.u
    public final k2 a() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.y2, com.geetest.gtc4.u
    public final void a(f[] fVarArr) {
        for (f fVar : fVarArr) {
            fVar.d().g().a(this, true);
        }
    }

    @Override // com.geetest.gtc4.y2
    public final void a(w wVar) {
        wVar.g().a(this, true);
    }

    @Override // com.geetest.gtc4.y2, com.geetest.gtc4.u
    public final void a(w[] wVarArr) {
        for (w wVar : wVarArr) {
            wVar.g().a(this, true);
        }
    }
}
