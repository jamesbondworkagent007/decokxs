package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hDA implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final LineChart EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public hDA(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LineChart lineChart) {
        this.AEQbTJ = view;
        this.EZpvd = lineChart;
    }

    public static hDA OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.abAflu, viewGroup);
        return EZpvd(viewGroup);
    }

    public static hDA EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getRating;
        LineChart lineChart = (LineChart) ViewBindings.findChildViewById(view, i);
        if (lineChart != null) {
            return new hDA(view, lineChart);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
