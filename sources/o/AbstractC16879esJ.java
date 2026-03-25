package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16879esJ extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.view.View EZpvd;
    public final C57468yiw KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView djBIcL;
    public final RecyclerView gEmmrt;
    public final android.view.View isConnected;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.TextView values;

    public AbstractC16879esJ(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, C52794wYp c52794wYp2, android.view.View view2, C57468yiw c57468yiw, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, AppCompatImageView appCompatImageView, android.widget.TextView textView, android.widget.TextView textView2, RecyclerView recyclerView, android.widget.TextView textView3, android.widget.TextView textView4, android.view.View view3) {
        super(obj, view, i);
        this.copydefault = c52794wYp;
        this.AEQbTJ = c52794wYp2;
        this.EZpvd = view2;
        this.KWHzl = c57468yiw;
        this.OLrzqt = linearLayout;
        this.valueOf = linearLayout2;
        this.AYXKKw = appCompatImageView;
        this.AhwBna = textView;
        this.djBIcL = textView2;
        this.gEmmrt = recyclerView;
        this.AkhnZx = textView3;
        this.values = textView4;
        this.isConnected = view3;
    }

    public static AbstractC16879esJ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16879esJ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16879esJ) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.iLWfRf, viewGroup, z, obj);
    }
}
