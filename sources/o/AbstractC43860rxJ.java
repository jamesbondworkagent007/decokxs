package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: renamed from: o.rxJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC43860rxJ extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final LottieAnimationView EZpvd;

    @Bindable
    public rIB OLrzqt;
    public final android.widget.LinearLayout copydefault;

    public AbstractC43860rxJ(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.LinearLayout linearLayout, LottieAnimationView lottieAnimationView) {
        super(obj, view, i);
        this.AEQbTJ = imageView;
        this.copydefault = linearLayout;
        this.EZpvd = lottieAnimationView;
    }
}
