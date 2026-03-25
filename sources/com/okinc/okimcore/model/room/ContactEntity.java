package com.okinc.okimcore.model.room;

import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
import com.okinc.okimcore.model.utility.ContactExtField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C44474sRd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ContactEntity {
    private Boolean allowAddContact;
    private Boolean allowBlockUser;
    private Boolean allowFile;
    private Boolean allowKycBanner;
    private Boolean allowPay;
    private Boolean allowPlanetProfile;
    private Boolean allowRemoveGroupMember;
    private Boolean allowVoice;
    private String avatar;
    private int blackListStatus;
    private boolean canChat;
    private String contactsId;
    private long createTime;
    private String customNote;
    private String enNickname;
    private String hash;
    private Boolean isAllowSendMessage;
    private Boolean isAllowSingleChatInGroup;
    private Boolean isOpenKOL;
    private String kolUniqueName;
    private String nickName;
    private int noDisturbStatus;
    private OfficialTagInfo officialTagInfo;
    private String orbitBackgroundImage;
    private Integer orbitStatus;
    private String phoneName;
    private String phoneRawNumber;
    private RelationSourceType relationSourceType;
    private String remarkName;
    private Boolean showUnknownContactBanner;
    private Boolean showVipPerformanceDetails;
    private Boolean showVoiceCall;
    private String sign;
    private int strangerStatus;
    private long timestamp;
    private int topStatus;
    private long updateTime;
    private String v1Field;
    private String v2Field;
    private String v3Field;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, RelationSourceType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    @SerialName("allowAddContact")
    public static /* synthetic */ void getAllowAddContact$annotations() {
    }

    @SerialName("allowBlockUser")
    public static /* synthetic */ void getAllowBlockUser$annotations() {
    }

    @SerialName("allowFile")
    public static /* synthetic */ void getAllowFile$annotations() {
    }

    @SerialName("allowKycBanner")
    public static /* synthetic */ void getAllowKycBanner$annotations() {
    }

    @SerialName("allowPay")
    public static /* synthetic */ void getAllowPay$annotations() {
    }

    @SerialName("allowPlanetProfile")
    public static /* synthetic */ void getAllowPlanetProfile$annotations() {
    }

    @SerialName("allowRemoveGroupMember")
    public static /* synthetic */ void getAllowRemoveGroupMember$annotations() {
    }

    @SerialName("allowVoice")
    public static /* synthetic */ void getAllowVoice$annotations() {
    }

    @SerialName("avatar")
    public static /* synthetic */ void getAvatar$annotations() {
    }

    @SerialName("isBlacklist")
    public static /* synthetic */ void getBlackListStatus$annotations() {
    }

    @SerialName("chat")
    public static /* synthetic */ void getCanChat$annotations() {
    }

    @SerialName("contactsId")
    public static /* synthetic */ void getContactsId$annotations() {
    }

    @SerialName("createTime")
    public static /* synthetic */ void getCreateTime$annotations() {
    }

    @SerialName("customNote")
    public static /* synthetic */ void getCustomNote$annotations() {
    }

    @SerialName("enPetname")
    public static /* synthetic */ void getEnNickname$annotations() {
    }

    @SerialName("hash")
    public static /* synthetic */ void getHash$annotations() {
    }

    @SerialName("uniqueName")
    public static /* synthetic */ void getKolUniqueName$annotations() {
    }

    @SerialName("petname")
    public static /* synthetic */ void getNickName$annotations() {
    }

    @SerialName("isNoDisturb")
    public static /* synthetic */ void getNoDisturbStatus$annotations() {
    }

    @SerialName("officialTag")
    public static /* synthetic */ void getOfficialTagInfo$annotations() {
    }

    @SerialName("orbitBackgroundImage")
    public static /* synthetic */ void getOrbitBackgroundImage$annotations() {
    }

    @SerialName("orbitStatus")
    public static /* synthetic */ void getOrbitStatus$annotations() {
    }

    @SerialName("phoneName")
    public static /* synthetic */ void getPhoneName$annotations() {
    }

    @SerialName("rawPhoneNumber")
    public static /* synthetic */ void getPhoneRawNumber$annotations() {
    }

    @SerialName("relationSourceType")
    public static /* synthetic */ void getRelationSourceType$annotations() {
    }

    @SerialName("remarkName")
    public static /* synthetic */ void getRemarkName$annotations() {
    }

    @SerialName("showUnknownContactBanner")
    public static /* synthetic */ void getShowUnknownContactBanner$annotations() {
    }

    @SerialName("showVipPerformanceDetails")
    public static /* synthetic */ void getShowVipPerformanceDetails$annotations() {
    }

    @SerialName("showVoiceCall")
    public static /* synthetic */ void getShowVoiceCall$annotations() {
    }

    @SerialName("sign")
    public static /* synthetic */ void getSign$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getStrangerStatus$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @SerialName("isTop")
    public static /* synthetic */ void getTopStatus$annotations() {
    }

    @SerialName("updateTime")
    public static /* synthetic */ void getUpdateTime$annotations() {
    }

    @Transient
    public static /* synthetic */ void getV1Field$annotations() {
    }

    @SerialName("v2")
    public static /* synthetic */ void getV2Field$annotations() {
    }

    @SerialName("v3")
    public static /* synthetic */ void getV3Field$annotations() {
    }

    @SerialName("isAllowSendMessage")
    public static /* synthetic */ void isAllowSendMessage$annotations() {
    }

    @SerialName("isAllowSingleChatInGroup")
    public static /* synthetic */ void isAllowSingleChatInGroup$annotations() {
    }

    @SerialName("homepageStatus")
    public static /* synthetic */ void isOpenKOL$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowAddContact() {
        return this.allowAddContact;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowBlockUser() {
        return this.allowBlockUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowFile() {
        return this.allowFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowKycBanner() {
        return this.allowKycBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowPay() {
        return this.allowPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowPlanetProfile() {
        return this.allowPlanetProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowRemoveGroupMember() {
        return this.allowRemoveGroupMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowVoice() {
        return this.allowVoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBlackListStatus() {
        return this.blackListStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanChat() {
        return this.canChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactsId() {
        return this.contactsId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
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
    public final String getHash() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKolUniqueName() {
        return this.kolUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNoDisturbStatus() {
        return this.noDisturbStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo getOfficialTagInfo() {
        return this.officialTagInfo;
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
    public final String getPhoneName() {
        return this.phoneName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneRawNumber() {
        return this.phoneRawNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationSourceType getRelationSourceType() {
        return this.relationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemarkName() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowUnknownContactBanner() {
        return this.showUnknownContactBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowVipPerformanceDetails() {
        return this.showVipPerformanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowVoiceCall() {
        return this.showVoiceCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrangerStatus() {
        return this.strangerStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTopStatus() {
        return this.topStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getV3Field() {
        return this.v3Field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isAllowSendMessage() {
        return this.isAllowSendMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isAllowSingleChatInGroup() {
        return this.isAllowSingleChatInGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isOpenKOL() {
        return this.isOpenKOL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowAddContact(Boolean bool) {
        this.allowAddContact = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowBlockUser(Boolean bool) {
        this.allowBlockUser = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowFile(Boolean bool) {
        this.allowFile = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowKycBanner(Boolean bool) {
        this.allowKycBanner = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowPay(Boolean bool) {
        this.allowPay = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowPlanetProfile(Boolean bool) {
        this.allowPlanetProfile = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowRemoveGroupMember(Boolean bool) {
        this.allowRemoveGroupMember = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowSendMessage(Boolean bool) {
        this.isAllowSendMessage = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowSingleChatInGroup(Boolean bool) {
        this.isAllowSingleChatInGroup = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowVoice(Boolean bool) {
        this.allowVoice = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlackListStatus(int i) {
        this.blackListStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanChat(boolean z) {
        this.canChat = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContactsId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contactsId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomNote(String str) {
        this.customNote = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnNickname(String str) {
        this.enNickname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHash(String str) {
        this.hash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKolUniqueName(String str) {
        this.kolUniqueName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nickName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoDisturbStatus(int i) {
        this.noDisturbStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOfficialTagInfo(OfficialTagInfo officialTagInfo) {
        this.officialTagInfo = officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenKOL(Boolean bool) {
        this.isOpenKOL = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrbitBackgroundImage(String str) {
        this.orbitBackgroundImage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrbitStatus(Integer num) {
        this.orbitStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhoneName(String str) {
        this.phoneName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhoneRawNumber(String str) {
        this.phoneRawNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRelationSourceType(RelationSourceType relationSourceType) {
        this.relationSourceType = relationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemarkName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.remarkName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowUnknownContactBanner(Boolean bool) {
        this.showUnknownContactBanner = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowVipPerformanceDetails(Boolean bool) {
        this.showVipPerformanceDetails = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowVoiceCall(Boolean bool) {
        this.showVoiceCall = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrangerStatus(int i) {
        this.strangerStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopStatus(int i) {
        this.topStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setV1Field(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.v1Field = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setV2Field(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.v2Field = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setV3Field(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.v3Field = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.ContactEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContactEntity> serializer() {
            return ContactEntity$$serializer.INSTANCE;
        }
    }

    public ContactEntity() {
        this.contactsId = "";
        this.avatar = "";
        this.nickName = "";
        this.remarkName = "";
        this.sign = "";
        this.v1Field = "";
        this.v2Field = "";
        this.v3Field = "";
        this.isOpenKOL = Boolean.FALSE;
        this.relationSourceType = RelationSourceType.NORMAL;
    }

    public /* synthetic */ ContactEntity(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, int i4, int i5, int i6, long j, long j2, long j3, boolean z, String str6, String str7, OfficialTagInfo officialTagInfo, Boolean bool, String str8, String str9, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str10, RelationSourceType relationSourceType, String str11, String str12, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, String str13, Boolean bool14, String str14, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contactsId = "";
        } else {
            this.contactsId = str;
        }
        if ((i & 2) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str2;
        }
        if ((i & 4) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str3;
        }
        if ((i & 8) == 0) {
            this.remarkName = "";
        } else {
            this.remarkName = str4;
        }
        if ((i & 16) == 0) {
            this.sign = "";
        } else {
            this.sign = str5;
        }
        if ((i & 32) == 0) {
            this.blackListStatus = 0;
        } else {
            this.blackListStatus = i3;
        }
        if ((i & 64) == 0) {
            this.noDisturbStatus = 0;
        } else {
            this.noDisturbStatus = i4;
        }
        if ((i & 128) == 0) {
            this.topStatus = 0;
        } else {
            this.topStatus = i5;
        }
        if ((i & 256) == 0) {
            this.strangerStatus = 0;
        } else {
            this.strangerStatus = i6;
        }
        if ((i & 512) == 0) {
            this.timestamp = 0L;
        } else {
            this.timestamp = j;
        }
        if ((i & 1024) == 0) {
            this.createTime = 0L;
        } else {
            this.createTime = j2;
        }
        this.updateTime = (i & 2048) != 0 ? j3 : 0L;
        this.canChat = (i & 4096) != 0 ? z : false;
        this.v1Field = "";
        if ((i & 8192) == 0) {
            this.v2Field = "";
        } else {
            this.v2Field = str6;
        }
        if ((i & 16384) == 0) {
            this.v3Field = "";
        } else {
            this.v3Field = str7;
        }
        if ((32768 & i) == 0) {
            this.officialTagInfo = null;
        } else {
            this.officialTagInfo = officialTagInfo;
        }
        this.isOpenKOL = (65536 & i) == 0 ? Boolean.FALSE : bool;
        if ((131072 & i) == 0) {
            this.kolUniqueName = null;
        } else {
            this.kolUniqueName = str8;
        }
        if ((262144 & i) == 0) {
            this.enNickname = null;
        } else {
            this.enNickname = str9;
        }
        if ((524288 & i) == 0) {
            this.allowAddContact = null;
        } else {
            this.allowAddContact = bool2;
        }
        if ((1048576 & i) == 0) {
            this.isAllowSendMessage = null;
        } else {
            this.isAllowSendMessage = bool3;
        }
        if ((2097152 & i) == 0) {
            this.showVoiceCall = null;
        } else {
            this.showVoiceCall = bool4;
        }
        if ((4194304 & i) == 0) {
            this.allowKycBanner = null;
        } else {
            this.allowKycBanner = bool5;
        }
        if ((8388608 & i) == 0) {
            this.hash = null;
        } else {
            this.hash = str10;
        }
        this.relationSourceType = (16777216 & i) == 0 ? RelationSourceType.NORMAL : relationSourceType;
        if ((33554432 & i) == 0) {
            this.phoneName = null;
        } else {
            this.phoneName = str11;
        }
        if ((67108864 & i) == 0) {
            this.phoneRawNumber = null;
        } else {
            this.phoneRawNumber = str12;
        }
        if ((134217728 & i) == 0) {
            this.isAllowSingleChatInGroup = null;
        } else {
            this.isAllowSingleChatInGroup = bool6;
        }
        if ((268435456 & i) == 0) {
            this.showUnknownContactBanner = null;
        } else {
            this.showUnknownContactBanner = bool7;
        }
        if ((536870912 & i) == 0) {
            this.allowVoice = null;
        } else {
            this.allowVoice = bool8;
        }
        if ((1073741824 & i) == 0) {
            this.allowFile = null;
        } else {
            this.allowFile = bool9;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.allowPlanetProfile = null;
        } else {
            this.allowPlanetProfile = bool10;
        }
        if ((i2 & 1) == 0) {
            this.allowBlockUser = null;
        } else {
            this.allowBlockUser = bool11;
        }
        if ((i2 & 2) == 0) {
            this.showVipPerformanceDetails = null;
        } else {
            this.showVipPerformanceDetails = bool12;
        }
        if ((i2 & 4) == 0) {
            this.allowRemoveGroupMember = null;
        } else {
            this.allowRemoveGroupMember = bool13;
        }
        if ((i2 & 8) == 0) {
            this.customNote = null;
        } else {
            this.customNote = str13;
        }
        if ((i2 & 16) == 0) {
            this.allowPay = null;
        } else {
            this.allowPay = bool14;
        }
        if ((i2 & 32) == 0) {
            this.orbitBackgroundImage = null;
        } else {
            this.orbitBackgroundImage = str14;
        }
        if ((i2 & 64) == 0) {
            this.orbitStatus = null;
        } else {
            this.orbitStatus = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ContactEntity contactEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contactEntity.contactsId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contactEntity.contactsId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contactEntity.avatar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, contactEntity.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) contactEntity.nickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, contactEntity.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) contactEntity.remarkName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, contactEntity.remarkName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) contactEntity.sign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, contactEntity.sign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || contactEntity.blackListStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, contactEntity.blackListStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || contactEntity.noDisturbStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, contactEntity.noDisturbStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || contactEntity.topStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, contactEntity.topStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || contactEntity.strangerStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, contactEntity.strangerStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || contactEntity.timestamp != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 9, contactEntity.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || contactEntity.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 10, contactEntity.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || contactEntity.updateTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 11, contactEntity.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || contactEntity.canChat) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, contactEntity.canChat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) contactEntity.getV2Field(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, contactEntity.getV2Field());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) contactEntity.v3Field, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, contactEntity.v3Field);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || contactEntity.officialTagInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, OfficialTagInfo$$serializer.INSTANCE, contactEntity.officialTagInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(contactEntity.isOpenKOL, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, contactEntity.isOpenKOL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || contactEntity.kolUniqueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, contactEntity.kolUniqueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || contactEntity.enNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, contactEntity.enNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || contactEntity.allowAddContact != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, contactEntity.allowAddContact);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || contactEntity.isAllowSendMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, BooleanSerializer.INSTANCE, contactEntity.isAllowSendMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || contactEntity.showVoiceCall != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, BooleanSerializer.INSTANCE, contactEntity.showVoiceCall);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || contactEntity.allowKycBanner != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, BooleanSerializer.INSTANCE, contactEntity.allowKycBanner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || contactEntity.hash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, contactEntity.hash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || contactEntity.relationSourceType != RelationSourceType.NORMAL) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, kSerializerArr[24], contactEntity.relationSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || contactEntity.phoneName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, contactEntity.phoneName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || contactEntity.phoneRawNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, contactEntity.phoneRawNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || contactEntity.isAllowSingleChatInGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, BooleanSerializer.INSTANCE, contactEntity.isAllowSingleChatInGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || contactEntity.showUnknownContactBanner != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, BooleanSerializer.INSTANCE, contactEntity.showUnknownContactBanner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || contactEntity.allowVoice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, BooleanSerializer.INSTANCE, contactEntity.allowVoice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || contactEntity.allowFile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, BooleanSerializer.INSTANCE, contactEntity.allowFile);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || contactEntity.allowPlanetProfile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, BooleanSerializer.INSTANCE, contactEntity.allowPlanetProfile);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || contactEntity.allowBlockUser != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, BooleanSerializer.INSTANCE, contactEntity.allowBlockUser);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || contactEntity.showVipPerformanceDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, BooleanSerializer.INSTANCE, contactEntity.showVipPerformanceDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || contactEntity.allowRemoveGroupMember != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, BooleanSerializer.INSTANCE, contactEntity.allowRemoveGroupMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || contactEntity.customNote != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, contactEntity.customNote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || contactEntity.allowPay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, BooleanSerializer.INSTANCE, contactEntity.allowPay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || contactEntity.orbitBackgroundImage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, contactEntity.orbitBackgroundImage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) && contactEntity.orbitStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, IntSerializer.INSTANCE, contactEntity.orbitStatus);
    }

    public final String getV1Field() {
        String str = this.v1Field;
        return str.length() == 0 ? C44474sRd.KWHzl.OLrzqt(this.officialTagInfo) : str;
    }

    public final String getV2Field() {
        String str = this.v2Field;
        return str.length() == 0 ? new ContactExtField(Intrinsics.EZpvd(Boolean.TRUE, this.isOpenKOL), this.kolUniqueName, this.enNickname).toJson() : str;
    }
}
