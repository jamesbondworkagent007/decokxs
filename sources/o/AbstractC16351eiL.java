package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16351eiL extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final RecyclerView EZpvd;
    public final NestedScrollView KWHzl;
    public final C52794wYp OLrzqt;
    public final C33537myN copydefault;
    public final android.widget.TextView djBIcL;

    public AbstractC16351eiL(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, NestedScrollView nestedScrollView, C52794wYp c52794wYp, android.widget.ImageView imageView, RecyclerView recyclerView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.copydefault = c33537myN;
        this.KWHzl = nestedScrollView;
        this.OLrzqt = c52794wYp;
        this.AEQbTJ = imageView;
        this.EZpvd = recyclerView;
        this.djBIcL = textView;
        this.AhwBna = textView2;
    }

    public static AbstractC16351eiL OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16351eiL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16351eiL) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DarRvM, null, false, obj);
    }
}
