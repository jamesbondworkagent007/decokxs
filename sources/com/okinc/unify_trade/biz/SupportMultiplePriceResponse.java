package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SupportMultiplePriceResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String isConfig;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportMultiplePriceResponse() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportMultiplePriceResponse copy$default(SupportMultiplePriceResponse supportMultiplePriceResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportMultiplePriceResponse.isConfig;
        }
        return supportMultiplePriceResponse.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.isConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportMultiplePriceResponse copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SupportMultiplePriceResponse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportMultiplePriceResponse) && Intrinsics.EZpvd((Object) this.isConfig, (Object) ((SupportMultiplePriceResponse) obj).isConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.isConfig.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConfig() {
        return this.isConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportMultiplePriceResponse(isConfig=" + this.isConfig + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SupportMultiplePriceResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportMultiplePriceResponse> serializer() {
            return SupportMultiplePriceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportMultiplePriceResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isConfig = "0";
        } else {
            this.isConfig = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SupportMultiplePriceResponse supportMultiplePriceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) supportMultiplePriceResponse.isConfig, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, supportMultiplePriceResponse.isConfig);
    }

    public SupportMultiplePriceResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConfig = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:1465) call: com.okinc.unify_trade.biz.SupportMultiplePriceResponse.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ SupportMultiplePriceResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str);
    }
}
