package com.okinc.okimcore.model.im.group;

import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class GroupMemberFilters {
    public static final int $stable = 0;
    private final BillingCyclePaymentStatus billingCyclePaymentStatus;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {BillingCyclePaymentStatus.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupMemberFilters() {
        this((BillingCyclePaymentStatus) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupMemberFilters copy$default(GroupMemberFilters groupMemberFilters, BillingCyclePaymentStatus billingCyclePaymentStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            billingCyclePaymentStatus = groupMemberFilters.billingCyclePaymentStatus;
        }
        return groupMemberFilters.copy(billingCyclePaymentStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingCyclePaymentStatus component1() {
        return this.billingCyclePaymentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupMemberFilters copy(BillingCyclePaymentStatus billingCyclePaymentStatus) {
        return new GroupMemberFilters(billingCyclePaymentStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupMemberFilters) && this.billingCyclePaymentStatus == ((GroupMemberFilters) obj).billingCyclePaymentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingCyclePaymentStatus getBillingCyclePaymentStatus() {
        return this.billingCyclePaymentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BillingCyclePaymentStatus billingCyclePaymentStatus = this.billingCyclePaymentStatus;
        if (billingCyclePaymentStatus == null) {
            return 0;
        }
        return billingCyclePaymentStatus.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupMemberFilters(billingCyclePaymentStatus=" + this.billingCyclePaymentStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.GroupMemberFilters.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupMemberFilters> serializer() {
            return GroupMemberFilters$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupMemberFilters(int i, BillingCyclePaymentStatus billingCyclePaymentStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.billingCyclePaymentStatus = null;
        } else {
            this.billingCyclePaymentStatus = billingCyclePaymentStatus;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupMemberFilters groupMemberFilters, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && groupMemberFilters.billingCyclePaymentStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupMemberFilters.billingCyclePaymentStatus);
    }

    public GroupMemberFilters(BillingCyclePaymentStatus billingCyclePaymentStatus) {
        this.billingCyclePaymentStatus = billingCyclePaymentStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus) : (r1v0 com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus))
 A[MD:(com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus):void (m)] (LINE:14) call: com.okinc.okimcore.model.im.group.GroupMemberFilters.<init>(com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus):void type: THIS */
    public /* synthetic */ GroupMemberFilters(BillingCyclePaymentStatus billingCyclePaymentStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : billingCyclePaymentStatus);
    }

    public final String toJsonString() {
        try {
            Json.Default r0 = Json.Default;
            r0.getSerializersModule();
            return r0.encodeToString(Companion.serializer(), this);
        } catch (Exception unused) {
            return null;
        }
    }
}
