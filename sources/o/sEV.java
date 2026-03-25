package o;

import com.okinc.okimcore.di.CoroutineScopeModule;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class sEV implements InterfaceC58162ywA<CoroutineScope> {
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public CoroutineScope get() {
        return EZpvd();
    }

    public static CoroutineScope EZpvd() {
        return (CoroutineScope) C58165ywD.KWHzl(CoroutineScopeModule.AEQbTJ.AEQbTJ());
    }
}
