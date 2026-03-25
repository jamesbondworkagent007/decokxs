package o;

import com.okinc.market.quotation.data.util.TwoKeyMap;
import com.okinc.market.ticker.model.DexTickerPo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C41437qqm {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC56387yDm KWHzl;

    @yCM
    public C41437qqm(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qqs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41437qqm.copydefault();
            }
        });
    }

    public final TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo> AEQbTJ() {
        return (TwoKeyMap) this.KWHzl.getValue();
    }

    public static final TwoKeyMap copydefault() {
        return new TwoKeyMap();
    }

    public final void KWHzl(@NotNull DexTickerPo dexTickerPo) {
        Intrinsics.checkNotNullParameter(dexTickerPo, "");
        AEQbTJ().putValue(dexTickerPo, dexTickerPo);
    }

    public final TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo> EZpvd() {
        return AEQbTJ();
    }

    public final void OLrzqt() {
        AEQbTJ().clear();
    }
}
