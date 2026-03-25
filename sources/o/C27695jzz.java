package o;

import com.okinc.business.market.di.RepositoryModule;

/* JADX INFO: renamed from: o.jzz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27695jzz implements InterfaceC58162ywA<InterfaceC27636jyt> {
    public final InterfaceC58164ywC<InterfaceC23229huL> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC27636jyt get() {
        return copydefault(this.copydefault.get());
    }

    public static InterfaceC27636jyt copydefault(InterfaceC23229huL interfaceC23229huL) {
        return (InterfaceC27636jyt) C58165ywD.KWHzl(RepositoryModule.OLrzqt.EZpvd(interfaceC23229huL));
    }
}
