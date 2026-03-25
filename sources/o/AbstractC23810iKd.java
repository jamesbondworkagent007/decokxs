package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23810iKd extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C52794wYp copydefault;
    public final ConstraintLayout gEmmrt;

    public AbstractC23810iKd(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.TextView textView, android.widget.ImageView imageView, android.widget.TextView textView2, android.widget.ImageView imageView2, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.copydefault = c52794wYp;
        this.OLrzqt = textView;
        this.KWHzl = imageView;
        this.EZpvd = textView2;
        this.AEQbTJ = imageView2;
        this.gEmmrt = constraintLayout;
    }

    public static AbstractC23810iKd EZpvd(@androidx.annotation.NonNull android.view.View view) {
        return OLrzqt(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC23810iKd OLrzqt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC23810iKd) ViewDataBinding.bind(obj, view, C25493ixk.Activity.aHXSQp);
    }
}
