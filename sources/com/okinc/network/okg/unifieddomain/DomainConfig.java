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
public final class DomainConfig {
    private final String detectionPath;
    private final List<String> domains;
    private final String headerIdentifier;
    private final String scenario;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.okg.unifieddomain.DomainConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DomainConfig copy$default(DomainConfig domainConfig, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = domainConfig.scenario;
        }
        if ((i & 2) != 0) {
            str2 = domainConfig.headerIdentifier;
        }
        if ((i & 4) != 0) {
            list = domainConfig.domains;
        }
        if ((i & 8) != 0) {
            str3 = domainConfig.detectionPath;
        }
        return domainConfig.copy(str, str2, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.headerIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.domains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.detectionPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DomainConfig copy(@NotNull String str, String str2, @NotNull List<String> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DomainConfig(str, str2, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DomainConfig)) {
            return false;
        }
        DomainConfig domainConfig = (DomainConfig) obj;
        return Intrinsics.EZpvd((Object) this.scenario, (Object) domainConfig.scenario) && Intrinsics.EZpvd((Object) this.headerIdentifier, (Object) domainConfig.headerIdentifier) && Intrinsics.EZpvd(this.domains, domainConfig.domains) && Intrinsics.EZpvd((Object) this.detectionPath, (Object) domainConfig.detectionPath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetectionPath() {
        return this.detectionPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDomains() {
        return this.domains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeaderIdentifier() {
        return this.headerIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScenario() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.scenario.hashCode();
        String str = this.headerIdentifier;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.domains.hashCode()) * 31) + this.detectionPath.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DomainConfig(scenario=" + this.scenario + ", headerIdentifier=" + this.headerIdentifier + ", domains=" + this.domains + ", detectionPath=" + this.detectionPath + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.unifieddomain.DomainConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DomainConfig> serializer() {
            return DomainConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DomainConfig(int i, String str, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, DomainConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.scenario = str;
        this.headerIdentifier = str2;
        this.domains = list;
        this.detectionPath = str3;
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(DomainConfig domainConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, domainConfig.scenario);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, domainConfig.headerIdentifier);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], domainConfig.domains);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, domainConfig.detectionPath);
    }

    public DomainConfig(@NotNull String str, String str2, @NotNull List<String> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.scenario = str;
        this.headerIdentifier = str2;
        this.domains = list;
        this.detectionPath = str3;
    }
}
