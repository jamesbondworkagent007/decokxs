package com.okinc.business.market.features.group.domain;

import com.okinc.business.market.common.constants.StringBooleanType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class CommonGroupData {
    public static final int $stable = 0;
    public final int groupId;
    public final String groupName;
    public final int sortOrder;
    public final StringBooleanType status;
    public final int tokenCount;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, StringBooleanType.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonGroupData() {
        this(0, (String) null, 0, 0, (StringBooleanType) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommonGroupData copy$default(CommonGroupData commonGroupData, int i, String str, int i2, int i3, StringBooleanType stringBooleanType, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = commonGroupData.groupId;
        }
        if ((i4 & 2) != 0) {
            str = commonGroupData.groupName;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            i2 = commonGroupData.sortOrder;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = commonGroupData.tokenCount;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            stringBooleanType = commonGroupData.status;
        }
        return commonGroupData.AEQbTJ(i, str2, i5, i6, stringBooleanType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonGroupData AEQbTJ(int i, @NotNull String str, int i2, int i3, @NotNull StringBooleanType stringBooleanType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        return new CommonGroupData(i, str, i2, i3, stringBooleanType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.sortOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType copydefault() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonGroupData)) {
            return false;
        }
        CommonGroupData commonGroupData = (CommonGroupData) obj;
        return this.groupId == commonGroupData.groupId && Intrinsics.EZpvd((Object) this.groupName, (Object) commonGroupData.groupName) && this.sortOrder == commonGroupData.sortOrder && this.tokenCount == commonGroupData.tokenCount && this.status == commonGroupData.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.groupId) * 31) + this.groupName.hashCode()) * 31) + Integer.hashCode(this.sortOrder)) * 31) + Integer.hashCode(this.tokenCount)) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonGroupData(groupId=" + this.groupId + ", groupName=" + this.groupName + ", sortOrder=" + this.sortOrder + ", tokenCount=" + this.tokenCount + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.tokenCount;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.group.domain.CommonGroupData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommonGroupData> serializer() {
            return CommonGroupData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommonGroupData(int i, int i2, String str, int i3, int i4, StringBooleanType stringBooleanType, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = 0;
        } else {
            this.groupId = i2;
        }
        if ((i & 2) == 0) {
            this.groupName = "";
        } else {
            this.groupName = str;
        }
        if ((i & 4) == 0) {
            this.sortOrder = 0;
        } else {
            this.sortOrder = i3;
        }
        if ((i & 8) == 0) {
            this.tokenCount = 0;
        } else {
            this.tokenCount = i4;
        }
        if ((i & 16) == 0) {
            this.status = StringBooleanType.FALSE;
        } else {
            this.status = stringBooleanType;
        }
    }

    public static final /* synthetic */ void OLrzqt(CommonGroupData commonGroupData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || commonGroupData.groupId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, commonGroupData.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) commonGroupData.groupName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, commonGroupData.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || commonGroupData.sortOrder != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, commonGroupData.sortOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || commonGroupData.tokenCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, commonGroupData.tokenCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && commonGroupData.status == StringBooleanType.FALSE) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], commonGroupData.status);
    }

    public CommonGroupData(int i, @NotNull String str, int i2, int i3, @NotNull StringBooleanType stringBooleanType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        this.groupId = i;
        this.groupName = str;
        this.sortOrder = i2;
        this.tokenCount = i3;
        this.status = stringBooleanType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.lang.String:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 int) : (0 int))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.common.constants.StringBooleanType:0x0020: SGET  A[WRAPPED] (LINE:22) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r8v0 com.okinc.business.market.common.constants.StringBooleanType))
 A[MD:(int, java.lang.String, int, int, com.okinc.business.market.common.constants.StringBooleanType):void (m)] (LINE:12) call: com.okinc.business.market.features.group.domain.CommonGroupData.<init>(int, java.lang.String, int, int, com.okinc.business.market.common.constants.StringBooleanType):void type: THIS */
    public /* synthetic */ CommonGroupData(int i, String str, int i2, int i3, StringBooleanType stringBooleanType, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? StringBooleanType.FALSE : stringBooleanType);
    }
}
