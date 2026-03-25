package o;

import com.okinc.business.market.features.meme.domain.di.MemeV2Module;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.keR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28630keR implements InterfaceC58162ywA<InterfaceC28693kfb> {
    public final InterfaceC58164ywC<InterfaceC23229huL> KWHzl;
    public final InterfaceC58164ywC<CoroutineDispatcher> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC28693kfb get() {
        return KWHzl(this.KWHzl.get(), this.copydefault.get());
    }

    public static InterfaceC28693kfb KWHzl(InterfaceC23229huL interfaceC23229huL, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC28693kfb) C58165ywD.KWHzl(MemeV2Module.OLrzqt.KWHzl(interfaceC23229huL, coroutineDispatcher));
    }
}
