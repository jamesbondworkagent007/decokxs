package o;

import com.okinc.business.market.di.WebsocketModule;

/* JADX INFO: renamed from: o.jAa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25617jAa implements InterfaceC58162ywA<C57567ykp> {
    public final InterfaceC58164ywC<InterfaceC9859bdY> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C57567ykp get() {
        return OLrzqt(this.OLrzqt.get());
    }

    public static C57567ykp OLrzqt(InterfaceC9859bdY interfaceC9859bdY) {
        return (C57567ykp) C58165ywD.KWHzl(WebsocketModule.OLrzqt.copydefault(interfaceC9859bdY));
    }
}
