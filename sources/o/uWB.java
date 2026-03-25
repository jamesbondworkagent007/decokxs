package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.banner.OKBannerLayout;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uWB extends ViewDataBinding {
    public final OKBannerLayout AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final AppCompatImageView EZpvd;
    public final C51648vqw KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;

    public uWB(java.lang.Object obj, android.view.View view, int i, OKBannerLayout oKBannerLayout, C51648vqw c51648vqw, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, android.widget.TextView textView, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.AEQbTJ = oKBannerLayout;
        this.KWHzl = c51648vqw;
        this.copydefault = constraintLayout;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = constraintLayout2;
        this.AhwBna = textView;
        this.AYXKKw = appCompatTextView;
    }

    public static uWB AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uWB OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uWB) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.FYtjSf, viewGroup, z, obj);
    }
}
