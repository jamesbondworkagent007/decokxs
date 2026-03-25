package com.okinc.business.defi.biz.core.transaction.sign.solana.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SolanaSignInfo {
    private String computeUnitPrice;
    private final String decimal;
    private final String fee;
    private final String feelimit;
    private final String mintAddress;
    private final String recentBlockhash;
    private final String rent;
    private final String reserveFeeRatio;
    private final String solRent;
    private final Boolean supportJito;
    private final Boolean toAddressLegal;
    private final String tokenAccountAddress;
    private final String tokenAccountToAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SolanaSignInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (Boolean) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.recentBlockhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.feelimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.supportJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tokenAccountToAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.toAddressLegal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAccountAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mintAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.solRent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.computeUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaSignInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Boolean bool2) {
        return new SolanaSignInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, bool, str11, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolanaSignInfo)) {
            return false;
        }
        SolanaSignInfo solanaSignInfo = (SolanaSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.recentBlockhash, (Object) solanaSignInfo.recentBlockhash) && Intrinsics.EZpvd((Object) this.tokenAccountAddress, (Object) solanaSignInfo.tokenAccountAddress) && Intrinsics.EZpvd((Object) this.mintAddress, (Object) solanaSignInfo.mintAddress) && Intrinsics.EZpvd((Object) this.decimal, (Object) solanaSignInfo.decimal) && Intrinsics.EZpvd((Object) this.fee, (Object) solanaSignInfo.fee) && Intrinsics.EZpvd((Object) this.rent, (Object) solanaSignInfo.rent) && Intrinsics.EZpvd((Object) this.solRent, (Object) solanaSignInfo.solRent) && Intrinsics.EZpvd((Object) this.reserveFeeRatio, (Object) solanaSignInfo.reserveFeeRatio) && Intrinsics.EZpvd((Object) this.computeUnitPrice, (Object) solanaSignInfo.computeUnitPrice) && Intrinsics.EZpvd((Object) this.feelimit, (Object) solanaSignInfo.feelimit) && Intrinsics.EZpvd(this.supportJito, solanaSignInfo.supportJito) && Intrinsics.EZpvd((Object) this.tokenAccountToAddress, (Object) solanaSignInfo.tokenAccountToAddress) && Intrinsics.EZpvd(this.toAddressLegal, solanaSignInfo.toAddressLegal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getComputeUnitPrice() {
        return this.computeUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimal() {
        return this.decimal;
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
    public final String getMintAddress() {
        return this.mintAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecentBlockhash() {
        return this.recentBlockhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRent() {
        return this.rent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFeeRatio() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSolRent() {
        return this.solRent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportJito() {
        return this.supportJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getToAddressLegal() {
        return this.toAddressLegal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAccountAddress() {
        return this.tokenAccountAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAccountToAddress() {
        return this.tokenAccountToAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.recentBlockhash;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAccountAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.mintAddress;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.decimal;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.fee;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.rent;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.solRent;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.reserveFeeRatio;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.computeUnitPrice;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.feelimit;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        Boolean bool = this.supportJito;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        String str11 = this.tokenAccountToAddress;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        Boolean bool2 = this.toAddressLegal;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setComputeUnitPrice(String str) {
        this.computeUnitPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SolanaSignInfo(recentBlockhash=" + this.recentBlockhash + ", tokenAccountAddress=" + this.tokenAccountAddress + ", mintAddress=" + this.mintAddress + ", decimal=" + this.decimal + ", fee=" + this.fee + ", rent=" + this.rent + ", solRent=" + this.solRent + ", reserveFeeRatio=" + this.reserveFeeRatio + ", computeUnitPrice=" + this.computeUnitPrice + ", feelimit=" + this.feelimit + ", supportJito=" + this.supportJito + ", tokenAccountToAddress=" + this.tokenAccountToAddress + ", toAddressLegal=" + this.toAddressLegal + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SolanaSignInfo> serializer() {
            return SolanaSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SolanaSignInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.recentBlockhash = null;
        } else {
            this.recentBlockhash = str;
        }
        if ((i & 2) == 0) {
            this.tokenAccountAddress = null;
        } else {
            this.tokenAccountAddress = str2;
        }
        if ((i & 4) == 0) {
            this.mintAddress = null;
        } else {
            this.mintAddress = str3;
        }
        if ((i & 8) == 0) {
            this.decimal = null;
        } else {
            this.decimal = str4;
        }
        if ((i & 16) == 0) {
            this.fee = null;
        } else {
            this.fee = str5;
        }
        if ((i & 32) == 0) {
            this.rent = null;
        } else {
            this.rent = str6;
        }
        if ((i & 64) == 0) {
            this.solRent = null;
        } else {
            this.solRent = str7;
        }
        if ((i & 128) == 0) {
            this.reserveFeeRatio = null;
        } else {
            this.reserveFeeRatio = str8;
        }
        if ((i & 256) == 0) {
            this.computeUnitPrice = null;
        } else {
            this.computeUnitPrice = str9;
        }
        if ((i & 512) == 0) {
            this.feelimit = null;
        } else {
            this.feelimit = str10;
        }
        this.supportJito = (i & 1024) == 0 ? Boolean.FALSE : bool;
        if ((i & 2048) == 0) {
            this.tokenAccountToAddress = null;
        } else {
            this.tokenAccountToAddress = str11;
        }
        if ((i & 4096) == 0) {
            this.toAddressLegal = null;
        } else {
            this.toAddressLegal = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SolanaSignInfo solanaSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || solanaSignInfo.recentBlockhash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, solanaSignInfo.recentBlockhash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || solanaSignInfo.tokenAccountAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, solanaSignInfo.tokenAccountAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || solanaSignInfo.mintAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, solanaSignInfo.mintAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || solanaSignInfo.decimal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, solanaSignInfo.decimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || solanaSignInfo.fee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, solanaSignInfo.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || solanaSignInfo.rent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, solanaSignInfo.rent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || solanaSignInfo.solRent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, solanaSignInfo.solRent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || solanaSignInfo.reserveFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, solanaSignInfo.reserveFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || solanaSignInfo.computeUnitPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, solanaSignInfo.computeUnitPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || solanaSignInfo.feelimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, solanaSignInfo.feelimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(solanaSignInfo.supportJito, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, solanaSignInfo.supportJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || solanaSignInfo.tokenAccountToAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, solanaSignInfo.tokenAccountToAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && solanaSignInfo.toAddressLegal == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, solanaSignInfo.toAddressLegal);
    }

    public SolanaSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Boolean bool2) {
        this.recentBlockhash = str;
        this.tokenAccountAddress = str2;
        this.mintAddress = str3;
        this.decimal = str4;
        this.fee = str5;
        this.rent = str6;
        this.solRent = str7;
        this.reserveFeeRatio = str8;
        this.computeUnitPrice = str9;
        this.feelimit = str10;
        this.supportJito = bool;
        this.tokenAccountToAddress = str11;
        this.toAddressLegal = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0056: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean):void (m)] (LINE:8) call: com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SolanaSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? Boolean.FALSE : bool, (i & 2048) != 0 ? null : str11, (i & 4096) == 0 ? bool2 : null);
    }
}
