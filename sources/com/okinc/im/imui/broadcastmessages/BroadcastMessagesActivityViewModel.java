package com.okinc.im.imui.broadcastmessages;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C35772oDc;
import o.C35774oDe;
import o.oCR;
import o.oCT;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessagesActivityViewModel extends ViewModel {
    public final MutableSharedFlow<C35772oDc> AEQbTJ;
    public final SharedFlow<C35772oDc> AYXKKw;
    public final oCR AhwBna;
    public final SharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<Unit> KWHzl;
    public final SharedFlow<C35774oDe> OLrzqt;
    public final MutableSharedFlow<C35774oDe> copydefault;
    public final oCT djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C35774oDe> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C35772oDc> OLrzqt() {
        return this.AYXKKw;
    }

    @yCM
    public BroadcastMessagesActivityViewModel(@NotNull oCR ocr, @NotNull oCT oct) {
        Intrinsics.checkNotNullParameter(ocr, "");
        Intrinsics.checkNotNullParameter(oct, "");
        this.AhwBna = ocr;
        this.djBIcL = oct;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<C35774oDe> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        MutableSharedFlow<C35772oDc> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default3;
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default3;
    }

    public final void OLrzqt(String str, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BroadcastMessagesActivityViewModel$leaveBroadcastPage$1(this, str, z, null), 3, null);
    }
}
