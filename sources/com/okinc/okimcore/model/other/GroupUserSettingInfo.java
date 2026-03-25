package com.okinc.okimcore.model.other;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupUserSettingInfo implements Parcelable {
    public static final int $stable = 0;
    private final AffiliateUserType affiliateUserType;
    private final String groupId;
    private final String groupNickName;
    private final boolean isNoDisturb;
    private final boolean isTop;
    private final GroupRole role;
    private final String userEnNickName;
    private final String userNickName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GroupUserSettingInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, GroupRole.Companion.serializer(), null, null, AffiliateUserType.CREATOR.serializer()};

    public static final class Creator implements Parcelable.Creator<GroupUserSettingInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupUserSettingInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupUserSettingInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), GroupRole.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, (AffiliateUserType) parcel.readParcelable(GroupUserSettingInfo.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupUserSettingInfo[] newArray(int i) {
            return new GroupUserSettingInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.groupNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.userNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.userEnNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRole component5() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isNoDisturb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AffiliateUserType component8() {
        return this.affiliateUserType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupUserSettingInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull GroupRole groupRole, boolean z, boolean z2, @NotNull AffiliateUserType affiliateUserType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(groupRole, "");
        Intrinsics.checkNotNullParameter(affiliateUserType, "");
        return new GroupUserSettingInfo(str, str2, str3, str4, groupRole, z, z2, affiliateUserType);
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
        if (!(obj instanceof GroupUserSettingInfo)) {
            return false;
        }
        GroupUserSettingInfo groupUserSettingInfo = (GroupUserSettingInfo) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) groupUserSettingInfo.groupId) && Intrinsics.EZpvd((Object) this.groupNickName, (Object) groupUserSettingInfo.groupNickName) && Intrinsics.EZpvd((Object) this.userNickName, (Object) groupUserSettingInfo.userNickName) && Intrinsics.EZpvd((Object) this.userEnNickName, (Object) groupUserSettingInfo.userEnNickName) && this.role == groupUserSettingInfo.role && this.isNoDisturb == groupUserSettingInfo.isNoDisturb && this.isTop == groupUserSettingInfo.isTop && this.affiliateUserType == groupUserSettingInfo.affiliateUserType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AffiliateUserType getAffiliateUserType() {
        return this.affiliateUserType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupNickName() {
        return this.groupNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRole getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserEnNickName() {
        return this.userEnNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserNickName() {
        return this.userNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.groupId.hashCode();
        int iHashCode2 = this.groupNickName.hashCode();
        int iHashCode3 = this.userNickName.hashCode();
        String str = this.userEnNickName;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.role.hashCode()) * 31) + Boolean.hashCode(this.isNoDisturb)) * 31) + Boolean.hashCode(this.isTop)) * 31) + this.affiliateUserType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNoDisturb() {
        return this.isNoDisturb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTop() {
        return this.isTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupUserSettingInfo(groupId=" + this.groupId + ", groupNickName=" + this.groupNickName + ", userNickName=" + this.userNickName + ", userEnNickName=" + this.userEnNickName + ", role=" + this.role + ", isNoDisturb=" + this.isNoDisturb + ", isTop=" + this.isTop + ", affiliateUserType=" + this.affiliateUserType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.groupId);
        parcel.writeString(this.groupNickName);
        parcel.writeString(this.userNickName);
        parcel.writeString(this.userEnNickName);
        this.role.writeToParcel(parcel, i);
        parcel.writeInt(this.isNoDisturb ? 1 : 0);
        parcel.writeInt(this.isTop ? 1 : 0);
        parcel.writeParcelable(this.affiliateUserType, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.GroupUserSettingInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupUserSettingInfo> serializer() {
            return GroupUserSettingInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupUserSettingInfo(int i, String str, String str2, String str3, String str4, GroupRole groupRole, boolean z, boolean z2, AffiliateUserType affiliateUserType, SerializationConstructorMarker serializationConstructorMarker) {
        if (247 != (i & 247)) {
            PluginExceptionsKt.throwMissingFieldException(i, 247, GroupUserSettingInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = str;
        this.groupNickName = str2;
        this.userNickName = str3;
        if ((i & 8) == 0) {
            this.userEnNickName = null;
        } else {
            this.userEnNickName = str4;
        }
        this.role = groupRole;
        this.isNoDisturb = z;
        this.isTop = z2;
        this.affiliateUserType = affiliateUserType;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupUserSettingInfo groupUserSettingInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, groupUserSettingInfo.groupId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, groupUserSettingInfo.groupNickName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, groupUserSettingInfo.userNickName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupUserSettingInfo.userEnNickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, groupUserSettingInfo.userEnNickName);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], groupUserSettingInfo.role);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, groupUserSettingInfo.isNoDisturb);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 6, groupUserSettingInfo.isTop);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], groupUserSettingInfo.affiliateUserType);
    }

    public GroupUserSettingInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull GroupRole groupRole, boolean z, boolean z2, @NotNull AffiliateUserType affiliateUserType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(groupRole, "");
        Intrinsics.checkNotNullParameter(affiliateUserType, "");
        this.groupId = str;
        this.groupNickName = str2;
        this.userNickName = str3;
        this.userEnNickName = str4;
        this.role = groupRole;
        this.isNoDisturb = z;
        this.isTop = z2;
        this.affiliateUserType = affiliateUserType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (r15v0 com.okinc.okimcore.model.other.GroupRole)
  (r16v0 boolean)
  (r17v0 boolean)
  (r18v0 com.okinc.okimcore.model.other.AffiliateUserType)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.other.GroupRole, boolean, boolean, com.okinc.okimcore.model.other.AffiliateUserType):void (m)] (LINE:17) call: com.okinc.okimcore.model.other.GroupUserSettingInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.other.GroupRole, boolean, boolean, com.okinc.okimcore.model.other.AffiliateUserType):void type: THIS */
    public /* synthetic */ GroupUserSettingInfo(String str, String str2, String str3, String str4, GroupRole groupRole, boolean z, boolean z2, AffiliateUserType affiliateUserType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, groupRole, z, z2, affiliateUserType);
    }
}
