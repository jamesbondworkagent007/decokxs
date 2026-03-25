package com.okinc.business.web3pay.lib.features.gas.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class GetUpdateAccountGasRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainIndex;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetUpdateAccountGasRequest copy$default(GetUpdateAccountGasRequest getUpdateAccountGasRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUpdateAccountGasRequest.chainIndex;
        }
        return getUpdateAccountGasRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetUpdateAccountGasRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GetUpdateAccountGasRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetUpdateAccountGasRequest) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) ((GetUpdateAccountGasRequest) obj).chainIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.chainIndex.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetUpdateAccountGasRequest(chainIndex=" + this.chainIndex + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.GetUpdateAccountGasRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetUpdateAccountGasRequest> serializer() {
            return GetUpdateAccountGasRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetUpdateAccountGasRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GetUpdateAccountGasRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
    }

    public GetUpdateAccountGasRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainIndex = str;
    }
}
