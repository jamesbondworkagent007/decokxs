package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38150pOb implements InterfaceC58162ywA<C38080pLm> {
    public final LinkModule EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C38080pLm get() {
        return AEQbTJ(this.EZpvd);
    }

    public static C38080pLm AEQbTJ(LinkModule linkModule) {
        return (C38080pLm) C58165ywD.KWHzl(linkModule.fetchVPNInfo());
    }
}
