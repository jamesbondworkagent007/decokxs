package com.okinc.okimcore.model.remote.groupvoicecall;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class StartGroupVoiceCallRequest {
    private final String groupId;
    private final List<String> targetUids;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.groupvoicecall.StartGroupVoiceCallRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StartGroupVoiceCallRequest copy$default(StartGroupVoiceCallRequest startGroupVoiceCallRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startGroupVoiceCallRequest.groupId;
        }
        if ((i & 2) != 0) {
            list = startGroupVoiceCallRequest.targetUids;
        }
        return startGroupVoiceCallRequest.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.targetUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StartGroupVoiceCallRequest copy(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new StartGroupVoiceCallRequest(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartGroupVoiceCallRequest)) {
            return false;
        }
        StartGroupVoiceCallRequest startGroupVoiceCallRequest = (StartGroupVoiceCallRequest) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) startGroupVoiceCallRequest.groupId) && Intrinsics.EZpvd(this.targetUids, startGroupVoiceCallRequest.targetUids);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTargetUids() {
        return this.targetUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.groupId.hashCode() * 31) + this.targetUids.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StartGroupVoiceCallRequest(groupId=" + this.groupId + ", targetUids=" + this.targetUids + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.groupvoicecall.StartGroupVoiceCallRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StartGroupVoiceCallRequest> serializer() {
            return StartGroupVoiceCallRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StartGroupVoiceCallRequest(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, StartGroupVoiceCallRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = str;
        this.targetUids = list;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(StartGroupVoiceCallRequest startGroupVoiceCallRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, startGroupVoiceCallRequest.groupId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], startGroupVoiceCallRequest.targetUids);
    }

    public StartGroupVoiceCallRequest(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.groupId = str;
        this.targetUids = list;
    }
}
