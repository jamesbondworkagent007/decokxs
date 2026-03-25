package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public abstract class tNC extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView OLrzqt;
    public final C52794wYp copydefault;

    public tNC(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, C52794wYp c52794wYp, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = textView;
        this.copydefault = c52794wYp;
        this.OLrzqt = textView2;
    }

    public static tNC EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static tNC copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (tNC) ViewDataBinding.inflateInternal(layoutInflater, C47501trL.Application.fvQaOB, viewGroup, z, obj);
    }
}
