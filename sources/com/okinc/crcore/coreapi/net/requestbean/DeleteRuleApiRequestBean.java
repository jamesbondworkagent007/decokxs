package com.okinc.crcore.coreapi.net.requestbean;

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
public final class DeleteRuleApiRequestBean {
    private int bizType;
    private String ruleId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeleteRuleApiRequestBean() {
        this((String) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeleteRuleApiRequestBean copy$default(DeleteRuleApiRequestBean deleteRuleApiRequestBean, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deleteRuleApiRequestBean.ruleId;
        }
        if ((i2 & 2) != 0) {
            i = deleteRuleApiRequestBean.bizType;
        }
        return deleteRuleApiRequestBean.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeleteRuleApiRequestBean copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DeleteRuleApiRequestBean(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteRuleApiRequestBean)) {
            return false;
        }
        DeleteRuleApiRequestBean deleteRuleApiRequestBean = (DeleteRuleApiRequestBean) obj;
        return Intrinsics.EZpvd((Object) this.ruleId, (Object) deleteRuleApiRequestBean.ruleId) && this.bizType == deleteRuleApiRequestBean.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleId() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.ruleId.hashCode() * 31) + Integer.hashCode(this.bizType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(int i) {
        this.bizType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ruleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeleteRuleApiRequestBean(ruleId=" + this.ruleId + ", bizType=" + this.bizType + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.DeleteRuleApiRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeleteRuleApiRequestBean> serializer() {
            return DeleteRuleApiRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeleteRuleApiRequestBean(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.ruleId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.bizType = 0;
        } else {
            this.bizType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DeleteRuleApiRequestBean deleteRuleApiRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) deleteRuleApiRequestBean.ruleId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, deleteRuleApiRequestBean.ruleId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && deleteRuleApiRequestBean.bizType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, deleteRuleApiRequestBean.bizType);
    }

    public DeleteRuleApiRequestBean(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ruleId = str;
        this.bizType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.requestbean.DeleteRuleApiRequestBean.<init>(java.lang.String, int):void type: THIS */
    public /* synthetic */ DeleteRuleApiRequestBean(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
