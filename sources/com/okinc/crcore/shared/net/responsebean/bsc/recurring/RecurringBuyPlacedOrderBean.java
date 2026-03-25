package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlacedOrderResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyPlacedOrderBean implements Parcelable {
    public static final int $stable = 0;
    private final String baseAmount;
    private final String baseCurrencyIcon;
    private final String baseCurrencySymbol;
    private final long createDate;
    private final boolean displayQuoteCurrencyAfterAmount;
    private final String icon;
    private final String orderNo;
    private final String quoteAmount;
    private final String quoteCurrencySymbol;
    private final String quoteSymbol;
    private final String status;
    private final String tradeType;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final Parcelable.Creator<RecurringBuyPlacedOrderBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RecurringBuyPlacedOrderBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlacedOrderBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyPlacedOrderBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlacedOrderBean[] newArray(int i) {
            return new RecurringBuyPlacedOrderBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.displayQuoteCurrencyAfterAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlacedOrderBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z) {
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
        return new RecurringBuyPlacedOrderBean(str, str2, str3, j, str4, str5, str6, str7, str8, str9, str10, z);
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
        if (!(obj instanceof RecurringBuyPlacedOrderBean)) {
            return false;
        }
        RecurringBuyPlacedOrderBean recurringBuyPlacedOrderBean = (RecurringBuyPlacedOrderBean) obj;
        return Intrinsics.EZpvd((Object) this.baseAmount, (Object) recurringBuyPlacedOrderBean.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) recurringBuyPlacedOrderBean.baseCurrencySymbol) && Intrinsics.EZpvd((Object) this.baseCurrencyIcon, (Object) recurringBuyPlacedOrderBean.baseCurrencyIcon) && this.createDate == recurringBuyPlacedOrderBean.createDate && Intrinsics.EZpvd((Object) this.icon, (Object) recurringBuyPlacedOrderBean.icon) && Intrinsics.EZpvd((Object) this.orderNo, (Object) recurringBuyPlacedOrderBean.orderNo) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) recurringBuyPlacedOrderBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) recurringBuyPlacedOrderBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) recurringBuyPlacedOrderBean.quoteSymbol) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyPlacedOrderBean.status) && Intrinsics.EZpvd((Object) this.tradeType, (Object) recurringBuyPlacedOrderBean.tradeType) && this.displayQuoteCurrencyAfterAmount == recurringBuyPlacedOrderBean.displayQuoteCurrencyAfterAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyIcon() {
        return this.baseCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencySymbol() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateDate() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDisplayQuoteCurrencyAfterAmount() {
        return this.displayQuoteCurrencyAfterAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
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
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.baseAmount.hashCode() * 31) + this.baseCurrencySymbol.hashCode()) * 31) + this.baseCurrencyIcon.hashCode()) * 31) + Long.hashCode(this.createDate)) * 31) + this.icon.hashCode()) * 31) + this.orderNo.hashCode()) * 31) + this.quoteAmount.hashCode()) * 31) + this.quoteCurrencySymbol.hashCode()) * 31) + this.quoteSymbol.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tradeType.hashCode()) * 31) + Boolean.hashCode(this.displayQuoteCurrencyAfterAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlacedOrderBean(baseAmount=" + this.baseAmount + ", baseCurrencySymbol=" + this.baseCurrencySymbol + ", baseCurrencyIcon=" + this.baseCurrencyIcon + ", createDate=" + this.createDate + ", icon=" + this.icon + ", orderNo=" + this.orderNo + ", quoteAmount=" + this.quoteAmount + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteSymbol=" + this.quoteSymbol + ", status=" + this.status + ", tradeType=" + this.tradeType + ", displayQuoteCurrencyAfterAmount=" + this.displayQuoteCurrencyAfterAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.baseCurrencySymbol);
        parcel.writeString(this.baseCurrencyIcon);
        parcel.writeLong(this.createDate);
        parcel.writeString(this.icon);
        parcel.writeString(this.orderNo);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.quoteCurrencySymbol);
        parcel.writeString(this.quoteSymbol);
        parcel.writeString(this.status);
        parcel.writeString(this.tradeType);
        parcel.writeInt(this.displayQuoteCurrencyAfterAmount ? 1 : 0);
    }

    public RecurringBuyPlacedOrderBean(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z) {
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
        this.baseAmount = str;
        this.baseCurrencySymbol = str2;
        this.baseCurrencyIcon = str3;
        this.createDate = j;
        this.icon = str4;
        this.orderNo = str5;
        this.quoteAmount = str6;
        this.quoteCurrencySymbol = str7;
        this.quoteSymbol = str8;
        this.status = str9;
        this.tradeType = str10;
        this.displayQuoteCurrencyAfterAmount = z;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlacedOrderBean.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final RecurringBuyPlacedOrderBean KWHzl(@NotNull RecurringBuyPlacedOrderResponseBean recurringBuyPlacedOrderResponseBean) {
            Intrinsics.checkNotNullParameter(recurringBuyPlacedOrderResponseBean, "");
            return new RecurringBuyPlacedOrderBean(recurringBuyPlacedOrderResponseBean.getBaseAmount(), recurringBuyPlacedOrderResponseBean.getBaseCurrencySymbol(), recurringBuyPlacedOrderResponseBean.getBaseCurrencyIcon(), recurringBuyPlacedOrderResponseBean.getCreateDate(), recurringBuyPlacedOrderResponseBean.getIcon(), recurringBuyPlacedOrderResponseBean.getOrderNo(), recurringBuyPlacedOrderResponseBean.getQuoteAmount(), recurringBuyPlacedOrderResponseBean.getQuoteCurrencySymbol(), recurringBuyPlacedOrderResponseBean.getQuoteSymbol(), recurringBuyPlacedOrderResponseBean.getStatus(), recurringBuyPlacedOrderResponseBean.getTradeType(), recurringBuyPlacedOrderResponseBean.getDisplayQuoteCurrencyAfterAmount());
        }
    }
}
