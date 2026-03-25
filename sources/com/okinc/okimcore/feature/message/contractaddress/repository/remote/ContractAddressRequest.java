package com.okinc.okimcore.feature.message.contractaddress.repository.remote;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ContractAddressRequest {
    private final List<String> contractAddresses;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.message.contractaddress.repository.remote.ContractAddressRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContractAddressRequest copy$default(ContractAddressRequest contractAddressRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = contractAddressRequest.contractAddresses;
        }
        return contractAddressRequest.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.contractAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractAddressRequest copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ContractAddressRequest(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContractAddressRequest) && Intrinsics.EZpvd(this.contractAddresses, ((ContractAddressRequest) obj).contractAddresses);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getContractAddresses() {
        return this.contractAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.contractAddresses.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractAddressRequest(contractAddresses=" + this.contractAddresses + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.feature.message.contractaddress.repository.remote.ContractAddressRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractAddressRequest> serializer() {
            return ContractAddressRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractAddressRequest(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ContractAddressRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.contractAddresses = list;
    }

    public ContractAddressRequest(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.contractAddresses = list;
    }
}
