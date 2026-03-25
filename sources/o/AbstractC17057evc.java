package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17057evc extends ViewDataBinding {
    public final C57299yfm AEQbTJ;
    public final LottieAnimationView EZpvd;
    public final AppCompatTextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C52794wYp copydefault;
    public final C55251xgS gEmmrt;

    public AbstractC17057evc(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, C57299yfm c57299yfm, android.widget.ImageView imageView, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView, C55251xgS c55251xgS) {
        super(obj, view, i);
        this.copydefault = c52794wYp;
        this.AEQbTJ = c57299yfm;
        this.OLrzqt = imageView;
        this.EZpvd = lottieAnimationView;
        this.KWHzl = appCompatTextView;
        this.gEmmrt = c55251xgS;
    }

    public static AbstractC17057evc OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17057evc AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17057evc) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.sEAkxl, viewGroup, z, obj);
    }
}
