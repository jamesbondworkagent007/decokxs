package o;

import com.okinc.business.market.di.RepositoryModule;

/* JADX INFO: renamed from: o.jzy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27694jzy implements InterfaceC58162ywA<jYG> {
    public final InterfaceC58164ywC<C27640jyx> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public jYG get() {
        return OLrzqt(this.KWHzl.get());
    }

    public static jYG OLrzqt(C27640jyx c27640jyx) {
        return (jYG) C58165ywD.KWHzl(RepositoryModule.OLrzqt.copydefault(c27640jyx));
    }
}
