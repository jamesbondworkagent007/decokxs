package o;

import com.okinc.business.market.features.meme.domain.di.MemeV2Module;
import com.okinc.business.market.features.meme.ui.MemePumpUseCase;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.keU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28633keU implements InterfaceC58162ywA<MemePumpUseCase> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC28700kfi> AYXKKw;
    public final InterfaceC58164ywC<InterfaceC28699kfh> EZpvd;
    public final InterfaceC58164ywC<C29712kyn> KWHzl;
    public final InterfaceC58164ywC<InterfaceC28693kfb> OLrzqt;
    public final InterfaceC58164ywC<InterfaceC28692kfa> copydefault;
    public final InterfaceC58164ywC<InterfaceC28701kfj> djBIcL;
    public final InterfaceC58164ywC<InterfaceC28697kff> valueOf;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public MemePumpUseCase get() {
        return KWHzl(this.OLrzqt.get(), this.AYXKKw.get(), this.EZpvd.get(), this.djBIcL.get(), this.valueOf.get(), this.copydefault.get(), this.KWHzl.get(), this.AEQbTJ.get());
    }

    public static MemePumpUseCase KWHzl(InterfaceC28693kfb interfaceC28693kfb, InterfaceC28700kfi interfaceC28700kfi, InterfaceC28699kfh interfaceC28699kfh, InterfaceC28701kfj interfaceC28701kfj, InterfaceC28697kff interfaceC28697kff, InterfaceC28692kfa interfaceC28692kfa, C29712kyn c29712kyn, CoroutineDispatcher coroutineDispatcher) {
        return (MemePumpUseCase) C58165ywD.KWHzl(MemeV2Module.OLrzqt.EZpvd(interfaceC28693kfb, interfaceC28700kfi, interfaceC28699kfh, interfaceC28701kfj, interfaceC28697kff, interfaceC28692kfa, c29712kyn, coroutineDispatcher));
    }
}
