package o;

import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotSwitchItemData;
import com.okinc.tradingbot.impl.strategy.bean.SignalDetailCard;
import com.okinc.tradingbot.impl.strategy.bean.SignalSubsData;
import com.okinc.tradingbot.impl.strategy.bean.SignalTypeData;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53872wtg implements InterfaceC54501xKt<java.util.List<? extends SignalDetails>, SignalDetailCard> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public SignalDetails AEQbTJ = new SignalDetails(null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 67108863, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalDetails copydefault() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.wtg$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wtg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public SignalDetailCard KWHzl(@NotNull java.util.List<SignalDetails> list) {
        java.util.List listSplit$default;
        java.lang.String strValueOf;
        Intrinsics.checkNotNullParameter(list, "");
        SignalDetails signalDetails = (SignalDetails) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (signalDetails == null) {
            signalDetails = new SignalDetails(null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 67108863, null);
        }
        this.AEQbTJ = signalDetails;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.AEQbTJ.isSubscribed()) {
            arrayList.add(KWHzl(this.AEQbTJ.getUserSubscriptionType()));
        } else {
            java.lang.String subscriptionType = this.AEQbTJ.getSubscriptionType();
            if (subscriptionType != null) {
                for (java.lang.String str : C56002xub.KWHzl.KWHzl(subscriptionType)) {
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "subscription")) {
                        arrayList.add(C33069mpW.copydefault(C55688xof.Application.RIsQag, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xMR.copydefault.copydefault(this.AEQbTJ.getSubscriptionFee())))));
                    } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "profit_sharing")) {
                        arrayList.add(C33069mpW.copydefault(C55688xof.Application.RhlVAI, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xMR.copydefault, this.AEQbTJ.getProfitSharingRatio(), 0, null, 4, null)))));
                    } else {
                        arrayList.add(C33070mpX.AYXKKw(C55688xof.Application.glXhWM));
                    }
                }
            }
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.QYvkLl);
        xMR xmr = xMR.copydefault;
        java.util.List listGEmmrt = yDY.gEmmrt(new BotParamItemData(strAYXKKw, xMR.formatPercent$default(xmr, this.AEQbTJ.getFollowerWinRate(), 0, null, 6, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null), new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.DRuYWY), xmr.copydefault(this.AEQbTJ.getTotalFollowerCount()), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null), new BotParamItemData(C33069mpW.copydefault(C55688xof.Application.RjCdvp, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, this.AEQbTJ.getCcy()))), xMR.formatDownToFixed$default(xmr, this.AEQbTJ.getTotalFollowerAssets(), 0, 2, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null), new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.SePrCP), xmr.copydefault(this.AEQbTJ.getTriggerCount7d()), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String instIds = this.AEQbTJ.getInstIds();
        if (instIds != null && (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) instIds, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) != null) {
            java.util.Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                java.lang.String upperCase = TaskDescription.AEQbTJ((java.lang.String) it.next()).copydefault().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt != null && (strValueOf = interfaceC54581xNrOLrzqt.valueOf(upperCase)) != null) {
                    arrayList2.add(strValueOf);
                }
            }
        }
        SignalDetails signalDetails2 = this.AEQbTJ;
        java.lang.String signalChanName = signalDetails2.getSignalChanName();
        java.lang.String signalDescription = this.AEQbTJ.getSignalDescription();
        return new SignalDetailCard(signalDetails2, signalChanName, signalDescription == null ? "" : signalDescription, arrayList, listGEmmrt, arrayList2, this.AEQbTJ.getTickType());
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "subscription")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OFqMGB);
        } else {
            strAYXKKw = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "profit_sharing") ? C33070mpX.AYXKKw(C55688xof.Application.ardYFU) : C33070mpX.AYXKKw(C55688xof.Application.glXhWM);
        }
        return strAYXKKw + " | " + C33070mpX.AYXKKw(C55688xof.Application.registerKeyboardTarget);
    }

    public final java.util.List<SignalTypeData> KWHzl() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String subscriptionType = this.AEQbTJ.getSubscriptionType();
        if (subscriptionType != null) {
            for (java.lang.String str : C56002xub.KWHzl.KWHzl(subscriptionType)) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "subscription")) {
                    arrayList.add(new SignalTypeData(str, C33070mpX.AYXKKw(C55688xof.Application.OFqMGB), C33070mpX.AYXKKw(C55688xof.Application.adevsa), C48033uCm.ActionBar.iwGUEr));
                } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "profit_sharing")) {
                    arrayList.add(new SignalTypeData(str, C33070mpX.AYXKKw(C55688xof.Application.ardYFU), C33070mpX.AYXKKw(C55688xof.Application.znKlvJ), C48033uCm.ActionBar.getNewProxyInstance));
                } else {
                    arrayList.add(new SignalTypeData(str, null, null, 0, 14, null));
                }
            }
        }
        return arrayList;
    }

    public final SignalDetails EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "subscription")) {
            return new SignalDetails(this.AEQbTJ.getSignalChanId(), this.AEQbTJ.getSignalChanName(), null, null, null, null, null, str, false, null, null, this.AEQbTJ.getSubscriptionExpireTime(), this.AEQbTJ.getSubscriptionFee(), null, null, null, null, this.AEQbTJ.getUsername(), this.AEQbTJ.getAvatar(), null, true, null, null, null, null, null, 65660796, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "profit_sharing")) {
            return new SignalDetails(this.AEQbTJ.getSignalChanId(), this.AEQbTJ.getSignalChanName(), null, null, null, null, null, str, false, null, null, null, null, null, this.AEQbTJ.getProfitSharingRatio(), null, null, this.AEQbTJ.getUsername(), this.AEQbTJ.getAvatar(), null, false, null, null, null, null, null, 66699132, null);
        }
        return new SignalDetails(this.AEQbTJ.getSignalChanId(), this.AEQbTJ.getSignalChanName(), null, null, null, null, null, str, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 67108732, null);
    }

    public final SignalSubsData OLrzqt(@NotNull SignalDetails signalDetails) {
        Intrinsics.checkNotNullParameter(signalDetails, "");
        java.lang.String subscriptionType = signalDetails.getSubscriptionType();
        java.lang.String str = subscriptionType == null ? "" : subscriptionType;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "subscription")) {
            java.lang.String strCopydefault = C33069mpW.copydefault(C55688xof.Application.RIsQag, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xMR.copydefault.copydefault(signalDetails.getSubscriptionFee()))));
            ItemData itemData = new ItemData(C33070mpX.AYXKKw(C55688xof.Application.zbGDDc), signalDetails.getUsername(), false, 0, signalDetails.getAvatar(), (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, true, (java.lang.String) null, (java.lang.String) null, 20, true, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16572396, (DefaultConstructorMarker) null);
            java.lang.String subscriptionExpireTime = signalDetails.getSubscriptionExpireTime();
            boolean zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) subscriptionExpireTime);
            java.lang.Object objValueOf = subscriptionExpireTime;
            if (zFARcdN) {
                objValueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            }
            return new SignalSubsData(str, C33070mpX.AYXKKw(C55688xof.Application.OFqMGB), strCopydefault, new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.SqfPTR), strCopydefault, null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null), null, itemData, new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.Slwtri), pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(C33129mqd.addS$default(objValueOf, 2592000000L, null, null, null, 14, null))), null, 1, null), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null), new BotSwitchItemData(C33070mpX.AYXKKw(C55688xof.Application.DdI), null, signalDetails.getAutoRenewal(), 2, null), new BotRemindData(signalDetails.getAutoRenewal() ? C33070mpX.AYXKKw(C55688xof.Application.Srftgn) : C33070mpX.AYXKKw(C55688xof.Application.ibrGus), C52761wXj.LoaderManager.RdAHlO, 0, null, 12, null), C48033uCm.ActionBar.iwGUEr, 16, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "profit_sharing")) {
            java.lang.String percent$default = xMR.formatPercent$default(xMR.copydefault, signalDetails.getProfitSharingRatio(), 0, null, 4, null);
            return new SignalSubsData(str, C33070mpX.AYXKKw(C55688xof.Application.ardYFU), C33069mpW.copydefault(C55688xof.Application.RhlVAI, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", percent$default))), null, new BotParamItemData(C33070mpX.AYXKKw(C55688xof.Application.SqfPTR), C33069mpW.copydefault(C55688xof.Application.RhlVAI, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", percent$default))), null, null, false, false, null, null, null, false, 0, 0, 0, 0, 16380, null), new ItemData(C33070mpX.AYXKKw(C55688xof.Application.zbGDDc), signalDetails.getUsername(), false, 0, signalDetails.getAvatar(), (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, true, (java.lang.String) null, (java.lang.String) null, 20, true, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16572396, (DefaultConstructorMarker) null), null, null, new BotRemindData(C33069mpW.copydefault(C55688xof.Application.zMXLsR, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", percent$default))), C52761wXj.LoaderManager.RdAHlO, 0, null, 12, null), C48033uCm.ActionBar.getNewProxyInstance, 200, null);
        }
        return new SignalSubsData(str, null, C33070mpX.AYXKKw(C55688xof.Application.glXhWM), null, null, null, null, null, null, 0, 1018, null);
    }
}
