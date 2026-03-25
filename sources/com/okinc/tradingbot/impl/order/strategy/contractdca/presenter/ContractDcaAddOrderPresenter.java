package com.okinc.tradingbot.impl.order.strategy.contractdca.presenter;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaAddOrderPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractDcaAvaData;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC54531xLw;
import o.AbstractC55737xpb;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C54282xCq;
import o.C54507xKz;
import o.C54536xML;
import o.C54589xNz;
import o.C54799xVt;
import o.C55688xof;
import o.C55887xsS;
import o.C56045xvR;
import o.C56148xxO;
import o.C56172xxm;
import o.C56182xxw;
import o.C56184xxy;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.uLP;
import o.xBG;
import o.xKK;
import o.xMR;
import o.xMS;
import o.xMV;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ContractDcaAddOrderPresenter extends AbsPresenter {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final C56184xxy AYXKKw;
    public final TradeLiveData<TickersData> AhwBna;
    public final C56172xxm AkhnZx;
    public String AuCTel;
    public TradeLiveData<LimitPriceData> DbNXlk;
    public final TradeLiveData<StrategyResponse> EZpvd;
    public final TradeLiveData<ContractDcaAvaData> OLrzqt;
    public final C56182xxw copydefault;
    public final C56148xxO djBIcL;
    public TacticsData ejfBZ;
    public final xBG fARcdN;
    public final TradeLiveData<String> fIwbmz;
    public AbstractC55737xpb fJNWhG;
    public final TradeLiveData<String> fetchVPNInfo;
    public final TradeLiveData<String> gEmmrt;
    public final TradeLiveData<uLP> getFieldNames;
    public final C54282xCq isConnected;
    public final StateFlow<uLP> iwGUEr;
    public final TradeLiveData<uLP> valueOf;
    public String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyResponse> AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> AkhnZx() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<uLP> AubY() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<uLP> DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56182xxw djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<LimitPriceData> ejfBZ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TickersData> fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> getFieldNames() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLP> getNewProxyInstance() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData hDKMBd() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ContractDcaAvaData> isConnected() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> uzCIH() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56184xxy values() {
        return this.AYXKKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaAddOrderPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = new C56148xxO();
        TradeLiveData<uLP> tradeLiveData = new TradeLiveData<>();
        this.valueOf = tradeLiveData;
        this.AYXKKw = new C56184xxy();
        this.OLrzqt = new TradeLiveData<>();
        this.copydefault = new C56182xxw();
        this.EZpvd = new TradeLiveData<>();
        this.isConnected = new C54282xCq();
        this.AhwBna = new TradeLiveData<>();
        this.fARcdN = new xBG();
        this.DbNXlk = new TradeLiveData<>();
        this.AkhnZx = new C56172xxm();
        TradeLiveData<uLP> tradeLiveData2 = new TradeLiveData<>();
        this.getFieldNames = tradeLiveData2;
        this.iwGUEr = FlowKt.stateIn(FlowKt.combine(FlowLiveDataConversions.asFlow(tradeLiveData), FlowLiveDataConversions.asFlow(tradeLiveData2), new ContractDcaAddOrderPresenter$totalAvailableAmountFlow$1(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getLazily(), uLP.copydefault(uLP.EZpvd("--", "--")));
        this.fetchVPNInfo = new TradeLiveData<>();
        this.fIwbmz = new TradeLiveData<>();
        this.gEmmrt = new TradeLiveData<>();
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vBY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ContractDcaAddOrderPresenter.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaAddOrderPresenter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final SwapInstrument AuCTel() {
        BizInstrument suggestedInstrument$default;
        String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsData = this.ejfBZ;
            if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
                instType = "";
            }
            TacticsData tacticsData2 = this.ejfBZ;
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType, tacticsData2 != null ? tacticsData2.getInstId() : null, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        if (suggestedInstrument$default instanceof SwapInstrument) {
            return (SwapInstrument) suggestedInstrument$default;
        }
        return null;
    }

    public final int fARcdN() {
        String instType;
        String marginDig;
        String instFamily;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            SwapInstrument swapInstrumentAuCTel = AuCTel();
            String str = "";
            if (swapInstrumentAuCTel == null || (instType = swapInstrumentAuCTel.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                SwapInstrument swapInstrumentAuCTel2 = AuCTel();
                if (swapInstrumentAuCTel2 != null && (instFamily = swapInstrumentAuCTel2.getInstFamily()) != null) {
                    str = instFamily;
                }
                IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(str);
                if (idxConfigAkhnZx != null && (marginDig = idxConfigAkhnZx.getMarginDig()) != null) {
                    return C33129mqd.AhwBna(marginDig);
                }
            }
        }
        return 2;
    }

    public final int iwGUEr() {
        String instType;
        String instFamily;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsData = this.ejfBZ;
            String str = "";
            if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                SwapInstrument swapInstrumentAuCTel = AuCTel();
                if (swapInstrumentAuCTel != null && (instFamily = swapInstrumentAuCTel.getInstFamily()) != null) {
                    str = instFamily;
                }
                String strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(str);
                if (strFIwbmz != null) {
                    return C33129mqd.AhwBna(strFIwbmz);
                }
            }
        }
        return 8;
    }

    public final String fIwbmz() {
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        TacticsData tacticsData = this.ejfBZ;
        String instId = tacticsData != null ? tacticsData.getInstId() : null;
        TacticsData tacticsData2 = this.ejfBZ;
        return C54799xVt.getTitleByIdAndType$default(c54799xVt, instId, tacticsData2 != null ? tacticsData2.getInstType() : null, false, false, 12, null);
    }

    public final String fJNWhG() {
        TacticsData tacticsData = this.ejfBZ;
        if (Intrinsics.EZpvd((Object) (tacticsData != null ? tacticsData.getDirection() : null), (Object) "long")) {
            LimitPriceData value = this.DbNXlk.getValue();
            if (value != null) {
                return value.getBuyLmt();
            }
            return null;
        }
        LimitPriceData value2 = this.DbNXlk.getValue();
        if (value2 != null) {
            return value2.getSellLmt();
        }
        return null;
    }

    public final C55887xsS gEmmrt() {
        return (C55887xsS) this.AEQbTJ.getValue();
    }

    public static final C55887xsS AEQbTJ(ContractDcaAddOrderPresenter contractDcaAddOrderPresenter) {
        TacticsData tacticsData = contractDcaAddOrderPresenter.ejfBZ;
        String instId = tacticsData != null ? tacticsData.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        C55887xsS c55887xsS = new C55887xsS("FUTURES", instId);
        TacticsData tacticsData2 = contractDcaAddOrderPresenter.ejfBZ;
        c55887xsS.gEmmrt(tacticsData2 != null ? tacticsData2.getTradeQuoteCcy() : null);
        return c55887xsS;
    }

    public final String wlaJM() {
        return gEmmrt().AEQbTJ("contract_dca");
    }

    public final void OLrzqt(TacticsData tacticsData) {
        this.ejfBZ = tacticsData;
        KWHzl();
        valueOf();
        AYXKKw();
        zsXlph();
        AEQbTJ();
    }

    public final void KWHzl() {
        C56148xxO c56148xxO = this.djBIcL;
        TacticsData tacticsData = this.ejfBZ;
        c56148xxO.EZpvd(tacticsData != null ? tacticsData.getAlgoId() : null);
        c56148xxO.djBIcL();
        c56148xxO.OLrzqt(this.valueOf, new StateListAnimator());
        xKK.Activity.execute$default(c56148xxO, 0L, 1, null);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends ContractDcaAvaData>, uLP> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* synthetic */ uLP KWHzl(List<? extends ContractDcaAvaData> list) {
            return uLP.copydefault(copydefault(list));
        }

        public Pair<? extends String, ? extends String> copydefault(List<ContractDcaAvaData> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ContractDcaAvaData contractDcaAvaData = (ContractDcaAvaData) CollectionsKt___CollectionsKt.firstOrNull(list);
            String acctAvail = contractDcaAvaData != null ? contractDcaAvaData.getAcctAvail() : null;
            return uLP.EZpvd(ContractDcaAddOrderPresenter.this.OLrzqt(acctAvail == null ? "" : acctAvail), acctAvail != null ? acctAvail : "");
        }
    }

    public final void valueOf() {
        String instId;
        xBG xbg = this.fARcdN;
        TacticsData tacticsData = this.ejfBZ;
        if (tacticsData == null || (instId = tacticsData.getInstId()) == null) {
            instId = "";
        }
        xbg.copydefault(instId);
        xbg.AEQbTJ(this.DbNXlk);
        xKK.Activity.execute$default(xbg, 0L, 1, null);
    }

    private final void zsXlph() {
        String instId;
        C54282xCq c54282xCq = this.isConnected;
        TacticsData tacticsData = this.ejfBZ;
        if (tacticsData == null || (instId = tacticsData.getInstId()) == null) {
            instId = "";
        }
        c54282xCq.AEQbTJ(instId);
        c54282xCq.djBIcL();
        c54282xCq.OLrzqt(this.AhwBna, new C54507xKz());
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
    }

    public final void AYXKKw() {
        C56172xxm c56172xxm = this.AkhnZx;
        TacticsData tacticsData = this.ejfBZ;
        String instId = tacticsData != null ? tacticsData.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        c56172xxm.AEQbTJ(instId);
        c56172xxm.EZpvd(wlaJM());
        c56172xxm.copydefault("cross");
        c56172xxm.OLrzqt("long_short_mode");
        c56172xxm.KWHzl("1");
        c56172xxm.KWHzl(Boolean.FALSE);
        c56172xxm.OLrzqt(this.getFieldNames, new Application());
        xKK.Activity.execute$default(c56172xxm, 0L, 1, null);
    }

    public static final class Application implements InterfaceC54501xKt<List<? extends MaxAvailableResp>, uLP> {
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* synthetic */ uLP KWHzl(List<? extends MaxAvailableResp> list) {
            return uLP.copydefault(copydefault(list));
        }

        public Pair<? extends String, ? extends String> copydefault(List<MaxAvailableResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            MaxAvailableResp maxAvailableResp = (MaxAvailableResp) CollectionsKt___CollectionsKt.firstOrNull(list);
            String quoteMax = maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null;
            String str = quoteMax != null ? quoteMax : "";
            return uLP.EZpvd(ContractDcaAddOrderPresenter.this.OLrzqt(str), str);
        }
    }

    public final void AEQbTJ(String str) {
        String strValueOf;
        String originalLevel;
        String originalLevel2;
        TacticsData tacticsData = this.ejfBZ;
        String direction = tacticsData != null ? tacticsData.getDirection() : null;
        if (Intrinsics.EZpvd((Object) direction, (Object) "long")) {
            strValueOf = C33129mqd.AEQbTJ(fJNWhG(), 0) ? Double.valueOf(Math.min(C33129mqd.AEQbTJ(str), C33129mqd.AEQbTJ(fJNWhG()))) : str;
        } else {
            strValueOf = Intrinsics.EZpvd((Object) direction, (Object) "short") ? Double.valueOf(Math.max(C33129mqd.AEQbTJ(str), C33129mqd.AEQbTJ(fJNWhG()))) : "";
        }
        TacticsData tacticsData2 = this.ejfBZ;
        String strAddS$default = C33129mqd.addS$default(C33129mqd.mulS$default("0.001", (tacticsData2 == null || (originalLevel2 = tacticsData2.getOriginalLevel()) == null) ? "1" : originalLevel2, null, null, null, 14, null), 1, null, null, null, 14, null);
        C56045xvR c56045xvR = C56045xvR.KWHzl;
        SwapInstrument swapInstrumentAuCTel = AuCTel();
        String minSize = swapInstrumentAuCTel != null ? swapInstrumentAuCTel.getMinSize() : null;
        SwapInstrument swapInstrumentAuCTel2 = AuCTel();
        String ctVal = swapInstrumentAuCTel2 != null ? swapInstrumentAuCTel2.getCtVal() : null;
        String strGEmmrt = C33129mqd.gEmmrt(strValueOf);
        TacticsData tacticsData3 = this.ejfBZ;
        this.fetchVPNInfo.postValue(C33129mqd.formatS$default(c56045xvR.AEQbTJ(minSize, ctVal, strGEmmrt, (tacticsData3 == null || (originalLevel = tacticsData3.getOriginalLevel()) == null) ? "1" : originalLevel, strAddS$default), Integer.valueOf(fARcdN()), null, RoundingMode.UP, 2, null));
    }

    public final Pair<Boolean, String> AEQbTJ(String str, @NotNull String str2) {
        Integer numValueOf;
        Object liqPx;
        Object slPx;
        String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zAEQbTJ = false;
        if (C33129mqd.valueOf(str, 0)) {
            numValueOf = Integer.valueOf(C55688xof.Application.getGmsPickeractivity_release);
            strAYXKKw = "0";
        } else {
            TacticsData tacticsData = this.ejfBZ;
            if (Intrinsics.EZpvd((Object) (tacticsData != null ? tacticsData.getDirection() : null), (Object) "long")) {
                TacticsData tacticsData2 = this.ejfBZ;
                double dAEQbTJ = C33129mqd.AEQbTJ(tacticsData2 != null ? tacticsData2.getLiqPx() : null);
                TacticsData tacticsData3 = this.ejfBZ;
                zAEQbTJ = C33129mqd.AEQbTJ(str, Double.valueOf(Math.max(dAEQbTJ, C33129mqd.AEQbTJ(tacticsData3 != null ? tacticsData3.getSlPx() : null))));
                TacticsData tacticsData4 = this.ejfBZ;
                String liqPx2 = tacticsData4 != null ? tacticsData4.getLiqPx() : null;
                TacticsData tacticsData5 = this.ejfBZ;
                strAYXKKw = C33129mqd.AEQbTJ(liqPx2, tacticsData5 != null ? tacticsData5.getSlPx() : null) ? C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickVisualMediaCompanionExternalSyntheticApiModelOutline0) : C33070mpX.AYXKKw(C55688xof.Application.gbIfDn);
                numValueOf = Integer.valueOf(C55688xof.Application.getGmsPickeractivity_release);
            } else {
                TacticsData tacticsData6 = this.ejfBZ;
                if (Intrinsics.EZpvd((Object) (tacticsData6 != null ? tacticsData6.getDirection() : null), (Object) "short")) {
                    TacticsData tacticsData7 = this.ejfBZ;
                    if (C33129mqd.valueOf(tacticsData7 != null ? tacticsData7.getLiqPx() : null, 0)) {
                        liqPx = Integer.MAX_VALUE;
                    } else {
                        TacticsData tacticsData8 = this.ejfBZ;
                        liqPx = tacticsData8 != null ? tacticsData8.getLiqPx() : null;
                    }
                    TacticsData tacticsData9 = this.ejfBZ;
                    if (C33129mqd.valueOf(tacticsData9 != null ? tacticsData9.getSlPx() : null, 0)) {
                        slPx = Integer.MAX_VALUE;
                    } else {
                        TacticsData tacticsData10 = this.ejfBZ;
                        slPx = tacticsData10 != null ? tacticsData10.getSlPx() : null;
                    }
                    boolean zGEmmrt = C33129mqd.gEmmrt(str, Double.valueOf(Math.min(C33129mqd.AEQbTJ(liqPx), C33129mqd.AEQbTJ(slPx))));
                    strAYXKKw = C33129mqd.gEmmrt(liqPx, slPx) ? C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickVisualMediaCompanionExternalSyntheticApiModelOutline0) : C33070mpX.AYXKKw(C55688xof.Application.gbIfDn);
                    zAEQbTJ = zGEmmrt;
                    numValueOf = Integer.valueOf(C55688xof.Application.isSystemFallbackPickerAvailableactivity_release);
                } else {
                    zAEQbTJ = true;
                    numValueOf = null;
                }
            }
        }
        return C56390yDp.OLrzqt(Boolean.valueOf(zAEQbTJ), numValueOf != null ? C33069mpW.copydefault(numValueOf.intValue(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName1", str2), C56390yDp.OLrzqt("fieldName2", strAYXKKw))) : null);
    }

    public final Pair<Boolean, String> OLrzqt(String str, @NotNull String str2) {
        String quoteSymbol;
        String str3 = "";
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zCopydefault = C33129mqd.copydefault(str, this.fetchVPNInfo.getValue());
        int i = C55688xof.Application.UlJrfe;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("fieldName", str2);
        xMR xmr = xMR.copydefault;
        String value = this.fetchVPNInfo.getValue();
        if (value == null) {
            value = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("minValue", xmr.copydefault(value));
        SwapInstrument swapInstrumentAuCTel = AuCTel();
        if (swapInstrumentAuCTel != null && (quoteSymbol = swapInstrumentAuCTel.getQuoteSymbol()) != null) {
            str3 = quoteSymbol;
        }
        pairArr[2] = C56390yDp.OLrzqt("unit", str3);
        return C56390yDp.OLrzqt(Boolean.valueOf(zCopydefault), C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AuCTel = str;
        this.values = str2;
        if (EZpvd()) {
            copydefault();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd() {
        String strOLrzqt;
        TacticsData tacticsData = this.ejfBZ;
        String direction = tacticsData != null ? tacticsData.getDirection() : null;
        if (Intrinsics.EZpvd((Object) direction, (Object) "long")) {
            strOLrzqt = C33129mqd.AEQbTJ(this.AuCTel, fJNWhG()) ? OLrzqt() : "";
        } else if (Intrinsics.EZpvd((Object) direction, (Object) "short") && C33129mqd.gEmmrt(this.AuCTel, fJNWhG())) {
            strOLrzqt = OLrzqt();
        }
        this.gEmmrt.postValue(strOLrzqt);
        return strOLrzqt.length() == 0;
    }

    public final String OLrzqt() {
        TacticsData tacticsData = this.ejfBZ;
        String direction = tacticsData != null ? tacticsData.getDirection() : null;
        if (Intrinsics.EZpvd((Object) direction, (Object) "long")) {
            int i = C55688xof.Application.setEnabledChangedCallbackactivity_release;
            xMR xmr = xMR.copydefault;
            String strFJNWhG = fJNWhG();
            String strCopydefault = xmr.copydefault(strFJNWhG != null ? strFJNWhG : "");
            SwapInstrument swapInstrumentAuCTel = AuCTel();
            return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("highestPrice", strCopydefault + " " + (swapInstrumentAuCTel != null ? swapInstrumentAuCTel.getQuoteSymbol() : null))));
        }
        if (!Intrinsics.EZpvd((Object) direction, (Object) "short")) {
            return "";
        }
        int i2 = C55688xof.Application.accessgetOnBackPressedCallbacksp;
        xMR xmr2 = xMR.copydefault;
        String strFJNWhG2 = fJNWhG();
        String strCopydefault2 = xmr2.copydefault(strFJNWhG2 != null ? strFJNWhG2 : "");
        SwapInstrument swapInstrumentAuCTel2 = AuCTel();
        return C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("minimumPrice", strCopydefault2 + " " + (swapInstrumentAuCTel2 != null ? swapInstrumentAuCTel2.getQuoteSymbol() : null))));
    }

    public final void copydefault() {
        C56184xxy c56184xxy = this.AYXKKw;
        TacticsData tacticsData = this.ejfBZ;
        c56184xxy.OLrzqt(tacticsData != null ? tacticsData.getAlgoId() : null, this.AuCTel, this.values);
        c56184xxy.djBIcL();
        c56184xxy.OLrzqt(this.OLrzqt, new C54507xKz());
        xKK.Activity.execute$default(c56184xxy, 0L, 1, null);
    }

    public final void EZpvd(String str) {
        C56182xxw c56182xxw = this.copydefault;
        TacticsData tacticsData = this.ejfBZ;
        c56182xxw.KWHzl(new EditContractDcaReq(tacticsData != null ? tacticsData.getAlgoId() : null, null, null, null, this.AuCTel, this.values, str, null, null, null, null, false, null, 8078, null));
        c56182xxw.djBIcL();
        c56182xxw.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c56182xxw, 0L, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ() {
        xMS xmsGEmmrt;
        String instId;
        String instType;
        String instFamily;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        String str = "";
        if (interfaceC54581xNrOLrzqt == null) {
            xmsGEmmrt = null;
        } else {
            TacticsData tacticsData = this.ejfBZ;
            if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                SwapInstrument swapInstrumentAuCTel = AuCTel();
                if (swapInstrumentAuCTel == null || (instFamily = swapInstrumentAuCTel.getInstFamily()) == null) {
                    instFamily = "";
                }
                xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
            }
        }
        TacticsData tacticsData2 = this.ejfBZ;
        if (tacticsData2 != null && (instId = tacticsData2.getInstId()) != null) {
            str = instId;
        }
        ActionBar actionBar = new ActionBar(xmsGEmmrt, str, C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis())));
        this.fJNWhG = actionBar;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.copydefault(yDY.copydefault(actionBar));
        }
    }

    public static final class ActionBar extends AbstractC55737xpb {
        public final /* synthetic */ xMS copydefault;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
        @Override // o.AbstractC55755xpt
        public /* bridge */ /* synthetic */ void EZpvd(List<? extends TickersData> list, String str) {
            EZpvd2((List<TickersData>) list, str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(xMS xms, String str, String str2) {
            super(str, str2, false, 4, null);
            this.copydefault = xms;
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(List<TickersData> list, String str) {
            String strAhwBna;
            String str2 = "";
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (tickersData != null) {
                ContractDcaAddOrderPresenter contractDcaAddOrderPresenter = ContractDcaAddOrderPresenter.this;
                xMS xms = this.copydefault;
                if (tickersData.getLast().length() == 0) {
                    return;
                }
                TradeLiveData<String> fieldNames = contractDcaAddOrderPresenter.getFieldNames();
                xMR xmr = xMR.copydefault;
                if (xms != null && (strAhwBna = xms.AhwBna(tickersData.getLast())) != null) {
                    str2 = strAhwBna;
                }
                fieldNames.postValue(xmr.EZpvd(str2, C33129mqd.AhwBna(xms != null ? xms.AEQbTJ() : null)));
            }
        }
    }

    public final void zLjUOn() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        AbstractC55737xpb abstractC55737xpb = this.fJNWhG;
        if (abstractC55737xpb == null || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.AEQbTJ(yDY.copydefault(abstractC55737xpb));
    }

    public final String AEQbTJ(float f) {
        return C33129mqd.mulS$default(Float.valueOf(f), uLP.KWHzl(this.iwGUEr.getValue().OLrzqt()), null, null, null, 14, null);
    }

    public final String OLrzqt(String str) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        String safeString$default = null;
        if (interfaceC54581xNrCopydefault != null) {
            SwapInstrument swapInstrumentAuCTel = AuCTel();
            String instType = swapInstrumentAuCTel != null ? swapInstrumentAuCTel.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                SwapInstrument swapInstrumentAuCTel2 = AuCTel();
                String instFamily = swapInstrumentAuCTel2 != null ? swapInstrumentAuCTel2.getInstFamily() : null;
                if (instFamily == null) {
                    instFamily = "";
                }
                xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
                if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
                }
            }
        }
        return safeString$default == null ? "" : safeString$default;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.djBIcL, this.AYXKKw, this.copydefault, this.isConnected, this.fARcdN, this.AkhnZx);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        zLjUOn();
    }
}
