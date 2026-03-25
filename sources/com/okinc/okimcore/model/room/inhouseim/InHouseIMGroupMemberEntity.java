package com.okinc.okimcore.model.room.inhouseim;

import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus$$serializer;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
import com.okinc.okimcore.model.utility.GroupMemberExtField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C44157sFk;
import o.C44474sRd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMGroupMemberEntity {
    private String _v1Field;
    private String _v3Field;
    private String avatar;
    private long createTime;
    private String enNickname;
    private String groupId;
    private String inviteId;
    private String memberId;
    private String name;
    private String nickName;
    private OfficialTagInfo officialTagInfo;
    private PaidGroupMemberStatus paidGroupMemberStatus;
    private int role;
    private int status;
    private long updateTime;
    private String v2Field;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMGroupMemberEntity() {
        this(null, null, null, 0, null, null, null, 0, 0L, 0L, null, null, null, null, null, null, 65535, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component11() {
        return this._v1Field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component13() {
        return this._v3Field;
    }

    @SerialName("memberAvatar")
    public static /* synthetic */ void getAvatar$annotations() {
    }

    @SerialName("createTime")
    public static /* synthetic */ void getCreateTime$annotations() {
    }

    @SerialName("memberEnPetname")
    public static /* synthetic */ void getEnNickname$annotations() {
    }

    @SerialName("groupId")
    public static /* synthetic */ void getGroupId$annotations() {
    }

    @SerialName("inviteId")
    public static /* synthetic */ void getInviteId$annotations() {
    }

    @SerialName("memberId")
    public static /* synthetic */ void getMemberId$annotations() {
    }

    @SerialName("memberName")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("memberGroupPetname")
    public static /* synthetic */ void getNickName$annotations() {
    }

    @SerialName("officialTag")
    public static /* synthetic */ void getOfficialTagInfo$annotations() {
    }

    @SerialName("role")
    public static /* synthetic */ void getRole$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @SerialName("updateTime")
    public static /* synthetic */ void getUpdateTime$annotations() {
    }

    @SerialName("memberRemark")
    public static /* synthetic */ void getV2Field$annotations() {
    }

    @Transient
    private static /* synthetic */ void get_v1Field$annotations() {
    }

    @SerialName("v3")
    private static /* synthetic */ void get_v3Field$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.memberId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.v2Field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo component14() {
        return this.officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupMemberStatus component16() {
        return this.paidGroupMemberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.inviteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupMemberEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, long j, long j2, @NotNull String str7, @NotNull String str8, @NotNull String str9, OfficialTagInfo officialTagInfo, String str10, PaidGroupMemberStatus paidGroupMemberStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new InHouseIMGroupMemberEntity(str, str2, str3, i, str4, str5, str6, i2, j, j2, str7, str8, str9, officialTagInfo, str10, paidGroupMemberStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMGroupMemberEntity)) {
            return false;
        }
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity = (InHouseIMGroupMemberEntity) obj;
        return Intrinsics.EZpvd((Object) this.memberId, (Object) inHouseIMGroupMemberEntity.memberId) && Intrinsics.EZpvd((Object) this.groupId, (Object) inHouseIMGroupMemberEntity.groupId) && Intrinsics.EZpvd((Object) this.inviteId, (Object) inHouseIMGroupMemberEntity.inviteId) && this.role == inHouseIMGroupMemberEntity.role && Intrinsics.EZpvd((Object) this.name, (Object) inHouseIMGroupMemberEntity.name) && Intrinsics.EZpvd((Object) this.nickName, (Object) inHouseIMGroupMemberEntity.nickName) && Intrinsics.EZpvd((Object) this.avatar, (Object) inHouseIMGroupMemberEntity.avatar) && this.status == inHouseIMGroupMemberEntity.status && this.createTime == inHouseIMGroupMemberEntity.createTime && this.updateTime == inHouseIMGroupMemberEntity.updateTime && Intrinsics.EZpvd((Object) this._v1Field, (Object) inHouseIMGroupMemberEntity._v1Field) && Intrinsics.EZpvd((Object) this.v2Field, (Object) inHouseIMGroupMemberEntity.v2Field) && Intrinsics.EZpvd((Object) this._v3Field, (Object) inHouseIMGroupMemberEntity._v3Field) && Intrinsics.EZpvd(this.officialTagInfo, inHouseIMGroupMemberEntity.officialTagInfo) && Intrinsics.EZpvd((Object) this.enNickname, (Object) inHouseIMGroupMemberEntity.enNickname) && Intrinsics.EZpvd(this.paidGroupMemberStatus, inHouseIMGroupMemberEntity.paidGroupMemberStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnNickname() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviteId() {
        return this.inviteId;
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
    public final OfficialTagInfo getOfficialTagInfo() {
        return this.officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupMemberStatus getPaidGroupMemberStatus() {
        return this.paidGroupMemberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getV2Field() {
        return this.v2Field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.memberId.hashCode();
        int iHashCode2 = this.groupId.hashCode();
        int iHashCode3 = this.inviteId.hashCode();
        int iHashCode4 = Integer.hashCode(this.role);
        int iHashCode5 = this.name.hashCode();
        int iHashCode6 = this.nickName.hashCode();
        int iHashCode7 = this.avatar.hashCode();
        int iHashCode8 = Integer.hashCode(this.status);
        int iHashCode9 = Long.hashCode(this.createTime);
        int iHashCode10 = Long.hashCode(this.updateTime);
        int iHashCode11 = this._v1Field.hashCode();
        int iHashCode12 = this.v2Field.hashCode();
        int iHashCode13 = this._v3Field.hashCode();
        OfficialTagInfo officialTagInfo = this.officialTagInfo;
        int iHashCode14 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        String str = this.enNickname;
        int iHashCode15 = str == null ? 0 : str.hashCode();
        PaidGroupMemberStatus paidGroupMemberStatus = this.paidGroupMemberStatus;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (paidGroupMemberStatus == null ? 0 : paidGroupMemberStatus.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnNickname(String str) {
        this.enNickname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviteId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inviteId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemberId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.memberId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nickName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOfficialTagInfo(OfficialTagInfo officialTagInfo) {
        this.officialTagInfo = officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaidGroupMemberStatus(PaidGroupMemberStatus paidGroupMemberStatus) {
        this.paidGroupMemberStatus = paidGroupMemberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRole(int i) {
        this.role = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setV1Field(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this._v1Field = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setV2Field(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.v2Field = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setV3Field(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this._v3Field = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMGroupMemberEntity(memberId=" + this.memberId + ", groupId=" + this.groupId + ", inviteId=" + this.inviteId + ", role=" + this.role + ", name=" + this.name + ", nickName=" + this.nickName + ", avatar=" + this.avatar + ", status=" + this.status + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", _v1Field=" + this._v1Field + ", v2Field=" + this.v2Field + ", _v3Field=" + this._v3Field + ", officialTagInfo=" + this.officialTagInfo + ", enNickname=" + this.enNickname + ", paidGroupMemberStatus=" + this.paidGroupMemberStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGroupMemberEntity> serializer() {
            return InHouseIMGroupMemberEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMGroupMemberEntity(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, int i3, long j, long j2, String str7, String str8, OfficialTagInfo officialTagInfo, String str9, PaidGroupMemberStatus paidGroupMemberStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.memberId = "";
        } else {
            this.memberId = str;
        }
        if ((i & 2) == 0) {
            this.groupId = "";
        } else {
            this.groupId = str2;
        }
        if ((i & 4) == 0) {
            this.inviteId = "";
        } else {
            this.inviteId = str3;
        }
        this.role = (i & 8) == 0 ? 2 : i2;
        if ((i & 16) == 0) {
            this.name = "";
        } else {
            this.name = str4;
        }
        if ((i & 32) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str5;
        }
        if ((i & 64) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str6;
        }
        this.status = (i & 128) == 0 ? 0 : i3;
        if ((i & 256) == 0) {
            this.createTime = 0L;
        } else {
            this.createTime = j;
        }
        this.updateTime = (i & 512) != 0 ? j2 : 0L;
        this._v1Field = "";
        if ((i & 1024) == 0) {
            this.v2Field = "";
        } else {
            this.v2Field = str7;
        }
        if ((i & 2048) == 0) {
            this._v3Field = "";
        } else {
            this._v3Field = str8;
        }
        if ((i & 4096) == 0) {
            this.officialTagInfo = null;
        } else {
            this.officialTagInfo = officialTagInfo;
        }
        if ((i & 8192) == 0) {
            this.enNickname = null;
        } else {
            this.enNickname = str9;
        }
        if ((i & 16384) == 0) {
            this.paidGroupMemberStatus = null;
        } else {
            this.paidGroupMemberStatus = paidGroupMemberStatus;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseIMGroupMemberEntity.memberId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMGroupMemberEntity.memberId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inHouseIMGroupMemberEntity.groupId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, inHouseIMGroupMemberEntity.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) inHouseIMGroupMemberEntity.inviteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, inHouseIMGroupMemberEntity.inviteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMGroupMemberEntity.role != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, inHouseIMGroupMemberEntity.role);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) inHouseIMGroupMemberEntity.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, inHouseIMGroupMemberEntity.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) inHouseIMGroupMemberEntity.nickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, inHouseIMGroupMemberEntity.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) inHouseIMGroupMemberEntity.avatar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, inHouseIMGroupMemberEntity.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inHouseIMGroupMemberEntity.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, inHouseIMGroupMemberEntity.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inHouseIMGroupMemberEntity.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 8, inHouseIMGroupMemberEntity.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseIMGroupMemberEntity.updateTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 9, inHouseIMGroupMemberEntity.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) inHouseIMGroupMemberEntity.v2Field, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, inHouseIMGroupMemberEntity.v2Field);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) inHouseIMGroupMemberEntity._v3Field, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, inHouseIMGroupMemberEntity._v3Field);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || inHouseIMGroupMemberEntity.officialTagInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, OfficialTagInfo$$serializer.INSTANCE, inHouseIMGroupMemberEntity.officialTagInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || inHouseIMGroupMemberEntity.enNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, inHouseIMGroupMemberEntity.enNickname);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && inHouseIMGroupMemberEntity.paidGroupMemberStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, PaidGroupMemberStatus$$serializer.INSTANCE, inHouseIMGroupMemberEntity.paidGroupMemberStatus);
    }

    public InHouseIMGroupMemberEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, long j, long j2, @NotNull String str7, @NotNull String str8, @NotNull String str9, OfficialTagInfo officialTagInfo, String str10, PaidGroupMemberStatus paidGroupMemberStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.memberId = str;
        this.groupId = str2;
        this.inviteId = str3;
        this.role = i;
        this.name = str4;
        this.nickName = str5;
        this.avatar = str6;
        this.status = i2;
        this.createTime = j;
        this.updateTime = j2;
        this._v1Field = str7;
        this.v2Field = str8;
        this._v3Field = str9;
        this.officialTagInfo = officialTagInfo;
        this.enNickname = str10;
        this.paidGroupMemberStatus = paidGroupMemberStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r23v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0044: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r28v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x004e: ARITH (r38v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r30v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:0x0070: TERNARY null = ((wrap:int:0x0067: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:0x007d: TERNARY null = ((wrap:int:0x0072: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r35v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007f: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus:?: TERNARY null = ((wrap:int:0x008b: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) == (0 int)) ? (r37v0 com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus) : (null com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.String, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus):void (m)] (LINE:20) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.String, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus):void type: THIS */
    public /* synthetic */ InHouseIMGroupMemberEntity(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, long j, long j2, String str7, String str8, String str9, OfficialTagInfo officialTagInfo, String str10, PaidGroupMemberStatus paidGroupMemberStatus, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 2 : i, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? 0L : j, (i3 & 512) == 0 ? j2 : 0L, (i3 & 1024) != 0 ? "" : str7, (i3 & 2048) != 0 ? "" : str8, (i3 & 4096) != 0 ? "" : str9, (i3 & 8192) != 0 ? null : officialTagInfo, (i3 & 16384) != 0 ? null : str10, (i3 & 32768) == 0 ? paidGroupMemberStatus : null);
    }

    public final String getEnPetname() {
        String enNickName;
        GroupMemberExtField groupMemberExtFieldAEQbTJ = GroupMemberExtField.Companion.AEQbTJ(getV3Field());
        return (groupMemberExtFieldAEQbTJ == null || (enNickName = groupMemberExtFieldAEQbTJ.getEnNickName()) == null) ? "" : enNickName;
    }

    public final String getV1Field() {
        String str = this._v1Field;
        return (StringsKt__StringsKt.fARcdN((CharSequence) str) || C44157sFk.AEQbTJ(str)) ? C44474sRd.KWHzl.OLrzqt(this.officialTagInfo) : str;
    }

    public final String getV3Field() {
        String str = this._v3Field;
        return (StringsKt__StringsKt.fARcdN((CharSequence) str) || C44157sFk.AEQbTJ(str)) ? new GroupMemberExtField(this.enNickname).toJson() : str;
    }
}
