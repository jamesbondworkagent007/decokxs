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
public final class ContextualScenarios {
    private final TxnContextualModel deposit;
    private final TxnContextualModel p2p;
    private final TxnContextualModel withdraw;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContextualScenarios() {
        this((TxnContextualModel) null, (TxnContextualModel) null, (TxnContextualModel) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContextualScenarios copy$default(ContextualScenarios contextualScenarios, TxnContextualModel txnContextualModel, TxnContextualModel txnContextualModel2, TxnContextualModel txnContextualModel3, int i, Object obj) {
        if ((i & 1) != 0) {
            txnContextualModel = contextualScenarios.deposit;
        }
        if ((i & 2) != 0) {
            txnContextualModel2 = contextualScenarios.p2p;
        }
        if ((i & 4) != 0) {
            txnContextualModel3 = contextualScenarios.withdraw;
        }
        return contextualScenarios.copy(txnContextualModel, txnContextualModel2, txnContextualModel3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxnContextualModel component1() {
        return this.deposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxnContextualModel component2() {
        return this.p2p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxnContextualModel component3() {
        return this.withdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarios copy(TxnContextualModel txnContextualModel, TxnContextualModel txnContextualModel2, TxnContextualModel txnContextualModel3) {
        return new ContextualScenarios(txnContextualModel, txnContextualModel2, txnContextualModel3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextualScenarios)) {
            return false;
        }
        ContextualScenarios contextualScenarios = (ContextualScenarios) obj;
        return Intrinsics.EZpvd(this.deposit, contextualScenarios.deposit) && Intrinsics.EZpvd(this.p2p, contextualScenarios.p2p) && Intrinsics.EZpvd(this.withdraw, contextualScenarios.withdraw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxnContextualModel getDeposit() {
        return this.deposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxnContextualModel getP2p() {
        return this.p2p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxnContextualModel getWithdraw() {
        return this.withdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TxnContextualModel txnContextualModel = this.deposit;
        int iHashCode = txnContextualModel == null ? 0 : txnContextualModel.hashCode();
        TxnContextualModel txnContextualModel2 = this.p2p;
        int iHashCode2 = txnContextualModel2 == null ? 0 : txnContextualModel2.hashCode();
        TxnContextualModel txnContextualModel3 = this.withdraw;
        return (((iHashCode * 31) + iHashCode2) * 31) + (txnContextualModel3 != null ? txnContextualModel3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContextualScenarios(deposit=" + this.deposit + ", p2p=" + this.p2p + ", withdraw=" + this.withdraw + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.ContextualScenarios.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContextualScenarios> serializer() {
            return ContextualScenarios$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContextualScenarios(int i, TxnContextualModel txnContextualModel, TxnContextualModel txnContextualModel2, TxnContextualModel txnContextualModel3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.deposit = null;
        } else {
            this.deposit = txnContextualModel;
        }
        if ((i & 2) == 0) {
            this.p2p = null;
        } else {
            this.p2p = txnContextualModel2;
        }
        if ((i & 4) == 0) {
            this.withdraw = null;
        } else {
            this.withdraw = txnContextualModel3;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(ContextualScenarios contextualScenarios, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || contextualScenarios.deposit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TxnContextualModel$$serializer.INSTANCE, contextualScenarios.deposit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || contextualScenarios.p2p != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, TxnContextualModel$$serializer.INSTANCE, contextualScenarios.p2p);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && contextualScenarios.withdraw == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TxnContextualModel$$serializer.INSTANCE, contextualScenarios.withdraw);
    }

    public ContextualScenarios(TxnContextualModel txnContextualModel, TxnContextualModel txnContextualModel2, TxnContextualModel txnContextualModel3) {
        this.deposit = txnContextualModel;
        this.p2p = txnContextualModel2;
        this.withdraw = txnContextualModel3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.TxnContextualModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TxnContextualModel) : (r2v0 com.okinc.okex.center.bean.TxnContextualModel))
  (wrap:com.okinc.okex.center.bean.TxnContextualModel:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TxnContextualModel) : (r3v0 com.okinc.okex.center.bean.TxnContextualModel))
  (wrap:com.okinc.okex.center.bean.TxnContextualModel:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TxnContextualModel) : (r4v0 com.okinc.okex.center.bean.TxnContextualModel))
 A[MD:(com.okinc.okex.center.bean.TxnContextualModel, com.okinc.okex.center.bean.TxnContextualModel, com.okinc.okex.center.bean.TxnContextualModel):void (m)] (LINE:16) call: com.okinc.okex.center.bean.ContextualScenarios.<init>(com.okinc.okex.center.bean.TxnContextualModel, com.okinc.okex.center.bean.TxnContextualModel, com.okinc.okex.center.bean.TxnContextualModel):void type: THIS */
    public /* synthetic */ ContextualScenarios(TxnContextualModel txnContextualModel, TxnContextualModel txnContextualModel2, TxnContextualModel txnContextualModel3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : txnContextualModel, (i & 2) != 0 ? null : txnContextualModel2, (i & 4) != 0 ? null : txnContextualModel3);
    }
}
