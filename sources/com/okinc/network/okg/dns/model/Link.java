package com.okinc.network.okg.dns.model;

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
public final class Link {
    private final int requestType;
    private final Stages stages;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Link copy$default(Link link, int i, Stages stages, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = link.requestType;
        }
        if ((i2 & 2) != 0) {
            stages = link.stages;
        }
        return link.copy(i, stages);
    }

    @SerialName("request_type")
    public static /* synthetic */ void getRequestType$annotations() {
    }

    @SerialName("stages")
    public static /* synthetic */ void getStages$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.requestType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Stages component2() {
        return this.stages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Link copy(int i, @NotNull Stages stages) {
        Intrinsics.checkNotNullParameter(stages, "");
        return new Link(i, stages);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return this.requestType == link.requestType && Intrinsics.EZpvd(this.stages, link.stages);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRequestType() {
        return this.requestType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Stages getStages() {
        return this.stages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.requestType) * 31) + this.stages.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Link(requestType=" + this.requestType + ", stages=" + this.stages + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.model.Link.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Link> serializer() {
            return Link$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Link(int i, int i2, Stages stages, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Link$$serializer.INSTANCE.getDescriptor());
        }
        this.requestType = i2;
        this.stages = stages;
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(Link link, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, link.requestType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, Stages$$serializer.INSTANCE, link.stages);
    }

    public Link(int i, @NotNull Stages stages) {
        Intrinsics.checkNotNullParameter(stages, "");
        this.requestType = i;
        this.stages = stages;
    }
}
