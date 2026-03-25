package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: renamed from: o.eir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16383eir extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final android.widget.TextView AhwBna;
    public final NestedScrollView EZpvd;
    public final LottieAnimationView KWHzl;
    public final C33537myN OLrzqt;
    public final ConstraintLayout copydefault;
    public final RecyclerView djBIcL;
    public final C52794wYp gEmmrt;

    public AbstractC16383eir(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LottieAnimationView lottieAnimationView, NestedScrollView nestedScrollView, C52794wYp c52794wYp, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = c33537myN;
        this.copydefault = constraintLayout;
        this.AEQbTJ = constraintLayout2;
        this.KWHzl = lottieAnimationView;
        this.EZpvd = nestedScrollView;
        this.gEmmrt = c52794wYp;
        this.AYXKKw = linearLayoutCompat;
        this.djBIcL = recyclerView;
        this.AhwBna = textView;
    }
}
