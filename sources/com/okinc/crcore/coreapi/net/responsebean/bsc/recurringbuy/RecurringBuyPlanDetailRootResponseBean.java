package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class RecurringBuyPlanDetailRootResponseBean {
    private final String baseCurrency;
    private final String baseCurrencyIcon;
    private final int categoryCode;
    private final String createTime;
    private final boolean displayQuoteCurrencyAfterAmount;
    private final RecurringBuyEditPlanAmountResponseBean editPlanAmountLimit;
    private final String firstOrder;
    private final String frequency;
    private final long id;
    private final String last4;
    private final String lastPurchaseTime;
    private final boolean lowBalance;
    private final String nextPurchase;
    private final String nextPurchaseTime;
    private final String paymentMethod;
    private final String paymentMethodNightUrl;
    private final String paymentMethodUrl;
    private final List<RecurringBuyPlacedOrderResponseBean> placedOrderList;
    private final boolean planAutoPaused;
    private final String planId;
    private final RecurringBuyPlanDetailPnlResponseBean pnl;
    private final long purchaseTimes;
    private final String quoteAmount;
    private final String quoteCurrency;
    private final String quoteCurrencyIcon;
    private final String quoteCurrencySymbol;
    private final String recurringBuyErrorType;
    private final String roi;
    private final long roiStatus;
    private final boolean showViewAllButton;
    private String status;
    private final String totalBaseAmount;
    private final String totalQuoteAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(RecurringBuyPlacedOrderResponseBean$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailRootResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringBuyPlanDetailRootResponseBean copy$default(RecurringBuyPlanDetailRootResponseBean recurringBuyPlanDetailRootResponseBean, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean, String str10, String str11, List list, boolean z3, String str12, String str13, String str14, String str15, int i, boolean z4, long j2, String str16, String str17, String str18, String str19, RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean, String str20, String str21, String str22, long j3, int i2, int i3, Object obj) {
        long j4 = (i2 & 1) != 0 ? recurringBuyPlanDetailRootResponseBean.id : j;
        String str23 = (i2 & 2) != 0 ? recurringBuyPlanDetailRootResponseBean.planId : str;
        String str24 = (i2 & 4) != 0 ? recurringBuyPlanDetailRootResponseBean.baseCurrency : str2;
        String str25 = (i2 & 8) != 0 ? recurringBuyPlanDetailRootResponseBean.quoteAmount : str3;
        String str26 = (i2 & 16) != 0 ? recurringBuyPlanDetailRootResponseBean.quoteCurrency : str4;
        String str27 = (i2 & 32) != 0 ? recurringBuyPlanDetailRootResponseBean.quoteCurrencySymbol : str5;
        String str28 = (i2 & 64) != 0 ? recurringBuyPlanDetailRootResponseBean.quoteCurrencyIcon : str6;
        String str29 = (i2 & 128) != 0 ? recurringBuyPlanDetailRootResponseBean.firstOrder : str7;
        String str30 = (i2 & 256) != 0 ? recurringBuyPlanDetailRootResponseBean.status : str8;
        boolean z5 = (i2 & 512) != 0 ? recurringBuyPlanDetailRootResponseBean.lowBalance : z;
        boolean z6 = (i2 & 1024) != 0 ? recurringBuyPlanDetailRootResponseBean.planAutoPaused : z2;
        String str31 = (i2 & 2048) != 0 ? recurringBuyPlanDetailRootResponseBean.recurringBuyErrorType : str9;
        return recurringBuyPlanDetailRootResponseBean.copy(j4, str23, str24, str25, str26, str27, str28, str29, str30, z5, z6, str31, (i2 & 4096) != 0 ? recurringBuyPlanDetailRootResponseBean.pnl : recurringBuyPlanDetailPnlResponseBean, (i2 & 8192) != 0 ? recurringBuyPlanDetailRootResponseBean.createTime : str10, (i2 & 16384) != 0 ? recurringBuyPlanDetailRootResponseBean.frequency : str11, (i2 & 32768) != 0 ? recurringBuyPlanDetailRootResponseBean.placedOrderList : list, (i2 & 65536) != 0 ? recurringBuyPlanDetailRootResponseBean.showViewAllButton : z3, (i2 & 131072) != 0 ? recurringBuyPlanDetailRootResponseBean.paymentMethod : str12, (i2 & 262144) != 0 ? recurringBuyPlanDetailRootResponseBean.paymentMethodUrl : str13, (i2 & 524288) != 0 ? recurringBuyPlanDetailRootResponseBean.paymentMethodNightUrl : str14, (i2 & 1048576) != 0 ? recurringBuyPlanDetailRootResponseBean.last4 : str15, (i2 & 2097152) != 0 ? recurringBuyPlanDetailRootResponseBean.categoryCode : i, (i2 & 4194304) != 0 ? recurringBuyPlanDetailRootResponseBean.displayQuoteCurrencyAfterAmount : z4, (i2 & 8388608) != 0 ? recurringBuyPlanDetailRootResponseBean.purchaseTimes : j2, (i2 & 16777216) != 0 ? recurringBuyPlanDetailRootResponseBean.baseCurrencyIcon : str16, (33554432 & i2) != 0 ? recurringBuyPlanDetailRootResponseBean.roi : str17, (i2 & 67108864) != 0 ? recurringBuyPlanDetailRootResponseBean.totalBaseAmount : str18, (i2 & 134217728) != 0 ? recurringBuyPlanDetailRootResponseBean.totalQuoteAmount : str19, (i2 & 268435456) != 0 ? recurringBuyPlanDetailRootResponseBean.editPlanAmountLimit : recurringBuyEditPlanAmountResponseBean, (i2 & 536870912) != 0 ? recurringBuyPlanDetailRootResponseBean.nextPurchaseTime : str20, (i2 & 1073741824) != 0 ? recurringBuyPlanDetailRootResponseBean.lastPurchaseTime : str21, (i2 & Integer.MIN_VALUE) != 0 ? recurringBuyPlanDetailRootResponseBean.nextPurchase : str22, (i3 & 1) != 0 ? recurringBuyPlanDetailRootResponseBean.roiStatus : j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.lowBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.planAutoPaused;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.recurringBuyErrorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanDetailPnlResponseBean component13() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringBuyPlacedOrderResponseBean> component16() {
        return this.placedOrderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.showViewAllButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.paymentMethodUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.paymentMethodNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.last4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.displayQuoteCurrencyAfterAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component24() {
        return this.purchaseTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.baseCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.roi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.totalBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.totalQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyEditPlanAmountResponseBean component29() {
        return this.editPlanAmountLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.nextPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.lastPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.nextPurchase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component33() {
        return this.roiStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.firstOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanDetailRootResponseBean copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, boolean z2, @NotNull String str9, RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean, @NotNull String str10, @NotNull String str11, List<RecurringBuyPlacedOrderResponseBean> list, boolean z3, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, int i, boolean z4, long j2, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean, @NotNull String str20, @NotNull String str21, @NotNull String str22, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        return new RecurringBuyPlanDetailRootResponseBean(j, str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, recurringBuyPlanDetailPnlResponseBean, str10, str11, list, z3, str12, str13, str14, str15, i, z4, j2, str16, str17, str18, str19, recurringBuyEditPlanAmountResponseBean, str20, str21, str22, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBuyPlanDetailRootResponseBean)) {
            return false;
        }
        RecurringBuyPlanDetailRootResponseBean recurringBuyPlanDetailRootResponseBean = (RecurringBuyPlanDetailRootResponseBean) obj;
        return this.id == recurringBuyPlanDetailRootResponseBean.id && Intrinsics.EZpvd((Object) this.planId, (Object) recurringBuyPlanDetailRootResponseBean.planId) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) recurringBuyPlanDetailRootResponseBean.baseCurrency) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) recurringBuyPlanDetailRootResponseBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) recurringBuyPlanDetailRootResponseBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) recurringBuyPlanDetailRootResponseBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteCurrencyIcon, (Object) recurringBuyPlanDetailRootResponseBean.quoteCurrencyIcon) && Intrinsics.EZpvd((Object) this.firstOrder, (Object) recurringBuyPlanDetailRootResponseBean.firstOrder) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyPlanDetailRootResponseBean.status) && this.lowBalance == recurringBuyPlanDetailRootResponseBean.lowBalance && this.planAutoPaused == recurringBuyPlanDetailRootResponseBean.planAutoPaused && Intrinsics.EZpvd((Object) this.recurringBuyErrorType, (Object) recurringBuyPlanDetailRootResponseBean.recurringBuyErrorType) && Intrinsics.EZpvd(this.pnl, recurringBuyPlanDetailRootResponseBean.pnl) && Intrinsics.EZpvd((Object) this.createTime, (Object) recurringBuyPlanDetailRootResponseBean.createTime) && Intrinsics.EZpvd((Object) this.frequency, (Object) recurringBuyPlanDetailRootResponseBean.frequency) && Intrinsics.EZpvd(this.placedOrderList, recurringBuyPlanDetailRootResponseBean.placedOrderList) && this.showViewAllButton == recurringBuyPlanDetailRootResponseBean.showViewAllButton && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) recurringBuyPlanDetailRootResponseBean.paymentMethod) && Intrinsics.EZpvd((Object) this.paymentMethodUrl, (Object) recurringBuyPlanDetailRootResponseBean.paymentMethodUrl) && Intrinsics.EZpvd((Object) this.paymentMethodNightUrl, (Object) recurringBuyPlanDetailRootResponseBean.paymentMethodNightUrl) && Intrinsics.EZpvd((Object) this.last4, (Object) recurringBuyPlanDetailRootResponseBean.last4) && this.categoryCode == recurringBuyPlanDetailRootResponseBean.categoryCode && this.displayQuoteCurrencyAfterAmount == recurringBuyPlanDetailRootResponseBean.displayQuoteCurrencyAfterAmount && this.purchaseTimes == recurringBuyPlanDetailRootResponseBean.purchaseTimes && Intrinsics.EZpvd((Object) this.baseCurrencyIcon, (Object) recurringBuyPlanDetailRootResponseBean.baseCurrencyIcon) && Intrinsics.EZpvd((Object) this.roi, (Object) recurringBuyPlanDetailRootResponseBean.roi) && Intrinsics.EZpvd((Object) this.totalBaseAmount, (Object) recurringBuyPlanDetailRootResponseBean.totalBaseAmount) && Intrinsics.EZpvd((Object) this.totalQuoteAmount, (Object) recurringBuyPlanDetailRootResponseBean.totalQuoteAmount) && Intrinsics.EZpvd(this.editPlanAmountLimit, recurringBuyPlanDetailRootResponseBean.editPlanAmountLimit) && Intrinsics.EZpvd((Object) this.nextPurchaseTime, (Object) recurringBuyPlanDetailRootResponseBean.nextPurchaseTime) && Intrinsics.EZpvd((Object) this.lastPurchaseTime, (Object) recurringBuyPlanDetailRootResponseBean.lastPurchaseTime) && Intrinsics.EZpvd((Object) this.nextPurchase, (Object) recurringBuyPlanDetailRootResponseBean.nextPurchase) && this.roiStatus == recurringBuyPlanDetailRootResponseBean.roiStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyIcon() {
        return this.baseCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCategoryCode() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDisplayQuoteCurrencyAfterAmount() {
        return this.displayQuoteCurrencyAfterAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyEditPlanAmountResponseBean getEditPlanAmountLimit() {
        return this.editPlanAmountLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirstOrder() {
        return this.firstOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast4() {
        return this.last4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPurchaseTime() {
        return this.lastPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLowBalance() {
        return this.lowBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextPurchase() {
        return this.nextPurchase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextPurchaseTime() {
        return this.nextPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodNightUrl() {
        return this.paymentMethodNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodUrl() {
        return this.paymentMethodUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringBuyPlacedOrderResponseBean> getPlacedOrderList() {
        return this.placedOrderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPlanAutoPaused() {
        return this.planAutoPaused;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanDetailPnlResponseBean getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPurchaseTimes() {
        return this.purchaseTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrencyIcon() {
        return this.quoteCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrencySymbol() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringBuyErrorType() {
        return this.recurringBuyErrorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRoi() {
        return this.roi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRoiStatus() {
        return this.roiStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowViewAllButton() {
        return this.showViewAllButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBaseAmount() {
        return this.totalBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalQuoteAmount() {
        return this.totalQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.planId.hashCode();
        int iHashCode3 = this.baseCurrency.hashCode();
        int iHashCode4 = this.quoteAmount.hashCode();
        int iHashCode5 = this.quoteCurrency.hashCode();
        int iHashCode6 = this.quoteCurrencySymbol.hashCode();
        int iHashCode7 = this.quoteCurrencyIcon.hashCode();
        int iHashCode8 = this.firstOrder.hashCode();
        int iHashCode9 = this.status.hashCode();
        int iHashCode10 = Boolean.hashCode(this.lowBalance);
        int iHashCode11 = Boolean.hashCode(this.planAutoPaused);
        int iHashCode12 = this.recurringBuyErrorType.hashCode();
        RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean = this.pnl;
        int iHashCode13 = recurringBuyPlanDetailPnlResponseBean == null ? 0 : recurringBuyPlanDetailPnlResponseBean.hashCode();
        int iHashCode14 = this.createTime.hashCode();
        int iHashCode15 = this.frequency.hashCode();
        List<RecurringBuyPlacedOrderResponseBean> list = this.placedOrderList;
        int iHashCode16 = list == null ? 0 : list.hashCode();
        int iHashCode17 = Boolean.hashCode(this.showViewAllButton);
        int iHashCode18 = this.paymentMethod.hashCode();
        int iHashCode19 = this.paymentMethodUrl.hashCode();
        int iHashCode20 = this.paymentMethodNightUrl.hashCode();
        int iHashCode21 = this.last4.hashCode();
        int iHashCode22 = Integer.hashCode(this.categoryCode);
        int iHashCode23 = Boolean.hashCode(this.displayQuoteCurrencyAfterAmount);
        int iHashCode24 = Long.hashCode(this.purchaseTimes);
        int iHashCode25 = this.baseCurrencyIcon.hashCode();
        int iHashCode26 = this.roi.hashCode();
        int iHashCode27 = this.totalBaseAmount.hashCode();
        int iHashCode28 = this.totalQuoteAmount.hashCode();
        RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean = this.editPlanAmountLimit;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (recurringBuyEditPlanAmountResponseBean == null ? 0 : recurringBuyEditPlanAmountResponseBean.hashCode())) * 31) + this.nextPurchaseTime.hashCode()) * 31) + this.lastPurchaseTime.hashCode()) * 31) + this.nextPurchase.hashCode()) * 31) + Long.hashCode(this.roiStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanDetailRootResponseBean(id=" + this.id + ", planId=" + this.planId + ", baseCurrency=" + this.baseCurrency + ", quoteAmount=" + this.quoteAmount + ", quoteCurrency=" + this.quoteCurrency + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteCurrencyIcon=" + this.quoteCurrencyIcon + ", firstOrder=" + this.firstOrder + ", status=" + this.status + ", lowBalance=" + this.lowBalance + ", planAutoPaused=" + this.planAutoPaused + ", recurringBuyErrorType=" + this.recurringBuyErrorType + ", pnl=" + this.pnl + ", createTime=" + this.createTime + ", frequency=" + this.frequency + ", placedOrderList=" + this.placedOrderList + ", showViewAllButton=" + this.showViewAllButton + ", paymentMethod=" + this.paymentMethod + ", paymentMethodUrl=" + this.paymentMethodUrl + ", paymentMethodNightUrl=" + this.paymentMethodNightUrl + ", last4=" + this.last4 + ", categoryCode=" + this.categoryCode + ", displayQuoteCurrencyAfterAmount=" + this.displayQuoteCurrencyAfterAmount + ", purchaseTimes=" + this.purchaseTimes + ", baseCurrencyIcon=" + this.baseCurrencyIcon + ", roi=" + this.roi + ", totalBaseAmount=" + this.totalBaseAmount + ", totalQuoteAmount=" + this.totalQuoteAmount + ", editPlanAmountLimit=" + this.editPlanAmountLimit + ", nextPurchaseTime=" + this.nextPurchaseTime + ", lastPurchaseTime=" + this.lastPurchaseTime + ", nextPurchase=" + this.nextPurchase + ", roiStatus=" + this.roiStatus + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailRootResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyPlanDetailRootResponseBean> serializer() {
            return RecurringBuyPlanDetailRootResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyPlanDetailRootResponseBean(int i, int i2, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean, String str10, String str11, List list, boolean z3, String str12, String str13, String str14, String str15, int i3, boolean z4, long j2, String str16, String str17, String str18, String str19, RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean, String str20, String str21, String str22, long j3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((-8194177 != (i & (-8194177))) | (1 != (i2 & 1))) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{-8194177, 1}, RecurringBuyPlanDetailRootResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        this.planId = str;
        this.baseCurrency = str2;
        this.quoteAmount = str3;
        this.quoteCurrency = str4;
        this.quoteCurrencySymbol = str5;
        this.quoteCurrencyIcon = str6;
        if ((i & 128) == 0) {
            this.firstOrder = "";
        } else {
            this.firstOrder = str7;
        }
        this.status = str8;
        this.lowBalance = z;
        this.planAutoPaused = z2;
        if ((i & 2048) == 0) {
            this.recurringBuyErrorType = "";
        } else {
            this.recurringBuyErrorType = str9;
        }
        this.pnl = recurringBuyPlanDetailPnlResponseBean;
        this.createTime = str10;
        this.frequency = str11;
        this.placedOrderList = list;
        if ((65536 & i) == 0) {
            this.showViewAllButton = false;
        } else {
            this.showViewAllButton = z3;
        }
        this.paymentMethod = str12;
        if ((262144 & i) == 0) {
            this.paymentMethodUrl = "";
        } else {
            this.paymentMethodUrl = str13;
        }
        if ((524288 & i) == 0) {
            this.paymentMethodNightUrl = "";
        } else {
            this.paymentMethodNightUrl = str14;
        }
        if ((1048576 & i) == 0) {
            this.last4 = "";
        } else {
            this.last4 = str15;
        }
        if ((2097152 & i) == 0) {
            this.categoryCode = 0;
        } else {
            this.categoryCode = i3;
        }
        if ((i & 4194304) == 0) {
            this.displayQuoteCurrencyAfterAmount = false;
        } else {
            this.displayQuoteCurrencyAfterAmount = z4;
        }
        this.purchaseTimes = j2;
        this.baseCurrencyIcon = str16;
        this.roi = str17;
        this.totalBaseAmount = str18;
        this.totalQuoteAmount = str19;
        this.editPlanAmountLimit = recurringBuyEditPlanAmountResponseBean;
        this.nextPurchaseTime = str20;
        this.lastPurchaseTime = str21;
        this.nextPurchase = str22;
        this.roiStatus = j3;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyPlanDetailRootResponseBean recurringBuyPlanDetailRootResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, recurringBuyPlanDetailRootResponseBean.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyPlanDetailRootResponseBean.planId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringBuyPlanDetailRootResponseBean.baseCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringBuyPlanDetailRootResponseBean.quoteAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, recurringBuyPlanDetailRootResponseBean.quoteCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, recurringBuyPlanDetailRootResponseBean.quoteCurrencySymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, recurringBuyPlanDetailRootResponseBean.quoteCurrencyIcon);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) recurringBuyPlanDetailRootResponseBean.firstOrder, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, recurringBuyPlanDetailRootResponseBean.firstOrder);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, recurringBuyPlanDetailRootResponseBean.status);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 9, recurringBuyPlanDetailRootResponseBean.lowBalance);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 10, recurringBuyPlanDetailRootResponseBean.planAutoPaused);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) recurringBuyPlanDetailRootResponseBean.recurringBuyErrorType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, recurringBuyPlanDetailRootResponseBean.recurringBuyErrorType);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, RecurringBuyPlanDetailPnlResponseBean$$serializer.INSTANCE, recurringBuyPlanDetailRootResponseBean.pnl);
        compositeEncoder.encodeStringElement(serialDescriptor, 13, recurringBuyPlanDetailRootResponseBean.createTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 14, recurringBuyPlanDetailRootResponseBean.frequency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], recurringBuyPlanDetailRootResponseBean.placedOrderList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || recurringBuyPlanDetailRootResponseBean.showViewAllButton) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, recurringBuyPlanDetailRootResponseBean.showViewAllButton);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, recurringBuyPlanDetailRootResponseBean.paymentMethod);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) recurringBuyPlanDetailRootResponseBean.paymentMethodUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, recurringBuyPlanDetailRootResponseBean.paymentMethodUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) recurringBuyPlanDetailRootResponseBean.paymentMethodNightUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, recurringBuyPlanDetailRootResponseBean.paymentMethodNightUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) recurringBuyPlanDetailRootResponseBean.last4, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, recurringBuyPlanDetailRootResponseBean.last4);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || recurringBuyPlanDetailRootResponseBean.categoryCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 21, recurringBuyPlanDetailRootResponseBean.categoryCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || recurringBuyPlanDetailRootResponseBean.displayQuoteCurrencyAfterAmount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, recurringBuyPlanDetailRootResponseBean.displayQuoteCurrencyAfterAmount);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 23, recurringBuyPlanDetailRootResponseBean.purchaseTimes);
        compositeEncoder.encodeStringElement(serialDescriptor, 24, recurringBuyPlanDetailRootResponseBean.baseCurrencyIcon);
        compositeEncoder.encodeStringElement(serialDescriptor, 25, recurringBuyPlanDetailRootResponseBean.roi);
        compositeEncoder.encodeStringElement(serialDescriptor, 26, recurringBuyPlanDetailRootResponseBean.totalBaseAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 27, recurringBuyPlanDetailRootResponseBean.totalQuoteAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, RecurringBuyEditPlanAmountResponseBean$$serializer.INSTANCE, recurringBuyPlanDetailRootResponseBean.editPlanAmountLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 29, recurringBuyPlanDetailRootResponseBean.nextPurchaseTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 30, recurringBuyPlanDetailRootResponseBean.lastPurchaseTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 31, recurringBuyPlanDetailRootResponseBean.nextPurchase);
        compositeEncoder.encodeLongElement(serialDescriptor, 32, recurringBuyPlanDetailRootResponseBean.roiStatus);
    }

    public RecurringBuyPlanDetailRootResponseBean(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, boolean z2, @NotNull String str9, RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean, @NotNull String str10, @NotNull String str11, List<RecurringBuyPlacedOrderResponseBean> list, boolean z3, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, int i, boolean z4, long j2, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean, @NotNull String str20, @NotNull String str21, @NotNull String str22, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        this.id = j;
        this.planId = str;
        this.baseCurrency = str2;
        this.quoteAmount = str3;
        this.quoteCurrency = str4;
        this.quoteCurrencySymbol = str5;
        this.quoteCurrencyIcon = str6;
        this.firstOrder = str7;
        this.status = str8;
        this.lowBalance = z;
        this.planAutoPaused = z2;
        this.recurringBuyErrorType = str9;
        this.pnl = recurringBuyPlanDetailPnlResponseBean;
        this.createTime = str10;
        this.frequency = str11;
        this.placedOrderList = list;
        this.showViewAllButton = z3;
        this.paymentMethod = str12;
        this.paymentMethodUrl = str13;
        this.paymentMethodNightUrl = str14;
        this.last4 = str15;
        this.categoryCode = i;
        this.displayQuoteCurrencyAfterAmount = z4;
        this.purchaseTimes = j2;
        this.baseCurrencyIcon = str16;
        this.roi = str17;
        this.totalBaseAmount = str18;
        this.totalQuoteAmount = str19;
        this.editPlanAmountLimit = recurringBuyEditPlanAmountResponseBean;
        this.nextPurchaseTime = str20;
        this.lastPurchaseTime = str21;
        this.nextPurchase = str22;
        this.roiStatus = j3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0086: CONSTRUCTOR 
  (r41v0 long)
  (r43v0 java.lang.String)
  (r44v0 java.lang.String)
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (r47v0 java.lang.String)
  (r48v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r77v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (r50v0 java.lang.String)
  (r51v0 boolean)
  (r52v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r77v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (r54v0 com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailPnlResponseBean)
  (r55v0 java.lang.String)
  (r56v0 java.lang.String)
  (r57v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (65536 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? false : (r58v0 boolean))
  (r59v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (262144 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (524288 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (1048576 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0040: ARITH (2097152 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r63v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r77v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r64v0 boolean))
  (r65v0 long)
  (r67v0 java.lang.String)
  (r68v0 java.lang.String)
  (r69v0 java.lang.String)
  (r70v0 java.lang.String)
  (r71v0 com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyEditPlanAmountResponseBean)
  (r72v0 java.lang.String)
  (r73v0 java.lang.String)
  (r74v0 java.lang.String)
  (r75v0 long)
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailPnlResponseBean, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlacedOrderResponseBean>, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyEditPlanAmountResponseBean, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailRootResponseBean.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailPnlResponseBean, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyEditPlanAmountResponseBean, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ RecurringBuyPlanDetailRootResponseBean(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean, String str10, String str11, List list, boolean z3, String str12, String str13, String str14, String str15, int i, boolean z4, long j2, String str16, String str17, String str18, String str19, RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean, String str20, String str21, String str22, long j3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, str5, str6, (i2 & 128) != 0 ? "" : str7, str8, z, z2, (i2 & 2048) != 0 ? "" : str9, recurringBuyPlanDetailPnlResponseBean, str10, str11, list, (65536 & i2) != 0 ? false : z3, str12, (262144 & i2) != 0 ? "" : str13, (524288 & i2) != 0 ? "" : str14, (1048576 & i2) != 0 ? "" : str15, (2097152 & i2) != 0 ? 0 : i, (i2 & 4194304) != 0 ? false : z4, j2, str16, str17, str18, str19, recurringBuyEditPlanAmountResponseBean, str20, str21, str22, j3);
    }
}
