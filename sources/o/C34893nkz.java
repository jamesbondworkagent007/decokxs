package o;

import com.github.mikephil.charting.formatter.ValueFormatter;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.nkz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34893nkz extends ValueFormatter {
    public int AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34893nkz() {
        this(0, 1, null);
    }

    public C34893nkz(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:14) call: o.nkz.<init>(int):void type: THIS */
    public /* synthetic */ C34893nkz(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i);
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        return pTB.KWHzl(xMR.copydefault.OLrzqt(java.lang.Float.valueOf(f)), this.AEQbTJ, RoundingMode.HALF_UP);
    }
}
