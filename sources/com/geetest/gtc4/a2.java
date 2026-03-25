package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public final class a2 extends j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a2(q qVar, n nVar, w wVar, int i, w wVar2) {
        super(qVar, nVar, wVar, i, wVar2);
    }

    @Override // com.geetest.gtc4.j, com.geetest.gtc4.w
    public final w g() {
        return this;
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
            gVar.a(wVar.g());
        }
        int i = this.d;
        gVar.a(new p2(i == 0, i, this.e));
        return new m2(gVar);
    }
}
