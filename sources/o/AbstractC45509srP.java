package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C45508srO;

/* JADX INFO: renamed from: o.srP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC45509srP extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C52794wYp OLrzqt;
    public final C55113xdn copydefault;

    public AbstractC45509srP(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, C55113xdn c55113xdn, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = c52794wYp;
        this.KWHzl = frameLayout;
        this.EZpvd = linearLayout;
        this.copydefault = c55113xdn;
        this.AEQbTJ = textView;
    }

    public static AbstractC45509srP OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC45509srP AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC45509srP) ViewDataBinding.inflateInternal(layoutInflater, C45508srO.Activity.AEQbTJ, viewGroup, z, obj);
    }
}
