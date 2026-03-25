package com.okinc.tradingbot.impl.botDetail.ui.eventHistory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.dto.HistoryEventsDto;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.uHA;
import o.vNB;
import o.wUL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotEventHistoryViewModel extends ViewModel {
    public final MutableStateFlow<vNB<List<HistoryEventsDto>>> AEQbTJ;
    public String EZpvd;
    public final uHA KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public String copydefault;
    public final StateFlow<vNB<List<HistoryEventsDto>>> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<List<HistoryEventsDto>>> EZpvd() {
        return this.djBIcL;
    }

    @yCM
    public BotEventHistoryViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull uHA uha) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(uha, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = uha;
        MutableStateFlow<vNB<List<HistoryEventsDto>>> MutableStateFlow = StateFlowKt.MutableStateFlow(vNB.Activity.copydefault);
        this.AEQbTJ = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static /* synthetic */ void fetchHistoryEvents$default(BotEventHistoryViewModel botEventHistoryViewModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        botEventHistoryViewModel.OLrzqt(str, str2, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wUL.safeLaunch$default(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart, kotlin.jvm.functions.Function2, int, java.lang.Object):kotlinx.coroutines.Job */
    public final void OLrzqt(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z && Intrinsics.EZpvd((Object) str, (Object) this.EZpvd) && Intrinsics.EZpvd((Object) str2, (Object) this.copydefault)) {
            return;
        }
        this.EZpvd = str;
        this.copydefault = str2;
        this.AEQbTJ.setValue(vNB.Activity.copydefault);
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new BotEventHistoryViewModel$fetchHistoryEvents$1(this, str, str2, null), 2, null);
    }

    public final void KWHzl() {
        String str;
        String str2 = this.EZpvd;
        if (str2 == null || (str = this.copydefault) == null) {
            return;
        }
        OLrzqt(str2, str, true);
    }

    public final void OLrzqt() {
        this.EZpvd = null;
        this.copydefault = null;
        this.AEQbTJ.setValue(vNB.Activity.copydefault);
    }
}
