package com.okinc.business.market.features.smart_money.signal.ui.filter;

import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C56403yEb;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalMultiSelectViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<List<SignalMultiSelectUiModel>> EZpvd;
    public final StateFlow<List<SignalMultiSelectUiModel>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<SignalMultiSelectUiModel>> KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public SignalMultiSelectViewModel() {
        MutableStateFlow<List<SignalMultiSelectUiModel>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.EZpvd = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(@NotNull List<SignalMultiSelectUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.setValue(list);
    }

    public final boolean KWHzl(@NotNull String str) {
        List<SignalMultiSelectUiModel> value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<List<SignalMultiSelectUiModel>> mutableStateFlow = this.EZpvd;
        boolean zValueOf = true;
        do {
            value = mutableStateFlow.getValue();
            List<SignalMultiSelectUiModel> list = value;
            arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (SignalMultiSelectUiModel signalMultiSelectUiModelCopy$default : list) {
                if (Intrinsics.EZpvd((Object) signalMultiSelectUiModelCopy$default.copydefault(), (Object) str)) {
                    zValueOf = signalMultiSelectUiModelCopy$default.valueOf();
                    signalMultiSelectUiModelCopy$default = SignalMultiSelectUiModel.copy$default(signalMultiSelectUiModelCopy$default, null, null, null, null, !signalMultiSelectUiModelCopy$default.valueOf(), null, 47, null);
                }
                arrayList.add(signalMultiSelectUiModelCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
        return !zValueOf;
    }
}
