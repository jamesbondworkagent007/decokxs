package o;

import com.github.mikephil.charting.formatter.ValueFormatter;

/* JADX INFO: renamed from: o.mUc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32225mUc extends ValueFormatter {
    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        return pTB.formatICUCompact$default(java.lang.Float.valueOf(f), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null);
    }
}
