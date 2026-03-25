package o;

import com.github.mikephil.charting.formatter.ValueFormatter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.npk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35143npk extends ValueFormatter {
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C35143npk() {
        this(0, 1, null);
    }

    public C35143npk(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:12) call: o.npk.<init>(int):void type: THIS */
    public /* synthetic */ C35143npk(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i);
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        return pTB.formatRoundToFixed$default(pTB.OLrzqt(java.lang.Float.valueOf(f)), this.OLrzqt, null, 2, null);
    }
}
