package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47379tot extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final RecyclerView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final C52794wYp valueOf;

    public AbstractC47379tot(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, C52794wYp c52794wYp, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, RecyclerView recyclerView, C52794wYp c52794wYp2, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.TextView textView7) {
        super(obj, view, i);
        this.KWHzl = linearLayout;
        this.copydefault = c52794wYp;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.EZpvd = textView3;
        this.djBIcL = textView4;
        this.AhwBna = recyclerView;
        this.valueOf = c52794wYp2;
        this.gEmmrt = textView5;
        this.AYXKKw = textView6;
        this.fetchVPNInfo = textView7;
    }

    public static AbstractC47379tot AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47379tot copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47379tot) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.AxsJAY, viewGroup, z, obj);
    }
}
