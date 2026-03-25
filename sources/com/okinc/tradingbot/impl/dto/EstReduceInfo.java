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
public final class EstReduceInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final boolean displayCloseAllPosNotice;
    public final EstReducePosVO estReducePos;
    public final String estReduceRatio;
    public final EstReturnVO estReturn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EstReduceInfo() {
        this((String) null, (EstReturnVO) null, (EstReducePosVO) null, false, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EstReduceInfo copy$default(EstReduceInfo estReduceInfo, String str, EstReturnVO estReturnVO, EstReducePosVO estReducePosVO, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estReduceInfo.estReduceRatio;
        }
        if ((i & 2) != 0) {
            estReturnVO = estReduceInfo.estReturn;
        }
        if ((i & 4) != 0) {
            estReducePosVO = estReduceInfo.estReducePos;
        }
        if ((i & 8) != 0) {
            z = estReduceInfo.displayCloseAllPosNotice;
        }
        return estReduceInfo.copydefault(str, estReturnVO, estReducePosVO, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstReturnVO AEQbTJ() {
        return this.estReturn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstReducePosVO EZpvd() {
        return this.estReducePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.estReduceRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstReduceInfo copydefault(@NotNull String str, @NotNull EstReturnVO estReturnVO, @NotNull EstReducePosVO estReducePosVO, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(estReturnVO, "");
        Intrinsics.checkNotNullParameter(estReducePosVO, "");
        return new EstReduceInfo(str, estReturnVO, estReducePosVO, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.displayCloseAllPosNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstReduceInfo)) {
            return false;
        }
        EstReduceInfo estReduceInfo = (EstReduceInfo) obj;
        return Intrinsics.EZpvd((Object) this.estReduceRatio, (Object) estReduceInfo.estReduceRatio) && Intrinsics.EZpvd(this.estReturn, estReduceInfo.estReturn) && Intrinsics.EZpvd(this.estReducePos, estReduceInfo.estReducePos) && this.displayCloseAllPosNotice == estReduceInfo.displayCloseAllPosNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.estReduceRatio.hashCode() * 31) + this.estReturn.hashCode()) * 31) + this.estReducePos.hashCode()) * 31) + Boolean.hashCode(this.displayCloseAllPosNotice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EstReduceInfo(estReduceRatio=" + this.estReduceRatio + ", estReturn=" + this.estReturn + ", estReducePos=" + this.estReducePos + ", displayCloseAllPosNotice=" + this.displayCloseAllPosNotice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.EstReduceInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EstReduceInfo> serializer() {
            return EstReduceInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EstReduceInfo(int i, String str, EstReturnVO estReturnVO, EstReducePosVO estReducePosVO, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.estReduceRatio = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.estReturn = new EstReturnVO((String) null, (String) null, (String) null, (EstFeeVO) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.estReturn = estReturnVO;
        }
        if ((i & 4) == 0) {
            this.estReducePos = new EstReducePosVO((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.estReducePos = estReducePosVO;
        }
        if ((i & 8) == 0) {
            this.displayCloseAllPosNotice = false;
        } else {
            this.displayCloseAllPosNotice = z;
        }
    }

    public static final /* synthetic */ void KWHzl(EstReduceInfo estReduceInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) estReduceInfo.estReduceRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, estReduceInfo.estReduceRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(estReduceInfo.estReturn, new EstReturnVO((String) null, (String) null, (String) null, (EstFeeVO) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, EstReturnVO$$serializer.INSTANCE, estReduceInfo.estReturn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(estReduceInfo.estReducePos, new EstReducePosVO((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, EstReducePosVO$$serializer.INSTANCE, estReduceInfo.estReducePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || estReduceInfo.displayCloseAllPosNotice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, estReduceInfo.displayCloseAllPosNotice);
        }
    }

    public EstReduceInfo(@NotNull String str, @NotNull EstReturnVO estReturnVO, @NotNull EstReducePosVO estReducePosVO, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(estReturnVO, "");
        Intrinsics.checkNotNullParameter(estReducePosVO, "");
        this.estReduceRatio = str;
        this.estReturn = estReturnVO;
        this.estReducePos = estReducePosVO;
        this.displayCloseAllPosNotice = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:com.okinc.tradingbot.impl.dto.EstReturnVO:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradingbot.impl.dto.EstReturnVO:0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.tradingbot.impl.dto.EstFeeVO:?: CAST (com.okinc.tradingbot.impl.dto.EstFeeVO) (null com.okinc.tradingbot.impl.dto.EstFeeVO))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.dto.EstFeeVO, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:8) call: com.okinc.tradingbot.impl.dto.EstReturnVO.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.dto.EstFeeVO, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.tradingbot.impl.dto.EstReturnVO))
  (wrap:com.okinc.tradingbot.impl.dto.EstReducePosVO:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradingbot.impl.dto.EstReducePosVO:0x0025: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:9) call: com.okinc.tradingbot.impl.dto.EstReducePosVO.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 com.okinc.tradingbot.impl.dto.EstReducePosVO))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(java.lang.String, com.okinc.tradingbot.impl.dto.EstReturnVO, com.okinc.tradingbot.impl.dto.EstReducePosVO, boolean):void (m)] (LINE:6) call: com.okinc.tradingbot.impl.dto.EstReduceInfo.<init>(java.lang.String, com.okinc.tradingbot.impl.dto.EstReturnVO, com.okinc.tradingbot.impl.dto.EstReducePosVO, boolean):void type: THIS */
    public /* synthetic */ EstReduceInfo(String str, EstReturnVO estReturnVO, EstReducePosVO estReducePosVO, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new EstReturnVO((String) null, (String) null, (String) null, (EstFeeVO) null, 15, (DefaultConstructorMarker) null) : estReturnVO, (i & 4) != 0 ? new EstReducePosVO((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : estReducePosVO, (i & 8) != 0 ? false : z);
    }
}
