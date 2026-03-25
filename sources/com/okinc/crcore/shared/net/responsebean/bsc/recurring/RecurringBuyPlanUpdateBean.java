package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanUpdateResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class RecurringBuyPlanUpdateBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String planId;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyPlanUpdateBean() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringBuyPlanUpdateBean copy$default(RecurringBuyPlanUpdateBean recurringBuyPlanUpdateBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringBuyPlanUpdateBean.planId;
        }
        if ((i & 2) != 0) {
            str2 = recurringBuyPlanUpdateBean.status;
        }
        return recurringBuyPlanUpdateBean.copy(str, str2);
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
    public final RecurringBuyPlanUpdateBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RecurringBuyPlanUpdateBean(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBuyPlanUpdateBean)) {
            return false;
        }
        RecurringBuyPlanUpdateBean recurringBuyPlanUpdateBean = (RecurringBuyPlanUpdateBean) obj;
        return Intrinsics.EZpvd((Object) this.planId, (Object) recurringBuyPlanUpdateBean.planId) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyPlanUpdateBean.status);
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
        return (this.planId.hashCode() * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanUpdateBean(planId=" + this.planId + ", status=" + this.status + ")";
    }

    public /* synthetic */ RecurringBuyPlanUpdateBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.planId = "";
        } else {
            this.planId = str;
        }
        if ((i & 2) == 0) {
            this.status = "";
        } else {
            this.status = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyPlanUpdateBean recurringBuyPlanUpdateBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) recurringBuyPlanUpdateBean.planId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBuyPlanUpdateBean.planId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) recurringBuyPlanUpdateBean.status, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyPlanUpdateBean.status);
    }

    public RecurringBuyPlanUpdateBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.planId = str;
        this.status = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanUpdateBean.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecurringBuyPlanUpdateBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanUpdateBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecurringBuyPlanUpdateBean> serializer() {
            return RecurringBuyPlanUpdateBean$$serializer.INSTANCE;
        }

        public final RecurringBuyPlanUpdateBean AEQbTJ(@NotNull RecurringBuyPlanUpdateResponseBean recurringBuyPlanUpdateResponseBean) {
            Intrinsics.checkNotNullParameter(recurringBuyPlanUpdateResponseBean, "");
            return new RecurringBuyPlanUpdateBean(recurringBuyPlanUpdateResponseBean.getPlanId(), recurringBuyPlanUpdateResponseBean.getStatus());
        }
    }
}
