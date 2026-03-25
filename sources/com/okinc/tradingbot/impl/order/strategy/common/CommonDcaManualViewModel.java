package com.okinc.tradingbot.impl.order.strategy.common;

import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.vNB;
import o.wTJ;
import o.wTR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class CommonDcaManualViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<vNB<ArrayList<DcaPreviewOrderInfo>>> AEQbTJ;
    public final StateFlow<vNB<ArrayList<DcaPreviewOrderInfo>>> EZpvd;
    public final wTR KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<ArrayList<DcaPreviewOrderInfo>>> KWHzl() {
        return this.EZpvd;
    }

    @yCM
    public CommonDcaManualViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull wTR wtr) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(wtr, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = wtr;
        MutableStateFlow<vNB<ArrayList<DcaPreviewOrderInfo>>> MutableStateFlow = StateFlowKt.MutableStateFlow(vNB.Activity.copydefault);
        this.AEQbTJ = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void copydefault(@NotNull wTJ wtj) {
        Intrinsics.checkNotNullParameter(wtj, "");
        this.AEQbTJ.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new CommonDcaManualViewModel$fetchPreviewData$1(this, wtj, null), 2, null);
    }
}
