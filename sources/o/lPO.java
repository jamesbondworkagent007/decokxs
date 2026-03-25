package o;

import androidx.compose.material3.CalendarModelKt;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlacedOrderBean;
import com.okinc.cruilib.utils.RecurringBuyPlanOrderStatus;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class lPO {
    public final lTX AEQbTJ;
    public final C30325lUe copydefault;

    @yCM
    public lPO(@NotNull lTX ltx, @NotNull C30325lUe c30325lUe) {
        Intrinsics.checkNotNullParameter(ltx, "");
        Intrinsics.checkNotNullParameter(c30325lUe, "");
        this.AEQbTJ = ltx;
        this.copydefault = c30325lUe;
    }

    public static /* synthetic */ java.lang.String mapFrequency$default(lPO lpo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return lpo.OLrzqt(str, str2);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return str2;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String upperCase2 = "daily".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase2)) {
            return this.copydefault.EZpvd(C31351lsQ.Activity.atDTRm);
        }
        java.lang.String upperCase3 = "weekly".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase3)) {
            return this.copydefault.EZpvd(C31351lsQ.Activity.gBtXYZ);
        }
        java.lang.String upperCase4 = "bi-weekly".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase4, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase4)) {
            return this.copydefault.EZpvd(C31351lsQ.Activity.Rtjmuc);
        }
        java.lang.String upperCase5 = "monthly".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase5, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase5)) {
            return this.copydefault.EZpvd(C31351lsQ.Activity.dPnHjp);
        }
        if (str.length() <= 0) {
            return str;
        }
        char upperCase6 = java.lang.Character.toUpperCase(str.charAt(0));
        java.lang.String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return upperCase6 + strSubstring;
    }

    public final java.lang.String AEQbTJ(long j) {
        if (android.text.format.DateUtils.isToday(j)) {
            return this.copydefault.EZpvd(C31351lsQ.Activity.aKhcqp);
        }
        if (android.text.format.DateUtils.isToday(j - CalendarModelKt.MillisecondsIn24Hours)) {
            return this.copydefault.EZpvd(C31351lsQ.Activity.dIjzlO);
        }
        return pTA.formatStandardDate$default(new Date(j), null, 1, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.lTX.appendCryptoSymbol$default(o.lTX, java.lang.String, java.lang.String, int, o.pTy, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    public final java.util.List<mHM> EZpvd(@NotNull java.util.List<RecurringBuyPlacedOrderBean> list) {
        java.lang.String strPrependFiatSymbol$default;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (RecurringBuyPlacedOrderBean recurringBuyPlacedOrderBean : list) {
            java.lang.String orderNo = recurringBuyPlacedOrderBean.getOrderNo();
            java.lang.String orderNo2 = recurringBuyPlacedOrderBean.getOrderNo();
            long createDate = recurringBuyPlacedOrderBean.getCreateDate();
            RecurringBuyPlanOrderStatus recurringBuyPlanOrderStatusEZpvd = RecurringBuyPlanOrderStatus.Companion.EZpvd(recurringBuyPlacedOrderBean.getStatus());
            if (recurringBuyPlanOrderStatusEZpvd == null) {
                recurringBuyPlanOrderStatusEZpvd = RecurringBuyPlanOrderStatus.FAILED;
            }
            RecurringBuyPlanOrderStatus recurringBuyPlanOrderStatus = recurringBuyPlanOrderStatusEZpvd;
            boolean z = recurringBuyPlacedOrderBean.getBaseAmount().length() > 0;
            java.lang.String baseCurrencyIcon = recurringBuyPlacedOrderBean.getBaseCurrencyIcon();
            java.lang.String strAppendCryptoSymbol$default = lTX.appendCryptoSymbol$default(this.AEQbTJ, recurringBuyPlacedOrderBean.getBaseAmount(), recurringBuyPlacedOrderBean.getBaseCurrencySymbol(), 0, null, null, 28, null);
            if (recurringBuyPlacedOrderBean.getDisplayQuoteCurrencyAfterAmount()) {
                strPrependFiatSymbol$default = lTX.appendCryptoSymbol$default(this.AEQbTJ, recurringBuyPlacedOrderBean.getQuoteAmount(), recurringBuyPlacedOrderBean.getQuoteCurrencySymbol(), 0, null, null, 28, null);
            } else {
                strPrependFiatSymbol$default = lTX.prependFiatSymbol$default(this.AEQbTJ, recurringBuyPlacedOrderBean.getQuoteAmount(), recurringBuyPlacedOrderBean.getQuoteCurrencySymbol(), recurringBuyPlacedOrderBean.getQuoteSymbol(), null, null, false, 56, null);
            }
            arrayList.add(new mHM(orderNo, orderNo2, createDate, recurringBuyPlanOrderStatus, z, baseCurrencyIcon, strAppendCryptoSymbol$default, strPrependFiatSymbol$default));
        }
        return arrayList;
    }
}
