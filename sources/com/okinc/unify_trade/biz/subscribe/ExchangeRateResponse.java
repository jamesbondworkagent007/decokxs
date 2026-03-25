package com.okinc.unify_trade.biz.subscribe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ExchangeRateResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int precision;
    private final String sourceCcyToThisRate;
    private final String targetCcy;
    private final String targetSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExchangeRateResponse copy$default(ExchangeRateResponse exchangeRateResponse, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = exchangeRateResponse.targetSymbol;
        }
        if ((i2 & 2) != 0) {
            str2 = exchangeRateResponse.targetCcy;
        }
        if ((i2 & 4) != 0) {
            i = exchangeRateResponse.precision;
        }
        if ((i2 & 8) != 0) {
            str3 = exchangeRateResponse.sourceCcyToThisRate;
        }
        return exchangeRateResponse.copy(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.targetSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.targetCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sourceCcyToThisRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeRateResponse copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ExchangeRateResponse(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeRateResponse)) {
            return false;
        }
        ExchangeRateResponse exchangeRateResponse = (ExchangeRateResponse) obj;
        return Intrinsics.EZpvd((Object) this.targetSymbol, (Object) exchangeRateResponse.targetSymbol) && Intrinsics.EZpvd((Object) this.targetCcy, (Object) exchangeRateResponse.targetCcy) && this.precision == exchangeRateResponse.precision && Intrinsics.EZpvd((Object) this.sourceCcyToThisRate, (Object) exchangeRateResponse.sourceCcyToThisRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCcyToThisRate() {
        return this.sourceCcyToThisRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetCcy() {
        return this.targetCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetSymbol() {
        return this.targetSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.targetSymbol.hashCode() * 31) + this.targetCcy.hashCode()) * 31) + Integer.hashCode(this.precision)) * 31) + this.sourceCcyToThisRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeRateResponse(targetSymbol=" + this.targetSymbol + ", targetCcy=" + this.targetCcy + ", precision=" + this.precision + ", sourceCcyToThisRate=" + this.sourceCcyToThisRate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.ExchangeRateResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeRateResponse> serializer() {
            return ExchangeRateResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeRateResponse(int i, String str, String str2, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ExchangeRateResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.targetSymbol = str;
        this.targetCcy = str2;
        this.precision = i2;
        this.sourceCcyToThisRate = str3;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ExchangeRateResponse exchangeRateResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, exchangeRateResponse.targetSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, exchangeRateResponse.targetCcy);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, exchangeRateResponse.precision);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, exchangeRateResponse.sourceCcyToThisRate);
    }

    public ExchangeRateResponse(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.targetSymbol = str;
        this.targetCcy = str2;
        this.precision = i;
        this.sourceCcyToThisRate = str3;
    }
}
