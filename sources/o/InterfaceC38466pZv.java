package o;

import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pZv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC38466pZv {
    void AEQbTJ();

    void AEQbTJ(@NotNull TradeCoinInfo tradeCoinInfo, int i, @NotNull java.lang.String str);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, PeriodEnum periodEnum);

    void AEQbTJ(boolean z);

    void EZpvd();

    void EZpvd(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str);

    void KWHzl(@NotNull java.lang.String str);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    java.lang.Object OLrzqt(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull Continuation<? super Unit> continuation);

    void OLrzqt();

    void copydefault(@NotNull DexInstrument dexInstrument, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Boolean bool);

    void copydefault(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void copydefault(@NotNull java.lang.String str);

    void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    /* JADX INFO: renamed from: o.pZv$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ void trackClickDexInstrument$default(InterfaceC38466pZv interfaceC38466pZv, DexInstrument dexInstrument, int i, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackClickDexInstrument");
            }
            if ((i2 & 16) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            interfaceC38466pZv.copydefault(dexInstrument, i, str, str2, bool);
        }

        public static /* synthetic */ java.lang.Object trackMarketFullPageView$default(InterfaceC38466pZv interfaceC38466pZv, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackMarketFullPageView");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            java.lang.String str4 = str;
            if ((i & 8) != 0) {
                z = false;
            }
            return interfaceC38466pZv.OLrzqt(str4, str2, str3, z, continuation);
        }

        public static /* synthetic */ void trackListFilterItemClick$default(InterfaceC38466pZv interfaceC38466pZv, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, PeriodEnum periodEnum, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackListFilterItemClick");
            }
            interfaceC38466pZv.AEQbTJ(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : periodEnum);
        }
    }
}
