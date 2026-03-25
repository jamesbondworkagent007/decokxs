package com.okinc.okex.center.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class LandingTransactionItemBean {
    private final ContextualScenarioModel contextualScenario;
    private final SelfServiceTools selfServiceTools;
    private final TransactionBean transaction;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LandingTransactionItemBean() {
        this((ContextualScenarioModel) null, (SelfServiceTools) null, (TransactionBean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LandingTransactionItemBean copy$default(LandingTransactionItemBean landingTransactionItemBean, ContextualScenarioModel contextualScenarioModel, SelfServiceTools selfServiceTools, TransactionBean transactionBean, int i, Object obj) {
        if ((i & 1) != 0) {
            contextualScenarioModel = landingTransactionItemBean.contextualScenario;
        }
        if ((i & 2) != 0) {
            selfServiceTools = landingTransactionItemBean.selfServiceTools;
        }
        if ((i & 4) != 0) {
            transactionBean = landingTransactionItemBean.transaction;
        }
        return landingTransactionItemBean.copy(contextualScenarioModel, selfServiceTools, transactionBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel component1() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools component2() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean component3() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LandingTransactionItemBean copy(ContextualScenarioModel contextualScenarioModel, SelfServiceTools selfServiceTools, TransactionBean transactionBean) {
        return new LandingTransactionItemBean(contextualScenarioModel, selfServiceTools, transactionBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingTransactionItemBean)) {
            return false;
        }
        LandingTransactionItemBean landingTransactionItemBean = (LandingTransactionItemBean) obj;
        return Intrinsics.EZpvd(this.contextualScenario, landingTransactionItemBean.contextualScenario) && Intrinsics.EZpvd(this.selfServiceTools, landingTransactionItemBean.selfServiceTools) && Intrinsics.EZpvd(this.transaction, landingTransactionItemBean.transaction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel getContextualScenario() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools getSelfServiceTools() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean getTransaction() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ContextualScenarioModel contextualScenarioModel = this.contextualScenario;
        int iHashCode = contextualScenarioModel == null ? 0 : contextualScenarioModel.hashCode();
        SelfServiceTools selfServiceTools = this.selfServiceTools;
        int iHashCode2 = selfServiceTools == null ? 0 : selfServiceTools.hashCode();
        TransactionBean transactionBean = this.transaction;
        return (((iHashCode * 31) + iHashCode2) * 31) + (transactionBean != null ? transactionBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LandingTransactionItemBean(contextualScenario=" + this.contextualScenario + ", selfServiceTools=" + this.selfServiceTools + ", transaction=" + this.transaction + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.LandingTransactionItemBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LandingTransactionItemBean> serializer() {
            return LandingTransactionItemBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LandingTransactionItemBean(int i, ContextualScenarioModel contextualScenarioModel, SelfServiceTools selfServiceTools, TransactionBean transactionBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contextualScenario = null;
        } else {
            this.contextualScenario = contextualScenarioModel;
        }
        if ((i & 2) == 0) {
            this.selfServiceTools = null;
        } else {
            this.selfServiceTools = selfServiceTools;
        }
        if ((i & 4) == 0) {
            this.transaction = null;
        } else {
            this.transaction = transactionBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(LandingTransactionItemBean landingTransactionItemBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || landingTransactionItemBean.contextualScenario != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ContextualScenarioModel$$serializer.INSTANCE, landingTransactionItemBean.contextualScenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || landingTransactionItemBean.selfServiceTools != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, SelfServiceTools$$serializer.INSTANCE, landingTransactionItemBean.selfServiceTools);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && landingTransactionItemBean.transaction == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TransactionBean$$serializer.INSTANCE, landingTransactionItemBean.transaction);
    }

    public LandingTransactionItemBean(ContextualScenarioModel contextualScenarioModel, SelfServiceTools selfServiceTools, TransactionBean transactionBean) {
        this.contextualScenario = contextualScenarioModel;
        this.selfServiceTools = selfServiceTools;
        this.transaction = transactionBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.ContextualScenarioModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContextualScenarioModel) : (r2v0 com.okinc.okex.center.bean.ContextualScenarioModel))
  (wrap:com.okinc.okex.center.bean.SelfServiceTools:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceTools) : (r3v0 com.okinc.okex.center.bean.SelfServiceTools))
  (wrap:com.okinc.okex.center.bean.TransactionBean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TransactionBean) : (r4v0 com.okinc.okex.center.bean.TransactionBean))
 A[MD:(com.okinc.okex.center.bean.ContextualScenarioModel, com.okinc.okex.center.bean.SelfServiceTools, com.okinc.okex.center.bean.TransactionBean):void (m)] (LINE:17) call: com.okinc.okex.center.bean.LandingTransactionItemBean.<init>(com.okinc.okex.center.bean.ContextualScenarioModel, com.okinc.okex.center.bean.SelfServiceTools, com.okinc.okex.center.bean.TransactionBean):void type: THIS */
    public /* synthetic */ LandingTransactionItemBean(ContextualScenarioModel contextualScenarioModel, SelfServiceTools selfServiceTools, TransactionBean transactionBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contextualScenarioModel, (i & 2) != 0 ? null : selfServiceTools, (i & 4) != 0 ? null : transactionBean);
    }
}
