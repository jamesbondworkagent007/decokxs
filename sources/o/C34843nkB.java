package o;

import com.github.mikephil.charting.formatter.ValueFormatter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nkB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34843nkB extends ValueFormatter {
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34843nkB() {
        this(0, 1, null);
    }

    public C34843nkB(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:8) call: o.nkB.<init>(int):void type: THIS */
    public /* synthetic */ C34843nkB(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i);
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        if (f < 0.0f) {
            BigDecimal bigDecimalAbs = new BigDecimal(java.lang.String.valueOf(f)).abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "");
            return pTB.formatICUCompact$default(bigDecimalAbs, RoundingMode.HALF_UP, C38307pTy.Companion.AEQbTJ(this.OLrzqt), null, null, 12, null);
        }
        return pTB.formatICUCompact$default(new BigDecimal(java.lang.String.valueOf(f)), RoundingMode.HALF_UP, C38307pTy.Companion.AEQbTJ(this.OLrzqt), null, null, 12, null);
    }
}
