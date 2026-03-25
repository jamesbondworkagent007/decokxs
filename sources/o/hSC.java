package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.github.mikephil.charting.formatter.ValueFormatter;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes18.dex */
public final class hSC extends ValueFormatter {
    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, java.lang.String.valueOf(f), true, RoundingMode.UP, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }
}
