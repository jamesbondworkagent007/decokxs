package com.okinc.business.web3pay.lib.features.account.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreateMfaSessionRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int businessType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateMfaSessionRequest copy$default(CreateMfaSessionRequest createMfaSessionRequest, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createMfaSessionRequest.businessType;
        }
        return createMfaSessionRequest.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateMfaSessionRequest copy(int i) {
        return new CreateMfaSessionRequest(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateMfaSessionRequest) && this.businessType == ((CreateMfaSessionRequest) obj).businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBusinessType() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.businessType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateMfaSessionRequest(businessType=" + this.businessType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.account.data.model.CreateMfaSessionRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateMfaSessionRequest> serializer() {
            return CreateMfaSessionRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateMfaSessionRequest(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CreateMfaSessionRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.businessType = i2;
    }

    public CreateMfaSessionRequest(int i) {
        this.businessType = i;
    }
}
