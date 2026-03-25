package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class CurrencyExchangeResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int precision;
    private final String sourceCcyToThisRate;
    private final String targetCcy;
    private final String targetSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurrencyExchangeResponse copy$default(CurrencyExchangeResponse currencyExchangeResponse, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = currencyExchangeResponse.targetSymbol;
        }
        if ((i2 & 2) != 0) {
            str2 = currencyExchangeResponse.targetCcy;
        }
        if ((i2 & 4) != 0) {
            i = currencyExchangeResponse.precision;
        }
        if ((i2 & 8) != 0) {
            str3 = currencyExchangeResponse.sourceCcyToThisRate;
        }
        return currencyExchangeResponse.copy(str, str2, i, str3);
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
    public final CurrencyExchangeResponse copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CurrencyExchangeResponse(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyExchangeResponse)) {
            return false;
        }
        CurrencyExchangeResponse currencyExchangeResponse = (CurrencyExchangeResponse) obj;
        return Intrinsics.EZpvd((Object) this.targetSymbol, (Object) currencyExchangeResponse.targetSymbol) && Intrinsics.EZpvd((Object) this.targetCcy, (Object) currencyExchangeResponse.targetCcy) && this.precision == currencyExchangeResponse.precision && Intrinsics.EZpvd((Object) this.sourceCcyToThisRate, (Object) currencyExchangeResponse.sourceCcyToThisRate);
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
        return "CurrencyExchangeResponse(targetSymbol=" + this.targetSymbol + ", targetCcy=" + this.targetCcy + ", precision=" + this.precision + ", sourceCcyToThisRate=" + this.sourceCcyToThisRate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.CurrencyExchangeResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CurrencyExchangeResponse> serializer() {
            return CurrencyExchangeResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CurrencyExchangeResponse(int i, String str, String str2, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CurrencyExchangeResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.targetSymbol = str;
        this.targetCcy = str2;
        this.precision = i2;
        this.sourceCcyToThisRate = str3;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(CurrencyExchangeResponse currencyExchangeResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, currencyExchangeResponse.targetSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, currencyExchangeResponse.targetCcy);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, currencyExchangeResponse.precision);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, currencyExchangeResponse.sourceCcyToThisRate);
    }

    public CurrencyExchangeResponse(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.targetSymbol = str;
        this.targetCcy = str2;
        this.precision = i;
        this.sourceCcyToThisRate = str3;
    }
}
