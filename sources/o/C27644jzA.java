package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27644jzA implements InterfaceC58162ywA<jYA> {
    public final InterfaceC58164ywC<InterfaceC23229huL> AEQbTJ;
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;
    public final InterfaceC58164ywC<C27640jyx> OLrzqt;
    public final InterfaceC58164ywC<C26285jYu> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public jYA get() {
        return KWHzl(this.AEQbTJ.get(), this.copydefault.get(), this.OLrzqt.get(), this.KWHzl.get());
    }

    public static jYA KWHzl(InterfaceC23229huL interfaceC23229huL, C26285jYu c26285jYu, C27640jyx c27640jyx, CoroutineDispatcher coroutineDispatcher) {
        return (jYA) C58165ywD.KWHzl(RepositoryModule.OLrzqt.KWHzl(interfaceC23229huL, c26285jYu, c27640jyx, coroutineDispatcher));
    }
}
