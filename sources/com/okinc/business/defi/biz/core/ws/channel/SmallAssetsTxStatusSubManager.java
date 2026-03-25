package com.okinc.business.defi.biz.core.ws.channel;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C11205cFp;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class SmallAssetsTxStatusSubManager extends xZF<SubResponse> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xZF
    public boolean OLrzqt(@NotNull List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return false;
    }

    public SmallAssetsTxStatusSubManager() {
        super("dex-dust-token-trade-push", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final SubResponseData data;
        private final Integer pushWalletFrontEndBizType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this((Integer) null, (SubResponseData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubResponse copy$default(SubResponse subResponse, Integer num, SubResponseData subResponseData, int i, Object obj) {
            if ((i & 1) != 0) {
                num = subResponse.pushWalletFrontEndBizType;
            }
            if ((i & 2) != 0) {
                subResponseData = subResponse.data;
            }
            return subResponse.copy(num, subResponseData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.pushWalletFrontEndBizType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponseData component2() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(Integer num, SubResponseData subResponseData) {
            return new SubResponse(num, subResponseData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubResponse)) {
                return false;
            }
            SubResponse subResponse = (SubResponse) obj;
            return Intrinsics.EZpvd(this.pushWalletFrontEndBizType, subResponse.pushWalletFrontEndBizType) && Intrinsics.EZpvd(this.data, subResponse.data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponseData getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getPushWalletFrontEndBizType() {
            return this.pushWalletFrontEndBizType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.pushWalletFrontEndBizType;
            int iHashCode = num == null ? 0 : num.hashCode();
            SubResponseData subResponseData = this.data;
            return (iHashCode * 31) + (subResponseData != null ? subResponseData.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(pushWalletFrontEndBizType=" + this.pushWalletFrontEndBizType + ", data=" + this.data + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return SmallAssetsTxStatusSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, Integer num, SubResponseData subResponseData, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.pushWalletFrontEndBizType = null;
            } else {
                this.pushWalletFrontEndBizType = num;
            }
            if ((i & 2) == 0) {
                this.data = null;
            } else {
                this.data = subResponseData;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponse.pushWalletFrontEndBizType != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, subResponse.pushWalletFrontEndBizType);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && subResponse.data == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, SmallAssetsTxStatusSubManager$SubResponseData$$serializer.INSTANCE, subResponse.data);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager$SubResponseData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager$SubResponseData) : (r3v0 com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager$SubResponseData))
 A[MD:(java.lang.Integer, com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager$SubResponseData):void (m)] (LINE:39) call: com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager.SubResponse.<init>(java.lang.Integer, com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager$SubResponseData):void type: THIS */
        public /* synthetic */ SubResponse(Integer num, SubResponseData subResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : subResponseData);
        }

        public SubResponse(Integer num, SubResponseData subResponseData) {
            this.pushWalletFrontEndBizType = num;
            this.data = subResponseData;
        }

        @Override // o.xZF.ActionBar
        public String getMAddress() {
            SubResponseData subResponseData = this.data;
            if (subResponseData != null) {
                return subResponseData.getUserWalletAddress();
            }
            return null;
        }

        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            return toString();
        }
    }

    @Serializable
    public static final class SubResponseData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Long batchOrderId;
        private final Integer failedOrderCount;
        private final String successNativeTokenAmount;
        private final Integer successOrderCount;
        private final String totalNetworkFee;
        private final Integer totalOrderCount;
        private final String userWalletAddress;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponseData() {
            this((String) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (Long) null, (String) null, 127, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubResponseData copy$default(SubResponseData subResponseData, String str, Integer num, String str2, Integer num2, Integer num3, Long l, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subResponseData.totalNetworkFee;
            }
            if ((i & 2) != 0) {
                num = subResponseData.failedOrderCount;
            }
            Integer num4 = num;
            if ((i & 4) != 0) {
                str2 = subResponseData.successNativeTokenAmount;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                num2 = subResponseData.successOrderCount;
            }
            Integer num5 = num2;
            if ((i & 16) != 0) {
                num3 = subResponseData.totalOrderCount;
            }
            Integer num6 = num3;
            if ((i & 32) != 0) {
                l = subResponseData.batchOrderId;
            }
            Long l2 = l;
            if ((i & 64) != 0) {
                str3 = subResponseData.userWalletAddress;
            }
            return subResponseData.copy(str, num4, str4, num5, num6, l2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.totalNetworkFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component2() {
            return this.failedOrderCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.successNativeTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component4() {
            return this.successOrderCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component5() {
            return this.totalOrderCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component6() {
            return this.batchOrderId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.userWalletAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponseData copy(String str, Integer num, String str2, Integer num2, Integer num3, Long l, String str3) {
            return new SubResponseData(str, num, str2, num2, num3, l, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubResponseData)) {
                return false;
            }
            SubResponseData subResponseData = (SubResponseData) obj;
            return Intrinsics.EZpvd((Object) this.totalNetworkFee, (Object) subResponseData.totalNetworkFee) && Intrinsics.EZpvd(this.failedOrderCount, subResponseData.failedOrderCount) && Intrinsics.EZpvd((Object) this.successNativeTokenAmount, (Object) subResponseData.successNativeTokenAmount) && Intrinsics.EZpvd(this.successOrderCount, subResponseData.successOrderCount) && Intrinsics.EZpvd(this.totalOrderCount, subResponseData.totalOrderCount) && Intrinsics.EZpvd(this.batchOrderId, subResponseData.batchOrderId) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) subResponseData.userWalletAddress);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getBatchOrderId() {
            return this.batchOrderId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getFailedOrderCount() {
            return this.failedOrderCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSuccessNativeTokenAmount() {
            return this.successNativeTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getSuccessOrderCount() {
            return this.successOrderCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTotalNetworkFee() {
            return this.totalNetworkFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTotalOrderCount() {
            return this.totalOrderCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUserWalletAddress() {
            return this.userWalletAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.totalNetworkFee;
            int iHashCode = str == null ? 0 : str.hashCode();
            Integer num = this.failedOrderCount;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            String str2 = this.successNativeTokenAmount;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num2 = this.successOrderCount;
            int iHashCode4 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.totalOrderCount;
            int iHashCode5 = num3 == null ? 0 : num3.hashCode();
            Long l = this.batchOrderId;
            int iHashCode6 = l == null ? 0 : l.hashCode();
            String str3 = this.userWalletAddress;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponseData(totalNetworkFee=" + this.totalNetworkFee + ", failedOrderCount=" + this.failedOrderCount + ", successNativeTokenAmount=" + this.successNativeTokenAmount + ", successOrderCount=" + this.successOrderCount + ", totalOrderCount=" + this.totalOrderCount + ", batchOrderId=" + this.batchOrderId + ", userWalletAddress=" + this.userWalletAddress + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager.SubResponseData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponseData> serializer() {
                return SmallAssetsTxStatusSubManager$SubResponseData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponseData(int i, String str, Integer num, String str2, Integer num2, Integer num3, Long l, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.totalNetworkFee = null;
            } else {
                this.totalNetworkFee = str;
            }
            if ((i & 2) == 0) {
                this.failedOrderCount = null;
            } else {
                this.failedOrderCount = num;
            }
            if ((i & 4) == 0) {
                this.successNativeTokenAmount = null;
            } else {
                this.successNativeTokenAmount = str2;
            }
            if ((i & 8) == 0) {
                this.successOrderCount = null;
            } else {
                this.successOrderCount = num2;
            }
            if ((i & 16) == 0) {
                this.totalOrderCount = null;
            } else {
                this.totalOrderCount = num3;
            }
            if ((i & 32) == 0) {
                this.batchOrderId = null;
            } else {
                this.batchOrderId = l;
            }
            if ((i & 64) == 0) {
                this.userWalletAddress = null;
            } else {
                this.userWalletAddress = str3;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponseData subResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponseData.totalNetworkFee != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subResponseData.totalNetworkFee);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subResponseData.failedOrderCount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, subResponseData.failedOrderCount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subResponseData.successNativeTokenAmount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, subResponseData.successNativeTokenAmount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subResponseData.successOrderCount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, subResponseData.successOrderCount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subResponseData.totalOrderCount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, subResponseData.totalOrderCount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || subResponseData.batchOrderId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, subResponseData.batchOrderId);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && subResponseData.userWalletAddress == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, subResponseData.userWalletAddress);
        }

        public SubResponseData(String str, Integer num, String str2, Integer num2, Integer num3, Long l, String str3) {
            this.totalNetworkFee = str;
            this.failedOrderCount = num;
            this.successNativeTokenAmount = str2;
            this.successOrderCount = num2;
            this.totalOrderCount = num3;
            this.batchOrderId = l;
            this.userWalletAddress = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r12v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String):void (m)] (LINE:52) call: com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager.SubResponseData.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String):void type: THIS */
        public /* synthetic */ SubResponseData(String str, Integer num, String str2, Integer num2, Integer num3, Long l, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str3);
        }
    }
}
