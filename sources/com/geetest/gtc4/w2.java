package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public final class w2 extends j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w2(z2 z2Var) {
        super(z2Var);
    }

    @Override // com.geetest.gtc4.w
    public final w h() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.j
    public final z i() {
        g gVar = new g(4);
        q qVar = this.f464a;
        if (qVar != null) {
            gVar.a(qVar);
        }
        n nVar = this.b;
        if (nVar != null) {
            gVar.a(nVar);
        }
        w wVar = this.c;
        if (wVar != null) {
            gVar.a(wVar.h());
        }
        int i = this.d;
        gVar.a(new d3(i == 0, i, this.e));
        return new z2(gVar);
    }
}
