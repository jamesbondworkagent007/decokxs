package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38151pOc implements InterfaceC58162ywA<InterfaceC38081pLn> {
    public final InterfaceC58164ywC<C38086pLs> EZpvd;
    public final LinkModule OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC38081pLn get() {
        return copydefault(this.OLrzqt, this.EZpvd.get());
    }

    public static InterfaceC38081pLn copydefault(LinkModule linkModule, C38086pLs c38086pLs) {
        return (InterfaceC38081pLn) C58165ywD.KWHzl(linkModule.KWHzl(c38086pLs));
    }
}
