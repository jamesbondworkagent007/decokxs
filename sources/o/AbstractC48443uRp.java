package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48443uRp extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55372xih AYXKKw;
    public final LinearLayoutCompat EZpvd;
    public final AppCompatTextView KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC48443uRp(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, android.widget.TextView textView, android.widget.TextView textView2, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, C55372xih c55372xih) {
        super(obj, view, i);
        this.KWHzl = appCompatTextView;
        this.copydefault = textView;
        this.AEQbTJ = textView2;
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = linearLayoutCompat2;
        this.AYXKKw = c55372xih;
    }

    public static AbstractC48443uRp copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48443uRp AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48443uRp) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.getLabel, viewGroup, z, obj);
    }
}
