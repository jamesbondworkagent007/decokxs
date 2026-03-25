package com.okinc.business.defi.biz.core.ws.channel;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C11205cFp;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletApprovalRiskSubManager extends xZF<SubResponse> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xZF
    public boolean OLrzqt(@NotNull List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return false;
    }

    public WalletApprovalRiskSubManager() {
        super("wallet-notice", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String address;
        private final ApproveRiskData data;
        private final Integer type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubResponse copy$default(SubResponse subResponse, Integer num, String str, ApproveRiskData approveRiskData, int i, Object obj) {
            if ((i & 1) != 0) {
                num = subResponse.type;
            }
            if ((i & 2) != 0) {
                str = subResponse.address;
            }
            if ((i & 4) != 0) {
                approveRiskData = subResponse.data;
            }
            return subResponse.copy(num, str, approveRiskData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApproveRiskData component3() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(Integer num, String str, ApproveRiskData approveRiskData) {
            return new SubResponse(num, str, approveRiskData);
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
            return Intrinsics.EZpvd(this.type, subResponse.type) && Intrinsics.EZpvd((Object) this.address, (Object) subResponse.address) && Intrinsics.EZpvd(this.data, subResponse.data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApproveRiskData getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.type;
            int iHashCode = num == null ? 0 : num.hashCode();
            String str = this.address;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            ApproveRiskData approveRiskData = this.data;
            return (((iHashCode * 31) + iHashCode2) * 31) + (approveRiskData != null ? approveRiskData.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(type=" + this.type + ", address=" + this.address + ", data=" + this.data + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletApprovalRiskSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletApprovalRiskSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, Integer num, String str, ApproveRiskData approveRiskData, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, WalletApprovalRiskSubManager$SubResponse$$serializer.INSTANCE.getDescriptor());
            }
            this.type = num;
            this.address = str;
            this.data = approveRiskData;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, subResponse.type);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subResponse.address);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, WalletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer.INSTANCE, subResponse.data);
        }

        public SubResponse(Integer num, String str, ApproveRiskData approveRiskData) {
            this.type = num;
            this.address = str;
            this.data = approveRiskData;
        }

        @Serializable
        public static final class ApproveRiskData {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final Boolean approvalAddressRiskyFlag;
            private final Long approvalAddressRiskyTimeStamp;
            private final Boolean longTimeNoActiveFlag;
            private final Long longTimeNoActiveFlagTimeStamp;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ApproveRiskData() {
                this((Boolean) null, (Long) null, (Boolean) null, (Long) null, 15, (DefaultConstructorMarker) null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ApproveRiskData copy$default(ApproveRiskData approveRiskData, Boolean bool, Long l, Boolean bool2, Long l2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = approveRiskData.approvalAddressRiskyFlag;
                }
                if ((i & 2) != 0) {
                    l = approveRiskData.approvalAddressRiskyTimeStamp;
                }
                if ((i & 4) != 0) {
                    bool2 = approveRiskData.longTimeNoActiveFlag;
                }
                if ((i & 8) != 0) {
                    l2 = approveRiskData.longTimeNoActiveFlagTimeStamp;
                }
                return approveRiskData.copy(bool, l, bool2, l2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Boolean component1() {
                return this.approvalAddressRiskyFlag;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long component2() {
                return this.approvalAddressRiskyTimeStamp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Boolean component3() {
                return this.longTimeNoActiveFlag;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long component4() {
                return this.longTimeNoActiveFlagTimeStamp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ApproveRiskData copy(Boolean bool, Long l, Boolean bool2, Long l2) {
                return new ApproveRiskData(bool, l, bool2, l2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ApproveRiskData)) {
                    return false;
                }
                ApproveRiskData approveRiskData = (ApproveRiskData) obj;
                return Intrinsics.EZpvd(this.approvalAddressRiskyFlag, approveRiskData.approvalAddressRiskyFlag) && Intrinsics.EZpvd(this.approvalAddressRiskyTimeStamp, approveRiskData.approvalAddressRiskyTimeStamp) && Intrinsics.EZpvd(this.longTimeNoActiveFlag, approveRiskData.longTimeNoActiveFlag) && Intrinsics.EZpvd(this.longTimeNoActiveFlagTimeStamp, approveRiskData.longTimeNoActiveFlagTimeStamp);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Boolean getApprovalAddressRiskyFlag() {
                return this.approvalAddressRiskyFlag;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long getApprovalAddressRiskyTimeStamp() {
                return this.approvalAddressRiskyTimeStamp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Boolean getLongTimeNoActiveFlag() {
                return this.longTimeNoActiveFlag;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long getLongTimeNoActiveFlagTimeStamp() {
                return this.longTimeNoActiveFlagTimeStamp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Boolean bool = this.approvalAddressRiskyFlag;
                int iHashCode = bool == null ? 0 : bool.hashCode();
                Long l = this.approvalAddressRiskyTimeStamp;
                int iHashCode2 = l == null ? 0 : l.hashCode();
                Boolean bool2 = this.longTimeNoActiveFlag;
                int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
                Long l2 = this.longTimeNoActiveFlagTimeStamp;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l2 != null ? l2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ApproveRiskData(approvalAddressRiskyFlag=" + this.approvalAddressRiskyFlag + ", approvalAddressRiskyTimeStamp=" + this.approvalAddressRiskyTimeStamp + ", longTimeNoActiveFlag=" + this.longTimeNoActiveFlag + ", longTimeNoActiveFlagTimeStamp=" + this.longTimeNoActiveFlagTimeStamp + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletApprovalRiskSubManager.SubResponse.ApproveRiskData.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<ApproveRiskData> serializer() {
                    return WalletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ ApproveRiskData(int i, Boolean bool, Long l, Boolean bool2, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.approvalAddressRiskyFlag = null;
                } else {
                    this.approvalAddressRiskyFlag = bool;
                }
                if ((i & 2) == 0) {
                    this.approvalAddressRiskyTimeStamp = null;
                } else {
                    this.approvalAddressRiskyTimeStamp = l;
                }
                if ((i & 4) == 0) {
                    this.longTimeNoActiveFlag = null;
                } else {
                    this.longTimeNoActiveFlag = bool2;
                }
                if ((i & 8) == 0) {
                    this.longTimeNoActiveFlagTimeStamp = null;
                } else {
                    this.longTimeNoActiveFlagTimeStamp = l2;
                }
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ApproveRiskData approveRiskData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || approveRiskData.approvalAddressRiskyFlag != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, approveRiskData.approvalAddressRiskyFlag);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || approveRiskData.approvalAddressRiskyTimeStamp != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, approveRiskData.approvalAddressRiskyTimeStamp);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || approveRiskData.longTimeNoActiveFlag != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, approveRiskData.longTimeNoActiveFlag);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && approveRiskData.longTimeNoActiveFlagTimeStamp == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, approveRiskData.longTimeNoActiveFlagTimeStamp);
            }

            public ApproveRiskData(Boolean bool, Long l, Boolean bool2, Long l2) {
                this.approvalAddressRiskyFlag = bool;
                this.approvalAddressRiskyTimeStamp = l;
                this.longTimeNoActiveFlag = bool2;
                this.longTimeNoActiveFlagTimeStamp = l2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
 A[MD:(java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Long):void (m)] (LINE:38) call: com.okinc.business.defi.biz.core.ws.channel.WalletApprovalRiskSubManager.SubResponse.ApproveRiskData.<init>(java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Long):void type: THIS */
            public /* synthetic */ ApproveRiskData(Boolean bool, Long l, Boolean bool2, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : l2);
            }
        }

        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            return toString();
        }
    }
}
