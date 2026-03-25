package com.okinc.tradingbot.impl.order.strategy.smartportfolio.presenter;

import android.app.Application;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.presenter.SmartPortfolioPresenter;
import com.okinc.unify_trade.biz.CoinAssetParam;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.PortfolioData;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.bot.MaxCapital;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.bot.data.SmartInvestDetail;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32979mnm;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C38307pTy;
import o.C53191wgo;
import o.C54243xBe;
import o.C54244xBf;
import o.C54245xBg;
import o.C54507xKz;
import o.C54536xML;
import o.C54571xNh;
import o.C54589xNz;
import o.C55688xof;
import o.C55887xsS;
import o.C56111xwe;
import o.C56194xyH;
import o.C56235xyw;
import o.C56390yDp;
import o.C56402yEa;
import o.C56403yEb;
import o.C56407yEf;
import o.C56423yEv;
import o.C56424yEw;
import o.InterfaceC54581xNr;
import o.pTB;
import o.pTD;
import o.pUU;
import o.xKK;
import o.xMR;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SmartPortfolioPresenter extends BaseBotOrderPresenter {
    public int AEQbTJ;
    public boolean AYXKKw;
    public SmartPortfolioReq AhwBna;
    public final TradeLiveData<MaxCapital> AkhnZx;
    public final C54245xBg AuCTel;
    public String AuCTelauCTel;
    public String AubY;
    public boolean DbNXlk;
    public final C56235xyw EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public String copydefault;
    public boolean djBIcL;
    public int ejfBZ;
    public int fARcdN;
    public final C54243xBe fIwbmz;
    public final C54244xBf fJNWhG;
    public boolean fetchVPNInfo;
    public final ArrayList<SelectCoinData> gEmmrt;
    public final C56194xyH getFieldNames;
    public final ArrayList<SelectCoinData> getNewProxyInstance;
    public final TradeLiveData<PortfolioData> hDKMBd;
    public final C56111xwe<List<StrategyResponse>> isConnected;
    public final TradeLiveData<SmartInvestDetail> iwGUEr;
    public String uzCIH;
    public String valueOf;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SelectCoinData> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AubY = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54245xBg AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SmartInvestDetail> AuCTel() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AubY() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.uzCIH = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartPortfolioReq copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.fARcdN = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(SmartPortfolioReq smartPortfolioReq) {
        this.AhwBna = smartPortfolioReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<MaxCapital> djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<PortfolioData> ejfBZ() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56194xyH fIwbmz() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SelectCoinData> fJNWhG() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        this.values = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54244xBf isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean uzCIH() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<StrategyResponse>> valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54243xBe values() {
        return this.fIwbmz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartPortfolioPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C56235xyw();
        this.fIwbmz = new C54243xBe();
        this.iwGUEr = new TradeLiveData<>();
        this.getFieldNames = new C56194xyH();
        this.hDKMBd = new TradeLiveData<>();
        this.fJNWhG = new C54244xBf();
        this.AkhnZx = new TradeLiveData<>();
        this.AuCTel = new C54245xBg();
        this.isConnected = new C56111xwe<>();
        this.AYXKKw = true;
        this.values = true;
        this.fetchVPNInfo = true;
        this.gEmmrt = new ArrayList<>();
        this.getNewProxyInstance = new ArrayList<>();
        this.djBIcL = true;
        this.fARcdN = 40;
        this.ejfBZ = 10;
        this.OLrzqt = "";
        this.valueOf = "";
        this.copydefault = "";
        this.AuCTelauCTel = "cash";
        this.AubY = "";
        this.KWHzl = "";
        this.uzCIH = "";
        this.AEQbTJ = 1;
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(C33129mqd.AhwBna(((SelectCoinData) t).getRatio())), Integer.valueOf(C33129mqd.AhwBna(((SelectCoinData) t2).getRatio())));
        }
    }

    public final String gEmmrt() {
        return fvQaOB().copydefault("smart_portfolio");
    }

    public final String EZpvd() {
        String strDbNXlk = fvQaOB().DbNXlk();
        return strDbNXlk == null ? "" : strDbNXlk;
    }

    public final String KWHzl() {
        String strAYXKKw;
        String iCUPercent$default;
        if (Intrinsics.EZpvd((Object) this.copydefault, (Object) CrashHianalyticsData.TIME)) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.suggest);
            if (C33129mqd.OLrzqt((Object) C33129mqd.remS$default(this.valueOf, 60, null, null, null, 14, null), (Object) 0)) {
                String strDivS$default = C33129mqd.divS$default(this.valueOf, 60, null, null, null, 14, null);
                iCUPercent$default = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.EZpvd, C33129mqd.AhwBna(strDivS$default), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(strDivS$default, null, 1, null))));
            } else {
                iCUPercent$default = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.AEQbTJ, C33129mqd.AhwBna(this.valueOf), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(this.valueOf, null, 1, null))));
            }
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ChecksSdkIntAtLeast);
            xMR xmr = xMR.copydefault;
            iCUPercent$default = xMR.formatICUPercent$default(xmr, xmr.OLrzqt((Object) this.OLrzqt), null, C38307pTy.Companion.copydefault(0), null, Double.valueOf(100.0d), null, 42, null);
        }
        return strAYXKKw + " | " + iCUPercent$default;
    }

    public final String getNewProxyInstance() {
        return xMR.copydefault.copydefault(this.KWHzl) + " " + gEmmrt();
    }

    public final String iwGUEr() {
        if (this.DbNXlk) {
            return this.AubY;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            SelectCoinData selectCoinData = (SelectCoinData) CollectionsKt___CollectionsKt.AkhnZx(this.getNewProxyInstance, i);
            if (selectCoinData != null) {
                sb.append(selectCoinData.getName());
                sb.append(", ");
            }
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }
        if (this.getNewProxyInstance.size() > 3) {
            sb.append("...");
        }
        sb.append(C33070mpX.AYXKKw(C55688xof.Application.to));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String getAtLeastTotalAmt$default(SmartPortfolioPresenter smartPortfolioPresenter, boolean z, String str, MaxAvailableResp maxAvailableResp, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return smartPortfolioPresenter.AEQbTJ(z, str, maxAvailableResp);
    }

    public final String AEQbTJ(boolean z, @NotNull String str, MaxAvailableResp maxAvailableResp) {
        String ratio;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        String safeString$default;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (!this.djBIcL) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.getNewProxyInstance);
        if (arrayList.size() > 1) {
            C56407yEf.copydefault(arrayList, new ActionBar());
        }
        SelectCoinData selectCoinData = (SelectCoinData) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (selectCoinData == null || (ratio = selectCoinData.getRatio()) == null) {
            ratio = "0";
        }
        String upToMax$default = xMR.formatUpToMax$default(xMR.copydefault, C33129mqd.divS$default(Integer.valueOf(this.ejfBZ), C33129mqd.divS$default(C33129mqd.copydefault(ratio), 100, null, null, null, 14, null), null, null, null, 14, null), 0, 2, null);
        if (!C33129mqd.copydefault(str, C33129mqd.OLrzqt(Integer.valueOf(this.ejfBZ), C33129mqd.divS$default(C33129mqd.copydefault(ratio), 100, null, null, null, 14, null), 2, Boolean.FALSE, RoundingMode.UP))) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.HalfFloat), C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, upToMax$default + " " + gEmmrt())));
        }
        String strAYXKKw = (z && C33129mqd.AEQbTJ(AYXKKw(), 0)) ? AYXKKw() : "";
        if (!C33129mqd.AEQbTJ(strAYXKKw, 0) || !C33129mqd.AEQbTJ(str, strAYXKKw)) {
            return "";
        }
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(fvQaOB(), null, true, 1, null);
        if (c54571xNhCreateAmtConvert$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(strAYXKKw)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
            str2 = safeString$default;
        }
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi216), C56424yEw.gEmmrt(C56390yDp.OLrzqt("maxInvest", str2), C56390yDp.OLrzqt("ccy", gEmmrt())));
    }

    public final String AYXKKw() {
        String maxCapital;
        MaxCapital value = this.AkhnZx.getValue();
        return (value == null || (maxCapital = value.getMaxCapital()) == null) ? "0" : maxCapital;
    }

    public static /* synthetic */ String getInvestInterval$default(SmartPortfolioPresenter smartPortfolioPresenter, boolean z, String str, MaxAvailableResp maxAvailableResp, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return smartPortfolioPresenter.KWHzl(z, str, maxAvailableResp);
    }

    public final String KWHzl(boolean z, @NotNull String str, MaxAvailableResp maxAvailableResp) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (z && C33129mqd.AEQbTJ(AYXKKw(), 0)) {
            strAYXKKw = AYXKKw();
        }
        String safeString$default = null;
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(fvQaOB(), null, true, 1, null);
        if (c54571xNhCreateAmtConvert$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(strAYXKKw)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
        }
        if (strAYXKKw.length() <= 0 || !C33129mqd.AEQbTJ(strAYXKKw, str)) {
            return "≥ " + xMR.copydefault.copydefault(str);
        }
        return xMR.copydefault.copydefault(str) + "-" + safeString$default;
    }

    public final void copydefault(final Function1<? super StrategyConfigInfo, Unit> function1) {
        C56235xyw c56235xyw = this.EZpvd;
        c56235xyw.KWHzl("smart_portfolio");
        c56235xyw.AEQbTJ(fvQaOB().gEmmrt());
        c56235xyw.OLrzqt(fvQaOB().AEQbTJ("smart_portfolio"));
        c56235xyw.KWHzl(new Function1() { // from class: o.wgu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SmartPortfolioPresenter.KWHzl(function1, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final void zLjUOn() {
        C54243xBe c54243xBe = this.fIwbmz;
        c54243xBe.OLrzqt(fetchVPNInfo(), EZpvd(), this.KWHzl, gEmmrt());
        c54243xBe.djBIcL();
        TradeLiveData<SmartInvestDetail> tradeLiveData = this.iwGUEr;
        C53191wgo c53191wgo = new C53191wgo();
        c53191wgo.OLrzqt(this.KWHzl);
        c53191wgo.AEQbTJ(this.getNewProxyInstance);
        Unit unit = Unit.INSTANCE;
        c54243xBe.OLrzqt(tradeLiveData, c53191wgo);
        xKK.Activity.execute$default(c54243xBe, 0L, 1, null);
    }

    public final void zsXlph() {
        C54244xBf c54244xBf = this.fJNWhG;
        c54244xBf.EZpvd(fetchVPNInfo(), EZpvd(), gEmmrt());
        c54244xBf.djBIcL();
        c54244xBf.OLrzqt(this.AkhnZx, new C54507xKz());
        xKK.Activity.execute$default(c54244xBf, 0L, 1, null);
    }

    public final void AuCTelauCTel() {
        pUU.KWHzl("SmartPortfolioPresenter", "resetRecommendId: " + this.uzCIH + " to null");
        this.uzCIH = null;
    }

    public final void KWHzl(boolean z) {
        C54245xBg c54245xBg = this.AuCTel;
        c54245xBg.OLrzqt(copydefault(z));
        c54245xBg.AEQbTJ(this.isConnected);
        xKK.Activity.execute$default(c54245xBg, 0L, 1, null);
    }

    public final SmartPortfolioReq copydefault(boolean z) {
        List listEZpvd = C56402yEa.EZpvd(new CoinAssetParam(gEmmrt(), this.KWHzl));
        ArrayList<SelectCoinData> arrayList = this.getNewProxyInstance;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (SelectCoinData selectCoinData : arrayList) {
            String name = selectCoinData.getName();
            if (name == null) {
                name = "";
            }
            arrayList2.add(new CoinRatioParam(name, C33129mqd.divS$default(selectCoinData.getRatio(), 100, 2, Boolean.FALSE, null, 8, null), (String) null, (String) null, 12, (DefaultConstructorMarker) null));
        }
        return new SmartPortfolioReq(this.AubY, listEZpvd, arrayList2, this.copydefault, this.valueOf, this.OLrzqt, (String) null, this.uzCIH, this.KWHzl, z ? "complex" : "simple", EZpvd(), this.AuCTelauCTel, (String) null, fvQaOB().AEQbTJ("smart_portfolio"), 4160, (DefaultConstructorMarker) null);
    }

    public final SelectCoinData AhwBna() {
        String strValueOf;
        String strOLrzqt = fvQaOB().OLrzqt();
        String str = strOLrzqt == null ? "" : strOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return new SelectCoinData((interfaceC54581xNrOLrzqt == null || (strValueOf = interfaceC54581xNrOLrzqt.valueOf(str)) == null) ? "" : strValueOf, str, SlippageConfigVo.MAX_SLIP, true, false, false, null, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 8176, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.fIwbmz, this.getFieldNames, this.fJNWhG, this.AuCTel, this.EZpvd);
    }

    public final String fetchVPNInfo() {
        String str = "";
        int i = 0;
        for (Object obj : this.getNewProxyInstance) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            SelectCoinData selectCoinData = (SelectCoinData) obj;
            if (i == 0) {
                str = ((Object) str) + selectCoinData.getName() + ":" + C33129mqd.divS$default(selectCoinData.getRatio(), 100, null, null, null, 14, null);
            } else {
                str = ((Object) str) + "," + selectCoinData.getName() + ":" + C33129mqd.divS$default(selectCoinData.getRatio(), 100, null, null, null, 14, null);
            }
            i++;
        }
        return str;
    }

    public final void wlaJM() {
        String str = "";
        int i = 0;
        for (Object obj : this.getNewProxyInstance) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            SelectCoinData selectCoinData = (SelectCoinData) obj;
            if (i == 0) {
                str = ((Object) str) + selectCoinData.getName();
            } else {
                str = ((Object) str) + "," + selectCoinData.getName();
            }
            i++;
        }
        C56194xyH c56194xyH = this.getFieldNames;
        c56194xyH.OLrzqt(str, EZpvd());
        c56194xyH.djBIcL();
        c56194xyH.OLrzqt(this.hDKMBd, new C54507xKz());
        xKK.Activity.execute$default(c56194xyH, 0L, 1, null);
    }

    public static final Unit KWHzl(Function1 function1, ResponseData responseData) {
        StrategyConfigInfo strategyConfigInfo;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            List list = (List) responseData.getData();
            if (list != null && (strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) != null && function1 != null) {
                function1.invoke(strategyConfigInfo);
            }
        } else {
            pUU.copydefault("SmartPortfolioPresenter", responseData.getMsg());
        }
        return Unit.INSTANCE;
    }
}
