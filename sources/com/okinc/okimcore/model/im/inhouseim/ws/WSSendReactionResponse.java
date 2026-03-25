package com.okinc.okimcore.model.im.inhouseim.ws;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSSendReactionResponse {
    public final String channelId;
    public final List<Reaction> reactionItemList;
    public final long seq;
    public final long updateTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(Reaction$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSSendReactionResponse copy$default(WSSendReactionResponse wSSendReactionResponse, String str, long j, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSSendReactionResponse.channelId;
        }
        if ((i & 2) != 0) {
            j = wSSendReactionResponse.seq;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = wSSendReactionResponse.updateTime;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            list = wSSendReactionResponse.reactionItemList;
        }
        return wSSendReactionResponse.copydefault(str, j3, j4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendReactionResponse copydefault(@NotNull String str, long j, long j2, @NotNull List<Reaction> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new WSSendReactionResponse(str, j, j2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Reaction> copydefault() {
        return this.reactionItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSSendReactionResponse)) {
            return false;
        }
        WSSendReactionResponse wSSendReactionResponse = (WSSendReactionResponse) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) wSSendReactionResponse.channelId) && this.seq == wSSendReactionResponse.seq && this.updateTime == wSSendReactionResponse.updateTime && Intrinsics.EZpvd(this.reactionItemList, wSSendReactionResponse.reactionItemList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.channelId.hashCode() * 31) + Long.hashCode(this.seq)) * 31) + Long.hashCode(this.updateTime)) * 31) + this.reactionItemList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSSendReactionResponse(channelId=" + this.channelId + ", seq=" + this.seq + ", updateTime=" + this.updateTime + ", reactionItemList=" + this.reactionItemList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSSendReactionResponse> serializer() {
            return WSSendReactionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSSendReactionResponse(int i, String str, long j, long j2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, WSSendReactionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.seq = j;
        this.updateTime = j2;
        this.reactionItemList = list;
    }

    public static final /* synthetic */ void KWHzl(WSSendReactionResponse wSSendReactionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wSSendReactionResponse.channelId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, wSSendReactionResponse.seq);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, wSSendReactionResponse.updateTime);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], wSSendReactionResponse.reactionItemList);
    }

    public WSSendReactionResponse(@NotNull String str, long j, long j2, @NotNull List<Reaction> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.channelId = str;
        this.seq = j;
        this.updateTime = j2;
        this.reactionItemList = list;
    }
}
