package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eoX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16681eoX extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final C57440yiU EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55251xgS OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;

    public AbstractC16681eoX(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ImageView imageView, C57440yiU c57440yiU, C55251xgS c55251xgS, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = constraintLayout;
        this.copydefault = imageView;
        this.EZpvd = c57440yiU;
        this.OLrzqt = c55251xgS;
        this.KWHzl = textView;
        this.djBIcL = textView2;
    }

    public static AbstractC16681eoX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16681eoX KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16681eoX) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.cancel, viewGroup, z, obj);
    }
}
