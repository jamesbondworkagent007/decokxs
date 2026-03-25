package com.okinc.core.ok_app.security;

import com.okinc.core.ok_app.api.bean.AccessibilityServiceInfoDetails;
import com.okinc.core.ok_app.api.bean.AccessibilityServiceInfoDetails$$serializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class RiskAttributes {
    private final List<AccessibilityServiceInfoDetails> appList;
    private final String osVersion;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(AccessibilityServiceInfoDetails$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.core.ok_app.security.RiskAttributes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RiskAttributes copy$default(RiskAttributes riskAttributes, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = riskAttributes.osVersion;
        }
        if ((i & 2) != 0) {
            list = riskAttributes.appList;
        }
        return riskAttributes.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.osVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccessibilityServiceInfoDetails> component2() {
        return this.appList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskAttributes copy(@NotNull String str, @NotNull List<AccessibilityServiceInfoDetails> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new RiskAttributes(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskAttributes)) {
            return false;
        }
        RiskAttributes riskAttributes = (RiskAttributes) obj;
        return Intrinsics.EZpvd((Object) this.osVersion, (Object) riskAttributes.osVersion) && Intrinsics.EZpvd(this.appList, riskAttributes.appList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccessibilityServiceInfoDetails> getAppList() {
        return this.appList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.osVersion.hashCode() * 31) + this.appList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskAttributes(osVersion=" + this.osVersion + ", appList=" + this.appList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.ok_app.security.RiskAttributes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RiskAttributes> serializer() {
            return RiskAttributes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RiskAttributes(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, RiskAttributes$$serializer.INSTANCE.getDescriptor());
        }
        this.osVersion = str;
        this.appList = list;
    }

    public static final /* synthetic */ void write$Self$OKApp_ok_app(RiskAttributes riskAttributes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, riskAttributes.osVersion);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], riskAttributes.appList);
    }

    public RiskAttributes(@NotNull String str, @NotNull List<AccessibilityServiceInfoDetails> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.osVersion = str;
        this.appList = list;
    }
}
