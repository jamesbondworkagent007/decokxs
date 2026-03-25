package com.okinc.business.defi.biz.core.transaction.sign.utxo.bean;

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
public final class UTXOSignInfo {
    private final String dummyOutput;
    private final String inscriptionOutput;
    private String max;
    private String maxCost;
    private String mempoolMin;
    private String min;
    private String minCost;
    private final String minOutput;
    private String normal;
    private String normalCost;
    private String reserveFeeRatio;
    private String transferReminder;
    private final String txSizeLimit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXOSignInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.txSizeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.mempoolMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.transferReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.normalCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.inscriptionOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.dummyOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOSignInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        return new UTXOSignInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UTXOSignInfo)) {
            return false;
        }
        UTXOSignInfo uTXOSignInfo = (UTXOSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.min, (Object) uTXOSignInfo.min) && Intrinsics.EZpvd((Object) this.normal, (Object) uTXOSignInfo.normal) && Intrinsics.EZpvd((Object) this.max, (Object) uTXOSignInfo.max) && Intrinsics.EZpvd((Object) this.minCost, (Object) uTXOSignInfo.minCost) && Intrinsics.EZpvd((Object) this.normalCost, (Object) uTXOSignInfo.normalCost) && Intrinsics.EZpvd((Object) this.maxCost, (Object) uTXOSignInfo.maxCost) && Intrinsics.EZpvd((Object) this.minOutput, (Object) uTXOSignInfo.minOutput) && Intrinsics.EZpvd((Object) this.inscriptionOutput, (Object) uTXOSignInfo.inscriptionOutput) && Intrinsics.EZpvd((Object) this.dummyOutput, (Object) uTXOSignInfo.dummyOutput) && Intrinsics.EZpvd((Object) this.reserveFeeRatio, (Object) uTXOSignInfo.reserveFeeRatio) && Intrinsics.EZpvd((Object) this.txSizeLimit, (Object) uTXOSignInfo.txSizeLimit) && Intrinsics.EZpvd((Object) this.mempoolMin, (Object) uTXOSignInfo.mempoolMin) && Intrinsics.EZpvd((Object) this.transferReminder, (Object) uTXOSignInfo.transferReminder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDummyOutput() {
        return this.dummyOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInscriptionOutput() {
        return this.inscriptionOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCost() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMempoolMin() {
        return this.mempoolMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinCost() {
        return this.minCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinOutput() {
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormal() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormalCost() {
        return this.normalCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFeeRatio() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferReminder() {
        return this.transferReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxSizeLimit() {
        return this.txSizeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.min;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.normal;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.max;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.minCost;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.normalCost;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.maxCost;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.minOutput;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.inscriptionOutput;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.dummyOutput;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.reserveFeeRatio;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.txSizeLimit;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.mempoolMin;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.transferReminder;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str13 != null ? str13.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMax(String str) {
        this.max = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCost(String str) {
        this.maxCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMempoolMin(String str) {
        this.mempoolMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMin(String str) {
        this.min = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinCost(String str) {
        this.minCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNormal(String str) {
        this.normal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNormalCost(String str) {
        this.normalCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFeeRatio(String str) {
        this.reserveFeeRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferReminder(String str) {
        this.transferReminder = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXOSignInfo(min=" + this.min + ", normal=" + this.normal + ", max=" + this.max + ", minCost=" + this.minCost + ", normalCost=" + this.normalCost + ", maxCost=" + this.maxCost + ", minOutput=" + this.minOutput + ", inscriptionOutput=" + this.inscriptionOutput + ", dummyOutput=" + this.dummyOutput + ", reserveFeeRatio=" + this.reserveFeeRatio + ", txSizeLimit=" + this.txSizeLimit + ", mempoolMin=" + this.mempoolMin + ", transferReminder=" + this.transferReminder + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UTXOSignInfo> serializer() {
            return UTXOSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UTXOSignInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.min = null;
        } else {
            this.min = str;
        }
        if ((i & 2) == 0) {
            this.normal = null;
        } else {
            this.normal = str2;
        }
        if ((i & 4) == 0) {
            this.max = null;
        } else {
            this.max = str3;
        }
        if ((i & 8) == 0) {
            this.minCost = null;
        } else {
            this.minCost = str4;
        }
        if ((i & 16) == 0) {
            this.normalCost = null;
        } else {
            this.normalCost = str5;
        }
        if ((i & 32) == 0) {
            this.maxCost = null;
        } else {
            this.maxCost = str6;
        }
        if ((i & 64) == 0) {
            this.minOutput = null;
        } else {
            this.minOutput = str7;
        }
        if ((i & 128) == 0) {
            this.inscriptionOutput = null;
        } else {
            this.inscriptionOutput = str8;
        }
        if ((i & 256) == 0) {
            this.dummyOutput = null;
        } else {
            this.dummyOutput = str9;
        }
        if ((i & 512) == 0) {
            this.reserveFeeRatio = null;
        } else {
            this.reserveFeeRatio = str10;
        }
        if ((i & 1024) == 0) {
            this.txSizeLimit = null;
        } else {
            this.txSizeLimit = str11;
        }
        if ((i & 2048) == 0) {
            this.mempoolMin = null;
        } else {
            this.mempoolMin = str12;
        }
        if ((i & 4096) == 0) {
            this.transferReminder = null;
        } else {
            this.transferReminder = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UTXOSignInfo uTXOSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uTXOSignInfo.min != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, uTXOSignInfo.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uTXOSignInfo.normal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, uTXOSignInfo.normal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || uTXOSignInfo.max != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, uTXOSignInfo.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || uTXOSignInfo.minCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, uTXOSignInfo.minCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || uTXOSignInfo.normalCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, uTXOSignInfo.normalCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || uTXOSignInfo.maxCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, uTXOSignInfo.maxCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || uTXOSignInfo.minOutput != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, uTXOSignInfo.minOutput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || uTXOSignInfo.inscriptionOutput != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, uTXOSignInfo.inscriptionOutput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || uTXOSignInfo.dummyOutput != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, uTXOSignInfo.dummyOutput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || uTXOSignInfo.reserveFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, uTXOSignInfo.reserveFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || uTXOSignInfo.txSizeLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, uTXOSignInfo.txSizeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || uTXOSignInfo.mempoolMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, uTXOSignInfo.mempoolMin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && uTXOSignInfo.transferReminder == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, uTXOSignInfo.transferReminder);
    }

    public UTXOSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.min = str;
        this.normal = str2;
        this.max = str3;
        this.minCost = str4;
        this.normalCost = str5;
        this.maxCost = str6;
        this.minOutput = str7;
        this.inscriptionOutput = str8;
        this.dummyOutput = str9;
        this.reserveFeeRatio = str10;
        this.txSizeLimit = str11;
        this.mempoolMin = str12;
        this.transferReminder = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
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
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UTXOSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null);
    }
}
