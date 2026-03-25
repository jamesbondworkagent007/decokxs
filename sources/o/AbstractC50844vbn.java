package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50844vbn extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final Guideline OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.TextView djBIcL;

    public AbstractC50844vbn(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, android.widget.FrameLayout frameLayout, Guideline guideline, AppCompatImageView appCompatImageView, android.widget.FrameLayout frameLayout2, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = linearLayout;
        this.EZpvd = frameLayout;
        this.OLrzqt = guideline;
        this.copydefault = appCompatImageView;
        this.KWHzl = frameLayout2;
        this.djBIcL = textView;
    }

    public static AbstractC50844vbn OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50844vbn AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50844vbn) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.iRgjgR, viewGroup, z, obj);
    }
}
