package com.okinc.business.web3pay.lib.features.paytransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PurchaseOrderQrCodeRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String merchantId;
    private final OrderFiatAmount orderFiatAmount;
    private final String productCode;
    private final String qrCodeValue;
    private final String receiverInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PurchaseOrderQrCodeRequest copy$default(PurchaseOrderQrCodeRequest purchaseOrderQrCodeRequest, String str, String str2, String str3, String str4, OrderFiatAmount orderFiatAmount, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseOrderQrCodeRequest.merchantId;
        }
        if ((i & 2) != 0) {
            str2 = purchaseOrderQrCodeRequest.productCode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = purchaseOrderQrCodeRequest.qrCodeValue;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = purchaseOrderQrCodeRequest.receiverInfo;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            orderFiatAmount = purchaseOrderQrCodeRequest.orderFiatAmount;
        }
        return purchaseOrderQrCodeRequest.copy(str, str5, str6, str7, orderFiatAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.qrCodeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.receiverInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderFiatAmount component5() {
        return this.orderFiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PurchaseOrderQrCodeRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, OrderFiatAmount orderFiatAmount) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PurchaseOrderQrCodeRequest(str, str2, str3, str4, orderFiatAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseOrderQrCodeRequest)) {
            return false;
        }
        PurchaseOrderQrCodeRequest purchaseOrderQrCodeRequest = (PurchaseOrderQrCodeRequest) obj;
        return Intrinsics.EZpvd((Object) this.merchantId, (Object) purchaseOrderQrCodeRequest.merchantId) && Intrinsics.EZpvd((Object) this.productCode, (Object) purchaseOrderQrCodeRequest.productCode) && Intrinsics.EZpvd((Object) this.qrCodeValue, (Object) purchaseOrderQrCodeRequest.qrCodeValue) && Intrinsics.EZpvd((Object) this.receiverInfo, (Object) purchaseOrderQrCodeRequest.receiverInfo) && Intrinsics.EZpvd(this.orderFiatAmount, purchaseOrderQrCodeRequest.orderFiatAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderFiatAmount getOrderFiatAmount() {
        return this.orderFiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductCode() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQrCodeValue() {
        return this.qrCodeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiverInfo() {
        return this.receiverInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.merchantId.hashCode();
        int iHashCode2 = this.productCode.hashCode();
        int iHashCode3 = this.qrCodeValue.hashCode();
        String str = this.receiverInfo;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        OrderFiatAmount orderFiatAmount = this.orderFiatAmount;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (orderFiatAmount != null ? orderFiatAmount.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PurchaseOrderQrCodeRequest(merchantId=" + this.merchantId + ", productCode=" + this.productCode + ", qrCodeValue=" + this.qrCodeValue + ", receiverInfo=" + this.receiverInfo + ", orderFiatAmount=" + this.orderFiatAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderQrCodeRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PurchaseOrderQrCodeRequest> serializer() {
            return PurchaseOrderQrCodeRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PurchaseOrderQrCodeRequest(int i, String str, String str2, String str3, String str4, OrderFiatAmount orderFiatAmount, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PurchaseOrderQrCodeRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.merchantId = str;
        this.productCode = str2;
        this.qrCodeValue = str3;
        if ((i & 8) == 0) {
            this.receiverInfo = null;
        } else {
            this.receiverInfo = str4;
        }
        if ((i & 16) == 0) {
            this.orderFiatAmount = null;
        } else {
            this.orderFiatAmount = orderFiatAmount;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(PurchaseOrderQrCodeRequest purchaseOrderQrCodeRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, purchaseOrderQrCodeRequest.merchantId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, purchaseOrderQrCodeRequest.productCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, purchaseOrderQrCodeRequest.qrCodeValue);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || purchaseOrderQrCodeRequest.receiverInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, purchaseOrderQrCodeRequest.receiverInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && purchaseOrderQrCodeRequest.orderFiatAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, OrderFiatAmount$$serializer.INSTANCE, purchaseOrderQrCodeRequest.orderFiatAmount);
    }

    public PurchaseOrderQrCodeRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, OrderFiatAmount orderFiatAmount) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.merchantId = str;
        this.productCode = str2;
        this.qrCodeValue = str3;
        this.receiverInfo = str4;
        this.orderFiatAmount = orderFiatAmount;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:com.okinc.business.web3pay.lib.features.paytransaction.model.OrderFiatAmount:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.paytransaction.model.OrderFiatAmount) : (r12v0 com.okinc.business.web3pay.lib.features.paytransaction.model.OrderFiatAmount))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.features.paytransaction.model.OrderFiatAmount):void (m)] (LINE:8) call: com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderQrCodeRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.features.paytransaction.model.OrderFiatAmount):void type: THIS */
    public /* synthetic */ PurchaseOrderQrCodeRequest(String str, String str2, String str3, String str4, OrderFiatAmount orderFiatAmount, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : orderFiatAmount);
    }
}
