package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16570emS extends ViewDataBinding {
    public final LottieAnimationView AEQbTJ;
    public final C52794wYp EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC16570emS(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, C52794wYp c52794wYp2, android.widget.TextView textView, LottieAnimationView lottieAnimationView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.KWHzl = c52794wYp;
        this.EZpvd = c52794wYp2;
        this.copydefault = textView;
        this.AEQbTJ = lottieAnimationView;
        this.OLrzqt = textView2;
    }

    public static AbstractC16570emS KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16570emS AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16570emS) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.zLAIeZ, viewGroup, z, obj);
    }
}
