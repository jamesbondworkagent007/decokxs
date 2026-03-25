package com.okinc.business.defi.biz.net.bean;

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
public final class BTCSpeedUpFeeRateResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String ancestorsTxSize;
    private final String currentAvgFeeRate;
    private final String currentTxSize;
    private final String expectedFeeRate;
    private final String increaseFee;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BTCSpeedUpFeeRateResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BTCSpeedUpFeeRateResp copy$default(BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bTCSpeedUpFeeRateResp.currentAvgFeeRate;
        }
        if ((i & 2) != 0) {
            str2 = bTCSpeedUpFeeRateResp.expectedFeeRate;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bTCSpeedUpFeeRateResp.currentTxSize;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = bTCSpeedUpFeeRateResp.ancestorsTxSize;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = bTCSpeedUpFeeRateResp.increaseFee;
        }
        return bTCSpeedUpFeeRateResp.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currentAvgFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.expectedFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currentTxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ancestorsTxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.increaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCSpeedUpFeeRateResp copy(String str, String str2, String str3, String str4, String str5) {
        return new BTCSpeedUpFeeRateResp(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BTCSpeedUpFeeRateResp)) {
            return false;
        }
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = (BTCSpeedUpFeeRateResp) obj;
        return Intrinsics.EZpvd((Object) this.currentAvgFeeRate, (Object) bTCSpeedUpFeeRateResp.currentAvgFeeRate) && Intrinsics.EZpvd((Object) this.expectedFeeRate, (Object) bTCSpeedUpFeeRateResp.expectedFeeRate) && Intrinsics.EZpvd((Object) this.currentTxSize, (Object) bTCSpeedUpFeeRateResp.currentTxSize) && Intrinsics.EZpvd((Object) this.ancestorsTxSize, (Object) bTCSpeedUpFeeRateResp.ancestorsTxSize) && Intrinsics.EZpvd((Object) this.increaseFee, (Object) bTCSpeedUpFeeRateResp.increaseFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAncestorsTxSize() {
        return this.ancestorsTxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentAvgFeeRate() {
        return this.currentAvgFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentTxSize() {
        return this.currentTxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpectedFeeRate() {
        return this.expectedFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIncreaseFee() {
        return this.increaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currentAvgFeeRate;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.expectedFeeRate;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currentTxSize;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.ancestorsTxSize;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.increaseFee;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BTCSpeedUpFeeRateResp(currentAvgFeeRate=" + this.currentAvgFeeRate + ", expectedFeeRate=" + this.expectedFeeRate + ", currentTxSize=" + this.currentTxSize + ", ancestorsTxSize=" + this.ancestorsTxSize + ", increaseFee=" + this.increaseFee + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BTCSpeedUpFeeRateResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BTCSpeedUpFeeRateResp> serializer() {
            return BTCSpeedUpFeeRateResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BTCSpeedUpFeeRateResp(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currentAvgFeeRate = null;
        } else {
            this.currentAvgFeeRate = str;
        }
        if ((i & 2) == 0) {
            this.expectedFeeRate = null;
        } else {
            this.expectedFeeRate = str2;
        }
        if ((i & 4) == 0) {
            this.currentTxSize = null;
        } else {
            this.currentTxSize = str3;
        }
        if ((i & 8) == 0) {
            this.ancestorsTxSize = null;
        } else {
            this.ancestorsTxSize = str4;
        }
        if ((i & 16) == 0) {
            this.increaseFee = null;
        } else {
            this.increaseFee = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bTCSpeedUpFeeRateResp.currentAvgFeeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bTCSpeedUpFeeRateResp.currentAvgFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bTCSpeedUpFeeRateResp.expectedFeeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bTCSpeedUpFeeRateResp.expectedFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bTCSpeedUpFeeRateResp.currentTxSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bTCSpeedUpFeeRateResp.currentTxSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bTCSpeedUpFeeRateResp.ancestorsTxSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bTCSpeedUpFeeRateResp.ancestorsTxSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && bTCSpeedUpFeeRateResp.increaseFee == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bTCSpeedUpFeeRateResp.increaseFee);
    }

    public BTCSpeedUpFeeRateResp(String str, String str2, String str3, String str4, String str5) {
        this.currentAvgFeeRate = str;
        this.expectedFeeRate = str2;
        this.currentTxSize = str3;
        this.ancestorsTxSize = str4;
        this.increaseFee = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:262) call: com.okinc.business.defi.biz.net.bean.BTCSpeedUpFeeRateResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BTCSpeedUpFeeRateResp(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
