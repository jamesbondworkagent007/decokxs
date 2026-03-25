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
public final class EstReturnVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final EstFeeVO estFee;
    public final String estReduceAmt;
    public final String estReduceReturnedAmt;
    public final String estUsdtLoanRepayment;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EstReturnVO() {
        this((String) null, (String) null, (String) null, (EstFeeVO) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EstReturnVO copy$default(EstReturnVO estReturnVO, String str, String str2, String str3, EstFeeVO estFeeVO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estReturnVO.estReduceReturnedAmt;
        }
        if ((i & 2) != 0) {
            str2 = estReturnVO.estReduceAmt;
        }
        if ((i & 4) != 0) {
            str3 = estReturnVO.estUsdtLoanRepayment;
        }
        if ((i & 8) != 0) {
            estFeeVO = estReturnVO.estFee;
        }
        return estReturnVO.AEQbTJ(str, str2, str3, estFeeVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstReturnVO AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull EstFeeVO estFeeVO) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(estFeeVO, "");
        return new EstReturnVO(str, str2, str3, estFeeVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.estReduceAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstFeeVO KWHzl() {
        return this.estFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.estReduceReturnedAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.estUsdtLoanRepayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstReturnVO)) {
            return false;
        }
        EstReturnVO estReturnVO = (EstReturnVO) obj;
        return Intrinsics.EZpvd((Object) this.estReduceReturnedAmt, (Object) estReturnVO.estReduceReturnedAmt) && Intrinsics.EZpvd((Object) this.estReduceAmt, (Object) estReturnVO.estReduceAmt) && Intrinsics.EZpvd((Object) this.estUsdtLoanRepayment, (Object) estReturnVO.estUsdtLoanRepayment) && Intrinsics.EZpvd(this.estFee, estReturnVO.estFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.estReduceReturnedAmt.hashCode() * 31) + this.estReduceAmt.hashCode()) * 31) + this.estUsdtLoanRepayment.hashCode()) * 31) + this.estFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EstReturnVO(estReduceReturnedAmt=" + this.estReduceReturnedAmt + ", estReduceAmt=" + this.estReduceAmt + ", estUsdtLoanRepayment=" + this.estUsdtLoanRepayment + ", estFee=" + this.estFee + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.EstReturnVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EstReturnVO> serializer() {
            return EstReturnVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EstReturnVO(int i, String str, String str2, String str3, EstFeeVO estFeeVO, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estReduceReturnedAmt = "";
        } else {
            this.estReduceReturnedAmt = str;
        }
        if ((i & 2) == 0) {
            this.estReduceAmt = "";
        } else {
            this.estReduceAmt = str2;
        }
        if ((i & 4) == 0) {
            this.estUsdtLoanRepayment = "";
        } else {
            this.estUsdtLoanRepayment = str3;
        }
        if ((i & 8) == 0) {
            this.estFee = new EstFeeVO((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.estFee = estFeeVO;
        }
    }

    public static final /* synthetic */ void EZpvd(EstReturnVO estReturnVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) estReturnVO.estReduceReturnedAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, estReturnVO.estReduceReturnedAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) estReturnVO.estReduceAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, estReturnVO.estReduceAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) estReturnVO.estUsdtLoanRepayment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, estReturnVO.estUsdtLoanRepayment);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(estReturnVO.estFee, new EstFeeVO((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, EstFeeVO$$serializer.INSTANCE, estReturnVO.estFee);
    }

    public EstReturnVO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull EstFeeVO estFeeVO) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(estFeeVO, "");
        this.estReduceReturnedAmt = str;
        this.estReduceAmt = str2;
        this.estUsdtLoanRepayment = str3;
        this.estFee = estFeeVO;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:com.okinc.tradingbot.impl.dto.EstFeeVO:?: TERNARY null = ((wrap:int:0x0011: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradingbot.impl.dto.EstFeeVO:0x001d: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:29) call: com.okinc.tradingbot.impl.dto.EstFeeVO.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 com.okinc.tradingbot.impl.dto.EstFeeVO))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.dto.EstFeeVO):void (m)] (LINE:25) call: com.okinc.tradingbot.impl.dto.EstReturnVO.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.dto.EstFeeVO):void type: THIS */
    public /* synthetic */ EstReturnVO(String str, String str2, String str3, EstFeeVO estFeeVO, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new EstFeeVO((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : estFeeVO);
    }
}
