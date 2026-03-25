package com.okinc.business.web3pay.lib.features.coinprice.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CoinPrice {
    private final List<TokenCoinTypeNoInfo> priceDTOList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TokenCoinTypeNoInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.coinprice.model.CoinPrice */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinPrice copy$default(CoinPrice coinPrice, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = coinPrice.priceDTOList;
        }
        return coinPrice.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenCoinTypeNoInfo> component1() {
        return this.priceDTOList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinPrice copy(@NotNull List<TokenCoinTypeNoInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new CoinPrice(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoinPrice) && Intrinsics.EZpvd(this.priceDTOList, ((CoinPrice) obj).priceDTOList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenCoinTypeNoInfo> getPriceDTOList() {
        return this.priceDTOList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.priceDTOList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinPrice(priceDTOList=" + this.priceDTOList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.coinprice.model.CoinPrice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinPrice> serializer() {
            return CoinPrice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinPrice(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CoinPrice$$serializer.INSTANCE.getDescriptor());
        }
        this.priceDTOList = list;
    }

    public CoinPrice(@NotNull List<TokenCoinTypeNoInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.priceDTOList = list;
    }
}
