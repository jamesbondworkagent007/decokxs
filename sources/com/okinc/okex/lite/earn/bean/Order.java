package com.okinc.okex.lite.earn.bean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class Order {
    private Currency currency;
    private String estimatedTotalvarueFiat;
    private List<EstimatedTotalvarue> estimatedTotalvarues;
    private int orderId;
    private ProductType productType;
    private Status status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(EstimatedTotalvarue$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okex.lite.earn.bean.Order */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Order copy$default(Order order, Currency currency, String str, List list, int i, ProductType productType, Status status, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            currency = order.currency;
        }
        if ((i2 & 2) != 0) {
            str = order.estimatedTotalvarueFiat;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            list = order.estimatedTotalvarues;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            i = order.orderId;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            productType = order.productType;
        }
        ProductType productType2 = productType;
        if ((i2 & 32) != 0) {
            status = order.status;
        }
        return order.copy(currency, str2, list2, i3, productType2, status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Currency component1() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estimatedTotalvarueFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimatedTotalvarue> component3() {
        return this.estimatedTotalvarues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductType component5() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Status component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Order copy(Currency currency, @NotNull String str, List<EstimatedTotalvarue> list, int i, ProductType productType, Status status) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Order(currency, str, list, i, productType, status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order order = (Order) obj;
        return Intrinsics.EZpvd(this.currency, order.currency) && Intrinsics.EZpvd((Object) this.estimatedTotalvarueFiat, (Object) order.estimatedTotalvarueFiat) && Intrinsics.EZpvd(this.estimatedTotalvarues, order.estimatedTotalvarues) && this.orderId == order.orderId && Intrinsics.EZpvd(this.productType, order.productType) && Intrinsics.EZpvd(this.status, order.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Currency getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedTotalvarueFiat() {
        return this.estimatedTotalvarueFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimatedTotalvarue> getEstimatedTotalvarues() {
        return this.estimatedTotalvarues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductType getProductType() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Status getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Currency currency = this.currency;
        int iHashCode = currency == null ? 0 : currency.hashCode();
        int iHashCode2 = this.estimatedTotalvarueFiat.hashCode();
        List<EstimatedTotalvarue> list = this.estimatedTotalvarues;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        int iHashCode4 = Integer.hashCode(this.orderId);
        ProductType productType = this.productType;
        int iHashCode5 = productType == null ? 0 : productType.hashCode();
        Status status = this.status;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (status != null ? status.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedTotalvarueFiat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimatedTotalvarueFiat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedTotalvarues(List<EstimatedTotalvarue> list) {
        this.estimatedTotalvarues = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(int i) {
        this.orderId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProductType(ProductType productType) {
        this.productType = productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(Status status) {
        this.status = status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Order(currency=" + this.currency + ", estimatedTotalvarueFiat=" + this.estimatedTotalvarueFiat + ", estimatedTotalvarues=" + this.estimatedTotalvarues + ", orderId=" + this.orderId + ", productType=" + this.productType + ", status=" + this.status + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.earn.bean.Order.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Order> serializer() {
            return Order$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Order(int i, Currency currency, String str, List list, int i2, ProductType productType, Status status, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, Order$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.currency = null;
        } else {
            this.currency = currency;
        }
        if ((i & 2) == 0) {
            this.estimatedTotalvarueFiat = "0";
        } else {
            this.estimatedTotalvarueFiat = str;
        }
        if ((i & 4) == 0) {
            this.estimatedTotalvarues = null;
        } else {
            this.estimatedTotalvarues = list;
        }
        this.orderId = i2;
        if ((i & 16) == 0) {
            this.productType = null;
        } else {
            this.productType = productType;
        }
        if ((i & 32) == 0) {
            this.status = null;
        } else {
            this.status = status;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(Order order, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || order.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, Currency$$serializer.INSTANCE, order.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) order.estimatedTotalvarueFiat, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, order.estimatedTotalvarueFiat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || order.estimatedTotalvarues != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], order.estimatedTotalvarues);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, order.orderId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || order.productType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, ProductType$$serializer.INSTANCE, order.productType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && order.status == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, Status$$serializer.INSTANCE, order.status);
    }

    public Order(Currency currency, @NotNull String str, List<EstimatedTotalvarue> list, int i, ProductType productType, Status status) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currency = currency;
        this.estimatedTotalvarueFiat = str;
        this.estimatedTotalvarues = list;
        this.orderId = i;
        this.productType = productType;
        this.status = status;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:com.okinc.okex.lite.earn.bean.Currency:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.lite.earn.bean.Currency) : (r10v0 com.okinc.okex.lite.earn.bean.Currency))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (r13v0 int)
  (wrap:com.okinc.okex.lite.earn.bean.ProductType:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.lite.earn.bean.ProductType) : (r14v0 com.okinc.okex.lite.earn.bean.ProductType))
  (wrap:com.okinc.okex.lite.earn.bean.Status:?: TERNARY null = ((wrap:int:0x001f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.lite.earn.bean.Status) : (r15v0 com.okinc.okex.lite.earn.bean.Status))
 A[MD:(com.okinc.okex.lite.earn.bean.Currency, java.lang.String, java.util.List<com.okinc.okex.lite.earn.bean.EstimatedTotalvarue>, int, com.okinc.okex.lite.earn.bean.ProductType, com.okinc.okex.lite.earn.bean.Status):void (m)] (LINE:62) call: com.okinc.okex.lite.earn.bean.Order.<init>(com.okinc.okex.lite.earn.bean.Currency, java.lang.String, java.util.List, int, com.okinc.okex.lite.earn.bean.ProductType, com.okinc.okex.lite.earn.bean.Status):void type: THIS */
    public /* synthetic */ Order(Currency currency, String str, List list, int i, ProductType productType, Status status, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : currency, (i2 & 2) != 0 ? "0" : str, (i2 & 4) != 0 ? null : list, i, (i2 & 16) != 0 ? null : productType, (i2 & 32) != 0 ? null : status);
    }
}
