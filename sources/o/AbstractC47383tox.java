package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47383tox extends ViewDataBinding {
    public final android.view.View AEQbTJ;
    public final NestedScrollView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.TextView DbNXlk;
    public final C52794wYp EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.view.View isConnected;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.TextView values;

    public AbstractC47383tox(java.lang.Object obj, android.view.View view, int i, android.view.View view2, C52794wYp c52794wYp, C52794wYp c52794wYp2, android.widget.LinearLayout linearLayout, ConstraintLayout constraintLayout, NestedScrollView nestedScrollView, android.widget.LinearLayout linearLayout2, android.widget.LinearLayout linearLayout3, android.widget.ImageView imageView, android.widget.TextView textView, android.view.View view3, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.AEQbTJ = view2;
        this.EZpvd = c52794wYp;
        this.copydefault = c52794wYp2;
        this.KWHzl = linearLayout;
        this.OLrzqt = constraintLayout;
        this.AYXKKw = nestedScrollView;
        this.valueOf = linearLayout2;
        this.AhwBna = linearLayout3;
        this.djBIcL = imageView;
        this.gEmmrt = textView;
        this.isConnected = view3;
        this.DbNXlk = textView2;
        this.values = textView3;
    }

    public static AbstractC47383tox OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47383tox OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47383tox) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.sSMYrx, viewGroup, z, obj);
    }
}
