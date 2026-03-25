package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tor, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47377tor extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final C52794wYp OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView gEmmrt;

    public AbstractC47377tor(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, C52794wYp c52794wYp2, android.widget.TextView textView, android.widget.ImageView imageView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.AEQbTJ = c52794wYp;
        this.OLrzqt = c52794wYp2;
        this.KWHzl = textView;
        this.copydefault = imageView;
        this.EZpvd = textView2;
        this.gEmmrt = textView3;
    }

    public static AbstractC47377tor OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47377tor OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47377tor) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.zuBGHE, viewGroup, z, obj);
    }
}
