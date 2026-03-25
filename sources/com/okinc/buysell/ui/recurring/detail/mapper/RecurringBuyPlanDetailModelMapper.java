package com.okinc.buysell.ui.recurring.detail.mapper;

import androidx.annotation.StringRes;
import com.okinc.buysell.ui.recurring.RecurringBuyErrorType;
import com.okinc.buysell.ui.recurring.RecurringBuyPlanStatus;
import com.okinc.buysell.ui.recurring.edit.model.RecurringFrequencyOption;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyFrequencyBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailRootBean;
import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C30235lQw;
import o.C30236lQx;
import o.C30237lQy;
import o.C30238lQz;
import o.C30325lUe;
import o.C31351lsQ;
import o.C33129mqd;
import o.C52761wXj;
import o.C56390yDp;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.lPO;
import o.lQA;
import o.lQB;
import o.lQC;
import o.lQE;
import o.lQF;
import o.lQV;
import o.lTX;
import o.pTA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanDetailModelMapper {
    public static final Activity Companion = new Activity(null);
    public final lTX EZpvd;
    public final lPO OLrzqt;
    public final C30325lUe copydefault;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecurringErrorCase.values().length];
            try {
                iArr[RecurringErrorCase.LOW_BALANCE_WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringErrorCase.LOW_BALANCE_1_2_FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringErrorCase.LOW_BALANCE_3_FAIL_AUTO_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringErrorCase.PAYMENT_METHOD_ISSUE_1_2_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RecurringErrorCase.PAYMENT_METHOD_ISSUE_3_FAIL_AUTO_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RecurringErrorCase.NO_OTC_QUOTE_1_2_FAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RecurringErrorCase.NO_OTC_QUOTE_3_FAIL_AUTO_PAUSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[RecurringBuyErrorType.values().length];
            try {
                iArr2[RecurringBuyErrorType.LOW_BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[RecurringBuyErrorType.PAYMENT_METHOD_ISSUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[RecurringBuyErrorType.PRICE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            OLrzqt = iArr2;
        }
    }

    @yCM
    public RecurringBuyPlanDetailModelMapper(@NotNull lPO lpo, @NotNull lTX ltx, @NotNull C30325lUe c30325lUe) {
        Intrinsics.checkNotNullParameter(lpo, "");
        Intrinsics.checkNotNullParameter(ltx, "");
        Intrinsics.checkNotNullParameter(c30325lUe, "");
        this.OLrzqt = lpo;
        this.EZpvd = ltx;
        this.copydefault = c30325lUe;
    }

    public final lQE KWHzl(@NotNull RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean, @NotNull List<RecurringBuyFrequencyBean> list) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailRootBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new lQE(copydefault(recurringBuyPlanDetailRootBean), EZpvd(recurringBuyPlanDetailRootBean), OLrzqt(recurringBuyPlanDetailRootBean), AEQbTJ(recurringBuyPlanDetailRootBean), KWHzl(recurringBuyPlanDetailRootBean), EZpvd(recurringBuyPlanDetailRootBean, list));
    }

    public final C30236lQx copydefault(RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean) {
        String value;
        String strEZpvd;
        RecurringErrorCase recurringErrorCaseDjBIcL = djBIcL(recurringBuyPlanDetailRootBean);
        if (recurringErrorCaseDjBIcL == null) {
            return new C30236lQx(false, null, null, null, false, null, false, null, 254, null);
        }
        switch (Application.AEQbTJ[recurringErrorCaseDjBIcL.ordinal()]) {
            case 1:
            case 2:
            case 3:
                value = RecurringBuyErrorType.LOW_BALANCE.getValue();
                break;
            case 4:
            case 5:
                value = RecurringBuyErrorType.PAYMENT_METHOD_ISSUE.getValue();
                break;
            case 6:
            case 7:
                value = RecurringBuyErrorType.PRICE_CHANGE.getValue();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str = value;
        String strEZpvd2 = this.copydefault.EZpvd(recurringErrorCaseDjBIcL.getTitleStringRes());
        String strEZpvd3 = this.copydefault.EZpvd(recurringErrorCaseDjBIcL.getMessageStringRes());
        boolean showDepositButton = recurringErrorCaseDjBIcL.getShowDepositButton();
        if (recurringBuyPlanDetailRootBean.getDisplayQuoteCurrencyAfterAmount()) {
            strEZpvd = this.copydefault.EZpvd(C31351lsQ.Activity.dbwnZN, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, recurringBuyPlanDetailRootBean.getQuoteCurrency())));
        } else {
            strEZpvd = this.copydefault.EZpvd(C31351lsQ.Activity.DPHOMC, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, recurringBuyPlanDetailRootBean.getQuoteCurrency())));
        }
        return new C30236lQx(true, str, strEZpvd2, strEZpvd3, showDepositButton, strEZpvd, recurringBuyPlanDetailRootBean.getDisplayQuoteCurrencyAfterAmount(), recurringBuyPlanDetailRootBean.getQuoteCurrency());
    }

    public final lQB EZpvd(RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean) {
        String strPrependFiatSymbol$default;
        String strEZpvd;
        String paymentMethodUrl;
        String paymentMethodNightUrl;
        String strMapFrequency$default = lPO.mapFrequency$default(this.OLrzqt, recurringBuyPlanDetailRootBean.getFrequency(), null, 2, null);
        C30325lUe c30325lUe = this.copydefault;
        int i = C31351lsQ.Activity.aGOrKO;
        Pair[] pairArr = new Pair[2];
        if (recurringBuyPlanDetailRootBean.getDisplayQuoteCurrencyAfterAmount()) {
            strPrependFiatSymbol$default = lTX.appendCryptoSymbol$default(this.EZpvd, recurringBuyPlanDetailRootBean.getQuoteAmount(), recurringBuyPlanDetailRootBean.getQuoteCurrency(), 0, null, null, 28, null);
        } else {
            strPrependFiatSymbol$default = lTX.prependFiatSymbol$default(this.EZpvd, recurringBuyPlanDetailRootBean.getQuoteAmount(), recurringBuyPlanDetailRootBean.getQuoteCurrency(), recurringBuyPlanDetailRootBean.getQuoteCurrencySymbol(), null, null, false, 56, null);
        }
        pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strPrependFiatSymbol$default);
        pairArr[1] = C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getBaseCurrency()) ? recurringBuyPlanDetailRootBean.getBaseCurrency() : "--");
        String strEZpvd2 = c30325lUe.EZpvd(i, C56424yEw.gEmmrt(pairArr));
        lQV lqv = new lQV(recurringBuyPlanDetailRootBean.getQuoteAmount(), recurringBuyPlanDetailRootBean.getQuoteCurrency(), recurringBuyPlanDetailRootBean.getQuoteCurrencySymbol(), recurringBuyPlanDetailRootBean.getDisplayQuoteCurrencyAfterAmount(), recurringBuyPlanDetailRootBean.getEditPlanAmountLimit().getMinEditPlanAmount(), recurringBuyPlanDetailRootBean.getEditPlanAmountLimit().getMaxEditPlanAmount());
        boolean zAhwBna = AhwBna(recurringBuyPlanDetailRootBean);
        String strAEQbTJ = (!C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getNextPurchase()) || AhwBna(recurringBuyPlanDetailRootBean)) ? "-" : this.OLrzqt.AEQbTJ(C33129mqd.valueOf(recurringBuyPlanDetailRootBean.getNextPurchase()));
        if (recurringBuyPlanDetailRootBean.getCategoryCode() == 3) {
            if (recurringBuyPlanDetailRootBean.getDisplayQuoteCurrencyAfterAmount()) {
                strEZpvd = recurringBuyPlanDetailRootBean.getQuoteCurrency();
            } else {
                strEZpvd = this.copydefault.EZpvd(C31351lsQ.Activity.gCZUJG, C56423yEv.EZpvd(C56390yDp.OLrzqt("fiatName", recurringBuyPlanDetailRootBean.getQuoteCurrency())));
            }
        } else if (C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getPaymentMethod())) {
            strEZpvd = recurringBuyPlanDetailRootBean.getPaymentMethod() + " " + recurringBuyPlanDetailRootBean.getLast4();
        } else {
            strEZpvd = "";
        }
        String str = strEZpvd;
        if (recurringBuyPlanDetailRootBean.getCategoryCode() == 3) {
            paymentMethodUrl = recurringBuyPlanDetailRootBean.getQuoteCurrencyIcon();
        } else {
            paymentMethodUrl = recurringBuyPlanDetailRootBean.getPaymentMethodUrl();
        }
        String str2 = paymentMethodUrl;
        if (recurringBuyPlanDetailRootBean.getCategoryCode() == 3) {
            paymentMethodNightUrl = recurringBuyPlanDetailRootBean.getQuoteCurrencyIcon();
        } else {
            paymentMethodNightUrl = recurringBuyPlanDetailRootBean.getPaymentMethodNightUrl();
        }
        return new lQB(strMapFrequency$default, strEZpvd2, lqv, zAhwBna, strAEQbTJ, str, str2, paymentMethodNightUrl);
    }

    public final lQC OLrzqt(RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean) {
        OKCRTrend oKCRTrend;
        String cryptoListPriceFormat$default;
        String str;
        lQA lqa;
        String strPrependFiatSymbol$default;
        lQA lqa2;
        String cryptoListPriceFormat$default2;
        boolean zOLrzqt = C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getPnl().getAvgPrice());
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(recurringBuyPlanDetailRootBean.getPnl().getAvgPrice());
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(recurringBuyPlanDetailRootBean.getPnl().getCurrentPrice());
        if (bigDecimalEZpvd2.compareTo(bigDecimalEZpvd) > 0) {
            oKCRTrend = OKCRTrend.UP;
        } else if (bigDecimalEZpvd2.compareTo(bigDecimalEZpvd) < 0) {
            oKCRTrend = OKCRTrend.DOWN;
        } else {
            oKCRTrend = OKCRTrend.FLAT;
        }
        String strPrependFiatSymbol$default2 = "--";
        if (!C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getPnl().getAvgPrice())) {
            cryptoListPriceFormat$default = "--";
        } else if (recurringBuyPlanDetailRootBean.getDisplayQuoteCurrencyAfterAmount()) {
            cryptoListPriceFormat$default = lTX.appendCryptoSymbol$default(this.EZpvd, recurringBuyPlanDetailRootBean.getPnl().getAvgPrice(), recurringBuyPlanDetailRootBean.getQuoteCurrency(), 0, null, null, 28, null);
        } else {
            cryptoListPriceFormat$default = lTX.getCryptoListPriceFormat$default(this.EZpvd, recurringBuyPlanDetailRootBean.getPnl().getAvgPrice(), recurringBuyPlanDetailRootBean.getQuoteCurrencySymbol(), false, 0, null, 28, null);
        }
        lQF lqf = new lQF(cryptoListPriceFormat$default, new lQA(null, false, C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getPnl().getAvgPrice()) ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.QwvEab, 1, null), this.copydefault.EZpvd(C31351lsQ.Activity.jNexW), C52761wXj.TaskDescription.QYvkLl);
        if (C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getPnl().getCurrentPrice())) {
            if (recurringBuyPlanDetailRootBean.getDisplayQuoteCurrencyAfterAmount()) {
                cryptoListPriceFormat$default2 = lTX.appendCryptoSymbol$default(this.EZpvd, recurringBuyPlanDetailRootBean.getPnl().getCurrentPrice(), recurringBuyPlanDetailRootBean.getQuoteCurrency(), 0, null, null, 28, null);
            } else {
                cryptoListPriceFormat$default2 = lTX.getCryptoListPriceFormat$default(this.EZpvd, recurringBuyPlanDetailRootBean.getPnl().getCurrentPrice(), recurringBuyPlanDetailRootBean.getQuoteCurrencySymbol(), false, 0, null, 28, null);
            }
            str = cryptoListPriceFormat$default2;
        } else {
            str = "--";
        }
        if (C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getPnl().getCurrentPrice()) && zOLrzqt) {
            lqa = new lQA(oKCRTrend, false, 0, 6, null);
        } else {
            lqa = new lQA(null, false, C52761wXj.Activity.fdOvFl, 1, null);
        }
        lQF lqf2 = new lQF(str, lqa, this.copydefault.EZpvd(C31351lsQ.Activity.QKDJJA), C52761wXj.TaskDescription.OHqIaq);
        if (C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getPnl().getTotalPaymentAmount())) {
            if (recurringBuyPlanDetailRootBean.getDisplayQuoteCurrencyAfterAmount()) {
                strPrependFiatSymbol$default = lTX.appendCryptoSymbol$default(this.EZpvd, recurringBuyPlanDetailRootBean.getPnl().getTotalPaymentAmount(), recurringBuyPlanDetailRootBean.getQuoteCurrency(), 0, null, null, 28, null);
            } else {
                strPrependFiatSymbol$default = lTX.prependFiatSymbol$default(this.EZpvd, recurringBuyPlanDetailRootBean.getPnl().getTotalPaymentAmount(), recurringBuyPlanDetailRootBean.getQuoteCurrency(), recurringBuyPlanDetailRootBean.getQuoteCurrencySymbol(), null, null, false, 56, null);
            }
        } else if (recurringBuyPlanDetailRootBean.getDisplayQuoteCurrencyAfterAmount()) {
            strPrependFiatSymbol$default = lTX.appendCryptoSymbol$default(this.EZpvd, "0", recurringBuyPlanDetailRootBean.getQuoteCurrency(), 0, null, null, 28, null);
        } else {
            strPrependFiatSymbol$default = lTX.prependFiatSymbol$default(this.EZpvd, "0", recurringBuyPlanDetailRootBean.getQuoteCurrency(), recurringBuyPlanDetailRootBean.getQuoteCurrencySymbol(), null, null, false, 56, null);
        }
        lQF lqf3 = new lQF(strPrependFiatSymbol$default, new lQA(null, false, (C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getPnl().getTotalPaymentAmount()) && zOLrzqt) ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.QwvEab, 1, null), this.copydefault.EZpvd(C31351lsQ.Activity.gsvlRV), C52761wXj.TaskDescription.QwvEab);
        if (C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getPnl().getPerformance())) {
            if (recurringBuyPlanDetailRootBean.getDisplayQuoteCurrencyAfterAmount()) {
                strPrependFiatSymbol$default2 = lTX.appendCryptoSymbol$default(this.EZpvd, recurringBuyPlanDetailRootBean.getPnl().getPerformance(), recurringBuyPlanDetailRootBean.getQuoteCurrency(), 0, null, null, 28, null);
            } else {
                strPrependFiatSymbol$default2 = lTX.prependFiatSymbol$default(this.EZpvd, recurringBuyPlanDetailRootBean.getPnl().getPerformance(), recurringBuyPlanDetailRootBean.getQuoteCurrency(), recurringBuyPlanDetailRootBean.getQuoteCurrencySymbol(), null, null, false, 56, null);
            }
        }
        if (C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getPnl().getPerformance()) && zOLrzqt) {
            lqa2 = new lQA(oKCRTrend, false, 0, 6, null);
        } else {
            lqa2 = new lQA(null, false, C52761wXj.Activity.QwvEab, 1, null);
        }
        return new lQC(lqf, lqf2, lqf3, new lQF(strPrependFiatSymbol$default2, lqa2, this.copydefault.EZpvd(C31351lsQ.Activity.DGGHxk), C52761wXj.TaskDescription.zzJhsT));
    }

    public final C30235lQw AEQbTJ(RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean) {
        RecurringBuyPlanStatus recurringBuyPlanStatusKWHzl = RecurringBuyPlanStatus.Companion.KWHzl(recurringBuyPlanDetailRootBean.getStatus());
        if (recurringBuyPlanStatusKWHzl == null || recurringBuyPlanStatusKWHzl == RecurringBuyPlanStatus.CANCELED) {
            return new C30235lQw(false, false, false, false, 14, null);
        }
        boolean zAhwBna = AhwBna(recurringBuyPlanDetailRootBean);
        RecurringErrorCase recurringErrorCaseDjBIcL = djBIcL(recurringBuyPlanDetailRootBean);
        boolean z = recurringErrorCaseDjBIcL == RecurringErrorCase.NO_OTC_QUOTE_1_2_FAIL || recurringErrorCaseDjBIcL == RecurringErrorCase.NO_OTC_QUOTE_3_FAIL_AUTO_PAUSE;
        return new C30235lQw(false, false, (zAhwBna || z) ? false : true, zAhwBna && !z, 3, null);
    }

    public final C30237lQy KWHzl(RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean) {
        return new C30237lQy(recurringBuyPlanDetailRootBean.getShowViewAllButton(), this.OLrzqt.EZpvd(recurringBuyPlanDetailRootBean.getPlacedOrderList()));
    }

    public final RecurringErrorCase djBIcL(RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean) {
        if (C33129mqd.OLrzqt((CharSequence) recurringBuyPlanDetailRootBean.getRecurringBuyErrorType())) {
            RecurringBuyErrorType recurringBuyErrorTypeCopydefault = RecurringBuyErrorType.Companion.copydefault(recurringBuyPlanDetailRootBean.getRecurringBuyErrorType());
            int i = recurringBuyErrorTypeCopydefault == null ? -1 : Application.OLrzqt[recurringBuyErrorTypeCopydefault.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (recurringBuyPlanDetailRootBean.getPlanAutoPaused()) {
                        return RecurringErrorCase.PAYMENT_METHOD_ISSUE_3_FAIL_AUTO_PAUSE;
                    }
                    return RecurringErrorCase.PAYMENT_METHOD_ISSUE_1_2_FAIL;
                }
                if (i == 3) {
                    if (recurringBuyPlanDetailRootBean.getPlanAutoPaused()) {
                        return RecurringErrorCase.NO_OTC_QUOTE_3_FAIL_AUTO_PAUSE;
                    }
                    return RecurringErrorCase.NO_OTC_QUOTE_1_2_FAIL;
                }
            } else {
                if (recurringBuyPlanDetailRootBean.getPlanAutoPaused()) {
                    return RecurringErrorCase.LOW_BALANCE_3_FAIL_AUTO_PAUSE;
                }
                if (recurringBuyPlanDetailRootBean.getLowBalance()) {
                    return RecurringErrorCase.LOW_BALANCE_1_2_FAIL;
                }
            }
        } else if (recurringBuyPlanDetailRootBean.getLowBalance()) {
            return RecurringErrorCase.LOW_BALANCE_WARNING;
        }
        return null;
    }

    public final boolean AhwBna(RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean) {
        return RecurringBuyPlanStatus.Companion.KWHzl(recurringBuyPlanDetailRootBean.getStatus()) == RecurringBuyPlanStatus.PAUSED || recurringBuyPlanDetailRootBean.getPlanAutoPaused();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class RecurringErrorCase {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RecurringErrorCase[] $VALUES;
        private final int messageStringRes;
        private final boolean showDepositButton;
        private final int titleStringRes;
        public static final RecurringErrorCase LOW_BALANCE_WARNING = new RecurringErrorCase("LOW_BALANCE_WARNING", 0, C31351lsQ.Activity.deregisterUser, C31351lsQ.Activity.invokespecialaKhcqp, true);
        public static final RecurringErrorCase LOW_BALANCE_1_2_FAIL = new RecurringErrorCase("LOW_BALANCE_1_2_FAIL", 1, C31351lsQ.Activity.deregisterUser, C31351lsQ.Activity.invokespecialaGOrKO, true);
        public static final RecurringErrorCase LOW_BALANCE_3_FAIL_AUTO_PAUSE = new RecurringErrorCase("LOW_BALANCE_3_FAIL_AUTO_PAUSE", 2, C31351lsQ.Activity.deregisterUser, C31351lsQ.Activity.invokespecialaVhqwO, true);
        public static final RecurringErrorCase PAYMENT_METHOD_ISSUE_1_2_FAIL = new RecurringErrorCase("PAYMENT_METHOD_ISSUE_1_2_FAIL", 3, C31351lsQ.Activity.hlXVux, C31351lsQ.Activity.invokespecialatDTRm, false, 4, null);
        public static final RecurringErrorCase PAYMENT_METHOD_ISSUE_3_FAIL_AUTO_PAUSE = new RecurringErrorCase("PAYMENT_METHOD_ISSUE_3_FAIL_AUTO_PAUSE", 4, C31351lsQ.Activity.hlXVux, C31351lsQ.Activity.invokespecialgBtXYZ, false, 4, null);
        public static final RecurringErrorCase NO_OTC_QUOTE_1_2_FAIL = new RecurringErrorCase("NO_OTC_QUOTE_1_2_FAIL", 5, C31351lsQ.Activity.processStrongAuthMessage, C31351lsQ.Activity.invokespecialdPnHjp, false, 4, null);
        public static final RecurringErrorCase NO_OTC_QUOTE_3_FAIL_AUTO_PAUSE = new RecurringErrorCase("NO_OTC_QUOTE_3_FAIL_AUTO_PAUSE", 6, C31351lsQ.Activity.processStrongAuthMessage, C31351lsQ.Activity.invokespecialhlXVux, false, 4, null);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RecurringErrorCase[] $values() {
            return new RecurringErrorCase[]{LOW_BALANCE_WARNING, LOW_BALANCE_1_2_FAIL, LOW_BALANCE_3_FAIL_AUTO_PAUSE, PAYMENT_METHOD_ISSUE_1_2_FAIL, PAYMENT_METHOD_ISSUE_3_FAIL_AUTO_PAUSE, NO_OTC_QUOTE_1_2_FAIL, NO_OTC_QUOTE_3_FAIL_AUTO_PAUSE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RecurringErrorCase> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getMessageStringRes() {
            return this.messageStringRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getShowDepositButton() {
            return this.showDepositButton;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTitleStringRes() {
            return this.titleStringRes;
        }

        private RecurringErrorCase(@StringRes String str, @StringRes int i, int i2, int i3, boolean z) {
            this.titleStringRes = i2;
            this.messageStringRes = i3;
            this.showDepositButton = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 int)
  (r9v0 int)
  (r10v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(java.lang.String, int, int, int, boolean):void (m)] (LINE:441) call: com.okinc.buysell.ui.recurring.detail.mapper.RecurringBuyPlanDetailModelMapper.RecurringErrorCase.<init>(java.lang.String, int, int, int, boolean):void type: THIS */
        public /* synthetic */ RecurringErrorCase(String str, int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, i3, (i4 & 4) != 0 ? false : z);
        }

        static {
            RecurringErrorCase[] recurringErrorCaseArr$values = $values();
            $VALUES = recurringErrorCaseArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(recurringErrorCaseArr$values);
        }

        public static RecurringErrorCase valueOf(String str) {
            return (RecurringErrorCase) Enum.valueOf(RecurringErrorCase.class, str);
        }

        public static RecurringErrorCase[] values() {
            return (RecurringErrorCase[]) $VALUES.clone();
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.detail.mapper.RecurringBuyPlanDetailModelMapper.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final C30238lQz EZpvd(RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean, List<RecurringBuyFrequencyBean> list) {
        Object next;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (RecurringBuyFrequencyBean recurringBuyFrequencyBean : list) {
            arrayList.add(RecurringFrequencyOption.Companion.AEQbTJ(String.valueOf(recurringBuyFrequencyBean.getCode()), recurringBuyFrequencyBean.getFrequency(), pTA.formatStandardDate$default(new Date(C33129mqd.valueOf(recurringBuyFrequencyBean.getNextPurchaseTime())), null, 1, null), Intrinsics.EZpvd((Object) recurringBuyFrequencyBean.getFrequency(), (Object) recurringBuyPlanDetailRootBean.getFrequency())));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((RecurringFrequencyOption) next).isSelected()) {
                break;
            }
        }
        RecurringFrequencyOption recurringFrequencyOptionAEQbTJ = (RecurringFrequencyOption) next;
        if (recurringFrequencyOptionAEQbTJ == null) {
            recurringFrequencyOptionAEQbTJ = RecurringFrequencyOption.Companion.AEQbTJ(String.valueOf(recurringBuyPlanDetailRootBean.getId()), recurringBuyPlanDetailRootBean.getFrequency(), pTA.formatStandardDate$default(new Date(C33129mqd.valueOf(recurringBuyPlanDetailRootBean.getNextPurchaseTime())), null, 1, null), true);
        }
        return new C30238lQz(recurringFrequencyOptionAEQbTJ, arrayList);
    }
}
