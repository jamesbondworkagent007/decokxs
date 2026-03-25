package com.okinc.business.defi.biz.core.transaction.sign.aptos.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AptosSignInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;
    private final String expirationTimestampSecs;
    private final String gasUnitPrice;
    private final String maxGasAmount;
    private final String reserveFeeRatio;
    private final String sequenceNumber;
    private final String tyArg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AptosSignInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AptosSignInfo copy$default(AptosSignInfo aptosSignInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aptosSignInfo.sequenceNumber;
        }
        if ((i & 2) != 0) {
            str2 = aptosSignInfo.maxGasAmount;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = aptosSignInfo.gasUnitPrice;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = aptosSignInfo.expirationTimestampSecs;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = aptosSignInfo.tyArg;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = aptosSignInfo.chainId;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = aptosSignInfo.reserveFeeRatio;
        }
        return aptosSignInfo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sequenceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxGasAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.gasUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.expirationTimestampSecs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tyArg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosSignInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new AptosSignInfo(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptosSignInfo)) {
            return false;
        }
        AptosSignInfo aptosSignInfo = (AptosSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.sequenceNumber, (Object) aptosSignInfo.sequenceNumber) && Intrinsics.EZpvd((Object) this.maxGasAmount, (Object) aptosSignInfo.maxGasAmount) && Intrinsics.EZpvd((Object) this.gasUnitPrice, (Object) aptosSignInfo.gasUnitPrice) && Intrinsics.EZpvd((Object) this.expirationTimestampSecs, (Object) aptosSignInfo.expirationTimestampSecs) && Intrinsics.EZpvd((Object) this.tyArg, (Object) aptosSignInfo.tyArg) && Intrinsics.EZpvd((Object) this.chainId, (Object) aptosSignInfo.chainId) && Intrinsics.EZpvd((Object) this.reserveFeeRatio, (Object) aptosSignInfo.reserveFeeRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpirationTimestampSecs() {
        return this.expirationTimestampSecs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasUnitPrice() {
        return this.gasUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxGasAmount() {
        return this.maxGasAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFeeRatio() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTyArg() {
        return this.tyArg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sequenceNumber;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.maxGasAmount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.gasUnitPrice;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.expirationTimestampSecs;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tyArg;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.chainId;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.reserveFeeRatio;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosSignInfo(sequenceNumber=" + this.sequenceNumber + ", maxGasAmount=" + this.maxGasAmount + ", gasUnitPrice=" + this.gasUnitPrice + ", expirationTimestampSecs=" + this.expirationTimestampSecs + ", tyArg=" + this.tyArg + ", chainId=" + this.chainId + ", reserveFeeRatio=" + this.reserveFeeRatio + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AptosSignInfo> serializer() {
            return AptosSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AptosSignInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sequenceNumber = null;
        } else {
            this.sequenceNumber = str;
        }
        if ((i & 2) == 0) {
            this.maxGasAmount = null;
        } else {
            this.maxGasAmount = str2;
        }
        if ((i & 4) == 0) {
            this.gasUnitPrice = null;
        } else {
            this.gasUnitPrice = str3;
        }
        if ((i & 8) == 0) {
            this.expirationTimestampSecs = null;
        } else {
            this.expirationTimestampSecs = str4;
        }
        if ((i & 16) == 0) {
            this.tyArg = null;
        } else {
            this.tyArg = str5;
        }
        if ((i & 32) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str6;
        }
        if ((i & 64) == 0) {
            this.reserveFeeRatio = null;
        } else {
            this.reserveFeeRatio = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AptosSignInfo aptosSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || aptosSignInfo.sequenceNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, aptosSignInfo.sequenceNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aptosSignInfo.maxGasAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, aptosSignInfo.maxGasAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || aptosSignInfo.gasUnitPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, aptosSignInfo.gasUnitPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || aptosSignInfo.expirationTimestampSecs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, aptosSignInfo.expirationTimestampSecs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || aptosSignInfo.tyArg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, aptosSignInfo.tyArg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || aptosSignInfo.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, aptosSignInfo.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && aptosSignInfo.reserveFeeRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, aptosSignInfo.reserveFeeRatio);
    }

    public AptosSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.sequenceNumber = str;
        this.maxGasAmount = str2;
        this.gasUnitPrice = str3;
        this.expirationTimestampSecs = str4;
        this.tyArg = str5;
        this.chainId = str6;
        this.reserveFeeRatio = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AptosSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
