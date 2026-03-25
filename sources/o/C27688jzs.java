package o;

import com.okinc.business.market.di.RepositoryModule;

/* JADX INFO: renamed from: o.jzs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27688jzs implements InterfaceC58162ywA<jQJ> {
    public final InterfaceC58164ywC<InterfaceC23229huL> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public jQJ get() {
        return OLrzqt(this.EZpvd.get());
    }

    public static jQJ OLrzqt(InterfaceC23229huL interfaceC23229huL) {
        return (jQJ) C58165ywD.KWHzl(RepositoryModule.OLrzqt.OLrzqt(interfaceC23229huL));
    }
}
