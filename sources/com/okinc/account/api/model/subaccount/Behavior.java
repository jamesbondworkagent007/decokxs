package com.okinc.account.api.model.subaccount;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class Behavior {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int create;
    private final int modifyPwd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public Behavior() {
        int i = 0;
        this(i, i, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Behavior copy$default(Behavior behavior, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = behavior.modifyPwd;
        }
        if ((i3 & 2) != 0) {
            i2 = behavior.create;
        }
        return behavior.copy(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.modifyPwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.create;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Behavior copy(int i, int i2) {
        return new Behavior(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Behavior)) {
            return false;
        }
        Behavior behavior = (Behavior) obj;
        return this.modifyPwd == behavior.modifyPwd && this.create == behavior.create;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCreate() {
        return this.create;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getModifyPwd() {
        return this.modifyPwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.modifyPwd) * 31) + Integer.hashCode(this.create);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Behavior(modifyPwd=" + this.modifyPwd + ", create=" + this.create + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.subaccount.Behavior.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Behavior> serializer() {
            return Behavior$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Behavior(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.modifyPwd = Integer.MIN_VALUE;
        } else {
            this.modifyPwd = i2;
        }
        if ((i & 2) == 0) {
            this.create = Integer.MIN_VALUE;
        } else {
            this.create = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(Behavior behavior, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || behavior.modifyPwd != Integer.MIN_VALUE) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, behavior.modifyPwd);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && behavior.create == Integer.MIN_VALUE) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, behavior.create);
    }

    public Behavior(int i, int i2) {
        this.modifyPwd = i;
        this.create = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (Integer.MIN_VALUE int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (Integer.MIN_VALUE int) : (r3v0 int))
 A[MD:(int, int):void (m)] (LINE:15) call: com.okinc.account.api.model.subaccount.Behavior.<init>(int, int):void type: THIS */
    public /* synthetic */ Behavior(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Integer.MIN_VALUE : i, (i3 & 2) != 0 ? Integer.MIN_VALUE : i2);
    }
}
