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
public final class EstReducePosVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String estRedeemPos;
    public final String estSpotReducePos;
    public final String estStakingReducePos;
    public final String estSwapReducePos;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EstReducePosVO() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EstReducePosVO copy$default(EstReducePosVO estReducePosVO, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estReducePosVO.estRedeemPos;
        }
        if ((i & 2) != 0) {
            str2 = estReducePosVO.estSpotReducePos;
        }
        if ((i & 4) != 0) {
            str3 = estReducePosVO.estStakingReducePos;
        }
        if ((i & 8) != 0) {
            str4 = estReducePosVO.estSwapReducePos;
        }
        return estReducePosVO.EZpvd(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.estRedeemPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstReducePosVO EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new EstReducePosVO(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.estStakingReducePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.estSpotReducePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.estSwapReducePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstReducePosVO)) {
            return false;
        }
        EstReducePosVO estReducePosVO = (EstReducePosVO) obj;
        return Intrinsics.EZpvd((Object) this.estRedeemPos, (Object) estReducePosVO.estRedeemPos) && Intrinsics.EZpvd((Object) this.estSpotReducePos, (Object) estReducePosVO.estSpotReducePos) && Intrinsics.EZpvd((Object) this.estStakingReducePos, (Object) estReducePosVO.estStakingReducePos) && Intrinsics.EZpvd((Object) this.estSwapReducePos, (Object) estReducePosVO.estSwapReducePos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.estRedeemPos.hashCode() * 31) + this.estSpotReducePos.hashCode()) * 31) + this.estStakingReducePos.hashCode()) * 31) + this.estSwapReducePos.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EstReducePosVO(estRedeemPos=" + this.estRedeemPos + ", estSpotReducePos=" + this.estSpotReducePos + ", estStakingReducePos=" + this.estStakingReducePos + ", estSwapReducePos=" + this.estSwapReducePos + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.EstReducePosVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EstReducePosVO> serializer() {
            return EstReducePosVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EstReducePosVO(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estRedeemPos = "";
        } else {
            this.estRedeemPos = str;
        }
        if ((i & 2) == 0) {
            this.estSpotReducePos = "";
        } else {
            this.estSpotReducePos = str2;
        }
        if ((i & 4) == 0) {
            this.estStakingReducePos = "";
        } else {
            this.estStakingReducePos = str3;
        }
        if ((i & 8) == 0) {
            this.estSwapReducePos = "";
        } else {
            this.estSwapReducePos = str4;
        }
    }

    public static final /* synthetic */ void OLrzqt(EstReducePosVO estReducePosVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) estReducePosVO.estRedeemPos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, estReducePosVO.estRedeemPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) estReducePosVO.estSpotReducePos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, estReducePosVO.estSpotReducePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) estReducePosVO.estStakingReducePos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, estReducePosVO.estStakingReducePos);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) estReducePosVO.estSwapReducePos, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, estReducePosVO.estSwapReducePos);
    }

    public EstReducePosVO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.estRedeemPos = str;
        this.estSpotReducePos = str2;
        this.estStakingReducePos = str3;
        this.estSwapReducePos = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.tradingbot.impl.dto.EstReducePosVO.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EstReducePosVO(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
