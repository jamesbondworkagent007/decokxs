package o;

import com.okinc.business.market.di.RepositoryModule;

/* JADX INFO: renamed from: o.jzR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27661jzR implements InterfaceC58162ywA<InterfaceC29729kzD> {
    public final InterfaceC58164ywC<InterfaceC23229huL> KWHzl;
    public final InterfaceC58164ywC<C27640jyx> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC29729kzD get() {
        return KWHzl(this.KWHzl.get(), this.OLrzqt.get());
    }

    public static InterfaceC29729kzD KWHzl(InterfaceC23229huL interfaceC23229huL, C27640jyx c27640jyx) {
        return (InterfaceC29729kzD) C58165ywD.KWHzl(RepositoryModule.OLrzqt.EZpvd(interfaceC23229huL, c27640jyx));
    }
}
