package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class PreferredUSDSettleCcyCoinReq {
    private String settleCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PreferredUSDSettleCcyCoinReq() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PreferredUSDSettleCcyCoinReq copy$default(PreferredUSDSettleCcyCoinReq preferredUSDSettleCcyCoinReq, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preferredUSDSettleCcyCoinReq.settleCcy;
        }
        return preferredUSDSettleCcyCoinReq.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreferredUSDSettleCcyCoinReq copy(String str) {
        return new PreferredUSDSettleCcyCoinReq(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreferredUSDSettleCcyCoinReq) && Intrinsics.EZpvd((Object) this.settleCcy, (Object) ((PreferredUSDSettleCcyCoinReq) obj).settleCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettleCcy() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.settleCcy;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettleCcy(String str) {
        this.settleCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreferredUSDSettleCcyCoinReq(settleCcy=" + this.settleCcy + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PreferredUSDSettleCcyCoinReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PreferredUSDSettleCcyCoinReq> serializer() {
            return PreferredUSDSettleCcyCoinReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PreferredUSDSettleCcyCoinReq(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.settleCcy = null;
        } else {
            this.settleCcy = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PreferredUSDSettleCcyCoinReq preferredUSDSettleCcyCoinReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && preferredUSDSettleCcyCoinReq.settleCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, preferredUSDSettleCcyCoinReq.settleCcy);
    }

    public PreferredUSDSettleCcyCoinReq(String str) {
        this.settleCcy = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:4242) call: com.okinc.unify_trade.biz.PreferredUSDSettleCcyCoinReq.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ PreferredUSDSettleCcyCoinReq(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
