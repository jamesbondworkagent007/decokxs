package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UserGlobalPermissionDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean createGroup;
    private final Boolean generateQrCode;
    private final Integer kycLevel;
    private final Boolean searchUuid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserGlobalPermissionDto() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserGlobalPermissionDto copy$default(UserGlobalPermissionDto userGlobalPermissionDto, Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = userGlobalPermissionDto.generateQrCode;
        }
        if ((i & 2) != 0) {
            bool2 = userGlobalPermissionDto.createGroup;
        }
        if ((i & 4) != 0) {
            bool3 = userGlobalPermissionDto.searchUuid;
        }
        if ((i & 8) != 0) {
            num = userGlobalPermissionDto.kycLevel;
        }
        return userGlobalPermissionDto.copy(bool, bool2, bool3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.generateQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.createGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.searchUuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserGlobalPermissionDto copy(Boolean bool, Boolean bool2, Boolean bool3, Integer num) {
        return new UserGlobalPermissionDto(bool, bool2, bool3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserGlobalPermissionDto)) {
            return false;
        }
        UserGlobalPermissionDto userGlobalPermissionDto = (UserGlobalPermissionDto) obj;
        return Intrinsics.EZpvd(this.generateQrCode, userGlobalPermissionDto.generateQrCode) && Intrinsics.EZpvd(this.createGroup, userGlobalPermissionDto.createGroup) && Intrinsics.EZpvd(this.searchUuid, userGlobalPermissionDto.searchUuid) && Intrinsics.EZpvd(this.kycLevel, userGlobalPermissionDto.kycLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCreateGroup() {
        return this.createGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getGenerateQrCode() {
        return this.generateQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getKycLevel() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSearchUuid() {
        return this.searchUuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.generateQrCode;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.createGroup;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.searchUuid;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        Integer num = this.kycLevel;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserGlobalPermissionDto(generateQrCode=" + this.generateQrCode + ", createGroup=" + this.createGroup + ", searchUuid=" + this.searchUuid + ", kycLevel=" + this.kycLevel + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.UserGlobalPermissionDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserGlobalPermissionDto> serializer() {
            return UserGlobalPermissionDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserGlobalPermissionDto(int i, Boolean bool, Boolean bool2, Boolean bool3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.generateQrCode = null;
        } else {
            this.generateQrCode = bool;
        }
        if ((i & 2) == 0) {
            this.createGroup = null;
        } else {
            this.createGroup = bool2;
        }
        if ((i & 4) == 0) {
            this.searchUuid = null;
        } else {
            this.searchUuid = bool3;
        }
        if ((i & 8) == 0) {
            this.kycLevel = null;
        } else {
            this.kycLevel = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(UserGlobalPermissionDto userGlobalPermissionDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || userGlobalPermissionDto.generateQrCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, userGlobalPermissionDto.generateQrCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || userGlobalPermissionDto.createGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, userGlobalPermissionDto.createGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || userGlobalPermissionDto.searchUuid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, userGlobalPermissionDto.searchUuid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && userGlobalPermissionDto.kycLevel == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, userGlobalPermissionDto.kycLevel);
    }

    public UserGlobalPermissionDto(Boolean bool, Boolean bool2, Boolean bool3, Integer num) {
        this.generateQrCode = bool;
        this.createGroup = bool2;
        this.searchUuid = bool3;
        this.kycLevel = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:52) call: com.okinc.okimcore.model.remote.UserGlobalPermissionDto.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ UserGlobalPermissionDto(Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num);
    }
}
