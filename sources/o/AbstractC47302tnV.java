package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47302tnV extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final android.widget.FrameLayout AhwBna;
    public final android.widget.FrameLayout EZpvd;
    public final C52794wYp KWHzl;
    public final C55173xeu OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final NestedScrollView djBIcL;
    public final android.widget.FrameLayout gEmmrt;
    public final android.widget.LinearLayout valueOf;

    public AbstractC47302tnV(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, C52794wYp c52794wYp2, android.widget.LinearLayout linearLayout, C55173xeu c55173xeu, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, android.widget.FrameLayout frameLayout3, android.widget.FrameLayout frameLayout4, android.widget.LinearLayout linearLayout2, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.KWHzl = c52794wYp;
        this.AEQbTJ = c52794wYp2;
        this.copydefault = linearLayout;
        this.OLrzqt = c55173xeu;
        this.EZpvd = frameLayout;
        this.gEmmrt = frameLayout2;
        this.AYXKKw = frameLayout3;
        this.AhwBna = frameLayout4;
        this.valueOf = linearLayout2;
        this.djBIcL = nestedScrollView;
    }

    public static AbstractC47302tnV OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47302tnV OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47302tnV) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.fJNWhG, null, false, obj);
    }
}
