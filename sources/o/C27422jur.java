package o;

import androidx.core.graphics.ColorUtils;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C27422jur {
    public final java.util.List<LineDataSet> AEQbTJ;
    public final java.util.List<LineDataSet> EZpvd;
    public final java.util.List<LineDataSet> KWHzl;
    public final float copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.LineDataSet> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.LineDataSet> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.LineDataSet> */
    /* JADX WARN: Multi-variable type inference failed */
    public C27422jur(@NotNull java.util.List<? extends LineDataSet> list, @NotNull java.util.List<? extends LineDataSet> list2, @NotNull java.util.List<? extends LineDataSet> list3, float f) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.AEQbTJ = list;
        this.KWHzl = list2;
        this.EZpvd = list3;
        this.copydefault = f;
    }

    public final LineData AEQbTJ() {
        return new LineData((java.util.List<ILineDataSet>) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) this.AEQbTJ, (java.lang.Iterable) this.KWHzl), (java.lang.Iterable) this.EZpvd));
    }

    public final void copydefault(@androidx.annotation.ColorInt int i) {
        int alphaComponent = ColorUtils.setAlphaComponent(i, (int) (this.copydefault * 255));
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            ((LineDataSet) it.next()).setColor(alphaComponent);
        }
    }

    public final void KWHzl(@androidx.annotation.ColorInt int i) {
        int alphaComponent = ColorUtils.setAlphaComponent(i, (int) (this.copydefault * 255));
        java.util.Iterator<T> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            ((LineDataSet) it.next()).setColor(alphaComponent);
        }
    }

    public final void AEQbTJ(@androidx.annotation.ColorInt int i) {
        int alphaComponent = ColorUtils.setAlphaComponent(i, (int) (this.copydefault * 255));
        java.util.Iterator<T> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            ((LineDataSet) it.next()).setColor(alphaComponent);
        }
    }
}
