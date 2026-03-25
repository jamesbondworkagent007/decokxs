package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iIy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23777iIy extends ViewDataBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final C55251xgS OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;

    public AbstractC23777iIy(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, C55251xgS c55251xgS, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6) {
        super(obj, view, i);
        this.KWHzl = appCompatTextView;
        this.AEQbTJ = appCompatTextView2;
        this.copydefault = appCompatTextView3;
        this.EZpvd = appCompatTextView4;
        this.OLrzqt = c55251xgS;
        this.AhwBna = appCompatTextView5;
        this.djBIcL = appCompatTextView6;
    }

    public static AbstractC23777iIy OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC23777iIy OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC23777iIy) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.ODWQjV, viewGroup, z, obj);
    }
}
