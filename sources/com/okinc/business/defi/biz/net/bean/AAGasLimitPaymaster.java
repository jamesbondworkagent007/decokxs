package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AAGasLimitPaymaster {
    private String inputData;
    private String paymaster;
    private String paymasterAndData;
    private String paymasterData;
    private String signature;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAGasLimitPaymaster() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAGasLimitPaymaster copy$default(AAGasLimitPaymaster aAGasLimitPaymaster, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aAGasLimitPaymaster.inputData;
        }
        if ((i & 2) != 0) {
            str2 = aAGasLimitPaymaster.paymasterAndData;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = aAGasLimitPaymaster.paymaster;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = aAGasLimitPaymaster.paymasterData;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = aAGasLimitPaymaster.signature;
        }
        return aAGasLimitPaymaster.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.paymasterAndData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAGasLimitPaymaster copy(@NotNull String str, String str2, String str3, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new AAGasLimitPaymaster(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAGasLimitPaymaster)) {
            return false;
        }
        AAGasLimitPaymaster aAGasLimitPaymaster = (AAGasLimitPaymaster) obj;
        return Intrinsics.EZpvd((Object) this.inputData, (Object) aAGasLimitPaymaster.inputData) && Intrinsics.EZpvd((Object) this.paymasterAndData, (Object) aAGasLimitPaymaster.paymasterAndData) && Intrinsics.EZpvd((Object) this.paymaster, (Object) aAGasLimitPaymaster.paymaster) && Intrinsics.EZpvd((Object) this.paymasterData, (Object) aAGasLimitPaymaster.paymasterData) && Intrinsics.EZpvd((Object) this.signature, (Object) aAGasLimitPaymaster.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymaster() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterAndData() {
        return this.paymasterAndData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterData() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.inputData.hashCode();
        String str = this.paymasterAndData;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.paymaster;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.paymasterData;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inputData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymaster(String str) {
        this.paymaster = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterAndData(String str) {
        this.paymasterAndData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterData(String str) {
        this.paymasterData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAGasLimitPaymaster(inputData=" + this.inputData + ", paymasterAndData=" + this.paymasterAndData + ", paymaster=" + this.paymaster + ", paymasterData=" + this.paymasterData + ", signature=" + this.signature + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AAGasLimitPaymaster.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAGasLimitPaymaster> serializer() {
            return AAGasLimitPaymaster$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAGasLimitPaymaster(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.inputData = "";
        } else {
            this.inputData = str;
        }
        if ((i & 2) == 0) {
            this.paymasterAndData = null;
        } else {
            this.paymasterAndData = str2;
        }
        if ((i & 4) == 0) {
            this.paymaster = null;
        } else {
            this.paymaster = str3;
        }
        if ((i & 8) == 0) {
            this.paymasterData = null;
        } else {
            this.paymasterData = str4;
        }
        if ((i & 16) == 0) {
            this.signature = "";
        } else {
            this.signature = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AAGasLimitPaymaster aAGasLimitPaymaster, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aAGasLimitPaymaster.inputData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, aAGasLimitPaymaster.inputData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aAGasLimitPaymaster.paymasterAndData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, aAGasLimitPaymaster.paymasterAndData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || aAGasLimitPaymaster.paymaster != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, aAGasLimitPaymaster.paymaster);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || aAGasLimitPaymaster.paymasterData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, aAGasLimitPaymaster.paymasterData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) aAGasLimitPaymaster.signature, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, aAGasLimitPaymaster.signature);
    }

    public AAGasLimitPaymaster(@NotNull String str, String str2, String str3, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.inputData = str;
        this.paymasterAndData = str2;
        this.paymaster = str3;
        this.paymasterData = str4;
        this.signature = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1342) call: com.okinc.business.defi.biz.net.bean.AAGasLimitPaymaster.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AAGasLimitPaymaster(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? "" : str5);
    }
}
