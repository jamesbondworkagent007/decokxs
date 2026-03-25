package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eup, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17017eup extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final ViewPager2 copydefault;

    public AbstractC17017eup(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.TextView textView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.AEQbTJ = c52794wYp;
        this.EZpvd = linearLayout;
        this.OLrzqt = imageView;
        this.KWHzl = textView;
        this.copydefault = viewPager2;
    }

    public static AbstractC17017eup AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17017eup KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17017eup) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.HJWChPdIKEqB, viewGroup, z, obj);
    }
}
