package com.okinc.business.trade.features.home.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC30505lcS;
import o.InterfaceC28149kQs;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TradeAutoSellStrategyViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<AbstractC30505lcS> AEQbTJ;
    public final InterfaceC28149kQs OLrzqt;
    public final StateFlow<AbstractC30505lcS> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC30505lcS> AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public TradeAutoSellStrategyViewModel(@NotNull InterfaceC28149kQs interfaceC28149kQs) {
        Intrinsics.checkNotNullParameter(interfaceC28149kQs, "");
        this.OLrzqt = interfaceC28149kQs;
        MutableStateFlow<AbstractC30505lcS> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC30505lcS.ActionBar.AEQbTJ);
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        OLrzqt();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.viewmodel.TradeAutoSellStrategyViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void KWHzl(@NotNull List<? extends AdvancedAutoSellStrategy> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradeAutoSellStrategyViewModel$saveStrategies$1(this, list, null), 3, null);
    }

    public final Object AEQbTJ(@NotNull Continuation<? super Boolean> continuation) {
        return this.OLrzqt.KWHzl(continuation);
    }

    public final void OLrzqt(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradeAutoSellStrategyViewModel$setAutoSellFirstUse$1(this, z, null), 3, null);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradeAutoSellStrategyViewModel$fetchRemoteStrategies$1(this, null), 3, null);
    }
}
