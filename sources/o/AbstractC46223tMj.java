package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC46223tMj extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final C52794wYp KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC46223tMj(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.ImageView imageView, C52794wYp c52794wYp2, android.widget.TextView textView) {
        super(obj, view, i);
        this.KWHzl = c52794wYp;
        this.OLrzqt = imageView;
        this.AEQbTJ = c52794wYp2;
        this.copydefault = textView;
    }

    public static AbstractC46223tMj copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC46223tMj AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC46223tMj) ViewDataBinding.inflateInternal(layoutInflater, C47501trL.Application.KWHzl, null, false, obj);
    }
}
