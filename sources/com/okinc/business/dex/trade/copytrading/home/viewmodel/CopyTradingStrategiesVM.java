package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.trade.copytrading.home.data.CTStrategy;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingStrategiesVM;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC20003gXh;
import o.AbstractC20007gXl;
import o.AbstractC33073mpa;
import o.C19702gMd;
import o.C19983gWo;
import o.C20013gXr;
import o.C25389ivm;
import o.C56403yEb;
import o.InterfaceC19701gMc;
import o.InterfaceC19946gVe;
import o.gLQ;
import o.gWB;
import o.gWI;
import o.gWK;
import o.gWN;
import o.gWR;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingStrategiesVM extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final gWI AEQbTJ;
    public final gWK AYXKKw;
    public String AhwBna;
    public final C20013gXr AkhnZx;
    public final C19702gMd AuCTel;
    public final gWN DbNXlk;
    public final MutableStateFlow<AbstractC20007gXl> EZpvd;
    public final MutableStateFlow<gWR> OLrzqt;
    public final MutableStateFlow<AbstractC20003gXh> copydefault;
    public final StateFlow<gWR> djBIcL;
    public final StateFlow<AbstractC20003gXh> fetchVPNInfo;
    public boolean gEmmrt;
    public final StateFlow<AbstractC20007gXl> isConnected;
    public final gWB valueOf;
    public InterfaceC19701gMc values;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TeeWsOriginData.EventType.values().length];
            try {
                iArr[TeeWsOriginData.EventType.StrategyCreateUpdate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TeeWsOriginData.EventType.StrategyOrderStatusChanged.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TeeWsOriginData.EventType.StrategyTrigger.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC20003gXh> KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<gWR> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC20007gXl> copydefault() {
        return this.isConnected;
    }

    @yCM
    public CopyTradingStrategiesVM(@NotNull gWK gwk, @NotNull C20013gXr c20013gXr, @NotNull gWB gwb, @NotNull C19702gMd c19702gMd, @NotNull gWN gwn, @NotNull gWI gwi) {
        Intrinsics.checkNotNullParameter(gwk, "");
        Intrinsics.checkNotNullParameter(c20013gXr, "");
        Intrinsics.checkNotNullParameter(gwb, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        Intrinsics.checkNotNullParameter(gwn, "");
        Intrinsics.checkNotNullParameter(gwi, "");
        this.AYXKKw = gwk;
        this.AkhnZx = c20013gXr;
        this.valueOf = gwb;
        this.AuCTel = c19702gMd;
        this.DbNXlk = gwn;
        this.AEQbTJ = gwi;
        MutableStateFlow<gWR> MutableStateFlow = StateFlowKt.MutableStateFlow(new gWR.Activity(true));
        this.OLrzqt = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC20007gXl> MutableStateFlow2 = StateFlowKt.MutableStateFlow(AbstractC20007gXl.Application.OLrzqt);
        this.EZpvd = MutableStateFlow2;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<AbstractC20003gXh> MutableStateFlow3 = StateFlowKt.MutableStateFlow(AbstractC20003gXh.ActionBar.copydefault);
        this.copydefault = MutableStateFlow3;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow3);
        this.AhwBna = "";
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingStrategiesVM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static /* synthetic */ void fetchStrategies$default(CopyTradingStrategiesVM copyTradingStrategiesVM, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        copyTradingStrategiesVM.copydefault(z, z2, z3);
    }

    public final void copydefault(boolean z, boolean z2, boolean z3) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingStrategiesVM$fetchStrategies$1(this, z, z3, z2, z ? "" : this.AhwBna, null), 3, null);
    }

    public static /* synthetic */ void getActiveStrategies$default(CopyTradingStrategiesVM copyTradingStrategiesVM, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        copyTradingStrategiesVM.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingStrategiesVM$getActiveStrategies$1(z, this, null), 3, null);
    }

    public final void copydefault(@NotNull Triple<String, String, String> triple) {
        List<C19983gWo> listOLrzqt;
        Intrinsics.checkNotNullParameter(triple, "");
        gWR value = this.OLrzqt.getValue();
        Object obj = null;
        gWR.TaskDescription taskDescription = value instanceof gWR.TaskDescription ? (gWR.TaskDescription) value : null;
        if (taskDescription == null || (listOLrzqt = taskDescription.OLrzqt()) == null) {
            return;
        }
        Iterator<T> it = listOLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.EZpvd((Object) ((C19983gWo) next).valueOf(), (Object) triple.getFirst())) {
                obj = next;
                break;
            }
        }
        if (((C19983gWo) obj) != null) {
            KWHzl(triple, !r2.djBIcL());
        }
    }

    public final void KWHzl(@NotNull Triple<String, String, String> triple, boolean z) {
        List<C19983gWo> listOLrzqt;
        Object next;
        Intrinsics.checkNotNullParameter(triple, "");
        gWR value = this.OLrzqt.getValue();
        gWR.TaskDescription taskDescription = value instanceof gWR.TaskDescription ? (gWR.TaskDescription) value : null;
        if (taskDescription != null && (listOLrzqt = taskDescription.OLrzqt()) != null) {
            Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((C19983gWo) next).valueOf(), (Object) triple.getFirst())) {
                        break;
                    }
                }
            }
            C19983gWo c19983gWo = (C19983gWo) next;
            if (c19983gWo != null && c19983gWo.djBIcL() == z) {
                return;
            }
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingStrategiesVM$updateStrategyStatus$1(this, z, triple, null), 3, null);
    }

    public final Object EZpvd(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return this.DbNXlk.EZpvd(str, continuation);
    }

    public final void EZpvd() {
        InterfaceC19701gMc interfaceC19701gMc = this.values;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.values = this.AuCTel.EZpvd(new Function1() { // from class: o.gXa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CopyTradingStrategiesVM.copydefault(this.OLrzqt, (TeeWsOriginData) obj);
            }
        });
    }

    public static final Unit copydefault(CopyTradingStrategiesVM copyTradingStrategiesVM, TeeWsOriginData teeWsOriginData) {
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        int i = StateListAnimator.OLrzqt[teeWsOriginData.getType().ordinal()];
        if (i == 1) {
            fetchStrategies$default(copyTradingStrategiesVM, true, false, false, 4, null);
        } else if (i == 2) {
            if (copyTradingStrategiesVM.OLrzqt.getValue() instanceof gWR.TaskDescription) {
                gWR value = copyTradingStrategiesVM.OLrzqt.getValue();
                gWR.TaskDescription taskDescription = value instanceof gWR.TaskDescription ? (gWR.TaskDescription) value : null;
                if (taskDescription == null) {
                    return Unit.INSTANCE;
                }
                List<C19983gWo> listOLrzqt = taskDescription.OLrzqt();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                for (C19983gWo c19983gWoKWHzl : listOLrzqt) {
                    String strValueOf = c19983gWoKWHzl.valueOf();
                    TeeWsData teeWsData = teeWsOriginData.getTeeWsData();
                    if (Intrinsics.EZpvd((Object) strValueOf, (Object) (teeWsData != null ? teeWsData.getStrategyId() : null))) {
                        StrategyStatus.TaskDescription taskDescription2 = StrategyStatus.Companion;
                        TeeWsData teeWsData2 = teeWsOriginData.getTeeWsData();
                        c19983gWoKWHzl = c19983gWoKWHzl.KWHzl((1791 & 1) != 0 ? c19983gWoKWHzl.AYXKKw : null, (1791 & 2) != 0 ? c19983gWoKWHzl.djBIcL : null, (1791 & 4) != 0 ? c19983gWoKWHzl.AEQbTJ : null, (1791 & 8) != 0 ? c19983gWoKWHzl.EZpvd : null, (1791 & 16) != 0 ? c19983gWoKWHzl.fetchVPNInfo : null, (1791 & 32) != 0 ? c19983gWoKWHzl.KWHzl : null, (1791 & 64) != 0 ? c19983gWoKWHzl.valueOf : null, (1791 & 128) != 0 ? c19983gWoKWHzl.OLrzqt : null, (1791 & 256) != 0 ? c19983gWoKWHzl.AhwBna : taskDescription2.KWHzl(teeWsData2 != null ? teeWsData2.getStatus() : 0) == StrategyStatus.Active, (1791 & 512) != 0 ? c19983gWoKWHzl.gEmmrt : false, (1791 & 1024) != 0 ? c19983gWoKWHzl.copydefault : 0L);
                    }
                    arrayList.add(c19983gWoKWHzl);
                }
                if (arrayList.isEmpty()) {
                    return Unit.INSTANCE;
                }
                copyTradingStrategiesVM.OLrzqt.setValue(new gWR.TaskDescription(arrayList, taskDescription.EZpvd()));
            }
        } else if (i == 3 && (copyTradingStrategiesVM.OLrzqt.getValue() instanceof gWR.TaskDescription)) {
            gWR value2 = copyTradingStrategiesVM.OLrzqt.getValue();
            Intrinsics.copydefault(value2, "");
            gWR.TaskDescription taskDescription3 = (gWR.TaskDescription) value2;
            List<C19983gWo> listOLrzqt2 = taskDescription3.OLrzqt();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
            for (C19983gWo c19983gWoKWHzl2 : listOLrzqt2) {
                String strValueOf2 = c19983gWoKWHzl2.valueOf();
                TeeWsData teeWsData3 = teeWsOriginData.getTeeWsData();
                if (Intrinsics.EZpvd((Object) strValueOf2, (Object) (teeWsData3 != null ? teeWsData3.getStrategyId() : null))) {
                    c19983gWoKWHzl2 = copyTradingStrategiesVM.valueOf.KWHzl(teeWsOriginData, c19983gWoKWHzl2);
                }
                arrayList2.add(c19983gWoKWHzl2);
            }
            if (arrayList2.isEmpty()) {
                return Unit.INSTANCE;
            }
            copyTradingStrategiesVM.OLrzqt.setValue(new gWR.TaskDescription(arrayList2, taskDescription3.EZpvd()));
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        InterfaceC19701gMc interfaceC19701gMc = this.values;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.values = null;
    }

    public final void gEmmrt() {
        this.EZpvd.setValue(AbstractC20007gXl.Application.OLrzqt);
    }

    public final void AEQbTJ() {
        if (!this.gEmmrt || this.AhwBna.length() <= 0) {
            return;
        }
        copydefault(false, true, true);
    }

    public final void OLrzqt(boolean z) {
        fetchStrategies$default(this, true, z, false, 4, null);
    }

    public final void KWHzl(OrderListPagerResult<CTStrategy> orderListPagerResult, boolean z, boolean z2, boolean z3, gWR gwr) {
        pUU.KWHzl("CopyTradingStrategiesVM", "fetchStrategies success: " + orderListPagerResult);
        this.AhwBna = orderListPagerResult.getCursor();
        this.gEmmrt = orderListPagerResult.getHasNext();
        if (!z3 && (z || !(gwr instanceof gWR.TaskDescription))) {
            this.OLrzqt.setValue(new gWR.TaskDescription(this.valueOf.KWHzl(orderListPagerResult.getDataList(), z2), this.gEmmrt));
        } else if (z3 && (gwr instanceof gWR.TaskDescription)) {
            this.OLrzqt.setValue(new gWR.TaskDescription(CollectionsKt___CollectionsKt.djBIcL((Collection) ((gWR.TaskDescription) gwr).OLrzqt(), (Iterable) this.valueOf.KWHzl(orderListPagerResult.getDataList(), z2)), this.gEmmrt));
        }
    }

    public final void copydefault(Throwable th, final boolean z) {
        InterfaceC19946gVe stateListAnimator;
        pUU.KWHzl("CopyTradingStrategiesVM", "fetchStrategies error: " + th.getMessage());
        MutableStateFlow<gWR> mutableStateFlow = this.OLrzqt;
        if ((th instanceof WalletJwtException) || ((th instanceof OKServerException) && (((OKServerException) th).getOrigin() instanceof WalletJwtException))) {
            stateListAnimator = new InterfaceC19946gVe.StateListAnimator(false, new Function0() { // from class: o.gWZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CopyTradingStrategiesVM.KWHzl(this.OLrzqt, z);
                }
            });
        } else {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            stateListAnimator = new InterfaceC19946gVe.Application(message);
        }
        mutableStateFlow.setValue(new gWR.ActionBar(stateListAnimator));
    }

    public static final Unit KWHzl(CopyTradingStrategiesVM copyTradingStrategiesVM, boolean z) {
        fetchStrategies$default(copyTradingStrategiesVM, true, z, false, 4, null);
        return Unit.INSTANCE;
    }

    public final boolean copydefault(gLQ glq) {
        return (glq instanceof gLQ.TaskDescription) || (glq instanceof gLQ.Application);
    }
}
