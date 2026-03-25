package o;

import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.alB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7505alB extends BarDataSet {
    public int AEQbTJ;
    public int KWHzl;
    public float OLrzqt;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(float f) {
        this.copydefault = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(float f) {
        this.OLrzqt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.AEQbTJ = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7505alB(@NotNull java.util.List<? extends BarEntry> list, @NotNull java.lang.String str) {
        super(list, str);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Method merged with bridge method: getEntryIndex(Lcom/github/mikephil/charting/data/Entry;)I */
    @Override // com.github.mikephil.charting.data.DataSet, com.github.mikephil.charting.interfaces.datasets.IDataSet
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public int getEntryIndex(BarEntry barEntry) {
        return this.mValues.indexOf(barEntry);
    }
}
