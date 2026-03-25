package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSPushReaction {
    public final WSSendReactionResponse reaction;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSPushReaction copy$default(WSPushReaction wSPushReaction, WSSendReactionResponse wSSendReactionResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            wSSendReactionResponse = wSPushReaction.reaction;
        }
        return wSPushReaction.copydefault(wSSendReactionResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendReactionResponse OLrzqt() {
        return this.reaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSPushReaction copydefault(@NotNull WSSendReactionResponse wSSendReactionResponse) {
        Intrinsics.checkNotNullParameter(wSSendReactionResponse, "");
        return new WSPushReaction(wSSendReactionResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSPushReaction) && Intrinsics.EZpvd(this.reaction, ((WSPushReaction) obj).reaction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.reaction.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSPushReaction(reaction=" + this.reaction + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSPushReaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSPushReaction> serializer() {
            return WSPushReaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSPushReaction(int i, WSSendReactionResponse wSSendReactionResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSPushReaction$$serializer.INSTANCE.getDescriptor());
        }
        this.reaction = wSSendReactionResponse;
    }

    public WSPushReaction(@NotNull WSSendReactionResponse wSSendReactionResponse) {
        Intrinsics.checkNotNullParameter(wSSendReactionResponse, "");
        this.reaction = wSSendReactionResponse;
    }
}
