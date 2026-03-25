package o;

import com.github.mikephil.charting.formatter.ValueFormatter;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: o.xua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C56001xua extends ValueFormatter {
    public java.lang.String[] AEQbTJ = {"", "k", com.ibm.icu.text.DateFormat.MINUTE, "b", "t"};
    public int KWHzl = 5;
    public java.lang.String OLrzqt = "%    ";
    public java.lang.String copydefault = "    ";
    public DecimalFormat EZpvd = new DecimalFormat("###E00");

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        return pTB.formatICUPercent$default(C33129mqd.EZpvd(java.lang.Float.valueOf(f)), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(2), null, java.lang.Double.valueOf(C33129mqd.AEQbTJ(java.lang.Float.valueOf(100.0f))), null, 20, null);
    }
}
