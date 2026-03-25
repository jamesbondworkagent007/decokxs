package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseUserInfo {
    private final String avatar;
    private final String bio;
    private final InHouseUserConfigDto config;
    private final String enBio;
    private final String enNickname;
    private final String nickname;
    private final Long phoneSyncQuota;
    private final List<UserTagType> tags;
    private final UserGlobalPermissionDto userGlobalPermissionDto;
    private final UserPrivacySettingsDto userPrivacySettingsDto;
    private final String userUid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(UserTagType.Companion.serializer()), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseUserInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (UserPrivacySettingsDto) null, (UserGlobalPermissionDto) null, (Long) null, (InHouseUserConfigDto) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.phoneSyncQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseUserConfigDto component11() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.enBio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserTagType> component7() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserPrivacySettingsDto component8() {
        return this.userPrivacySettingsDto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserGlobalPermissionDto component9() {
        return this.userGlobalPermissionDto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseUserInfo copy(String str, String str2, String str3, String str4, String str5, String str6, List<? extends UserTagType> list, UserPrivacySettingsDto userPrivacySettingsDto, UserGlobalPermissionDto userGlobalPermissionDto, Long l, InHouseUserConfigDto inHouseUserConfigDto) {
        return new InHouseUserInfo(str, str2, str3, str4, str5, str6, list, userPrivacySettingsDto, userGlobalPermissionDto, l, inHouseUserConfigDto);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseUserInfo)) {
            return false;
        }
        InHouseUserInfo inHouseUserInfo = (InHouseUserInfo) obj;
        return Intrinsics.EZpvd((Object) this.userUid, (Object) inHouseUserInfo.userUid) && Intrinsics.EZpvd((Object) this.avatar, (Object) inHouseUserInfo.avatar) && Intrinsics.EZpvd((Object) this.nickname, (Object) inHouseUserInfo.nickname) && Intrinsics.EZpvd((Object) this.enNickname, (Object) inHouseUserInfo.enNickname) && Intrinsics.EZpvd((Object) this.bio, (Object) inHouseUserInfo.bio) && Intrinsics.EZpvd((Object) this.enBio, (Object) inHouseUserInfo.enBio) && Intrinsics.EZpvd(this.tags, inHouseUserInfo.tags) && Intrinsics.EZpvd(this.userPrivacySettingsDto, inHouseUserInfo.userPrivacySettingsDto) && Intrinsics.EZpvd(this.userGlobalPermissionDto, inHouseUserInfo.userGlobalPermissionDto) && Intrinsics.EZpvd(this.phoneSyncQuota, inHouseUserInfo.phoneSyncQuota) && Intrinsics.EZpvd(this.config, inHouseUserInfo.config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBio() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseUserConfigDto getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnBio() {
        return this.enBio;
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
    public final Long getPhoneSyncQuota() {
        return this.phoneSyncQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserTagType> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserGlobalPermissionDto getUserGlobalPermissionDto() {
        return this.userGlobalPermissionDto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserPrivacySettingsDto getUserPrivacySettingsDto() {
        return this.userPrivacySettingsDto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.userUid;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.avatar;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nickname;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.enNickname;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.bio;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.enBio;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        List<UserTagType> list = this.tags;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        UserPrivacySettingsDto userPrivacySettingsDto = this.userPrivacySettingsDto;
        int iHashCode8 = userPrivacySettingsDto == null ? 0 : userPrivacySettingsDto.hashCode();
        UserGlobalPermissionDto userGlobalPermissionDto = this.userGlobalPermissionDto;
        int iHashCode9 = userGlobalPermissionDto == null ? 0 : userGlobalPermissionDto.hashCode();
        Long l = this.phoneSyncQuota;
        int iHashCode10 = l == null ? 0 : l.hashCode();
        InHouseUserConfigDto inHouseUserConfigDto = this.config;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (inHouseUserConfigDto != null ? inHouseUserConfigDto.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseUserInfo(userUid=" + this.userUid + ", avatar=" + this.avatar + ", nickname=" + this.nickname + ", enNickname=" + this.enNickname + ", bio=" + this.bio + ", enBio=" + this.enBio + ", tags=" + this.tags + ", userPrivacySettingsDto=" + this.userPrivacySettingsDto + ", userGlobalPermissionDto=" + this.userGlobalPermissionDto + ", phoneSyncQuota=" + this.phoneSyncQuota + ", config=" + this.config + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseUserInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseUserInfo> serializer() {
            return InHouseUserInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseUserInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, UserPrivacySettingsDto userPrivacySettingsDto, UserGlobalPermissionDto userGlobalPermissionDto, Long l, InHouseUserConfigDto inHouseUserConfigDto, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.userUid = "";
        } else {
            this.userUid = str;
        }
        if ((i & 2) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str2;
        }
        if ((i & 4) == 0) {
            this.nickname = "";
        } else {
            this.nickname = str3;
        }
        if ((i & 8) == 0) {
            this.enNickname = "";
        } else {
            this.enNickname = str4;
        }
        if ((i & 16) == 0) {
            this.bio = "";
        } else {
            this.bio = str5;
        }
        if ((i & 32) == 0) {
            this.enBio = "";
        } else {
            this.enBio = str6;
        }
        if ((i & 64) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i & 128) == 0) {
            this.userPrivacySettingsDto = null;
        } else {
            this.userPrivacySettingsDto = userPrivacySettingsDto;
        }
        if ((i & 256) == 0) {
            this.userGlobalPermissionDto = null;
        } else {
            this.userGlobalPermissionDto = userGlobalPermissionDto;
        }
        if ((i & 512) == 0) {
            this.phoneSyncQuota = null;
        } else {
            this.phoneSyncQuota = l;
        }
        if ((i & 1024) == 0) {
            this.config = null;
        } else {
            this.config = inHouseUserConfigDto;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseUserInfo inHouseUserInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseUserInfo.userUid, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inHouseUserInfo.userUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inHouseUserInfo.avatar, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseUserInfo.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) inHouseUserInfo.nickname, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inHouseUserInfo.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) inHouseUserInfo.enNickname, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inHouseUserInfo.enNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) inHouseUserInfo.bio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inHouseUserInfo.bio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) inHouseUserInfo.enBio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, inHouseUserInfo.enBio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inHouseUserInfo.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], inHouseUserInfo.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inHouseUserInfo.userPrivacySettingsDto != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, UserPrivacySettingsDto$$serializer.INSTANCE, inHouseUserInfo.userPrivacySettingsDto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inHouseUserInfo.userGlobalPermissionDto != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, UserGlobalPermissionDto$$serializer.INSTANCE, inHouseUserInfo.userGlobalPermissionDto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseUserInfo.phoneSyncQuota != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, inHouseUserInfo.phoneSyncQuota);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && inHouseUserInfo.config == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, InHouseUserConfigDto$$serializer.INSTANCE, inHouseUserInfo.config);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.okinc.okimcore.model.im.inhouseim.UserTagType> */
    /* JADX WARN: Multi-variable type inference failed */
    public InHouseUserInfo(String str, String str2, String str3, String str4, String str5, String str6, List<? extends UserTagType> list, UserPrivacySettingsDto userPrivacySettingsDto, UserGlobalPermissionDto userGlobalPermissionDto, Long l, InHouseUserConfigDto inHouseUserConfigDto) {
        this.userUid = str;
        this.avatar = str2;
        this.nickname = str3;
        this.enNickname = str4;
        this.bio = str5;
        this.enBio = str6;
        this.tags = list;
        this.userPrivacySettingsDto = userPrivacySettingsDto;
        this.userGlobalPermissionDto = userGlobalPermissionDto;
        this.phoneSyncQuota = l;
        this.config = inHouseUserConfigDto;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (wrap:com.okinc.okimcore.model.remote.UserPrivacySettingsDto:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.UserPrivacySettingsDto) : (r20v0 com.okinc.okimcore.model.remote.UserPrivacySettingsDto))
  (wrap:com.okinc.okimcore.model.remote.UserGlobalPermissionDto:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.UserGlobalPermissionDto) : (r21v0 com.okinc.okimcore.model.remote.UserGlobalPermissionDto))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.remote.InHouseUserConfigDto:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 com.okinc.okimcore.model.remote.InHouseUserConfigDto) : (null com.okinc.okimcore.model.remote.InHouseUserConfigDto))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends com.okinc.okimcore.model.im.inhouseim.UserTagType>, com.okinc.okimcore.model.remote.UserPrivacySettingsDto, com.okinc.okimcore.model.remote.UserGlobalPermissionDto, java.lang.Long, com.okinc.okimcore.model.remote.InHouseUserConfigDto):void (m)] (LINE:9) call: com.okinc.okimcore.model.remote.InHouseUserInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.okimcore.model.remote.UserPrivacySettingsDto, com.okinc.okimcore.model.remote.UserGlobalPermissionDto, java.lang.Long, com.okinc.okimcore.model.remote.InHouseUserConfigDto):void type: THIS */
    public /* synthetic */ InHouseUserInfo(String str, String str2, String str3, String str4, String str5, String str6, List list, UserPrivacySettingsDto userPrivacySettingsDto, UserGlobalPermissionDto userGlobalPermissionDto, Long l, InHouseUserConfigDto inHouseUserConfigDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : userPrivacySettingsDto, (i & 256) != 0 ? null : userGlobalPermissionDto, (i & 512) != 0 ? null : l, (i & 1024) == 0 ? inHouseUserConfigDto : null);
    }
}
