package o;

import com.okinc.okex.di.SupportDispatcherModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.srA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45506srA implements InterfaceC58162ywA<CoroutineDispatcher> {
    public final SupportDispatcherModule AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher get() {
        return EZpvd(this.AEQbTJ);
    }

    public static CoroutineDispatcher EZpvd(SupportDispatcherModule supportDispatcherModule) {
        return (CoroutineDispatcher) C58165ywD.KWHzl(supportDispatcherModule.AEQbTJ());
    }
}
