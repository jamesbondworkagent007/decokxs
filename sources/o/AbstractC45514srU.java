package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C45508srO;

/* JADX INFO: renamed from: o.srU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC45514srU extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C52794wYp EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55113xdn OLrzqt;
    public final android.widget.FrameLayout copydefault;

    public AbstractC45514srU(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.LinearLayout linearLayout, C55113xdn c55113xdn, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = c52794wYp;
        this.copydefault = frameLayout;
        this.AEQbTJ = imageView;
        this.KWHzl = linearLayout;
        this.OLrzqt = c55113xdn;
        this.AYXKKw = textView;
    }

    public static AbstractC45514srU copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC45514srU EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC45514srU) ViewDataBinding.inflateInternal(layoutInflater, C45508srO.Activity.KWHzl, viewGroup, z, obj);
    }
}
