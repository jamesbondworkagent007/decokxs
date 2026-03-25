package com.okinc.business.defi.biz.core.transaction.sign.tron.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TronSignInfo {
    private String asset;
    private String contractAddress;
    private String expiration;
    private String fee;
    private String feelimit;
    private String ref_block_bytes;
    private String ref_block_hash;
    private String ref_block_number;
    private String reserveFeeRatio;
    private String timestamp;
    private String trc;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TronSignInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ref_block_bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.trc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ref_block_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ref_block_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.feelimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronSignInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new TronSignInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TronSignInfo)) {
            return false;
        }
        TronSignInfo tronSignInfo = (TronSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.ref_block_bytes, (Object) tronSignInfo.ref_block_bytes) && Intrinsics.EZpvd((Object) this.ref_block_hash, (Object) tronSignInfo.ref_block_hash) && Intrinsics.EZpvd((Object) this.ref_block_number, (Object) tronSignInfo.ref_block_number) && Intrinsics.EZpvd((Object) this.timestamp, (Object) tronSignInfo.timestamp) && Intrinsics.EZpvd((Object) this.expiration, (Object) tronSignInfo.expiration) && Intrinsics.EZpvd((Object) this.asset, (Object) tronSignInfo.asset) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) tronSignInfo.contractAddress) && Intrinsics.EZpvd((Object) this.fee, (Object) tronSignInfo.fee) && Intrinsics.EZpvd((Object) this.feelimit, (Object) tronSignInfo.feelimit) && Intrinsics.EZpvd((Object) this.trc, (Object) tronSignInfo.trc) && Intrinsics.EZpvd((Object) this.reserveFeeRatio, (Object) tronSignInfo.reserveFeeRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAsset() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeelimit() {
        return this.feelimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRef_block_bytes() {
        return this.ref_block_bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRef_block_hash() {
        return this.ref_block_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRef_block_number() {
        return this.ref_block_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFeeRatio() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrc() {
        return this.trc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.ref_block_bytes;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ref_block_hash;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ref_block_number;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.timestamp;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.expiration;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.asset;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.contractAddress;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.fee;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.feelimit;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.trc;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.reserveFeeRatio;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAsset(String str) {
        this.asset = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiration(String str) {
        this.expiration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeelimit(String str) {
        this.feelimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRef_block_bytes(String str) {
        this.ref_block_bytes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRef_block_hash(String str) {
        this.ref_block_hash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRef_block_number(String str) {
        this.ref_block_number = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFeeRatio(String str) {
        this.reserveFeeRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(String str) {
        this.timestamp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrc(String str) {
        this.trc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TronSignInfo(ref_block_bytes=" + this.ref_block_bytes + ", ref_block_hash=" + this.ref_block_hash + ", ref_block_number=" + this.ref_block_number + ", timestamp=" + this.timestamp + ", expiration=" + this.expiration + ", asset=" + this.asset + ", contractAddress=" + this.contractAddress + ", fee=" + this.fee + ", feelimit=" + this.feelimit + ", trc=" + this.trc + ", reserveFeeRatio=" + this.reserveFeeRatio + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.tron.bean.TronSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TronSignInfo> serializer() {
            return TronSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TronSignInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ref_block_bytes = null;
        } else {
            this.ref_block_bytes = str;
        }
        if ((i & 2) == 0) {
            this.ref_block_hash = null;
        } else {
            this.ref_block_hash = str2;
        }
        if ((i & 4) == 0) {
            this.ref_block_number = null;
        } else {
            this.ref_block_number = str3;
        }
        if ((i & 8) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str4;
        }
        if ((i & 16) == 0) {
            this.expiration = null;
        } else {
            this.expiration = str5;
        }
        if ((i & 32) == 0) {
            this.asset = null;
        } else {
            this.asset = str6;
        }
        if ((i & 64) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str7;
        }
        if ((i & 128) == 0) {
            this.fee = null;
        } else {
            this.fee = str8;
        }
        if ((i & 256) == 0) {
            this.feelimit = null;
        } else {
            this.feelimit = str9;
        }
        if ((i & 512) == 0) {
            this.trc = null;
        } else {
            this.trc = str10;
        }
        if ((i & 1024) == 0) {
            this.reserveFeeRatio = null;
        } else {
            this.reserveFeeRatio = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TronSignInfo tronSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tronSignInfo.ref_block_bytes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tronSignInfo.ref_block_bytes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tronSignInfo.ref_block_hash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tronSignInfo.ref_block_hash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tronSignInfo.ref_block_number != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tronSignInfo.ref_block_number);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tronSignInfo.timestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tronSignInfo.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tronSignInfo.expiration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tronSignInfo.expiration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tronSignInfo.asset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tronSignInfo.asset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tronSignInfo.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tronSignInfo.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tronSignInfo.fee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tronSignInfo.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tronSignInfo.feelimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tronSignInfo.feelimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tronSignInfo.trc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tronSignInfo.trc);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && tronSignInfo.reserveFeeRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, tronSignInfo.reserveFeeRatio);
    }

    public TronSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.ref_block_bytes = str;
        this.ref_block_hash = str2;
        this.ref_block_number = str3;
        this.timestamp = str4;
        this.expiration = str5;
        this.asset = str6;
        this.contractAddress = str7;
        this.fee = str8;
        this.feelimit = str9;
        this.trc = str10;
        this.reserveFeeRatio = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.biz.core.transaction.sign.tron.bean.TronSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TronSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : null);
    }
}
