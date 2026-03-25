package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

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
public final class GetChainsActivationInfoResp {
    private final List<ChainActivationInfo> chainActivationInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ChainActivationInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.onchaintransaction.model.GetChainsActivationInfoResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetChainsActivationInfoResp copy$default(GetChainsActivationInfoResp getChainsActivationInfoResp, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getChainsActivationInfoResp.chainActivationInfoList;
        }
        return getChainsActivationInfoResp.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainActivationInfo> component1() {
        return this.chainActivationInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetChainsActivationInfoResp copy(@NotNull List<ChainActivationInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new GetChainsActivationInfoResp(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetChainsActivationInfoResp) && Intrinsics.EZpvd(this.chainActivationInfoList, ((GetChainsActivationInfoResp) obj).chainActivationInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainActivationInfo> getChainActivationInfoList() {
        return this.chainActivationInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.chainActivationInfoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetChainsActivationInfoResp(chainActivationInfoList=" + this.chainActivationInfoList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.GetChainsActivationInfoResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetChainsActivationInfoResp> serializer() {
            return GetChainsActivationInfoResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetChainsActivationInfoResp(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GetChainsActivationInfoResp$$serializer.INSTANCE.getDescriptor());
        }
        this.chainActivationInfoList = list;
    }

    public GetChainsActivationInfoResp(@NotNull List<ChainActivationInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainActivationInfoList = list;
    }
}
