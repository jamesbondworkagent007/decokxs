package com.okinc.tradingbot.impl.strategy.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.order.strategy.data.BotStopType;
import com.okinc.tradingbot.impl.strategy.viewmodel.StopBotPresenter;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.StrategyStopResponse;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33069mpW;
import o.C33070mpX;
import o.C48033uCm;
import o.C50052vAc;
import o.C50056vAg;
import o.C54215xAd;
import o.C55688xof;
import o.C55852xrk;
import o.C56033xvF;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC56387yDm;
import o.pUU;
import o.wTZ;
import o.wUL;
import o.xKK;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes11.dex */
public final class StopBotPresenter extends AbsPresenter {
    public final InterfaceC56387yDm AYXKKw;
    public final C54215xAd AhwBna;
    public final StateFlow<Application> DbNXlk;
    public final MutableStateFlow<Application> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final MutableSharedFlow<ActionBar> OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final wTZ djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final TradeLiveData<List<StrategyStopResponse>> valueOf;
    public final SharedFlow<ActionBar> values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ActionBar> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54215xAd KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<StrategyStopResponse>> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> copydefault() {
        return this.DbNXlk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public StopBotPresenter(@NotNull wTZ wtz, @NotNull android.app.Application application, @NotNull final SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(wtz, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = wtz;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wTB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StopBotPresenter.AhwBna(savedStateHandle);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.wTG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StopBotPresenter.djBIcL(savedStateHandle);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wTI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StopBotPresenter.gEmmrt(savedStateHandle);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wTE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StopBotPresenter.AYXKKw(savedStateHandle);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wTH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StopBotPresenter.valueOf(savedStateHandle);
            }
        });
        MutableSharedFlow<ActionBar> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AhwBna = new C54215xAd();
        this.valueOf = new TradeLiveData<>();
        String strValueOf = valueOf();
        C55852xrk c55852xrkEZpvd = EZpvd(strValueOf == null ? "" : strValueOf, djBIcL(), gEmmrt());
        String strValueOf2 = valueOf();
        MutableStateFlow<Application> MutableStateFlow = StateFlowKt.MutableStateFlow(new Application(c55852xrkEZpvd, AEQbTJ(strValueOf2 != null ? strValueOf2 : "", djBIcL(), gEmmrt()), EZpvd()));
        this.EZpvd = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.viewmodel.StopBotPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final String valueOf() {
        return (String) this.copydefault.getValue();
    }

    public static final String AhwBna(SavedStateHandle savedStateHandle) {
        return (String) savedStateHandle.get("bot_type");
    }

    private final String djBIcL() {
        return (String) this.isConnected.getValue();
    }

    public static final String djBIcL(SavedStateHandle savedStateHandle) {
        return (String) savedStateHandle.get("trade_symbol");
    }

    private final String gEmmrt() {
        return (String) this.KWHzl.getValue();
    }

    public static final String gEmmrt(SavedStateHandle savedStateHandle) {
        return (String) savedStateHandle.get("bot_name");
    }

    private final String AhwBna() {
        return (String) this.gEmmrt.getValue();
    }

    public static final String AYXKKw(SavedStateHandle savedStateHandle) {
        return (String) savedStateHandle.get("inst_id");
    }

    private final String AYXKKw() {
        return (String) this.AYXKKw.getValue();
    }

    public static final String valueOf(SavedStateHandle savedStateHandle) {
        return (String) savedStateHandle.get("inst_type");
    }

    private final void KWHzl(StrategyStopReq strategyStopReq) {
        C54215xAd c54215xAd = this.AhwBna;
        c54215xAd.AEQbTJ(this.valueOf);
        c54215xAd.copydefault(C56402yEa.EZpvd(strategyStopReq));
        xKK.Activity.execute$default(c54215xAd, 0L, 1, null);
    }

    public final void EZpvd(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        pUU.EZpvd("StopBotPresenter", "trigger action: " + stateListAnimator);
        if (stateListAnimator instanceof StateListAnimator.Application) {
            wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new StopBotPresenter$trigger$1(this, stateListAnimator, null), 3, null);
        } else {
            if (!(stateListAnimator instanceof StateListAnimator.C0677StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            KWHzl(((StateListAnimator.C0677StateListAnimator) stateListAnimator).copydefault());
        }
    }

    public static /* synthetic */ String getTitle$default(StopBotPresenter stopBotPresenter, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return stopBotPresenter.OLrzqt(str, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r3.equals("moon_grid") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r3.equals("spot_dca") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r3.equals("grid") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r3.equals("contract_grid") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OLrzqt(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1831183611:
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.from);
                    if (str2 == null) {
                        str2 = "";
                    }
                    return C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("stgyName", str2)));
                }
                return C33070mpX.AYXKKw(C55688xof.Application.prepareFromUri);
            case -591806012:
                break;
            case -512749997:
                break;
            case 3181382:
                break;
            default:
                return C33070mpX.AYXKKw(C55688xof.Application.prepareFromUri);
        }
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.unregisterOnBackInvokedCallback), C56423yEv.EZpvd(C56390yDp.OLrzqt("botName", C56033xvF.iwGUEr(str))));
    }

    public static /* synthetic */ C55852xrk getDefaultFirstStopContent$default(StopBotPresenter stopBotPresenter, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return stopBotPresenter.EZpvd(str, str2, str3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r17.equals("moon_grid") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r17.equals("spot_dca") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r17.equals("grid") == false) goto L34;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C55852xrk EZpvd(String str, String str2, String str3) {
        switch (str.hashCode()) {
            case -1831183611:
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    return new C55852xrk(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.fromInclusive), C56423yEv.EZpvd(C56390yDp.OLrzqt("stgyName", str3 != null ? str3 : ""))), C33070mpX.AYXKKw(C55688xof.Application.FloatRange), null, 4, null);
                }
                return new C55852xrk(null, null, null, 7, null);
            case -591806012:
                break;
            case -512749997:
                if (str.equals("contract_grid")) {
                    return new C55852xrk(C33070mpX.AYXKKw(C55688xof.Application.removeQueueItemAt), C33070mpX.AYXKKw(C55688xof.Application.sendCommand), null, 4, null);
                }
                return new C55852xrk(null, null, null, 7, null);
            case 3181382:
                break;
            default:
                return new C55852xrk(null, null, null, 7, null);
        }
        return new C55852xrk(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getCallingPackage), C56423yEv.EZpvd(C56390yDp.OLrzqt("baseCcy", str2 == null ? "" : str2))), C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.addOnActiveChangeListener), C56423yEv.EZpvd(C56390yDp.OLrzqt("baseCcy", str2 != null ? str2 : ""))), null, 4, null);
    }

    public static /* synthetic */ C55852xrk getDefaultSecondStopContent$default(StopBotPresenter stopBotPresenter, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return stopBotPresenter.AEQbTJ(str, str2, str3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r17.equals("moon_grid") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r17.equals("spot_dca") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r17.equals("grid") == false) goto L34;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C55852xrk AEQbTJ(String str, String str2, String str3) {
        switch (str.hashCode()) {
            case -1831183611:
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    return new C55852xrk(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.DrawableRes), C56423yEv.EZpvd(C56390yDp.OLrzqt("stgyName", str3 != null ? str3 : ""))), C33070mpX.AYXKKw(C55688xof.Application.EmptySuper), null, 4, null);
                }
                return new C55852xrk(null, null, null, 7, null);
            case -591806012:
                break;
            case -512749997:
                if (str.equals("contract_grid")) {
                    return new C55852xrk(C33070mpX.AYXKKw(C55688xof.Application.removeQueueItem), C33070mpX.AYXKKw(C55688xof.Application.rewind), null, 4, null);
                }
                return new C55852xrk(null, null, null, 7, null);
            case 3181382:
                break;
            default:
                return new C55852xrk(null, null, null, 7, null);
        }
        return new C55852xrk(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.release), C56423yEv.EZpvd(C56390yDp.OLrzqt("baseCcy", str2 == null ? "" : str2))), C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.isActive), C56423yEv.EZpvd(C56390yDp.OLrzqt("baseCcy", str2 != null ? str2 : ""))), null, 4, null);
    }

    public final C55852xrk EZpvd() {
        return new C55852xrk(C33070mpX.AYXKKw(C55688xof.Application.MediaMetadataCompatApi21), C33070mpX.AYXKKw(C55688xof.Application.putString), null, 4, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.AhwBna);
    }

    public final Object EZpvd(Map<BotStopType, C50056vAg> map, Continuation<? super Unit> continuation) {
        if (Intrinsics.EZpvd((Object) valueOf(), (Object) TacticsType.TACTICS_GRDE.getConstant())) {
            MutableStateFlow<Application> mutableStateFlow = this.EZpvd;
            String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getCallingPackage);
            String strDjBIcL = djBIcL();
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            String strOLrzqt = C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("baseCcy", strDjBIcL)));
            BotStopType botStopType = BotStopType.StopAndSell;
            C50056vAg c50056vAg = map.get(botStopType);
            String strKWHzl = KWHzl(c50056vAg != null ? c50056vAg.KWHzl() : null);
            C50056vAg c50056vAg2 = map.get(botStopType);
            C55852xrk c55852xrk = new C55852xrk(strOLrzqt, strKWHzl, OLrzqt(c50056vAg2 != null ? c50056vAg2.copydefault() : null));
            String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.release);
            String strDjBIcL2 = djBIcL();
            String strOLrzqt2 = C33069mpW.OLrzqt(strAYXKKw2, C56423yEv.EZpvd(C56390yDp.OLrzqt("baseCcy", strDjBIcL2 != null ? strDjBIcL2 : "")));
            C50056vAg c50056vAg3 = map.get(BotStopType.StopButNotSell);
            C55852xrk c55852xrk2 = new C55852xrk(strOLrzqt2, OLrzqt(c50056vAg3 != null ? c50056vAg3.copydefault() : null), null, 4, null);
            String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.MediaMetadataCompatApi21);
            BotStopType botStopType2 = BotStopType.StopAndSellToUsdt;
            C50056vAg c50056vAg4 = map.get(botStopType2);
            String strKWHzl2 = KWHzl(c50056vAg4 != null ? c50056vAg4.KWHzl() : null);
            C50056vAg c50056vAg5 = map.get(botStopType2);
            Object objEmit = mutableStateFlow.emit(new Application(c55852xrk, c55852xrk2, new C55852xrk(strAYXKKw3, strKWHzl2, OLrzqt(c50056vAg5 != null ? c50056vAg5.copydefault() : null))), continuation);
            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final String KWHzl(List<C50052vAc> list) {
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C48033uCm.Fragment.DPVBvL), C56423yEv.EZpvd(C56390yDp.OLrzqt("sellAmount", AEQbTJ(list))));
    }

    public final String OLrzqt(List<C50052vAc> list) {
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C48033uCm.Fragment.OKSWiw), C56423yEv.EZpvd(C56390yDp.OLrzqt("returnAmount", AEQbTJ(list))));
    }

    public final String AEQbTJ(List<C50052vAc> list) {
        if (list == null) {
            return "--";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Pair pairKWHzl = ((C50052vAc) obj).KWHzl();
            sb.append(C56033xvF.fmtBotValueBySymbol$default(C50052vAc.AEQbTJ(pairKWHzl), C50052vAc.OLrzqt(pairKWHzl), RoundingMode.DOWN, true, null, false, AYXKKw(), AhwBna(), null, null, null, 1840, null));
            if (i != yDY.AuCTel(list)) {
                sb.append(" ");
                sb.append(Marker.ANY_NON_NULL_MARKER);
                sb.append(" ");
            }
            i++;
        }
        return sb.toString();
    }

    public static final class Application {
        public static final int KWHzl;
        public final C55852xrk AEQbTJ;
        public final C55852xrk EZpvd;
        public final C55852xrk OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int i = C55852xrk.copydefault;
            KWHzl = i | i | i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, C55852xrk c55852xrk, C55852xrk c55852xrk2, C55852xrk c55852xrk3, int i, Object obj) {
            if ((i & 1) != 0) {
                c55852xrk = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                c55852xrk2 = application.OLrzqt;
            }
            if ((i & 4) != 0) {
                c55852xrk3 = application.EZpvd;
            }
            return application.copydefault(c55852xrk, c55852xrk2, c55852xrk3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55852xrk AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55852xrk KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull C55852xrk c55852xrk, @NotNull C55852xrk c55852xrk2, @NotNull C55852xrk c55852xrk3) {
            Intrinsics.checkNotNullParameter(c55852xrk, "");
            Intrinsics.checkNotNullParameter(c55852xrk2, "");
            Intrinsics.checkNotNullParameter(c55852xrk3, "");
            return new Application(c55852xrk, c55852xrk2, c55852xrk3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55852xrk copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiModel(firstStopBotItemData=" + this.AEQbTJ + ", secondStopBotItemData=" + this.OLrzqt + ", stopToUsdtItemData=" + this.EZpvd + ")";
        }

        public Application(@NotNull C55852xrk c55852xrk, @NotNull C55852xrk c55852xrk2, @NotNull C55852xrk c55852xrk3) {
            Intrinsics.checkNotNullParameter(c55852xrk, "");
            Intrinsics.checkNotNullParameter(c55852xrk2, "");
            Intrinsics.checkNotNullParameter(c55852xrk3, "");
            this.AEQbTJ = c55852xrk;
            this.OLrzqt = c55852xrk2;
            this.EZpvd = c55852xrk3;
        }
    }

    public interface StateListAnimator {

        public static final class Application implements StateListAnimator {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.copydefault;
                }
                return application.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((Application) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FetchStopBotPreComputeInfo(algoId=" + this.copydefault + ")";
            }

            public Application(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.viewmodel.StopBotPresenter$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0677StateListAnimator implements StateListAnimator {
            public static final int AEQbTJ = StrategyStopReq.$stable;
            public final StrategyStopReq EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0677StateListAnimator copy$default(C0677StateListAnimator c0677StateListAnimator, StrategyStopReq strategyStopReq, int i, Object obj) {
                if ((i & 1) != 0) {
                    strategyStopReq = c0677StateListAnimator.EZpvd;
                }
                return c0677StateListAnimator.copydefault(strategyStopReq);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0677StateListAnimator copydefault(@NotNull StrategyStopReq strategyStopReq) {
                Intrinsics.checkNotNullParameter(strategyStopReq, "");
                return new C0677StateListAnimator(strategyStopReq);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StrategyStopReq copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0677StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((C0677StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StopBot(req=" + this.EZpvd + ")";
            }

            public C0677StateListAnimator(@NotNull StrategyStopReq strategyStopReq) {
                Intrinsics.checkNotNullParameter(strategyStopReq, "");
                this.EZpvd = strategyStopReq;
            }
        }
    }

    public interface ActionBar {

        public static final class Application implements ActionBar {
            public final String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.EZpvd;
                }
                return application.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowErrorToast(message=" + this.EZpvd + ")";
            }

            public Application(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }
    }
}
