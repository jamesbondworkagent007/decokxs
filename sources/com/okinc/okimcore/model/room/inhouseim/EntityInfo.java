package com.okinc.okimcore.model.room.inhouseim;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class EntityInfo {
    private final String avatar;
    private final String bizGroupName;
    private final String enNickname;
    private final JsonElement extra;
    private final Integer groupSubType;
    private final Integer groupType;
    private final List<ConversationIcon> icons;
    private final String nickname;
    private final String relatedId;
    private final List<Integer> tags;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, new ArrayListSerializer(ConversationIcon$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EntityInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Integer) null, (Integer) null, (List) null, (JsonElement) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component10() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.relatedId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component6() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.groupSubType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConversationIcon> component9() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntityInfo copy(String str, String str2, String str3, String str4, String str5, List<Integer> list, Integer num, Integer num2, List<ConversationIcon> list2, JsonElement jsonElement) {
        return new EntityInfo(str, str2, str3, str4, str5, list, num, num2, list2, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntityInfo)) {
            return false;
        }
        EntityInfo entityInfo = (EntityInfo) obj;
        return Intrinsics.EZpvd((Object) this.avatar, (Object) entityInfo.avatar) && Intrinsics.EZpvd((Object) this.enNickname, (Object) entityInfo.enNickname) && Intrinsics.EZpvd((Object) this.nickname, (Object) entityInfo.nickname) && Intrinsics.EZpvd((Object) this.bizGroupName, (Object) entityInfo.bizGroupName) && Intrinsics.EZpvd((Object) this.relatedId, (Object) entityInfo.relatedId) && Intrinsics.EZpvd(this.tags, entityInfo.tags) && Intrinsics.EZpvd(this.groupType, entityInfo.groupType) && Intrinsics.EZpvd(this.groupSubType, entityInfo.groupSubType) && Intrinsics.EZpvd(this.icons, entityInfo.icons) && Intrinsics.EZpvd(this.extra, entityInfo.extra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizGroupName() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnNickname() {
        return this.enNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGroupSubType() {
        return this.groupSubType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGroupType() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConversationIcon> getIcons() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelatedId() {
        return this.relatedId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.avatar;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.enNickname;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nickname;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bizGroupName;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.relatedId;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        List<Integer> list = this.tags;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        Integer num = this.groupType;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.groupSubType;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        List<ConversationIcon> list2 = this.icons;
        int iHashCode9 = list2 == null ? 0 : list2.hashCode();
        JsonElement jsonElement = this.extra;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EntityInfo(avatar=" + this.avatar + ", enNickname=" + this.enNickname + ", nickname=" + this.nickname + ", bizGroupName=" + this.bizGroupName + ", relatedId=" + this.relatedId + ", tags=" + this.tags + ", groupType=" + this.groupType + ", groupSubType=" + this.groupSubType + ", icons=" + this.icons + ", extra=" + this.extra + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.EntityInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EntityInfo> serializer() {
            return EntityInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EntityInfo(int i, String str, String str2, String str3, String str4, String str5, List list, Integer num, Integer num2, List list2, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str;
        }
        if ((i & 2) == 0) {
            this.enNickname = null;
        } else {
            this.enNickname = str2;
        }
        if ((i & 4) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str3;
        }
        if ((i & 8) == 0) {
            this.bizGroupName = null;
        } else {
            this.bizGroupName = str4;
        }
        if ((i & 16) == 0) {
            this.relatedId = null;
        } else {
            this.relatedId = str5;
        }
        if ((i & 32) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i & 64) == 0) {
            this.groupType = null;
        } else {
            this.groupType = num;
        }
        if ((i & 128) == 0) {
            this.groupSubType = null;
        } else {
            this.groupSubType = num2;
        }
        if ((i & 256) == 0) {
            this.icons = null;
        } else {
            this.icons = list2;
        }
        if ((i & 512) == 0) {
            this.extra = null;
        } else {
            this.extra = jsonElement;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(EntityInfo entityInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || entityInfo.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, entityInfo.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || entityInfo.enNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, entityInfo.enNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || entityInfo.nickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, entityInfo.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || entityInfo.bizGroupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, entityInfo.bizGroupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || entityInfo.relatedId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, entityInfo.relatedId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || entityInfo.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], entityInfo.tags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || entityInfo.groupType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, entityInfo.groupType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || entityInfo.groupSubType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, entityInfo.groupSubType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || entityInfo.icons != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], entityInfo.icons);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && entityInfo.extra == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, JsonElementSerializer.INSTANCE, entityInfo.extra);
    }

    public EntityInfo(String str, String str2, String str3, String str4, String str5, List<Integer> list, Integer num, Integer num2, List<ConversationIcon> list2, JsonElement jsonElement) {
        this.avatar = str;
        this.enNickname = str2;
        this.nickname = str3;
        this.bizGroupName = str4;
        this.relatedId = str5;
        this.tags = list;
        this.groupType = num;
        this.groupSubType = num2;
        this.icons = list2;
        this.extra = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 kotlinx.serialization.json.JsonElement) : (null kotlinx.serialization.json.JsonElement))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.Integer, java.lang.Integer, java.util.List<com.okinc.okimcore.model.room.inhouseim.ConversationIcon>, kotlinx.serialization.json.JsonElement):void (m)] (LINE:77) call: com.okinc.okimcore.model.room.inhouseim.EntityInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.lang.Integer, java.util.List, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ EntityInfo(String str, String str2, String str3, String str4, String str5, List list, Integer num, Integer num2, List list2, JsonElement jsonElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : list2, (i & 512) == 0 ? jsonElement : null);
    }
}
