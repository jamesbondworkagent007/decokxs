package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50886vcc extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final C47988uAv KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView valueOf;

    public AbstractC50886vcc(java.lang.Object obj, android.view.View view, int i, C47988uAv c47988uAv, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5) {
        super(obj, view, i);
        this.KWHzl = c47988uAv;
        this.OLrzqt = textView;
        this.AEQbTJ = textView2;
        this.EZpvd = textView3;
        this.copydefault = textView4;
        this.valueOf = textView5;
    }

    public static AbstractC50886vcc AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50886vcc AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50886vcc) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.sEcTXd, viewGroup, z, obj);
    }
}
