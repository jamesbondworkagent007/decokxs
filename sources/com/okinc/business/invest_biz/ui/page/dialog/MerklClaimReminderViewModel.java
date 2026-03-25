package com.okinc.business.invest_biz.ui.page.dialog;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C27493jwI;
import o.InterfaceC24127iVx;
import o.iDO;
import o.iTP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MerklClaimReminderViewModel extends ViewModel {
    public final StateFlow<iTP> AEQbTJ;
    public final iDO EZpvd;
    public final MutableStateFlow<iTP> OLrzqt;
    public final InterfaceC24127iVx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<iTP> KWHzl() {
        return this.AEQbTJ;
    }

    @yCM
    public MerklClaimReminderViewModel(@NotNull iDO ido, @NotNull InterfaceC24127iVx interfaceC24127iVx) {
        Intrinsics.checkNotNullParameter(ido, "");
        Intrinsics.checkNotNullParameter(interfaceC24127iVx, "");
        this.EZpvd = ido;
        this.copydefault = interfaceC24127iVx;
        MutableStateFlow<iTP> MutableStateFlow = StateFlowKt.MutableStateFlow(iTP.TaskDescription.KWHzl);
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void EZpvd(@NotNull String str, long j, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.setValue(iTP.TaskDescription.KWHzl);
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MerklClaimReminderViewModel$loadData$1(this, str, j, list, null), 3, null);
    }
}
