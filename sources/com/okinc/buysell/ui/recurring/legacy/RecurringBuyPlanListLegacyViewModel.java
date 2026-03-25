package com.okinc.buysell.ui.recurring.legacy;

import androidx.lifecycle.ViewModelKt;
import com.okinc.components.track.TrackChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C30271lSe;
import o.C30273lSg;
import o.C31654lzb;
import o.C31943mJr;
import o.C32866mlf;
import o.InterfaceC30270lSd;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanListLegacyViewModel extends C31943mJr {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public String AEQbTJ;
    public final List<C30273lSg> AYXKKw;
    public String AhwBna;
    public String DbNXlk;
    public final MutableStateFlow<InterfaceC30270lSd> EZpvd;
    public boolean OLrzqt;
    public boolean copydefault;
    public final C31654lzb djBIcL;
    public final C30271lSe gEmmrt;
    public final StateFlow<InterfaceC30270lSd> isConnected;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        this.AEQbTJ = str;
        if (str2 == null) {
            str2 = "";
        }
        this.AhwBna = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.DbNXlk = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC30270lSd> OLrzqt() {
        return this.isConnected;
    }

    @yCM
    public RecurringBuyPlanListLegacyViewModel(@NotNull C31654lzb c31654lzb, @NotNull C30271lSe c30271lSe) {
        Intrinsics.checkNotNullParameter(c31654lzb, "");
        Intrinsics.checkNotNullParameter(c30271lSe, "");
        this.djBIcL = c31654lzb;
        this.gEmmrt = c30271lSe;
        this.AEQbTJ = "";
        this.AhwBna = "";
        this.DbNXlk = "";
        this.AYXKKw = new ArrayList();
        this.valueOf = 1;
        this.OLrzqt = true;
        MutableStateFlow<InterfaceC30270lSd> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC30270lSd.Application.EZpvd);
        this.EZpvd = MutableStateFlow;
        this.isConnected = MutableStateFlow;
    }

    public final void KWHzl() {
        this.AYXKKw.clear();
        this.valueOf = 1;
        this.OLrzqt = true;
        this.EZpvd.setValue(InterfaceC30270lSd.Application.EZpvd);
        copydefault();
    }

    public final void EZpvd() {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        copydefault();
    }

    public final void copydefault() {
        if (this.OLrzqt) {
            InterfaceC30270lSd value = this.EZpvd.getValue();
            InterfaceC30270lSd.TaskDescription taskDescription = value instanceof InterfaceC30270lSd.TaskDescription ? (InterfaceC30270lSd.TaskDescription) value : null;
            if (taskDescription == null || !taskDescription.OLrzqt()) {
                if (this.valueOf != 1) {
                    copydefault(true);
                }
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RecurringBuyPlanListLegacyViewModel$loadNextPlanPage$1(this, null), 3, null);
            }
        }
    }

    public final void AEQbTJ() {
        C32866mlf.onEvent$default("SimpleTrade_RecurringBuy_OrderList_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(boolean z) {
        InterfaceC30270lSd value;
        InterfaceC30270lSd interfaceC30270lSdCopy$default;
        MutableStateFlow<InterfaceC30270lSd> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            interfaceC30270lSdCopy$default = value;
            if (interfaceC30270lSdCopy$default instanceof InterfaceC30270lSd.TaskDescription) {
                interfaceC30270lSdCopy$default = InterfaceC30270lSd.TaskDescription.copy$default((InterfaceC30270lSd.TaskDescription) interfaceC30270lSdCopy$default, null, z, 1, null);
            }
        } while (!mutableStateFlow.compareAndSet(value, interfaceC30270lSdCopy$default));
    }
}
