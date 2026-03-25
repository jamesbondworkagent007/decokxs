package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16535elk extends ViewDataBinding {
    public final NestedScrollView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C52794wYp EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.ImageView djBIcL;
    public final RecyclerView valueOf;

    public AbstractC16535elk(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, C52794wYp c52794wYp, ConstraintLayout constraintLayout, android.view.View view2, NestedScrollView nestedScrollView, android.widget.ImageView imageView2, android.widget.TextView textView, RecyclerView recyclerView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.copydefault = imageView;
        this.EZpvd = c52794wYp;
        this.KWHzl = constraintLayout;
        this.OLrzqt = view2;
        this.AEQbTJ = nestedScrollView;
        this.djBIcL = imageView2;
        this.AhwBna = textView;
        this.valueOf = recyclerView;
        this.AYXKKw = textView2;
    }

    public static AbstractC16535elk copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16535elk AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16535elk) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.gSBher, viewGroup, z, obj);
    }
}
