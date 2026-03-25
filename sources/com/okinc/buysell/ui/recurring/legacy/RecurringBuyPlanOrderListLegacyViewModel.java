package com.okinc.buysell.ui.recurring.legacy;

import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C31658lzf;
import o.C31943mJr;
import o.InterfaceC30284lSr;
import o.lPO;
import o.mHM;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanOrderListLegacyViewModel extends C31943mJr {
    public final List<mHM> AYXKKw;
    public final C31658lzf AhwBna;
    public final MutableStateFlow<InterfaceC30284lSr> EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public int copydefault;
    public String djBIcL;
    public final StateFlow<InterfaceC30284lSr> gEmmrt;
    public final lPO valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC30284lSr> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(String str) {
        if (str == null) {
            str = "";
        }
        this.djBIcL = str;
    }

    @yCM
    public RecurringBuyPlanOrderListLegacyViewModel(@NotNull lPO lpo, @NotNull C31658lzf c31658lzf) {
        Intrinsics.checkNotNullParameter(lpo, "");
        Intrinsics.checkNotNullParameter(c31658lzf, "");
        this.valueOf = lpo;
        this.AhwBna = c31658lzf;
        this.djBIcL = "";
        this.AYXKKw = new ArrayList();
        this.copydefault = 1;
        this.KWHzl = true;
        MutableStateFlow<InterfaceC30284lSr> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC30284lSr.TaskDescription.KWHzl);
        this.EZpvd = MutableStateFlow;
        this.gEmmrt = MutableStateFlow;
    }

    public final void KWHzl() {
        this.AYXKKw.clear();
        this.copydefault = 1;
        this.KWHzl = true;
        this.EZpvd.setValue(InterfaceC30284lSr.TaskDescription.KWHzl);
        copydefault();
    }

    public final void AEQbTJ() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        copydefault();
    }

    public final void copydefault() {
        if (this.KWHzl) {
            InterfaceC30284lSr value = this.EZpvd.getValue();
            InterfaceC30284lSr.Activity activity = value instanceof InterfaceC30284lSr.Activity ? (InterfaceC30284lSr.Activity) value : null;
            if (activity == null || !activity.KWHzl()) {
                if (this.copydefault != 1) {
                    copydefault(true);
                }
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RecurringBuyPlanOrderListLegacyViewModel$loadNextOrderPage$1(this, null), 3, null);
            }
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanOrderListLegacyViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(boolean z) {
        InterfaceC30284lSr value;
        InterfaceC30284lSr interfaceC30284lSrCopy$default;
        MutableStateFlow<InterfaceC30284lSr> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            interfaceC30284lSrCopy$default = value;
            if (interfaceC30284lSrCopy$default instanceof InterfaceC30284lSr.Activity) {
                interfaceC30284lSrCopy$default = InterfaceC30284lSr.Activity.copy$default((InterfaceC30284lSr.Activity) interfaceC30284lSrCopy$default, null, z, 1, null);
            }
        } while (!mutableStateFlow.compareAndSet(value, interfaceC30284lSrCopy$default));
    }
}
