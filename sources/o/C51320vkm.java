package o;

import androidx.lifecycle.TradeLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.NoConfirmData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.PriceRangeInfo;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.MinInvestReq;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.MpStgyDetail;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideItem;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import com.okinc.unify_trade.bot.data.DistributeItem;
import com.okinc.unify_trade.bot.util.recurring.RecurringHourlyConfig;
import com.okinc.unify_trade.bot.util.recurring.RecurringWeekConfig;
import java.util.GregorianCalendar;
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

/* JADX INFO: renamed from: o.vkm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51320vkm extends AbstractC51317vkj {
    public final C56183xxx AEQbTJ;
    public xDM EZpvd;
    public final xAR KWHzl;
    public java.util.ArrayList<java.lang.Object> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public xKK AuCTelauCTel() {
        return this.KWHzl;
    }

    @Override // o.AbstractC51317vkj
    public void dxcTrN() {
    }

    @Override // o.AbstractC51317vkj
    public int ejfBZ() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51317vkj
    public int isConnected() {
        return C52761wXj.TaskDescription.zdxASf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51320vkm(@NotNull TradeLiveData<java.util.List<MpStgyInfo>> tradeLiveData) {
        super(tradeLiveData);
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        this.KWHzl = new xAR();
        this.AEQbTJ = new C56183xxx();
        this.copydefault = new java.util.ArrayList<>();
    }

    public final MpStgyDetail copydefault() {
        MpStgyInfo mpStgyInfo;
        MpStgyDetail stgyDetail;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyDetail = mpStgyInfo.getStgyDetail()) == null) ? new MpStgyDetail((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, false, (java.util.ArrayList) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null) : stgyDetail;
    }

    private final MpStgyParam AEQbTJ() {
        MpStgyInfo mpStgyInfo;
        MpStgyParam stgyParam;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        return (value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyParam = mpStgyInfo.getStgyParam()) == null) ? new MpStgyParam((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, -1, -1, 3, (DefaultConstructorMarker) null) : stgyParam;
    }

    @Override // o.AbstractC51317vkj
    public C55887xsS copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return super.copydefault(str, "BTC-" + AEQbTJ().getInvestCcy());
    }

    @Override // o.AbstractC51317vkj
    public void KWHzl(@NotNull CopyBotReqParam copyBotReqParam, boolean z) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        if (C33129mqd.OLrzqt((java.lang.Object) copyBotReqParam.getQuoteSz(), (java.lang.Object) 0)) {
            return;
        }
        xAR xar = this.KWHzl;
        java.lang.String quoteSz = copyBotReqParam.getQuoteSz();
        Intrinsics.copydefault((java.lang.Object) quoteSz);
        xar.copydefault(AhwBna(quoteSz));
        xar.AEQbTJ(fvQaOB());
        xKK.Activity.execute$default(xar, 0L, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RecurringOrderData AhwBna(java.lang.String str) {
        boolean z;
        xOW newProxyInstance;
        java.util.ArrayList<RecurringListItem> recurringList = AEQbTJ().getRecurringList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(recurringList, 10));
        for (RecurringListItem recurringListItem : recurringList) {
            java.lang.String ccy = recurringListItem.getCcy();
            if (ccy == null) {
                ccy = "";
            }
            arrayList.add(new CoinRatioParam(ccy, recurringListItem.getRatio(), recurringListItem.getMinPrice(), recurringListItem.getMaxPrice()));
        }
        int offset = new GregorianCalendar().getTimeZone().getOffset(java.lang.System.currentTimeMillis()) / 3600000;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            z = false;
        } else {
            z = true;
            if (!newProxyInstance.gEmmrt()) {
            }
        }
        return new RecurringOrderData(arrayList, AYXKKw(), AEQbTJ().getPeriod(), AEQbTJ().getRecurringDay(), AEQbTJ().getRecurringTime(), AEQbTJ().getRecurringHour(), java.lang.String.valueOf(offset), str, AEQbTJ().getInvestCcy(), z ? "cross" : "cash", AEQbTJ().getAlgoId(), fFgQHt().AEQbTJ("recurring"), (java.util.List) null, (java.lang.Integer) null, 12288, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC51317vkj
    public void aKErDB() {
        java.util.ArrayList<RecurringListItem> recurringList = AEQbTJ().getRecurringList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(recurringList, 10));
        for (RecurringListItem recurringListItem : recurringList) {
            arrayList.add(new CoinRatioParam(recurringListItem.getCcy(), recurringListItem.getRatio(), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
        }
        C56183xxx c56183xxx = this.AEQbTJ;
        c56183xxx.AEQbTJ(new MinInvestReq(AEQbTJ().getInvestCcy(), arrayList, fFgQHt().AEQbTJ("recurring")));
        c56183xxx.KWHzl(new Function1() { // from class: o.vko
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51320vkm.AEQbTJ(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56183xxx, 0L, 1, null);
    }

    @Override // o.AbstractC51317vkj
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        gGvvIC().setValue("");
    }

    @Override // o.AbstractC51317vkj
    public void RcXXUw() {
        java.lang.String strAEQbTJ = fFgQHt().AEQbTJ("recurring");
        pUU.EZpvd("USDRename", "sub Available balance Recurring, instId:" + fFgQHt().gEmmrt() + ", tradeQuoteCcy=" + strAEQbTJ);
        ActionBar actionBar = new ActionBar(strAEQbTJ, this, fFgQHt().gEmmrt(), fFgQHt().djBIcL(), "cash", "base_ccy");
        this.copydefault.clear();
        this.copydefault.add(actionBar);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.vkm$ActionBar */
    public static final class ActionBar extends AbstractC55740xpe {
        public final /* synthetic */ C51320vkm copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(java.lang.String str, C51320vkm c51320vkm, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super(null, null, str3, str2, null, "", str4, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE, null, null, "", "", str5, null, null, null, null, null, str, 509459, null);
            this.copydefault = c51320vkm;
        }

        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            if (maxAvailableResp != null) {
                this.copydefault.flVtFt().postValue(maxAvailableResp.getAvailable());
            }
            this.copydefault.EZpvd = xdm;
        }
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String values() {
        return C33070mpX.AYXKKw(C55688xof.Application.setSessionImpl);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AkhnZx() {
        return CollectionsKt___CollectionsKt.joinToString$default(DbNXlk(), null, null, null, 3, null, null, 55, null);
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AYXKKw() {
        java.lang.String strAYXKKw;
        MpStgyInfo mpStgyInfo;
        MpStgyParam stgyParam;
        java.util.ArrayList<RecurringListItem> recurringList;
        java.util.List<MpStgyInfo> value = hUfVAv().getValue();
        if (C33129mqd.AEQbTJ((value == null || (mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (stgyParam = mpStgyInfo.getStgyParam()) == null || (recurringList = stgyParam.getRecurringList()) == null) ? null : java.lang.Integer.valueOf(recurringList.size()), 1)) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getName);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setSessionImpl);
        }
        return AkhnZx() + " " + strAYXKKw;
    }

    @Override // o.AbstractC51317vkj
    public BotGuideData djBIcL() {
        return new BotGuideData(C33069mpW.copydefault(C55688xof.Application.DGgkXd, C56423yEv.EZpvd(C56390yDp.OLrzqt(C51330vkw.Companion.EZpvd(), C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherKtaddCallbackcallback1)))), C33070mpX.AYXKKw(C55688xof.Application.AuCTelauCTel), C33070mpX.AYXKKw(C55688xof.Application.UkuJRw), "recurring", yDY.gEmmrt(new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.DDNONI), C33070mpX.AYXKKw(C55688xof.Application.UNDaji)), new BotGuideItem(C33070mpX.AYXKKw(C55688xof.Application.m), C33070mpX.AYXKKw(C55688xof.Application.UnZVfq))), new BotGuideLinkItem(C33070mpX.AYXKKw(C55688xof.Application.getLauncher), C33070mpX.AYXKKw(C55688xof.Application.OYuSWK)), null, 0, null, null, 960, null);
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> fARcdN() {
        java.util.ArrayList<java.lang.Object> arrayListOLrzqt = OLrzqt();
        PriceRangeInfo priceRangeInfoEZpvd = EZpvd(true, false);
        if (priceRangeInfoEZpvd != null) {
            arrayListOLrzqt.add(priceRangeInfoEZpvd);
        }
        return arrayListOLrzqt;
    }

    public final java.util.ArrayList<java.lang.Object> OLrzqt() {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatRepeatMode), EZpvd(AEQbTJ().getPeriod(), AEQbTJ().getRecurringDay(), AEQbTJ().getRecurringHour()), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatState), KWHzl(AEQbTJ().getRecurringTime()), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        arrayList.add(EZpvd());
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> wlaJM() {
        java.util.ArrayList<java.lang.Object> arrayListOLrzqt = OLrzqt();
        PriceRangeInfo priceRangeInfoEZpvd = EZpvd(false, true);
        if (priceRangeInfoEZpvd != null) {
            arrayListOLrzqt.add(priceRangeInfoEZpvd);
        }
        if (!C56071xvr.gEmmrt.EZpvd(AEQbTJ().getProfitSharingRatio())) {
            arrayListOLrzqt.add(0, new C55848xrg(C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG), 0, 0, false, 28, null));
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
            java.lang.String username = copydefault().getUsername();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username)) {
                username = "--";
            }
            arrayListOLrzqt.add(0, new BotParamItemData(strAYXKKw, username, null, null, false, false, copydefault().getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null));
        }
        return arrayListOLrzqt;
    }

    @Override // o.AbstractC51317vkj
    public java.util.ArrayList<java.lang.Object> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        if (!C56071xvr.gEmmrt.EZpvd(AEQbTJ().getProfitSharingRatio())) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UCQKYV);
            java.lang.String username = copydefault().getUsername();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) username)) {
                username = "--";
            }
            arrayList.add(new BotParamItemData(strAYXKKw, username, null, null, false, false, copydefault().getAvatar(), null, java.lang.Integer.valueOf(C48033uCm.ActionBar.djBIcL), true, 0, 0, 0, 0, 15548, null));
        }
        java.lang.String strKWHzl = fFgQHt().KWHzl("recurring");
        if (strKWHzl == null) {
            strKWHzl = AEQbTJ().getInvestCcy();
        }
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.attributeId), EZpvd(AEQbTJ().getPeriod(), AEQbTJ().getRecurringDay(), AEQbTJ().getRecurringHour()), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.setState), xMR.copydefault.copydefault(str) + " " + strKWHzl, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.lang.String strKWHzl2 = fFgQHt().KWHzl("recurring");
        if (strKWHzl2 != null) {
            arrayList.add(new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1), strKWHzl2, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        }
        arrayList.add(EZpvd());
        PriceRangeInfo priceRangeInfoEZpvd = EZpvd(true, false);
        if (priceRangeInfoEZpvd != null) {
            arrayList.add(priceRangeInfoEZpvd);
        }
        arrayList.add(new CoinTipsData(C33070mpX.AYXKKw(C55688xof.Application.sendSessionEvent), C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomAction1), 4.0f, true));
        arrayList.add(new NoConfirmData(false));
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String zsXlph() {
        return C33069mpW.copydefault(C55688xof.Application.sJqpAA, C56423yEv.EZpvd(C56390yDp.OLrzqt("dateTime", C56046xvS.AEQbTJ.OLrzqt(AEQbTJ().getPeriod(), AEQbTJ().getRecurringDay(), AEQbTJ().getRecurringHour(), AEQbTJ().getRecurringTime()))));
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<xKK> QbewEr() {
        return yDY.gEmmrt(this.KWHzl, this.AEQbTJ);
    }

    @Override // o.AbstractC51317vkj
    public android.os.Parcelable fetchVPNInfo() {
        return AhwBna("");
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        Intrinsics.checkNotNullParameter(str, "");
        C55887xsS c55887xsSFFgQHt = fFgQHt();
        C54571xNh c54571xNhEZpvd = c55887xsSFFgQHt.EZpvd(str, true, c55887xsSFFgQHt.AEQbTJ("recurring"));
        if (c54571xNhEZpvd != null && (c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            java.lang.String safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
            if (safeString$default != null) {
                BizInstrument bizInstrumentAhwBna = c55887xsSFFgQHt.AhwBna();
                pUU.EZpvd("USDRename", "Copy Order, botType:recurring, " + (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.joinCcyRelevantToString() : null) + ", formatted available balance: " + safeString$default);
                return safeString$default;
            }
        }
        return "--";
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = "BTC-" + AEQbTJ().getInvestCcy();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, AEQbTJ().getInstType(), str3, null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(AEQbTJ().getInstType())) == null) {
            return "";
        }
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(instFamily, AEQbTJ().getInvestCcy());
        return (c54571xNhAhwBna == null || (c54536xMLAYXKKw = c54571xNhAhwBna.AYXKKw(C33129mqd.mulS$default(str, str2, null, null, null, 14, null))) == null || (c54536xMLCopydefault = c54536xMLAYXKKw.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String getFieldNames() {
        java.lang.String strCopydefault = fFgQHt().copydefault("recurring");
        return (strCopydefault == null || strCopydefault.length() == 0) ? AEQbTJ().getInvestCcy() : strCopydefault;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAhwBna = xMR.copydefault.AhwBna(str, ejfBZ());
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        return "≥ " + strAhwBna;
    }

    @Override // o.AbstractC51317vkj
    public java.lang.String QfsBiF() {
        return fFgQHt().copydefault("recurring");
    }

    @Override // o.AbstractC51317vkj
    public java.util.List<java.lang.String> DbNXlk() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(copydefault().getCcy());
        return arrayList;
    }

    @Override // o.AbstractC51317vkj
    public kotlin.Pair<java.lang.Boolean, java.lang.String> AEQbTJ(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        java.lang.String value = giSNqX().getValue();
        if (value == null) {
            value = "";
        }
        java.lang.String str = xMR.copydefault.AhwBna(value, ejfBZ()) + " " + getFieldNames();
        if (C33129mqd.copydefault(copyBotReqParam.getQuoteSz(), value)) {
            return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
        }
        return new kotlin.Pair<>(java.lang.Boolean.FALSE, C33069mpW.copydefault(C55688xof.Application.HalfFloat, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str))));
    }

    @Override // o.AbstractC51317vkj
    public void djSkpj() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.copydefault);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strCopydefault;
        int iHashCode = str.hashCode();
        java.lang.String str4 = "--";
        if (iHashCode != -791707519) {
            if (iHashCode == 95346201) {
                if (str.equals("daily")) {
                    strCopydefault = C33070mpX.AYXKKw(C55688xof.Application.setActive);
                }
            } else {
                strCopydefault = (iHashCode == 1236635661 && str.equals("monthly")) ? C33070mpX.AYXKKw(C55688xof.Application.mask) : "--";
            }
        } else if (str.equals("weekly")) {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.zCTncp, C56423yEv.EZpvd(C56390yDp.OLrzqt("weekDay", copydefault(str2))));
        }
        if (xMP.AEQbTJ.AEQbTJ()) {
            int iHashCode2 = str.hashCode();
            if (iHashCode2 != -791707519) {
                if (iHashCode2 != 95346201) {
                    if (iHashCode2 == 1236635661 && str.equals("monthly")) {
                        str4 = str2 + C33070mpX.AYXKKw(C55688xof.Application.getIcon);
                    }
                } else if (str.equals("daily")) {
                    str4 = "";
                }
            } else if (str.equals("weekly")) {
            }
        } else {
            int iHashCode3 = str.hashCode();
            if (iHashCode3 != -791707519) {
                if (iHashCode3 != 95346201) {
                    if (iHashCode3 == 1236635661 && str.equals("monthly")) {
                        str4 = C33070mpX.AYXKKw(C55688xof.Application.getIcon) + " " + str2;
                    }
                } else if (str.equals("daily")) {
                }
            } else if (str.equals("weekly")) {
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "hourly")) {
            return RecurringHourlyConfig.Companion.EZpvd(str3);
        }
        return strCopydefault + " " + str4;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return RecurringWeekConfig.Companion.OLrzqt(C33129mqd.AhwBna(str));
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return str.length() == 0 ? "--" : C56046xvS.AEQbTJ.AEQbTJ(C33129mqd.AhwBna(str));
    }

    public final SmartCoinsData EZpvd() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (RecurringListItem recurringListItem : AEQbTJ().getRecurringList()) {
            if (!Intrinsics.EZpvd((java.lang.Object) recurringListItem.getCcy(), (java.lang.Object) AEQbTJ().getInvestCcy())) {
                java.lang.String ccy = recurringListItem.getCcy();
                java.lang.String percent$default = xMR.formatPercent$default(xMR.copydefault, recurringListItem.getRatio(), 2, 0, null, 8, null);
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                arrayList.add(new DistributeItem(ccy, 0, percent$default, interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(recurringListItem.getCcy()) : null, 0, 18, (DefaultConstructorMarker) null));
            }
        }
        return new SmartCoinsData(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatErrorCode), arrayList, false, 0.0f, 4, null);
    }

    public final PriceRangeInfo EZpvd(boolean z, boolean z2) {
        java.util.ArrayList<RecurringListItem> recurringList = AEQbTJ().getRecurringList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : recurringList) {
            RecurringListItem recurringListItem = (RecurringListItem) obj;
            if (recurringListItem.getMinPrice().length() > 0 || recurringListItem.getMaxPrice().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return new PriceRangeInfo(C33070mpX.AYXKKw(C55688xof.Application.UlpNxW), AEQbTJ().getInvestCcy(), arrayList, z, z2);
        }
        return null;
    }

    public static final Unit AEQbTJ(C51320vkm c51320vkm, ResponseData responseData) {
        MinInvestResp minInvestResp;
        java.lang.String minInvestment;
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String str = "0";
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            C56111xwe<java.lang.String> c56111xweGiSNqX = c51320vkm.giSNqX();
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null && (minInvestResp = (MinInvestResp) CollectionsKt___CollectionsKt.firstOrNull(list)) != null && (minInvestment = minInvestResp.getMinInvestment()) != null) {
                str = minInvestment;
            }
            c56111xweGiSNqX.postValue(str);
        } else {
            c51320vkm.giSNqX().postValue("0");
            pUU.copydefault("RecurringPresenter", "reqMinInvest fail cause by: " + responseData.getMsg());
        }
        return Unit.INSTANCE;
    }
}
