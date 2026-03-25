package o;

import com.okinc.business.market.di.RepositoryModule;

/* JADX INFO: renamed from: o.jzr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27687jzr implements InterfaceC58162ywA<jNW> {
    public final InterfaceC58164ywC<InterfaceC27595jyE> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public jNW get() {
        return EZpvd(this.KWHzl.get());
    }

    public static jNW EZpvd(InterfaceC27595jyE interfaceC27595jyE) {
        return (jNW) C58165ywD.KWHzl(RepositoryModule.OLrzqt.OLrzqt(interfaceC27595jyE));
    }
}
