package o;

import com.okinc.business.market.di.RepositoryModule;

/* JADX INFO: renamed from: o.jzu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27690jzu implements InterfaceC58162ywA<jRO> {
    public final InterfaceC58164ywC<InterfaceC27595jyE> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public jRO get() {
        return AEQbTJ(this.KWHzl.get());
    }

    public static jRO AEQbTJ(InterfaceC27595jyE interfaceC27595jyE) {
        return (jRO) C58165ywD.KWHzl(RepositoryModule.OLrzqt.EZpvd(interfaceC27595jyE));
    }
}
