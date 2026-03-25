package com.okinc.business.dexlogic.main.swap.operation_handler.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TradeStateSwap {
    private final TradeState dexData;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeStateSwap copy$default(TradeStateSwap tradeStateSwap, String str, TradeState tradeState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeStateSwap.type;
        }
        if ((i & 2) != 0) {
            tradeState = tradeStateSwap.dexData;
        }
        return tradeStateSwap.copy(str, tradeState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeState component2() {
        return this.dexData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStateSwap copy(@NotNull String str, @NotNull TradeState tradeState) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tradeState, "");
        return new TradeStateSwap(str, tradeState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeStateSwap)) {
            return false;
        }
        TradeStateSwap tradeStateSwap = (TradeStateSwap) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) tradeStateSwap.type) && Intrinsics.EZpvd(this.dexData, tradeStateSwap.dexData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeState getDexData() {
        return this.dexData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.dexData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeStateSwap(type=" + this.type + ", dexData=" + this.dexData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeStateSwap.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeStateSwap> serializer() {
            return TradeStateSwap$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeStateSwap(int i, String str, TradeState tradeState, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, TradeStateSwap$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        this.dexData = tradeState;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TradeStateSwap tradeStateSwap, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeStateSwap.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeStateSwap.type);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, TradeState$$serializer.INSTANCE, tradeStateSwap.dexData);
    }

    public TradeStateSwap(@NotNull String str, @NotNull TradeState tradeState) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tradeState, "");
        this.type = str;
        this.dexData = tradeState;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState)
 A[MD:(java.lang.String, com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState):void (m)] (LINE:370) call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeStateSwap.<init>(java.lang.String, com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState):void type: THIS */
    public /* synthetic */ TradeStateSwap(String str, TradeState tradeState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, tradeState);
    }
}
