package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class y2 extends u {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y2(ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.u
    public void a(f[] fVarArr) {
        for (f fVar : fVarArr) {
            fVar.d().h().a(this, true);
        }
    }

    @Override // com.geetest.gtc4.u
    public final y2 b() {
        return this;
    }

    public void a(w wVar) {
        wVar.h().a(this, true);
    }

    @Override // com.geetest.gtc4.u
    public void a(w[] wVarArr) {
        for (w wVar : wVarArr) {
            wVar.h().a(this, true);
        }
    }
}
