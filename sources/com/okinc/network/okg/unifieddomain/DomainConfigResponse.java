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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class DomainConfigResponse {
    private final String countryCode;
    private final List<DomainConfig> scenarios;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DomainConfig$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.okg.unifieddomain.DomainConfigResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DomainConfigResponse copy$default(DomainConfigResponse domainConfigResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = domainConfigResponse.countryCode;
        }
        if ((i & 2) != 0) {
            list = domainConfigResponse.scenarios;
        }
        return domainConfigResponse.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DomainConfig> component2() {
        return this.scenarios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DomainConfigResponse copy(@NotNull String str, @NotNull List<DomainConfig> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new DomainConfigResponse(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DomainConfigResponse)) {
            return false;
        }
        DomainConfigResponse domainConfigResponse = (DomainConfigResponse) obj;
        return Intrinsics.EZpvd((Object) this.countryCode, (Object) domainConfigResponse.countryCode) && Intrinsics.EZpvd(this.scenarios, domainConfigResponse.scenarios);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DomainConfig> getScenarios() {
        return this.scenarios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.countryCode.hashCode() * 31) + this.scenarios.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DomainConfigResponse(countryCode=" + this.countryCode + ", scenarios=" + this.scenarios + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.unifieddomain.DomainConfigResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DomainConfigResponse> serializer() {
            return DomainConfigResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DomainConfigResponse(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DomainConfigResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.countryCode = str;
        this.scenarios = list;
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(DomainConfigResponse domainConfigResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, domainConfigResponse.countryCode);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], domainConfigResponse.scenarios);
    }

    public DomainConfigResponse(@NotNull String str, @NotNull List<DomainConfig> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.countryCode = str;
        this.scenarios = list;
    }
}
