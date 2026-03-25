package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class RecurringBuyPlacedOrderResponseBean implements Parcelable {
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
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RecurringBuyPlacedOrderResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecurringBuyPlacedOrderResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlacedOrderResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyPlacedOrderResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlacedOrderResponseBean[] newArray(int i) {
            return new RecurringBuyPlacedOrderResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyPlacedOrderResponseBean() {
        this((String) null, (String) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 4095, (DefaultConstructorMarker) null);
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
    public final RecurringBuyPlacedOrderResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z) {
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
        return new RecurringBuyPlacedOrderResponseBean(str, str2, str3, j, str4, str5, str6, str7, str8, str9, str10, z);
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
        if (!(obj instanceof RecurringBuyPlacedOrderResponseBean)) {
            return false;
        }
        RecurringBuyPlacedOrderResponseBean recurringBuyPlacedOrderResponseBean = (RecurringBuyPlacedOrderResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.baseAmount, (Object) recurringBuyPlacedOrderResponseBean.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) recurringBuyPlacedOrderResponseBean.baseCurrencySymbol) && Intrinsics.EZpvd((Object) this.baseCurrencyIcon, (Object) recurringBuyPlacedOrderResponseBean.baseCurrencyIcon) && this.createDate == recurringBuyPlacedOrderResponseBean.createDate && Intrinsics.EZpvd((Object) this.icon, (Object) recurringBuyPlacedOrderResponseBean.icon) && Intrinsics.EZpvd((Object) this.orderNo, (Object) recurringBuyPlacedOrderResponseBean.orderNo) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) recurringBuyPlacedOrderResponseBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) recurringBuyPlacedOrderResponseBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) recurringBuyPlacedOrderResponseBean.quoteSymbol) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyPlacedOrderResponseBean.status) && Intrinsics.EZpvd((Object) this.tradeType, (Object) recurringBuyPlacedOrderResponseBean.tradeType) && this.displayQuoteCurrencyAfterAmount == recurringBuyPlacedOrderResponseBean.displayQuoteCurrencyAfterAmount;
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
        return "RecurringBuyPlacedOrderResponseBean(baseAmount=" + this.baseAmount + ", baseCurrencySymbol=" + this.baseCurrencySymbol + ", baseCurrencyIcon=" + this.baseCurrencyIcon + ", createDate=" + this.createDate + ", icon=" + this.icon + ", orderNo=" + this.orderNo + ", quoteAmount=" + this.quoteAmount + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteSymbol=" + this.quoteSymbol + ", status=" + this.status + ", tradeType=" + this.tradeType + ", displayQuoteCurrencyAfterAmount=" + this.displayQuoteCurrencyAfterAmount + ")";
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

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlacedOrderResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyPlacedOrderResponseBean> serializer() {
            return RecurringBuyPlacedOrderResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyPlacedOrderResponseBean(int i, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str;
        }
        if ((i & 2) == 0) {
            this.baseCurrencySymbol = "";
        } else {
            this.baseCurrencySymbol = str2;
        }
        if ((i & 4) == 0) {
            this.baseCurrencyIcon = "";
        } else {
            this.baseCurrencyIcon = str3;
        }
        this.createDate = (i & 8) == 0 ? 0L : j;
        if ((i & 16) == 0) {
            this.icon = "";
        } else {
            this.icon = str4;
        }
        if ((i & 32) == 0) {
            this.orderNo = "";
        } else {
            this.orderNo = str5;
        }
        if ((i & 64) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str6;
        }
        if ((i & 128) == 0) {
            this.quoteCurrencySymbol = "";
        } else {
            this.quoteCurrencySymbol = str7;
        }
        if ((i & 256) == 0) {
            this.quoteSymbol = "";
        } else {
            this.quoteSymbol = str8;
        }
        if ((i & 512) == 0) {
            this.status = "";
        } else {
            this.status = str9;
        }
        if ((i & 1024) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str10;
        }
        this.displayQuoteCurrencyAfterAmount = (i & 2048) == 0 ? false : z;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyPlacedOrderResponseBean recurringBuyPlacedOrderResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) recurringBuyPlacedOrderResponseBean.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBuyPlacedOrderResponseBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) recurringBuyPlacedOrderResponseBean.baseCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyPlacedOrderResponseBean.baseCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) recurringBuyPlacedOrderResponseBean.baseCurrencyIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringBuyPlacedOrderResponseBean.baseCurrencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || recurringBuyPlacedOrderResponseBean.createDate != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, recurringBuyPlacedOrderResponseBean.createDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) recurringBuyPlacedOrderResponseBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, recurringBuyPlacedOrderResponseBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) recurringBuyPlacedOrderResponseBean.orderNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, recurringBuyPlacedOrderResponseBean.orderNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) recurringBuyPlacedOrderResponseBean.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, recurringBuyPlacedOrderResponseBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) recurringBuyPlacedOrderResponseBean.quoteCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, recurringBuyPlacedOrderResponseBean.quoteCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) recurringBuyPlacedOrderResponseBean.quoteSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, recurringBuyPlacedOrderResponseBean.quoteSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) recurringBuyPlacedOrderResponseBean.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, recurringBuyPlacedOrderResponseBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) recurringBuyPlacedOrderResponseBean.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, recurringBuyPlacedOrderResponseBean.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || recurringBuyPlacedOrderResponseBean.displayQuoteCurrencyAfterAmount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, recurringBuyPlacedOrderResponseBean.displayQuoteCurrencyAfterAmount);
        }
    }

    public RecurringBuyPlacedOrderResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z) {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlacedOrderResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ RecurringBuyPlacedOrderResponseBean(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) == 0 ? str10 : "", (i & 2048) != 0 ? false : z);
    }
}
