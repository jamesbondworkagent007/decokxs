package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38155pOg implements InterfaceC58162ywA<pMA> {
    public final InterfaceC58164ywC<InterfaceC33171mrS> KWHzl;
    public final LinkModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public pMA get() {
        return OLrzqt(this.copydefault, this.KWHzl.get());
    }

    public static pMA OLrzqt(LinkModule linkModule, InterfaceC33171mrS interfaceC33171mrS) {
        return (pMA) C58165ywD.KWHzl(linkModule.KWHzl(interfaceC33171mrS));
    }
}
