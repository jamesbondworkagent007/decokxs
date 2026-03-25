package com.okinc.okimcore.model.im.inhouseim.ws;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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
public final class ReactionDetail implements Parcelable {
    private final String emoji;
    private final boolean isCurrentUserReaction;
    private final long updateTime;
    private final List<ReactionUserDetail> userUids;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReactionDetail> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ReactionUserDetail$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<ReactionDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ReactionUserDetail.CREATOR.createFromParcel(parcel));
            }
            return new ReactionDetail(string, z, arrayList, parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionDetail[] newArray(int i) {
            return new ReactionDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactionDetail copy$default(ReactionDetail reactionDetail, String str, boolean z, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reactionDetail.emoji;
        }
        if ((i & 2) != 0) {
            z = reactionDetail.isCurrentUserReaction;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            list = reactionDetail.userUids;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            j = reactionDetail.updateTime;
        }
        return reactionDetail.copy(str, z2, list2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isCurrentUserReaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionUserDetail> component3() {
        return this.userUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReactionDetail copy(@NotNull String str, boolean z, @NotNull List<ReactionUserDetail> list, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ReactionDetail(str, z, list, j);
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
        if (!(obj instanceof ReactionDetail)) {
            return false;
        }
        ReactionDetail reactionDetail = (ReactionDetail) obj;
        return Intrinsics.EZpvd((Object) this.emoji, (Object) reactionDetail.emoji) && this.isCurrentUserReaction == reactionDetail.isCurrentUserReaction && Intrinsics.EZpvd(this.userUids, reactionDetail.userUids) && this.updateTime == reactionDetail.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmoji() {
        return this.emoji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionUserDetail> getUserUids() {
        return this.userUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.emoji.hashCode() * 31) + Boolean.hashCode(this.isCurrentUserReaction)) * 31) + this.userUids.hashCode()) * 31) + Long.hashCode(this.updateTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCurrentUserReaction() {
        return this.isCurrentUserReaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReactionDetail(emoji=" + this.emoji + ", isCurrentUserReaction=" + this.isCurrentUserReaction + ", userUids=" + this.userUids + ", updateTime=" + this.updateTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.emoji);
        parcel.writeInt(this.isCurrentUserReaction ? 1 : 0);
        List<ReactionUserDetail> list = this.userUids;
        parcel.writeInt(list.size());
        Iterator<ReactionUserDetail> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.updateTime);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReactionDetail> serializer() {
            return ReactionDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReactionDetail(int i, String str, boolean z, List list, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ReactionDetail$$serializer.INSTANCE.getDescriptor());
        }
        this.emoji = str;
        this.isCurrentUserReaction = z;
        this.userUids = list;
        this.updateTime = j;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ReactionDetail reactionDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, reactionDetail.emoji);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, reactionDetail.isCurrentUserReaction);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], reactionDetail.userUids);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, reactionDetail.updateTime);
    }

    public ReactionDetail(@NotNull String str, boolean z, @NotNull List<ReactionUserDetail> list, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.emoji = str;
        this.isCurrentUserReaction = z;
        this.userUids = list;
        this.updateTime = j;
    }
}
