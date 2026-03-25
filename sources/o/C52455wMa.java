package o;

import androidx.core.view.PointerIconCompat;
import com.okinc.biz.TradeType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BannerOrderDetails;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinAssetParam;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.InstrumentPercentBean;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import com.okinc.unify_trade.bot.data.TacticsCoinsInsideItemData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52455wMa implements wLZ {
    public java.lang.String AYXKKw;
    public xDM EZpvd;
    public BannerOrderDetails valueOf;
    public final C56111xwe<java.util.List<StrategyResponse>> AhwBna = new C56111xwe<>();
    public final C56111xwe<java.lang.String> gEmmrt = new C56111xwe<>();
    public final C56111xwe<java.lang.String> djBIcL = new C56111xwe<>();
    public final C54245xBg values = new C54245xBg();
    public final C56235xyw AEQbTJ = new C56235xyw();
    public final java.lang.String copydefault = "USDT";
    public final java.lang.String OLrzqt = "BTC-USDT";
    public java.util.ArrayList<java.lang.Object> KWHzl = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wLZ
    public java.lang.String AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wLZ
    public xKK AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wLZ
    public java.lang.String EZpvd() {
        return "SPOT";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wLZ
    public C56111xwe<java.lang.String> djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wLZ
    public java.lang.String fetchVPNInfo() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wLZ
    public C56111xwe<java.lang.String> gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wLZ
    public java.lang.String isConnected() {
        java.lang.String str = this.AYXKKw;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wLZ
    public C56111xwe<java.util.List<StrategyResponse>> valueOf() {
        return this.AhwBna;
    }

    public void KWHzl(android.os.Bundle bundle) {
        BannerOrderDetails bannerOrderDetails = bundle != null ? (BannerOrderDetails) bundle.getParcelable("data") : null;
        if (!(bannerOrderDetails instanceof BannerOrderDetails)) {
            bannerOrderDetails = null;
        }
        this.valueOf = bannerOrderDetails;
        this.AYXKKw = bundle != null ? bundle.getString("title") : null;
    }

    /* JADX INFO: renamed from: o.wMa$Application */
    public static final class Application extends AbstractC55740xpe {
        public Application(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(null, null, str2, str, null, null, str3, null, java.lang.Boolean.TRUE, null, "1", null, null, null, null, null, null, null, null, null, 1047219, null);
        }

        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            if (maxAvailableResp != null) {
                C52455wMa.this.gEmmrt().postValue(maxAvailableResp.getQuoteMax());
            }
            C52455wMa.this.EZpvd = xdm;
        }
    }

    @Override // o.wLZ
    public void values() {
        Application application = new Application(this.OLrzqt, "SPOT", "cash");
        this.KWHzl.clear();
        this.KWHzl.add(application);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(this.KWHzl);
        }
    }

    /* JADX INFO: renamed from: o.wMa$StateListAnimator */
    public static final class StateListAnimator implements Function1<ResponseData<java.util.List<? extends StrategyConfigInfo>>, Unit> {
        public final /* synthetic */ java.util.ArrayList<InstrumentPercentBean> EZpvd;
        public final /* synthetic */ C52455wMa OLrzqt;

        /* JADX INFO: renamed from: o.wMa$StateListAnimator$Application */
        public static final class Application<T> implements java.util.Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return yET.KWHzl(((InstrumentPercentBean) t).getPercent(), ((InstrumentPercentBean) t2).getPercent());
            }
        }

        public StateListAnimator(java.util.ArrayList<InstrumentPercentBean> arrayList, C52455wMa c52455wMa) {
            this.EZpvd = arrayList;
            this.OLrzqt = c52455wMa;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<java.util.List<? extends StrategyConfigInfo>> responseData) {
            copydefault(responseData);
            return Unit.INSTANCE;
        }

        public void copydefault(ResponseData<java.util.List<StrategyConfigInfo>> responseData) {
            java.util.List<StrategyConfigInfo> data;
            StrategyConfigInfo strategyConfigInfo;
            java.lang.String percent;
            java.util.ArrayList<InstrumentPercentBean> instrumentPercent;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() != 0 || responseData.getData() == null || (data = responseData.getData()) == null || (strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(data)) == null) {
                return;
            }
            java.util.ArrayList<InstrumentPercentBean> arrayList = this.EZpvd;
            C52455wMa c52455wMa = this.OLrzqt;
            arrayList.clear();
            BannerOrderDetails bannerOrderDetails = c52455wMa.valueOf;
            if (bannerOrderDetails != null && (instrumentPercent = bannerOrderDetails.getInstrumentPercent()) != null) {
                arrayList.addAll(instrumentPercent);
            }
            if (arrayList.size() > 1) {
                C56407yEf.copydefault(arrayList, new Application());
            }
            java.lang.String perCoinMinAmt = strategyConfigInfo.getPerCoinMinAmt();
            InstrumentPercentBean instrumentPercentBean = (InstrumentPercentBean) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (instrumentPercentBean != null && (percent = instrumentPercentBean.getPercent()) != null) {
                str = percent;
            }
            c52455wMa.djBIcL().postValue(C33129mqd.divS$default(perCoinMinAmt, C33129mqd.copydefault(str), null, null, null, 14, null));
        }
    }

    @Override // o.wLZ
    public kotlin.Pair<java.lang.Boolean, java.lang.String> AEQbTJ(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        java.lang.String value = djBIcL().getValue();
        if (value == null) {
            value = "";
        }
        xMR xmr = xMR.copydefault;
        java.lang.String value2 = djBIcL().getValue();
        if (value2 == null) {
            value2 = "";
        }
        java.lang.String str = xmr.AhwBna(value2, OLrzqt()) + " " + AYXKKw();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) copyBotReqParam.getQuoteSz()) && C33129mqd.gEmmrt(copyBotReqParam.getQuoteSz(), value)) {
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.HalfFloat), C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str))));
        }
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    @Override // o.wLZ
    public void OLrzqt(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        C54245xBg c54245xBg = this.values;
        java.lang.String quoteSz = copyBotReqParam.getQuoteSz();
        c54245xBg.OLrzqt(copydefault(quoteSz != null ? quoteSz : ""));
        c54245xBg.AEQbTJ(valueOf());
        xKK.Activity.execute$default(c54245xBg, 0L, 1, null);
    }

    @Override // o.wLZ
    public void fJNWhG() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C56235xyw c56235xyw = this.AEQbTJ;
        c56235xyw.KWHzl("smart_portfolio");
        c56235xyw.AEQbTJ(this.OLrzqt);
        c56235xyw.KWHzl(new StateListAnimator(arrayList, this));
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final SmartPortfolioReq copydefault(java.lang.String str) {
        java.util.ArrayList arrayList;
        BannerOrderDetails bannerOrderDetails = this.valueOf;
        if (bannerOrderDetails == null) {
            return new SmartPortfolioReq((java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null);
        }
        java.util.List<CoinAssetParam> listEZpvd = C56402yEa.EZpvd(new CoinAssetParam(this.copydefault, str));
        java.util.ArrayList<InstrumentPercentBean> instrumentPercent = bannerOrderDetails.getInstrumentPercent();
        if (instrumentPercent != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(instrumentPercent, 10));
            for (InstrumentPercentBean instrumentPercentBean : instrumentPercent) {
                java.lang.String instrumentName = instrumentPercentBean.getInstrumentName();
                java.lang.String str2 = instrumentName == null ? "" : instrumentName;
                java.lang.String percent = instrumentPercentBean.getPercent();
                arrayList.add(new CoinRatioParam(str2, percent == null ? "" : percent, (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
            }
        } else {
            arrayList = null;
        }
        SmartPortfolioReq smartPortfolioReq = new SmartPortfolioReq((java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null);
        smartPortfolioReq.setStgyName(this.AYXKKw);
        smartPortfolioReq.setCapitalList(listEZpvd);
        smartPortfolioReq.setPortfolioList(arrayList);
        smartPortfolioReq.setBalType(bannerOrderDetails.getBalType());
        smartPortfolioReq.setInterval(bannerOrderDetails.getInterval());
        smartPortfolioReq.setDeltaRatio(bannerOrderDetails.getDeltaRatio());
        smartPortfolioReq.setInitCapital(str);
        return smartPortfolioReq;
    }

    @Override // o.wLZ
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        java.lang.String instFamily;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SPOT", this.OLrzqt, null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt("SPOT")) != null) {
            if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                str2 = instFamily;
            }
            C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(str2, this.copydefault);
            if (c54571xNhAhwBna != null && (c54536xMLAYXKKw = c54571xNhAhwBna.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                return safeString$default;
            }
        }
        return "--";
    }

    @Override // o.wLZ
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SPOT", this.OLrzqt, null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt("SPOT")) == null) {
            return "";
        }
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(instFamily, this.copydefault);
        return (c54571xNhAhwBna == null || (c54536xMLAYXKKw = c54571xNhAhwBna.AYXKKw(C33129mqd.mulS$default(str, str2, null, null, null, 14, null))) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.wLZ
    public java.util.ArrayList<java.lang.Object> AEQbTJ() {
        java.lang.String strAYXKKw;
        java.lang.Object obj;
        java.lang.String balType;
        java.lang.Object localized$default;
        java.lang.String strEZpvd;
        java.lang.String interval;
        java.lang.String deltaRatio;
        int i = C32113mPz.Dialog.wlaJM;
        int i2 = C32113mPz.Dialog.uzCIH;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        BannerOrderDetails bannerOrderDetails = this.valueOf;
        if (Intrinsics.EZpvd((java.lang.Object) (bannerOrderDetails != null ? bannerOrderDetails.getBalType() : null), (java.lang.Object) "ratio")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ChecksSdkIntAtLeast);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.suggest);
        }
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi23TransportControls), strAYXKKw, null, null, false, false, null, null, null, false, iCopydefault, iCopydefault2, i, i2, PointerIconCompat.TYPE_GRAB, null));
        BannerOrderDetails bannerOrderDetails2 = this.valueOf;
        if (bannerOrderDetails2 != null) {
            balType = bannerOrderDetails2.getBalType();
            obj = "ratio";
        } else {
            obj = "ratio";
            balType = null;
        }
        if (Intrinsics.EZpvd(balType, obj)) {
            xMR xmr = xMR.copydefault;
            BannerOrderDetails bannerOrderDetails3 = this.valueOf;
            if (bannerOrderDetails3 == null || (deltaRatio = bannerOrderDetails3.getDeltaRatio()) == null) {
                deltaRatio = "";
            }
            strEZpvd = xMR.formatPercent$default(xmr, deltaRatio, 0, 0, null, 10, null);
        } else {
            BannerOrderDetails bannerOrderDetails4 = this.valueOf;
            if (C33129mqd.OLrzqt((java.lang.Object) C33129mqd.remS$default(bannerOrderDetails4 != null ? bannerOrderDetails4.getInterval() : null, 60, null, null, null, 14, null), (java.lang.Object) 0)) {
                BannerOrderDetails bannerOrderDetails5 = this.valueOf;
                java.lang.String strDivS$default = C33129mqd.divS$default(bannerOrderDetails5 != null ? bannerOrderDetails5.getInterval() : null, 60, null, null, null, 14, null);
                strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C48033uCm.Dialog.EZpvd, C33129mqd.AhwBna(strDivS$default), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(strDivS$default, null, 1, null))));
            } else {
                android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                int i3 = C48033uCm.Dialog.AEQbTJ;
                BannerOrderDetails bannerOrderDetails6 = this.valueOf;
                int iAhwBna = C33129mqd.AhwBna(bannerOrderDetails6 != null ? bannerOrderDetails6.getInterval() : null);
                BannerOrderDetails bannerOrderDetails7 = this.valueOf;
                if (bannerOrderDetails7 == null || (interval = bannerOrderDetails7.getInterval()) == null || (localized$default = pTB.formatLocalized$default(interval, null, 1, null)) == null) {
                    localized$default = 0;
                }
                strEZpvd = pTD.EZpvd(applicationOLrzqt, i3, iAhwBna, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", localized$default)));
            }
        }
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.CheckResult), strEZpvd, null, null, false, false, null, null, null, false, iCopydefault, iCopydefault2, i, i2, PointerIconCompat.TYPE_GRAB, null));
        arrayList.add(copydefault());
        return arrayList;
    }

    public final TacticsCoinsInsideItemData copydefault() {
        java.util.ArrayList<InstrumentPercentBean> instrumentPercent;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImplApi24);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        BannerOrderDetails bannerOrderDetails = this.valueOf;
        if (bannerOrderDetails != null && (instrumentPercent = bannerOrderDetails.getInstrumentPercent()) != null) {
            for (InstrumentPercentBean instrumentPercentBean : instrumentPercent) {
                java.lang.String instrumentName = instrumentPercentBean.getInstrumentName();
                java.lang.String str = instrumentName == null ? "" : instrumentName;
                java.lang.String percent = instrumentPercentBean.getPercent();
                arrayList.add(new CoinRatioParam(str, percent == null ? "" : percent, (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
            }
        }
        return new TacticsCoinsInsideItemData(strAYXKKw, arrayList, C32113mPz.Dialog.wlaJM, C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
    }

    @Override // o.wLZ
    public int OLrzqt() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String quoteDig = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SPOT", this.OLrzqt, null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt("SPOT")) != null) {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null) {
                quoteDig = idxConfigAkhnZx.getQuoteDig();
            }
        }
        if (quoteDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) quoteDig)) {
            return 8;
        }
        return C33129mqd.AhwBna(quoteDig);
    }

    @Override // o.wLZ
    public java.lang.String AhwBna() {
        xMR xmr = xMR.copydefault;
        java.lang.String value = djBIcL().getValue();
        if (value == null) {
            value = "";
        }
        java.lang.String strAhwBna = xmr.AhwBna(value, OLrzqt());
        java.lang.String value2 = djBIcL().getValue();
        if (value2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) value2)) {
            return "";
        }
        return "≥ " + strAhwBna;
    }

    @Override // o.wLZ
    public java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(C55688xof.Application.stop);
    }

    @Override // o.wLZ
    public StrategyReqGroup KWHzl(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        StrategyBaseReq strategyBaseReq = new StrategyBaseReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, "smart_portfolio", (TradeType) null, (java.lang.String) null, (java.lang.Boolean) null, 1919, (DefaultConstructorMarker) null);
        java.lang.String quoteSz = copyBotReqParam.getQuoteSz();
        return new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, copydefault(quoteSz != null ? quoteSz : ""), (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32254, (DefaultConstructorMarker) null);
    }

    @Override // o.wLZ
    public java.util.List<xKK> DbNXlk() {
        return yDY.gEmmrt(this.values, this.AEQbTJ);
    }
}
