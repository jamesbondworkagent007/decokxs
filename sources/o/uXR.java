package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.PieChart;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uXR extends ViewDataBinding {
    public final RecyclerView AEQbTJ;
    public final C55258xgZ EZpvd;
    public final PieChart KWHzl;
    public final C55258xgZ OLrzqt;
    public final android.widget.LinearLayout copydefault;

    public uXR(java.lang.Object obj, android.view.View view, int i, PieChart pieChart, C55258xgZ c55258xgZ, android.widget.LinearLayout linearLayout, RecyclerView recyclerView, C55258xgZ c55258xgZ2) {
        super(obj, view, i);
        this.KWHzl = pieChart;
        this.EZpvd = c55258xgZ;
        this.copydefault = linearLayout;
        this.AEQbTJ = recyclerView;
        this.OLrzqt = c55258xgZ2;
    }

    public static uXR OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uXR OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uXR) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.OrsvgJ, viewGroup, z, obj);
    }
}
