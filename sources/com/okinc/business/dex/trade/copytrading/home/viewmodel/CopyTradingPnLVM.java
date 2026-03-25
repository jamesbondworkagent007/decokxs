package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsPnlStatDto;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingPnLVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19702gMd;
import o.C25389ivm;
import o.C33129mqd;
import o.InterfaceC19701gMc;
import o.gWG;
import o.gWJ;
import o.gWM;
import o.gWU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingPnLVM extends AbstractC33073mpa {
    public final gWG AYXKKw;
    public final gWM EZpvd;
    public final gWJ KWHzl;
    public final StateFlow<gWU> OLrzqt;
    public final MutableStateFlow<gWU> copydefault;
    public InterfaceC19701gMc gEmmrt;
    public final C19702gMd valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<gWU> KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public CopyTradingPnLVM(@NotNull gWJ gwj, @NotNull gWM gwm, @NotNull C19702gMd c19702gMd, @NotNull gWG gwg) {
        Intrinsics.checkNotNullParameter(gwj, "");
        Intrinsics.checkNotNullParameter(gwm, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        Intrinsics.checkNotNullParameter(gwg, "");
        this.KWHzl = gwj;
        this.EZpvd = gwm;
        this.valueOf = c19702gMd;
        this.AYXKKw = gwg;
        MutableStateFlow<gWU> MutableStateFlow = StateFlowKt.MutableStateFlow(gWU.TaskDescription.OLrzqt);
        this.copydefault = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingPnLVM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static /* synthetic */ void fetchCopyTradeStat$default(CopyTradingPnLVM copyTradingPnLVM, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        copyTradingPnLVM.AEQbTJ(str, z);
    }

    public final void AEQbTJ(String str, boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingPnLVM$fetchCopyTradeStat$1(z, this, str, null), 3, null);
    }

    public final void EZpvd() {
        InterfaceC19701gMc interfaceC19701gMc = this.gEmmrt;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.gEmmrt = this.valueOf.EZpvd(new Function1() { // from class: o.gWW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CopyTradingPnLVM.KWHzl(this.KWHzl, (TeeWsOriginData) obj);
            }
        });
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingPnLVM$registerPnLSocket$2(this, null), 3, null);
    }

    public static final Unit KWHzl(CopyTradingPnLVM copyTradingPnLVM, TeeWsOriginData teeWsOriginData) {
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        if (teeWsOriginData.getType() == TeeWsOriginData.EventType.PnlUpdated && (copyTradingPnLVM.copydefault.getValue() instanceof gWU.Activity)) {
            gWU value = copyTradingPnLVM.copydefault.getValue();
            Intrinsics.copydefault(value, "");
            CopyTradingPnLResponse copyTradingPnLResponseOLrzqt = ((gWU.Activity) value).OLrzqt();
            copyTradingPnLVM.copydefault.setValue(gWU.TaskDescription.OLrzqt);
            MutableStateFlow<gWU> mutableStateFlow = copyTradingPnLVM.copydefault;
            WsPnlStatDto wsPnlStatDtoAEQbTJ = copyTradingPnLVM.AYXKKw.AEQbTJ(teeWsOriginData);
            mutableStateFlow.setValue(new gWU.Activity(C33129mqd.gEmmrt(wsPnlStatDtoAEQbTJ != null ? wsPnlStatDtoAEQbTJ.getTotalPnlUsd() : null), copyTradingPnLResponseOLrzqt));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingPnLVM$unRegisterSocket$1(this, null), 3, null);
        InterfaceC19701gMc interfaceC19701gMc = this.gEmmrt;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
    }
}
