package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38152pOd implements InterfaceC58162ywA<C38083pLp> {
    public final LinkModule KWHzl;
    public final InterfaceC58164ywC<InterfaceC38065pKy> OLrzqt;
    public final InterfaceC58164ywC<InterfaceC38081pLn> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C38083pLp get() {
        return KWHzl(this.KWHzl, this.copydefault.get(), this.OLrzqt.get());
    }

    public static C38083pLp KWHzl(LinkModule linkModule, InterfaceC38081pLn interfaceC38081pLn, InterfaceC38065pKy interfaceC38065pKy) {
        return (C38083pLp) C58165ywD.KWHzl(linkModule.EZpvd(interfaceC38081pLn, interfaceC38065pKy));
    }
}
