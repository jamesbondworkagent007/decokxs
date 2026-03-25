package o;

import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.BotItemSwitchData;
import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListData;
import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListItemData;
import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.SignalBtnItemData;
import com.okinc.unify_trade.biz.CustomerSignalsData;
import com.okinc.unify_trade.biz.CustomerSignalsItem;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51716vsK implements InterfaceC54501xKt<java.util.List<? extends CustomerSignalsData>, MySignalListData> {
    public final boolean OLrzqt = C56002xub.KWHzl.AEQbTJ();

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015c  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MySignalListData KWHzl(@NotNull java.util.List<CustomerSignalsData> list) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(list, "");
        MySignalListData mySignalListData = new MySignalListData(null, null, null, 7, null);
        java.util.ArrayList<MySignalListItemData> arrayList = new java.util.ArrayList<>();
        CustomerSignalsData customerSignalsData = (CustomerSignalsData) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (customerSignalsData != null) {
            for (CustomerSignalsItem customerSignalsItem : customerSignalsData.getSignals()) {
                boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) customerSignalsItem.getType(), (java.lang.Object) "subscribed");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (zEZpvd) {
                    arrayList2.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.SqfPTR), C56108xwb.EZpvd(customerSignalsItem.getUserSubscriptionType(), customerSignalsItem.getSubscriptionFee(), customerSignalsItem.getProfitSharingRatio()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    arrayList2.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.Slwtri), C56108xwb.copydefault(customerSignalsItem.getUserSubscriptionType(), customerSignalsItem.getAutoRenewal(), customerSignalsItem.getSubscriptionExpireTime()), false, 0, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777148, (DefaultConstructorMarker) null));
                    if (Intrinsics.EZpvd((java.lang.Object) customerSignalsItem.getUserSubscriptionType(), (java.lang.Object) "subscription") && customerSignalsItem.getAutoRenewal() && this.OLrzqt) {
                        arrayList2.add(new BotItemSwitchData(C33070mpX.AYXKKw(C55688xof.Application.DdI), true));
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                if (zEZpvd) {
                    java.lang.String userSubscriptionType = customerSignalsItem.getUserSubscriptionType();
                    if (userSubscriptionType != null) {
                        int iHashCode = userSubscriptionType.hashCode();
                        if (iHashCode != 3151468) {
                            if (iHashCode != 341203229) {
                                if (iHashCode == 413749729 && userSubscriptionType.equals("profit_sharing")) {
                                    arrayList3.add(new SignalBtnItemData("signal_detail", C33070mpX.AYXKKw(C55688xof.Application.WFXFk), false, 4, null));
                                    arrayList3.add(new SignalBtnItemData("use_signal", C33070mpX.AYXKKw(C55688xof.Application.shErWi), false, 4, null));
                                }
                            } else if (userSubscriptionType.equals("subscription")) {
                                if (KWHzl(customerSignalsItem)) {
                                    arrayList3.add(new SignalBtnItemData("renew_signal", C33070mpX.AYXKKw(C55688xof.Application.hCiIDQ), copydefault(customerSignalsItem)));
                                }
                                arrayList3.add(new SignalBtnItemData("signal_detail", C33070mpX.AYXKKw(C55688xof.Application.WFXFk), OLrzqt(customerSignalsItem)));
                                arrayList3.add(new SignalBtnItemData("use_signal", C33070mpX.AYXKKw(C55688xof.Application.shErWi), false, 4, null));
                            }
                        } else if (userSubscriptionType.equals("free")) {
                        }
                    }
                } else {
                    arrayList3.add(new SignalBtnItemData("view_signal_config", C33070mpX.AYXKKw(C55688xof.Application.onRelationshipValidationResult), false, 4, null));
                    arrayList3.add(new SignalBtnItemData("use_signal", C33070mpX.AYXKKw(C55688xof.Application.shErWi), false, 4, null));
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) customerSignalsItem.getSignalDescription())) {
                    strAYXKKw = customerSignalsItem.getSignalDescription();
                    Intrinsics.copydefault((java.lang.Object) strAYXKKw);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.newSessionWithExtras);
                }
                arrayList.add(new MySignalListItemData(zEZpvd, arrayList2, arrayList3, strAYXKKw, customerSignalsItem));
            }
            mySignalListData.AEQbTJ(customerSignalsData.getPage());
            mySignalListData.copydefault(customerSignalsData.getTotalCount());
            mySignalListData.KWHzl(arrayList);
        }
        return mySignalListData;
    }

    public final boolean copydefault(CustomerSignalsItem customerSignalsItem) {
        return KWHzl(customerSignalsItem) && C33129mqd.AEQbTJ(customerSignalsItem.getSubscriptionFee(), 0);
    }

    public final boolean KWHzl(CustomerSignalsItem customerSignalsItem) {
        return this.OLrzqt && !customerSignalsItem.getAutoRenewal() && C33129mqd.OLrzqt((java.lang.CharSequence) customerSignalsItem.getSubscriptionExpireTime());
    }

    public final boolean OLrzqt(CustomerSignalsItem customerSignalsItem) {
        java.lang.String subscriptionFee;
        java.lang.String subscriptionExpireTime;
        return customerSignalsItem.getAutoRenewal() || !(((subscriptionFee = customerSignalsItem.getSubscriptionFee()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) subscriptionFee)) && ((subscriptionExpireTime = customerSignalsItem.getSubscriptionExpireTime()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) subscriptionExpireTime)));
    }
}
