package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class GroupAuditUserInfo implements Parcelable {
    public static final int $stable = 0;
    private final String avatar;
    private final String inviteId;
    private final String inviteName;
    private final String nickName;
    private final String userId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GroupAuditUserInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GroupAuditUserInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupAuditUserInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupAuditUserInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupAuditUserInfo[] newArray(int i) {
            return new GroupAuditUserInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupAuditUserInfo copy$default(GroupAuditUserInfo groupAuditUserInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupAuditUserInfo.userId;
        }
        if ((i & 2) != 0) {
            str2 = groupAuditUserInfo.nickName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = groupAuditUserInfo.avatar;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = groupAuditUserInfo.inviteId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = groupAuditUserInfo.inviteName;
        }
        return groupAuditUserInfo.copy(str, str6, str7, str8, str5);
    }

    @SerialName("avatar")
    public static /* synthetic */ void getAvatar$annotations() {
    }

    @SerialName("inviteId")
    public static /* synthetic */ void getInviteId$annotations() {
    }

    @SerialName("inviteName")
    public static /* synthetic */ void getInviteName$annotations() {
    }

    @SerialName("petname")
    public static /* synthetic */ void getNickName$annotations() {
    }

    @SerialName("identifyId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.inviteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.inviteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupAuditUserInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new GroupAuditUserInfo(str, str2, str3, str4, str5);
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
        if (!(obj instanceof GroupAuditUserInfo)) {
            return false;
        }
        GroupAuditUserInfo groupAuditUserInfo = (GroupAuditUserInfo) obj;
        return Intrinsics.EZpvd((Object) this.userId, (Object) groupAuditUserInfo.userId) && Intrinsics.EZpvd((Object) this.nickName, (Object) groupAuditUserInfo.nickName) && Intrinsics.EZpvd((Object) this.avatar, (Object) groupAuditUserInfo.avatar) && Intrinsics.EZpvd((Object) this.inviteId, (Object) groupAuditUserInfo.inviteId) && Intrinsics.EZpvd((Object) this.inviteName, (Object) groupAuditUserInfo.inviteName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviteId() {
        return this.inviteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviteName() {
        return this.inviteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.userId.hashCode() * 31) + this.nickName.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.inviteId.hashCode()) * 31) + this.inviteName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupAuditUserInfo(userId=" + this.userId + ", nickName=" + this.nickName + ", avatar=" + this.avatar + ", inviteId=" + this.inviteId + ", inviteName=" + this.inviteName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userId);
        parcel.writeString(this.nickName);
        parcel.writeString(this.avatar);
        parcel.writeString(this.inviteId);
        parcel.writeString(this.inviteName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.GroupAuditUserInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupAuditUserInfo> serializer() {
            return GroupAuditUserInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupAuditUserInfo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, GroupAuditUserInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = str;
        this.nickName = str2;
        this.avatar = str3;
        this.inviteId = str4;
        this.inviteName = str5;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupAuditUserInfo groupAuditUserInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, groupAuditUserInfo.userId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, groupAuditUserInfo.nickName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, groupAuditUserInfo.avatar);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, groupAuditUserInfo.inviteId);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, groupAuditUserInfo.inviteName);
    }

    public GroupAuditUserInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.userId = str;
        this.nickName = str2;
        this.avatar = str3;
        this.inviteId = str4;
        this.inviteName = str5;
    }
}
