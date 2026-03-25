package com.okinc.business.defi.biz.core.transaction.sign.kaspa.bean;

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
public final class KaspaSignInfo {
    private final String max;
    private final String min;
    private final String minOutput;
    private final String normal;
    private String reserveFeeRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KaspaSignInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KaspaSignInfo copy$default(KaspaSignInfo kaspaSignInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kaspaSignInfo.min;
        }
        if ((i & 2) != 0) {
            str2 = kaspaSignInfo.normal;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = kaspaSignInfo.max;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = kaspaSignInfo.minOutput;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = kaspaSignInfo.reserveFeeRatio;
        }
        return kaspaSignInfo.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.min;
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
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KaspaSignInfo copy(String str, String str2, String str3, String str4, String str5) {
        return new KaspaSignInfo(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KaspaSignInfo)) {
            return false;
        }
        KaspaSignInfo kaspaSignInfo = (KaspaSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.min, (Object) kaspaSignInfo.min) && Intrinsics.EZpvd((Object) this.normal, (Object) kaspaSignInfo.normal) && Intrinsics.EZpvd((Object) this.max, (Object) kaspaSignInfo.max) && Intrinsics.EZpvd((Object) this.minOutput, (Object) kaspaSignInfo.minOutput) && Intrinsics.EZpvd((Object) this.reserveFeeRatio, (Object) kaspaSignInfo.reserveFeeRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
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
    public final String getReserveFeeRatio() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.min;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.normal;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.max;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.minOutput;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.reserveFeeRatio;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFeeRatio(String str) {
        this.reserveFeeRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KaspaSignInfo(min=" + this.min + ", normal=" + this.normal + ", max=" + this.max + ", minOutput=" + this.minOutput + ", reserveFeeRatio=" + this.reserveFeeRatio + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.kaspa.bean.KaspaSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KaspaSignInfo> serializer() {
            return KaspaSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KaspaSignInfo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.minOutput = null;
        } else {
            this.minOutput = str4;
        }
        if ((i & 16) == 0) {
            this.reserveFeeRatio = null;
        } else {
            this.reserveFeeRatio = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(KaspaSignInfo kaspaSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || kaspaSignInfo.min != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, kaspaSignInfo.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || kaspaSignInfo.normal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, kaspaSignInfo.normal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || kaspaSignInfo.max != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, kaspaSignInfo.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || kaspaSignInfo.minOutput != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, kaspaSignInfo.minOutput);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && kaspaSignInfo.reserveFeeRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, kaspaSignInfo.reserveFeeRatio);
    }

    public KaspaSignInfo(String str, String str2, String str3, String str4, String str5) {
        this.min = str;
        this.normal = str2;
        this.max = str3;
        this.minOutput = str4;
        this.reserveFeeRatio = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.business.defi.biz.core.transaction.sign.kaspa.bean.KaspaSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KaspaSignInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
