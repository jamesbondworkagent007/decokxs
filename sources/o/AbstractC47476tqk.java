package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.tqk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47476tqk extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;

    @Bindable
    public java.lang.CharSequence EZpvd;
    public final android.widget.ImageView KWHzl;

    @Bindable
    public android.graphics.drawable.Drawable OLrzqt;

    public abstract void AEQbTJ(@androidx.annotation.Nullable java.lang.CharSequence charSequence);

    public AbstractC47476tqk(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.TextView textView) {
        super(obj, view, i);
        this.KWHzl = imageView;
        this.AEQbTJ = textView;
    }
}
