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
public final class Reaction {
    public final String emoji;
    public final long updateTime;
    public final List<UserUid> userList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(UserUid$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.Reaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Reaction copy$default(Reaction reaction, String str, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reaction.emoji;
        }
        if ((i & 2) != 0) {
            j = reaction.updateTime;
        }
        if ((i & 4) != 0) {
            list = reaction.userList;
        }
        return reaction.OLrzqt(str, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserUid> AEQbTJ() {
        return this.userList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Reaction OLrzqt(@NotNull String str, long j, @NotNull List<UserUid> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new Reaction(str, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) obj;
        return Intrinsics.EZpvd((Object) this.emoji, (Object) reaction.emoji) && this.updateTime == reaction.updateTime && Intrinsics.EZpvd(this.userList, reaction.userList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.emoji.hashCode() * 31) + Long.hashCode(this.updateTime)) * 31) + this.userList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Reaction(emoji=" + this.emoji + ", updateTime=" + this.updateTime + ", userList=" + this.userList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.Reaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Reaction> serializer() {
            return Reaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Reaction(int i, String str, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, Reaction$$serializer.INSTANCE.getDescriptor());
        }
        this.emoji = str;
        this.updateTime = j;
        this.userList = list;
    }

    public static final /* synthetic */ void copydefault(Reaction reaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, reaction.emoji);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, reaction.updateTime);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], reaction.userList);
    }

    public Reaction(@NotNull String str, long j, @NotNull List<UserUid> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.emoji = str;
        this.updateTime = j;
        this.userList = list;
    }
}
