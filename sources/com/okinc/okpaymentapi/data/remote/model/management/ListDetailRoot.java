package com.okinc.okpaymentapi.data.remote.model.management;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ListDetailRoot {
    private final String baseCurrency;
    private final String baseCurrencyIcon;
    private final String createTime;
    private final String firstOrderId;
    private final String frequency;
    private final long id;
    private final String lastPurchaseTime;
    private final boolean lowBalance;
    private final String nextPurchase;
    private final String nextPurchaseTime;
    private final List<OrderDetailList> orderList;
    private final String planId;
    private final long purchaseTimes;
    private final String quoteAmount;
    private final String quoteCurrency;
    private final String roi;
    private final long roiStatus;
    private String status;
    private final String totalBaseAmount;
    private final String totalQuoteAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(OrderDetailList$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OrderDetailList> component11() {
        return this.orderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component12() {
        return this.purchaseTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.baseCurrencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.roi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.totalBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.totalQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.nextPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.lastPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.nextPurchase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component20() {
        return this.roiStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.firstOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.lowBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ListDetailRoot copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull List<OrderDetailList> list, long j2, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        return new ListDetailRoot(j, str, str2, str3, str4, str5, str6, z, str7, str8, list, j2, str9, str10, str11, str12, str13, str14, str15, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailRoot)) {
            return false;
        }
        ListDetailRoot listDetailRoot = (ListDetailRoot) obj;
        return this.id == listDetailRoot.id && Intrinsics.EZpvd((Object) this.planId, (Object) listDetailRoot.planId) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) listDetailRoot.quoteCurrency) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) listDetailRoot.baseCurrency) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) listDetailRoot.quoteAmount) && Intrinsics.EZpvd((Object) this.firstOrderId, (Object) listDetailRoot.firstOrderId) && Intrinsics.EZpvd((Object) this.status, (Object) listDetailRoot.status) && this.lowBalance == listDetailRoot.lowBalance && Intrinsics.EZpvd((Object) this.createTime, (Object) listDetailRoot.createTime) && Intrinsics.EZpvd((Object) this.frequency, (Object) listDetailRoot.frequency) && Intrinsics.EZpvd(this.orderList, listDetailRoot.orderList) && this.purchaseTimes == listDetailRoot.purchaseTimes && Intrinsics.EZpvd((Object) this.baseCurrencyIcon, (Object) listDetailRoot.baseCurrencyIcon) && Intrinsics.EZpvd((Object) this.roi, (Object) listDetailRoot.roi) && Intrinsics.EZpvd((Object) this.totalBaseAmount, (Object) listDetailRoot.totalBaseAmount) && Intrinsics.EZpvd((Object) this.totalQuoteAmount, (Object) listDetailRoot.totalQuoteAmount) && Intrinsics.EZpvd((Object) this.nextPurchaseTime, (Object) listDetailRoot.nextPurchaseTime) && Intrinsics.EZpvd((Object) this.lastPurchaseTime, (Object) listDetailRoot.lastPurchaseTime) && Intrinsics.EZpvd((Object) this.nextPurchase, (Object) listDetailRoot.nextPurchase) && this.roiStatus == listDetailRoot.roiStatus;
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
    public final String getCreateTime() {
        return this.createTime;
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
    public final String getRoi() {
        return this.roi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRoiStatus() {
        return this.roiStatus;
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
        return (((((((((((((((((((((((((((((((((((((Long.hashCode(this.id) * 31) + this.planId.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.baseCurrency.hashCode()) * 31) + this.quoteAmount.hashCode()) * 31) + this.firstOrderId.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.lowBalance)) * 31) + this.createTime.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.orderList.hashCode()) * 31) + Long.hashCode(this.purchaseTimes)) * 31) + this.baseCurrencyIcon.hashCode()) * 31) + this.roi.hashCode()) * 31) + this.totalBaseAmount.hashCode()) * 31) + this.totalQuoteAmount.hashCode()) * 31) + this.nextPurchaseTime.hashCode()) * 31) + this.lastPurchaseTime.hashCode()) * 31) + this.nextPurchase.hashCode()) * 31) + Long.hashCode(this.roiStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ListDetailRoot(id=" + this.id + ", planId=" + this.planId + ", quoteCurrency=" + this.quoteCurrency + ", baseCurrency=" + this.baseCurrency + ", quoteAmount=" + this.quoteAmount + ", firstOrderId=" + this.firstOrderId + ", status=" + this.status + ", lowBalance=" + this.lowBalance + ", createTime=" + this.createTime + ", frequency=" + this.frequency + ", orderList=" + this.orderList + ", purchaseTimes=" + this.purchaseTimes + ", baseCurrencyIcon=" + this.baseCurrencyIcon + ", roi=" + this.roi + ", totalBaseAmount=" + this.totalBaseAmount + ", totalQuoteAmount=" + this.totalQuoteAmount + ", nextPurchaseTime=" + this.nextPurchaseTime + ", lastPurchaseTime=" + this.lastPurchaseTime + ", nextPurchase=" + this.nextPurchase + ", roiStatus=" + this.roiStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.ListDetailRoot.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ListDetailRoot> serializer() {
            return ListDetailRoot$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ListDetailRoot(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, List list, long j2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1048543 != (i & 1048543)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1048543, ListDetailRoot$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        this.planId = str;
        this.quoteCurrency = str2;
        this.baseCurrency = str3;
        this.quoteAmount = str4;
        this.firstOrderId = (i & 32) == 0 ? "" : str5;
        this.status = str6;
        this.lowBalance = z;
        this.createTime = str7;
        this.frequency = str8;
        this.orderList = list;
        this.purchaseTimes = j2;
        this.baseCurrencyIcon = str9;
        this.roi = str10;
        this.totalBaseAmount = str11;
        this.totalQuoteAmount = str12;
        this.nextPurchaseTime = str13;
        this.lastPurchaseTime = str14;
        this.nextPurchase = str15;
        this.roiStatus = j3;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(ListDetailRoot listDetailRoot, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, listDetailRoot.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, listDetailRoot.planId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, listDetailRoot.quoteCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, listDetailRoot.baseCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, listDetailRoot.quoteAmount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) listDetailRoot.firstOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, listDetailRoot.firstOrderId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, listDetailRoot.status);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, listDetailRoot.lowBalance);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, listDetailRoot.createTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, listDetailRoot.frequency);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], listDetailRoot.orderList);
        compositeEncoder.encodeLongElement(serialDescriptor, 11, listDetailRoot.purchaseTimes);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, listDetailRoot.baseCurrencyIcon);
        compositeEncoder.encodeStringElement(serialDescriptor, 13, listDetailRoot.roi);
        compositeEncoder.encodeStringElement(serialDescriptor, 14, listDetailRoot.totalBaseAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 15, listDetailRoot.totalQuoteAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 16, listDetailRoot.nextPurchaseTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 17, listDetailRoot.lastPurchaseTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 18, listDetailRoot.nextPurchase);
        compositeEncoder.encodeLongElement(serialDescriptor, 19, listDetailRoot.roiStatus);
    }

    public ListDetailRoot(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull List<OrderDetailList> list, long j2, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.id = j;
        this.planId = str;
        this.quoteCurrency = str2;
        this.baseCurrency = str3;
        this.quoteAmount = str4;
        this.firstOrderId = str5;
        this.status = str6;
        this.lowBalance = z;
        this.createTime = str7;
        this.frequency = str8;
        this.orderList = list;
        this.purchaseTimes = j2;
        this.baseCurrencyIcon = str9;
        this.roi = str10;
        this.totalBaseAmount = str11;
        this.totalQuoteAmount = str12;
        this.nextPurchaseTime = str13;
        this.lastPurchaseTime = str14;
        this.nextPurchase = str15;
        this.roiStatus = j3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r26v0 long)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r49v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (r33v0 java.lang.String)
  (r34v0 boolean)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 java.util.List)
  (r38v0 long)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (r43v0 java.lang.String)
  (r44v0 java.lang.String)
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (r47v0 long)
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List<com.okinc.okpaymentapi.data.remote.model.management.OrderDetailList>, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:120) call: com.okinc.okpaymentapi.data.remote.model.management.ListDetailRoot.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ ListDetailRoot(long j, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, List list, long j2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, (i & 32) != 0 ? "" : str5, str6, z, str7, str8, list, j2, str9, str10, str11, str12, str13, str14, str15, j3);
    }
}
