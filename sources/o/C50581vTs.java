package o;

import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.itembinder.SignalBotConfirmData;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.util.signalBot.SignalBotAdvancedData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vTs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50581vTs extends AbstractC50583vTu {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public StrategyBaseReq AEQbTJ;
    public final java.lang.String EZpvd = "USDT";
    public SignalBotReq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "SignalBotOrderConfirmDFragment";
    }

    /* JADX INFO: renamed from: o.vTs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vTs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C50581vTs EZpvd(@NotNull StrategyBaseReq strategyBaseReq, @NotNull SignalBotReq signalBotReq) {
            Intrinsics.checkNotNullParameter(strategyBaseReq, "");
            Intrinsics.checkNotNullParameter(signalBotReq, "");
            android.os.Bundle bundle = new android.os.Bundle();
            C50581vTs c50581vTs = new C50581vTs();
            bundle.putParcelable("signalBotReq", signalBotReq);
            bundle.putParcelable("baseReq", strategyBaseReq);
            c50581vTs.setArguments(bundle);
            return c50581vTs;
        }
    }

    @Override // o.AbstractC50583vTu, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.copydefault = arguments != null ? (SignalBotReq) arguments.getParcelable("signalBotReq") : null;
        android.os.Bundle arguments2 = getArguments();
        this.AEQbTJ = arguments2 != null ? (StrategyBaseReq) arguments2.getParcelable("baseReq") : null;
        super.onViewCreated(view, bundle);
        AuCTelauCTel();
    }

    private final void AuCTelauCTel() {
        djBIcL(copydefault());
        java.lang.String string = getString(C55688xof.Application.fdazkH);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AhwBna(string);
        SignalBotReq signalBotReq = this.copydefault;
        gEmmrt(C56033xvF.getBotLever$default(signalBotReq != null ? signalBotReq.getLever() : null, false, 2, null));
        AEQbTJ(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0148  */
    @Override // o.AbstractC50583vTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> EZpvd() {
        ThirdSignalDetail signalItem;
        java.util.ArrayList<java.lang.String> instIds;
        java.lang.String titleByIdAndType$default;
        java.lang.String str;
        java.lang.String totalAmt;
        AutoVipProfitInfo vipProfit;
        AutoVipProfitInfo vipProfit2;
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.util.ArrayList arrayList;
        java.lang.String tradeSymbol;
        BizInstrument suggestedInstrument$default;
        java.util.ArrayList<SignalCoinPairItemData> totalCoinPairs;
        java.util.ArrayList<SignalCoinPairItemData> totalCoinPairs2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        SignalBotReq signalBotReq = this.copydefault;
        if (signalBotReq == null || (signalItem = signalBotReq.getSignalItem()) == null) {
            return yDY.AhwBna();
        }
        arrayList2.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat1), 5.0f, 5.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
        java.lang.String string = getString(C55688xof.Application.apHBvG);
        java.lang.String string2 = "";
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String signalChanName = signalItem.getSignalChanName();
        arrayList2.add(new TacticsInsideItemData(string, signalChanName == null ? "" : signalChanName, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (Intrinsics.EZpvd((java.lang.Object) signalItem.getType(), (java.lang.Object) "subscribed")) {
            java.lang.String string3 = getString(C55688xof.Application.SqfPTR);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            arrayList2.add(new TacticsInsideItemData(string3, C56108xwb.EZpvd(signalItem.getSubscriptionType(), signalItem.getSubscriptionFee(), signalItem.getProfitSharingRatio()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String string4 = getString(C55688xof.Application.zbGDDc);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            java.lang.String username = signalItem.getUsername();
            java.lang.String str2 = username == null ? "" : username;
            java.lang.String avatar = signalItem.getAvatar();
            arrayList2.add(new ItemData(string4, str2, false, 0, avatar == null ? "" : avatar, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, true, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16769004, (DefaultConstructorMarker) null));
        }
        SignalBotReq signalBotReq2 = this.copydefault;
        if (signalBotReq2 == null || (totalCoinPairs = signalBotReq2.getTotalCoinPairs()) == null || !C33129mqd.KWHzl((java.util.Collection) totalCoinPairs)) {
            SignalBotReq signalBotReq3 = this.copydefault;
            instIds = signalBotReq3 != null ? signalBotReq3.getInstIds() : null;
        } else {
            SignalBotReq signalBotReq4 = this.copydefault;
            if (signalBotReq4 != null && (totalCoinPairs2 = signalBotReq4.getTotalCoinPairs()) != null) {
                instIds = new java.util.ArrayList<>(C56403yEb.AYXKKw(totalCoinPairs2, 10));
                java.util.Iterator<T> it = totalCoinPairs2.iterator();
                while (it.hasNext()) {
                    instIds.add(((SignalCoinPairItemData) it.next()).getInstId());
                }
            }
        }
        if (C33129mqd.AEQbTJ(instIds != null ? java.lang.Integer.valueOf(instIds.size()) : null, 1)) {
            if (instIds == null) {
                arrayList = new java.util.ArrayList();
            } else {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(instIds, 10));
                for (java.lang.String str3 : instIds) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", str3, null, null, 12, null)) == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
                        tradeSymbol = "";
                    }
                    arrayList.add(tradeSymbol);
                }
            }
            java.lang.String string5 = getString(C55688xof.Application.HJWChPfrwjPh);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            arrayList2.add(new SignalBotConfirmData(string5, arrayList));
        } else {
            if (C33129mqd.OLrzqt((java.lang.Object) (instIds != null ? java.lang.Integer.valueOf(instIds.size()) : null), (java.lang.Object) 1)) {
                titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, (instIds == null || (str = instIds.get(0)) == null) ? "" : str, "SWAP", false, false, 12, null);
            } else {
                titleByIdAndType$default = "";
            }
            java.lang.String string6 = getString(C55688xof.Application.HJWChPfrwjPh);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            arrayList2.add(new TacticsInsideItemData(string6, titleByIdAndType$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String sizeDig = (interfaceC54581xNrCopydefault == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna(this.EZpvd)) == null) ? null : tradeCoinInfoAhwBna.getSizeDig();
        int iAhwBna = (sizeDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sizeDig)) ? 4 : C33129mqd.AhwBna(sizeDig);
        java.lang.String string7 = getString(C55688xof.Application.ActivityComposeUtilsKt);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        xMR xmr = xMR.copydefault;
        SignalBotReq signalBotReq5 = this.copydefault;
        if (signalBotReq5 == null || (totalAmt = signalBotReq5.getTotalAmt()) == null) {
            totalAmt = "";
        }
        arrayList2.add(new TacticsInsideItemData(string7, xmr.copydefault(totalAmt, iAhwBna) + " " + this.EZpvd, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        SignalBotReq signalBotReq6 = this.copydefault;
        if (C33129mqd.KWHzl((java.util.Collection) ((signalBotReq6 == null || (vipProfit2 = signalBotReq6.getVipProfit()) == null) ? null : vipProfit2.getAutoEarn()))) {
            C54149wys c54149wys = C54149wys.AEQbTJ;
            SignalBotReq signalBotReq7 = this.copydefault;
            c54149wys.AEQbTJ(arrayList2, signalBotReq7 != null ? signalBotReq7.getVipProfit() : null);
        } else {
            SignalBotReq signalBotReq8 = this.copydefault;
            if (C33129mqd.KWHzl((java.util.Collection) ((signalBotReq8 == null || (vipProfit = signalBotReq8.getVipProfit()) == null) ? null : vipProfit.getAutoStake()))) {
            }
        }
        arrayList2.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat3), 16.0f, 5.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
        java.lang.String string8 = getString(C55688xof.Application.OsDdEf);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        C56048xvU c56048xvU = C56048xvU.EZpvd;
        arrayList2.add(new TacticsInsideItemData(string8, c56048xvU.EZpvd(AEQbTJ()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String string9 = getString(C55688xof.Application.newSession);
        Intrinsics.checkNotNullExpressionValue(string9, "");
        arrayList2.add(new TacticsInsideItemData(string9, c56048xvU.OLrzqt(AEQbTJ()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String string10 = getString(C55688xof.Application.mayLaunchUrl);
        Intrinsics.checkNotNullExpressionValue(string10, "");
        arrayList2.add(new TacticsInsideItemData(string10, c56048xvU.copydefault(AEQbTJ()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String type = signalItem.getType();
        if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "subscribed")) {
            SignalBotReq signalBotReq9 = this.copydefault;
            if (signalBotReq9 != null && signalBotReq9.getContainsUnSupportPair()) {
                string2 = getString(C55688xof.Application.QzqeNH);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "created")) {
            string2 = getString(C55688xof.Application.openFileOutput);
        }
        java.lang.String str4 = string2;
        Intrinsics.copydefault((java.lang.Object) str4);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            arrayList2.add(new CoinTipsData(str4, (java.lang.String) null, 0.0f, false, 14, (DefaultConstructorMarker) null));
        }
        return arrayList2;
    }

    @Override // o.AbstractC50583vTu
    public void OLrzqt() {
        C56028xvA.OLrzqt("make_order", C56424yEw.gEmmrt(C56390yDp.OLrzqt("baseReq", C33129mqd.gEmmrt(this.AEQbTJ)), C56390yDp.OLrzqt("mSignalBotReq", C33129mqd.gEmmrt(this.copydefault))));
        dismissAllowingStateLoss();
        getParentFragmentManager().setFragmentResult("bot_order", new android.os.Bundle());
    }

    @Override // o.AbstractC50583vTu
    public void bx_() {
        values().register(SignalBotConfirmData.class, new vZN(new Function0() { // from class: o.vTq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50581vTs.EZpvd(this.EZpvd);
            }
        }));
        values().register(ItemData.class, new wNH(null, null, null, null, null, 31, null));
    }

    public static final Unit EZpvd(C50581vTs c50581vTs) {
        SignalBotReq signalBotReq = c50581vTs.copydefault;
        if (signalBotReq != null) {
            if (!signalBotReq.getTotalCoinPairs().isEmpty()) {
                C50741vZq c50741vZqOLrzqt = C50741vZq.Companion.OLrzqt(signalBotReq);
                androidx.fragment.app.FragmentManager childFragmentManager = c50581vTs.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c50741vZqOLrzqt.show(childFragmentManager);
            } else {
                vYH.Companion.AEQbTJ(signalBotReq).show(c50581vTs.getChildFragmentManager(), "SignalBotInstIdsDialog");
            }
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault() {
        SignalBotReq signalBotReq = this.copydefault;
        if (signalBotReq == null) {
            return "";
        }
        Intrinsics.copydefault(signalBotReq);
        java.util.ArrayList<java.lang.String> instIds = signalBotReq.getInstIds();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(instIds, 10));
        java.util.Iterator<T> it = instIds.iterator();
        while (it.hasNext()) {
            arrayList.add(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, (java.lang.String) it.next(), "SWAP", false, false, 12, null));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    /* JADX DEBUG: Possible override for method o.vTu.AEQbTJ()V */
    public final SignalBotAdvancedData AEQbTJ() {
        java.lang.String subOrdType;
        SignalBotReq signalBotReq = this.copydefault;
        if (signalBotReq == null || (subOrdType = signalBotReq.getSubOrdType()) == null) {
            subOrdType = "";
        }
        java.lang.String str = subOrdType;
        SignalBotReq signalBotReq2 = this.copydefault;
        java.lang.String ratio = signalBotReq2 != null ? signalBotReq2.getRatio() : null;
        SignalBotReq signalBotReq3 = this.copydefault;
        EntrySignalOrderAmtParam signalOrderAmtParam = signalBotReq3 != null ? signalBotReq3.getSignalOrderAmtParam() : null;
        SignalBotReq signalBotReq4 = this.copydefault;
        ExitSignalOrderAmtParam signalBotOrderStopParam = signalBotReq4 != null ? signalBotReq4.getSignalBotOrderStopParam() : null;
        SignalBotReq signalBotReq5 = this.copydefault;
        return new SignalBotAdvancedData(str, ratio, signalOrderAmtParam, signalBotOrderStopParam, signalBotReq5 != null ? signalBotReq5.getAllowMultipleEntry() : false);
    }
}
