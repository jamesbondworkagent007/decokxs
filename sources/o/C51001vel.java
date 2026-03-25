package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.RouteData;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC51071vgB;
import o.ActivityC51215vin;
import o.ActivityC52394wJu;
import o.C56058xve;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vel, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51001vel {
    public static final C51001vel copydefault = new C51001vel();

    private C51001vel() {
    }

    public final void copydefault(@NotNull final android.content.Context context, @NotNull final java.lang.String str, @NotNull final android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (C51004veo.OLrzqt.OLrzqt(context, str, bundle.getString("strategyType"), new Function0() { // from class: o.ven
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51001vel.AEQbTJ(context, str, bundle);
            }
        })) {
            return;
        }
        OLrzqt(context, str, bundle);
    }

    public static final Unit AEQbTJ(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        copydefault.OLrzqt(context, str, bundle);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=7] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String strAEQbTJ;
        java.lang.String strAEQbTJ2;
        java.lang.String string;
        java.lang.Object obj;
        java.lang.String string2;
        C56058xve.Activity activityCopydefault = C56058xve.Activity.Companion.copydefault(bundle);
        java.lang.String strCopydefault = activityCopydefault.copydefault();
        C56058xve.Companion.copydefault().AEQbTJ(activityCopydefault);
        switch (str.hashCode()) {
            case -1985222837:
                if (!str.equals("trade/main/strategy/guide")) {
                }
                java.lang.String string3 = bundle.getString("instId", "");
                java.lang.String strOLrzqt = RouteData.Companion.OLrzqt(java.lang.Integer.valueOf(bundle.getInt("bizType")));
                java.lang.String string4 = bundle.getString("strategyType", "");
                java.lang.String string5 = bundle.getString("source", "");
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("investType")));
                java.lang.String string6 = bundle.getString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "");
                java.lang.String string7 = bundle.getString("userRiskMode", "");
                java.lang.String string8 = bundle.getString("title", "");
                java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("algoIndexId", 0)));
                int i = bundle.getInt("batchNo", -1);
                java.lang.String string9 = i != -1 ? bundle.getString("batchNo", "") : C33129mqd.gEmmrt(java.lang.Integer.valueOf(i));
                ActivityC52394wJu.Application application = ActivityC52394wJu.Companion;
                Intrinsics.copydefault((java.lang.Object) string4);
                Intrinsics.copydefault((java.lang.Object) string3);
                Intrinsics.copydefault((java.lang.Object) string5);
                Intrinsics.copydefault((java.lang.Object) string6);
                Intrinsics.copydefault((java.lang.Object) string7);
                Intrinsics.copydefault((java.lang.Object) string8);
                Intrinsics.copydefault((java.lang.Object) string9);
                application.OLrzqt(context, string4, string3, strOLrzqt, string5, strGEmmrt, string6, string7, string8, strGEmmrt2, string9, strCopydefault);
                break;
            case -1512704542:
                if (!str.equals("trade/main/strategy/detail")) {
                }
                java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(java.lang.Long.valueOf(bundle.getLong("algoId")));
                java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("tabIndex")));
                java.lang.String strGEmmrt5 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("detailAction")));
                java.lang.String string10 = bundle.getString("strategyType");
                java.lang.String str2 = string10 != null ? string10 : "";
                ActivityC52272wFg.Companion.KWHzl(context, strGEmmrt3, str2, (984 & 8) != 0 ? null : strGEmmrt4, (984 & 16) != 0 ? "" : strGEmmrt5, (984 & 32) != 0 ? null : Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "ai_bot") ? 0 : null, (984 & 64) != 0 ? null : strCopydefault, (984 & 128) != 0 ? null : null, (984 & 256) != 0 ? false : bundle.getBoolean("backtest"), (984 & 512) != 0 ? false : bundle.getBoolean("delay"));
                break;
            case -1099868621:
                if (!str.equals("trade_bot/order/page")) {
                }
                java.lang.String string11 = bundle.getString("instId", "");
                java.lang.String strOLrzqt2 = RouteData.Companion.OLrzqt(java.lang.Integer.valueOf(bundle.getInt("bizType")));
                java.lang.String string12 = bundle.getString("botCategory");
                java.lang.String string13 = bundle.getString("strategyType");
                C55946xtY c55946xtY = C55946xtY.OLrzqt;
                strAEQbTJ = c55946xtY.AEQbTJ(string12, strOLrzqt2);
                strAEQbTJ2 = c55946xtY.AEQbTJ(strOLrzqt2);
                if (strAEQbTJ2 == null) {
                    strAEQbTJ2 = "";
                }
                if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
                    strAEQbTJ = strAEQbTJ2;
                }
                java.lang.String str3 = (string13 == null || string13.length() == 0) ? strAEQbTJ : string13;
                int i2 = bundle.getInt("intentFlag", -1);
                java.lang.String strGEmmrt6 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("recommendId")));
                Intrinsics.copydefault((java.lang.Object) string11);
                BotTradeData botTradeData = new BotTradeData(str3, string11, strOLrzqt2, copydefault(str, bundle), false, strGEmmrt6, (java.lang.String) null, true, (java.util.List) null, 336, (DefaultConstructorMarker) null);
                java.lang.Integer numValueOf = i2 != -1 ? java.lang.Integer.valueOf(i2) : null;
                string = bundle.getString(RouteData.FROM_PAGE_SUB_SOURCE, "");
                if (string == null || string.length() == 0) {
                    string = "deepLink " + (!(context instanceof android.app.Activity) ? context.getClass().getSimpleName() : context.getPackageName());
                }
                java.lang.String str4 = string;
                obj = bundle.get(OtcExtraKeys.ORDER);
                if (obj == null || (string2 = obj.toString()) == null) {
                    string2 = "2";
                }
                ActivityC52122vzt.Companion.OLrzqt(context, botTradeData, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : str4, (244 & 16) != 0 ? null : numValueOf, (244 & 32) != 0 ? null : strCopydefault, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : string2);
                break;
            case -479806138:
                if (!str.equals("trade/main/strategy/copy")) {
                }
                java.lang.String strGEmmrt7 = C33129mqd.gEmmrt(java.lang.Long.valueOf(bundle.getLong("algoId")));
                java.lang.String string14 = bundle.getString("strategyType", "");
                ActivityC51071vgB.TaskDescription taskDescription = ActivityC51071vgB.Companion;
                Intrinsics.copydefault((java.lang.Object) string14);
                ActivityC51071vgB.TaskDescription.startActivity$default(taskDescription, context, strGEmmrt7, string14, null, strCopydefault, 8, null);
                break;
            case -255931143:
                if (!str.equals("trade_bot/signal_detail/page")) {
                }
                ActivityC51215vin.TaskDescription.startActivity$default(ActivityC51215vin.Companion, context, C33129mqd.gEmmrt(java.lang.Long.valueOf(bundle.getLong("signalChanId"))), null, strCopydefault, 4, null);
                break;
            case -121250042:
                if (!str.equals("trade_bot/copy/page")) {
                }
                java.lang.String strGEmmrt72 = C33129mqd.gEmmrt(java.lang.Long.valueOf(bundle.getLong("algoId")));
                java.lang.String string142 = bundle.getString("strategyType", "");
                ActivityC51071vgB.TaskDescription taskDescription2 = ActivityC51071vgB.Companion;
                Intrinsics.copydefault((java.lang.Object) string142);
                ActivityC51071vgB.TaskDescription.startActivity$default(taskDescription2, context, strGEmmrt72, string142, null, strCopydefault, 8, null);
                break;
            case -94164249:
                if (!str.equals("trade/main/strategy/signal/detail")) {
                }
                ActivityC51215vin.TaskDescription.startActivity$default(ActivityC51215vin.Companion, context, C33129mqd.gEmmrt(java.lang.Long.valueOf(bundle.getLong("signalChanId"))), null, strCopydefault, 4, null);
                break;
            case 759168264:
                if (!str.equals("trade_bot/guide_card/page")) {
                }
                java.lang.String string32 = bundle.getString("instId", "");
                java.lang.String strOLrzqt3 = RouteData.Companion.OLrzqt(java.lang.Integer.valueOf(bundle.getInt("bizType")));
                java.lang.String string42 = bundle.getString("strategyType", "");
                java.lang.String string52 = bundle.getString("source", "");
                java.lang.String strGEmmrt8 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("investType")));
                java.lang.String string62 = bundle.getString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "");
                java.lang.String string72 = bundle.getString("userRiskMode", "");
                java.lang.String string82 = bundle.getString("title", "");
                java.lang.String strGEmmrt22 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("algoIndexId", 0)));
                int i3 = bundle.getInt("batchNo", -1);
                java.lang.String string92 = i3 != -1 ? bundle.getString("batchNo", "") : C33129mqd.gEmmrt(java.lang.Integer.valueOf(i3));
                ActivityC52394wJu.Application application2 = ActivityC52394wJu.Companion;
                Intrinsics.copydefault((java.lang.Object) string42);
                Intrinsics.copydefault((java.lang.Object) string32);
                Intrinsics.copydefault((java.lang.Object) string52);
                Intrinsics.copydefault((java.lang.Object) string62);
                Intrinsics.copydefault((java.lang.Object) string72);
                Intrinsics.copydefault((java.lang.Object) string82);
                Intrinsics.copydefault((java.lang.Object) string92);
                application2.OLrzqt(context, string42, string32, strOLrzqt3, string52, strGEmmrt8, string62, string72, string82, strGEmmrt22, string92, strCopydefault);
                break;
            case 861119034:
                if (!str.equals("trade/main/page")) {
                }
                java.lang.String string112 = bundle.getString("instId", "");
                java.lang.String strOLrzqt22 = RouteData.Companion.OLrzqt(java.lang.Integer.valueOf(bundle.getInt("bizType")));
                java.lang.String string122 = bundle.getString("botCategory");
                java.lang.String string132 = bundle.getString("strategyType");
                C55946xtY c55946xtY2 = C55946xtY.OLrzqt;
                strAEQbTJ = c55946xtY2.AEQbTJ(string122, strOLrzqt22);
                strAEQbTJ2 = c55946xtY2.AEQbTJ(strOLrzqt22);
                if (strAEQbTJ2 == null) {
                }
                if (strAEQbTJ == null) {
                    strAEQbTJ = strAEQbTJ2;
                }
                if (string132 == null) {
                }
                int i22 = bundle.getInt("intentFlag", -1);
                java.lang.String strGEmmrt62 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("recommendId")));
                Intrinsics.copydefault((java.lang.Object) string112);
                BotTradeData botTradeData2 = new BotTradeData(str3, string112, strOLrzqt22, copydefault(str, bundle), false, strGEmmrt62, (java.lang.String) null, true, (java.util.List) null, 336, (DefaultConstructorMarker) null);
                if (i22 != -1) {
                }
                string = bundle.getString(RouteData.FROM_PAGE_SUB_SOURCE, "");
                if (string == null) {
                    if (!(context instanceof android.app.Activity)) {
                    }
                    string = "deepLink " + (!(context instanceof android.app.Activity) ? context.getClass().getSimpleName() : context.getPackageName());
                }
                java.lang.String str42 = string;
                obj = bundle.get(OtcExtraKeys.ORDER);
                if (obj == null) {
                    string2 = "2";
                }
                ActivityC52122vzt.Companion.OLrzqt(context, botTradeData2, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : str42, (244 & 16) != 0 ? null : numValueOf, (244 & 32) != 0 ? null : strCopydefault, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : string2);
                break;
            case 1249306087:
                if (str.equals("trade_bot/my_bot/page")) {
                    ActivityC51686vrh.Companion.EZpvd(context, (24 & 2) != 0 ? "" : null, (24 & 4) != 0 ? "" : null, (24 & 8) != 0 ? "" : C33129mqd.gEmmrt(bundle.getString("location")), (24 & 16) != 0 ? "" : strCopydefault);
                    break;
                }
                break;
            case 1401478537:
                if (str.equals("trade_bot/transition_guide/page") && Intrinsics.EZpvd((java.lang.Object) bundle.getString("strategyType", ""), (java.lang.Object) "smart_arbitrage")) {
                    C52841waI.Companion.EZpvd(context);
                }
                break;
            case 1759199090:
                if (!str.equals("trade_bot/bot_detail/page")) {
                }
                java.lang.String strGEmmrt32 = C33129mqd.gEmmrt(java.lang.Long.valueOf(bundle.getLong("algoId")));
                java.lang.String strGEmmrt42 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("tabIndex")));
                java.lang.String strGEmmrt52 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("detailAction")));
                java.lang.String string102 = bundle.getString("strategyType");
                if (string102 != null) {
                }
                ActivityC52272wFg.Companion.KWHzl(context, strGEmmrt32, str2, (984 & 8) != 0 ? null : strGEmmrt42, (984 & 16) != 0 ? "" : strGEmmrt52, (984 & 32) != 0 ? null : Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "ai_bot") ? 0 : null, (984 & 64) != 0 ? null : strCopydefault, (984 & 128) != 0 ? null : null, (984 & 256) != 0 ? false : bundle.getBoolean("backtest"), (984 & 512) != 0 ? false : bundle.getBoolean("delay"));
                break;
            case 2002851230:
                if (!str.equals("trade/main/strategy")) {
                }
                java.lang.String string1122 = bundle.getString("instId", "");
                java.lang.String strOLrzqt222 = RouteData.Companion.OLrzqt(java.lang.Integer.valueOf(bundle.getInt("bizType")));
                java.lang.String string1222 = bundle.getString("botCategory");
                java.lang.String string1322 = bundle.getString("strategyType");
                C55946xtY c55946xtY22 = C55946xtY.OLrzqt;
                strAEQbTJ = c55946xtY22.AEQbTJ(string1222, strOLrzqt222);
                strAEQbTJ2 = c55946xtY22.AEQbTJ(strOLrzqt222);
                if (strAEQbTJ2 == null) {
                }
                if (strAEQbTJ == null) {
                }
                if (string1322 == null) {
                }
                int i222 = bundle.getInt("intentFlag", -1);
                java.lang.String strGEmmrt622 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(bundle.getInt("recommendId")));
                Intrinsics.copydefault((java.lang.Object) string1122);
                BotTradeData botTradeData22 = new BotTradeData(str3, string1122, strOLrzqt222, copydefault(str, bundle), false, strGEmmrt622, (java.lang.String) null, true, (java.util.List) null, 336, (DefaultConstructorMarker) null);
                if (i222 != -1) {
                }
                string = bundle.getString(RouteData.FROM_PAGE_SUB_SOURCE, "");
                if (string == null) {
                }
                java.lang.String str422 = string;
                obj = bundle.get(OtcExtraKeys.ORDER);
                if (obj == null) {
                }
                ActivityC52122vzt.Companion.OLrzqt(context, botTradeData22, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : str422, (244 & 16) != 0 ? null : numValueOf, (244 & 32) != 0 ? null : strCopydefault, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : string2);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.os.Parcelable copydefault(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String string;
        LinkedHashMap linkedHashMap;
        java.util.ArrayList arrayList = null;
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "trade_bot/order/page") || (string = bundle.getString("strategyType")) == null) {
            return null;
        }
        int iHashCode = string.hashCode();
        if (iHashCode == -1216369070) {
            if (!string.equals("smart_portfolio")) {
                return null;
            }
            java.lang.String string2 = bundle.getString("balType");
            java.lang.Object obj = bundle.get("deltaRatio");
            java.lang.String string3 = obj != null ? obj.toString() : null;
            java.lang.Object obj2 = bundle.get("interval");
            java.lang.String string4 = obj2 != null ? obj2.toString() : null;
            java.lang.Object obj3 = bundle.get("list");
            java.lang.String string5 = obj3 != null ? obj3.toString() : null;
            java.lang.Object obj4 = bundle.get("amt");
            java.lang.String string6 = obj4 != null ? obj4.toString() : null;
            if (string5 != null) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) string5, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default != null) {
                    java.util.ArrayList<java.util.List> arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
                    java.util.Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null));
                    }
                    linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList2, 10)), 16));
                    for (java.util.List list : arrayList2) {
                        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(list.get(0), 1 < list.size() ? list.get(1) : "");
                        linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                    }
                } else {
                    linkedHashMap = null;
                }
            }
            if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && ((string5 == null || string5.length() == 0) && ((string4 == null || string4.length() == 0) && (string6 == null || string6.length() == 0))))) {
                return null;
            }
            if (linkedHashMap != null) {
                arrayList = new java.util.ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(new CoinRatioParam((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
                }
            }
            return new SmartPortfolioReq((java.lang.String) null, (java.util.List) null, arrayList, string2, string4, string3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, string6, (java.lang.String) null, 12227, (DefaultConstructorMarker) null);
        }
        if (iHashCode != -512749997) {
            if (iHashCode != 3181382 || !string.equals("grid")) {
                return null;
            }
            java.lang.Object obj5 = bundle.get("minPx");
            java.lang.String string7 = obj5 != null ? obj5.toString() : null;
            java.lang.Object obj6 = bundle.get("maxPx");
            java.lang.String string8 = obj6 != null ? obj6.toString() : null;
            java.lang.Object obj7 = bundle.get("gridNum");
            java.lang.String string9 = obj7 != null ? obj7.toString() : null;
            java.lang.Object obj8 = bundle.get("quoteSz");
            java.lang.String string10 = obj8 != null ? obj8.toString() : null;
            if ((string7 == null || string7.length() == 0) && ((string8 == null || string8.length() == 0) && ((string9 == null || string9.length() == 0) && (string10 == null || string10.length() == 0)))) {
                return null;
            }
            return new AIData((java.lang.String) null, string9 == null ? "" : string9, string8 == null ? "" : string8, string7 == null ? "" : string7, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, false, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, string10 == null ? "" : string10, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, -134217743, 3, (DefaultConstructorMarker) null);
        }
        if (!string.equals("contract_grid")) {
            return null;
        }
        java.lang.Object obj9 = bundle.get("minPx");
        java.lang.String string11 = obj9 != null ? obj9.toString() : null;
        java.lang.Object obj10 = bundle.get("maxPx");
        java.lang.String string12 = obj10 != null ? obj10.toString() : null;
        java.lang.Object obj11 = bundle.get("gridNum");
        java.lang.String string13 = obj11 != null ? obj11.toString() : null;
        java.lang.Object obj12 = bundle.get("quoteSz");
        java.lang.String string14 = obj12 != null ? obj12.toString() : null;
        java.lang.Object obj13 = bundle.get(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE);
        java.lang.String strGEmmrt = obj13 != null ? C33129mqd.gEmmrt(obj13) : null;
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(bundle.get("actualMarginSz"));
        java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(bundle.get("extraMarginSz"));
        java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(bundle.get("autoReserveMargin"));
        java.lang.String strGEmmrt5 = C33129mqd.gEmmrt(bundle.get("instId"));
        java.lang.String strGEmmrt6 = C33129mqd.gEmmrt(bundle.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION));
        if ((string11 == null || string11.length() == 0) && ((string12 == null || string12.length() == 0) && ((string13 == null || string13.length() == 0) && (string14 == null || string14.length() == 0)))) {
            return null;
        }
        java.lang.String str2 = string11 == null ? "" : string11;
        java.lang.String str3 = string12 == null ? "" : string12;
        return new AIData(strGEmmrt5 == null ? "" : strGEmmrt5, string13 == null ? "" : string13, str3, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strGEmmrt6 == null ? "" : strGEmmrt6, (java.lang.String) null, strGEmmrt == null ? "" : strGEmmrt, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, false, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strGEmmrt2 == null ? "" : strGEmmrt2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Boolean.valueOf(C33129mqd.OLrzqt(strGEmmrt4, "1")), strGEmmrt3, -134219024, 0, (DefaultConstructorMarker) null);
    }
}
