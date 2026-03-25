package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class UpdateSecuritySettingRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer allowAutoJoinGroup;
    private final Integer allowChatViaProfile;
    private final Integer allowContactDiscovery;
    private final Integer allowInAppNotification;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpdateSecuritySettingRequest() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdateSecuritySettingRequest copy$default(UpdateSecuritySettingRequest updateSecuritySettingRequest, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = updateSecuritySettingRequest.allowAutoJoinGroup;
        }
        if ((i & 2) != 0) {
            num2 = updateSecuritySettingRequest.allowContactDiscovery;
        }
        if ((i & 4) != 0) {
            num3 = updateSecuritySettingRequest.allowInAppNotification;
        }
        if ((i & 8) != 0) {
            num4 = updateSecuritySettingRequest.allowChatViaProfile;
        }
        return updateSecuritySettingRequest.copy(num, num2, num3, num4);
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
    public final UpdateSecuritySettingRequest copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new UpdateSecuritySettingRequest(num, num2, num3, num4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateSecuritySettingRequest)) {
            return false;
        }
        UpdateSecuritySettingRequest updateSecuritySettingRequest = (UpdateSecuritySettingRequest) obj;
        return Intrinsics.EZpvd(this.allowAutoJoinGroup, updateSecuritySettingRequest.allowAutoJoinGroup) && Intrinsics.EZpvd(this.allowContactDiscovery, updateSecuritySettingRequest.allowContactDiscovery) && Intrinsics.EZpvd(this.allowInAppNotification, updateSecuritySettingRequest.allowInAppNotification) && Intrinsics.EZpvd(this.allowChatViaProfile, updateSecuritySettingRequest.allowChatViaProfile);
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
        return "UpdateSecuritySettingRequest(allowAutoJoinGroup=" + this.allowAutoJoinGroup + ", allowContactDiscovery=" + this.allowContactDiscovery + ", allowInAppNotification=" + this.allowInAppNotification + ", allowChatViaProfile=" + this.allowChatViaProfile + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.UpdateSecuritySettingRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdateSecuritySettingRequest> serializer() {
            return UpdateSecuritySettingRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateSecuritySettingRequest(int i, Integer num, Integer num2, Integer num3, Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.allowAutoJoinGroup = null;
        } else {
            this.allowAutoJoinGroup = num;
        }
        if ((i & 2) == 0) {
            this.allowContactDiscovery = null;
        } else {
            this.allowContactDiscovery = num2;
        }
        if ((i & 4) == 0) {
            this.allowInAppNotification = null;
        } else {
            this.allowInAppNotification = num3;
        }
        if ((i & 8) == 0) {
            this.allowChatViaProfile = null;
        } else {
            this.allowChatViaProfile = num4;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(UpdateSecuritySettingRequest updateSecuritySettingRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || updateSecuritySettingRequest.allowAutoJoinGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, updateSecuritySettingRequest.allowAutoJoinGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || updateSecuritySettingRequest.allowContactDiscovery != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, updateSecuritySettingRequest.allowContactDiscovery);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || updateSecuritySettingRequest.allowInAppNotification != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, updateSecuritySettingRequest.allowInAppNotification);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && updateSecuritySettingRequest.allowChatViaProfile == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, updateSecuritySettingRequest.allowChatViaProfile);
    }

    public UpdateSecuritySettingRequest(Integer num, Integer num2, Integer num3, Integer num4) {
        this.allowAutoJoinGroup = num;
        this.allowContactDiscovery = num2;
        this.allowInAppNotification = num3;
        this.allowChatViaProfile = num4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:161) call: com.okinc.okimcore.model.remote.UpdateSecuritySettingRequest.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ UpdateSecuritySettingRequest(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
