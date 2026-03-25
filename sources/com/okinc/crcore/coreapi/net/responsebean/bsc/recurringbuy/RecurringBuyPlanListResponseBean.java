package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class RecurringBuyPlanListResponseBean implements java.io.Serializable, Parcelable {
    private final String baseCurrency;
    private final String baseCurrencyIcon;
    private final long createTime;
    private final String currencySymbol;
    private final boolean displayQuoteCurrencyAfterAmount;
    private final String firstOrder;
    private final String frequency;
    private final long id;
    private final boolean lowBalance;
    private final String nextPurchase;
    private final List<RecurringBuyOrderResponseBean> orderList;
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
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyPlanListResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(RecurringBuyOrderResponseBean$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<RecurringBuyPlanListResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanListResponseBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            long j2 = parcel.readLong();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RecurringBuyOrderResponseBean.CREATOR.createFromParcel(parcel));
                }
            }
            return new RecurringBuyPlanListResponseBean(string, string2, j, string3, string4, j2, string5, arrayList, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanListResponseBean[] newArray(int i) {
            return new RecurringBuyPlanListResponseBean[i];
        }
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
        return this.firstOrder;
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
    public final List<RecurringBuyOrderResponseBean> component8() {
        return this.orderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanListResponseBean copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, long j2, @NotNull String str5, List<RecurringBuyOrderResponseBean> list, @NotNull String str6, long j3, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, boolean z, @NotNull String str15, boolean z2) {
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
        return new RecurringBuyPlanListResponseBean(str, str2, j, str3, str4, j2, str5, list, str6, j3, str7, str8, str9, str10, str11, str12, str13, str14, z, str15, z2);
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
        if (!(obj instanceof RecurringBuyPlanListResponseBean)) {
            return false;
        }
        RecurringBuyPlanListResponseBean recurringBuyPlanListResponseBean = (RecurringBuyPlanListResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.baseCurrency, (Object) recurringBuyPlanListResponseBean.baseCurrency) && Intrinsics.EZpvd((Object) this.baseCurrencyIcon, (Object) recurringBuyPlanListResponseBean.baseCurrencyIcon) && this.createTime == recurringBuyPlanListResponseBean.createTime && Intrinsics.EZpvd((Object) this.firstOrder, (Object) recurringBuyPlanListResponseBean.firstOrder) && Intrinsics.EZpvd((Object) this.frequency, (Object) recurringBuyPlanListResponseBean.frequency) && this.id == recurringBuyPlanListResponseBean.id && Intrinsics.EZpvd((Object) this.nextPurchase, (Object) recurringBuyPlanListResponseBean.nextPurchase) && Intrinsics.EZpvd(this.orderList, recurringBuyPlanListResponseBean.orderList) && Intrinsics.EZpvd((Object) this.planId, (Object) recurringBuyPlanListResponseBean.planId) && this.purchaseTimes == recurringBuyPlanListResponseBean.purchaseTimes && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) recurringBuyPlanListResponseBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) recurringBuyPlanListResponseBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyPlanListResponseBean.status) && Intrinsics.EZpvd((Object) this.totalBaseAmount, (Object) recurringBuyPlanListResponseBean.totalBaseAmount) && Intrinsics.EZpvd((Object) this.totalQuoteAmount, (Object) recurringBuyPlanListResponseBean.totalQuoteAmount) && Intrinsics.EZpvd((Object) this.currencySymbol, (Object) recurringBuyPlanListResponseBean.currencySymbol) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) recurringBuyPlanListResponseBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) recurringBuyPlanListResponseBean.quoteSymbol) && this.lowBalance == recurringBuyPlanListResponseBean.lowBalance && Intrinsics.EZpvd((Object) this.recurringBuyErrorType, (Object) recurringBuyPlanListResponseBean.recurringBuyErrorType) && this.displayQuoteCurrencyAfterAmount == recurringBuyPlanListResponseBean.displayQuoteCurrencyAfterAmount;
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
    public final boolean getLowBalance() {
        return this.lowBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextPurchase() {
        return this.nextPurchase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringBuyOrderResponseBean> getOrderList() {
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
        int iHashCode = this.baseCurrency.hashCode();
        int iHashCode2 = this.baseCurrencyIcon.hashCode();
        int iHashCode3 = Long.hashCode(this.createTime);
        int iHashCode4 = this.firstOrder.hashCode();
        int iHashCode5 = this.frequency.hashCode();
        int iHashCode6 = Long.hashCode(this.id);
        int iHashCode7 = this.nextPurchase.hashCode();
        List<RecurringBuyOrderResponseBean> list = this.orderList;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.planId.hashCode()) * 31) + Long.hashCode(this.purchaseTimes)) * 31) + this.quoteAmount.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.status.hashCode()) * 31) + this.totalBaseAmount.hashCode()) * 31) + this.totalQuoteAmount.hashCode()) * 31) + this.currencySymbol.hashCode()) * 31) + this.quoteCurrencySymbol.hashCode()) * 31) + this.quoteSymbol.hashCode()) * 31) + Boolean.hashCode(this.lowBalance)) * 31) + this.recurringBuyErrorType.hashCode()) * 31) + Boolean.hashCode(this.displayQuoteCurrencyAfterAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanListResponseBean(baseCurrency=" + this.baseCurrency + ", baseCurrencyIcon=" + this.baseCurrencyIcon + ", createTime=" + this.createTime + ", firstOrder=" + this.firstOrder + ", frequency=" + this.frequency + ", id=" + this.id + ", nextPurchase=" + this.nextPurchase + ", orderList=" + this.orderList + ", planId=" + this.planId + ", purchaseTimes=" + this.purchaseTimes + ", quoteAmount=" + this.quoteAmount + ", quoteCurrency=" + this.quoteCurrency + ", status=" + this.status + ", totalBaseAmount=" + this.totalBaseAmount + ", totalQuoteAmount=" + this.totalQuoteAmount + ", currencySymbol=" + this.currencySymbol + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteSymbol=" + this.quoteSymbol + ", lowBalance=" + this.lowBalance + ", recurringBuyErrorType=" + this.recurringBuyErrorType + ", displayQuoteCurrencyAfterAmount=" + this.displayQuoteCurrencyAfterAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.baseCurrencyIcon);
        parcel.writeLong(this.createTime);
        parcel.writeString(this.firstOrder);
        parcel.writeString(this.frequency);
        parcel.writeLong(this.id);
        parcel.writeString(this.nextPurchase);
        List<RecurringBuyOrderResponseBean> list = this.orderList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RecurringBuyOrderResponseBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
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

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanListResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyPlanListResponseBean> serializer() {
            return RecurringBuyPlanListResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyPlanListResponseBean(int i, String str, String str2, long j, String str3, String str4, long j2, String str5, List list, String str6, long j3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (128 != (i & 128)) {
            PluginExceptionsKt.throwMissingFieldException(i, 128, RecurringBuyPlanListResponseBean$$serializer.INSTANCE.getDescriptor());
        }
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
            this.firstOrder = "";
        } else {
            this.firstOrder = str3;
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
        this.orderList = list;
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
        if ((262144 & i) == 0) {
            this.lowBalance = false;
        } else {
            this.lowBalance = z;
        }
        if ((524288 & i) == 0) {
            this.recurringBuyErrorType = "";
        } else {
            this.recurringBuyErrorType = str15;
        }
        if ((i & 1048576) == 0) {
            this.displayQuoteCurrencyAfterAmount = false;
        } else {
            this.displayQuoteCurrencyAfterAmount = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyPlanListResponseBean recurringBuyPlanListResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBuyPlanListResponseBean.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.baseCurrencyIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyPlanListResponseBean.baseCurrencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || recurringBuyPlanListResponseBean.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, recurringBuyPlanListResponseBean.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.firstOrder, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringBuyPlanListResponseBean.firstOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.frequency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, recurringBuyPlanListResponseBean.frequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || recurringBuyPlanListResponseBean.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, recurringBuyPlanListResponseBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.nextPurchase, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, recurringBuyPlanListResponseBean.nextPurchase);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], recurringBuyPlanListResponseBean.orderList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.planId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, recurringBuyPlanListResponseBean.planId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || recurringBuyPlanListResponseBean.purchaseTimes != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 9, recurringBuyPlanListResponseBean.purchaseTimes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, recurringBuyPlanListResponseBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, recurringBuyPlanListResponseBean.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, recurringBuyPlanListResponseBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.totalBaseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, recurringBuyPlanListResponseBean.totalBaseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.totalQuoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, recurringBuyPlanListResponseBean.totalQuoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.currencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, recurringBuyPlanListResponseBean.currencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.quoteCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, recurringBuyPlanListResponseBean.quoteCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.quoteSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, recurringBuyPlanListResponseBean.quoteSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || recurringBuyPlanListResponseBean.lowBalance) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, recurringBuyPlanListResponseBean.lowBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) recurringBuyPlanListResponseBean.recurringBuyErrorType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, recurringBuyPlanListResponseBean.recurringBuyErrorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || recurringBuyPlanListResponseBean.displayQuoteCurrencyAfterAmount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, recurringBuyPlanListResponseBean.displayQuoteCurrencyAfterAmount);
        }
    }

    public RecurringBuyPlanListResponseBean(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, long j2, @NotNull String str5, List<RecurringBuyOrderResponseBean> list, @NotNull String str6, long j3, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, boolean z, @NotNull String str15, boolean z2) {
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
        this.baseCurrency = str;
        this.baseCurrencyIcon = str2;
        this.createTime = j;
        this.firstOrder = str3;
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r53v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r53v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r53v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r31v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r53v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r53v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r53v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r35v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r53v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (r38v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r53v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0046: ARITH (r53v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r40v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r53v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r53v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r53v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (r53v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r53v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (32768 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (65536 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (131072 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009c: ARITH (262144 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a7: ARITH (524288 int) & (r53v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r53v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r52v0 boolean))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, long, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyOrderResponseBean>, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanListResponseBean.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, long, java.lang.String, java.util.List, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ RecurringBuyPlanListResponseBean(String str, String str2, long j, String str3, String str4, long j2, String str5, List list, String str6, long j3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? "" : str5, list, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? 0L : j3, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (32768 & i) != 0 ? "" : str12, (65536 & i) != 0 ? "" : str13, (131072 & i) != 0 ? "" : str14, (262144 & i) != 0 ? false : z, (524288 & i) != 0 ? "" : str15, (i & 1048576) != 0 ? false : z2);
    }
}
