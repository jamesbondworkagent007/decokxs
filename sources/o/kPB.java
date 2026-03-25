package o;

import com.okinc.business.trade.di.RepositoryModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes7.dex */
public final class kPB implements InterfaceC58162ywA<kYE> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC28372kYz> KWHzl;
    public final InterfaceC58164ywC<InterfaceC28370kYx> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public kYE get() {
        return copydefault(this.KWHzl.get(), this.OLrzqt.get(), this.AEQbTJ.get());
    }

    public static kYE copydefault(InterfaceC28372kYz interfaceC28372kYz, InterfaceC28370kYx interfaceC28370kYx, CoroutineDispatcher coroutineDispatcher) {
        return (kYE) C58165ywD.KWHzl(RepositoryModule.copydefault.OLrzqt(interfaceC28372kYz, interfaceC28370kYx, coroutineDispatcher));
    }
}
