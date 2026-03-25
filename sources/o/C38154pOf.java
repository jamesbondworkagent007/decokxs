package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38154pOf implements InterfaceC58162ywA<pMV> {
    public final LinkModule EZpvd;
    public final InterfaceC58164ywC<pMM> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public pMV get() {
        return KWHzl(this.EZpvd, this.copydefault.get());
    }

    public static pMV KWHzl(LinkModule linkModule, pMM pmm) {
        return (pMV) C58165ywD.KWHzl(linkModule.EZpvd(pmm));
    }
}
