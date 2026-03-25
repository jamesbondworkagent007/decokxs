package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27654jzK implements InterfaceC58162ywA<InterfaceC25998jOd> {
    public final InterfaceC58164ywC<C27640jyx> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC23229huL> OLrzqt;
    public final InterfaceC58164ywC<CoroutineDispatcher> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC25998jOd get() {
        return OLrzqt(this.OLrzqt.get(), this.AEQbTJ.get(), this.copydefault.get());
    }

    public static InterfaceC25998jOd OLrzqt(InterfaceC23229huL interfaceC23229huL, C27640jyx c27640jyx, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC25998jOd) C58165ywD.KWHzl(RepositoryModule.OLrzqt.copydefault(interfaceC23229huL, c27640jyx, coroutineDispatcher));
    }
}
