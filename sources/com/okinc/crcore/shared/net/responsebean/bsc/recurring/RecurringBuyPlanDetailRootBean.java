package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyEditPlanAmountResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlacedOrderResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailPnlResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailRootResponseBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlacedOrderBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyPlanDetailRootBean implements Parcelable {
    private final String baseCurrency;
    private final String baseCurrencyIcon;
    private final int categoryCode;
    private final String createTime;
    private final boolean displayQuoteCurrencyAfterAmount;
    private final RecurringBuyEditPlanAmountBean editPlanAmountLimit;
    private final String firstOrderId;
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
    private final List<RecurringBuyPlacedOrderBean> placedOrderList;
    private final boolean planAutoPaused;
    private final String planId;
    private final RecurringBuyPlanDetailPnlBean pnl;
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
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyPlanDetailRootBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RecurringBuyPlanDetailRootBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanDetailRootBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String string9 = parcel.readString();
            RecurringBuyPlanDetailPnlBean recurringBuyPlanDetailPnlBeanCreateFromParcel = RecurringBuyPlanDetailPnlBean.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(RecurringBuyPlacedOrderBean.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            return new RecurringBuyPlanDetailRootBean(j, string, string2, string3, string4, string5, string6, string7, string8, z, z2, string9, recurringBuyPlanDetailPnlBeanCreateFromParcel, string10, string11, arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), RecurringBuyEditPlanAmountBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanDetailRootBean[] newArray(int i) {
            return new RecurringBuyPlanDetailRootBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailRootBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringBuyPlanDetailRootBean copy$default(RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, RecurringBuyPlanDetailPnlBean recurringBuyPlanDetailPnlBean, String str10, String str11, List list, boolean z3, String str12, String str13, String str14, String str15, int i, boolean z4, long j2, String str16, String str17, String str18, String str19, RecurringBuyEditPlanAmountBean recurringBuyEditPlanAmountBean, String str20, String str21, String str22, long j3, int i2, int i3, Object obj) {
        long j4 = (i2 & 1) != 0 ? recurringBuyPlanDetailRootBean.id : j;
        String str23 = (i2 & 2) != 0 ? recurringBuyPlanDetailRootBean.planId : str;
        String str24 = (i2 & 4) != 0 ? recurringBuyPlanDetailRootBean.baseCurrency : str2;
        String str25 = (i2 & 8) != 0 ? recurringBuyPlanDetailRootBean.quoteAmount : str3;
        String str26 = (i2 & 16) != 0 ? recurringBuyPlanDetailRootBean.quoteCurrency : str4;
        String str27 = (i2 & 32) != 0 ? recurringBuyPlanDetailRootBean.quoteCurrencySymbol : str5;
        String str28 = (i2 & 64) != 0 ? recurringBuyPlanDetailRootBean.quoteCurrencyIcon : str6;
        String str29 = (i2 & 128) != 0 ? recurringBuyPlanDetailRootBean.firstOrderId : str7;
        String str30 = (i2 & 256) != 0 ? recurringBuyPlanDetailRootBean.status : str8;
        boolean z5 = (i2 & 512) != 0 ? recurringBuyPlanDetailRootBean.lowBalance : z;
        boolean z6 = (i2 & 1024) != 0 ? recurringBuyPlanDetailRootBean.planAutoPaused : z2;
        String str31 = (i2 & 2048) != 0 ? recurringBuyPlanDetailRootBean.recurringBuyErrorType : str9;
        return recurringBuyPlanDetailRootBean.copy(j4, str23, str24, str25, str26, str27, str28, str29, str30, z5, z6, str31, (i2 & 4096) != 0 ? recurringBuyPlanDetailRootBean.pnl : recurringBuyPlanDetailPnlBean, (i2 & 8192) != 0 ? recurringBuyPlanDetailRootBean.createTime : str10, (i2 & 16384) != 0 ? recurringBuyPlanDetailRootBean.frequency : str11, (i2 & 32768) != 0 ? recurringBuyPlanDetailRootBean.placedOrderList : list, (i2 & 65536) != 0 ? recurringBuyPlanDetailRootBean.showViewAllButton : z3, (i2 & 131072) != 0 ? recurringBuyPlanDetailRootBean.paymentMethod : str12, (i2 & 262144) != 0 ? recurringBuyPlanDetailRootBean.paymentMethodUrl : str13, (i2 & 524288) != 0 ? recurringBuyPlanDetailRootBean.paymentMethodNightUrl : str14, (i2 & 1048576) != 0 ? recurringBuyPlanDetailRootBean.last4 : str15, (i2 & 2097152) != 0 ? recurringBuyPlanDetailRootBean.categoryCode : i, (i2 & 4194304) != 0 ? recurringBuyPlanDetailRootBean.displayQuoteCurrencyAfterAmount : z4, (i2 & 8388608) != 0 ? recurringBuyPlanDetailRootBean.purchaseTimes : j2, (i2 & 16777216) != 0 ? recurringBuyPlanDetailRootBean.baseCurrencyIcon : str16, (33554432 & i2) != 0 ? recurringBuyPlanDetailRootBean.roi : str17, (i2 & 67108864) != 0 ? recurringBuyPlanDetailRootBean.totalBaseAmount : str18, (i2 & 134217728) != 0 ? recurringBuyPlanDetailRootBean.totalQuoteAmount : str19, (i2 & 268435456) != 0 ? recurringBuyPlanDetailRootBean.editPlanAmountLimit : recurringBuyEditPlanAmountBean, (i2 & 536870912) != 0 ? recurringBuyPlanDetailRootBean.nextPurchaseTime : str20, (i2 & 1073741824) != 0 ? recurringBuyPlanDetailRootBean.lastPurchaseTime : str21, (i2 & Integer.MIN_VALUE) != 0 ? recurringBuyPlanDetailRootBean.nextPurchase : str22, (i3 & 1) != 0 ? recurringBuyPlanDetailRootBean.roiStatus : j3);
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
    public final RecurringBuyPlanDetailPnlBean component13() {
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
    public final List<RecurringBuyPlacedOrderBean> component16() {
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
    public final RecurringBuyEditPlanAmountBean component29() {
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
        return this.firstOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanDetailRootBean copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, boolean z2, @NotNull String str9, @NotNull RecurringBuyPlanDetailPnlBean recurringBuyPlanDetailPnlBean, @NotNull String str10, @NotNull String str11, @NotNull List<RecurringBuyPlacedOrderBean> list, boolean z3, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, int i, boolean z4, long j2, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull RecurringBuyEditPlanAmountBean recurringBuyEditPlanAmountBean, @NotNull String str20, @NotNull String str21, @NotNull String str22, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailPnlBean, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(recurringBuyEditPlanAmountBean, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        return new RecurringBuyPlanDetailRootBean(j, str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, recurringBuyPlanDetailPnlBean, str10, str11, list, z3, str12, str13, str14, str15, i, z4, j2, str16, str17, str18, str19, recurringBuyEditPlanAmountBean, str20, str21, str22, j3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBuyPlanDetailRootBean)) {
            return false;
        }
        RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean = (RecurringBuyPlanDetailRootBean) obj;
        return this.id == recurringBuyPlanDetailRootBean.id && Intrinsics.EZpvd((Object) this.planId, (Object) recurringBuyPlanDetailRootBean.planId) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) recurringBuyPlanDetailRootBean.baseCurrency) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) recurringBuyPlanDetailRootBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) recurringBuyPlanDetailRootBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) recurringBuyPlanDetailRootBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteCurrencyIcon, (Object) recurringBuyPlanDetailRootBean.quoteCurrencyIcon) && Intrinsics.EZpvd((Object) this.firstOrderId, (Object) recurringBuyPlanDetailRootBean.firstOrderId) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyPlanDetailRootBean.status) && this.lowBalance == recurringBuyPlanDetailRootBean.lowBalance && this.planAutoPaused == recurringBuyPlanDetailRootBean.planAutoPaused && Intrinsics.EZpvd((Object) this.recurringBuyErrorType, (Object) recurringBuyPlanDetailRootBean.recurringBuyErrorType) && Intrinsics.EZpvd(this.pnl, recurringBuyPlanDetailRootBean.pnl) && Intrinsics.EZpvd((Object) this.createTime, (Object) recurringBuyPlanDetailRootBean.createTime) && Intrinsics.EZpvd((Object) this.frequency, (Object) recurringBuyPlanDetailRootBean.frequency) && Intrinsics.EZpvd(this.placedOrderList, recurringBuyPlanDetailRootBean.placedOrderList) && this.showViewAllButton == recurringBuyPlanDetailRootBean.showViewAllButton && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) recurringBuyPlanDetailRootBean.paymentMethod) && Intrinsics.EZpvd((Object) this.paymentMethodUrl, (Object) recurringBuyPlanDetailRootBean.paymentMethodUrl) && Intrinsics.EZpvd((Object) this.paymentMethodNightUrl, (Object) recurringBuyPlanDetailRootBean.paymentMethodNightUrl) && Intrinsics.EZpvd((Object) this.last4, (Object) recurringBuyPlanDetailRootBean.last4) && this.categoryCode == recurringBuyPlanDetailRootBean.categoryCode && this.displayQuoteCurrencyAfterAmount == recurringBuyPlanDetailRootBean.displayQuoteCurrencyAfterAmount && this.purchaseTimes == recurringBuyPlanDetailRootBean.purchaseTimes && Intrinsics.EZpvd((Object) this.baseCurrencyIcon, (Object) recurringBuyPlanDetailRootBean.baseCurrencyIcon) && Intrinsics.EZpvd((Object) this.roi, (Object) recurringBuyPlanDetailRootBean.roi) && Intrinsics.EZpvd((Object) this.totalBaseAmount, (Object) recurringBuyPlanDetailRootBean.totalBaseAmount) && Intrinsics.EZpvd((Object) this.totalQuoteAmount, (Object) recurringBuyPlanDetailRootBean.totalQuoteAmount) && Intrinsics.EZpvd(this.editPlanAmountLimit, recurringBuyPlanDetailRootBean.editPlanAmountLimit) && Intrinsics.EZpvd((Object) this.nextPurchaseTime, (Object) recurringBuyPlanDetailRootBean.nextPurchaseTime) && Intrinsics.EZpvd((Object) this.lastPurchaseTime, (Object) recurringBuyPlanDetailRootBean.lastPurchaseTime) && Intrinsics.EZpvd((Object) this.nextPurchase, (Object) recurringBuyPlanDetailRootBean.nextPurchase) && this.roiStatus == recurringBuyPlanDetailRootBean.roiStatus;
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
    public final RecurringBuyEditPlanAmountBean getEditPlanAmountLimit() {
        return this.editPlanAmountLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirstOrderId() {
        return this.firstOrderId;
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
    public final List<RecurringBuyPlacedOrderBean> getPlacedOrderList() {
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
    public final RecurringBuyPlanDetailPnlBean getPnl() {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.id) * 31) + this.planId.hashCode()) * 31) + this.baseCurrency.hashCode()) * 31) + this.quoteAmount.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.quoteCurrencySymbol.hashCode()) * 31) + this.quoteCurrencyIcon.hashCode()) * 31) + this.firstOrderId.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.lowBalance)) * 31) + Boolean.hashCode(this.planAutoPaused)) * 31) + this.recurringBuyErrorType.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.placedOrderList.hashCode()) * 31) + Boolean.hashCode(this.showViewAllButton)) * 31) + this.paymentMethod.hashCode()) * 31) + this.paymentMethodUrl.hashCode()) * 31) + this.paymentMethodNightUrl.hashCode()) * 31) + this.last4.hashCode()) * 31) + Integer.hashCode(this.categoryCode)) * 31) + Boolean.hashCode(this.displayQuoteCurrencyAfterAmount)) * 31) + Long.hashCode(this.purchaseTimes)) * 31) + this.baseCurrencyIcon.hashCode()) * 31) + this.roi.hashCode()) * 31) + this.totalBaseAmount.hashCode()) * 31) + this.totalQuoteAmount.hashCode()) * 31) + this.editPlanAmountLimit.hashCode()) * 31) + this.nextPurchaseTime.hashCode()) * 31) + this.lastPurchaseTime.hashCode()) * 31) + this.nextPurchase.hashCode()) * 31) + Long.hashCode(this.roiStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanDetailRootBean(id=" + this.id + ", planId=" + this.planId + ", baseCurrency=" + this.baseCurrency + ", quoteAmount=" + this.quoteAmount + ", quoteCurrency=" + this.quoteCurrency + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteCurrencyIcon=" + this.quoteCurrencyIcon + ", firstOrderId=" + this.firstOrderId + ", status=" + this.status + ", lowBalance=" + this.lowBalance + ", planAutoPaused=" + this.planAutoPaused + ", recurringBuyErrorType=" + this.recurringBuyErrorType + ", pnl=" + this.pnl + ", createTime=" + this.createTime + ", frequency=" + this.frequency + ", placedOrderList=" + this.placedOrderList + ", showViewAllButton=" + this.showViewAllButton + ", paymentMethod=" + this.paymentMethod + ", paymentMethodUrl=" + this.paymentMethodUrl + ", paymentMethodNightUrl=" + this.paymentMethodNightUrl + ", last4=" + this.last4 + ", categoryCode=" + this.categoryCode + ", displayQuoteCurrencyAfterAmount=" + this.displayQuoteCurrencyAfterAmount + ", purchaseTimes=" + this.purchaseTimes + ", baseCurrencyIcon=" + this.baseCurrencyIcon + ", roi=" + this.roi + ", totalBaseAmount=" + this.totalBaseAmount + ", totalQuoteAmount=" + this.totalQuoteAmount + ", editPlanAmountLimit=" + this.editPlanAmountLimit + ", nextPurchaseTime=" + this.nextPurchaseTime + ", lastPurchaseTime=" + this.lastPurchaseTime + ", nextPurchase=" + this.nextPurchase + ", roiStatus=" + this.roiStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeString(this.planId);
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.quoteCurrencySymbol);
        parcel.writeString(this.quoteCurrencyIcon);
        parcel.writeString(this.firstOrderId);
        parcel.writeString(this.status);
        parcel.writeInt(this.lowBalance ? 1 : 0);
        parcel.writeInt(this.planAutoPaused ? 1 : 0);
        parcel.writeString(this.recurringBuyErrorType);
        this.pnl.writeToParcel(parcel, i);
        parcel.writeString(this.createTime);
        parcel.writeString(this.frequency);
        List<RecurringBuyPlacedOrderBean> list = this.placedOrderList;
        parcel.writeInt(list.size());
        Iterator<RecurringBuyPlacedOrderBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.showViewAllButton ? 1 : 0);
        parcel.writeString(this.paymentMethod);
        parcel.writeString(this.paymentMethodUrl);
        parcel.writeString(this.paymentMethodNightUrl);
        parcel.writeString(this.last4);
        parcel.writeInt(this.categoryCode);
        parcel.writeInt(this.displayQuoteCurrencyAfterAmount ? 1 : 0);
        parcel.writeLong(this.purchaseTimes);
        parcel.writeString(this.baseCurrencyIcon);
        parcel.writeString(this.roi);
        parcel.writeString(this.totalBaseAmount);
        parcel.writeString(this.totalQuoteAmount);
        this.editPlanAmountLimit.writeToParcel(parcel, i);
        parcel.writeString(this.nextPurchaseTime);
        parcel.writeString(this.lastPurchaseTime);
        parcel.writeString(this.nextPurchase);
        parcel.writeLong(this.roiStatus);
    }

    public RecurringBuyPlanDetailRootBean(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, boolean z2, @NotNull String str9, @NotNull RecurringBuyPlanDetailPnlBean recurringBuyPlanDetailPnlBean, @NotNull String str10, @NotNull String str11, @NotNull List<RecurringBuyPlacedOrderBean> list, boolean z3, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, int i, boolean z4, long j2, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull RecurringBuyEditPlanAmountBean recurringBuyEditPlanAmountBean, @NotNull String str20, @NotNull String str21, @NotNull String str22, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailPnlBean, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(recurringBuyEditPlanAmountBean, "");
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
        this.firstOrderId = str7;
        this.status = str8;
        this.lowBalance = z;
        this.planAutoPaused = z2;
        this.recurringBuyErrorType = str9;
        this.pnl = recurringBuyPlanDetailPnlBean;
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
        this.editPlanAmountLimit = recurringBuyEditPlanAmountBean;
        this.nextPurchaseTime = str20;
        this.lastPurchaseTime = str21;
        this.nextPurchase = str22;
        this.roiStatus = j3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
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
  (r54v0 com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailPnlBean)
  (r55v0 java.lang.String)
  (r56v0 java.lang.String)
  (r57v0 java.util.List)
  (r58v0 boolean)
  (r59v0 java.lang.String)
  (r60v0 java.lang.String)
  (r61v0 java.lang.String)
  (r62v0 java.lang.String)
  (r63v0 int)
  (r64v0 boolean)
  (r65v0 long)
  (r67v0 java.lang.String)
  (r68v0 java.lang.String)
  (r69v0 java.lang.String)
  (r70v0 java.lang.String)
  (r71v0 com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyEditPlanAmountBean)
  (r72v0 java.lang.String)
  (r73v0 java.lang.String)
  (r74v0 java.lang.String)
  (r75v0 long)
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailPnlBean, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlacedOrderBean>, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyEditPlanAmountBean, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:14) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailRootBean.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailPnlBean, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyEditPlanAmountBean, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ RecurringBuyPlanDetailRootBean(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, RecurringBuyPlanDetailPnlBean recurringBuyPlanDetailPnlBean, String str10, String str11, List list, boolean z3, String str12, String str13, String str14, String str15, int i, boolean z4, long j2, String str16, String str17, String str18, String str19, RecurringBuyEditPlanAmountBean recurringBuyEditPlanAmountBean, String str20, String str21, String str22, long j3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, str5, str6, (i2 & 128) != 0 ? "" : str7, str8, z, z2, (i2 & 2048) != 0 ? "" : str9, recurringBuyPlanDetailPnlBean, str10, str11, list, z3, str12, str13, str14, str15, i, z4, j2, str16, str17, str18, str19, recurringBuyEditPlanAmountBean, str20, str21, str22, j3);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailRootBean.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final RecurringBuyPlanDetailRootBean EZpvd(@NotNull RecurringBuyPlanDetailRootResponseBean recurringBuyPlanDetailRootResponseBean) {
            String str;
            List listAhwBna;
            RecurringBuyEditPlanAmountBean recurringBuyEditPlanAmountBean;
            RecurringBuyPlanDetailPnlBean recurringBuyPlanDetailPnlBeanCopydefault;
            Intrinsics.checkNotNullParameter(recurringBuyPlanDetailRootResponseBean, "");
            long jValueOf = C33129mqd.valueOf(Long.valueOf(recurringBuyPlanDetailRootResponseBean.getId()));
            String strGEmmrt = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getPlanId());
            String strGEmmrt2 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getBaseCurrency());
            String strGEmmrt3 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getQuoteAmount());
            String strGEmmrt4 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getQuoteCurrency());
            String strGEmmrt5 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getQuoteCurrencySymbol());
            String strGEmmrt6 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getQuoteCurrencyIcon());
            String strGEmmrt7 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getFirstOrder());
            String strGEmmrt8 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getStatus());
            boolean lowBalance = recurringBuyPlanDetailRootResponseBean.getLowBalance();
            boolean planAutoPaused = recurringBuyPlanDetailRootResponseBean.getPlanAutoPaused();
            String strGEmmrt9 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getRecurringBuyErrorType());
            RecurringBuyPlanDetailPnlResponseBean pnl = recurringBuyPlanDetailRootResponseBean.getPnl();
            RecurringBuyPlanDetailPnlBean recurringBuyPlanDetailPnlBean = (pnl == null || (recurringBuyPlanDetailPnlBeanCopydefault = RecurringBuyPlanDetailPnlBean.Companion.copydefault(pnl)) == null) ? new RecurringBuyPlanDetailPnlBean(null, null, null, null, 0, 31, null) : recurringBuyPlanDetailPnlBeanCopydefault;
            String strGEmmrt10 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getCreateTime());
            String strGEmmrt11 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getFrequency());
            List<RecurringBuyPlacedOrderResponseBean> placedOrderList = recurringBuyPlanDetailRootResponseBean.getPlacedOrderList();
            if (placedOrderList != null) {
                RecurringBuyPlacedOrderBean.TaskDescription taskDescription = RecurringBuyPlacedOrderBean.Companion;
                str = strGEmmrt9;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(placedOrderList, 10));
                Iterator<T> it = placedOrderList.iterator();
                while (it.hasNext()) {
                    arrayList.add(taskDescription.KWHzl((RecurringBuyPlacedOrderResponseBean) it.next()));
                }
                listAhwBna = arrayList;
            } else {
                str = strGEmmrt9;
                listAhwBna = yDY.AhwBna();
            }
            boolean showViewAllButton = recurringBuyPlanDetailRootResponseBean.getShowViewAllButton();
            String strGEmmrt12 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getPaymentMethod());
            String strGEmmrt13 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getPaymentMethodUrl());
            String strGEmmrt14 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getPaymentMethodNightUrl());
            String strGEmmrt15 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getLast4());
            int categoryCode = recurringBuyPlanDetailRootResponseBean.getCategoryCode();
            boolean displayQuoteCurrencyAfterAmount = recurringBuyPlanDetailRootResponseBean.getDisplayQuoteCurrencyAfterAmount();
            long jValueOf2 = C33129mqd.valueOf(Long.valueOf(recurringBuyPlanDetailRootResponseBean.getPurchaseTimes()));
            String strGEmmrt16 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getBaseCurrencyIcon());
            String strGEmmrt17 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getRoi());
            String strGEmmrt18 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getTotalBaseAmount());
            String strGEmmrt19 = C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getTotalQuoteAmount());
            RecurringBuyEditPlanAmountResponseBean editPlanAmountLimit = recurringBuyPlanDetailRootResponseBean.getEditPlanAmountLimit();
            if (editPlanAmountLimit == null || (recurringBuyEditPlanAmountBean = RecurringBuyEditPlanAmountBean.Companion.OLrzqt(editPlanAmountLimit)) == null) {
                recurringBuyEditPlanAmountBean = new RecurringBuyEditPlanAmountBean(null, null, 3, null);
            }
            return new RecurringBuyPlanDetailRootBean(jValueOf, strGEmmrt, strGEmmrt2, strGEmmrt3, strGEmmrt4, strGEmmrt5, strGEmmrt6, strGEmmrt7, strGEmmrt8, lowBalance, planAutoPaused, str, recurringBuyPlanDetailPnlBean, strGEmmrt10, strGEmmrt11, listAhwBna, showViewAllButton, strGEmmrt12, strGEmmrt13, strGEmmrt14, strGEmmrt15, categoryCode, displayQuoteCurrencyAfterAmount, jValueOf2, strGEmmrt16, strGEmmrt17, strGEmmrt18, strGEmmrt19, recurringBuyEditPlanAmountBean, C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getNextPurchaseTime()), C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getLastPurchaseTime()), C33129mqd.gEmmrt(recurringBuyPlanDetailRootResponseBean.getNextPurchase()), C33129mqd.valueOf(Long.valueOf(recurringBuyPlanDetailRootResponseBean.getRoiStatus())));
        }
    }
}
