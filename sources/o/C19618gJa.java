package o;

import androidx.core.graphics.ColorUtils;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19618gJa {
    public final float EZpvd;
    public final java.util.List<LineDataSet> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.LineDataSet> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19618gJa(@NotNull java.util.List<? extends LineDataSet> list, float f) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        this.EZpvd = f;
    }

    public final LineData OLrzqt() {
        return new LineData(this.KWHzl);
    }

    public final void copydefault(@androidx.annotation.ColorInt int i) {
        int alphaComponent = ColorUtils.setAlphaComponent(i, (int) (this.EZpvd * 255));
        java.util.Iterator<T> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            ((LineDataSet) it.next()).setColor(alphaComponent);
        }
    }
}
