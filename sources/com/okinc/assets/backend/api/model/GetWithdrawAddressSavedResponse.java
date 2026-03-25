package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class GetWithdrawAddressSavedResponse {
    private Boolean saved;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetWithdrawAddressSavedResponse copy$default(GetWithdrawAddressSavedResponse getWithdrawAddressSavedResponse, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = getWithdrawAddressSavedResponse.saved;
        }
        return getWithdrawAddressSavedResponse.copy(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.saved;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetWithdrawAddressSavedResponse copy(Boolean bool) {
        return new GetWithdrawAddressSavedResponse(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetWithdrawAddressSavedResponse) && Intrinsics.EZpvd(this.saved, ((GetWithdrawAddressSavedResponse) obj).saved);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSaved() {
        return this.saved;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.saved;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSaved(Boolean bool) {
        this.saved = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetWithdrawAddressSavedResponse(saved=" + this.saved + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.GetWithdrawAddressSavedResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetWithdrawAddressSavedResponse> serializer() {
            return GetWithdrawAddressSavedResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetWithdrawAddressSavedResponse(int i, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GetWithdrawAddressSavedResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.saved = bool;
    }

    public GetWithdrawAddressSavedResponse(Boolean bool) {
        this.saved = bool;
    }
}
