package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class VipLoanLimitSwitchSetReqData {
    private int switchStatus;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VipLoanLimitSwitchSetReqData copy$default(VipLoanLimitSwitchSetReqData vipLoanLimitSwitchSetReqData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = vipLoanLimitSwitchSetReqData.switchStatus;
        }
        return vipLoanLimitSwitchSetReqData.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.switchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipLoanLimitSwitchSetReqData copy(int i) {
        return new VipLoanLimitSwitchSetReqData(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VipLoanLimitSwitchSetReqData) && this.switchStatus == ((VipLoanLimitSwitchSetReqData) obj).switchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.switchStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwitchStatus(int i) {
        this.switchStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipLoanLimitSwitchSetReqData(switchStatus=" + this.switchStatus + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.VipLoanLimitSwitchSetReqData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VipLoanLimitSwitchSetReqData> serializer() {
            return VipLoanLimitSwitchSetReqData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VipLoanLimitSwitchSetReqData(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, VipLoanLimitSwitchSetReqData$$serializer.INSTANCE.getDescriptor());
        }
        this.switchStatus = i2;
    }

    public VipLoanLimitSwitchSetReqData(int i) {
        this.switchStatus = i;
    }
}
