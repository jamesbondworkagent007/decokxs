package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.ltW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31410ltW extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.TextView DbNXlk;
    public final ConstraintLayout EZpvd;

    @Bindable
    public lSO KWHzl;
    public final LottieAnimationView OLrzqt;
    public final ConstraintLayout copydefault;
    public final AbstractC31595lwx djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.ScrollView valueOf;

    public abstract void copydefault(@androidx.annotation.Nullable lSO lso);

    public AbstractC31410ltW(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LottieAnimationView lottieAnimationView, android.widget.ScrollView scrollView, android.widget.TextView textView, AbstractC31595lwx abstractC31595lwx, ConstraintLayout constraintLayout3, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4) {
        super(obj, view, i);
        this.AEQbTJ = imageView;
        this.copydefault = constraintLayout;
        this.EZpvd = constraintLayout2;
        this.OLrzqt = lottieAnimationView;
        this.valueOf = scrollView;
        this.gEmmrt = textView;
        this.djBIcL = abstractC31595lwx;
        this.AhwBna = constraintLayout3;
        this.AYXKKw = textView2;
        this.fetchVPNInfo = textView3;
        this.DbNXlk = textView4;
    }

    public static AbstractC31410ltW KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31410ltW copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31410ltW) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.valueOf, null, false, obj);
    }
}
