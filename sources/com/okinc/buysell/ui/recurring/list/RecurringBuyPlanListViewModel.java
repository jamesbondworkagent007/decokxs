package com.okinc.buysell.ui.recurring.list;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C31943mJr;
import o.C3722ArM;
import o.C3833AtR;
import o.C3871AuC;
import o.InterfaceC3869AuA;
import o.lzE;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanListViewModel extends C31943mJr {
    public final ActionBar AEQbTJ;
    public final MutableStateFlow<C3871AuC> EZpvd;
    public final C3833AtR KWHzl;
    public final StateFlow<C3871AuC> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C3871AuC> KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public RecurringBuyPlanListViewModel(@NotNull C3833AtR c3833AtR, @NotNull lzE lze) {
        Intrinsics.checkNotNullParameter(c3833AtR, "");
        Intrinsics.checkNotNullParameter(lze, "");
        this.KWHzl = c3833AtR;
        C3722ArM.registerFormatter(lze);
        MutableStateFlow<C3871AuC> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.OLrzqt = MutableStateFlow;
        ActionBar actionBar = new ActionBar();
        this.AEQbTJ = actionBar;
        c3833AtR.OLrzqt(actionBar);
    }

    public static final class ActionBar implements InterfaceC3869AuA {
        public ActionBar() {
        }

        @Override // o.InterfaceC3869AuA
        public void KWHzl(C3871AuC c3871AuC) {
            Intrinsics.checkNotNullParameter(c3871AuC, "");
            RecurringBuyPlanListViewModel.this.EZpvd.setValue(c3871AuC);
        }
    }

    public final void KWHzl(String str, String str2, String str3) {
        this.KWHzl.OLrzqt(str, str2, str3);
    }

    public final void copydefault() {
        this.KWHzl.EZpvd();
    }

    public final void EZpvd() {
        this.KWHzl.OLrzqt();
    }

    public final void AYXKKw() {
        this.KWHzl.AhwBna();
    }

    public final void AEQbTJ() {
        this.KWHzl.copydefault();
    }

    public final void OLrzqt() {
        this.KWHzl.KWHzl();
    }

    public final void gEmmrt() {
        this.KWHzl.AEQbTJ();
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.AEQbTJ(str);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }
}
