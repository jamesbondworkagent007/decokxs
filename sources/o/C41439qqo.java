package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C41439qqo {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC56387yDm OLrzqt;

    @yCM
    public C41439qqo(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41439qqo.copydefault();
            }
        });
    }

    public final ConcurrentHashMap<java.lang.String, TickersData> AEQbTJ() {
        return (ConcurrentHashMap) this.OLrzqt.getValue();
    }

    public static final ConcurrentHashMap copydefault() {
        return new ConcurrentHashMap();
    }

    public final TickersData OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ().get(str);
    }

    public final void OLrzqt(@NotNull java.util.Map<java.lang.String, TickersData> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AEQbTJ().putAll(map);
    }

    public final java.util.Map<java.lang.String, TickersData> KWHzl() {
        return AEQbTJ();
    }
}
