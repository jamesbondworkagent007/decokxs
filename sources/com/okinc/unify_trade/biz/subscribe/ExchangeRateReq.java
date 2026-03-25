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
public final class ExchangeRateReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String sourceCcy;
    private final String targetCcy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExchangeRateReq copy$default(ExchangeRateReq exchangeRateReq, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeRateReq.sourceCcy;
        }
        if ((i & 2) != 0) {
            str2 = exchangeRateReq.targetCcy;
        }
        return exchangeRateReq.copy(str, str2);
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
    public final ExchangeRateReq copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ExchangeRateReq(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeRateReq)) {
            return false;
        }
        ExchangeRateReq exchangeRateReq = (ExchangeRateReq) obj;
        return Intrinsics.EZpvd((Object) this.sourceCcy, (Object) exchangeRateReq.sourceCcy) && Intrinsics.EZpvd((Object) this.targetCcy, (Object) exchangeRateReq.targetCcy);
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
        return "ExchangeRateReq(sourceCcy=" + this.sourceCcy + ", targetCcy=" + this.targetCcy + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.ExchangeRateReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeRateReq> serializer() {
            return ExchangeRateReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeRateReq(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ExchangeRateReq$$serializer.INSTANCE.getDescriptor());
        }
        this.sourceCcy = str;
        this.targetCcy = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ExchangeRateReq exchangeRateReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, exchangeRateReq.sourceCcy);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, exchangeRateReq.targetCcy);
    }

    public ExchangeRateReq(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sourceCcy = str;
        this.targetCcy = str2;
    }
}
