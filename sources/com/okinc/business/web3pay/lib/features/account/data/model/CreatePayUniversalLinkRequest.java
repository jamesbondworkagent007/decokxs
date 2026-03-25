package com.okinc.business.web3pay.lib.features.account.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreatePayUniversalLinkRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreatePayUniversalLinkRequest copy$default(CreatePayUniversalLinkRequest createPayUniversalLinkRequest, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createPayUniversalLinkRequest.type;
        }
        return createPayUniversalLinkRequest.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreatePayUniversalLinkRequest copy(int i) {
        return new CreatePayUniversalLinkRequest(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreatePayUniversalLinkRequest) && this.type == ((CreatePayUniversalLinkRequest) obj).type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreatePayUniversalLinkRequest(type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.account.data.model.CreatePayUniversalLinkRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreatePayUniversalLinkRequest> serializer() {
            return CreatePayUniversalLinkRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreatePayUniversalLinkRequest(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CreatePayUniversalLinkRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
    }

    public CreatePayUniversalLinkRequest(int i) {
        this.type = i;
    }
}
