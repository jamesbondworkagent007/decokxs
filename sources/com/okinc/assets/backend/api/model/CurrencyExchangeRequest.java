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
public final class CurrencyExchangeRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String sourceCcy;
    private final String targetCcy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurrencyExchangeRequest copy$default(CurrencyExchangeRequest currencyExchangeRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyExchangeRequest.sourceCcy;
        }
        if ((i & 2) != 0) {
            str2 = currencyExchangeRequest.targetCcy;
        }
        return currencyExchangeRequest.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.targetCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyExchangeRequest copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CurrencyExchangeRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyExchangeRequest)) {
            return false;
        }
        CurrencyExchangeRequest currencyExchangeRequest = (CurrencyExchangeRequest) obj;
        return Intrinsics.EZpvd((Object) this.sourceCcy, (Object) currencyExchangeRequest.sourceCcy) && Intrinsics.EZpvd((Object) this.targetCcy, (Object) currencyExchangeRequest.targetCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCcy() {
        return this.sourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetCcy() {
        return this.targetCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.sourceCcy.hashCode() * 31) + this.targetCcy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencyExchangeRequest(sourceCcy=" + this.sourceCcy + ", targetCcy=" + this.targetCcy + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.CurrencyExchangeRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CurrencyExchangeRequest> serializer() {
            return CurrencyExchangeRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CurrencyExchangeRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CurrencyExchangeRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sourceCcy = str;
        this.targetCcy = str2;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(CurrencyExchangeRequest currencyExchangeRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, currencyExchangeRequest.sourceCcy);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, currencyExchangeRequest.targetCcy);
    }

    public CurrencyExchangeRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sourceCcy = str;
        this.targetCcy = str2;
    }
}
