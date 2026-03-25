package com.okinc.im.imui.broadcastmessages.leavethischatdialog;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.messageV2.model.StringResource;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.oCY;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class LeaveThisChatDialogFragmentViewModel extends ViewModel {
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final oCY EZpvd;
    public final SharedFlow<StringResource> KWHzl;
    public final MutableSharedFlow<StringResource> OLrzqt;
    public final SharedFlow<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<StringResource> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.copydefault;
    }

    @yCM
    public LeaveThisChatDialogFragmentViewModel(@NotNull oCY ocy) {
        Intrinsics.checkNotNullParameter(ocy, "");
        this.EZpvd = ocy;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<StringResource> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
    }

    public final void copydefault(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LeaveThisChatDialogFragmentViewModel$dismiss$1(z, this, null), 3, null);
    }
}
