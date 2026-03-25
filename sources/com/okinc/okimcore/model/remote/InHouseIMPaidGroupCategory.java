package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMPaidGroupCategory {
    public static final int $stable = 0;
    private final BillingCyclePaymentStatus billingCyclePaymentStatus;
    private final int count;
    private final String label;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {BillingCyclePaymentStatus.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMPaidGroupCategory copy$default(InHouseIMPaidGroupCategory inHouseIMPaidGroupCategory, BillingCyclePaymentStatus billingCyclePaymentStatus, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            billingCyclePaymentStatus = inHouseIMPaidGroupCategory.billingCyclePaymentStatus;
        }
        if ((i2 & 2) != 0) {
            i = inHouseIMPaidGroupCategory.count;
        }
        if ((i2 & 4) != 0) {
            str = inHouseIMPaidGroupCategory.label;
        }
        return inHouseIMPaidGroupCategory.copy(billingCyclePaymentStatus, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingCyclePaymentStatus component1() {
        return this.billingCyclePaymentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMPaidGroupCategory copy(@NotNull BillingCyclePaymentStatus billingCyclePaymentStatus, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(billingCyclePaymentStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new InHouseIMPaidGroupCategory(billingCyclePaymentStatus, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMPaidGroupCategory)) {
            return false;
        }
        InHouseIMPaidGroupCategory inHouseIMPaidGroupCategory = (InHouseIMPaidGroupCategory) obj;
        return this.billingCyclePaymentStatus == inHouseIMPaidGroupCategory.billingCyclePaymentStatus && this.count == inHouseIMPaidGroupCategory.count && Intrinsics.EZpvd((Object) this.label, (Object) inHouseIMPaidGroupCategory.label);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingCyclePaymentStatus getBillingCyclePaymentStatus() {
        return this.billingCyclePaymentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.billingCyclePaymentStatus.hashCode() * 31) + Integer.hashCode(this.count)) * 31) + this.label.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMPaidGroupCategory(billingCyclePaymentStatus=" + this.billingCyclePaymentStatus + ", count=" + this.count + ", label=" + this.label + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMPaidGroupCategory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMPaidGroupCategory> serializer() {
            return InHouseIMPaidGroupCategory$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMPaidGroupCategory(int i, BillingCyclePaymentStatus billingCyclePaymentStatus, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, InHouseIMPaidGroupCategory$$serializer.INSTANCE.getDescriptor());
        }
        this.billingCyclePaymentStatus = billingCyclePaymentStatus;
        this.count = i2;
        this.label = str;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMPaidGroupCategory inHouseIMPaidGroupCategory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], inHouseIMPaidGroupCategory.billingCyclePaymentStatus);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, inHouseIMPaidGroupCategory.count);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, inHouseIMPaidGroupCategory.label);
    }

    public InHouseIMPaidGroupCategory(@NotNull BillingCyclePaymentStatus billingCyclePaymentStatus, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(billingCyclePaymentStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.billingCyclePaymentStatus = billingCyclePaymentStatus;
        this.count = i;
        this.label = str;
    }
}
