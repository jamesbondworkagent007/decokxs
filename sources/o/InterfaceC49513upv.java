package o;

import com.okinc.tradeshare.api.TradeAssetPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import com.okinc.tradeshare.api.TradeKLineBar;
import com.okinc.tradeshare.api.TradePositionPlanetBean;
import com.okinc.tradeshare.api.TradeTickerChartEntry;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49513upv extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation);

    java.lang.String AEQbTJ(@NotNull java.lang.String str);

    java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z);

    java.lang.Object EZpvd(int i, java.lang.String str, @NotNull Continuation<? super Result<? extends kotlin.Pair<? extends java.util.List<TradeHisPositionPlanetBean>, java.lang.String>>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull TradeKLineBar tradeKLineBar, @NotNull Continuation<? super Result<? extends java.util.List<TradeTickerChartEntry>>> continuation);

    java.lang.String EZpvd(@NotNull java.lang.String str);

    java.lang.Object KWHzl(int i, java.lang.String str, @NotNull Continuation<? super Result<? extends kotlin.Pair<? extends java.util.List<TradePositionPlanetBean>, java.lang.String>>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TradeKLineBar tradeKLineBar, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<? extends java.util.List<TradeHisPositionHisOrderPlanetBean>>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation);

    java.lang.String KWHzl(@NotNull java.lang.String str);

    java.lang.String KWHzl(@NotNull java.lang.String str, boolean z);

    java.lang.Object OLrzqt(int i, java.lang.String str, @NotNull Continuation<? super Result<? extends kotlin.Pair<? extends java.util.List<TradeAssetPlanetBean>, java.lang.String>>> continuation);

    java.lang.String OLrzqt(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.upv$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        /* JADX INFO: renamed from: assetToPlanet-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m8777assetToPlanet0E7RQCE$default(InterfaceC49513upv interfaceC49513upv, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: assetToPlanet-0E7RQCE");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            return interfaceC49513upv.OLrzqt(i, str, continuation);
        }

        /* JADX INFO: renamed from: positionToPlanet-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m8779positionToPlanet0E7RQCE$default(InterfaceC49513upv interfaceC49513upv, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: positionToPlanet-0E7RQCE");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            return interfaceC49513upv.KWHzl(i, str, continuation);
        }

        /* JADX INFO: renamed from: historyPositionToPlanet-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m8778historyPositionToPlanet0E7RQCE$default(InterfaceC49513upv interfaceC49513upv, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: historyPositionToPlanet-0E7RQCE");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            return interfaceC49513upv.EZpvd(i, str, continuation);
        }
    }
}
