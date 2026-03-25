package com.okinc.okimcore.model.room.inhouseim;

import androidx.room.TypeConverters;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.sIH;
import o.sIM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMContactInfoEntity {
    private final String avatar;
    private final Integer blacklisted;
    private final String channelId;
    private final String contactUid;
    private final String customNote;
    private final String enNickname;
    private final String nickname;
    private final String orbitBackgroundImage;
    private final Integer orbitStatus;
    private final String phoneHash;
    private final RelationPermission relationPermission;
    private final RelationSourceType relationSourceType;
    private final ContactRelationType relationType;
    private final String remarkName;
    private final List<UserTagType> tags;
    private final String userUid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, ContactRelationType.Companion.serializer(), null, null, null, null, null, new ArrayListSerializer(UserTagType.Companion.serializer()), null, RelationSourceType.Companion.serializer(), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMContactInfoEntity() {
        this((String) null, (String) null, (ContactRelationType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Integer) null, (RelationSourceType) null, (RelationPermission) null, (String) null, (String) null, (String) null, (Integer) null, 65535, (DefaultConstructorMarker) null);
    }

    @SerialName("contactPermission")
    public static /* synthetic */ void getRelationPermission$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contactUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.blacklisted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationSourceType component11() {
        return this.relationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationPermission component12() {
        return this.relationPermission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.phoneHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.customNote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.orbitBackgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component16() {
        return this.orbitStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactRelationType component3() {
        return this.relationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserTagType> component9() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMContactInfoEntity copy(@NotNull String str, String str2, @NotNull ContactRelationType contactRelationType, String str3, String str4, String str5, String str6, @NotNull String str7, @TypeConverters({sIM.class}) List<? extends UserTagType> list, Integer num, RelationSourceType relationSourceType, @TypeConverters({sIH.class}) RelationPermission relationPermission, String str8, String str9, String str10, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(contactRelationType, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new InHouseIMContactInfoEntity(str, str2, contactRelationType, str3, str4, str5, str6, str7, list, num, relationSourceType, relationPermission, str8, str9, str10, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMContactInfoEntity)) {
            return false;
        }
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity = (InHouseIMContactInfoEntity) obj;
        return Intrinsics.EZpvd((Object) this.contactUid, (Object) inHouseIMContactInfoEntity.contactUid) && Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMContactInfoEntity.channelId) && this.relationType == inHouseIMContactInfoEntity.relationType && Intrinsics.EZpvd((Object) this.remarkName, (Object) inHouseIMContactInfoEntity.remarkName) && Intrinsics.EZpvd((Object) this.nickname, (Object) inHouseIMContactInfoEntity.nickname) && Intrinsics.EZpvd((Object) this.enNickname, (Object) inHouseIMContactInfoEntity.enNickname) && Intrinsics.EZpvd((Object) this.avatar, (Object) inHouseIMContactInfoEntity.avatar) && Intrinsics.EZpvd((Object) this.userUid, (Object) inHouseIMContactInfoEntity.userUid) && Intrinsics.EZpvd(this.tags, inHouseIMContactInfoEntity.tags) && Intrinsics.EZpvd(this.blacklisted, inHouseIMContactInfoEntity.blacklisted) && this.relationSourceType == inHouseIMContactInfoEntity.relationSourceType && Intrinsics.EZpvd(this.relationPermission, inHouseIMContactInfoEntity.relationPermission) && Intrinsics.EZpvd((Object) this.phoneHash, (Object) inHouseIMContactInfoEntity.phoneHash) && Intrinsics.EZpvd((Object) this.customNote, (Object) inHouseIMContactInfoEntity.customNote) && Intrinsics.EZpvd((Object) this.orbitBackgroundImage, (Object) inHouseIMContactInfoEntity.orbitBackgroundImage) && Intrinsics.EZpvd(this.orbitStatus, inHouseIMContactInfoEntity.orbitStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBlacklisted() {
        return this.blacklisted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactUid() {
        return this.contactUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomNote() {
        return this.customNote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnNickname() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrbitBackgroundImage() {
        return this.orbitBackgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrbitStatus() {
        return this.orbitStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneHash() {
        return this.phoneHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationPermission getRelationPermission() {
        return this.relationPermission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationSourceType getRelationSourceType() {
        return this.relationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactRelationType getRelationType() {
        return this.relationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemarkName() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserTagType> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.contactUid.hashCode();
        String str = this.channelId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.relationType.hashCode();
        String str2 = this.remarkName;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nickname;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.enNickname;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.avatar;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        int iHashCode8 = this.userUid.hashCode();
        List<UserTagType> list = this.tags;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        Integer num = this.blacklisted;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        RelationSourceType relationSourceType = this.relationSourceType;
        int iHashCode11 = relationSourceType == null ? 0 : relationSourceType.hashCode();
        RelationPermission relationPermission = this.relationPermission;
        int iHashCode12 = relationPermission == null ? 0 : relationPermission.hashCode();
        String str6 = this.phoneHash;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.customNote;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.orbitBackgroundImage;
        int iHashCode15 = str8 == null ? 0 : str8.hashCode();
        Integer num2 = this.orbitStatus;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (num2 == null ? 0 : num2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMContactInfoEntity(contactUid=" + this.contactUid + ", channelId=" + this.channelId + ", relationType=" + this.relationType + ", remarkName=" + this.remarkName + ", nickname=" + this.nickname + ", enNickname=" + this.enNickname + ", avatar=" + this.avatar + ", userUid=" + this.userUid + ", tags=" + this.tags + ", blacklisted=" + this.blacklisted + ", relationSourceType=" + this.relationSourceType + ", relationPermission=" + this.relationPermission + ", phoneHash=" + this.phoneHash + ", customNote=" + this.customNote + ", orbitBackgroundImage=" + this.orbitBackgroundImage + ", orbitStatus=" + this.orbitStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMContactInfoEntity> serializer() {
            return InHouseIMContactInfoEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMContactInfoEntity(int i, String str, String str2, ContactRelationType contactRelationType, String str3, String str4, String str5, String str6, String str7, List list, Integer num, RelationSourceType relationSourceType, RelationPermission relationPermission, String str8, String str9, String str10, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contactUid = "";
        } else {
            this.contactUid = str;
        }
        if ((i & 2) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str2;
        }
        this.relationType = (i & 4) == 0 ? ContactRelationType.UNKNOWN : contactRelationType;
        if ((i & 8) == 0) {
            this.remarkName = "";
        } else {
            this.remarkName = str3;
        }
        if ((i & 16) == 0) {
            this.nickname = "";
        } else {
            this.nickname = str4;
        }
        if ((i & 32) == 0) {
            this.enNickname = "";
        } else {
            this.enNickname = str5;
        }
        if ((i & 64) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str6;
        }
        if ((i & 128) == 0) {
            this.userUid = "";
        } else {
            this.userUid = str7;
        }
        if ((i & 256) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i & 512) == 0) {
            this.blacklisted = null;
        } else {
            this.blacklisted = num;
        }
        if ((i & 1024) == 0) {
            this.relationSourceType = null;
        } else {
            this.relationSourceType = relationSourceType;
        }
        if ((i & 2048) == 0) {
            this.relationPermission = null;
        } else {
            this.relationPermission = relationPermission;
        }
        if ((i & 4096) == 0) {
            this.phoneHash = null;
        } else {
            this.phoneHash = str8;
        }
        if ((i & 8192) == 0) {
            this.customNote = null;
        } else {
            this.customNote = str9;
        }
        if ((i & 16384) == 0) {
            this.orbitBackgroundImage = null;
        } else {
            this.orbitBackgroundImage = str10;
        }
        if ((i & 32768) == 0) {
            this.orbitStatus = null;
        } else {
            this.orbitStatus = num2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMContactInfoEntity inHouseIMContactInfoEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseIMContactInfoEntity.contactUid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMContactInfoEntity.contactUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMContactInfoEntity.channelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseIMContactInfoEntity.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMContactInfoEntity.relationType != ContactRelationType.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], inHouseIMContactInfoEntity.relationType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) inHouseIMContactInfoEntity.remarkName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inHouseIMContactInfoEntity.remarkName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) inHouseIMContactInfoEntity.nickname, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inHouseIMContactInfoEntity.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) inHouseIMContactInfoEntity.enNickname, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, inHouseIMContactInfoEntity.enNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) inHouseIMContactInfoEntity.avatar, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, inHouseIMContactInfoEntity.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) inHouseIMContactInfoEntity.userUid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, inHouseIMContactInfoEntity.userUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inHouseIMContactInfoEntity.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], inHouseIMContactInfoEntity.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseIMContactInfoEntity.blacklisted != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, inHouseIMContactInfoEntity.blacklisted);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inHouseIMContactInfoEntity.relationSourceType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], inHouseIMContactInfoEntity.relationSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || inHouseIMContactInfoEntity.relationPermission != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, RelationPermission$$serializer.INSTANCE, inHouseIMContactInfoEntity.relationPermission);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || inHouseIMContactInfoEntity.phoneHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, inHouseIMContactInfoEntity.phoneHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || inHouseIMContactInfoEntity.customNote != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, inHouseIMContactInfoEntity.customNote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || inHouseIMContactInfoEntity.orbitBackgroundImage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, inHouseIMContactInfoEntity.orbitBackgroundImage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && inHouseIMContactInfoEntity.orbitStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, inHouseIMContactInfoEntity.orbitStatus);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.List<? extends com.okinc.okimcore.model.im.inhouseim.UserTagType> */
    /* JADX WARN: Multi-variable type inference failed */
    public InHouseIMContactInfoEntity(@NotNull String str, String str2, @NotNull ContactRelationType contactRelationType, String str3, String str4, String str5, String str6, @NotNull String str7, @TypeConverters({sIM.class}) List<? extends UserTagType> list, Integer num, RelationSourceType relationSourceType, @TypeConverters({sIH.class}) RelationPermission relationPermission, String str8, String str9, String str10, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(contactRelationType, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.contactUid = str;
        this.channelId = str2;
        this.relationType = contactRelationType;
        this.remarkName = str3;
        this.nickname = str4;
        this.enNickname = str5;
        this.avatar = str6;
        this.userUid = str7;
        this.tags = list;
        this.blacklisted = num;
        this.relationSourceType = relationSourceType;
        this.relationPermission = relationPermission;
        this.phoneHash = str8;
        this.customNote = str9;
        this.orbitBackgroundImage = str10;
        this.orbitStatus = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a9: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ContactRelationType:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: SGET  A[WRAPPED] (LINE:31) com.okinc.okimcore.model.im.inhouseim.ContactRelationType.UNKNOWN com.okinc.okimcore.model.im.inhouseim.ContactRelationType) : (r20v0 com.okinc.okimcore.model.im.inhouseim.ContactRelationType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r34v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r27v0 java.lang.Integer))
  (wrap:com.okinc.okimcore.model.im.RelationSourceType:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.RelationSourceType) : (r28v0 com.okinc.okimcore.model.im.RelationSourceType))
  (wrap:com.okinc.okimcore.model.room.inhouseim.RelationPermission:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.room.inhouseim.RelationPermission) : (r29v0 com.okinc.okimcore.model.room.inhouseim.RelationPermission))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0074: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x007f: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r33v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ContactRelationType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends com.okinc.okimcore.model.im.inhouseim.UserTagType>, java.lang.Integer, com.okinc.okimcore.model.im.RelationSourceType, com.okinc.okimcore.model.room.inhouseim.RelationPermission, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:27) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity.<init>(java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ContactRelationType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, com.okinc.okimcore.model.im.RelationSourceType, com.okinc.okimcore.model.room.inhouseim.RelationPermission, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ InHouseIMContactInfoEntity(String str, String str2, ContactRelationType contactRelationType, String str3, String str4, String str5, String str6, String str7, List list, Integer num, RelationSourceType relationSourceType, RelationPermission relationPermission, String str8, String str9, String str10, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ContactRelationType.UNKNOWN : contactRelationType, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : relationSourceType, (i & 2048) != 0 ? null : relationPermission, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : str10, (i & 32768) != 0 ? null : num2);
    }
}
