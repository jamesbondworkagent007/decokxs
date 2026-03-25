package o;

import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54878xYr implements InterfaceC54865xYe {
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final DisplaySign copydefault;

    public C54878xYr(int i, java.lang.String str, java.lang.String str2, boolean z, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(displaySign, "");
        this.OLrzqt = i;
        this.KWHzl = str;
        this.EZpvd = str2;
        this.AEQbTJ = z;
        this.copydefault = displaySign;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r8v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:boolean:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:com.okinc.localization.util.format.DisplaySign:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.localization.util.format.DisplaySign:0x0019: SGET  A[WRAPPED] (LINE:20) com.okinc.localization.util.format.DisplaySign.AUTO com.okinc.localization.util.format.DisplaySign) : (r12v0 com.okinc.localization.util.format.DisplaySign))
 A[MD:(int, java.lang.String, java.lang.String, boolean, com.okinc.localization.util.format.DisplaySign):void (m)] (LINE:15) call: o.xYr.<init>(int, java.lang.String, java.lang.String, boolean, com.okinc.localization.util.format.DisplaySign):void type: THIS */
    public /* synthetic */ C54878xYr(int i, java.lang.String str, java.lang.String str2, boolean z, DisplaySign displaySign, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? DisplaySign.AUTO : displaySign);
    }

    @Override // o.InterfaceC54865xYe
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        java.lang.String toString$default;
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalCopydefault = C54862xYb.copydefault(this.OLrzqt);
        if (!C33129mqd.AEQbTJ(AEQbTJ(str), 0) || !C33129mqd.gEmmrt(AEQbTJ(str), bigDecimalCopydefault)) {
            return null;
        }
        if (this.KWHzl != null) {
            toString$default = C54862xYb.formatAmtWithSign$default(bigDecimalCopydefault, C38307pTy.Companion.AEQbTJ(java.lang.Math.max(0, this.OLrzqt)), this.KWHzl, this.AEQbTJ, null, 8, null);
        } else if (this.EZpvd != null) {
            toString$default = C54862xYb.formatAmtWithSymbol$default(bigDecimalCopydefault, C38307pTy.Companion.AEQbTJ(java.lang.Math.max(0, this.OLrzqt)), this.EZpvd, this.AEQbTJ, null, 8, null);
        } else {
            toString$default = C54862xYb.formatToString$default(bigDecimalCopydefault, false, null, null, 7, null);
        }
        return C54862xYb.copydefault(str, this.copydefault) + "<" + toString$default;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = C33129mqd.copydefault(str).abs().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return plainString;
    }
}
