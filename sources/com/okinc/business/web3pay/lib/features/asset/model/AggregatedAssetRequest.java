package com.okinc.business.web3pay.lib.features.asset.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AggregatedAssetRequest {
    private final List<String> tokenCoinTypeNos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.asset.model.AggregatedAssetRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AggregatedAssetRequest copy$default(AggregatedAssetRequest aggregatedAssetRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aggregatedAssetRequest.tokenCoinTypeNos;
        }
        return aggregatedAssetRequest.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.tokenCoinTypeNos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AggregatedAssetRequest copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AggregatedAssetRequest(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AggregatedAssetRequest) && Intrinsics.EZpvd(this.tokenCoinTypeNos, ((AggregatedAssetRequest) obj).tokenCoinTypeNos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTokenCoinTypeNos() {
        return this.tokenCoinTypeNos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.tokenCoinTypeNos.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AggregatedAssetRequest(tokenCoinTypeNos=" + this.tokenCoinTypeNos + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.AggregatedAssetRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AggregatedAssetRequest> serializer() {
            return AggregatedAssetRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AggregatedAssetRequest(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AggregatedAssetRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenCoinTypeNos = list;
    }

    public AggregatedAssetRequest(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.tokenCoinTypeNos = list;
    }
}
