package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: loaded from: classes9.dex */
public final class pNV implements InterfaceC58162ywA<InterfaceC38114pMt> {
    public final InterfaceC58164ywC<InterfaceC38084pLq> AEQbTJ;
    public final LinkModule KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC38114pMt get() {
        return OLrzqt(this.KWHzl, this.AEQbTJ.get());
    }

    public static InterfaceC38114pMt OLrzqt(LinkModule linkModule, InterfaceC38084pLq interfaceC38084pLq) {
        return (InterfaceC38114pMt) C58165ywD.KWHzl(linkModule.copydefault(interfaceC38084pLq));
    }
}
