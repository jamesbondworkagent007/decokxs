package o;

import com.github.mikephil.charting.formatter.ValueFormatter;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: renamed from: o.nky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34892nky extends ValueFormatter {
    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        return pTB.formatICUCompact$default(new BigDecimal(java.lang.String.valueOf(f)), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(2), null, null, 12, null);
    }
}
