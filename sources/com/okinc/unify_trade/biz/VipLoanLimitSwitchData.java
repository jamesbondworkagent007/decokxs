package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class VipLoanLimitSwitchData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int switchIsShow;
    private final int switchStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VipLoanLimitSwitchData copy$default(VipLoanLimitSwitchData vipLoanLimitSwitchData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = vipLoanLimitSwitchData.switchIsShow;
        }
        if ((i3 & 2) != 0) {
            i2 = vipLoanLimitSwitchData.switchStatus;
        }
        return vipLoanLimitSwitchData.copy(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.switchIsShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.switchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipLoanLimitSwitchData copy(int i, int i2) {
        return new VipLoanLimitSwitchData(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipLoanLimitSwitchData)) {
            return false;
        }
        VipLoanLimitSwitchData vipLoanLimitSwitchData = (VipLoanLimitSwitchData) obj;
        return this.switchIsShow == vipLoanLimitSwitchData.switchIsShow && this.switchStatus == vipLoanLimitSwitchData.switchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSwitchIsShow() {
        return this.switchIsShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.switchIsShow) * 31) + Integer.hashCode(this.switchStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipLoanLimitSwitchData(switchIsShow=" + this.switchIsShow + ", switchStatus=" + this.switchStatus + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.VipLoanLimitSwitchData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VipLoanLimitSwitchData> serializer() {
            return VipLoanLimitSwitchData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VipLoanLimitSwitchData(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, VipLoanLimitSwitchData$$serializer.INSTANCE.getDescriptor());
        }
        this.switchIsShow = i2;
        this.switchStatus = i3;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(VipLoanLimitSwitchData vipLoanLimitSwitchData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, vipLoanLimitSwitchData.switchIsShow);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, vipLoanLimitSwitchData.switchStatus);
    }

    public VipLoanLimitSwitchData(int i, int i2) {
        this.switchIsShow = i;
        this.switchStatus = i2;
    }
}
