package o;

import com.okinc.business.market.di.RepositoryModule;

/* JADX INFO: renamed from: o.jzH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27651jzH implements InterfaceC58162ywA<InterfaceC28901kjX> {
    public final InterfaceC58164ywC<C27640jyx> EZpvd;
    public final InterfaceC58164ywC<InterfaceC23229huL> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC28901kjX get() {
        return copydefault(this.copydefault.get(), this.EZpvd.get());
    }

    public static InterfaceC28901kjX copydefault(InterfaceC23229huL interfaceC23229huL, C27640jyx c27640jyx) {
        return (InterfaceC28901kjX) C58165ywD.KWHzl(RepositoryModule.OLrzqt.KWHzl(interfaceC23229huL, c27640jyx));
    }
}
