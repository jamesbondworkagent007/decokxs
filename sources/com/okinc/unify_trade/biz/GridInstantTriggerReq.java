package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class GridInstantTriggerReq {
    private String algoId;
    private String topUpAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridInstantTriggerReq copy$default(GridInstantTriggerReq gridInstantTriggerReq, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridInstantTriggerReq.algoId;
        }
        if ((i & 2) != 0) {
            str2 = gridInstantTriggerReq.topUpAmt;
        }
        return gridInstantTriggerReq.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.topUpAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridInstantTriggerReq copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GridInstantTriggerReq(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridInstantTriggerReq)) {
            return false;
        }
        GridInstantTriggerReq gridInstantTriggerReq = (GridInstantTriggerReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) gridInstantTriggerReq.algoId) && Intrinsics.EZpvd((Object) this.topUpAmt, (Object) gridInstantTriggerReq.topUpAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopUpAmt() {
        return this.topUpAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        String str = this.topUpAmt;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopUpAmt(String str) {
        this.topUpAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridInstantTriggerReq(algoId=" + this.algoId + ", topUpAmt=" + this.topUpAmt + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.GridInstantTriggerReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridInstantTriggerReq> serializer() {
            return GridInstantTriggerReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridInstantTriggerReq(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GridInstantTriggerReq$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        if ((i & 2) == 0) {
            this.topUpAmt = null;
        } else {
            this.topUpAmt = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridInstantTriggerReq gridInstantTriggerReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, gridInstantTriggerReq.algoId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && gridInstantTriggerReq.topUpAmt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, gridInstantTriggerReq.topUpAmt);
    }

    public GridInstantTriggerReq(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
        this.topUpAmt = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:2661) call: com.okinc.unify_trade.biz.GridInstantTriggerReq.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GridInstantTriggerReq(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
