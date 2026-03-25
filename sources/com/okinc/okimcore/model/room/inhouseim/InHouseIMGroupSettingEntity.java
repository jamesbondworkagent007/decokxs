package com.okinc.okimcore.model.room.inhouseim;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMGroupSettingEntity {
    private String groupId;
    private String groupNickName;
    private int noDisturbStatus;
    private int role;
    private int topStatus;
    private String userEnNickName;
    private String userNickName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @SerialName("groupId")
    public static /* synthetic */ void getGroupId$annotations() {
    }

    @SerialName("aliasInGroup")
    public static /* synthetic */ void getGroupNickName$annotations() {
    }

    @SerialName("isNoDisturb")
    public static /* synthetic */ void getNoDisturbStatus$annotations() {
    }

    @SerialName("role")
    public static /* synthetic */ void getRole$annotations() {
    }

    @SerialName("isTop")
    public static /* synthetic */ void getTopStatus$annotations() {
    }

    @SerialName("userEnPetname")
    public static /* synthetic */ void getUserEnNickName$annotations() {
    }

    @SerialName("userPetname")
    public static /* synthetic */ void getUserNickName$annotations() {
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
    public final int getNoDisturbStatus() {
        return this.noDisturbStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTopStatus() {
        return this.topStatus;
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
    public final void setGroupId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupNickName(String str) {
        this.groupNickName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoDisturbStatus(int i) {
        this.noDisturbStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRole(int i) {
        this.role = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopStatus(int i) {
        this.topStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserEnNickName(String str) {
        this.userEnNickName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserNickName(String str) {
        this.userNickName = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGroupSettingEntity> serializer() {
            return InHouseIMGroupSettingEntity$$serializer.INSTANCE;
        }
    }

    public InHouseIMGroupSettingEntity() {
        this.groupId = "";
        this.groupNickName = "";
        this.userNickName = "";
        this.role = 2;
    }

    public /* synthetic */ InHouseIMGroupSettingEntity(int i, String str, String str2, String str3, int i2, int i3, int i4, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = "";
        } else {
            this.groupId = str;
        }
        if ((i & 2) == 0) {
            this.groupNickName = "";
        } else {
            this.groupNickName = str2;
        }
        if ((i & 4) == 0) {
            this.userNickName = "";
        } else {
            this.userNickName = str3;
        }
        if ((i & 8) == 0) {
            this.role = 2;
        } else {
            this.role = i2;
        }
        if ((i & 16) == 0) {
            this.noDisturbStatus = 0;
        } else {
            this.noDisturbStatus = i3;
        }
        if ((i & 32) == 0) {
            this.topStatus = 0;
        } else {
            this.topStatus = i4;
        }
        if ((i & 64) == 0) {
            this.userEnNickName = null;
        } else {
            this.userEnNickName = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseIMGroupSettingEntity.groupId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMGroupSettingEntity.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inHouseIMGroupSettingEntity.groupNickName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseIMGroupSettingEntity.groupNickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) inHouseIMGroupSettingEntity.userNickName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inHouseIMGroupSettingEntity.userNickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMGroupSettingEntity.role != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, inHouseIMGroupSettingEntity.role);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inHouseIMGroupSettingEntity.noDisturbStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, inHouseIMGroupSettingEntity.noDisturbStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inHouseIMGroupSettingEntity.topStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, inHouseIMGroupSettingEntity.topStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && inHouseIMGroupSettingEntity.userEnNickName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, inHouseIMGroupSettingEntity.userEnNickName);
    }
}
