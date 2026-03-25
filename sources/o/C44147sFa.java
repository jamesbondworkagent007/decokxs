package o;

import com.okinc.okimcore.di.DispatchersModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.sFa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44147sFa implements InterfaceC58162ywA<CoroutineDispatcher> {
    public final DispatchersModule OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher get() {
        return AEQbTJ(this.OLrzqt);
    }

    public static CoroutineDispatcher AEQbTJ(DispatchersModule dispatchersModule) {
        return (CoroutineDispatcher) C58165ywD.KWHzl(dispatchersModule.OLrzqt());
    }
}
