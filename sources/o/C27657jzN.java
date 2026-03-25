package o;

import com.okinc.business.market.di.RepositoryModule;

/* JADX INFO: renamed from: o.jzN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27657jzN implements InterfaceC58162ywA<jRU> {
    public final InterfaceC58164ywC<InterfaceC23229huL> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public jRU get() {
        return copydefault(this.EZpvd.get());
    }

    public static jRU copydefault(InterfaceC23229huL interfaceC23229huL) {
        return (jRU) C58165ywD.KWHzl(RepositoryModule.OLrzqt.AYXKKw(interfaceC23229huL));
    }
}
