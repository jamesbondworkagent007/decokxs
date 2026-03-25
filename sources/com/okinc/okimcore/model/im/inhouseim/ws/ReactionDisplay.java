package com.okinc.okimcore.model.im.inhouseim.ws;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class ReactionDisplay implements Parcelable {
    public static final int $stable = 0;
    private final int count;
    private final String emoji;
    private final boolean isCurrentUserReaction;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ReactionDisplay> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ReactionDisplay> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionDisplay createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReactionDisplay(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionDisplay[] newArray(int i) {
            return new ReactionDisplay[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReactionDisplay copy$default(ReactionDisplay reactionDisplay, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = reactionDisplay.emoji;
        }
        if ((i2 & 2) != 0) {
            i = reactionDisplay.count;
        }
        if ((i2 & 4) != 0) {
            z = reactionDisplay.isCurrentUserReaction;
        }
        return reactionDisplay.copy(str, i, z);
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
        return this.isCurrentUserReaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReactionDisplay copy(@NotNull String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ReactionDisplay(str, i, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionDisplay)) {
            return false;
        }
        ReactionDisplay reactionDisplay = (ReactionDisplay) obj;
        return Intrinsics.EZpvd((Object) this.emoji, (Object) reactionDisplay.emoji) && this.count == reactionDisplay.count && this.isCurrentUserReaction == reactionDisplay.isCurrentUserReaction;
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
        return (((this.emoji.hashCode() * 31) + Integer.hashCode(this.count)) * 31) + Boolean.hashCode(this.isCurrentUserReaction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCurrentUserReaction() {
        return this.isCurrentUserReaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReactionDisplay(emoji=" + this.emoji + ", count=" + this.count + ", isCurrentUserReaction=" + this.isCurrentUserReaction + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.emoji);
        parcel.writeInt(this.count);
        parcel.writeInt(this.isCurrentUserReaction ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReactionDisplay> serializer() {
            return ReactionDisplay$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReactionDisplay(int i, String str, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ReactionDisplay$$serializer.INSTANCE.getDescriptor());
        }
        this.emoji = str;
        this.count = i2;
        this.isCurrentUserReaction = z;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ReactionDisplay reactionDisplay, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, reactionDisplay.emoji);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, reactionDisplay.count);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, reactionDisplay.isCurrentUserReaction);
    }

    public ReactionDisplay(@NotNull String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.emoji = str;
        this.count = i;
        this.isCurrentUserReaction = z;
    }
}
