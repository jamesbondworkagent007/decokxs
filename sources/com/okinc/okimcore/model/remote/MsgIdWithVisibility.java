package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class MsgIdWithVisibility {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean isVisible;
    private final String messageId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MsgIdWithVisibility copy$default(MsgIdWithVisibility msgIdWithVisibility, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = msgIdWithVisibility.messageId;
        }
        if ((i & 2) != 0) {
            z = msgIdWithVisibility.isVisible;
        }
        return msgIdWithVisibility.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MsgIdWithVisibility copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MsgIdWithVisibility(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgIdWithVisibility)) {
            return false;
        }
        MsgIdWithVisibility msgIdWithVisibility = (MsgIdWithVisibility) obj;
        return Intrinsics.EZpvd((Object) this.messageId, (Object) msgIdWithVisibility.messageId) && this.isVisible == msgIdWithVisibility.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.messageId.hashCode() * 31) + Boolean.hashCode(this.isVisible);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVisible() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MsgIdWithVisibility(messageId=" + this.messageId + ", isVisible=" + this.isVisible + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.MsgIdWithVisibility.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MsgIdWithVisibility> serializer() {
            return MsgIdWithVisibility$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MsgIdWithVisibility(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, MsgIdWithVisibility$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.isVisible = z;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(MsgIdWithVisibility msgIdWithVisibility, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, msgIdWithVisibility.messageId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, msgIdWithVisibility.isVisible);
    }

    public MsgIdWithVisibility(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.messageId = str;
        this.isVisible = z;
    }
}
