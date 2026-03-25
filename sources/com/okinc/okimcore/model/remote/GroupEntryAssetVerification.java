package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType;
import com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupEntryAssetVerification {
    public static final int $stable = 0;
    private final String assetAmount;
    private final GroupEntryAssetsVerificationStatus assetVerificationStatus;
    private final GroupEntryAssetVerificationType assetVerificationType;
    private final String currencyCode;
    private final Integer currencyId;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {GroupEntryAssetsVerificationStatus.Companion.serializer(), GroupEntryAssetVerificationType.Companion.serializer(), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupEntryAssetVerification() {
        this((GroupEntryAssetsVerificationStatus) null, (GroupEntryAssetVerificationType) null, (Integer) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupEntryAssetVerification copy$default(GroupEntryAssetVerification groupEntryAssetVerification, GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            groupEntryAssetsVerificationStatus = groupEntryAssetVerification.assetVerificationStatus;
        }
        if ((i & 2) != 0) {
            groupEntryAssetVerificationType = groupEntryAssetVerification.assetVerificationType;
        }
        GroupEntryAssetVerificationType groupEntryAssetVerificationType2 = groupEntryAssetVerificationType;
        if ((i & 4) != 0) {
            num = groupEntryAssetVerification.currencyId;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str = groupEntryAssetVerification.assetAmount;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = groupEntryAssetVerification.currencyCode;
        }
        return groupEntryAssetVerification.copy(groupEntryAssetsVerificationStatus, groupEntryAssetVerificationType2, num2, str3, str2);
    }

    @SerialName("assetVerificationStatus")
    public static /* synthetic */ void getAssetVerificationStatus$annotations() {
    }

    @SerialName("assetVerificationType")
    public static /* synthetic */ void getAssetVerificationType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetsVerificationStatus component1() {
        return this.assetVerificationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerificationType component2() {
        return this.assetVerificationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerification copy(GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2) {
        return new GroupEntryAssetVerification(groupEntryAssetsVerificationStatus, groupEntryAssetVerificationType, num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupEntryAssetVerification)) {
            return false;
        }
        GroupEntryAssetVerification groupEntryAssetVerification = (GroupEntryAssetVerification) obj;
        return this.assetVerificationStatus == groupEntryAssetVerification.assetVerificationStatus && this.assetVerificationType == groupEntryAssetVerification.assetVerificationType && Intrinsics.EZpvd(this.currencyId, groupEntryAssetVerification.currencyId) && Intrinsics.EZpvd((Object) this.assetAmount, (Object) groupEntryAssetVerification.assetAmount) && Intrinsics.EZpvd((Object) this.currencyCode, (Object) groupEntryAssetVerification.currencyCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetAmount() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetsVerificationStatus getAssetVerificationStatus() {
        return this.assetVerificationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerificationType getAssetVerificationType() {
        return this.assetVerificationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus = this.assetVerificationStatus;
        int iHashCode = groupEntryAssetsVerificationStatus == null ? 0 : groupEntryAssetsVerificationStatus.hashCode();
        GroupEntryAssetVerificationType groupEntryAssetVerificationType = this.assetVerificationType;
        int iHashCode2 = groupEntryAssetVerificationType == null ? 0 : groupEntryAssetVerificationType.hashCode();
        Integer num = this.currencyId;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.assetAmount;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.currencyCode;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupEntryAssetVerification(assetVerificationStatus=" + this.assetVerificationStatus + ", assetVerificationType=" + this.assetVerificationType + ", currencyId=" + this.currencyId + ", assetAmount=" + this.assetAmount + ", currencyCode=" + this.currencyCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupEntryAssetVerification.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupEntryAssetVerification> serializer() {
            return GroupEntryAssetVerification$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupEntryAssetVerification(int i, GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.assetVerificationStatus = null;
        } else {
            this.assetVerificationStatus = groupEntryAssetsVerificationStatus;
        }
        if ((i & 2) == 0) {
            this.assetVerificationType = null;
        } else {
            this.assetVerificationType = groupEntryAssetVerificationType;
        }
        if ((i & 4) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 8) == 0) {
            this.assetAmount = null;
        } else {
            this.assetAmount = str;
        }
        if ((i & 16) == 0) {
            this.currencyCode = null;
        } else {
            this.currencyCode = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupEntryAssetVerification groupEntryAssetVerification, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupEntryAssetVerification.assetVerificationStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupEntryAssetVerification.assetVerificationStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupEntryAssetVerification.assetVerificationType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupEntryAssetVerification.assetVerificationType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupEntryAssetVerification.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, groupEntryAssetVerification.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupEntryAssetVerification.assetAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, groupEntryAssetVerification.assetAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && groupEntryAssetVerification.currencyCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, groupEntryAssetVerification.currencyCode);
    }

    public GroupEntryAssetVerification(GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2) {
        this.assetVerificationStatus = groupEntryAssetsVerificationStatus;
        this.assetVerificationType = groupEntryAssetVerificationType;
        this.currencyId = num;
        this.assetAmount = str;
        this.currencyCode = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus) : (r5v0 com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus))
  (wrap:com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType) : (r6v0 com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus, com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:71) call: com.okinc.okimcore.model.remote.GroupEntryAssetVerification.<init>(com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus, com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GroupEntryAssetVerification(GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : groupEntryAssetsVerificationStatus, (i & 2) != 0 ? null : groupEntryAssetVerificationType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
