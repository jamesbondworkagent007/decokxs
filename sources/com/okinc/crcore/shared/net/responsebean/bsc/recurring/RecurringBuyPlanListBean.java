package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyOrderResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanListResponseBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyOrderBean;
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
public final class RecurringBuyPlanListBean implements Parcelable {
    private final String baseCurrency;
    private final String baseCurrencyIcon;
    private final long createTime;
    private final String currencySymbol;
    private final boolean displayQuoteCurrencyAfterAmount;
    private final String firstOrderId;
    private final String frequency;
    private final long id;
    private final boolean lowBalance;
    private final String nextPurchase;
    private final List<RecurringBuyOrderBean> orderList;
    private final String planId;
    private final long purchaseTimes;
    private final String quoteAmount;
    private final String quoteCurrency;
    private final String quoteCurrencySymbol;
    private final String quoteSymbol;
    private final String recurringBuyErrorType;
    private final String status;
    private final String totalBaseAmount;
    private final String totalQuoteAmount;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyPlanListBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RecurringBuyPlanListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            long j2 = parcel.readLong();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RecurringBuyOrderBean.CREATOR.createFromParcel(parcel));
            }
            return new RecurringBuyPlanListBean(string, string2, j, string3, string4, j2, string5, arrayList, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanListBean[] newArray(int i) {
            return new RecurringBuyPlanListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyPlanListBean() {
        this(null, null, 0L, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, false, 2097151, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.purchaseTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.totalBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.totalQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.lowBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.recurringBuyErrorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.displayQuoteCurrencyAfterAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.firstOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.nextPurchase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringBuyOrderBean> component8() {
        return this.orderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanListBean copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, long j2, @NotNull String str5, @NotNull List<RecurringBuyOrderBean> list, @NotNull String str6, long j3, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, boolean z, @NotNull String str15, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        return new RecurringBuyPlanListBean(str, str2, j, str3, str4, j2, str5, list, str6, j3, str7, str8, str9, str10, str11, str12, str13, str14, z, str15, z2);
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
        if (!(obj instanceof RecurringBuyPlanListBean)) {
            return false;
        }
        RecurringBuyPlanListBean recurringBuyPlanListBean = (RecurringBuyPlanListBean) obj;
        return Intrinsics.EZpvd((Object) this.baseCurrency, (Object) recurringBuyPlanListBean.baseCurrency) && Intrinsics.EZpvd((Object) this.baseCurrencyIcon, (Object) recurringBuyPlanListBean.baseCurrencyIcon) && this.createTime == recurringBuyPlanListBean.createTime && Intrinsics.EZpvd((Object) this.firstOrderId, (Object) recurringBuyPlanListBean.firstOrderId) && Intrinsics.EZpvd((Object) this.frequency, (Object) recurringBuyPlanListBean.frequency) && this.id == recurringBuyPlanListBean.id && Intrinsics.EZpvd((Object) this.nextPurchase, (Object) recurringBuyPlanListBean.nextPurchase) && Intrinsics.EZpvd(this.orderList, recurringBuyPlanListBean.orderList) && Intrinsics.EZpvd((Object) this.planId, (Object) recurringBuyPlanListBean.planId) && this.purchaseTimes == recurringBuyPlanListBean.purchaseTimes && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) recurringBuyPlanListBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) recurringBuyPlanListBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyPlanListBean.status) && Intrinsics.EZpvd((Object) this.totalBaseAmount, (Object) recurringBuyPlanListBean.totalBaseAmount) && Intrinsics.EZpvd((Object) this.totalQuoteAmount, (Object) recurringBuyPlanListBean.totalQuoteAmount) && Intrinsics.EZpvd((Object) this.currencySymbol, (Object) recurringBuyPlanListBean.currencySymbol) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) recurringBuyPlanListBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) recurringBuyPlanListBean.quoteSymbol) && this.lowBalance == recurringBuyPlanListBean.lowBalance && Intrinsics.EZpvd((Object) this.recurringBuyErrorType, (Object) recurringBuyPlanListBean.recurringBuyErrorType) && this.displayQuoteCurrencyAfterAmount == recurringBuyPlanListBean.displayQuoteCurrencyAfterAmount;
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
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDisplayQuoteCurrencyAfterAmount() {
        return this.displayQuoteCurrencyAfterAmount;
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
    public final boolean getLowBalance() {
        return this.lowBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextPurchase() {
        return this.nextPurchase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringBuyOrderBean> getOrderList() {
        return this.orderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlanId() {
        return this.planId;
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
    public final String getQuoteCurrencySymbol() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringBuyErrorType() {
        return this.recurringBuyErrorType;
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
        return (((((((((((((((((((((((((((((((((((((((this.baseCurrency.hashCode() * 31) + this.baseCurrencyIcon.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + this.firstOrderId.hashCode()) * 31) + this.frequency.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.nextPurchase.hashCode()) * 31) + this.orderList.hashCode()) * 31) + this.planId.hashCode()) * 31) + Long.hashCode(this.purchaseTimes)) * 31) + this.quoteAmount.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.status.hashCode()) * 31) + this.totalBaseAmount.hashCode()) * 31) + this.totalQuoteAmount.hashCode()) * 31) + this.currencySymbol.hashCode()) * 31) + this.quoteCurrencySymbol.hashCode()) * 31) + this.quoteSymbol.hashCode()) * 31) + Boolean.hashCode(this.lowBalance)) * 31) + this.recurringBuyErrorType.hashCode()) * 31) + Boolean.hashCode(this.displayQuoteCurrencyAfterAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanListBean(baseCurrency=" + this.baseCurrency + ", baseCurrencyIcon=" + this.baseCurrencyIcon + ", createTime=" + this.createTime + ", firstOrderId=" + this.firstOrderId + ", frequency=" + this.frequency + ", id=" + this.id + ", nextPurchase=" + this.nextPurchase + ", orderList=" + this.orderList + ", planId=" + this.planId + ", purchaseTimes=" + this.purchaseTimes + ", quoteAmount=" + this.quoteAmount + ", quoteCurrency=" + this.quoteCurrency + ", status=" + this.status + ", totalBaseAmount=" + this.totalBaseAmount + ", totalQuoteAmount=" + this.totalQuoteAmount + ", currencySymbol=" + this.currencySymbol + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteSymbol=" + this.quoteSymbol + ", lowBalance=" + this.lowBalance + ", recurringBuyErrorType=" + this.recurringBuyErrorType + ", displayQuoteCurrencyAfterAmount=" + this.displayQuoteCurrencyAfterAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.baseCurrencyIcon);
        parcel.writeLong(this.createTime);
        parcel.writeString(this.firstOrderId);
        parcel.writeString(this.frequency);
        parcel.writeLong(this.id);
        parcel.writeString(this.nextPurchase);
        List<RecurringBuyOrderBean> list = this.orderList;
        parcel.writeInt(list.size());
        Iterator<RecurringBuyOrderBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.planId);
        parcel.writeLong(this.purchaseTimes);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.status);
        parcel.writeString(this.totalBaseAmount);
        parcel.writeString(this.totalQuoteAmount);
        parcel.writeString(this.currencySymbol);
        parcel.writeString(this.quoteCurrencySymbol);
        parcel.writeString(this.quoteSymbol);
        parcel.writeInt(this.lowBalance ? 1 : 0);
        parcel.writeString(this.recurringBuyErrorType);
        parcel.writeInt(this.displayQuoteCurrencyAfterAmount ? 1 : 0);
    }

    public RecurringBuyPlanListBean(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, long j2, @NotNull String str5, @NotNull List<RecurringBuyOrderBean> list, @NotNull String str6, long j3, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, boolean z, @NotNull String str15, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        this.baseCurrency = str;
        this.baseCurrencyIcon = str2;
        this.createTime = j;
        this.firstOrderId = str3;
        this.frequency = str4;
        this.id = j2;
        this.nextPurchase = str5;
        this.orderList = list;
        this.planId = str6;
        this.purchaseTimes = j3;
        this.quoteAmount = str7;
        this.quoteCurrency = str8;
        this.status = str9;
        this.totalBaseAmount = str10;
        this.totalQuoteAmount = str11;
        this.currencySymbol = str12;
        this.quoteCurrencySymbol = str13;
        this.quoteSymbol = str14;
        this.lowBalance = z;
        this.recurringBuyErrorType = str15;
        this.displayQuoteCurrencyAfterAmount = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00fb: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r51v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r51v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r51v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r29v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r51v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r51v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r51v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r33v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r51v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003e: ARITH (r51v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r36v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r51v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0051: ARITH (r51v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r38v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r51v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:0x006b: TERNARY null = ((wrap:int:0x0062: ARITH (r51v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:0x0076: TERNARY null = ((wrap:int:0x006d: ARITH (r51v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:0x0081: TERNARY null = ((wrap:int:0x0078: ARITH (r51v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r51v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r51v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r51v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r51v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r51v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bd: ARITH (r51v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c8: ARITH (r51v0 int) & (1048576 int) A[WRAPPED]) == (0 int)) ? (r50v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, long, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyOrderBean>, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void (m)] (LINE:14) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListBean.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, long, java.lang.String, java.util.List, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ RecurringBuyPlanListBean(String str, String str2, long j, String str3, String str4, long j2, String str5, List list, String str6, long j3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? yDY.AhwBna() : list, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? j3 : 0L, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? "" : str13, (i & 131072) != 0 ? "" : str14, (i & 262144) != 0 ? false : z, (i & 524288) != 0 ? "" : str15, (i & 1048576) == 0 ? z2 : false);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListBean.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final RecurringBuyPlanListBean copydefault(@NotNull RecurringBuyPlanListResponseBean recurringBuyPlanListResponseBean) {
            List listAhwBna;
            Intrinsics.checkNotNullParameter(recurringBuyPlanListResponseBean, "");
            String strGEmmrt = C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getBaseCurrency());
            String strGEmmrt2 = C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getBaseCurrencyIcon());
            long jValueOf = C33129mqd.valueOf(Long.valueOf(recurringBuyPlanListResponseBean.getCreateTime()));
            String strGEmmrt3 = C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getFirstOrder());
            String strGEmmrt4 = C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getFrequency());
            long jValueOf2 = C33129mqd.valueOf(Long.valueOf(recurringBuyPlanListResponseBean.getId()));
            String strGEmmrt5 = C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getNextPurchase());
            List<RecurringBuyOrderResponseBean> orderList = recurringBuyPlanListResponseBean.getOrderList();
            if (orderList != null) {
                RecurringBuyOrderBean.Activity activity = RecurringBuyOrderBean.Companion;
                listAhwBna = new ArrayList(C56403yEb.AYXKKw(orderList, 10));
                Iterator<T> it = orderList.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(activity.AEQbTJ((RecurringBuyOrderResponseBean) it.next()));
                }
            } else {
                listAhwBna = yDY.AhwBna();
            }
            return new RecurringBuyPlanListBean(strGEmmrt, strGEmmrt2, jValueOf, strGEmmrt3, strGEmmrt4, jValueOf2, strGEmmrt5, listAhwBna, C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getPlanId()), C33129mqd.valueOf(Long.valueOf(recurringBuyPlanListResponseBean.getPurchaseTimes())), C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getQuoteAmount()), C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getQuoteCurrency()), C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getStatus()), C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getTotalBaseAmount()), C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getTotalQuoteAmount()), C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getCurrencySymbol()), C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getQuoteCurrencySymbol()), C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getQuoteSymbol()), recurringBuyPlanListResponseBean.getLowBalance(), C33129mqd.gEmmrt(recurringBuyPlanListResponseBean.getRecurringBuyErrorType()), recurringBuyPlanListResponseBean.getDisplayQuoteCurrencyAfterAmount());
        }
    }
}
