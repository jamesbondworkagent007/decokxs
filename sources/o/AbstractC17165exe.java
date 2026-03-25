package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17165exe extends ViewDataBinding {
    public final C14736drA AEQbTJ;
    public final C55173xeu EZpvd;
    public final AppCompatImageView KWHzl;
    public final LottieAnimationView OLrzqt;
    public final AppCompatTextView copydefault;

    public AbstractC17165exe(java.lang.Object obj, android.view.View view, int i, C55173xeu c55173xeu, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, C14736drA c14736drA, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.EZpvd = c55173xeu;
        this.KWHzl = appCompatImageView;
        this.OLrzqt = lottieAnimationView;
        this.AEQbTJ = c14736drA;
        this.copydefault = appCompatTextView;
    }

    public static AbstractC17165exe EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17165exe KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17165exe) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.OmYuqg, viewGroup, z, obj);
    }
}
