package o;

import com.okinc.business.dex.tee.di.TeeLimitModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
public final class gMT implements InterfaceC58162ywA<InterfaceC19729gNd> {
    public final InterfaceC58164ywC<InterfaceC23225huH> AEQbTJ;
    public final InterfaceC58164ywC<CoroutineDispatcher> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC19729gNd get() {
        return EZpvd(this.AEQbTJ.get(), this.copydefault.get());
    }

    public static InterfaceC19729gNd EZpvd(InterfaceC23225huH interfaceC23225huH, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC19729gNd) C58165ywD.KWHzl(TeeLimitModule.EZpvd.KWHzl(interfaceC23225huH, coroutineDispatcher));
    }
}
