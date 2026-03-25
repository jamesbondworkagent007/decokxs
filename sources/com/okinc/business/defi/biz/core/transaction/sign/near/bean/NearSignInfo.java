package com.okinc.business.defi.biz.core.transaction.sign.near.bean;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class NearSignInfo {
    private String blockHash;
    private String depositGasFee;
    private String depositMinAmount;
    private String fee;
    private String minTransferTokenValue;
    private String nonce;
    private String reserveFeeRatio;
    private String storageUsedAmount;
    private Integer toAddressCheck;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NearSignInfo() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.blockHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.toAddressCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.depositMinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.depositGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.minTransferTokenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.storageUsedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NearSignInfo copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8) {
        return new NearSignInfo(str, str2, str3, num, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearSignInfo)) {
            return false;
        }
        NearSignInfo nearSignInfo = (NearSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.blockHash, (Object) nearSignInfo.blockHash) && Intrinsics.EZpvd((Object) this.nonce, (Object) nearSignInfo.nonce) && Intrinsics.EZpvd((Object) this.fee, (Object) nearSignInfo.fee) && Intrinsics.EZpvd(this.toAddressCheck, nearSignInfo.toAddressCheck) && Intrinsics.EZpvd((Object) this.depositMinAmount, (Object) nearSignInfo.depositMinAmount) && Intrinsics.EZpvd((Object) this.depositGasFee, (Object) nearSignInfo.depositGasFee) && Intrinsics.EZpvd((Object) this.minTransferTokenValue, (Object) nearSignInfo.minTransferTokenValue) && Intrinsics.EZpvd((Object) this.reserveFeeRatio, (Object) nearSignInfo.reserveFeeRatio) && Intrinsics.EZpvd((Object) this.storageUsedAmount, (Object) nearSignInfo.storageUsedAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockHash() {
        return this.blockHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositGasFee() {
        return this.depositGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositMinAmount() {
        return this.depositMinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinTransferTokenValue() {
        return this.minTransferTokenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFeeRatio() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStorageUsedAmount() {
        return this.storageUsedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getToAddressCheck() {
        return this.toAddressCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.blockHash;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nonce;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fee;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.toAddressCheck;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.depositMinAmount;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.depositGasFee;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.minTransferTokenValue;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.reserveFeeRatio;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.storageUsedAmount;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlockHash(String str) {
        this.blockHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositGasFee(String str) {
        this.depositGasFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositMinAmount(String str) {
        this.depositMinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinTransferTokenValue(String str) {
        this.minTransferTokenValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFeeRatio(String str) {
        this.reserveFeeRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStorageUsedAmount(String str) {
        this.storageUsedAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAddressCheck(Integer num) {
        this.toAddressCheck = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NearSignInfo(blockHash=" + this.blockHash + ", nonce=" + this.nonce + ", fee=" + this.fee + ", toAddressCheck=" + this.toAddressCheck + ", depositMinAmount=" + this.depositMinAmount + ", depositGasFee=" + this.depositGasFee + ", minTransferTokenValue=" + this.minTransferTokenValue + ", reserveFeeRatio=" + this.reserveFeeRatio + ", storageUsedAmount=" + this.storageUsedAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.near.bean.NearSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NearSignInfo> serializer() {
            return NearSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NearSignInfo(int i, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.blockHash = null;
        } else {
            this.blockHash = str;
        }
        if ((i & 2) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str2;
        }
        if ((i & 4) == 0) {
            this.fee = null;
        } else {
            this.fee = str3;
        }
        if ((i & 8) == 0) {
            this.toAddressCheck = null;
        } else {
            this.toAddressCheck = num;
        }
        if ((i & 16) == 0) {
            this.depositMinAmount = null;
        } else {
            this.depositMinAmount = str4;
        }
        if ((i & 32) == 0) {
            this.depositGasFee = null;
        } else {
            this.depositGasFee = str5;
        }
        if ((i & 64) == 0) {
            this.minTransferTokenValue = null;
        } else {
            this.minTransferTokenValue = str6;
        }
        if ((i & 128) == 0) {
            this.reserveFeeRatio = null;
        } else {
            this.reserveFeeRatio = str7;
        }
        if ((i & 256) == 0) {
            this.storageUsedAmount = null;
        } else {
            this.storageUsedAmount = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(NearSignInfo nearSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || nearSignInfo.blockHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, nearSignInfo.blockHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || nearSignInfo.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, nearSignInfo.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || nearSignInfo.fee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, nearSignInfo.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || nearSignInfo.toAddressCheck != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, nearSignInfo.toAddressCheck);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || nearSignInfo.depositMinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, nearSignInfo.depositMinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || nearSignInfo.depositGasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, nearSignInfo.depositGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || nearSignInfo.minTransferTokenValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, nearSignInfo.minTransferTokenValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || nearSignInfo.reserveFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, nearSignInfo.reserveFeeRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && nearSignInfo.storageUsedAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, nearSignInfo.storageUsedAmount);
    }

    public NearSignInfo(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8) {
        this.blockHash = str;
        this.nonce = str2;
        this.fee = str3;
        this.toAddressCheck = num;
        this.depositMinAmount = str4;
        this.depositGasFee = str5;
        this.minTransferTokenValue = str6;
        this.reserveFeeRatio = str7;
        this.storageUsedAmount = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.defi.biz.core.transaction.sign.near.bean.NearSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NearSignInfo(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) == 0 ? str8 : null);
    }
}
