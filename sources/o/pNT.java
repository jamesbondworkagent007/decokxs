package o;

import com.okinc.lifecycle.impl.di.LinkModule;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class pNT implements InterfaceC58162ywA<CoroutineScope> {
    public final LinkModule OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public CoroutineScope get() {
        return EZpvd(this.OLrzqt);
    }

    public static CoroutineScope EZpvd(LinkModule linkModule) {
        return (CoroutineScope) C58165ywD.KWHzl(linkModule.values());
    }
}
