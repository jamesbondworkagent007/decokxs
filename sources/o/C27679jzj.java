package o;

import com.okinc.business.market.di.MemeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27679jzj implements InterfaceC58162ywA<InterfaceC28656ker> {
    public final InterfaceC58164ywC<InterfaceC23229huL> AEQbTJ;
    public final InterfaceC58164ywC<CoroutineDispatcher> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC28656ker get() {
        return EZpvd(this.AEQbTJ.get(), this.EZpvd.get());
    }

    public static InterfaceC28656ker EZpvd(InterfaceC23229huL interfaceC23229huL, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC28656ker) C58165ywD.KWHzl(MemeModule.EZpvd.copydefault(interfaceC23229huL, coroutineDispatcher));
    }
}
