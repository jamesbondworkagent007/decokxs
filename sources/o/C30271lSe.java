package o;

import com.okinc.buysell.ui.recurring.RecurringBuyErrorType;
import com.okinc.buysell.ui.recurring.RecurringBuyPlanStatus;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListBean;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lSe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30271lSe {
    public final lTX KWHzl;
    public final lPO copydefault;

    @yCM
    public C30271lSe(@NotNull lPO lpo, @NotNull lTX ltx) {
        Intrinsics.checkNotNullParameter(lpo, "");
        Intrinsics.checkNotNullParameter(ltx, "");
        this.copydefault = lpo;
        this.KWHzl = ltx;
    }

    public final java.util.List<C30273lSg> copydefault(@NotNull java.util.List<RecurringBuyPlanListBean> list) {
        java.lang.String strPrependFiatSymbol$default;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (RecurringBuyPlanListBean recurringBuyPlanListBean : list) {
            RecurringBuyErrorType recurringBuyErrorTypeCopydefault = RecurringBuyErrorType.Companion.copydefault(recurringBuyPlanListBean.getRecurringBuyErrorType());
            boolean z = recurringBuyPlanListBean.getLowBalance() || !(recurringBuyErrorTypeCopydefault == null || recurringBuyErrorTypeCopydefault == RecurringBuyErrorType.LOW_BALANCE);
            java.lang.String planId = recurringBuyPlanListBean.getPlanId();
            java.lang.String strMapFrequency$default = lPO.mapFrequency$default(this.copydefault, recurringBuyPlanListBean.getFrequency(), null, 2, null);
            java.lang.String baseCurrency = recurringBuyPlanListBean.getBaseCurrency();
            java.lang.String baseCurrencyIcon = recurringBuyPlanListBean.getBaseCurrencyIcon();
            if (recurringBuyPlanListBean.getDisplayQuoteCurrencyAfterAmount()) {
                strPrependFiatSymbol$default = lTX.appendCryptoSymbol$default(this.KWHzl, recurringBuyPlanListBean.getQuoteAmount(), recurringBuyPlanListBean.getQuoteCurrency(), 0, null, null, 28, null);
            } else {
                strPrependFiatSymbol$default = lTX.prependFiatSymbol$default(this.KWHzl, recurringBuyPlanListBean.getQuoteAmount(), recurringBuyPlanListBean.getQuoteCurrency(), recurringBuyPlanListBean.getQuoteCurrencySymbol(), null, null, false, 56, null);
            }
            arrayList.add(new C30273lSg(planId, strMapFrequency$default, baseCurrency, baseCurrencyIcon, strPrependFiatSymbol$default, pTA.formatStandardDate$default(new Date(C33129mqd.valueOf(recurringBuyPlanListBean.getNextPurchase())), null, 1, null), z, !z && RecurringBuyPlanStatus.Companion.KWHzl(recurringBuyPlanListBean.getStatus()) == RecurringBuyPlanStatus.PAUSED));
        }
        return arrayList;
    }
}
