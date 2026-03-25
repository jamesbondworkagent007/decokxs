package com.okinc.okimcore.model.remote;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupRecommendations {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String groupAvatar;
    private final String groupDescription;
    private final Long groupId;
    private final String groupName;
    private final String invitationId;
    private final Boolean isOfficialGroup;
    private final Boolean isPaidGroup;
    private final Integer maxMemberCount;
    private final Integer memberCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupRecommendations() {
        this((String) null, (String) null, (Long) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isPaidGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.memberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isOfficialGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRecommendations copy(String str, String str2, Long l, String str3, Boolean bool, Integer num, Integer num2, String str4, Boolean bool2) {
        return new GroupRecommendations(str, str2, l, str3, bool, num, num2, str4, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupRecommendations)) {
            return false;
        }
        GroupRecommendations groupRecommendations = (GroupRecommendations) obj;
        return Intrinsics.EZpvd((Object) this.groupAvatar, (Object) groupRecommendations.groupAvatar) && Intrinsics.EZpvd((Object) this.groupDescription, (Object) groupRecommendations.groupDescription) && Intrinsics.EZpvd(this.groupId, groupRecommendations.groupId) && Intrinsics.EZpvd((Object) this.groupName, (Object) groupRecommendations.groupName) && Intrinsics.EZpvd(this.isPaidGroup, groupRecommendations.isPaidGroup) && Intrinsics.EZpvd(this.maxMemberCount, groupRecommendations.maxMemberCount) && Intrinsics.EZpvd(this.memberCount, groupRecommendations.memberCount) && Intrinsics.EZpvd((Object) this.invitationId, (Object) groupRecommendations.invitationId) && Intrinsics.EZpvd(this.isOfficialGroup, groupRecommendations.isOfficialGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupDescription() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMaxMemberCount() {
        return this.maxMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMemberCount() {
        return this.memberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.groupAvatar;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.groupDescription;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Long l = this.groupId;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        String str3 = this.groupName;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.isPaidGroup;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        Integer num = this.maxMemberCount;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.memberCount;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        String str4 = this.invitationId;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        Boolean bool2 = this.isOfficialGroup;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isOfficialGroup() {
        return this.isOfficialGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isPaidGroup() {
        return this.isPaidGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupRecommendations(groupAvatar=" + this.groupAvatar + ", groupDescription=" + this.groupDescription + ", groupId=" + this.groupId + ", groupName=" + this.groupName + ", isPaidGroup=" + this.isPaidGroup + ", maxMemberCount=" + this.maxMemberCount + ", memberCount=" + this.memberCount + ", invitationId=" + this.invitationId + ", isOfficialGroup=" + this.isOfficialGroup + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupRecommendations.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupRecommendations> serializer() {
            return GroupRecommendations$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupRecommendations(int i, String str, String str2, Long l, String str3, Boolean bool, Integer num, Integer num2, String str4, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupAvatar = null;
        } else {
            this.groupAvatar = str;
        }
        if ((i & 2) == 0) {
            this.groupDescription = null;
        } else {
            this.groupDescription = str2;
        }
        if ((i & 4) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 8) == 0) {
            this.groupName = null;
        } else {
            this.groupName = str3;
        }
        if ((i & 16) == 0) {
            this.isPaidGroup = null;
        } else {
            this.isPaidGroup = bool;
        }
        if ((i & 32) == 0) {
            this.maxMemberCount = null;
        } else {
            this.maxMemberCount = num;
        }
        if ((i & 64) == 0) {
            this.memberCount = null;
        } else {
            this.memberCount = num2;
        }
        if ((i & 128) == 0) {
            this.invitationId = null;
        } else {
            this.invitationId = str4;
        }
        if ((i & 256) == 0) {
            this.isOfficialGroup = null;
        } else {
            this.isOfficialGroup = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupRecommendations groupRecommendations, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupRecommendations.groupAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, groupRecommendations.groupAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupRecommendations.groupDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, groupRecommendations.groupDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupRecommendations.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, groupRecommendations.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupRecommendations.groupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, groupRecommendations.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupRecommendations.isPaidGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, groupRecommendations.isPaidGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || groupRecommendations.maxMemberCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, groupRecommendations.maxMemberCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || groupRecommendations.memberCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, groupRecommendations.memberCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || groupRecommendations.invitationId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, groupRecommendations.invitationId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && groupRecommendations.isOfficialGroup == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, groupRecommendations.isOfficialGroup);
    }

    public GroupRecommendations(String str, String str2, Long l, String str3, Boolean bool, Integer num, Integer num2, String str4, Boolean bool2) {
        this.groupAvatar = str;
        this.groupDescription = str2;
        this.groupId = l;
        this.groupName = str3;
        this.isPaidGroup = bool;
        this.maxMemberCount = num;
        this.memberCount = num2;
        this.invitationId = str4;
        this.isOfficialGroup = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean):void (m)] (LINE:14) call: com.okinc.okimcore.model.remote.GroupRecommendations.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ GroupRecommendations(String str, String str2, Long l, String str3, Boolean bool, Integer num, Integer num2, String str4, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? bool2 : null);
    }
}
