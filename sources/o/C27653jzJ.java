package o;

import com.okinc.business.market.di.RepositoryModule;

/* JADX INFO: renamed from: o.jzJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27653jzJ implements InterfaceC58162ywA<InterfaceC29449ktp> {
    public final InterfaceC58164ywC<InterfaceC23229huL> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC29449ktp get() {
        return AEQbTJ(this.OLrzqt.get());
    }

    public static InterfaceC29449ktp AEQbTJ(InterfaceC23229huL interfaceC23229huL) {
        return (InterfaceC29449ktp) C58165ywD.KWHzl(RepositoryModule.OLrzqt.AEQbTJ(interfaceC23229huL));
    }
}
