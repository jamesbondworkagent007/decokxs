package com.okinc.business.dexlogic.main.limmitorder.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class TradeStateLimit {
    private final LimitState dexData;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeStateLimit copy$default(TradeStateLimit tradeStateLimit, String str, LimitState limitState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeStateLimit.type;
        }
        if ((i & 2) != 0) {
            limitState = tradeStateLimit.dexData;
        }
        return tradeStateLimit.copy(str, limitState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitState component2() {
        return this.dexData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStateLimit copy(@NotNull String str, @NotNull LimitState limitState) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(limitState, "");
        return new TradeStateLimit(str, limitState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeStateLimit)) {
            return false;
        }
        TradeStateLimit tradeStateLimit = (TradeStateLimit) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) tradeStateLimit.type) && Intrinsics.EZpvd(this.dexData, tradeStateLimit.dexData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitState getDexData() {
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
        return "TradeStateLimit(type=" + this.type + ", dexData=" + this.dexData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.TradeStateLimit.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeStateLimit> serializer() {
            return TradeStateLimit$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeStateLimit(int i, String str, LimitState limitState, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, TradeStateLimit$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        this.dexData = limitState;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TradeStateLimit tradeStateLimit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeStateLimit.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeStateLimit.type);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, LimitState$$serializer.INSTANCE, tradeStateLimit.dexData);
    }

    public TradeStateLimit(@NotNull String str, @NotNull LimitState limitState) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(limitState, "");
        this.type = str;
        this.dexData = limitState;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 com.okinc.business.dexlogic.main.limmitorder.bean.LimitState)
 A[MD:(java.lang.String, com.okinc.business.dexlogic.main.limmitorder.bean.LimitState):void (m)] (LINE:383) call: com.okinc.business.dexlogic.main.limmitorder.bean.TradeStateLimit.<init>(java.lang.String, com.okinc.business.dexlogic.main.limmitorder.bean.LimitState):void type: THIS */
    public /* synthetic */ TradeStateLimit(String str, LimitState limitState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, limitState);
    }
}
