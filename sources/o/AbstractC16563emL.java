package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16563emL extends ViewDataBinding {
    public final android.view.View AEQbTJ;
    public final RecyclerView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final NestedScrollView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final wYK EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.view.View djBIcL;
    public final RecyclerView fetchVPNInfo;
    public final C52794wYp gEmmrt;
    public final android.widget.LinearLayout isConnected;
    public final android.widget.FrameLayout valueOf;
    public final android.widget.TextView values;

    public AbstractC16563emL(java.lang.Object obj, android.view.View view, int i, android.view.View view2, wYK wyk, android.widget.TextView textView, android.view.View view3, ConstraintLayout constraintLayout, C52794wYp c52794wYp, android.widget.FrameLayout frameLayout, android.view.View view4, RecyclerView recyclerView, android.widget.TextView textView2, android.widget.LinearLayout linearLayout, NestedScrollView nestedScrollView, android.widget.TextView textView3, RecyclerView recyclerView2, android.widget.TextView textView4) {
        super(obj, view, i);
        this.OLrzqt = view2;
        this.EZpvd = wyk;
        this.copydefault = textView;
        this.AEQbTJ = view3;
        this.KWHzl = constraintLayout;
        this.gEmmrt = c52794wYp;
        this.valueOf = frameLayout;
        this.djBIcL = view4;
        this.AYXKKw = recyclerView;
        this.AhwBna = textView2;
        this.isConnected = linearLayout;
        this.AkhnZx = nestedScrollView;
        this.DbNXlk = textView3;
        this.fetchVPNInfo = recyclerView2;
        this.values = textView4;
    }

    public static AbstractC16563emL KWHzl(@androidx.annotation.NonNull android.view.View view) {
        return copydefault(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16563emL copydefault(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16563emL) ViewDataBinding.bind(obj, view, C13754dXa.TaskDescription.Swccd);
    }
}
