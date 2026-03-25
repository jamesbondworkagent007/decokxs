package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iIQ extends ViewDataBinding {
    public final android.view.View AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AbstractC23809iKc AhwBna;
    public final AppCompatTextView AkhnZx;
    public final android.widget.Space DbNXlk;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatTextView copydefault;
    public final C27302jsd djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final C27208jqp gEmmrt;
    public final AppCompatImageView valueOf;

    public iIQ(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.view.View view2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, C27302jsd c27302jsd, AppCompatImageView appCompatImageView2, C27208jqp c27208jqp, AbstractC23809iKc abstractC23809iKc, android.widget.Space space, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        super(obj, view, i);
        this.EZpvd = constraintLayout;
        this.AEQbTJ = view2;
        this.OLrzqt = appCompatImageView;
        this.KWHzl = constraintLayout2;
        this.copydefault = appCompatTextView;
        this.AYXKKw = appCompatTextView2;
        this.djBIcL = c27302jsd;
        this.valueOf = appCompatImageView2;
        this.gEmmrt = c27208jqp;
        this.AhwBna = abstractC23809iKc;
        this.DbNXlk = space;
        this.AkhnZx = appCompatTextView3;
        this.fetchVPNInfo = appCompatTextView4;
    }

    public static iIQ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static iIQ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (iIQ) ViewDataBinding.inflateInternal(layoutInflater, C25493ixk.Activity.dHguZz, viewGroup, z, obj);
    }
}
