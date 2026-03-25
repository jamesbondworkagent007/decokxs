package o;

import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16480eki extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final CardView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.TextView OLrzqt;

    public AbstractC16480eki(java.lang.Object obj, android.view.View view, int i, CardView cardView, android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = cardView;
        this.KWHzl = linearLayout;
        this.OLrzqt = textView;
        this.AEQbTJ = textView2;
    }

    public static AbstractC16480eki OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16480eki EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16480eki) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.KDccX, viewGroup, z, obj);
    }
}
