package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UserPrivacySettingsDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer allowAutoJoinGroup;
    private final Integer allowChatViaProfile;
    private final Integer allowContactDiscovery;
    private final Integer allowInAppNotification;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserPrivacySettingsDto() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserPrivacySettingsDto copy$default(UserPrivacySettingsDto userPrivacySettingsDto, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = userPrivacySettingsDto.allowAutoJoinGroup;
        }
        if ((i & 2) != 0) {
            num2 = userPrivacySettingsDto.allowContactDiscovery;
        }
        if ((i & 4) != 0) {
            num3 = userPrivacySettingsDto.allowInAppNotification;
        }
        if ((i & 8) != 0) {
            num4 = userPrivacySettingsDto.allowChatViaProfile;
        }
        return userPrivacySettingsDto.copy(num, num2, num3, num4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.allowAutoJoinGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.allowContactDiscovery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.allowInAppNotification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.allowChatViaProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserPrivacySettingsDto copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new UserPrivacySettingsDto(num, num2, num3, num4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPrivacySettingsDto)) {
            return false;
        }
        UserPrivacySettingsDto userPrivacySettingsDto = (UserPrivacySettingsDto) obj;
        return Intrinsics.EZpvd(this.allowAutoJoinGroup, userPrivacySettingsDto.allowAutoJoinGroup) && Intrinsics.EZpvd(this.allowContactDiscovery, userPrivacySettingsDto.allowContactDiscovery) && Intrinsics.EZpvd(this.allowInAppNotification, userPrivacySettingsDto.allowInAppNotification) && Intrinsics.EZpvd(this.allowChatViaProfile, userPrivacySettingsDto.allowChatViaProfile);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowAutoJoinGroup() {
        return this.allowAutoJoinGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowChatViaProfile() {
        return this.allowChatViaProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowContactDiscovery() {
        return this.allowContactDiscovery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowInAppNotification() {
        return this.allowInAppNotification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.allowAutoJoinGroup;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.allowContactDiscovery;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.allowInAppNotification;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.allowChatViaProfile;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserPrivacySettingsDto(allowAutoJoinGroup=" + this.allowAutoJoinGroup + ", allowContactDiscovery=" + this.allowContactDiscovery + ", allowInAppNotification=" + this.allowInAppNotification + ", allowChatViaProfile=" + this.allowChatViaProfile + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.UserPrivacySettingsDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserPrivacySettingsDto> serializer() {
            return UserPrivacySettingsDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserPrivacySettingsDto(int i, Integer num, Integer num2, Integer num3, Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
        this.allowAutoJoinGroup = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.allowContactDiscovery = 0;
        } else {
            this.allowContactDiscovery = num2;
        }
        if ((i & 4) == 0) {
            this.allowInAppNotification = 0;
        } else {
            this.allowInAppNotification = num3;
        }
        if ((i & 8) == 0) {
            this.allowChatViaProfile = null;
        } else {
            this.allowChatViaProfile = num4;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(UserPrivacySettingsDto userPrivacySettingsDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        Integer num3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num3 = userPrivacySettingsDto.allowAutoJoinGroup) == null || num3.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, userPrivacySettingsDto.allowAutoJoinGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (num2 = userPrivacySettingsDto.allowContactDiscovery) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, userPrivacySettingsDto.allowContactDiscovery);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (num = userPrivacySettingsDto.allowInAppNotification) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, userPrivacySettingsDto.allowInAppNotification);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && userPrivacySettingsDto.allowChatViaProfile == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, userPrivacySettingsDto.allowChatViaProfile);
    }

    public UserPrivacySettingsDto(Integer num, Integer num2, Integer num3, Integer num4) {
        this.allowAutoJoinGroup = num;
        this.allowContactDiscovery = num2;
        this.allowInAppNotification = num3;
        this.allowChatViaProfile = num4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0014: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:43) call: com.okinc.okimcore.model.remote.UserPrivacySettingsDto.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ UserPrivacySettingsDto(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? 0 : num3, (i & 8) != 0 ? null : num4);
    }
}
