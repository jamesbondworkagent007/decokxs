package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47485tqt extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;

    @Bindable
    public java.lang.String AYXKKw;
    public final android.widget.ImageView EZpvd;

    @Bindable
    public java.lang.String KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    @Bindable
    public java.lang.String valueOf;

    public abstract void AEQbTJ(@androidx.annotation.Nullable java.lang.String str);

    public abstract void KWHzl(@androidx.annotation.Nullable java.lang.String str);

    public abstract void OLrzqt(@androidx.annotation.Nullable java.lang.String str);

    public AbstractC47485tqt(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.EZpvd = imageView;
        this.AEQbTJ = textView;
        this.copydefault = textView2;
        this.OLrzqt = textView3;
    }

    public static AbstractC47485tqt OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47485tqt EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47485tqt) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.hrNTAI, null, false, obj);
    }
}
