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
public final class EstFeeVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String estSpotReduceFee;
    public final String estSwapReduceFee;
    public final String estTransferFee;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EstFeeVO() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EstFeeVO copy$default(EstFeeVO estFeeVO, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estFeeVO.estSwapReduceFee;
        }
        if ((i & 2) != 0) {
            str2 = estFeeVO.estSpotReduceFee;
        }
        if ((i & 4) != 0) {
            str3 = estFeeVO.estTransferFee;
        }
        return estFeeVO.EZpvd(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstFeeVO EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EstFeeVO(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.estSwapReduceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.estSpotReduceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.estTransferFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstFeeVO)) {
            return false;
        }
        EstFeeVO estFeeVO = (EstFeeVO) obj;
        return Intrinsics.EZpvd((Object) this.estSwapReduceFee, (Object) estFeeVO.estSwapReduceFee) && Intrinsics.EZpvd((Object) this.estSpotReduceFee, (Object) estFeeVO.estSpotReduceFee) && Intrinsics.EZpvd((Object) this.estTransferFee, (Object) estFeeVO.estTransferFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.estSwapReduceFee.hashCode() * 31) + this.estSpotReduceFee.hashCode()) * 31) + this.estTransferFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EstFeeVO(estSwapReduceFee=" + this.estSwapReduceFee + ", estSpotReduceFee=" + this.estSpotReduceFee + ", estTransferFee=" + this.estTransferFee + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.EstFeeVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EstFeeVO> serializer() {
            return EstFeeVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EstFeeVO(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estSwapReduceFee = "";
        } else {
            this.estSwapReduceFee = str;
        }
        if ((i & 2) == 0) {
            this.estSpotReduceFee = "";
        } else {
            this.estSpotReduceFee = str2;
        }
        if ((i & 4) == 0) {
            this.estTransferFee = "";
        } else {
            this.estTransferFee = str3;
        }
    }

    public static final /* synthetic */ void copydefault(EstFeeVO estFeeVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) estFeeVO.estSwapReduceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, estFeeVO.estSwapReduceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) estFeeVO.estSpotReduceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, estFeeVO.estSpotReduceFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) estFeeVO.estTransferFee, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, estFeeVO.estTransferFee);
    }

    public EstFeeVO(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.estSwapReduceFee = str;
        this.estSpotReduceFee = str2;
        this.estTransferFee = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:36) call: com.okinc.tradingbot.impl.dto.EstFeeVO.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EstFeeVO(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
