package o;

import com.github.mikephil.charting.formatter.ValueFormatter;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;

/* JADX INFO: renamed from: o.mUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32231mUi extends ValueFormatter {
    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        return mRJ.AEQbTJ.OLrzqt(java.lang.String.valueOf(f), (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.UP, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
    }
}
