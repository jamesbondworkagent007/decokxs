package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.etN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16936etN extends ViewDataBinding {
    public final LottieAnimationView AEQbTJ;
    public final C52794wYp EZpvd;
    public final android.widget.TextView KWHzl;
    public final C52794wYp OLrzqt;
    public final android.widget.ImageView copydefault;

    public AbstractC16936etN(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, C52794wYp c52794wYp2, android.widget.ImageView imageView, LottieAnimationView lottieAnimationView, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = c52794wYp;
        this.OLrzqt = c52794wYp2;
        this.copydefault = imageView;
        this.AEQbTJ = lottieAnimationView;
        this.KWHzl = textView;
    }

    public static AbstractC16936etN AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16936etN copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16936etN) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.RSmiaq, viewGroup, z, obj);
    }
}
