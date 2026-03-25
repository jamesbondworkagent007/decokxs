package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.okex.center.bean.ContextualScenarioModel;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.TransactionBean;
import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import com.okinc.okex.center.bean.enums.TransactionTagLabel;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.Sign;
import com.okinc.okex.center.ui.displaymodels.TransactionBannerDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sis, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45073sis {

    /* JADX INFO: renamed from: o.sis$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Deposit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Withdrawal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.P2P.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[SelfServiceScenario.values().length];
            try {
                iArr2[SelfServiceScenario.P2P_REORDER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SelfServiceScenario.WITHDRAW_ASSET.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr2;
        }
    }

    public static /* synthetic */ TransactionDisplayModel toTransactionDisplayModel$default(TransactionBean transactionBean, ContextualScenarioModel contextualScenarioModel, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contextualScenarioModel = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return AEQbTJ(transactionBean, contextualScenarioModel, list);
    }

    public static final TransactionDisplayModel AEQbTJ(@NotNull TransactionBean transactionBean, ContextualScenarioModel contextualScenarioModel, java.util.List<TransactionBannerDisplayModel> list) {
        kotlin.Pair pairOLrzqt;
        TransactionTagLabel transactionTagLabel;
        java.lang.String iconBright;
        Intrinsics.checkNotNullParameter(transactionBean, "");
        java.lang.String strCopydefault = copydefault(transactionBean, false);
        java.lang.String strCopydefault2 = copydefault(transactionBean, true);
        java.lang.Long createdDate = transactionBean.getCreatedDate();
        java.lang.String simpleDateTime$default = createdDate != null ? pTA.formatSimpleDateTime$default(new Date(createdDate.longValue()), null, 1, null) : null;
        java.lang.Long createdDate2 = transactionBean.getCreatedDate();
        java.lang.String simpleDate$default = createdDate2 != null ? pTA.formatSimpleDate$default(new Date(createdDate2.longValue()), null, 1, null) : null;
        if (contextualScenarioModel != null) {
            java.lang.String cause = contextualScenarioModel.getCause();
            if (C33492mxV.OLrzqt()) {
                iconBright = contextualScenarioModel.getIconDark();
            } else {
                iconBright = contextualScenarioModel.getIconBright();
            }
            pairOLrzqt = C56390yDp.OLrzqt(cause, iconBright);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt("", "");
        }
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        java.util.List<TransactionTagLabel> labels = transactionBean.getLabels();
        if (labels == null || (transactionTagLabel = (TransactionTagLabel) CollectionsKt___CollectionsKt.firstOrNull(labels)) == null) {
            transactionTagLabel = TransactionTagLabel.NoTag;
        }
        TransactionTagLabel transactionTagLabel2 = transactionTagLabel;
        java.lang.Integer displayStringResId = transactionTagLabel2.getDisplayStringResId();
        java.lang.String strAYXKKw = displayStringResId != null ? C33070mpX.AYXKKw(displayStringResId.intValue()) : null;
        java.lang.String str3 = strAYXKKw == null ? "" : strAYXKKw;
        boolean zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3);
        java.lang.String id = transactionBean.getId();
        TransactionType transactionType = transactionBean.getTransactionType();
        if (transactionType == null) {
            transactionType = TransactionType.Unknown;
        }
        TransactionType transactionType2 = transactionType;
        java.lang.String str4 = strCopydefault == null ? "" : strCopydefault;
        java.lang.String str5 = strCopydefault2 == null ? "" : strCopydefault2;
        java.lang.Integer currencyId = transactionBean.getCurrencyId();
        java.lang.String displayedDescription = transactionBean.getDisplayedDescription();
        java.lang.String str6 = displayedDescription == null ? "" : displayedDescription;
        java.lang.String status = transactionBean.getStatus();
        java.lang.String str7 = status == null ? "" : status;
        java.lang.String displayedStatus = transactionBean.getDisplayedStatus();
        return new TransactionDisplayModel(id, transactionType2, str4, str5, zFARcdN, currencyId, str6, str7, displayedStatus == null ? "" : displayedStatus, simpleDateTime$default == null ? "" : simpleDateTime$default, str, str2, transactionTagLabel2, str3, list == null ? yDY.AhwBna() : list, transactionBean.getCoachMark(), transactionBean.getHighlight(), transactionBean.getLabel(), transactionBean.getLabelColor(), simpleDate$default == null ? "" : simpleDate$default);
    }

    public static final java.lang.String copydefault(TransactionBean transactionBean, boolean z) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String amount;
        java.lang.String currency;
        java.lang.Boolean bool;
        DisplaySign displaySign;
        java.lang.String cryptoCode$default;
        try {
            Result.Application application = Result.Companion;
            TransactionType transactionType = transactionBean.getTransactionType();
            int i = transactionType == null ? -1 : Activity.copydefault[transactionType.ordinal()];
            if (i == 1 || i == 2) {
                amount = transactionBean.getAmount();
                currency = transactionBean.getCurrency();
                bool = java.lang.Boolean.FALSE;
            } else {
                if (i != 3) {
                    return null;
                }
                amount = transactionBean.getQuoteAmount();
                currency = transactionBean.getQuoteCurrency();
                bool = java.lang.Boolean.TRUE;
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (amount != null && amount.length() != 0 && (!bool.booleanValue() || (currency != null && currency.length() != 0))) {
            BigDecimal bigDecimalAbs = C33129mqd.EZpvd(amount).abs();
            java.lang.Integer sign = transactionBean.getSign();
            int value = Sign.Negative.getValue();
            if (sign != null && sign.intValue() == value) {
                bigDecimalAbs = bigDecimalAbs.negate();
            }
            C38307pTy c38307pTyKWHzl = C38307pTy.Companion.KWHzl(0, 8);
            java.lang.Integer sign2 = transactionBean.getSign();
            int value2 = Sign.NoSign.getValue();
            if (sign2 == null || sign2.intValue() != value2) {
                displaySign = DisplaySign.EXCEPT_ZERO;
            } else {
                displaySign = DisplaySign.AUTO;
            }
            DisplaySign displaySign2 = displaySign;
            if (currency == null) {
                currency = "";
            }
            if (bool.booleanValue()) {
                Intrinsics.copydefault(bigDecimalAbs);
                cryptoCode$default = C38305pTw.formatFiatCode$default(bigDecimalAbs, currency, null, c38307pTyKWHzl, displaySign2, null, null, 50, null);
            } else {
                Intrinsics.copydefault(bigDecimalAbs);
                if (!z) {
                    currency = "";
                }
                cryptoCode$default = C38305pTw.formatCryptoCode$default(bigDecimalAbs, currency, null, c38307pTyKWHzl, displaySign2, null, null, 50, null);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(cryptoCode$default);
            return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        return null;
    }

    public static final java.lang.Object KWHzl(@NotNull TransactionDisplayModel transactionDisplayModel, @NotNull SelfServiceToolBean selfServiceToolBean) {
        java.lang.Integer currencyId;
        Intrinsics.checkNotNullParameter(transactionDisplayModel, "");
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        int i = Activity.KWHzl[selfServiceToolBean.getScenario().ordinal()];
        if (i == 1) {
            return transactionDisplayModel.getId();
        }
        if (i == 2 && (currencyId = transactionDisplayModel.getCurrencyId()) != null) {
            return new C45299snF(currencyId.intValue(), transactionDisplayModel.getTransactionTag() == TransactionTagLabel.Untradable, null, 4, null);
        }
        return null;
    }
}
