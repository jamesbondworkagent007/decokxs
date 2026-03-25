package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.rzi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC43991rzi extends ViewDataBinding {
    public final rQQ AEQbTJ;

    @Bindable
    public java.lang.Boolean EZpvd;

    @Bindable
    public java.lang.String KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;

    public abstract void KWHzl(@androidx.annotation.Nullable java.lang.Boolean bool);

    public abstract void OLrzqt(@androidx.annotation.Nullable java.lang.String str);

    public AbstractC43991rzi(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, rQQ rqq, android.widget.TextView textView) {
        super(obj, view, i);
        this.copydefault = imageView;
        this.AEQbTJ = rqq;
        this.OLrzqt = textView;
    }
}
