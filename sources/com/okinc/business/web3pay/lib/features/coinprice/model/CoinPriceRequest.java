package com.okinc.business.web3pay.lib.features.coinprice.model;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CoinPriceRequest {
    private final Set<String> tokenCoinTypeNos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new LinkedHashSetSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.coinprice.model.CoinPriceRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinPriceRequest copy$default(CoinPriceRequest coinPriceRequest, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = coinPriceRequest.tokenCoinTypeNos;
        }
        return coinPriceRequest.copy(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<String> component1() {
        return this.tokenCoinTypeNos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinPriceRequest copy(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return new CoinPriceRequest(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoinPriceRequest) && Intrinsics.EZpvd(this.tokenCoinTypeNos, ((CoinPriceRequest) obj).tokenCoinTypeNos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<String> getTokenCoinTypeNos() {
        return this.tokenCoinTypeNos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.tokenCoinTypeNos.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinPriceRequest(tokenCoinTypeNos=" + this.tokenCoinTypeNos + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.coinprice.model.CoinPriceRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinPriceRequest> serializer() {
            return CoinPriceRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinPriceRequest(int i, Set set, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CoinPriceRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenCoinTypeNos = set;
    }

    public CoinPriceRequest(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.tokenCoinTypeNos = set;
    }
}
