package com.okinc.im.view;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class MessageReaction {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int count;
    private final String emoji;
    private final boolean isUserReacted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MessageReaction copy$default(MessageReaction messageReaction, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = messageReaction.emoji;
        }
        if ((i2 & 2) != 0) {
            i = messageReaction.count;
        }
        if ((i2 & 4) != 0) {
            z = messageReaction.isUserReacted;
        }
        return messageReaction.copy(str, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isUserReacted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MessageReaction copy(@NotNull String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MessageReaction(str, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageReaction)) {
            return false;
        }
        MessageReaction messageReaction = (MessageReaction) obj;
        return Intrinsics.EZpvd((Object) this.emoji, (Object) messageReaction.emoji) && this.count == messageReaction.count && this.isUserReacted == messageReaction.isUserReacted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmoji() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.emoji.hashCode() * 31) + Integer.hashCode(this.count)) * 31) + Boolean.hashCode(this.isUserReacted);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUserReacted() {
        return this.isUserReacted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MessageReaction(emoji=" + this.emoji + ", count=" + this.count + ", isUserReacted=" + this.isUserReacted + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.view.MessageReaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageReaction> serializer() {
            return MessageReaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MessageReaction(int i, String str, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, MessageReaction$$serializer.INSTANCE.getDescriptor());
        }
        this.emoji = str;
        this.count = i2;
        if ((i & 4) == 0) {
            this.isUserReacted = false;
        } else {
            this.isUserReacted = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKIM_okim_api(MessageReaction messageReaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, messageReaction.emoji);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, messageReaction.count);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || messageReaction.isUserReacted) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, messageReaction.isUserReacted);
        }
    }

    public MessageReaction(@NotNull String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.emoji = str;
        this.count = i;
        this.isUserReacted = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, int, boolean):void (m)] (LINE:32) call: com.okinc.im.view.MessageReaction.<init>(java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ MessageReaction(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? false : z);
    }
}
