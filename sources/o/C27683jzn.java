package o;

import com.okinc.business.market.di.MemeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27683jzn implements InterfaceC58162ywA<InterfaceC28781khJ> {
    public final InterfaceC58164ywC<InterfaceC23229huL> EZpvd;
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC28781khJ get() {
        return OLrzqt(this.EZpvd.get(), this.KWHzl.get());
    }

    public static InterfaceC28781khJ OLrzqt(InterfaceC23229huL interfaceC23229huL, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC28781khJ) C58165ywD.KWHzl(MemeModule.EZpvd.OLrzqt(interfaceC23229huL, coroutineDispatcher));
    }
}
