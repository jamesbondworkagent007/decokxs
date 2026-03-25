package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class DeleteAddressReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long addressId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeleteAddressReq copy$default(DeleteAddressReq deleteAddressReq, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = deleteAddressReq.addressId;
        }
        return deleteAddressReq.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeleteAddressReq copy(long j) {
        return new DeleteAddressReq(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteAddressReq) && this.addressId == ((DeleteAddressReq) obj).addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAddressId() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.addressId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeleteAddressReq(addressId=" + this.addressId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.DeleteAddressReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeleteAddressReq> serializer() {
            return DeleteAddressReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeleteAddressReq(int i, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DeleteAddressReq$$serializer.INSTANCE.getDescriptor());
        }
        this.addressId = j;
    }

    public DeleteAddressReq(long j) {
        this.addressId = j;
    }
}
