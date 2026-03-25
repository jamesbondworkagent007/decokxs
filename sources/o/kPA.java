package o;

import com.okinc.business.trade.di.RepositoryModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes7.dex */
public final class kPA implements InterfaceC58162ywA<kYD> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC28246kUh> KWHzl;
    public final InterfaceC58164ywC<kYC> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public kYD get() {
        return copydefault(this.KWHzl.get(), this.AEQbTJ.get(), this.OLrzqt.get());
    }

    public static kYD copydefault(InterfaceC28246kUh interfaceC28246kUh, CoroutineDispatcher coroutineDispatcher, kYC kyc) {
        return (kYD) C58165ywD.KWHzl(RepositoryModule.copydefault.copydefault(interfaceC28246kUh, coroutineDispatcher, kyc));
    }
}
