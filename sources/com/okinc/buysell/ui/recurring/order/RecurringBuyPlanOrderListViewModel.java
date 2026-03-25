package com.okinc.buysell.ui.recurring.order;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C31943mJr;
import o.C3722ArM;
import o.C3879AuK;
import o.C3961Avp;
import o.InterfaceC3963Avr;
import o.lzE;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanOrderListViewModel extends C31943mJr {
    public final C3879AuK AEQbTJ;
    public final TaskDescription KWHzl;
    public final MutableStateFlow<C3961Avp> OLrzqt;
    public final StateFlow<C3961Avp> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C3961Avp> OLrzqt() {
        return this.copydefault;
    }

    @yCM
    public RecurringBuyPlanOrderListViewModel(@NotNull C3879AuK c3879AuK, @NotNull lzE lze) {
        Intrinsics.checkNotNullParameter(c3879AuK, "");
        Intrinsics.checkNotNullParameter(lze, "");
        this.AEQbTJ = c3879AuK;
        C3722ArM.registerFormatter(lze);
        MutableStateFlow<C3961Avp> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.copydefault = MutableStateFlow;
        TaskDescription taskDescription = new TaskDescription();
        this.KWHzl = taskDescription;
        c3879AuK.EZpvd(taskDescription);
    }

    public static final class TaskDescription implements InterfaceC3963Avr {
        public TaskDescription() {
        }

        @Override // o.InterfaceC3963Avr
        public void OLrzqt(C3961Avp c3961Avp) {
            Intrinsics.checkNotNullParameter(c3961Avp, "");
            RecurringBuyPlanOrderListViewModel.this.OLrzqt.setValue(c3961Avp);
        }
    }

    public final void EZpvd(String str) {
        C3879AuK c3879AuK = this.AEQbTJ;
        if (str == null) {
            str = "";
        }
        c3879AuK.OLrzqt(str);
    }

    public final void EZpvd() {
        this.AEQbTJ.AEQbTJ();
    }

    public final void KWHzl() {
        this.AEQbTJ.OLrzqt();
    }

    public final void gEmmrt() {
        this.AEQbTJ.copydefault();
    }

    public final void AEQbTJ() {
        this.AEQbTJ.EZpvd();
    }

    public final void copydefault() {
        this.AEQbTJ.KWHzl();
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.KWHzl(str);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }
}
