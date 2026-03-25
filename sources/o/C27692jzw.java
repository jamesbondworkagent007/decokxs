package o;

import com.okinc.business.market.di.RepositoryModule;

/* JADX INFO: renamed from: o.jzw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27692jzw implements InterfaceC58162ywA<jNV> {
    public final InterfaceC58164ywC<InterfaceC23229huL> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public jNV get() {
        return OLrzqt(this.copydefault.get());
    }

    public static jNV OLrzqt(InterfaceC23229huL interfaceC23229huL) {
        return (jNV) C58165ywD.KWHzl(RepositoryModule.OLrzqt.copydefault(interfaceC23229huL));
    }
}
