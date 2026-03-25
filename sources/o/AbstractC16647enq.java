package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16647enq extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC16647enq(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = imageView;
        this.OLrzqt = linearLayout;
        this.EZpvd = textView;
        this.copydefault = textView2;
    }

    public static AbstractC16647enq OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16647enq OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16647enq) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.RZNAhV, viewGroup, z, obj);
    }
}
