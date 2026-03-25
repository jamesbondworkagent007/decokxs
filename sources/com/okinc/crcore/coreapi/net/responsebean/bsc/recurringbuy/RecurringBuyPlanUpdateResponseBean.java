package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class RecurringBuyPlanUpdateResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String editedAmount;
    private final String editedFrequency;
    private final String planId;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringBuyPlanUpdateResponseBean copy$default(RecurringBuyPlanUpdateResponseBean recurringBuyPlanUpdateResponseBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringBuyPlanUpdateResponseBean.planId;
        }
        if ((i & 2) != 0) {
            str2 = recurringBuyPlanUpdateResponseBean.status;
        }
        if ((i & 4) != 0) {
            str3 = recurringBuyPlanUpdateResponseBean.editedAmount;
        }
        if ((i & 8) != 0) {
            str4 = recurringBuyPlanUpdateResponseBean.editedFrequency;
        }
        return recurringBuyPlanUpdateResponseBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.editedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.editedFrequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanUpdateResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new RecurringBuyPlanUpdateResponseBean(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBuyPlanUpdateResponseBean)) {
            return false;
        }
        RecurringBuyPlanUpdateResponseBean recurringBuyPlanUpdateResponseBean = (RecurringBuyPlanUpdateResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.planId, (Object) recurringBuyPlanUpdateResponseBean.planId) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyPlanUpdateResponseBean.status) && Intrinsics.EZpvd((Object) this.editedAmount, (Object) recurringBuyPlanUpdateResponseBean.editedAmount) && Intrinsics.EZpvd((Object) this.editedFrequency, (Object) recurringBuyPlanUpdateResponseBean.editedFrequency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEditedAmount() {
        return this.editedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEditedFrequency() {
        return this.editedFrequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.planId.hashCode() * 31) + this.status.hashCode()) * 31) + this.editedAmount.hashCode()) * 31) + this.editedFrequency.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanUpdateResponseBean(planId=" + this.planId + ", status=" + this.status + ", editedAmount=" + this.editedAmount + ", editedFrequency=" + this.editedFrequency + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanUpdateResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyPlanUpdateResponseBean> serializer() {
            return RecurringBuyPlanUpdateResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyPlanUpdateResponseBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, RecurringBuyPlanUpdateResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.planId = str;
        this.status = str2;
        if ((i & 4) == 0) {
            this.editedAmount = "";
        } else {
            this.editedAmount = str3;
        }
        if ((i & 8) == 0) {
            this.editedFrequency = "";
        } else {
            this.editedFrequency = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyPlanUpdateResponseBean recurringBuyPlanUpdateResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBuyPlanUpdateResponseBean.planId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyPlanUpdateResponseBean.status);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) recurringBuyPlanUpdateResponseBean.editedAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringBuyPlanUpdateResponseBean.editedAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) recurringBuyPlanUpdateResponseBean.editedFrequency, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringBuyPlanUpdateResponseBean.editedFrequency);
    }

    public RecurringBuyPlanUpdateResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.planId = str;
        this.status = str2;
        this.editedAmount = str3;
        this.editedFrequency = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanUpdateResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecurringBuyPlanUpdateResponseBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
