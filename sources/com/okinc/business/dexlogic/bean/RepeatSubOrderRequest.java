package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class RepeatSubOrderRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amount;
    private final String chainId;
    private final String fromSwapFeeUsd;
    private final String fromTokenAddress;
    private final String toTokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RepeatSubOrderRequest copy$default(RepeatSubOrderRequest repeatSubOrderRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repeatSubOrderRequest.chainId;
        }
        if ((i & 2) != 0) {
            str2 = repeatSubOrderRequest.fromTokenAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = repeatSubOrderRequest.amount;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = repeatSubOrderRequest.toTokenAddress;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = repeatSubOrderRequest.fromSwapFeeUsd;
        }
        return repeatSubOrderRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromSwapFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RepeatSubOrderRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new RepeatSubOrderRequest(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepeatSubOrderRequest)) {
            return false;
        }
        RepeatSubOrderRequest repeatSubOrderRequest = (RepeatSubOrderRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) repeatSubOrderRequest.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) repeatSubOrderRequest.fromTokenAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) repeatSubOrderRequest.amount) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) repeatSubOrderRequest.toTokenAddress) && Intrinsics.EZpvd((Object) this.fromSwapFeeUsd, (Object) repeatSubOrderRequest.fromSwapFeeUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromSwapFeeUsd() {
        return this.fromSwapFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.chainId.hashCode() * 31) + this.fromTokenAddress.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.toTokenAddress.hashCode()) * 31) + this.fromSwapFeeUsd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RepeatSubOrderRequest(chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", amount=" + this.amount + ", toTokenAddress=" + this.toTokenAddress + ", fromSwapFeeUsd=" + this.fromSwapFeeUsd + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.RepeatSubOrderRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RepeatSubOrderRequest> serializer() {
            return RepeatSubOrderRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepeatSubOrderRequest(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, RepeatSubOrderRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.fromTokenAddress = str2;
        this.amount = str3;
        this.toTokenAddress = str4;
        if ((i & 16) == 0) {
            this.fromSwapFeeUsd = "";
        } else {
            this.fromSwapFeeUsd = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(RepeatSubOrderRequest repeatSubOrderRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, repeatSubOrderRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, repeatSubOrderRequest.fromTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, repeatSubOrderRequest.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, repeatSubOrderRequest.toTokenAddress);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) repeatSubOrderRequest.fromSwapFeeUsd, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, repeatSubOrderRequest.fromSwapFeeUsd);
    }

    public RepeatSubOrderRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = str;
        this.fromTokenAddress = str2;
        this.amount = str3;
        this.toTokenAddress = str4;
        this.fromSwapFeeUsd = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2119) call: com.okinc.business.dexlogic.bean.RepeatSubOrderRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RepeatSubOrderRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? "" : str5);
    }
}
