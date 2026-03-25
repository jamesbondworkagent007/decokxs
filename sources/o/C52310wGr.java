package o;

import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wGr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52310wGr {
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<C52312wGt> OLrzqt(@NotNull StrategyDetailsResponse strategyDetailsResponse, @NotNull android.content.Context context) {
        java.lang.String url;
        int i;
        java.lang.String botPrice$default;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String botAmount$default;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String botPnl$default;
        int iCopydefault;
        java.util.ArrayList<TradeCoinInfo> arrayListOLrzqt;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        Intrinsics.checkNotNullParameter(context, "");
        java.util.List<RecurringListItem> listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) strategyDetailsResponse.getRecurringList(), 10);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (RecurringListItem recurringListItem : listAhwBna) {
            java.lang.String tradeQuoteCcy = strategyDetailsResponse.getTradeQuoteCcy();
            if (tradeQuoteCcy == null) {
                tradeQuoteCcy = strategyDetailsResponse.getInvestCcy();
            }
            java.lang.String str6 = recurringListItem.getCcy() + "-" + strategyDetailsResponse.getInvestCcy();
            java.lang.String str7 = (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str6, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(0);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (arrayListOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt()) == null) {
                url = null;
            } else {
                java.util.Iterator<T> it = arrayListOLrzqt.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((TradeCoinInfo) next).getSymbol(), (java.lang.Object) str7)) {
                        break;
                    }
                }
                TradeCoinInfo tradeCoinInfo = (TradeCoinInfo) next;
                if (tradeCoinInfo != null) {
                    url = tradeCoinInfo.getUrl();
                }
            }
            if (recurringListItem.getPx().length() == 0) {
                i = 0;
                botPrice$default = "--";
            } else {
                i = 0;
                botPrice$default = C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), str6, recurringListItem.getPx(), false, false, null, null, 120, null);
            }
            java.lang.String instType = strategyDetailsResponse.getInstType();
            java.lang.String botPrice$default2 = C56033xvF.getBotPrice$default(instType, str6, recurringListItem.getMinPrice(), false, false, null, null, 120, null);
            java.lang.String botPrice$default3 = C56033xvF.getBotPrice$default(instType, str6, recurringListItem.getMaxPrice(), false, false, null, null, 120, null);
            java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(instType, str6);
            if (recurringListItem.getMinPrice().length() > 0 && recurringListItem.getMaxPrice().length() > 0) {
                str2 = botPrice$default2 + "-" + botPrice$default3;
            } else if (recurringListItem.getMinPrice().length() > 0) {
                str2 = ">" + botPrice$default2 + " (" + strAEQbTJ + ")";
            } else if (recurringListItem.getMaxPrice().length() > 0) {
                str2 = "<" + botPrice$default3 + " (" + strAEQbTJ + ")";
            } else {
                str = "--";
                if (recurringListItem.getTotalAmt().length() != 0) {
                    str3 = strAEQbTJ;
                    botAmount$default = "--";
                } else {
                    str3 = strAEQbTJ;
                    botAmount$default = C56033xvF.getBotAmount$default(instType, str6, recurringListItem.getTotalAmt(), null, false, null, 56, null);
                }
                if (recurringListItem.getProfit().length() != 0) {
                    str4 = instType;
                    str5 = str6;
                    botPnl$default = "--";
                } else {
                    str4 = instType;
                    str5 = str6;
                    botPnl$default = C56033xvF.getBotPnl$default("", instType, recurringListItem.getProfit(), tradeQuoteCcy, false, false, null, false, null, null, null, 2032, null);
                }
                java.lang.String botPrice$default4 = recurringListItem.getAvgPx().length() != 0 ? "--" : C56033xvF.getBotPrice$default(str4, str5, recurringListItem.getAvgPx(), false, false, null, null, 120, null);
                if (C33129mqd.AEQbTJ(recurringListItem.getProfit(), java.lang.Integer.valueOf(i))) {
                    iCopydefault = C33129mqd.OLrzqt(recurringListItem.getProfit(), java.lang.Integer.valueOf(i)) ? C33070mpX.copydefault(C52761wXj.Activity.fdOvFl) : C33512mxp.tradeFall$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
                } else {
                    iCopydefault = C33512mxp.tradeRise$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
                }
                arrayList.add(new C52312wGt(str5, recurringListItem.getCcy(), url, botPrice$default, !strategyDetailsResponse.isHistory(), tradeQuoteCcy, str3, str, botAmount$default, botPnl$default, botPrice$default4, iCopydefault, recurringListItem.getRatio()));
            }
            str = str2;
            if (recurringListItem.getTotalAmt().length() != 0) {
            }
            if (recurringListItem.getProfit().length() != 0) {
            }
            if (recurringListItem.getAvgPx().length() != 0) {
            }
            if (C33129mqd.AEQbTJ(recurringListItem.getProfit(), java.lang.Integer.valueOf(i))) {
            }
            arrayList.add(new C52312wGt(str5, recurringListItem.getCcy(), url, botPrice$default, !strategyDetailsResponse.isHistory(), tradeQuoteCcy, str3, str, botAmount$default, botPnl$default, botPrice$default4, iCopydefault, recurringListItem.getRatio()));
        }
        return arrayList;
    }
}
