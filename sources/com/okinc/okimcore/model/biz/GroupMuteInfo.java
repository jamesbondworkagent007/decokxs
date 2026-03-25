package com.okinc.okimcore.model.biz;

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
public final class GroupMuteInfo implements Parcelable {
    public static final int $stable = 0;
    private final String groupId;
    private final boolean isMute;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GroupMuteInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GroupMuteInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupMuteInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupMuteInfo(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupMuteInfo[] newArray(int i) {
            return new GroupMuteInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupMuteInfo copy$default(GroupMuteInfo groupMuteInfo, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupMuteInfo.groupId;
        }
        if ((i & 2) != 0) {
            z = groupMuteInfo.isMute;
        }
        return groupMuteInfo.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupMuteInfo copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GroupMuteInfo(str, z);
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
        if (!(obj instanceof GroupMuteInfo)) {
            return false;
        }
        GroupMuteInfo groupMuteInfo = (GroupMuteInfo) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) groupMuteInfo.groupId) && this.isMute == groupMuteInfo.isMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.groupId.hashCode() * 31) + Boolean.hashCode(this.isMute);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMute() {
        return this.isMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupMuteInfo(groupId=" + this.groupId + ", isMute=" + this.isMute + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.groupId);
        parcel.writeInt(this.isMute ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.biz.GroupMuteInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupMuteInfo> serializer() {
            return GroupMuteInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupMuteInfo(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, GroupMuteInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = str;
        this.isMute = z;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupMuteInfo groupMuteInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, groupMuteInfo.groupId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, groupMuteInfo.isMute);
    }

    public GroupMuteInfo(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupId = str;
        this.isMute = z;
    }
}
