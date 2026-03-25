package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class EnsAddressResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EnsAddressResponse copy$default(EnsAddressResponse ensAddressResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ensAddressResponse.address;
        }
        return ensAddressResponse.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EnsAddressResponse copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EnsAddressResponse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EnsAddressResponse) && Intrinsics.EZpvd((Object) this.address, (Object) ((EnsAddressResponse) obj).address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EnsAddressResponse(address=" + this.address + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.EnsAddressResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EnsAddressResponse> serializer() {
            return EnsAddressResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EnsAddressResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, EnsAddressResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
    }

    public EnsAddressResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }
}
