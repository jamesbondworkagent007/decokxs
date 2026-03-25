package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.dto.MarginUsage;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.model.GridMarginUsageViewModel$getMarginUsage$1;
import com.okinc.unify_trade.biz.ContractGridReq;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.vNB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vTC extends ViewModel {
    public final C52671wUa AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final StateFlow<vNB<java.util.List<MarginUsage>>> OLrzqt;
    public final MutableStateFlow<vNB<java.util.List<MarginUsage>>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<java.util.List<MarginUsage>>> AEQbTJ() {
        return this.OLrzqt;
    }

    public vTC(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C52671wUa c52671wUa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c52671wUa, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = c52671wUa;
        MutableStateFlow<vNB<java.util.List<MarginUsage>>> MutableStateFlow = StateFlowKt.MutableStateFlow(vNB.Activity.copydefault);
        this.copydefault = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new GridMarginUsageViewModel$getMarginUsage$1(this, str, contractGridReq, null), 2, null);
    }
}
