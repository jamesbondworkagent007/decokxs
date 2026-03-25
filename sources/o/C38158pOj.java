package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38158pOj implements InterfaceC58162ywA<pLH> {
    public final LinkModule EZpvd;
    public final InterfaceC58164ywC<pLC> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public pLH get() {
        return OLrzqt(this.EZpvd, this.KWHzl.get());
    }

    public static pLH OLrzqt(LinkModule linkModule, pLC plc) {
        return (pLH) C58165ywD.KWHzl(linkModule.AEQbTJ(plc));
    }
}
