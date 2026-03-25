package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CrossChainBridgeRulesRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final float amount;
    private final int bridgeId;
    private final String fromChainId;
    private final float fromSwapFeeUsd;
    private final String fromTokenAddress;
    private final String receiveWalletAddress;
    private final String toChainId;
    private final String toTokenAddress;
    private final String userWalletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CrossChainBridgeRulesRequest() {
        this((String) null, 0.0f, 0, (String) null, 0.0f, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component5() {
        return this.fromSwapFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CrossChainBridgeRulesRequest copy(@NotNull String str, float f, int i, @NotNull String str2, float f2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new CrossChainBridgeRulesRequest(str, f, i, str2, f2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossChainBridgeRulesRequest)) {
            return false;
        }
        CrossChainBridgeRulesRequest crossChainBridgeRulesRequest = (CrossChainBridgeRulesRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) crossChainBridgeRulesRequest.accountId) && Float.compare(this.amount, crossChainBridgeRulesRequest.amount) == 0 && this.bridgeId == crossChainBridgeRulesRequest.bridgeId && Intrinsics.EZpvd((Object) this.fromChainId, (Object) crossChainBridgeRulesRequest.fromChainId) && Float.compare(this.fromSwapFeeUsd, crossChainBridgeRulesRequest.fromSwapFeeUsd) == 0 && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) crossChainBridgeRulesRequest.fromTokenAddress) && Intrinsics.EZpvd((Object) this.receiveWalletAddress, (Object) crossChainBridgeRulesRequest.receiveWalletAddress) && Intrinsics.EZpvd((Object) this.toChainId, (Object) crossChainBridgeRulesRequest.toChainId) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) crossChainBridgeRulesRequest.toTokenAddress) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) crossChainBridgeRulesRequest.userWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainId() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getFromSwapFeeUsd() {
        return this.fromSwapFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveWalletAddress() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.accountId.hashCode() * 31) + Float.hashCode(this.amount)) * 31) + Integer.hashCode(this.bridgeId)) * 31) + this.fromChainId.hashCode()) * 31) + Float.hashCode(this.fromSwapFeeUsd)) * 31) + this.fromTokenAddress.hashCode()) * 31) + this.receiveWalletAddress.hashCode()) * 31) + this.toChainId.hashCode()) * 31) + this.toTokenAddress.hashCode()) * 31) + this.userWalletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CrossChainBridgeRulesRequest(accountId=" + this.accountId + ", amount=" + this.amount + ", bridgeId=" + this.bridgeId + ", fromChainId=" + this.fromChainId + ", fromSwapFeeUsd=" + this.fromSwapFeeUsd + ", fromTokenAddress=" + this.fromTokenAddress + ", receiveWalletAddress=" + this.receiveWalletAddress + ", toChainId=" + this.toChainId + ", toTokenAddress=" + this.toTokenAddress + ", userWalletAddress=" + this.userWalletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.CrossChainBridgeRulesRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CrossChainBridgeRulesRequest> serializer() {
            return CrossChainBridgeRulesRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CrossChainBridgeRulesRequest(int i, String str, float f, int i2, String str2, float f2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.amount = 0.0f;
        } else {
            this.amount = f;
        }
        if ((i & 4) == 0) {
            this.bridgeId = 0;
        } else {
            this.bridgeId = i2;
        }
        if ((i & 8) == 0) {
            this.fromChainId = "";
        } else {
            this.fromChainId = str2;
        }
        if ((i & 16) == 0) {
            this.fromSwapFeeUsd = 0.0f;
        } else {
            this.fromSwapFeeUsd = f2;
        }
        if ((i & 32) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str3;
        }
        if ((i & 64) == 0) {
            this.receiveWalletAddress = "";
        } else {
            this.receiveWalletAddress = str4;
        }
        if ((i & 128) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str5;
        }
        if ((i & 256) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str6;
        }
        if ((i & 512) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CrossChainBridgeRulesRequest crossChainBridgeRulesRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) crossChainBridgeRulesRequest.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, crossChainBridgeRulesRequest.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || Float.compare(crossChainBridgeRulesRequest.amount, 0.0f) != 0) {
            compositeEncoder.encodeFloatElement(serialDescriptor, 1, crossChainBridgeRulesRequest.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || crossChainBridgeRulesRequest.bridgeId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, crossChainBridgeRulesRequest.bridgeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) crossChainBridgeRulesRequest.fromChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, crossChainBridgeRulesRequest.fromChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || Float.compare(crossChainBridgeRulesRequest.fromSwapFeeUsd, 0.0f) != 0) {
            compositeEncoder.encodeFloatElement(serialDescriptor, 4, crossChainBridgeRulesRequest.fromSwapFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) crossChainBridgeRulesRequest.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, crossChainBridgeRulesRequest.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) crossChainBridgeRulesRequest.receiveWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, crossChainBridgeRulesRequest.receiveWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) crossChainBridgeRulesRequest.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, crossChainBridgeRulesRequest.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) crossChainBridgeRulesRequest.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, crossChainBridgeRulesRequest.toTokenAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) crossChainBridgeRulesRequest.userWalletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, crossChainBridgeRulesRequest.userWalletAddress);
    }

    public CrossChainBridgeRulesRequest(@NotNull String str, float f, int i, @NotNull String str2, float f2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.accountId = str;
        this.amount = f;
        this.bridgeId = i;
        this.fromChainId = str2;
        this.fromSwapFeeUsd = f2;
        this.fromTokenAddress = str3;
        this.receiveWalletAddress = str4;
        this.toChainId = str5;
        this.toTokenAddress = str6;
        this.userWalletAddress = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r13v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r16v0 float) : (0.0f float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, float, int, java.lang.String, float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1977) call: com.okinc.business.dexlogic.bean.CrossChainBridgeRulesRequest.<init>(java.lang.String, float, int, java.lang.String, float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CrossChainBridgeRulesRequest(String str, float f, int i, String str2, float f2, String str3, String str4, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str2, (i2 & 16) == 0 ? f2 : 0.0f, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) == 0 ? str7 : "");
    }
}
