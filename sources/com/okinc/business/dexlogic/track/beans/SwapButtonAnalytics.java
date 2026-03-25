package com.okinc.business.dexlogic.track.beans;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SwapButtonAnalytics {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String balanceBracket;
    private final String bridgeSelection;
    private final String fromAmountUsdt;
    private final String fromTokenAddress;
    private final String fromTokenAmount;
    private final String liquiditySource;
    private final Slippage slippage;
    private final String swapType;
    private final String toAmountUsdt;
    private final String toTokenAddress;
    private final String toTokenAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.liquiditySource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.bridgeSelection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromAmountUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toAmountUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.swapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.balanceBracket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Slippage component9() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapButtonAnalytics copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull Slippage slippage, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(slippage, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new SwapButtonAnalytics(str, str2, str3, str4, str5, str6, str7, str8, slippage, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwapButtonAnalytics)) {
            return false;
        }
        SwapButtonAnalytics swapButtonAnalytics = (SwapButtonAnalytics) obj;
        return Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) swapButtonAnalytics.fromTokenAddress) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) swapButtonAnalytics.fromTokenAmount) && Intrinsics.EZpvd((Object) this.fromAmountUsdt, (Object) swapButtonAnalytics.fromAmountUsdt) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) swapButtonAnalytics.toTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) swapButtonAnalytics.toTokenAmount) && Intrinsics.EZpvd((Object) this.toAmountUsdt, (Object) swapButtonAnalytics.toAmountUsdt) && Intrinsics.EZpvd((Object) this.swapType, (Object) swapButtonAnalytics.swapType) && Intrinsics.EZpvd((Object) this.balanceBracket, (Object) swapButtonAnalytics.balanceBracket) && Intrinsics.EZpvd(this.slippage, swapButtonAnalytics.slippage) && Intrinsics.EZpvd((Object) this.liquiditySource, (Object) swapButtonAnalytics.liquiditySource) && Intrinsics.EZpvd((Object) this.bridgeSelection, (Object) swapButtonAnalytics.bridgeSelection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceBracket() {
        return this.balanceBracket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeSelection() {
        return this.bridgeSelection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmountUsdt() {
        return this.fromAmountUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAmount() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquiditySource() {
        return this.liquiditySource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Slippage getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapType() {
        return this.swapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmountUsdt() {
        return this.toAmountUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAmount() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.fromTokenAddress.hashCode() * 31) + this.fromTokenAmount.hashCode()) * 31) + this.fromAmountUsdt.hashCode()) * 31) + this.toTokenAddress.hashCode()) * 31) + this.toTokenAmount.hashCode()) * 31) + this.toAmountUsdt.hashCode()) * 31) + this.swapType.hashCode()) * 31) + this.balanceBracket.hashCode()) * 31) + this.slippage.hashCode()) * 31) + this.liquiditySource.hashCode()) * 31) + this.bridgeSelection.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwapButtonAnalytics(fromTokenAddress=" + this.fromTokenAddress + ", fromTokenAmount=" + this.fromTokenAmount + ", fromAmountUsdt=" + this.fromAmountUsdt + ", toTokenAddress=" + this.toTokenAddress + ", toTokenAmount=" + this.toTokenAmount + ", toAmountUsdt=" + this.toAmountUsdt + ", swapType=" + this.swapType + ", balanceBracket=" + this.balanceBracket + ", slippage=" + this.slippage + ", liquiditySource=" + this.liquiditySource + ", bridgeSelection=" + this.bridgeSelection + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.track.beans.SwapButtonAnalytics.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SwapButtonAnalytics> serializer() {
            return SwapButtonAnalytics$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SwapButtonAnalytics(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Slippage slippage, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (256 != (i & 256)) {
            PluginExceptionsKt.throwMissingFieldException(i, 256, SwapButtonAnalytics$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str;
        }
        if ((i & 2) == 0) {
            this.fromTokenAmount = "";
        } else {
            this.fromTokenAmount = str2;
        }
        if ((i & 4) == 0) {
            this.fromAmountUsdt = "";
        } else {
            this.fromAmountUsdt = str3;
        }
        if ((i & 8) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str4;
        }
        if ((i & 16) == 0) {
            this.toTokenAmount = "";
        } else {
            this.toTokenAmount = str5;
        }
        if ((i & 32) == 0) {
            this.toAmountUsdt = "";
        } else {
            this.toAmountUsdt = str6;
        }
        if ((i & 64) == 0) {
            this.swapType = "";
        } else {
            this.swapType = str7;
        }
        if ((i & 128) == 0) {
            this.balanceBracket = "";
        } else {
            this.balanceBracket = str8;
        }
        this.slippage = slippage;
        if ((i & 512) == 0) {
            this.liquiditySource = "";
        } else {
            this.liquiditySource = str9;
        }
        if ((i & 1024) == 0) {
            this.bridgeSelection = "";
        } else {
            this.bridgeSelection = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SwapButtonAnalytics swapButtonAnalytics, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) swapButtonAnalytics.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, swapButtonAnalytics.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) swapButtonAnalytics.fromTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, swapButtonAnalytics.fromTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) swapButtonAnalytics.fromAmountUsdt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, swapButtonAnalytics.fromAmountUsdt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) swapButtonAnalytics.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, swapButtonAnalytics.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) swapButtonAnalytics.toTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, swapButtonAnalytics.toTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) swapButtonAnalytics.toAmountUsdt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, swapButtonAnalytics.toAmountUsdt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) swapButtonAnalytics.swapType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, swapButtonAnalytics.swapType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) swapButtonAnalytics.balanceBracket, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, swapButtonAnalytics.balanceBracket);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, Slippage$$serializer.INSTANCE, swapButtonAnalytics.slippage);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) swapButtonAnalytics.liquiditySource, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, swapButtonAnalytics.liquiditySource);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) swapButtonAnalytics.bridgeSelection, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, swapButtonAnalytics.bridgeSelection);
    }

    public SwapButtonAnalytics(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull Slippage slippage, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(slippage, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.fromTokenAddress = str;
        this.fromTokenAmount = str2;
        this.fromAmountUsdt = str3;
        this.toTokenAddress = str4;
        this.toTokenAmount = str5;
        this.toAmountUsdt = str6;
        this.swapType = str7;
        this.balanceBracket = str8;
        this.slippage = slippage;
        this.liquiditySource = str9;
        this.bridgeSelection = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (r24v0 com.okinc.business.dexlogic.track.beans.Slippage)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.track.beans.Slippage, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.dexlogic.track.beans.SwapButtonAnalytics.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.track.beans.Slippage, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SwapButtonAnalytics(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Slippage slippage, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, slippage, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10);
    }
}
