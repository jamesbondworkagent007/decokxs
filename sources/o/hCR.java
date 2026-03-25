package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hCR extends ViewDataBinding {
    public final C55251xgS AEQbTJ;
    public final C55258xgZ EZpvd;
    public final AppCompatTextView OLrzqt;

    public hCR(java.lang.Object obj, android.view.View view, int i, C55251xgS c55251xgS, C55258xgZ c55258xgZ, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.AEQbTJ = c55251xgS;
        this.EZpvd = c55258xgZ;
        this.OLrzqt = appCompatTextView;
    }

    public static hCR EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static hCR copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (hCR) ViewDataBinding.inflateInternal(layoutInflater, C23274hvD.Activity.stopBehavioSecDataCollection, viewGroup, z, obj);
    }
}
