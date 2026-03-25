package com.okinc.im.imui.broadcastmessages.sendconfirmationdialog;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.messageV2.model.StringResource;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.oCX;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SendConfirmationDialogFragmentViewModel extends ViewModel {
    public final SharedFlow<StringResource> AEQbTJ;
    public final SharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<StringResource> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final oCX copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<StringResource> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public SendConfirmationDialogFragmentViewModel(@NotNull oCX ocx) {
        Intrinsics.checkNotNullParameter(ocx, "");
        this.copydefault = ocx;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<StringResource> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default2;
    }

    public final void KWHzl(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SendConfirmationDialogFragmentViewModel$dismiss$1(z, this, null), 3, null);
    }
}
