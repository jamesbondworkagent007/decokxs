package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21518hCi implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final LottieAnimationView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final AppCompatTextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C52794wYp copydefault;
    public final LinearLayoutCompat djBIcL;
    public final NestedScrollView gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.gEmmrt;
    }

    public C21518hCi(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.gEmmrt = nestedScrollView;
        this.copydefault = c52794wYp;
        this.EZpvd = imageView;
        this.OLrzqt = imageView2;
        this.AEQbTJ = appCompatTextView;
        this.KWHzl = appCompatTextView2;
        this.AhwBna = lottieAnimationView;
        this.valueOf = appCompatTextView3;
        this.djBIcL = linearLayoutCompat;
        this.AYXKKw = linearLayoutCompat2;
    }

    public static C21518hCi EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ODCBUN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21518hCi KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.sVXHln;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.fsw;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.ORWKdN;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C23274hvD.Application.Dfv;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C23274hvD.Application.GGlJim;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C23274hvD.Application.OmYuqg;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (lottieAnimationView != null) {
                                i = C23274hvD.Application.OEsIKP;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView3 != null) {
                                    i = C23274hvD.Application.getPackageName;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat != null) {
                                        i = C23274hvD.Application.getQueue;
                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat2 != null) {
                                            return new C21518hCi((NestedScrollView) view, c52794wYp, imageView, imageView2, appCompatTextView, appCompatTextView2, lottieAnimationView, appCompatTextView3, linearLayoutCompat, linearLayoutCompat2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
