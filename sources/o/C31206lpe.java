package o;

import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.common.LimitOrderStrategyType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31206lpe {
    public static final C31206lpe EZpvd = new C31206lpe();

    private C31206lpe() {
    }

    public final LimitOrderStrategyType copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return i == AdvancedTradeType.Companion.EZpvd(AdvancedTradeType.BUY).getType() ? C23313hvq.OLrzqt(str, str2) ? LimitOrderStrategyType.CHASE_HIGH : LimitOrderStrategyType.BUY_DIP : C23313hvq.EZpvd(str, str2) ? LimitOrderStrategyType.TAKE_PROFIT : LimitOrderStrategyType.STOP_LOSS;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (i == AdvancedTradeType.Companion.EZpvd(AdvancedTradeType.BUY).getType()) {
            if (C23313hvq.OLrzqt(str, str2)) {
                java.lang.String string = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.onSkipToQueueItem);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            java.lang.String string2 = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.MediaSessionCompatMediaSessionImpl);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (C23313hvq.EZpvd(str, str2)) {
            java.lang.String string3 = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.MediaSessionCompatCallbackStubApi24);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        java.lang.String string4 = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.MediaSessionCompatCallbackStubApi21);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        return string4;
    }

    public final java.lang.String AEQbTJ(int i) {
        int value = LimitOrderStrategyType.Companion.KWHzl(i).getValue();
        if (value == LimitOrderStrategyType.CHASE_HIGH.getValue()) {
            java.lang.String string = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.onSkipToPrevious);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        if (value == LimitOrderStrategyType.BUY_DIP.getValue()) {
            java.lang.String string2 = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.onStop);
            Intrinsics.copydefault((java.lang.Object) string2);
            return string2;
        }
        if (value == LimitOrderStrategyType.TAKE_PROFIT.getValue()) {
            java.lang.String string3 = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.setSessionImpl);
            Intrinsics.copydefault((java.lang.Object) string3);
            return string3;
        }
        if (value != LimitOrderStrategyType.STOP_LOSS.getValue()) {
            return "";
        }
        java.lang.String string4 = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.MediaSessionCompatCallbackCallbackHandler);
        Intrinsics.copydefault((java.lang.Object) string4);
        return string4;
    }

    public final java.lang.String copydefault(int i) {
        if (i == OrderStrategyType.Tp.getType()) {
            java.lang.String string = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.setSessionImpl);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        if (i != OrderStrategyType.Sl.getType()) {
            return "";
        }
        java.lang.String string2 = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.MediaSessionCompatCallbackCallbackHandler);
        Intrinsics.copydefault((java.lang.Object) string2);
        return string2;
    }

    public final boolean OLrzqt(int i) {
        int value = LimitOrderStrategyType.Companion.KWHzl(i).getValue();
        return value == LimitOrderStrategyType.CHASE_HIGH.getValue() || value == LimitOrderStrategyType.BUY_DIP.getValue();
    }
}
