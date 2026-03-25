package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus$$serializer;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupMemberInfo implements Parcelable {
    private final String avatar;
    private String displayAlphabetText;
    private final String enPetname;
    private final String groupId;
    private final boolean isCurrentUser;
    private final String memberId;
    private final String name;
    private final String nickName;
    private OfficialTagInfo officialTags;
    private final PaidGroupMemberStatus paidGroupMemberStatus;
    private final String phoneName;
    private final String remarkName;
    private final GroupRole role;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GroupMemberInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, GroupRole.Companion.serializer(), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<GroupMemberInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupMemberInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupMemberInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, GroupRole.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OfficialTagInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? PaidGroupMemberStatus.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupMemberInfo[] newArray(int i) {
            return new GroupMemberInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.memberId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.enPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.displayAlphabetText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.phoneName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupMemberStatus component13() {
        return this.paidGroupMemberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isCurrentUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRole component8() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo component9() {
        return this.officialTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupMemberInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, boolean z, @NotNull GroupRole groupRole, OfficialTagInfo officialTagInfo, String str7, @NotNull String str8, String str9, PaidGroupMemberStatus paidGroupMemberStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(groupRole, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new GroupMemberInfo(str, str2, str3, str4, str5, str6, z, groupRole, officialTagInfo, str7, str8, str9, paidGroupMemberStatus);
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
        if (!(obj instanceof GroupMemberInfo)) {
            return false;
        }
        GroupMemberInfo groupMemberInfo = (GroupMemberInfo) obj;
        return Intrinsics.EZpvd((Object) this.memberId, (Object) groupMemberInfo.memberId) && Intrinsics.EZpvd((Object) this.groupId, (Object) groupMemberInfo.groupId) && Intrinsics.EZpvd((Object) this.name, (Object) groupMemberInfo.name) && Intrinsics.EZpvd((Object) this.nickName, (Object) groupMemberInfo.nickName) && Intrinsics.EZpvd((Object) this.remarkName, (Object) groupMemberInfo.remarkName) && Intrinsics.EZpvd((Object) this.avatar, (Object) groupMemberInfo.avatar) && this.isCurrentUser == groupMemberInfo.isCurrentUser && this.role == groupMemberInfo.role && Intrinsics.EZpvd(this.officialTags, groupMemberInfo.officialTags) && Intrinsics.EZpvd((Object) this.enPetname, (Object) groupMemberInfo.enPetname) && Intrinsics.EZpvd((Object) this.displayAlphabetText, (Object) groupMemberInfo.displayAlphabetText) && Intrinsics.EZpvd((Object) this.phoneName, (Object) groupMemberInfo.phoneName) && Intrinsics.EZpvd(this.paidGroupMemberStatus, groupMemberInfo.paidGroupMemberStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayAlphabetText() {
        return this.displayAlphabetText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnPetname() {
        return this.enPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemberId() {
        return this.memberId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo getOfficialTags() {
        return this.officialTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupMemberStatus getPaidGroupMemberStatus() {
        return this.paidGroupMemberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneName() {
        return this.phoneName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemarkName() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRole getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.memberId.hashCode();
        int iHashCode2 = this.groupId.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.nickName.hashCode();
        String str = this.remarkName;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.avatar.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isCurrentUser);
        int iHashCode8 = this.role.hashCode();
        OfficialTagInfo officialTagInfo = this.officialTags;
        int iHashCode9 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        String str2 = this.enPetname;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        int iHashCode11 = this.displayAlphabetText.hashCode();
        String str3 = this.phoneName;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        PaidGroupMemberStatus paidGroupMemberStatus = this.paidGroupMemberStatus;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (paidGroupMemberStatus != null ? paidGroupMemberStatus.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCurrentUser() {
        return this.isCurrentUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayAlphabetText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayAlphabetText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOfficialTags(OfficialTagInfo officialTagInfo) {
        this.officialTags = officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupMemberInfo(memberId=" + this.memberId + ", groupId=" + this.groupId + ", name=" + this.name + ", nickName=" + this.nickName + ", remarkName=" + this.remarkName + ", avatar=" + this.avatar + ", isCurrentUser=" + this.isCurrentUser + ", role=" + this.role + ", officialTags=" + this.officialTags + ", enPetname=" + this.enPetname + ", displayAlphabetText=" + this.displayAlphabetText + ", phoneName=" + this.phoneName + ", paidGroupMemberStatus=" + this.paidGroupMemberStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.memberId);
        parcel.writeString(this.groupId);
        parcel.writeString(this.name);
        parcel.writeString(this.nickName);
        parcel.writeString(this.remarkName);
        parcel.writeString(this.avatar);
        parcel.writeInt(this.isCurrentUser ? 1 : 0);
        this.role.writeToParcel(parcel, i);
        OfficialTagInfo officialTagInfo = this.officialTags;
        if (officialTagInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            officialTagInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.enPetname);
        parcel.writeString(this.displayAlphabetText);
        parcel.writeString(this.phoneName);
        PaidGroupMemberStatus paidGroupMemberStatus = this.paidGroupMemberStatus;
        if (paidGroupMemberStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paidGroupMemberStatus.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.GroupMemberInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupMemberInfo> serializer() {
            return GroupMemberInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupMemberInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, GroupRole groupRole, OfficialTagInfo officialTagInfo, String str7, String str8, String str9, PaidGroupMemberStatus paidGroupMemberStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if (191 != (i & 191)) {
            PluginExceptionsKt.throwMissingFieldException(i, 191, GroupMemberInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.memberId = str;
        this.groupId = str2;
        this.name = str3;
        this.nickName = str4;
        this.remarkName = str5;
        this.avatar = str6;
        this.isCurrentUser = (i & 64) == 0 ? false : z;
        this.role = groupRole;
        if ((i & 256) == 0) {
            this.officialTags = null;
        } else {
            this.officialTags = officialTagInfo;
        }
        if ((i & 512) == 0) {
            this.enPetname = null;
        } else {
            this.enPetname = str7;
        }
        this.displayAlphabetText = (i & 1024) == 0 ? "" : str8;
        if ((i & 2048) == 0) {
            this.phoneName = null;
        } else {
            this.phoneName = str9;
        }
        if ((i & 4096) == 0) {
            this.paidGroupMemberStatus = null;
        } else {
            this.paidGroupMemberStatus = paidGroupMemberStatus;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupMemberInfo groupMemberInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, groupMemberInfo.memberId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, groupMemberInfo.groupId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, groupMemberInfo.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, groupMemberInfo.nickName);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, groupMemberInfo.remarkName);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, groupMemberInfo.avatar);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || groupMemberInfo.isCurrentUser) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, groupMemberInfo.isCurrentUser);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], groupMemberInfo.role);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || groupMemberInfo.officialTags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, OfficialTagInfo$$serializer.INSTANCE, groupMemberInfo.officialTags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || groupMemberInfo.enPetname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, groupMemberInfo.enPetname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) groupMemberInfo.displayAlphabetText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, groupMemberInfo.displayAlphabetText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || groupMemberInfo.phoneName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, groupMemberInfo.phoneName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && groupMemberInfo.paidGroupMemberStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, PaidGroupMemberStatus$$serializer.INSTANCE, groupMemberInfo.paidGroupMemberStatus);
    }

    public GroupMemberInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, boolean z, @NotNull GroupRole groupRole, OfficialTagInfo officialTagInfo, String str7, @NotNull String str8, String str9, PaidGroupMemberStatus paidGroupMemberStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(groupRole, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.memberId = str;
        this.groupId = str2;
        this.name = str3;
        this.nickName = str4;
        this.remarkName = str5;
        this.avatar = str6;
        this.isCurrentUser = z;
        this.role = groupRole;
        this.officialTags = officialTagInfo;
        this.enPetname = str7;
        this.displayAlphabetText = str8;
        this.phoneName = str9;
        this.paidGroupMemberStatus = paidGroupMemberStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (r24v0 com.okinc.okimcore.model.other.GroupRole)
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r25v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus:?: TERNARY null = ((wrap:int:0x002e: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus) : (r29v0 com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.okimcore.model.other.GroupRole, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus):void (m)] (LINE:19) call: com.okinc.okimcore.model.other.GroupMemberInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.okimcore.model.other.GroupRole, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus):void type: THIS */
    public /* synthetic */ GroupMemberInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z, GroupRole groupRole, OfficialTagInfo officialTagInfo, String str7, String str8, String str9, PaidGroupMemberStatus paidGroupMemberStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? false : z, groupRole, (i & 256) != 0 ? null : officialTagInfo, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : paidGroupMemberStatus);
    }
}
