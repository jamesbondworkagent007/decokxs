package o;

import com.okinc.business.market.di.MemeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27680jzk implements InterfaceC58162ywA<InterfaceC28726kgH> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC23229huL> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC28726kgH get() {
        return EZpvd(this.KWHzl.get(), this.AEQbTJ.get());
    }

    public static InterfaceC28726kgH EZpvd(InterfaceC23229huL interfaceC23229huL, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC28726kgH) C58165ywD.KWHzl(MemeModule.EZpvd.EZpvd(interfaceC23229huL, coroutineDispatcher));
    }
}
