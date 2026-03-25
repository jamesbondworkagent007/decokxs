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
public final class WSGetReactionResponse {
    private final List<WSSendReactionResponse> reactionList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(WSSendReactionResponse$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.WSGetReactionResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSGetReactionResponse copy$default(WSGetReactionResponse wSGetReactionResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wSGetReactionResponse.reactionList;
        }
        return wSGetReactionResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WSSendReactionResponse> component1() {
        return this.reactionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSGetReactionResponse copy(@NotNull List<WSSendReactionResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WSGetReactionResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSGetReactionResponse) && Intrinsics.EZpvd(this.reactionList, ((WSGetReactionResponse) obj).reactionList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WSSendReactionResponse> getReactionList() {
        return this.reactionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.reactionList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSGetReactionResponse(reactionList=" + this.reactionList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSGetReactionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSGetReactionResponse> serializer() {
            return WSGetReactionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSGetReactionResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSGetReactionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.reactionList = list;
    }

    public WSGetReactionResponse(@NotNull List<WSSendReactionResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.reactionList = list;
    }
}
