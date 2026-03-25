package com.okinc.business.market.data.model.smart_money;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalMetricsFilterRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String liquidityMax;
    public final String liquidityMin;
    public final String mcapMax;
    public final String mcapMin;
    public final String tradeAddressNumMax;
    public final String tradeAddressNumMin;
    public final String tradeVolumeMax;
    public final String tradeVolumeMin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalMetricsFilterRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMetricsFilterRequest KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new SignalMetricsFilterRequest(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalMetricsFilterRequest)) {
            return false;
        }
        SignalMetricsFilterRequest signalMetricsFilterRequest = (SignalMetricsFilterRequest) obj;
        return Intrinsics.EZpvd((Object) this.tradeAddressNumMin, (Object) signalMetricsFilterRequest.tradeAddressNumMin) && Intrinsics.EZpvd((Object) this.tradeAddressNumMax, (Object) signalMetricsFilterRequest.tradeAddressNumMax) && Intrinsics.EZpvd((Object) this.tradeVolumeMin, (Object) signalMetricsFilterRequest.tradeVolumeMin) && Intrinsics.EZpvd((Object) this.tradeVolumeMax, (Object) signalMetricsFilterRequest.tradeVolumeMax) && Intrinsics.EZpvd((Object) this.mcapMin, (Object) signalMetricsFilterRequest.mcapMin) && Intrinsics.EZpvd((Object) this.mcapMax, (Object) signalMetricsFilterRequest.mcapMax) && Intrinsics.EZpvd((Object) this.liquidityMin, (Object) signalMetricsFilterRequest.liquidityMin) && Intrinsics.EZpvd((Object) this.liquidityMax, (Object) signalMetricsFilterRequest.liquidityMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.tradeAddressNumMin.hashCode() * 31) + this.tradeAddressNumMax.hashCode()) * 31) + this.tradeVolumeMin.hashCode()) * 31) + this.tradeVolumeMax.hashCode()) * 31) + this.mcapMin.hashCode()) * 31) + this.mcapMax.hashCode()) * 31) + this.liquidityMin.hashCode()) * 31) + this.liquidityMax.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalMetricsFilterRequest(tradeAddressNumMin=" + this.tradeAddressNumMin + ", tradeAddressNumMax=" + this.tradeAddressNumMax + ", tradeVolumeMin=" + this.tradeVolumeMin + ", tradeVolumeMax=" + this.tradeVolumeMax + ", mcapMin=" + this.mcapMin + ", mcapMax=" + this.mcapMax + ", liquidityMin=" + this.liquidityMin + ", liquidityMax=" + this.liquidityMax + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalMetricsFilterRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalMetricsFilterRequest> serializer() {
            return SignalMetricsFilterRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalMetricsFilterRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tradeAddressNumMin = "";
        } else {
            this.tradeAddressNumMin = str;
        }
        if ((i & 2) == 0) {
            this.tradeAddressNumMax = "";
        } else {
            this.tradeAddressNumMax = str2;
        }
        if ((i & 4) == 0) {
            this.tradeVolumeMin = "";
        } else {
            this.tradeVolumeMin = str3;
        }
        if ((i & 8) == 0) {
            this.tradeVolumeMax = "";
        } else {
            this.tradeVolumeMax = str4;
        }
        if ((i & 16) == 0) {
            this.mcapMin = "";
        } else {
            this.mcapMin = str5;
        }
        if ((i & 32) == 0) {
            this.mcapMax = "";
        } else {
            this.mcapMax = str6;
        }
        if ((i & 64) == 0) {
            this.liquidityMin = "";
        } else {
            this.liquidityMin = str7;
        }
        if ((i & 128) == 0) {
            this.liquidityMax = "";
        } else {
            this.liquidityMax = str8;
        }
    }

    public static final /* synthetic */ void OLrzqt(SignalMetricsFilterRequest signalMetricsFilterRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) signalMetricsFilterRequest.tradeAddressNumMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, signalMetricsFilterRequest.tradeAddressNumMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signalMetricsFilterRequest.tradeAddressNumMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signalMetricsFilterRequest.tradeAddressNumMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) signalMetricsFilterRequest.tradeVolumeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, signalMetricsFilterRequest.tradeVolumeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) signalMetricsFilterRequest.tradeVolumeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, signalMetricsFilterRequest.tradeVolumeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) signalMetricsFilterRequest.mcapMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, signalMetricsFilterRequest.mcapMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) signalMetricsFilterRequest.mcapMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, signalMetricsFilterRequest.mcapMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) signalMetricsFilterRequest.liquidityMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, signalMetricsFilterRequest.liquidityMin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) signalMetricsFilterRequest.liquidityMax, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, signalMetricsFilterRequest.liquidityMax);
    }

    public SignalMetricsFilterRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.tradeAddressNumMin = str;
        this.tradeAddressNumMax = str2;
        this.tradeVolumeMin = str3;
        this.tradeVolumeMax = str4;
        this.mcapMin = str5;
        this.mcapMax = str6;
        this.liquidityMin = str7;
        this.liquidityMax = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.data.model.smart_money.SignalMetricsFilterRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalMetricsFilterRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}
