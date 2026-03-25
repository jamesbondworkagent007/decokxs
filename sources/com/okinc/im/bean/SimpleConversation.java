package com.okinc.im.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SimpleConversation {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int conversationType;
    private final String targetId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimpleConversation copy$default(SimpleConversation simpleConversation, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = simpleConversation.targetId;
        }
        if ((i2 & 2) != 0) {
            i = simpleConversation.conversationType;
        }
        return simpleConversation.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleConversation copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SimpleConversation(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleConversation)) {
            return false;
        }
        SimpleConversation simpleConversation = (SimpleConversation) obj;
        return Intrinsics.EZpvd((Object) this.targetId, (Object) simpleConversation.targetId) && this.conversationType == simpleConversation.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getConversationType() {
        return this.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.targetId.hashCode() * 31) + Integer.hashCode(this.conversationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleConversation(targetId=" + this.targetId + ", conversationType=" + this.conversationType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.SimpleConversation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleConversation> serializer() {
            return SimpleConversation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleConversation(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SimpleConversation$$serializer.INSTANCE.getDescriptor());
        }
        this.targetId = str;
        this.conversationType = i2;
    }

    public static final /* synthetic */ void write$Self$OKIM_okim_api(SimpleConversation simpleConversation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, simpleConversation.targetId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, simpleConversation.conversationType);
    }

    public SimpleConversation(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.targetId = str;
        this.conversationType = i;
    }
}
