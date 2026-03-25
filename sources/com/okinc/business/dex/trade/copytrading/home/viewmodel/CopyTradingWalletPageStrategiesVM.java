package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.trade.copytrading.home.data.CTStrategy;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingWalletPageStrategiesVM;
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
import o.gWM;
import o.gWN;
import o.gWO;
import o.gWP;
import o.jBD;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingWalletPageStrategiesVM extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<gWO> AEQbTJ;
    public boolean AYXKKw;
    public final gWP AhwBna;
    public final StateFlow<AbstractC20007gXl> AkhnZx;
    public InterfaceC19701gMc AuCTel;
    public final gWK DbNXlk;
    public final MutableStateFlow<AbstractC20007gXl> EZpvd;
    public final gWI KWHzl;
    public String copydefault;
    public final gWM djBIcL;
    public final gWN ejfBZ;
    public final C19702gMd fIwbmz;
    public final gWB fetchVPNInfo;
    public final jBD gEmmrt;
    public final C20013gXr isConnected;
    public String valueOf;
    public final StateFlow<gWO> values;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<gWO> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC20007gXl> OLrzqt() {
        return this.AkhnZx;
    }

    @yCM
    public CopyTradingWalletPageStrategiesVM(@NotNull gWK gwk, @NotNull C20013gXr c20013gXr, @NotNull gWB gwb, @NotNull C19702gMd c19702gMd, @NotNull jBD jbd, @NotNull gWN gwn, @NotNull gWM gwm, @NotNull gWP gwp, @NotNull gWI gwi) {
        Intrinsics.checkNotNullParameter(gwk, "");
        Intrinsics.checkNotNullParameter(c20013gXr, "");
        Intrinsics.checkNotNullParameter(gwb, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        Intrinsics.checkNotNullParameter(jbd, "");
        Intrinsics.checkNotNullParameter(gwn, "");
        Intrinsics.checkNotNullParameter(gwm, "");
        Intrinsics.checkNotNullParameter(gwp, "");
        Intrinsics.checkNotNullParameter(gwi, "");
        this.DbNXlk = gwk;
        this.isConnected = c20013gXr;
        this.fetchVPNInfo = gwb;
        this.fIwbmz = c19702gMd;
        this.gEmmrt = jbd;
        this.ejfBZ = gwn;
        this.djBIcL = gwm;
        this.AhwBna = gwp;
        this.KWHzl = gwi;
        MutableStateFlow<gWO> MutableStateFlow = StateFlowKt.MutableStateFlow(new gWO.ActionBar(true));
        this.AEQbTJ = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC20007gXl> MutableStateFlow2 = StateFlowKt.MutableStateFlow(AbstractC20007gXl.Application.OLrzqt);
        this.EZpvd = MutableStateFlow2;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow2);
        this.copydefault = "";
        this.valueOf = "";
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingWalletPageStrategiesVM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static /* synthetic */ void fetchStrategies$default(CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        copyTradingWalletPageStrategiesVM.copydefault(z);
    }

    public final void copydefault(boolean z) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingWalletPageStrategiesVM$fetchStrategies$1(this, z, null), 3, null);
    }

    public final void AEQbTJ(@NotNull Triple<String, String, String> triple) {
        List<C19983gWo> listOLrzqt;
        Intrinsics.checkNotNullParameter(triple, "");
        gWO value = this.AEQbTJ.getValue();
        Object obj = null;
        gWO.Application application = value instanceof gWO.Application ? (gWO.Application) value : null;
        if (application == null || (listOLrzqt = application.OLrzqt()) == null) {
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
        gWO value = this.AEQbTJ.getValue();
        gWO.Application application = value instanceof gWO.Application ? (gWO.Application) value : null;
        if (application != null && (listOLrzqt = application.OLrzqt()) != null) {
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
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingWalletPageStrategiesVM$updateStrategyStatus$1(z, this, triple, null), 3, null);
    }

    public final Object OLrzqt(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return this.ejfBZ.EZpvd(str, continuation);
    }

    public final void djBIcL() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingWalletPageStrategiesVM$subscribePnl$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingWalletPageStrategiesVM$unSubscribePnl$1(this, null), 3, null);
    }

    public final void KWHzl() {
        InterfaceC19701gMc interfaceC19701gMc = this.AuCTel;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.AuCTel = this.fIwbmz.EZpvd(new Function1() { // from class: o.gXe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CopyTradingWalletPageStrategiesVM.copydefault(this.EZpvd, (TeeWsOriginData) obj);
            }
        });
    }

    public static final Unit copydefault(CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM, TeeWsOriginData teeWsOriginData) {
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        int i = TaskDescription.EZpvd[teeWsOriginData.getType().ordinal()];
        if (i == 1) {
            copyTradingWalletPageStrategiesVM.copydefault(true);
        } else if (i == 2) {
            if (copyTradingWalletPageStrategiesVM.AEQbTJ.getValue() instanceof gWO.Application) {
                gWO value = copyTradingWalletPageStrategiesVM.AEQbTJ.getValue();
                gWO.Application application = value instanceof gWO.Application ? (gWO.Application) value : null;
                if (application == null) {
                    return Unit.INSTANCE;
                }
                List<C19983gWo> listOLrzqt = application.OLrzqt();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                for (C19983gWo c19983gWoKWHzl : listOLrzqt) {
                    String strValueOf = c19983gWoKWHzl.valueOf();
                    TeeWsData teeWsData = teeWsOriginData.getTeeWsData();
                    if (Intrinsics.EZpvd((Object) strValueOf, (Object) (teeWsData != null ? teeWsData.getStrategyId() : null))) {
                        StrategyStatus.TaskDescription taskDescription = StrategyStatus.Companion;
                        TeeWsData teeWsData2 = teeWsOriginData.getTeeWsData();
                        c19983gWoKWHzl = c19983gWoKWHzl.KWHzl((1791 & 1) != 0 ? c19983gWoKWHzl.AYXKKw : null, (1791 & 2) != 0 ? c19983gWoKWHzl.djBIcL : null, (1791 & 4) != 0 ? c19983gWoKWHzl.AEQbTJ : null, (1791 & 8) != 0 ? c19983gWoKWHzl.EZpvd : null, (1791 & 16) != 0 ? c19983gWoKWHzl.fetchVPNInfo : null, (1791 & 32) != 0 ? c19983gWoKWHzl.KWHzl : null, (1791 & 64) != 0 ? c19983gWoKWHzl.valueOf : null, (1791 & 128) != 0 ? c19983gWoKWHzl.OLrzqt : null, (1791 & 256) != 0 ? c19983gWoKWHzl.AhwBna : taskDescription.KWHzl(teeWsData2 != null ? teeWsData2.getStatus() : 0) == StrategyStatus.Active, (1791 & 512) != 0 ? c19983gWoKWHzl.gEmmrt : false, (1791 & 1024) != 0 ? c19983gWoKWHzl.copydefault : 0L);
                    }
                    arrayList.add(c19983gWoKWHzl);
                }
                if (arrayList.isEmpty()) {
                    return Unit.INSTANCE;
                }
                copyTradingWalletPageStrategiesVM.AEQbTJ.setValue(new gWO.Application(arrayList));
            }
        } else if (i == 3 && (copyTradingWalletPageStrategiesVM.AEQbTJ.getValue() instanceof gWO.Application)) {
            gWO value2 = copyTradingWalletPageStrategiesVM.AEQbTJ.getValue();
            gWO.Application application2 = value2 instanceof gWO.Application ? (gWO.Application) value2 : null;
            if (application2 == null) {
                return Unit.INSTANCE;
            }
            List<C19983gWo> listOLrzqt2 = application2.OLrzqt();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
            for (C19983gWo c19983gWoKWHzl2 : listOLrzqt2) {
                String strValueOf2 = c19983gWoKWHzl2.valueOf();
                TeeWsData teeWsData3 = teeWsOriginData.getTeeWsData();
                if (Intrinsics.EZpvd((Object) strValueOf2, (Object) (teeWsData3 != null ? teeWsData3.getStrategyId() : null))) {
                    c19983gWoKWHzl2 = copyTradingWalletPageStrategiesVM.fetchVPNInfo.KWHzl(teeWsOriginData, c19983gWoKWHzl2);
                }
                arrayList2.add(c19983gWoKWHzl2);
            }
            if (arrayList2.isEmpty()) {
                return Unit.INSTANCE;
            }
            copyTradingWalletPageStrategiesVM.AEQbTJ.setValue(new gWO.Application(arrayList2));
        }
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        InterfaceC19701gMc interfaceC19701gMc = this.AuCTel;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.AuCTel = null;
    }

    public final void AhwBna() {
        this.EZpvd.setValue(AbstractC20007gXl.Application.OLrzqt);
    }

    public final void EZpvd() {
        copydefault(true);
    }

    public final void copydefault(OrderListPagerResult<CTStrategy> orderListPagerResult, boolean z) {
        pUU.KWHzl("CopyTradingStrategiesVM", "fetchStrategies success: " + orderListPagerResult);
        this.valueOf = orderListPagerResult.getCursor();
        this.AYXKKw = orderListPagerResult.getHasNext();
        if (orderListPagerResult.getDataList().isEmpty()) {
            copydefault();
            return;
        }
        gWO value = this.AEQbTJ.getValue();
        if (z || !(value instanceof gWO.Application)) {
            this.AEQbTJ.setValue(new gWO.Application(this.fetchVPNInfo.KWHzl(orderListPagerResult.getDataList(), false)));
            return;
        }
        this.AEQbTJ.setValue(new gWO.Application(CollectionsKt___CollectionsKt.djBIcL((Collection) ((gWO.Application) value).OLrzqt(), (Iterable) this.fetchVPNInfo.KWHzl(orderListPagerResult.getDataList(), false))));
    }

    public final void OLrzqt(Throwable th) {
        InterfaceC19946gVe stateListAnimator;
        pUU.KWHzl("CopyTradingStrategiesVM", "fetchStrategies error: " + th.getMessage());
        MutableStateFlow<gWO> mutableStateFlow = this.AEQbTJ;
        if ((th instanceof WalletJwtException) || ((th instanceof OKServerException) && (((OKServerException) th).getOrigin() instanceof WalletJwtException))) {
            stateListAnimator = new InterfaceC19946gVe.StateListAnimator(false, new Function0() { // from class: o.gXd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CopyTradingWalletPageStrategiesVM.DbNXlk(this.AEQbTJ);
                }
            });
        } else {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            stateListAnimator = new InterfaceC19946gVe.Application(message);
        }
        mutableStateFlow.setValue(new gWO.StateListAnimator(stateListAnimator));
    }

    public static final Unit DbNXlk(CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM) {
        copyTradingWalletPageStrategiesVM.copydefault(true);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        copydefault(true);
    }

    public final void copydefault() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingWalletPageStrategiesVM$loadKolList$1(this, null), 3, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingWalletPageStrategiesVM$trackClickEvent$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AEQbTJ(gLQ glq) {
        return (glq instanceof gLQ.TaskDescription) || (glq instanceof gLQ.Application);
    }
}
