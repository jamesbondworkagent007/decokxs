package o;

import com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wCH extends uLN<Unit> {
    public final StateFlow<java.lang.Boolean> EZpvd;
    public final MutableStateFlow<java.lang.Boolean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> OLrzqt() {
        return this.EZpvd;
    }

    public wCH() {
        MutableStateFlow<java.lang.Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(boolean z) {
        this.OLrzqt.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void AEQbTJ(SmartEarnParamsCheckUseCase.Result result, @NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        this.OLrzqt.setValue(java.lang.Boolean.valueOf((result instanceof SmartEarnParamsCheckUseCase.Result.Success) && EZpvd(tacticsData) == null));
    }

    public final java.lang.Integer EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        BotVo bot = tacticsData.getBot();
        if (Intrinsics.EZpvd((java.lang.Object) (bot != null ? bot.getCompliancePauseDisplayType() : null), (java.lang.Object) "compliancePause")) {
            return java.lang.Integer.valueOf(C55688xof.Application.getPlaybackSpeed);
        }
        if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), (java.lang.Object) "pause")) {
            return java.lang.Integer.valueOf(C55688xof.Application.getBitmap);
        }
        return null;
    }
}
