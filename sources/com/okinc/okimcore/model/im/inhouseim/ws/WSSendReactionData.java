package com.okinc.okimcore.model.im.inhouseim.ws;

import com.okinc.okimcore.model.im.ReactionAction;
import com.okinc.okimcore.model.im.ReactionAction$$serializer;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class WSSendReactionData {
    private final String channelId;
    private final List<ReactionAction> emojiActions;
    private final long seq;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ReactionAction$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSSendReactionData copy$default(WSSendReactionData wSSendReactionData, String str, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSSendReactionData.channelId;
        }
        if ((i & 2) != 0) {
            j = wSSendReactionData.seq;
        }
        if ((i & 4) != 0) {
            list = wSSendReactionData.emojiActions;
        }
        return wSSendReactionData.copy(str, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionAction> component3() {
        return this.emojiActions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendReactionData copy(@NotNull String str, long j, @NotNull List<ReactionAction> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new WSSendReactionData(str, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSSendReactionData)) {
            return false;
        }
        WSSendReactionData wSSendReactionData = (WSSendReactionData) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) wSSendReactionData.channelId) && this.seq == wSSendReactionData.seq && Intrinsics.EZpvd(this.emojiActions, wSSendReactionData.emojiActions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionAction> getEmojiActions() {
        return this.emojiActions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSeq() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.channelId.hashCode() * 31) + Long.hashCode(this.seq)) * 31) + this.emojiActions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSSendReactionData(channelId=" + this.channelId + ", seq=" + this.seq + ", emojiActions=" + this.emojiActions + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSSendReactionData> serializer() {
            return WSSendReactionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSSendReactionData(int i, String str, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, WSSendReactionData$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.seq = j;
        this.emojiActions = list;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(WSSendReactionData wSSendReactionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wSSendReactionData.channelId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, wSSendReactionData.seq);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], wSSendReactionData.emojiActions);
    }

    public WSSendReactionData(@NotNull String str, long j, @NotNull List<ReactionAction> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.channelId = str;
        this.seq = j;
        this.emojiActions = list;
    }
}
