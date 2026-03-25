package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class RiskStatus {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String atRisk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RiskStatus() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RiskStatus copy$default(RiskStatus riskStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = riskStatus.atRisk;
        }
        return riskStatus.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.atRisk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskStatus copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new RiskStatus(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RiskStatus) && Intrinsics.EZpvd((Object) this.atRisk, (Object) ((RiskStatus) obj).atRisk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAtRisk() {
        return this.atRisk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.atRisk.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskStatus(atRisk=" + this.atRisk + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RiskStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RiskStatus> serializer() {
            return RiskStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RiskStatus(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.atRisk = "0";
        } else {
            this.atRisk = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RiskStatus riskStatus, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) riskStatus.atRisk, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, riskStatus.atRisk);
    }

    public RiskStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.atRisk = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:2297) call: com.okinc.unify_trade.biz.RiskStatus.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ RiskStatus(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str);
    }
}
