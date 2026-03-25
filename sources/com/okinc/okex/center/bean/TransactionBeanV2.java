package com.okinc.okex.center.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class TransactionBeanV2 {
    private final ContextualScenarioModel contextualScenario;
    private final SelfServiceTools selfServiceTools;
    private final TransactionBean transaction;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionBeanV2() {
        this((TransactionBean) null, (ContextualScenarioModel) null, (SelfServiceTools) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransactionBeanV2 copy$default(TransactionBeanV2 transactionBeanV2, TransactionBean transactionBean, ContextualScenarioModel contextualScenarioModel, SelfServiceTools selfServiceTools, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionBean = transactionBeanV2.transaction;
        }
        if ((i & 2) != 0) {
            contextualScenarioModel = transactionBeanV2.contextualScenario;
        }
        if ((i & 4) != 0) {
            selfServiceTools = transactionBeanV2.selfServiceTools;
        }
        return transactionBeanV2.copy(transactionBean, contextualScenarioModel, selfServiceTools);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean component1() {
        return this.transaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarioModel component2() {
        return this.contextualScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools component3() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBeanV2 copy(TransactionBean transactionBean, ContextualScenarioModel contextualScenarioModel, SelfServiceTools selfServiceTools) {
        return new TransactionBeanV2(transactionBean, contextualScenarioModel, selfServiceTools);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionBeanV2)) {
            return false;
        }
        TransactionBeanV2 transactionBeanV2 = (TransactionBeanV2) obj;
        return Intrinsics.EZpvd(this.transaction, transactionBeanV2.transaction) && Intrinsics.EZpvd(this.contextualScenario, transactionBeanV2.contextualScenario) && Intrinsics.EZpvd(this.selfServiceTools, transactionBeanV2.selfServiceTools);
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
        TransactionBean transactionBean = this.transaction;
        int iHashCode = transactionBean == null ? 0 : transactionBean.hashCode();
        ContextualScenarioModel contextualScenarioModel = this.contextualScenario;
        int iHashCode2 = contextualScenarioModel == null ? 0 : contextualScenarioModel.hashCode();
        SelfServiceTools selfServiceTools = this.selfServiceTools;
        return (((iHashCode * 31) + iHashCode2) * 31) + (selfServiceTools != null ? selfServiceTools.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionBeanV2(transaction=" + this.transaction + ", contextualScenario=" + this.contextualScenario + ", selfServiceTools=" + this.selfServiceTools + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.TransactionBeanV2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionBeanV2> serializer() {
            return TransactionBeanV2$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionBeanV2(int i, TransactionBean transactionBean, ContextualScenarioModel contextualScenarioModel, SelfServiceTools selfServiceTools, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.transaction = null;
        } else {
            this.transaction = transactionBean;
        }
        if ((i & 2) == 0) {
            this.contextualScenario = null;
        } else {
            this.contextualScenario = contextualScenarioModel;
        }
        if ((i & 4) == 0) {
            this.selfServiceTools = null;
        } else {
            this.selfServiceTools = selfServiceTools;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TransactionBeanV2 transactionBeanV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transactionBeanV2.transaction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TransactionBean$$serializer.INSTANCE, transactionBeanV2.transaction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || transactionBeanV2.contextualScenario != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ContextualScenarioModel$$serializer.INSTANCE, transactionBeanV2.contextualScenario);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && transactionBeanV2.selfServiceTools == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SelfServiceTools$$serializer.INSTANCE, transactionBeanV2.selfServiceTools);
    }

    public TransactionBeanV2(TransactionBean transactionBean, ContextualScenarioModel contextualScenarioModel, SelfServiceTools selfServiceTools) {
        this.transaction = transactionBean;
        this.contextualScenario = contextualScenarioModel;
        this.selfServiceTools = selfServiceTools;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.TransactionBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TransactionBean) : (r2v0 com.okinc.okex.center.bean.TransactionBean))
  (wrap:com.okinc.okex.center.bean.ContextualScenarioModel:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContextualScenarioModel) : (r3v0 com.okinc.okex.center.bean.ContextualScenarioModel))
  (wrap:com.okinc.okex.center.bean.SelfServiceTools:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceTools) : (r4v0 com.okinc.okex.center.bean.SelfServiceTools))
 A[MD:(com.okinc.okex.center.bean.TransactionBean, com.okinc.okex.center.bean.ContextualScenarioModel, com.okinc.okex.center.bean.SelfServiceTools):void (m)] (LINE:35) call: com.okinc.okex.center.bean.TransactionBeanV2.<init>(com.okinc.okex.center.bean.TransactionBean, com.okinc.okex.center.bean.ContextualScenarioModel, com.okinc.okex.center.bean.SelfServiceTools):void type: THIS */
    public /* synthetic */ TransactionBeanV2(TransactionBean transactionBean, ContextualScenarioModel contextualScenarioModel, SelfServiceTools selfServiceTools, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transactionBean, (i & 2) != 0 ? null : contextualScenarioModel, (i & 4) != 0 ? null : selfServiceTools);
    }
}
