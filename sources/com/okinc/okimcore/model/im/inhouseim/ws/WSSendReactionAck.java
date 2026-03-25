package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class WSSendReactionAck {
    public final WSSendReactionResponse reaction;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSSendReactionAck copy$default(WSSendReactionAck wSSendReactionAck, WSSendReactionResponse wSSendReactionResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            wSSendReactionResponse = wSSendReactionAck.reaction;
        }
        return wSSendReactionAck.KWHzl(wSSendReactionResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendReactionResponse EZpvd() {
        return this.reaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendReactionAck KWHzl(@NotNull WSSendReactionResponse wSSendReactionResponse) {
        Intrinsics.checkNotNullParameter(wSSendReactionResponse, "");
        return new WSSendReactionAck(wSSendReactionResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSSendReactionAck) && Intrinsics.EZpvd(this.reaction, ((WSSendReactionAck) obj).reaction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.reaction.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSSendReactionAck(reaction=" + this.reaction + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionAck.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSSendReactionAck> serializer() {
            return WSSendReactionAck$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSSendReactionAck(int i, WSSendReactionResponse wSSendReactionResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSSendReactionAck$$serializer.INSTANCE.getDescriptor());
        }
        this.reaction = wSSendReactionResponse;
    }

    public WSSendReactionAck(@NotNull WSSendReactionResponse wSSendReactionResponse) {
        Intrinsics.checkNotNullParameter(wSSendReactionResponse, "");
        this.reaction = wSSendReactionResponse;
    }
}
