package com.okinc.business.market.data.model;

import com.okinc.business.market.common.constants.StringBooleanType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class GetTrackingAddressGroup {
    public static final KSerializer<Object>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int collectNum;
    public final int groupId;
    public final String groupName;
    public final StringBooleanType groupStatus;
    public final StringBooleanType isDeleted;
    public final int sortOrder;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetTrackingAddressGroup() {
        this((String) null, (String) null, 0, 0, 0, (StringBooleanType) null, (StringBooleanType) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetTrackingAddressGroup copy$default(GetTrackingAddressGroup getTrackingAddressGroup, String str, String str2, int i, int i2, int i3, StringBooleanType stringBooleanType, StringBooleanType stringBooleanType2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = getTrackingAddressGroup.walletAddress;
        }
        if ((i4 & 2) != 0) {
            str2 = getTrackingAddressGroup.groupName;
        }
        String str3 = str2;
        if ((i4 & 4) != 0) {
            i = getTrackingAddressGroup.sortOrder;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = getTrackingAddressGroup.collectNum;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = getTrackingAddressGroup.groupId;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            stringBooleanType = getTrackingAddressGroup.groupStatus;
        }
        StringBooleanType stringBooleanType3 = stringBooleanType;
        if ((i4 & 64) != 0) {
            stringBooleanType2 = getTrackingAddressGroup.isDeleted;
        }
        return getTrackingAddressGroup.KWHzl(str, str3, i5, i6, i7, stringBooleanType3, stringBooleanType2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.collectNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetTrackingAddressGroup KWHzl(@NotNull String str, @NotNull String str2, int i, int i2, int i3, @NotNull StringBooleanType stringBooleanType, @NotNull StringBooleanType stringBooleanType2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(stringBooleanType2, "");
        return new GetTrackingAddressGroup(str, str2, i, i2, i3, stringBooleanType, stringBooleanType2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType copydefault() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTrackingAddressGroup)) {
            return false;
        }
        GetTrackingAddressGroup getTrackingAddressGroup = (GetTrackingAddressGroup) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) getTrackingAddressGroup.walletAddress) && Intrinsics.EZpvd((Object) this.groupName, (Object) getTrackingAddressGroup.groupName) && this.sortOrder == getTrackingAddressGroup.sortOrder && this.collectNum == getTrackingAddressGroup.collectNum && this.groupId == getTrackingAddressGroup.groupId && this.groupStatus == getTrackingAddressGroup.groupStatus && this.isDeleted == getTrackingAddressGroup.isDeleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.sortOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.walletAddress.hashCode() * 31) + this.groupName.hashCode()) * 31) + Integer.hashCode(this.sortOrder)) * 31) + Integer.hashCode(this.collectNum)) * 31) + Integer.hashCode(this.groupId)) * 31) + this.groupStatus.hashCode()) * 31) + this.isDeleted.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetTrackingAddressGroup(walletAddress=" + this.walletAddress + ", groupName=" + this.groupName + ", sortOrder=" + this.sortOrder + ", collectNum=" + this.collectNum + ", groupId=" + this.groupId + ", groupStatus=" + this.groupStatus + ", isDeleted=" + this.isDeleted + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.GetTrackingAddressGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetTrackingAddressGroup> serializer() {
            return GetTrackingAddressGroup$$serializer.INSTANCE;
        }
    }

    static {
        StringBooleanType.Companion companion = StringBooleanType.Companion;
        $childSerializers = new KSerializer[]{null, null, null, null, null, companion.serializer(), companion.serializer()};
    }

    public /* synthetic */ GetTrackingAddressGroup(int i, String str, String str2, int i2, int i3, int i4, StringBooleanType stringBooleanType, StringBooleanType stringBooleanType2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str;
        }
        if ((i & 2) == 0) {
            this.groupName = "";
        } else {
            this.groupName = str2;
        }
        if ((i & 4) == 0) {
            this.sortOrder = 0;
        } else {
            this.sortOrder = i2;
        }
        if ((i & 8) == 0) {
            this.collectNum = 0;
        } else {
            this.collectNum = i3;
        }
        if ((i & 16) == 0) {
            this.groupId = 1;
        } else {
            this.groupId = i4;
        }
        if ((i & 32) == 0) {
            this.groupStatus = StringBooleanType.FALSE;
        } else {
            this.groupStatus = stringBooleanType;
        }
        if ((i & 64) == 0) {
            this.isDeleted = StringBooleanType.FALSE;
        } else {
            this.isDeleted = stringBooleanType2;
        }
    }

    public static final /* synthetic */ void copydefault(GetTrackingAddressGroup getTrackingAddressGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) getTrackingAddressGroup.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, getTrackingAddressGroup.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) getTrackingAddressGroup.groupName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, getTrackingAddressGroup.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getTrackingAddressGroup.sortOrder != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, getTrackingAddressGroup.sortOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || getTrackingAddressGroup.collectNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, getTrackingAddressGroup.collectNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || getTrackingAddressGroup.groupId != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, getTrackingAddressGroup.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || getTrackingAddressGroup.groupStatus != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], getTrackingAddressGroup.groupStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && getTrackingAddressGroup.isDeleted == StringBooleanType.FALSE) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], getTrackingAddressGroup.isDeleted);
    }

    public GetTrackingAddressGroup(@NotNull String str, @NotNull String str2, int i, int i2, int i3, @NotNull StringBooleanType stringBooleanType, @NotNull StringBooleanType stringBooleanType2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(stringBooleanType2, "");
        this.walletAddress = str;
        this.groupName = str2;
        this.sortOrder = i;
        this.collectNum = i2;
        this.groupId = i3;
        this.groupStatus = stringBooleanType;
        this.isDeleted = stringBooleanType2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:int:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r10v0 int))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:0x002a: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.common.constants.StringBooleanType:0x0028: SGET  A[WRAPPED] (LINE:20) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r11v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.common.constants.StringBooleanType:0x002f: SGET  A[WRAPPED] (LINE:22) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r12v0 com.okinc.business.market.common.constants.StringBooleanType))
 A[MD:(java.lang.String, java.lang.String, int, int, int, com.okinc.business.market.common.constants.StringBooleanType, com.okinc.business.market.common.constants.StringBooleanType):void (m)] (LINE:8) call: com.okinc.business.market.data.model.GetTrackingAddressGroup.<init>(java.lang.String, java.lang.String, int, int, int, com.okinc.business.market.common.constants.StringBooleanType, com.okinc.business.market.common.constants.StringBooleanType):void type: THIS */
    public /* synthetic */ GetTrackingAddressGroup(String str, String str2, int i, int i2, int i3, StringBooleanType stringBooleanType, StringBooleanType stringBooleanType2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) == 0 ? str2 : "", (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 1 : i3, (i4 & 32) != 0 ? StringBooleanType.FALSE : stringBooleanType, (i4 & 64) != 0 ? StringBooleanType.FALSE : stringBooleanType2);
    }
}
