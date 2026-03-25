package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C33160mrH;

/* JADX INFO: renamed from: o.mtl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33296mtl extends ViewDataBinding {
    public final LottieAnimationView KWHzl;

    public AbstractC33296mtl(java.lang.Object obj, android.view.View view, int i, LottieAnimationView lottieAnimationView) {
        super(obj, view, i);
        this.KWHzl = lottieAnimationView;
    }

    public static AbstractC33296mtl OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33296mtl EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33296mtl) ViewDataBinding.inflateInternal(layoutInflater, C33160mrH.Application.copydefault, null, false, obj);
    }
}
