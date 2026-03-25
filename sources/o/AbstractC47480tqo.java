package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.tqo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47480tqo extends ViewDataBinding {

    @Bindable
    public java.lang.String AEQbTJ;
    public final android.widget.TextView KWHzl;

    @Bindable
    public java.lang.String OLrzqt;
    public final android.widget.TextView copydefault;

    public abstract void OLrzqt(@androidx.annotation.Nullable java.lang.String str);

    public abstract void copydefault(@androidx.annotation.Nullable java.lang.String str);

    public AbstractC47480tqo(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.KWHzl = textView;
        this.copydefault = textView2;
    }
}
