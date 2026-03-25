package com.okinc.tradingbot.impl.aiBot.ui.order;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmSelectCryptoViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C54589xNz;
import o.C56392yDr;
import o.C56403yEb;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.uCB;
import o.uCL;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmSelectCryptoViewModel extends ViewModel {
    public final MutableStateFlow<List<uCB>> AEQbTJ;
    public final InterfaceC54581xNr AYXKKw;
    public final uCL AhwBna;
    public final MutableStateFlow<String> AkhnZx;
    public final StateFlow<Boolean> DbNXlk;
    public final Flow<List<Object>> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final MutableStateFlow<Integer> copydefault;
    public List<uCB> djBIcL;
    public final StateFlow<Integer> fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public final SavedStateHandle values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<List<Object>> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> djBIcL() {
        return this.DbNXlk;
    }

    @yCM
    public LlmSelectCryptoViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull SavedStateHandle savedStateHandle, @NotNull uCL ucl) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(ucl, "");
        this.OLrzqt = coroutineDispatcher;
        this.values = savedStateHandle;
        this.AhwBna = ucl;
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.uFS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(LlmSelectCryptoViewModel.AYXKKw(this.AEQbTJ));
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.uFQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(LlmSelectCryptoViewModel.valueOf(this.KWHzl));
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.uFP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LlmSelectCryptoViewModel.AhwBna(this.OLrzqt);
            }
        });
        this.djBIcL = yDY.AhwBna();
        MutableStateFlow<List<uCB>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow;
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.AkhnZx = MutableStateFlow2;
        this.AYXKKw = C54589xNz.EZpvd.copydefault();
        this.EZpvd = FlowKt.flowCombine(FlowKt.debounce(MutableStateFlow2, 150L), MutableStateFlow, new LlmSelectCryptoViewModel$displayList$1(null));
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.copydefault = MutableStateFlow3;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.KWHzl = MutableStateFlow4;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow4);
    }

    public static final int AYXKKw(LlmSelectCryptoViewModel llmSelectCryptoViewModel) {
        Integer num = (Integer) llmSelectCryptoViewModel.values.get("MIN_INST_SIZE");
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final int OLrzqt() {
        return ((Number) this.gEmmrt.getValue()).intValue();
    }

    public static final int valueOf(LlmSelectCryptoViewModel llmSelectCryptoViewModel) {
        Integer num = (Integer) llmSelectCryptoViewModel.values.get("MAX_INST_SIZE");
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final int copydefault() {
        return ((Number) this.valueOf.getValue()).intValue();
    }

    public static final IntRange AhwBna(LlmSelectCryptoViewModel llmSelectCryptoViewModel) {
        return new IntRange(llmSelectCryptoViewModel.OLrzqt(), llmSelectCryptoViewModel.copydefault());
    }

    public final IntRange AhwBna() {
        return (IntRange) this.isConnected.getValue();
    }

    public final void KWHzl(@NotNull Set<? extends Object> set, @NotNull String str) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new LlmSelectCryptoViewModel$init$1(this, str, set, null), 2, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx.setValue(str);
    }

    public final void OLrzqt(@NotNull uCB ucb) {
        Intrinsics.checkNotNullParameter(ucb, "");
        List<uCB> value = this.AEQbTJ.getValue();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
        for (uCB ucb2 : value) {
            arrayList.add(ucb2.copydefault((495 & 1) != 0 ? ucb2.KWHzl : null, (495 & 2) != 0 ? ucb2.AhwBna : null, (495 & 4) != 0 ? ucb2.valueOf : null, (495 & 8) != 0 ? ucb2.copydefault : null, (495 & 16) != 0 ? ucb2.AEQbTJ : ucb2.AEQbTJ() != Intrinsics.EZpvd((Object) ucb2.copydefault(), (Object) ucb.copydefault()), (495 & 32) != 0 ? ucb2.OLrzqt : null, (495 & 64) != 0 ? ucb2.EZpvd : AudioStats.AUDIO_AMPLITUDE_NONE, (495 & 128) != 0 ? ucb2.AYXKKw : null, (495 & 256) != 0 ? ucb2.gEmmrt : AudioStats.AUDIO_AMPLITUDE_NONE));
        }
        OLrzqt(arrayList);
    }

    public final void valueOf() {
        OLrzqt(this.djBIcL);
    }

    public final List<uCB> AEQbTJ() {
        List<uCB> value = this.AEQbTJ.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((uCB) obj).AEQbTJ()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void OLrzqt(List<uCB> list) {
        int i;
        boolean z = false;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((uCB) it.next()).AEQbTJ() && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        IntRange intRangeAhwBna = AhwBna();
        int iKWHzl = intRangeAhwBna.KWHzl();
        if (i <= intRangeAhwBna.copydefault() && iKWHzl <= i) {
            z = true;
        }
        this.KWHzl.setValue(Boolean.valueOf(z));
        if (z) {
            this.copydefault.setValue(Integer.valueOf(i));
            this.AEQbTJ.setValue(list);
        }
    }
}
