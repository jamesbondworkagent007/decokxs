package com.okinc.okex.center.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class HasMoreTransactions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean deposit;
    private final boolean p2p;
    private final boolean withdraw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HasMoreTransactions() {
        this(false, false, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HasMoreTransactions copy$default(HasMoreTransactions hasMoreTransactions, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hasMoreTransactions.deposit;
        }
        if ((i & 2) != 0) {
            z2 = hasMoreTransactions.p2p;
        }
        if ((i & 4) != 0) {
            z3 = hasMoreTransactions.withdraw;
        }
        return hasMoreTransactions.copy(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.deposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.p2p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.withdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HasMoreTransactions copy(boolean z, boolean z2, boolean z3) {
        return new HasMoreTransactions(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HasMoreTransactions)) {
            return false;
        }
        HasMoreTransactions hasMoreTransactions = (HasMoreTransactions) obj;
        return this.deposit == hasMoreTransactions.deposit && this.p2p == hasMoreTransactions.p2p && this.withdraw == hasMoreTransactions.withdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDeposit() {
        return this.deposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getP2p() {
        return this.p2p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getWithdraw() {
        return this.withdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.deposit) * 31) + Boolean.hashCode(this.p2p)) * 31) + Boolean.hashCode(this.withdraw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HasMoreTransactions(deposit=" + this.deposit + ", p2p=" + this.p2p + ", withdraw=" + this.withdraw + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.HasMoreTransactions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HasMoreTransactions> serializer() {
            return HasMoreTransactions$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HasMoreTransactions(int i, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.deposit = false;
        } else {
            this.deposit = z;
        }
        if ((i & 2) == 0) {
            this.p2p = false;
        } else {
            this.p2p = z2;
        }
        if ((i & 4) == 0) {
            this.withdraw = false;
        } else {
            this.withdraw = z3;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(HasMoreTransactions hasMoreTransactions, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || hasMoreTransactions.deposit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, hasMoreTransactions.deposit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || hasMoreTransactions.p2p) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, hasMoreTransactions.p2p);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || hasMoreTransactions.withdraw) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, hasMoreTransactions.withdraw);
        }
    }

    public HasMoreTransactions(boolean z, boolean z2, boolean z3) {
        this.deposit = z;
        this.p2p = z2;
        this.withdraw = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, boolean, boolean):void (m)] (LINE:8) call: com.okinc.okex.center.bean.HasMoreTransactions.<init>(boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ HasMoreTransactions(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
