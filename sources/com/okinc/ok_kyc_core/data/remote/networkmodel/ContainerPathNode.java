package com.okinc.ok_kyc_core.data.remote.networkmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ContainerPathNode {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int targetIndex;
    private final String targetType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContainerPathNode copy$default(ContainerPathNode containerPathNode, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = containerPathNode.targetType;
        }
        if ((i2 & 2) != 0) {
            i = containerPathNode.targetIndex;
        }
        return containerPathNode.copy(str, i);
    }

    @SerialName("type")
    public static /* synthetic */ void getTargetType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContainerPathNode copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ContainerPathNode(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContainerPathNode)) {
            return false;
        }
        ContainerPathNode containerPathNode = (ContainerPathNode) obj;
        return Intrinsics.EZpvd((Object) this.targetType, (Object) containerPathNode.targetType) && this.targetIndex == containerPathNode.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTargetIndex() {
        return this.targetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetType() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.targetType.hashCode() * 31) + Integer.hashCode(this.targetIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContainerPathNode(targetType=" + this.targetType + ", targetIndex=" + this.targetIndex + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ContainerPathNode.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContainerPathNode> serializer() {
            return ContainerPathNode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContainerPathNode(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ContainerPathNode$$serializer.INSTANCE.getDescriptor());
        }
        this.targetType = str;
        this.targetIndex = i2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ContainerPathNode containerPathNode, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, containerPathNode.targetType);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, containerPathNode.targetIndex);
    }

    public ContainerPathNode(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.targetType = str;
        this.targetIndex = i;
    }
}
