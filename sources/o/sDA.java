package o;

import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sDA extends ViewDataBinding {
    public final ShapeableImageView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final CardView OLrzqt;
    public final LottieAnimationView copydefault;
    public final android.view.View djBIcL;

    public sDA(java.lang.Object obj, android.view.View view, int i, CardView cardView, android.widget.TextView textView, ShapeableImageView shapeableImageView, LottieAnimationView lottieAnimationView, android.widget.TextView textView2, android.widget.TextView textView3, android.view.View view2) {
        super(obj, view, i);
        this.OLrzqt = cardView;
        this.KWHzl = textView;
        this.AEQbTJ = shapeableImageView;
        this.copydefault = lottieAnimationView;
        this.EZpvd = textView2;
        this.AhwBna = textView3;
        this.djBIcL = view2;
    }
}
