package o;

import androidx.lifecycle.TradeLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OrderLeadSpBean;
import com.okinc.unify_trade.biz.subscribe.EstimatedPriceData;
import com.okinc.unify_trade.biz.subscribe.FundingRateData;
import com.okinc.unify_trade.biz.subscribe.MarkPriceData;
import com.okinc.unify_trade.biz.subscribe.OptSummaryData;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import com.okinc.unify_trade.universal.data.PositionLiveDataResp;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49419uoG;
import o.AbstractC49464uoz;
import o.xKK;
import o.xMJ;

/* JADX INFO: renamed from: o.xVc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54782xVc {
    public static final C54782xVc AEQbTJ = new C54782xVc();
    public static final java.util.ArrayList<java.lang.Object> AhwBna = new java.util.ArrayList<>();
    public static final TradeLiveData<java.lang.String> djBIcL = new TradeLiveData<>();
    public static final TradeLiveData<java.lang.String> valueOf = new TradeLiveData<>();
    public static final TradeLiveData<xMJ.StateListAnimator> fetchVPNInfo = new TradeLiveData<>();
    public static final TradeLiveData<xMJ.Application> fIwbmz = new TradeLiveData<>();
    public static final TradeLiveData<xMJ.TaskDescription> OLrzqt = new TradeLiveData<>();
    public static final TradeLiveData<AbstractC49419uoG.ActionBar> KWHzl = new TradeLiveData<>();
    public static final TradeLiveData<AbstractC49464uoz.Activity> copydefault = new TradeLiveData<>();
    public static final TradeLiveData<PositionLiveDataResp> isConnected = new TradeLiveData<>();
    public static final TradeLiveData<OptSummaryData> values = new TradeLiveData<>();
    public static final TradeLiveData<TickersData> AkhnZx = new TradeLiveData<>();
    public static final TradeLiveData<kotlin.Pair<java.lang.String, java.util.List<OrderLeadSpBean>>> DbNXlk = new TradeLiveData<>();
    public static java.lang.String AYXKKw = "";
    public static final C58216yxB gEmmrt = new C58216yxB();
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<AbstractC49464uoz.Activity> AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.Application> AhwBna() {
        return fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<OptSummaryData> EZpvd() {
        return values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.StateListAnimator> KWHzl() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<AbstractC49419uoG.ActionBar> OLrzqt() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.TaskDescription> copydefault() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<PositionLiveDataResp> djBIcL() {
        return isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TickersData> gEmmrt() {
        return AkhnZx;
    }

    private C54782xVc() {
    }

    public final void AYXKKw() {
        DbNXlk();
    }

    public final void DbNXlk() {
        AYXKKw = "";
        gEmmrt.OLrzqt();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.AEQbTJ(AhwBna);
        }
        fetchVPNInfo.setValue(new xMJ.StateListAnimator("", ""));
        fIwbmz.setValue(new xMJ.Application());
        OLrzqt.setValue(new xMJ.TaskDescription());
        KWHzl.setValue(new AbstractC49419uoG.ActionBar());
        values.setValue(new OptSummaryData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4194303, (DefaultConstructorMarker) null));
        copydefault.setValue(new AbstractC49464uoz.Activity("", "", "", null, 8, null));
        isConnected.setValue(new PositionLiveDataResp(true, yDY.AhwBna(), null, 4, null));
        AkhnZx.setValue(new TickersData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 131071, (DefaultConstructorMarker) null));
        DbNXlk.setValue(new kotlin.Pair<>("", new java.util.ArrayList()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [108=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void AhwBna(BizInstrument bizInstrument) {
        DbNXlk();
        java.util.ArrayList<java.lang.Object> arrayList = AhwBna;
        arrayList.clear();
        if (bizInstrument == null || bizInstrument.getInstId().length() == 0 || Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstId(), (java.lang.Object) AYXKKw)) {
            return;
        }
        AYXKKw = bizInstrument.getInstId();
        C54782xVc c54782xVc = AEQbTJ;
        arrayList.add(c54782xVc.djBIcL(bizInstrument));
        java.lang.String instType = bizInstrument.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                if (instType.equals("MARGIN")) {
                    arrayList.add(c54782xVc.OLrzqt(bizInstrument));
                    arrayList.add(c54782xVc.copydefault(bizInstrument));
                    arrayList.addAll(c54782xVc.AEQbTJ(bizInstrument));
                }
                break;
            case -1956807563:
                if (instType.equals("OPTION")) {
                    arrayList.add(c54782xVc.copydefault(bizInstrument));
                    arrayList.add(c54782xVc.OLrzqt(bizInstrument));
                    arrayList.add(c54782xVc.KWHzl(bizInstrument));
                    arrayList.add(c54782xVc.EZpvd(bizInstrument));
                }
                break;
            case 2552066:
                if (instType.equals("SPOT")) {
                    arrayList.addAll(c54782xVc.AEQbTJ(bizInstrument));
                }
                break;
            case 2558355:
                if (instType.equals("SWAP")) {
                    arrayList.add(c54782xVc.OLrzqt(bizInstrument));
                    arrayList.add(c54782xVc.copydefault(bizInstrument));
                    arrayList.add(c54782xVc.valueOf(bizInstrument));
                    arrayList.add(c54782xVc.EZpvd(bizInstrument));
                }
                break;
            case 214415088:
                if (instType.equals("FUTURES")) {
                    arrayList.add(c54782xVc.copydefault(bizInstrument));
                    arrayList.add(c54782xVc.OLrzqt(bizInstrument));
                    arrayList.add(c54782xVc.EZpvd(bizInstrument));
                }
                break;
        }
        if (C55697xoo.OLrzqt.isConnected()) {
            arrayList.add(c54782xVc.valueOf());
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(arrayList);
        }
    }

    /* JADX INFO: renamed from: o.xVc$LoaderManager */
    public static final class LoaderManager implements InterfaceC55701xos<TickersData> {
        public final /* synthetic */ BizInstrument KWHzl;

        public LoaderManager(BizInstrument bizInstrument) {
            this.KWHzl = bizInstrument;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, TickersData tickersData, java.lang.Exception exc) {
            if (z && tickersData != null && Intrinsics.EZpvd((java.lang.Object) tickersData.getInstId(), (java.lang.Object) this.KWHzl.getInstId())) {
                C54782xVc.AEQbTJ.AhwBna().setValue(C54793xVn.OLrzqt.copydefault(tickersData));
            } else {
                C54782xVc.AEQbTJ.AhwBna().setValue(new xMJ.Application());
            }
        }
    }

    public final java.lang.Object djBIcL(BizInstrument bizInstrument) {
        C56131xwy c56131xwyFetchVPNInfo;
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt.fetchVPNInfo()) != null && (interfaceC58217yxCAEQbTJ = c56131xwyFetchVPNInfo.AEQbTJ(bizInstrument.getInstId(), new LoaderManager(bizInstrument))) != null) {
            gEmmrt.AEQbTJ(interfaceC58217yxCAEQbTJ);
        }
        return new FragmentManager(bizInstrument, bizInstrument.getInstId(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.xVc$FragmentManager */
    public static final class FragmentManager extends AbstractC55737xpb {
        public final /* synthetic */ BizInstrument KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(BizInstrument bizInstrument, java.lang.String str, java.lang.String str2) {
            super(str, str2, false, 4, null);
            this.KWHzl = bizInstrument;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<TickersData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (tickersData == null || !Intrinsics.EZpvd((java.lang.Object) this.KWHzl.getInstId(), (java.lang.Object) tickersData.getInstId())) {
                return;
            }
            C54782xVc.AEQbTJ.AhwBna().setValue(C54793xVn.OLrzqt.copydefault(tickersData));
        }
    }

    public final java.util.List<java.lang.Object> AEQbTJ(final BizInstrument bizInstrument) {
        TickerCupReq tickerCupReq = new TickerCupReq(yDY.AhwBna(bizInstrument.getTradeSymbol(), bizInstrument.getQuoteSymbol()));
        C54289xCx c54289xCx = new C54289xCx();
        c54289xCx.OLrzqt(tickerCupReq);
        c54289xCx.KWHzl(new Function1() { // from class: o.xVe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54782xVc.KWHzl(bizInstrument, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54289xCx, 0L, 1, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new StateListAnimator(bizInstrument.getQuoteSymbol(), java.lang.String.valueOf(java.lang.System.currentTimeMillis())));
        return arrayList;
    }

    /* JADX INFO: renamed from: o.xVc$StateListAnimator */
    public static final class StateListAnimator extends AbstractC55744xpi {
        public StateListAnimator(java.lang.String str, java.lang.String str2) {
            super(str, str2, false, null, 12, null);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        public void EZpvd(TickersData tickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(tickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            C54782xVc.AEQbTJ.gEmmrt().setValue(tickersData);
        }
    }

    /* JADX INFO: renamed from: o.xVc$PendingIntent */
    public static final class PendingIntent extends AbstractC55747xpl {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC55747xpl
        public java.lang.String EZpvd() {
            return "TradePageDataRepository";
        }

        public PendingIntent(java.lang.String str) {
            super("ANY", null, null, str, false, 16, null);
        }

        @Override // o.AbstractC55747xpl
        public void EZpvd(java.util.List<TradePositionData> list, java.lang.String str, java.util.List<TradeUserPositionInfo> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C54782xVc.AEQbTJ.djBIcL().setValue(new PositionLiveDataResp(true, xOJ.AEQbTJ.EZpvd(list, list2), null, 4, null));
        }

        @Override // o.AbstractC55747xpl
        public void KWHzl(java.lang.String str, java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(exc, "");
            boolean z = exc instanceof BizApiException;
            C54782xVc.AEQbTJ.djBIcL().setValue(new PositionLiveDataResp(false, yDY.AhwBna(), z ? ((BizApiException) exc).getMsg() : exc.getMessage()));
            if (z) {
                C33134mqi.AEQbTJ(((BizApiException) exc).getMsg());
            }
        }
    }

    public final java.lang.Object valueOf() {
        return new PendingIntent(C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.xVc$Dialog */
    public static final class Dialog extends AbstractC55670xoN {
        public Dialog(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        public void EZpvd(FundingRateData fundingRateData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(fundingRateData, "");
            Intrinsics.checkNotNullParameter(str, "");
            TradeLiveData<AbstractC49419uoG.ActionBar> tradeLiveDataOLrzqt = C54782xVc.AEQbTJ.OLrzqt();
            AbstractC49419uoG.ActionBar actionBar = new AbstractC49419uoG.ActionBar();
            actionBar.KWHzl(fundingRateData.getInstType());
            actionBar.OLrzqt(fundingRateData.getInstId());
            actionBar.AEQbTJ(fundingRateData.getFundingRate());
            actionBar.valueOf(fundingRateData.getNextFundingRate());
            actionBar.AhwBna(fundingRateData.getRealizedRate());
            actionBar.copydefault(fundingRateData.getFundingTime());
            actionBar.djBIcL(fundingRateData.getMinFundingRate());
            actionBar.EZpvd(fundingRateData.getMaxFundingRate());
            actionBar.isConnected(fundingRateData.getSettState());
            actionBar.DbNXlk(fundingRateData.getSettFundingRate());
            actionBar.AYXKKw(fundingRateData.getMethod());
            actionBar.gEmmrt(fundingRateData.getNextFundingTime());
            tradeLiveDataOLrzqt.setValue(actionBar);
        }
    }

    public final java.lang.Object valueOf(BizInstrument bizInstrument) {
        return new Dialog(bizInstrument.getInstId(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.xVc$Activity */
    public static final class Activity extends AbstractC55668xoL {
        public final /* synthetic */ BizInstrument AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(BizInstrument bizInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(str, null, str3, str2, 2, null);
            this.AEQbTJ = bizInstrument;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<EstimatedPriceData> list, java.lang.String str) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            BizInstrument bizInstrument = this.AEQbTJ;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((EstimatedPriceData) next).getInstId(), (java.lang.Object) bizInstrument.getInstId())) {
                        break;
                    }
                }
            }
            EstimatedPriceData estimatedPriceData = (EstimatedPriceData) next;
            if (estimatedPriceData != null) {
                C54782xVc.AEQbTJ.AEQbTJ().setValue(new AbstractC49464uoz.Activity(estimatedPriceData.getInstType(), estimatedPriceData.getInstId(), estimatedPriceData.getSettlePx(), estimatedPriceData.getSettleType()));
            }
        }
    }

    public final java.lang.Object EZpvd(BizInstrument bizInstrument) {
        return new Activity(bizInstrument, bizInstrument.getInstType(), bizInstrument.getInstId(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.xVc$Fragment */
    public static final class Fragment extends AbstractC55681xoY {
        public final /* synthetic */ BizInstrument AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(BizInstrument bizInstrument, java.lang.String str, java.lang.String str2) {
            super(null, str2, str);
            this.AEQbTJ = bizInstrument;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<OptSummaryData> list, java.lang.String str) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            BizInstrument bizInstrument = this.AEQbTJ;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((OptSummaryData) next).getInstId(), (java.lang.Object) bizInstrument.getInstId())) {
                        break;
                    }
                }
            }
            OptSummaryData optSummaryData = (OptSummaryData) next;
            if (optSummaryData != null) {
                C54782xVc.AEQbTJ.EZpvd().setValue(optSummaryData);
            }
        }
    }

    public final java.lang.Object KWHzl(BizInstrument bizInstrument) {
        return new Fragment(bizInstrument, bizInstrument.getInstId(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    public final java.lang.Object copydefault(final BizInstrument bizInstrument) {
        java.lang.String instType = Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SPOT") ? "MARGIN" : bizInstrument.getInstType();
        xBJ xbj = new xBJ();
        xbj.copydefault(instType);
        xbj.EZpvd((java.lang.String) null);
        xbj.OLrzqt(bizInstrument.getInstId());
        xbj.KWHzl(new Function1() { // from class: o.xVl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54782xVc.AEQbTJ(bizInstrument, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbj, 0L, 1, null);
        return new Application(bizInstrument.getInstId(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.xVc$Application */
    public static final class Application extends AbstractC55676xoT {
        public Application(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(MarkPriceData markPriceData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(markPriceData, "");
            Intrinsics.checkNotNullParameter(str, "");
            C54782xVc.AEQbTJ.KWHzl().setValue(xMJ.KWHzl.AEQbTJ(markPriceData));
        }
    }

    public final java.lang.Object OLrzqt(BizInstrument bizInstrument) {
        C56131xwy c56131xwyFetchVPNInfo;
        InterfaceC58217yxC interfaceC58217yxCEZpvd;
        java.lang.String underlying = bizInstrument.getUnderlying();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt.fetchVPNInfo()) != null && (interfaceC58217yxCEZpvd = c56131xwyFetchVPNInfo.EZpvd(null, underlying, new ActionBar())) != null) {
            gEmmrt.AEQbTJ(interfaceC58217yxCEZpvd);
        }
        return new TaskDescription(underlying, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.xVc$ActionBar */
    public static final class ActionBar implements InterfaceC55701xos<java.util.List<? extends IndexTickersData>> {
        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<IndexTickersData> list, java.lang.Exception exc) {
            if (z && C33129mqd.KWHzl((java.util.Collection) list)) {
                IndexTickersData indexTickersData = list != null ? list.get(0) : null;
                C54793xVn c54793xVn = C54793xVn.OLrzqt;
                Intrinsics.copydefault(indexTickersData);
                C54782xVc.AEQbTJ.copydefault().setValue(c54793xVn.KWHzl(indexTickersData));
            }
        }
    }

    /* JADX INFO: renamed from: o.xVc$TaskDescription */
    public static final class TaskDescription extends AbstractC55671xoO {
        public TaskDescription(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(IndexTickersData indexTickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(indexTickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            C54782xVc.AEQbTJ.copydefault().setValue(C54793xVn.OLrzqt.KWHzl(indexTickersData));
        }
    }

    public static final Unit KWHzl(BizInstrument bizInstrument, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            for (TickersData tickersData : (java.lang.Iterable) data) {
                if (Intrinsics.EZpvd((java.lang.Object) tickersData.getCcy(), (java.lang.Object) bizInstrument.getQuoteSymbol())) {
                    AkhnZx.setValue(tickersData);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(BizInstrument bizInstrument, ResponseData responseData) {
        java.util.List list;
        MarkPriceData markPriceData;
        MarkPriceData markPriceData2;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            java.util.List list2 = (java.util.List) responseData.getData();
            if (Intrinsics.EZpvd((java.lang.Object) ((list2 == null || (markPriceData2 = (MarkPriceData) CollectionsKt___CollectionsKt.AkhnZx(list2, 0)) == null) ? null : markPriceData2.getInstId()), (java.lang.Object) bizInstrument.getInstId()) && (list = (java.util.List) responseData.getData()) != null && (markPriceData = (MarkPriceData) CollectionsKt___CollectionsKt.AkhnZx(list, 0)) != null) {
                fetchVPNInfo.setValue(xMJ.KWHzl.AEQbTJ(markPriceData));
            }
        }
        return Unit.INSTANCE;
    }
}
