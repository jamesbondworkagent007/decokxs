package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC46226tMm extends ViewDataBinding {
    public final android.widget.ImageView EZpvd;
    public final C52794wYp OLrzqt;
    public final android.widget.ImageView copydefault;

    public AbstractC46226tMm(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.ImageView imageView2, C52794wYp c52794wYp) {
        super(obj, view, i);
        this.EZpvd = imageView;
        this.copydefault = imageView2;
        this.OLrzqt = c52794wYp;
    }

    public static AbstractC46226tMm OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC46226tMm EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC46226tMm) ViewDataBinding.inflateInternal(layoutInflater, C47501trL.Application.valueOf, null, false, obj);
    }
}
