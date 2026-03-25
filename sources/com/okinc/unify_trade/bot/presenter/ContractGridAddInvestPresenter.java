package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotAddInvestLimitResponse;
import com.okinc.unify_trade.biz.BotAddInvestmentData;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.ExtraActualMarginResp;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC54531xLw;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C54506xKy;
import o.C54536xML;
import o.C54589xNz;
import o.C54799xVt;
import o.C55688xof;
import o.C56033xvF;
import o.C56111xwe;
import o.C56188xyB;
import o.C56240xzA;
import o.C56242xzC;
import o.C56390yDp;
import o.C56424yEw;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xMV;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ContractGridAddInvestPresenter extends AbsPresenter {
    public final C56240xzA AEQbTJ;
    public TacticsData AYXKKw;
    public final C56188xyB AhwBna;
    public final C56111xwe<ExtraActualMarginResp> EZpvd;
    public final TradeLiveData<Object> KWHzl;
    public Boolean OLrzqt;
    public String copydefault;
    public String djBIcL;
    public final TradeLiveData<BotAddInvestLimitResponse> gEmmrt;
    public String isConnected;
    public final C56242xzC valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ExtraActualMarginResp> AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56240xzA EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Object> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(TacticsData tacticsData) {
        this.AYXKKw = tacticsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotAddInvestLimitResponse> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGridAddInvestPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = Boolean.TRUE;
        this.isConnected = "";
        this.EZpvd = new C56111xwe<>();
        this.AhwBna = new C56188xyB();
        this.AEQbTJ = new C56240xzA();
        this.KWHzl = new TradeLiveData<>();
        this.valueOf = new C56242xzC();
        this.gEmmrt = new TradeLiveData<>();
    }

    public final xMV fIwbmz() {
        String instType;
        String instFamily;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            return null;
        }
        TacticsData tacticsData = this.AYXKKw;
        String str = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
        if (abstractC54531xLwOLrzqt == null) {
            return null;
        }
        BizInstrument bizInstrumentOLrzqt = OLrzqt();
        if (bizInstrumentOLrzqt != null && (instFamily = bizInstrumentOLrzqt.getInstFamily()) != null) {
            str = instFamily;
        }
        return AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str, null, 2, null);
    }

    private final String getFieldNames() {
        String minAdditionalInvestment;
        C54536xML c54536xMLAuCTel;
        String safeString$default;
        xMV xmvFIwbmz = fIwbmz();
        if (xmvFIwbmz == null) {
            return "";
        }
        BotAddInvestLimitResponse value = this.gEmmrt.getValue();
        if (value == null || (minAdditionalInvestment = value.getMinAdditionalInvestment()) == null) {
            minAdditionalInvestment = "";
        }
        C54536xML c54536xMLOLrzqt = xmvFIwbmz.OLrzqt(minAdditionalInvestment);
        return (c54536xMLOLrzqt == null || (c54536xMLAuCTel = c54536xMLOLrzqt.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final String values() {
        String maxAdditionalInvestment;
        C54536xML c54536xMLCopydefault;
        String safeString$default;
        xMV xmvFIwbmz = fIwbmz();
        if (xmvFIwbmz == null) {
            return "";
        }
        BotAddInvestLimitResponse value = this.gEmmrt.getValue();
        if (value == null || (maxAdditionalInvestment = value.getMaxAdditionalInvestment()) == null) {
            maxAdditionalInvestment = "";
        }
        C54536xML c54536xMLOLrzqt = xmvFIwbmz.OLrzqt(maxAdditionalInvestment);
        return (c54536xMLOLrzqt == null || (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final String fARcdN() {
        String minAdditionalInvestment;
        C54536xML c54536xMLAuCTel;
        String safeString$default;
        xMV xmvFIwbmz = fIwbmz();
        if (xmvFIwbmz == null) {
            return "";
        }
        BotAddInvestLimitResponse value = this.gEmmrt.getValue();
        if (value == null || (minAdditionalInvestment = value.getMinAdditionalInvestment()) == null) {
            minAdditionalInvestment = "";
        }
        C54536xML c54536xMLCopydefault = xmvFIwbmz.copydefault(minAdditionalInvestment);
        return (c54536xMLCopydefault == null || (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final String fJNWhG() {
        String maxAdditionalInvestment;
        C54536xML c54536xMLCopydefault;
        String safeString$default;
        xMV xmvFIwbmz = fIwbmz();
        if (xmvFIwbmz == null) {
            return "";
        }
        BotAddInvestLimitResponse value = this.gEmmrt.getValue();
        if (value == null || (maxAdditionalInvestment = value.getMaxAdditionalInvestment()) == null) {
            maxAdditionalInvestment = "";
        }
        C54536xML c54536xMLCopydefault2 = xmvFIwbmz.copydefault(maxAdditionalInvestment);
        return (c54536xMLCopydefault2 == null || (c54536xMLCopydefault = c54536xMLCopydefault2.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "" : safeString$default;
    }

    private final String getNewProxyInstance() {
        String instType;
        TacticsData tacticsData = this.AYXKKw;
        return (tacticsData == null || (instType = tacticsData.getInstType()) == null) ? "" : instType;
    }

    private final String hDKMBd() {
        String instId;
        TacticsData tacticsData = this.AYXKKw;
        return (tacticsData == null || (instId = tacticsData.getInstId()) == null) ? "" : instId;
    }

    public final void AEQbTJ(boolean z) {
        this.OLrzqt = Boolean.valueOf(z);
    }

    public static /* synthetic */ void updateSz$default(ContractGridAddInvestPresenter contractGridAddInvestPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        contractGridAddInvestPresenter.copydefault(z);
    }

    public final void copydefault(boolean z) {
        this.isConnected = C33129mqd.EZpvd(this.djBIcL).add(C33129mqd.EZpvd(this.copydefault)).toString();
    }

    public static /* synthetic */ void getActualExtraMargin$default(ContractGridAddInvestPresenter contractGridAddInvestPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        contractGridAddInvestPresenter.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        List<DcaTriggerParam> triggerParams;
        DcaTriggerParam dcaTriggerParam;
        if (hDKMBd().length() == 0 || C33129mqd.valueOf(this.isConnected, 0)) {
            this.EZpvd.postValue(new ExtraActualMarginResp("", ""));
            return;
        }
        C56188xyB c56188xyB = this.AhwBna;
        c56188xyB.copydefault(hDKMBd());
        c56188xyB.AYXKKw(this.isConnected);
        if (z) {
            c56188xyB.EZpvd("2");
            TacticsData tacticsData = this.AYXKKw;
            c56188xyB.gEmmrt(tacticsData != null ? tacticsData.getMinPx() : null);
            TacticsData tacticsData2 = this.AYXKKw;
            c56188xyB.djBIcL(tacticsData2 != null ? tacticsData2.getMaxPx() : null);
            TacticsData tacticsData3 = this.AYXKKw;
            c56188xyB.OLrzqt(tacticsData3 != null ? tacticsData3.getGridNum() : null);
            TacticsData tacticsData4 = this.AYXKKw;
            c56188xyB.KWHzl(tacticsData4 != null ? tacticsData4.getDirection() : null);
            TacticsData tacticsData5 = this.AYXKKw;
            c56188xyB.copydefault(tacticsData5 != null ? Boolean.valueOf(tacticsData5.getBasePos()) : null);
            TacticsData tacticsData6 = this.AYXKKw;
            c56188xyB.AhwBna(tacticsData6 != null ? tacticsData6.getOriginalLevel() : null);
            TacticsData tacticsData7 = this.AYXKKw;
            c56188xyB.valueOf((tacticsData7 == null || (triggerParams = tacticsData7.getTriggerParams()) == null || (dcaTriggerParam = (DcaTriggerParam) CollectionsKt___CollectionsKt.AkhnZx(triggerParams, 0)) == null) ? null : dcaTriggerParam.getTriggerStrategy());
            TacticsData tacticsData8 = this.AYXKKw;
            c56188xyB.AEQbTJ(tacticsData8 != null ? tacticsData8.getAlgoId() : null);
        }
        c56188xyB.djBIcL();
        c56188xyB.OLrzqt(this.EZpvd, new Activity());
        c56188xyB.OLrzqt(400L);
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends ExtraActualMarginResp>, ExtraActualMarginResp> {
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ ExtraActualMarginResp KWHzl(List<? extends ExtraActualMarginResp> list) {
            return KWHzl2((List<ExtraActualMarginResp>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public ExtraActualMarginResp KWHzl2(List<ExtraActualMarginResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return ContractGridAddInvestPresenter.this.KWHzl(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExtraActualMarginResp KWHzl(List<ExtraActualMarginResp> list) {
        return C33129mqd.AEQbTJ(Integer.valueOf(list.size()), 0) ? list.get(0) : new ExtraActualMarginResp((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public final String EZpvd(@NotNull String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL;
        String instFamily;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, getNewProxyInstance(), hDKMBd(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(getNewProxyInstance())) == null) {
            return null;
        }
        if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
            str2 = instFamily;
        }
        xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str2, null, 2, null);
        if (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) == null || (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) == null || (c54536xMLDjBIcL = c54536xMLAuCTel.djBIcL()) == null) {
            return null;
        }
        return C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
    }

    public final String fetchVPNInfo() {
        String marginSymbol;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, getNewProxyInstance(), hDKMBd(), null, null, 12, null) : null;
        return (suggestedInstrument$default == null || (marginSymbol = suggestedInstrument$default.getMarginSymbol()) == null) ? "" : marginSymbol;
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2) {
        BotAddInvestmentData botAddInvestmentData;
        String algoId;
        String algoId2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (z2) {
            TacticsData tacticsData = this.AYXKKw;
            botAddInvestmentData = new BotAddInvestmentData((tacticsData == null || (algoId2 = tacticsData.getAlgoId()) == null) ? "" : algoId2, str, str2, str3, Boolean.valueOf(z), "2");
        } else {
            TacticsData tacticsData2 = this.AYXKKw;
            botAddInvestmentData = new BotAddInvestmentData((tacticsData2 == null || (algoId = tacticsData2.getAlgoId()) == null) ? "" : algoId, str, (String) null, (String) null, (Boolean) null, (String) null, 60, (DefaultConstructorMarker) null);
        }
        C56240xzA c56240xzA = this.AEQbTJ;
        c56240xzA.OLrzqt(botAddInvestmentData);
        c56240xzA.AEQbTJ(this.KWHzl);
        xKK.Activity.execute$default(c56240xzA, 0L, 1, null);
    }

    public static /* synthetic */ void reqInvestLimit$default(ContractGridAddInvestPresenter contractGridAddInvestPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        contractGridAddInvestPresenter.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        String algoId;
        String orderType;
        TacticsData tacticsData = this.AYXKKw;
        String algoId2 = tacticsData != null ? tacticsData.getAlgoId() : null;
        if (algoId2 == null || StringsKt__StringsKt.fARcdN((CharSequence) algoId2) || StringsKt__StringsKt.fARcdN((CharSequence) hDKMBd())) {
            return;
        }
        TacticsData tacticsData2 = this.AYXKKw;
        String orderType2 = tacticsData2 != null ? tacticsData2.getOrderType() : null;
        if (orderType2 == null || StringsKt__StringsKt.fARcdN((CharSequence) orderType2)) {
            return;
        }
        C56242xzC c56242xzC = this.valueOf;
        TacticsData tacticsData3 = this.AYXKKw;
        String str = "";
        if (tacticsData3 == null || (algoId = tacticsData3.getAlgoId()) == null) {
            algoId = "";
        }
        c56242xzC.AEQbTJ(algoId);
        c56242xzC.KWHzl(hDKMBd());
        TacticsData tacticsData4 = this.AYXKKw;
        if (tacticsData4 != null && (orderType = tacticsData4.getOrderType()) != null) {
            str = orderType;
        }
        c56242xzC.OLrzqt(str);
        if (z) {
            c56242xzC.EZpvd("2");
            c56242xzC.EZpvd(this.OLrzqt);
        }
        c56242xzC.OLrzqt(this.gEmmrt, new C54506xKy());
        xKK.Activity.execute$default(c56242xzC, 0L, 1, null);
    }

    public final boolean gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TacticsData tacticsData = this.AYXKKw;
        if ((tacticsData != null ? tacticsData.getAlgoId() : null) == null || C33129mqd.valueOf(str, 0)) {
            return false;
        }
        BotAddInvestLimitResponse value = this.gEmmrt.getValue();
        if (C33129mqd.OLrzqt((CharSequence) (value != null ? value.getMinAdditionalInvestment() : null)) && C33129mqd.gEmmrt(str, getFieldNames())) {
            return false;
        }
        BotAddInvestLimitResponse value2 = this.gEmmrt.getValue();
        return (C33129mqd.OLrzqt((CharSequence) (value2 != null ? value2.getMaxAdditionalInvestment() : null)) && C33129mqd.AEQbTJ(str, values())) ? false : true;
    }

    public final String AYXKKw() {
        if (C33129mqd.AEQbTJ(getFieldNames(), 0) && C33129mqd.AEQbTJ(values(), 0)) {
            return "≥ " + fARcdN();
        }
        if (C33129mqd.AEQbTJ(getFieldNames(), 0)) {
            return "≥ " + fARcdN();
        }
        if (!C33129mqd.AEQbTJ(values(), 0)) {
            return "";
        }
        return "≤ " + fJNWhG();
    }

    public final boolean isConnected() {
        return C33129mqd.copydefault(values(), getFieldNames());
    }

    public final String DbNXlk() {
        String marginSymbol;
        BizInstrument bizInstrumentOLrzqt = OLrzqt();
        return (bizInstrumentOLrzqt == null || (marginSymbol = bizInstrumentOLrzqt.getMarginSymbol()) == null) ? "" : marginSymbol;
    }

    public final int AkhnZx() {
        String strFJNWhG;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String instFamily;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(getNewProxyInstance())) == null) {
            strFJNWhG = null;
        } else {
            BizInstrument bizInstrumentOLrzqt = OLrzqt();
            if (bizInstrumentOLrzqt == null || (instFamily = bizInstrumentOLrzqt.getInstFamily()) == null) {
                instFamily = "";
            }
            strFJNWhG = abstractC54531xLwOLrzqt.fJNWhG(instFamily);
        }
        if (strFJNWhG == null || StringsKt__StringsKt.fARcdN((CharSequence) strFJNWhG)) {
            return 2;
        }
        return C33129mqd.AhwBna(strFJNWhG);
    }

    public final String valueOf() {
        return C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, hDKMBd(), getNewProxyInstance(), false, false, 12, null);
    }

    public final BizInstrument OLrzqt() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, getNewProxyInstance(), hDKMBd(), null, null, 12, null);
        }
        return null;
    }

    public final ArrayList<TacticsListLabelData> AuCTel() {
        String direction;
        String direction2;
        String level;
        TacticsData tacticsData = this.AYXKKw;
        if (tacticsData == null || (direction = tacticsData.getDirection()) == null) {
            direction = "";
        }
        int iKWHzl = KWHzl(direction);
        TacticsListLabelData[] tacticsListLabelDataArr = new TacticsListLabelData[2];
        TacticsData tacticsData2 = this.AYXKKw;
        if (tacticsData2 == null || (direction2 = tacticsData2.getDirection()) == null) {
            direction2 = "";
        }
        tacticsListLabelDataArr[0] = new TacticsListLabelData(C56033xvF.AhwBna(direction2), false, iKWHzl, 0, 0, 26, null);
        TacticsData tacticsData3 = this.AYXKKw;
        tacticsListLabelDataArr[1] = new TacticsListLabelData((tacticsData3 == null || (level = tacticsData3.getLevel()) == null) ? "" : level, false, iKWHzl, 0, 0, 26, null);
        return yDY.copydefault(tacticsListLabelDataArr);
    }

    public final int KWHzl(String str) {
        return C56033xvF.valueOf(str);
    }

    public final String AEQbTJ(@NotNull String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        String safeString$default;
        String instFamily;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(getNewProxyInstance())) != null) {
            BizInstrument bizInstrumentOLrzqt = OLrzqt();
            if (bizInstrumentOLrzqt != null && (instFamily = bizInstrumentOLrzqt.getInstFamily()) != null) {
                str2 = instFamily;
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str2, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                return safeString$default;
            }
        }
        return "--";
    }

    public final String copydefault(float f, @NotNull String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String instFamily;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(getNewProxyInstance())) == null) {
            return "";
        }
        BizInstrument bizInstrumentOLrzqt = OLrzqt();
        if (bizInstrumentOLrzqt == null || (instFamily = bizInstrumentOLrzqt.getInstFamily()) == null) {
            instFamily = "";
        }
        xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
        return (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(C33129mqd.mulS$default(Float.valueOf(f), str, null, null, null, 14, null))) == null || (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final boolean uzCIH() {
        TacticsData tacticsData = this.AYXKKw;
        return C33129mqd.OLrzqt((CharSequence) (tacticsData != null ? tacticsData.getSourceAlgoId() : null));
    }

    public final boolean iwGUEr() {
        TacticsData tacticsData = this.AYXKKw;
        return Intrinsics.EZpvd((Object) (tacticsData != null ? tacticsData.getCopyType() : null), (Object) "2");
    }

    public final String OLrzqt(String str) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String instFamily;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        String safeString$default;
        TacticsData tacticsData = this.AYXKKw;
        String originalLevel = tacticsData != null ? tacticsData.getOriginalLevel() : null;
        if (C33129mqd.AEQbTJ(str, "0") && C33129mqd.AEQbTJ(originalLevel, "0") && (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(getNewProxyInstance())) != null) {
            BizInstrument bizInstrumentOLrzqt = OLrzqt();
            if (bizInstrumentOLrzqt == null || (instFamily = bizInstrumentOLrzqt.getInstFamily()) == null) {
                instFamily = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(C33129mqd.mulS$default(str, originalLevel, null, null, null, 14, null))) != null && (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) != null && (c54536xMLFetchVPNInfo = c54536xMLAuCTel.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                return safeString$default;
            }
        }
        return "--";
    }

    public final String copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return "";
        }
        String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default);
        BotAddInvestLimitResponse value = this.gEmmrt.getValue();
        if (C33129mqd.OLrzqt((CharSequence) (value != null ? value.getMinAdditionalInvestment() : null)) && C33129mqd.gEmmrt(str, getFieldNames())) {
            return C33069mpW.copydefault(C55688xof.Application.gGNlxh, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", strAYXKKw), C56390yDp.OLrzqt("minValue", fARcdN()), C56390yDp.OLrzqt("unit", DbNXlk())));
        }
        BotAddInvestLimitResponse value2 = this.gEmmrt.getValue();
        return (C33129mqd.OLrzqt((CharSequence) (value2 != null ? value2.getMaxAdditionalInvestment() : null)) && C33129mqd.AEQbTJ(str, values())) ? C33069mpW.copydefault(C55688xof.Application.OJuSTm, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", strAYXKKw), C56390yDp.OLrzqt("minValue", fJNWhG()), C56390yDp.OLrzqt("unit", DbNXlk()))) : "";
    }

    public final boolean KWHzl(@NotNull String str, @NotNull String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        String instFamily;
        String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        String safeString$default = null;
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(getNewProxyInstance())) != null) {
            BizInstrument bizInstrumentOLrzqt = OLrzqt();
            if (bizInstrumentOLrzqt != null && (instFamily = bizInstrumentOLrzqt.getInstFamily()) != null) {
                str3 = instFamily;
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str3, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(str2)) != null && (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null);
            }
        }
        return C33129mqd.AEQbTJ(str, safeString$default);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AEQbTJ, this.valueOf);
    }
}
