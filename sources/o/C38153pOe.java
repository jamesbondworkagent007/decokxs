package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38153pOe implements InterfaceC58162ywA<InterfaceC38084pLq> {
    public final LinkModule AEQbTJ;
    public final InterfaceC58164ywC<C38085pLr> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC38084pLq get() {
        return OLrzqt(this.AEQbTJ, this.KWHzl.get());
    }

    public static InterfaceC38084pLq OLrzqt(LinkModule linkModule, C38085pLr c38085pLr) {
        return (InterfaceC38084pLq) C58165ywD.KWHzl(linkModule.KWHzl(c38085pLr));
    }
}
