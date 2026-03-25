package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38162pOn implements InterfaceC58162ywA<C38104pMj> {
    public final LinkModule AEQbTJ;
    public final InterfaceC58164ywC<pMM> EZpvd;
    public final InterfaceC58164ywC<InterfaceC38091pLx> KWHzl;
    public final InterfaceC58164ywC<pMV> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C38104pMj get() {
        return AEQbTJ(this.AEQbTJ, this.KWHzl.get(), this.EZpvd.get(), this.OLrzqt.get());
    }

    public static C38104pMj AEQbTJ(LinkModule linkModule, InterfaceC38091pLx interfaceC38091pLx, pMM pmm, pMV pmv) {
        return (C38104pMj) C58165ywD.KWHzl(linkModule.copydefault(interfaceC38091pLx, pmm, pmv));
    }
}
