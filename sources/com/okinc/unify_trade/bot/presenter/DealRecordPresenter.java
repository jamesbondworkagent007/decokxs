package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.Transformations;
import com.okinc.components.track.TrackChannel;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.CancelSpotDcaOrderBody;
import com.okinc.unify_trade.biz.DcaTradeListResponse;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyGridTradeOrderDetailsResponse;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.bot.TradeListStatusType;
import com.okinc.unify_trade.biz.subscribe.FundingRateData;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import com.okinc.unify_trade.bot.data.DcaDetailsData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.ExpandableGridDealRecordItemData;
import com.okinc.unify_trade.bot.data.GridDealRecordArbitrageRecordHeaderData;
import com.okinc.unify_trade.bot.data.GridDealRecordSummaryHeaderData;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.bot.presenter.DealRecordPresenter;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32866mlf;
import o.C33070mpX;
import o.C33129mqd;
import o.C54263xBy;
import o.C54507xKz;
import o.C55688xof;
import o.C55804xqp;
import o.C55892xsX;
import o.C55949xtb;
import o.C55960xtm;
import o.C56033xvF;
import o.C56066xvm;
import o.C56068xvo;
import o.C56071xvr;
import o.C56143xxJ;
import o.C56180xxu;
import o.C56243xzD;
import o.C56287xzv;
import o.C56403yEb;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.pTA;
import o.xCT;
import o.xCZ;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DealRecordPresenter extends AbsPresenter {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C56180xxu AEQbTJ;
    public final LiveData<ArrayList<TransDetailsData>> AYXKKw;
    public final C56287xzv AhwBna;
    public final TradeLiveData<List<DcaTradeListResponse>> AkhnZx;
    public final TradeLiveData<C55804xqp<List<StrategyOrderBillDetailsResponse>>> AuCTel;
    public C56143xxJ DbNXlk;
    public final TradeLiveData<C55804xqp<List<StrategyGridTradeOrderDetailsResponse>>> KWHzl;
    public final MutableLiveData<StrategyResponse> OLrzqt;
    public StrategyDetailsResponse copydefault;
    public final TradeLiveData<FundingRateData> djBIcL;
    public final MediatorLiveData<C55804xqp<List<ExpandableGridDealRecordItemData>>> ejfBZ;
    public final TradeLiveData<C55804xqp<List<StrategyOrderBillDetailsResponse>>> fIwbmz;
    public final LiveData<ArrayList<DetailsData>> fJNWhG;
    public final xCZ fetchVPNInfo;
    public final xCT gEmmrt;
    public final LiveData<List<DcaDetailsData>> isConnected;
    public final C54263xBy valueOf;
    public final C56243xzD values;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCT AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ArrayList<TransDetailsData>> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCZ AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56243xzD AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55804xqp<List<StrategyOrderBillDetailsResponse>>> DbNXlk() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDetailsResponse EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<StrategyResponse> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        this.copydefault = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<FundingRateData> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56143xxJ gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediatorLiveData<C55804xqp<List<ExpandableGridDealRecordItemData>>> isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<DcaDetailsData>> valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ArrayList<DetailsData>> values() {
        return this.fJNWhG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DealRecordPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new StrategyDetailsResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
        this.gEmmrt = new xCT();
        this.KWHzl = new TradeLiveData<>();
        this.fetchVPNInfo = new xCZ();
        TradeLiveData<C55804xqp<List<StrategyOrderBillDetailsResponse>>> tradeLiveData = new TradeLiveData<>();
        this.AuCTel = tradeLiveData;
        TradeLiveData<C55804xqp<List<StrategyOrderBillDetailsResponse>>> tradeLiveData2 = new TradeLiveData<>();
        this.fIwbmz = tradeLiveData2;
        this.AYXKKw = Transformations.map(tradeLiveData2, new Function1() { // from class: o.xuv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DealRecordPresenter.copydefault(this.EZpvd, (C55804xqp) obj);
            }
        });
        this.ejfBZ = new MediatorLiveData<>();
        this.fJNWhG = Transformations.map(tradeLiveData, new Function1() { // from class: o.xuw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DealRecordPresenter.djBIcL(this.OLrzqt, (C55804xqp) obj);
            }
        });
        this.values = new C56243xzD();
        this.DbNXlk = new C56143xxJ();
        TradeLiveData<List<DcaTradeListResponse>> tradeLiveData3 = new TradeLiveData<>();
        this.AkhnZx = tradeLiveData3;
        this.isConnected = Transformations.map(tradeLiveData3, new Function1() { // from class: o.xux
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DealRecordPresenter.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        });
        this.AEQbTJ = new C56180xxu();
        this.OLrzqt = new MutableLiveData<>();
        this.AhwBna = new C56287xzv();
        this.valueOf = new C54263xBy();
        this.djBIcL = new TradeLiveData<>();
        fetchVPNInfo();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.presenter.DealRecordPresenter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final ArrayList copydefault(DealRecordPresenter dealRecordPresenter, C55804xqp c55804xqp) {
        C55960xtm c55960xtm = new C55960xtm();
        c55960xtm.OLrzqt(dealRecordPresenter.copydefault.getInstId());
        c55960xtm.AEQbTJ(dealRecordPresenter.copydefault.getOrderType());
        c55960xtm.EZpvd(dealRecordPresenter.copydefault.getAlgoId());
        Intrinsics.copydefault(c55804xqp);
        return c55960xtm.EZpvd((C55804xqp<List<StrategyOrderBillDetailsResponse>>) c55804xqp);
    }

    public static final ArrayList djBIcL(DealRecordPresenter dealRecordPresenter, C55804xqp c55804xqp) {
        C55892xsX c55892xsX = new C55892xsX();
        c55892xsX.KWHzl(dealRecordPresenter.copydefault.getOrderType());
        c55892xsX.copydefault("1");
        Intrinsics.copydefault(c55804xqp);
        return c55892xsX.KWHzl2((C55804xqp<List<StrategyOrderBillDetailsResponse>>) c55804xqp);
    }

    public static final List copydefault(DealRecordPresenter dealRecordPresenter, List list) {
        C55949xtb c55949xtb = new C55949xtb(dealRecordPresenter.copydefault.getInstId(), dealRecordPresenter.copydefault.getInstType());
        Intrinsics.copydefault(list);
        return c55949xtb.KWHzl(list);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return;
        }
        C54263xBy c54263xBy = this.valueOf;
        c54263xBy.copydefault(str);
        c54263xBy.AEQbTJ(this.djBIcL);
        xKK.Activity.execute$default(c54263xBy, 0L, 1, null);
    }

    public final void fARcdN() {
        xCT xct = this.gEmmrt;
        xct.AEQbTJ(this.KWHzl);
        xct.AEQbTJ(this.copydefault.getAlgoId());
        xct.EZpvd(this.copydefault.getInstId());
        xKK.Activity.execute$default(xct, 0L, 1, null);
    }

    public static /* synthetic */ void requestSingleGridDealRecord$default(DealRecordPresenter dealRecordPresenter, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        dealRecordPresenter.KWHzl(str, str2, str3, str4);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt(false, new StrategyOrderBillDetailsReq(this.copydefault.getAlgoId(), str2, (String) null, str, str3, (String) null, (String) null, (String) null, (String) null, str4, 484, (DefaultConstructorMarker) null));
    }

    public final void fJNWhG() {
        OLrzqt(true, new StrategyOrderBillDetailsReq(this.copydefault.getAlgoId(), "1", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.copydefault.getOrderType(), (String) null, 764, (DefaultConstructorMarker) null));
    }

    public final void copydefault(final boolean z) {
        DcaTradeListResponse dcaTradeListResponse;
        C56243xzD c56243xzD = this.values;
        c56243xzD.EZpvd(this.copydefault.getAlgoId());
        List<DcaTradeListResponse> value = this.AkhnZx.getValue();
        String cycleId = (value == null || (dcaTradeListResponse = (DcaTradeListResponse) CollectionsKt___CollectionsKt.wlaJM(value)) == null) ? null : dcaTradeListResponse.getCycleId();
        if (!Boolean.valueOf(z).booleanValue()) {
            cycleId = null;
        }
        c56243xzD.KWHzl(cycleId);
        c56243xzD.KWHzl(new Function1() { // from class: o.xuu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DealRecordPresenter.AEQbTJ(this.OLrzqt, z, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56243xzD, 0L, 1, null);
    }

    public static final Unit AEQbTJ(DealRecordPresenter dealRecordPresenter, boolean z, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        dealRecordPresenter.copydefault(z, (List<DcaTradeListResponse>) responseData.getData());
        return Unit.INSTANCE;
    }

    public final void EZpvd(final boolean z) {
        DcaTradeListResponse dcaTradeListResponse;
        C56143xxJ c56143xxJ = this.DbNXlk;
        c56143xxJ.copydefault(this.copydefault.getAlgoId());
        List<DcaTradeListResponse> value = this.AkhnZx.getValue();
        String cycleId = (value == null || (dcaTradeListResponse = (DcaTradeListResponse) CollectionsKt___CollectionsKt.wlaJM(value)) == null) ? null : dcaTradeListResponse.getCycleId();
        if (!Boolean.valueOf(z).booleanValue()) {
            cycleId = null;
        }
        c56143xxJ.EZpvd(cycleId);
        c56143xxJ.KWHzl(new Function1() { // from class: o.xut
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DealRecordPresenter.KWHzl(this.KWHzl, z, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56143xxJ, 0L, 1, null);
    }

    public static final Unit KWHzl(DealRecordPresenter dealRecordPresenter, boolean z, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        dealRecordPresenter.copydefault(z, (List<DcaTradeListResponse>) responseData.getData());
        return Unit.INSTANCE;
    }

    public final void copydefault(boolean z, List<DcaTradeListResponse> list) {
        List<DcaTradeListResponse> arrayList;
        if (z) {
            List<DcaTradeListResponse> value = this.AkhnZx.getValue();
            if (value == null) {
                value = yDY.AhwBna();
            }
            arrayList = CollectionsKt___CollectionsKt.fJNWhG((Collection) value);
        } else {
            arrayList = new ArrayList<>();
        }
        if (list == null) {
            list = yDY.AhwBna();
        }
        arrayList.addAll(list);
        this.AkhnZx.setValue(arrayList);
    }

    public final void OLrzqt(boolean z, StrategyOrderBillDetailsReq strategyOrderBillDetailsReq) {
        xCZ xcz = this.fetchVPNInfo;
        xcz.AEQbTJ(z ? this.AuCTel : this.fIwbmz);
        xcz.OLrzqt(strategyOrderBillDetailsReq);
        xKK.Activity.execute$default(xcz, 0L, 1, null);
    }

    public final ItemData OLrzqt(@NotNull BenefitDetails benefitDetails) {
        Intrinsics.checkNotNullParameter(benefitDetails, "");
        return new ItemData(C33070mpX.AYXKKw(C55688xof.Application.getSmallIconBitmap), (String) null, false, benefitDetails.getFundingFeeColor(), (String) null, (String) null, false, false, (String) null, false, true, "show_funding_fee", (String) null, false, benefitDetails.getFundingFee(), (String) null, 0, false, (String) null, (String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (String) null, (String) null, 16757750, (DefaultConstructorMarker) null);
    }

    public final GridDealRecordSummaryHeaderData djBIcL() {
        String strOLrzqt = OLrzqt(this.copydefault.getAvgDailyArbitrageNum());
        String strOLrzqt2 = OLrzqt(this.copydefault.getTradeNum());
        String strOLrzqt3 = OLrzqt(this.copydefault.getArbitrageNum());
        String orderType = this.copydefault.getOrderType();
        if (Intrinsics.EZpvd((Object) orderType, (Object) "grid") || Intrinsics.EZpvd((Object) orderType, (Object) "contract_grid")) {
            return new GridDealRecordSummaryHeaderData(strOLrzqt, strOLrzqt2, strOLrzqt3);
        }
        return null;
    }

    public final GridDealRecordArbitrageRecordHeaderData KWHzl() {
        String strKWHzl = C56066xvm.EZpvd.KWHzl(this.copydefault.getInstId(), this.copydefault.getInstType(), this.copydefault.getTradeQuoteCcy());
        return new GridDealRecordArbitrageRecordHeaderData(C56033xvF.getBotPnl$default(this.copydefault.getInstId(), this.copydefault.getInstType(), this.copydefault.getGridProfit(), null, false, true, null, false, null, 2, null, 1496, null) + " " + strKWHzl, C56033xvF.OLrzqt((Object) this.copydefault.getGridProfit()));
    }

    public final String OLrzqt(String str) {
        return StringsKt__StringsKt.fARcdN((CharSequence) str) ? "--" : xMR.copydefault.copydefault(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r14.length() == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        if (r14.length() == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String OLrzqt(DealRecordPresenter dealRecordPresenter, StrategyGridTradeOrderDetailsResponse strategyGridTradeOrderDetailsResponse) {
        String strAEQbTJ;
        String strAYXKKw;
        String orderType = dealRecordPresenter.copydefault.getOrderType();
        TradeListStatusType.Grid grid = null;
        if (Intrinsics.EZpvd((Object) orderType, (Object) "grid")) {
            Iterator<TradeListStatusType.Grid> it = TradeListStatusType.Grid.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TradeListStatusType.Grid next = it.next();
                if (Intrinsics.EZpvd((Object) next.getCode(), (Object) strategyGridTradeOrderDetailsResponse.getStatus())) {
                    grid = next;
                    break;
                }
            }
            TradeListStatusType.Grid grid2 = grid;
            if (grid2 == null) {
                grid2 = TradeListStatusType.Grid.GroupCompleted;
            }
            Integer label = grid2.getLabel();
            if (label != null && (strAYXKKw = C33070mpX.AYXKKw(label.intValue())) != null) {
                return strAYXKKw;
            }
            strAEQbTJ = C56068xvo.copydefault.AEQbTJ(dealRecordPresenter.copydefault.getInstId(), dealRecordPresenter.copydefault.getInstType(), strategyGridTradeOrderDetailsResponse.getTotalPnl(), (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null);
        } else {
            if (!Intrinsics.EZpvd((Object) orderType, (Object) "contract_grid")) {
                return "";
            }
            if (!C33129mqd.OLrzqt((Object) C33129mqd.EZpvd(strategyGridTradeOrderDetailsResponse.getTotalPnl()), (Object) 0)) {
                strAEQbTJ = C56068xvo.copydefault.AEQbTJ(dealRecordPresenter.copydefault.getInstId(), dealRecordPresenter.copydefault.getInstType(), strategyGridTradeOrderDetailsResponse.getTotalPnl(), (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null);
            } else {
                Iterator<TradeListStatusType.Grid> it2 = TradeListStatusType.Grid.getEntries().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TradeListStatusType.Grid next2 = it2.next();
                    if (Intrinsics.EZpvd((Object) next2.getCode(), (Object) strategyGridTradeOrderDetailsResponse.getStatus())) {
                        grid = next2;
                        break;
                    }
                }
                TradeListStatusType.Grid grid3 = grid;
                if (grid3 == null) {
                    grid3 = TradeListStatusType.Grid.GroupCompleted;
                }
                Integer label2 = grid3.getLabel();
                if (label2 != null) {
                    strAEQbTJ = C33070mpX.AYXKKw(label2.intValue());
                }
                return "--";
            }
        }
    }

    public final List<ExpandableGridDealRecordItemData> OLrzqt(@NotNull List<StrategyGridTradeOrderDetailsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (StrategyGridTradeOrderDetailsResponse strategyGridTradeOrderDetailsResponse : list) {
            String str = pTA.format$default(new Date(C33129mqd.valueOf(strategyGridTradeOrderDetailsResponse.getTradeUTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
            String strOLrzqt = OLrzqt(this, strategyGridTradeOrderDetailsResponse);
            Integer numValueOf = Integer.valueOf(C56071xvr.getRiseUpColor$default(C56071xvr.gEmmrt, 0.0f, 1, null));
            numValueOf.intValue();
            arrayList.add(new ExpandableGridDealRecordItemData(str, strOLrzqt, C33129mqd.AEQbTJ(C33129mqd.EZpvd(strategyGridTradeOrderDetailsResponse.getTotalPnl()), 0) ? numValueOf : null, strategyGridTradeOrderDetailsResponse.getGroupId(), false, null, 32, null));
        }
        return arrayList;
    }

    public final void OLrzqt(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            C32866mlf.onEvent$default("trade_strategy_grid_bill_details", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
            requestSingleGridDealRecord$default(this, str, "1", null, null, 12, null);
            return;
        }
        C55804xqp<List<ExpandableGridDealRecordItemData>> value = this.ejfBZ.getValue();
        if (value == null) {
            return;
        }
        List<ExpandableGridDealRecordItemData> listCopydefault = value.copydefault();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (ExpandableGridDealRecordItemData expandableGridDealRecordItemDataCopy$default : listCopydefault) {
            if (Intrinsics.EZpvd((Object) expandableGridDealRecordItemDataCopy$default.getGroupId(), (Object) str)) {
                expandableGridDealRecordItemDataCopy$default = ExpandableGridDealRecordItemData.copy$default(expandableGridDealRecordItemDataCopy$default, null, null, null, null, true, null, 47, null);
            }
            arrayList.add(expandableGridDealRecordItemDataCopy$default);
        }
        this.ejfBZ.setValue(new C55804xqp<>(value.OLrzqt(), arrayList, value.KWHzl(), value.AEQbTJ()));
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55804xqp<List<ExpandableGridDealRecordItemData>> value = this.ejfBZ.getValue();
        if (value == null) {
            return;
        }
        List<ExpandableGridDealRecordItemData> listCopydefault = value.copydefault();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (ExpandableGridDealRecordItemData expandableGridDealRecordItemDataCopy$default : listCopydefault) {
            if (Intrinsics.EZpvd((Object) expandableGridDealRecordItemDataCopy$default.getGroupId(), (Object) str)) {
                expandableGridDealRecordItemDataCopy$default = ExpandableGridDealRecordItemData.copy$default(expandableGridDealRecordItemDataCopy$default, null, null, null, null, false, null, 47, null);
            }
            arrayList.add(expandableGridDealRecordItemDataCopy$default);
        }
        this.ejfBZ.setValue(new C55804xqp<>(value.OLrzqt(), arrayList, value.KWHzl(), value.AEQbTJ()));
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: androidx.lifecycle.LiveData<java.util.ArrayList<com.okinc.unify_trade.bot.data.TransDetailsData>>, androidx.lifecycle.LiveData<S> */
    public final void fetchVPNInfo() {
        this.ejfBZ.addSource(this.KWHzl, new ActionBar(new Function1() { // from class: o.xuq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DealRecordPresenter.AEQbTJ(this.EZpvd, (C55804xqp) obj);
            }
        }));
        this.ejfBZ.addSource(this.AYXKKw, new ActionBar(new Function1() { // from class: o.xus
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DealRecordPresenter.copydefault(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(DealRecordPresenter dealRecordPresenter, C55804xqp c55804xqp) {
        dealRecordPresenter.ejfBZ.setValue(new C55804xqp<>(c55804xqp.OLrzqt(), dealRecordPresenter.OLrzqt((List<StrategyGridTradeOrderDetailsResponse>) c55804xqp.copydefault()), c55804xqp.KWHzl(), c55804xqp.AEQbTJ()));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(DealRecordPresenter dealRecordPresenter, ArrayList arrayList) {
        List<ExpandableGridDealRecordItemData> listCopydefault;
        String groupId;
        C55804xqp<List<ExpandableGridDealRecordItemData>> value = dealRecordPresenter.ejfBZ.getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        C55804xqp<List<ExpandableGridDealRecordItemData>> value2 = dealRecordPresenter.ejfBZ.getValue();
        if (value2 == null || (listCopydefault = value2.copydefault()) == null) {
            return Unit.INSTANCE;
        }
        Intrinsics.copydefault(arrayList);
        TransDetailsData transDetailsData = (TransDetailsData) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (transDetailsData == null || (groupId = transDetailsData.getGroupId()) == null) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (ExpandableGridDealRecordItemData expandableGridDealRecordItemDataCopy$default : listCopydefault) {
            if (Intrinsics.EZpvd((Object) expandableGridDealRecordItemDataCopy$default.getGroupId(), (Object) groupId)) {
                expandableGridDealRecordItemDataCopy$default = ExpandableGridDealRecordItemData.copy$default(expandableGridDealRecordItemDataCopy$default, null, null, null, null, true, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList), 15, null);
            }
            arrayList2.add(expandableGridDealRecordItemDataCopy$default);
        }
        dealRecordPresenter.ejfBZ.setValue(new C55804xqp<>(value.OLrzqt(), arrayList2, value.KWHzl(), value.AEQbTJ()));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(String str, String str2) {
        String orderType = this.copydefault.getOrderType();
        if (Intrinsics.EZpvd((Object) orderType, (Object) "spot_dca")) {
            C56287xzv c56287xzv = this.AhwBna;
            c56287xzv.EZpvd(new CancelSpotDcaOrderBody(str, str2));
            c56287xzv.OLrzqt(this.OLrzqt, new C54507xKz());
            xKK.Activity.execute$default(c56287xzv, 0L, 1, null);
            return;
        }
        if (Intrinsics.EZpvd((Object) orderType, (Object) "contract_dca")) {
            C56180xxu c56180xxu = this.AEQbTJ;
            c56180xxu.AEQbTJ(new EditContractDcaReq(str, null, null, null, null, null, null, str2, null, null, null, false, null, 8062, null));
            c56180xxu.OLrzqt(this.OLrzqt, new C54507xKz());
            xKK.Activity.execute$default(c56180xxu, 0L, 1, null);
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.gEmmrt, this.fetchVPNInfo, this.values, this.DbNXlk, this.AEQbTJ, this.AhwBna);
    }
}
