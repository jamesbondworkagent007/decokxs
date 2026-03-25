package com.okinc.crcore.coreapi.net.requestbean.recurringbuy;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class RecurringBuyPlanUpdateRequestBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String editedAmount;
    private final String editedFrequency;
    private final String planId;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringBuyPlanUpdateRequestBean copy$default(RecurringBuyPlanUpdateRequestBean recurringBuyPlanUpdateRequestBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringBuyPlanUpdateRequestBean.planId;
        }
        if ((i & 2) != 0) {
            str2 = recurringBuyPlanUpdateRequestBean.status;
        }
        if ((i & 4) != 0) {
            str3 = recurringBuyPlanUpdateRequestBean.editedAmount;
        }
        if ((i & 8) != 0) {
            str4 = recurringBuyPlanUpdateRequestBean.editedFrequency;
        }
        return recurringBuyPlanUpdateRequestBean.copy(str, str2, str3, str4);
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
    public final RecurringBuyPlanUpdateRequestBean copy(@NotNull String str, @NotNull String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RecurringBuyPlanUpdateRequestBean(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBuyPlanUpdateRequestBean)) {
            return false;
        }
        RecurringBuyPlanUpdateRequestBean recurringBuyPlanUpdateRequestBean = (RecurringBuyPlanUpdateRequestBean) obj;
        return Intrinsics.EZpvd((Object) this.planId, (Object) recurringBuyPlanUpdateRequestBean.planId) && Intrinsics.EZpvd((Object) this.status, (Object) recurringBuyPlanUpdateRequestBean.status) && Intrinsics.EZpvd((Object) this.editedAmount, (Object) recurringBuyPlanUpdateRequestBean.editedAmount) && Intrinsics.EZpvd((Object) this.editedFrequency, (Object) recurringBuyPlanUpdateRequestBean.editedFrequency);
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
        int iHashCode = this.planId.hashCode();
        int iHashCode2 = this.status.hashCode();
        String str = this.editedAmount;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.editedFrequency;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanUpdateRequestBean(planId=" + this.planId + ", status=" + this.status + ", editedAmount=" + this.editedAmount + ", editedFrequency=" + this.editedFrequency + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.recurringbuy.RecurringBuyPlanUpdateRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyPlanUpdateRequestBean> serializer() {
            return RecurringBuyPlanUpdateRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyPlanUpdateRequestBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, RecurringBuyPlanUpdateRequestBean$$serializer.INSTANCE.getDescriptor());
        }
        this.planId = str;
        this.status = str2;
        if ((i & 4) == 0) {
            this.editedAmount = null;
        } else {
            this.editedAmount = str3;
        }
        if ((i & 8) == 0) {
            this.editedFrequency = null;
        } else {
            this.editedFrequency = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyPlanUpdateRequestBean recurringBuyPlanUpdateRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBuyPlanUpdateRequestBean.planId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyPlanUpdateRequestBean.status);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || recurringBuyPlanUpdateRequestBean.editedAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, recurringBuyPlanUpdateRequestBean.editedAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && recurringBuyPlanUpdateRequestBean.editedFrequency == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, recurringBuyPlanUpdateRequestBean.editedFrequency);
    }

    public RecurringBuyPlanUpdateRequestBean(@NotNull String str, @NotNull String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.planId = str;
        this.status = str2;
        this.editedAmount = str3;
        this.editedFrequency = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.requestbean.recurringbuy.RecurringBuyPlanUpdateRequestBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecurringBuyPlanUpdateRequestBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
