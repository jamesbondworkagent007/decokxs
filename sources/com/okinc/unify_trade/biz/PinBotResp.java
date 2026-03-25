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
public final class PinBotResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String algoId;
    private final boolean isPinned;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PinBotResp() {
        this((String) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PinBotResp copy$default(PinBotResp pinBotResp, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pinBotResp.algoId;
        }
        if ((i & 2) != 0) {
            z = pinBotResp.isPinned;
        }
        return pinBotResp.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isPinned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PinBotResp copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PinBotResp(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinBotResp)) {
            return false;
        }
        PinBotResp pinBotResp = (PinBotResp) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) pinBotResp.algoId) && this.isPinned == pinBotResp.isPinned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.algoId.hashCode() * 31) + Boolean.hashCode(this.isPinned);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPinned() {
        return this.isPinned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PinBotResp(algoId=" + this.algoId + ", isPinned=" + this.isPinned + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PinBotResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PinBotResp> serializer() {
            return PinBotResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PinBotResp(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.algoId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.isPinned = true;
        } else {
            this.isPinned = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PinBotResp pinBotResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) pinBotResp.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, pinBotResp.algoId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && pinBotResp.isPinned) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, pinBotResp.isPinned);
    }

    public PinBotResp(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
        this.isPinned = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:1356) call: com.okinc.unify_trade.biz.PinBotResp.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ PinBotResp(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z);
    }
}
