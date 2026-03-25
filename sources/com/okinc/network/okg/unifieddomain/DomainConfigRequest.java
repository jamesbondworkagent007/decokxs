package com.okinc.network.okg.unifieddomain;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class DomainConfigRequest {
    private final String flow;
    private final List<String> scenarios;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.okg.unifieddomain.DomainConfigRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DomainConfigRequest copy$default(DomainConfigRequest domainConfigRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = domainConfigRequest.flow;
        }
        if ((i & 2) != 0) {
            list = domainConfigRequest.scenarios;
        }
        return domainConfigRequest.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.flow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.scenarios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DomainConfigRequest copy(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new DomainConfigRequest(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DomainConfigRequest)) {
            return false;
        }
        DomainConfigRequest domainConfigRequest = (DomainConfigRequest) obj;
        return Intrinsics.EZpvd((Object) this.flow, (Object) domainConfigRequest.flow) && Intrinsics.EZpvd(this.scenarios, domainConfigRequest.scenarios);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFlow() {
        return this.flow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getScenarios() {
        return this.scenarios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.flow.hashCode() * 31) + this.scenarios.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DomainConfigRequest(flow=" + this.flow + ", scenarios=" + this.scenarios + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.unifieddomain.DomainConfigRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DomainConfigRequest> serializer() {
            return DomainConfigRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DomainConfigRequest(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DomainConfigRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.flow = str;
        this.scenarios = list;
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(DomainConfigRequest domainConfigRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, domainConfigRequest.flow);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], domainConfigRequest.scenarios);
    }

    public DomainConfigRequest(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.flow = str;
        this.scenarios = list;
    }
}
