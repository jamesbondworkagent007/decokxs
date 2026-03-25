package com.okinc.tradingbot.impl.dto;

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
public final class ReduceResultVo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String estReduceRatio;
    public final String estSwapReducePos;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReduceResultVo() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReduceResultVo copy$default(ReduceResultVo reduceResultVo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reduceResultVo.estReduceRatio;
        }
        if ((i & 2) != 0) {
            str2 = reduceResultVo.estSwapReducePos;
        }
        return reduceResultVo.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReduceResultVo KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ReduceResultVo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReduceResultVo)) {
            return false;
        }
        ReduceResultVo reduceResultVo = (ReduceResultVo) obj;
        return Intrinsics.EZpvd((Object) this.estReduceRatio, (Object) reduceResultVo.estReduceRatio) && Intrinsics.EZpvd((Object) this.estSwapReducePos, (Object) reduceResultVo.estSwapReducePos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.estReduceRatio.hashCode() * 31) + this.estSwapReducePos.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReduceResultVo(estReduceRatio=" + this.estReduceRatio + ", estSwapReducePos=" + this.estSwapReducePos + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.ReduceResultVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReduceResultVo> serializer() {
            return ReduceResultVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReduceResultVo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estReduceRatio = "";
        } else {
            this.estReduceRatio = str;
        }
        if ((i & 2) == 0) {
            this.estSwapReducePos = "";
        } else {
            this.estSwapReducePos = str2;
        }
    }

    public static final /* synthetic */ void EZpvd(ReduceResultVo reduceResultVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) reduceResultVo.estReduceRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, reduceResultVo.estReduceRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) reduceResultVo.estSwapReducePos, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, reduceResultVo.estSwapReducePos);
    }

    public ReduceResultVo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.estReduceRatio = str;
        this.estSwapReducePos = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.tradingbot.impl.dto.ReduceResultVo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ReduceResultVo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
