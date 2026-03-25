package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27660jzQ implements InterfaceC58162ywA<kAM> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC23229huL> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public kAM get() {
        return AEQbTJ(this.EZpvd.get(), this.AEQbTJ.get());
    }

    public static kAM AEQbTJ(InterfaceC23229huL interfaceC23229huL, CoroutineDispatcher coroutineDispatcher) {
        return (kAM) C58165ywD.KWHzl(RepositoryModule.OLrzqt.OLrzqt(interfaceC23229huL, coroutineDispatcher));
    }
}
