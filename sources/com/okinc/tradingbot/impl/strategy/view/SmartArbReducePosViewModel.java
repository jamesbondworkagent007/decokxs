package com.okinc.tradingbot.impl.strategy.view;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.dto.EstReduceInfo;
import com.okinc.tradingbot.impl.dto.ReduceResultVo;
import com.okinc.tradingbot.impl.strategy.view.SmartArbReducePosViewModel;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C52673wUc;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.vNB;
import o.wTP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbReducePosViewModel extends ViewModel {
    public final MutableStateFlow<vNB<EstReduceInfo>> AEQbTJ;
    public final wTP AYXKKw;
    public final SavedStateHandle AhwBna;
    public final CoroutineDispatcher EZpvd;
    public final StateFlow<vNB<EstReduceInfo>> KWHzl;
    public final MutableStateFlow<vNB<ReduceResultVo>> OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final C52673wUc djBIcL;
    public final StateFlow<vNB<ReduceResultVo>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<EstReduceInfo>> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<ReduceResultVo>> KWHzl() {
        return this.gEmmrt;
    }

    @yCM
    public SmartArbReducePosViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull SavedStateHandle savedStateHandle, @NotNull wTP wtp, @NotNull C52673wUc c52673wUc) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(wtp, "");
        Intrinsics.checkNotNullParameter(c52673wUc, "");
        this.EZpvd = coroutineDispatcher;
        this.AhwBna = savedStateHandle;
        this.AYXKKw = wtp;
        this.djBIcL = c52673wUc;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbReducePosViewModel.AhwBna(this.OLrzqt);
            }
        });
        vNB.Activity activity = vNB.Activity.copydefault;
        MutableStateFlow<vNB<ReduceResultVo>> MutableStateFlow = StateFlowKt.MutableStateFlow(activity);
        this.OLrzqt = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<vNB<EstReduceInfo>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(activity);
        this.AEQbTJ = MutableStateFlow2;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public static final String AhwBna(SmartArbReducePosViewModel smartArbReducePosViewModel) {
        TacticsData tacticsData = (TacticsData) smartArbReducePosViewModel.AhwBna.get("DATA_PARAM");
        String algoId = tacticsData != null ? tacticsData.getAlgoId() : null;
        return algoId == null ? "" : algoId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String copydefault() {
        return (String) this.copydefault.getValue();
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new SmartArbReducePosViewModel$reducePosition$1(this, str, null), 2, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new SmartArbReducePosViewModel$fetchEstReduceInfo$1(this, str, null), 2, null);
    }
}
