package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.strategy.viewmodel.SpotGridAddInvestmentViewModel$confirmAddInvestment$1;
import com.okinc.tradingbot.impl.strategy.viewmodel.SpotGridAddInvestmentViewModel$fetchConfirmInfo$1;
import com.okinc.unify_trade.biz.ConfirmInfoForSpotGridAddInvestment;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wTC extends AbstractC33073mpa {
    public final SharedFlow<kotlin.Pair<ConfirmInfoForSpotGridAddInvestment, java.lang.String>> AEQbTJ;
    public final SharedFlow<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd;
    public final MutableSharedFlow<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl;
    public final MutableSharedFlow<kotlin.Pair<ConfirmInfoForSpotGridAddInvestment, java.lang.String>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<kotlin.Pair<ConfirmInfoForSpotGridAddInvestment, java.lang.String>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl() {
        return this.EZpvd;
    }

    public wTC() {
        MutableSharedFlow<kotlin.Pair<ConfirmInfoForSpotGridAddInvestment, java.lang.String>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<kotlin.Pair<java.lang.Boolean, java.lang.String>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.EZpvd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    public final void copydefault(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull BizApiService bizApiService) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(bizApiService, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new SpotGridAddInvestmentViewModel$fetchConfirmInfo$1(this, bizApiService, str, str2, z, null), 2, null);
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull BizApiService bizApiService) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(bizApiService, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new SpotGridAddInvestmentViewModel$confirmAddInvestment$1(this, bizApiService, str, str2, z, null), 2, null);
        }
    }
}
