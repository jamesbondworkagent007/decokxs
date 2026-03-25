package o;

import com.okinc.market.quotation.data.model.PeriodTickersPo;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C41446qqv {
    public final InterfaceC56387yDm AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C41446qqv(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qqt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41446qqv.EZpvd();
            }
        });
    }

    private final ConcurrentHashMap<java.lang.String, PeriodTickersPo> AEQbTJ() {
        return (ConcurrentHashMap) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap EZpvd() {
        return new ConcurrentHashMap();
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull PeriodTickersPo periodTickersPo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(periodTickersPo, "");
        AEQbTJ().put(str, periodTickersPo);
    }

    public final PeriodTickersPo AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ().get(str);
    }

    public final void OLrzqt(@NotNull java.util.Map<java.lang.String, PeriodTickersPo> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AEQbTJ().putAll(map);
    }

    public final java.util.Map<java.lang.String, PeriodTickersPo> KWHzl() {
        return AEQbTJ();
    }
}
