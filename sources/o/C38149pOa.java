package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38149pOa implements InterfaceC58162ywA<InterfaceC38091pLx> {
    public final InterfaceC58164ywC<pLH> AEQbTJ;
    public final LinkModule EZpvd;
    public final InterfaceC58164ywC<InterfaceC38117pMw> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC38091pLx get() {
        return OLrzqt(this.EZpvd, this.copydefault.get(), this.AEQbTJ.get());
    }

    public static InterfaceC38091pLx OLrzqt(LinkModule linkModule, InterfaceC38117pMw interfaceC38117pMw, pLH plh) {
        return (InterfaceC38091pLx) C58165ywD.KWHzl(linkModule.EZpvd(interfaceC38117pMw, plh));
    }
}
