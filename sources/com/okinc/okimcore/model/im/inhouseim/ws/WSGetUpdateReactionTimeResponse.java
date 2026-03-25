package com.okinc.okimcore.model.im.inhouseim.ws;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSGetUpdateReactionTimeResponse {
    private final List<ReactionUpdateTime> reactionUpdateTimeList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ReactionUpdateTime$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.WSGetUpdateReactionTimeResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSGetUpdateReactionTimeResponse copy$default(WSGetUpdateReactionTimeResponse wSGetUpdateReactionTimeResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wSGetUpdateReactionTimeResponse.reactionUpdateTimeList;
        }
        return wSGetUpdateReactionTimeResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionUpdateTime> component1() {
        return this.reactionUpdateTimeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSGetUpdateReactionTimeResponse copy(@NotNull List<ReactionUpdateTime> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WSGetUpdateReactionTimeResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSGetUpdateReactionTimeResponse) && Intrinsics.EZpvd(this.reactionUpdateTimeList, ((WSGetUpdateReactionTimeResponse) obj).reactionUpdateTimeList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionUpdateTime> getReactionUpdateTimeList() {
        return this.reactionUpdateTimeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.reactionUpdateTimeList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSGetUpdateReactionTimeResponse(reactionUpdateTimeList=" + this.reactionUpdateTimeList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSGetUpdateReactionTimeResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSGetUpdateReactionTimeResponse> serializer() {
            return WSGetUpdateReactionTimeResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSGetUpdateReactionTimeResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSGetUpdateReactionTimeResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.reactionUpdateTimeList = list;
    }

    public WSGetUpdateReactionTimeResponse(@NotNull List<ReactionUpdateTime> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.reactionUpdateTimeList = list;
    }
}
