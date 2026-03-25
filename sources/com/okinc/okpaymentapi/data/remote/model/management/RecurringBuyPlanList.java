package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class RecurringBuyPlanList implements java.io.Serializable, Parcelable {
    private final String baseCurrency;
    private final String baseCurrencyIcon;
    private final long createTime;
    private final String currencySymbol;
    private final String firstOrderId;
    private final String frequency;
    private final long id;
    private final boolean lowBalance;
    private final String nextPurchase;
    private final List<OrderDetailList> orderList;
    private final String planId;
    private final long purchaseTimes;
    private final String quoteAmount;
    private final String quoteCurrency;
    private final String quoteCurrencySymbol;
    private final String quoteSymbol;
    private final String status;
    private final String totalBaseAmount;
    private final String totalQuoteAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyPlanList> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(OrderDetailList$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<RecurringBuyPlanList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanList createFromParcel(Parcel parcel) {
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
                arrayList.add(OrderDetailList.CREATOR.createFromParcel(parcel));
            }
            return new RecurringBuyPlanList(string, string2, j, string3, string4, j2, string5, arrayList, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanList[] newArray(int i) {
            return new RecurringBuyPlanList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyPlanList() {
        this((String) null, (String) null, 0L, (String) null, (String) null, 0L, (String) null, (List) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 524287, (DefaultConstructorMarker) null);
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
    public final List<OrderDetailList> component8() {
        return this.orderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanList copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, long j2, @NotNull String str5, @NotNull List<OrderDetailList> list, @NotNull String str6, long j3, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, boolean z) {
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
        return new RecurringBuyPlanList(str, str2, j, str3, str4, j2, str5, list, str6, j3, str7, str8, str9, str10, str11, str12, str13, str14, z);
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
        if (!(obj instanceof RecurringBuyPlanList)) {
            return false;
        }
        RecurringBuyPlanList recurringBuyPlanList = (RecurringBuyPlanList) obj;
        return Intrinsics.EZpvd((Object) this.baseCurrency, (Object) recurringBuyPlanList.baseCurrency) && Intrinsics.EZpvd((Object) this.baseCurrencyIcon, (Object) recurringBuyPlanList.baseCurrencyIcon) && this.createTime == recurringBuyPlanList.createTime && Intrinsics.EZpvd((Object) this.firstOrderId, (Object) recurringBuyPlanList.firstOrderId) && Intrinsics.EZpvd((Object) this.frequency, (Object) recurringBuyPlanList.frequency) && this.id == recurringBuyPlanList.id && Intrinsics.EZpvd((Object) this.nextPurchase, (Object) recurringBuyPlanList.nextPurchase) && Intrinsics.EZpvd(this.orderList, recurringBuyPlanList.orderList) && Intrinsics.EZpvd((Object) this.planId, (Object) recurringBuyPlanList.planId) && this.purchaseTimes == recurringBuyPlanList.purchaseTimes && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) recurringBuyPlanList.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) recurringBuyPlanList.quoteCurrency) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyPlanList.status) && Intrinsics.EZpvd((Object) this.totalBaseAmount, (Object) recurringBuyPlanList.totalBaseAmount) && Intrinsics.EZpvd((Object) this.totalQuoteAmount, (Object) recurringBuyPlanList.totalQuoteAmount) && Intrinsics.EZpvd((Object) this.currencySymbol, (Object) recurringBuyPlanList.currencySymbol) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) recurringBuyPlanList.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) recurringBuyPlanList.quoteSymbol) && this.lowBalance == recurringBuyPlanList.lowBalance;
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
    public final List<OrderDetailList> getOrderList() {
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
        return (((((((((((((((((((((((((((((((((((this.baseCurrency.hashCode() * 31) + this.baseCurrencyIcon.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + this.firstOrderId.hashCode()) * 31) + this.frequency.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.nextPurchase.hashCode()) * 31) + this.orderList.hashCode()) * 31) + this.planId.hashCode()) * 31) + Long.hashCode(this.purchaseTimes)) * 31) + this.quoteAmount.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.status.hashCode()) * 31) + this.totalBaseAmount.hashCode()) * 31) + this.totalQuoteAmount.hashCode()) * 31) + this.currencySymbol.hashCode()) * 31) + this.quoteCurrencySymbol.hashCode()) * 31) + this.quoteSymbol.hashCode()) * 31) + Boolean.hashCode(this.lowBalance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanList(baseCurrency=" + this.baseCurrency + ", baseCurrencyIcon=" + this.baseCurrencyIcon + ", createTime=" + this.createTime + ", firstOrderId=" + this.firstOrderId + ", frequency=" + this.frequency + ", id=" + this.id + ", nextPurchase=" + this.nextPurchase + ", orderList=" + this.orderList + ", planId=" + this.planId + ", purchaseTimes=" + this.purchaseTimes + ", quoteAmount=" + this.quoteAmount + ", quoteCurrency=" + this.quoteCurrency + ", status=" + this.status + ", totalBaseAmount=" + this.totalBaseAmount + ", totalQuoteAmount=" + this.totalQuoteAmount + ", currencySymbol=" + this.currencySymbol + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteSymbol=" + this.quoteSymbol + ", lowBalance=" + this.lowBalance + ")";
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
        List<OrderDetailList> list = this.orderList;
        parcel.writeInt(list.size());
        Iterator<OrderDetailList> it = list.iterator();
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.RecurringBuyPlanList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyPlanList> serializer() {
            return RecurringBuyPlanList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyPlanList(int i, String str, String str2, long j, String str3, String str4, long j2, String str5, List list, String str6, long j3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str;
        }
        if ((i & 2) == 0) {
            this.baseCurrencyIcon = "";
        } else {
            this.baseCurrencyIcon = str2;
        }
        if ((i & 4) == 0) {
            this.createTime = 0L;
        } else {
            this.createTime = j;
        }
        if ((i & 8) == 0) {
            this.firstOrderId = "";
        } else {
            this.firstOrderId = str3;
        }
        if ((i & 16) == 0) {
            this.frequency = "";
        } else {
            this.frequency = str4;
        }
        if ((i & 32) == 0) {
            this.id = 0L;
        } else {
            this.id = j2;
        }
        if ((i & 64) == 0) {
            this.nextPurchase = "";
        } else {
            this.nextPurchase = str5;
        }
        this.orderList = (i & 128) == 0 ? yDY.AhwBna() : list;
        if ((i & 256) == 0) {
            this.planId = "";
        } else {
            this.planId = str6;
        }
        this.purchaseTimes = (i & 512) != 0 ? j3 : 0L;
        if ((i & 1024) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str7;
        }
        if ((i & 2048) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str8;
        }
        if ((i & 4096) == 0) {
            this.status = "";
        } else {
            this.status = str9;
        }
        if ((i & 8192) == 0) {
            this.totalBaseAmount = "";
        } else {
            this.totalBaseAmount = str10;
        }
        if ((i & 16384) == 0) {
            this.totalQuoteAmount = "";
        } else {
            this.totalQuoteAmount = str11;
        }
        if ((32768 & i) == 0) {
            this.currencySymbol = "";
        } else {
            this.currencySymbol = str12;
        }
        if ((65536 & i) == 0) {
            this.quoteCurrencySymbol = "";
        } else {
            this.quoteCurrencySymbol = str13;
        }
        if ((131072 & i) == 0) {
            this.quoteSymbol = "";
        } else {
            this.quoteSymbol = str14;
        }
        this.lowBalance = (i & 262144) == 0 ? false : z;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(RecurringBuyPlanList recurringBuyPlanList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBuyPlanList.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.baseCurrencyIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyPlanList.baseCurrencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || recurringBuyPlanList.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, recurringBuyPlanList.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.firstOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringBuyPlanList.firstOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.frequency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, recurringBuyPlanList.frequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || recurringBuyPlanList.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, recurringBuyPlanList.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.nextPurchase, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, recurringBuyPlanList.nextPurchase);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(recurringBuyPlanList.orderList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], recurringBuyPlanList.orderList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.planId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, recurringBuyPlanList.planId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || recurringBuyPlanList.purchaseTimes != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 9, recurringBuyPlanList.purchaseTimes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, recurringBuyPlanList.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, recurringBuyPlanList.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, recurringBuyPlanList.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.totalBaseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, recurringBuyPlanList.totalBaseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.totalQuoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, recurringBuyPlanList.totalQuoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.currencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, recurringBuyPlanList.currencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.quoteCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, recurringBuyPlanList.quoteCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) recurringBuyPlanList.quoteSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, recurringBuyPlanList.quoteSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || recurringBuyPlanList.lowBalance) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, recurringBuyPlanList.lowBalance);
        }
    }

    public RecurringBuyPlanList(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, long j2, @NotNull String str5, @NotNull List<OrderDetailList> list, @NotNull String str6, long j3, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, boolean z) {
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
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r46v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r46v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r46v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r26v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r46v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r46v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r46v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r30v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r46v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003e: ARITH (r46v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:34)) : (r33v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r46v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0051: ARITH (r46v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r35v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r46v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:0x006b: TERNARY null = ((wrap:int:0x0062: ARITH (r46v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:0x0076: TERNARY null = ((wrap:int:0x006d: ARITH (r46v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:0x0081: TERNARY null = ((wrap:int:0x0078: ARITH (r46v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r46v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r46v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r46v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r46v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r46v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, long, java.lang.String, java.util.List<com.okinc.okpaymentapi.data.remote.model.management.OrderDetailList>, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:26) call: com.okinc.okpaymentapi.data.remote.model.management.RecurringBuyPlanList.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, long, java.lang.String, java.util.List, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ RecurringBuyPlanList(String str, String str2, long j, String str3, String str4, long j2, String str5, List list, String str6, long j3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? yDY.AhwBna() : list, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? j3 : 0L, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? "" : str13, (i & 131072) != 0 ? "" : str14, (i & 262144) != 0 ? false : z);
    }
}
