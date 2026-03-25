package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupEntryCreateVerificationRequestResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final GroupEntryAssetVerification assetVerification;
    private final GroupEntryBillingModel billingModel;
    private final Long groupId;
    private final Integer verificationType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupEntryCreateVerificationRequestResponse() {
        this((Long) null, (Integer) null, (GroupEntryAssetVerification) null, (GroupEntryBillingModel) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupEntryCreateVerificationRequestResponse copy$default(GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse, Long l, Integer num, GroupEntryAssetVerification groupEntryAssetVerification, GroupEntryBillingModel groupEntryBillingModel, int i, Object obj) {
        if ((i & 1) != 0) {
            l = groupEntryCreateVerificationRequestResponse.groupId;
        }
        if ((i & 2) != 0) {
            num = groupEntryCreateVerificationRequestResponse.verificationType;
        }
        if ((i & 4) != 0) {
            groupEntryAssetVerification = groupEntryCreateVerificationRequestResponse.assetVerification;
        }
        if ((i & 8) != 0) {
            groupEntryBillingModel = groupEntryCreateVerificationRequestResponse.billingModel;
        }
        return groupEntryCreateVerificationRequestResponse.copy(l, num, groupEntryAssetVerification, groupEntryBillingModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.verificationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerification component3() {
        return this.assetVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryBillingModel component4() {
        return this.billingModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryCreateVerificationRequestResponse copy(Long l, Integer num, GroupEntryAssetVerification groupEntryAssetVerification, GroupEntryBillingModel groupEntryBillingModel) {
        return new GroupEntryCreateVerificationRequestResponse(l, num, groupEntryAssetVerification, groupEntryBillingModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupEntryCreateVerificationRequestResponse)) {
            return false;
        }
        GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse = (GroupEntryCreateVerificationRequestResponse) obj;
        return Intrinsics.EZpvd(this.groupId, groupEntryCreateVerificationRequestResponse.groupId) && Intrinsics.EZpvd(this.verificationType, groupEntryCreateVerificationRequestResponse.verificationType) && Intrinsics.EZpvd(this.assetVerification, groupEntryCreateVerificationRequestResponse.assetVerification) && Intrinsics.EZpvd(this.billingModel, groupEntryCreateVerificationRequestResponse.billingModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerification getAssetVerification() {
        return this.assetVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryBillingModel getBillingModel() {
        return this.billingModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVerificationType() {
        return this.verificationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.groupId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Integer num = this.verificationType;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        GroupEntryAssetVerification groupEntryAssetVerification = this.assetVerification;
        int iHashCode3 = groupEntryAssetVerification == null ? 0 : groupEntryAssetVerification.hashCode();
        GroupEntryBillingModel groupEntryBillingModel = this.billingModel;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (groupEntryBillingModel != null ? groupEntryBillingModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupEntryCreateVerificationRequestResponse(groupId=" + this.groupId + ", verificationType=" + this.verificationType + ", assetVerification=" + this.assetVerification + ", billingModel=" + this.billingModel + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupEntryCreateVerificationRequestResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupEntryCreateVerificationRequestResponse> serializer() {
            return GroupEntryCreateVerificationRequestResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupEntryCreateVerificationRequestResponse(int i, Long l, Integer num, GroupEntryAssetVerification groupEntryAssetVerification, GroupEntryBillingModel groupEntryBillingModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 2) == 0) {
            this.verificationType = null;
        } else {
            this.verificationType = num;
        }
        if ((i & 4) == 0) {
            this.assetVerification = null;
        } else {
            this.assetVerification = groupEntryAssetVerification;
        }
        if ((i & 8) == 0) {
            this.billingModel = null;
        } else {
            this.billingModel = groupEntryBillingModel;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupEntryCreateVerificationRequestResponse.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, groupEntryCreateVerificationRequestResponse.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupEntryCreateVerificationRequestResponse.verificationType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, groupEntryCreateVerificationRequestResponse.verificationType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupEntryCreateVerificationRequestResponse.assetVerification != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, GroupEntryAssetVerification$$serializer.INSTANCE, groupEntryCreateVerificationRequestResponse.assetVerification);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && groupEntryCreateVerificationRequestResponse.billingModel == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, GroupEntryBillingModel$$serializer.INSTANCE, groupEntryCreateVerificationRequestResponse.billingModel);
    }

    public GroupEntryCreateVerificationRequestResponse(Long l, Integer num, GroupEntryAssetVerification groupEntryAssetVerification, GroupEntryBillingModel groupEntryBillingModel) {
        this.groupId = l;
        this.verificationType = num;
        this.assetVerification = groupEntryAssetVerification;
        this.billingModel = groupEntryBillingModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:com.okinc.okimcore.model.remote.GroupEntryAssetVerification:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupEntryAssetVerification) : (r4v0 com.okinc.okimcore.model.remote.GroupEntryAssetVerification))
  (wrap:com.okinc.okimcore.model.remote.GroupEntryBillingModel:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupEntryBillingModel) : (r5v0 com.okinc.okimcore.model.remote.GroupEntryBillingModel))
 A[MD:(java.lang.Long, java.lang.Integer, com.okinc.okimcore.model.remote.GroupEntryAssetVerification, com.okinc.okimcore.model.remote.GroupEntryBillingModel):void (m)] (LINE:62) call: com.okinc.okimcore.model.remote.GroupEntryCreateVerificationRequestResponse.<init>(java.lang.Long, java.lang.Integer, com.okinc.okimcore.model.remote.GroupEntryAssetVerification, com.okinc.okimcore.model.remote.GroupEntryBillingModel):void type: THIS */
    public /* synthetic */ GroupEntryCreateVerificationRequestResponse(Long l, Integer num, GroupEntryAssetVerification groupEntryAssetVerification, GroupEntryBillingModel groupEntryBillingModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : groupEntryAssetVerification, (i & 8) != 0 ? null : groupEntryBillingModel);
    }
}
