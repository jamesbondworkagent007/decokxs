package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16257egX implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final fTA AYXKKw;
    public final android.widget.ImageView EZpvd;
    public final ViewPager2 KWHzl;
    public final C19600gIj OLrzqt;
    public final LottieAnimationView copydefault;
    public final Group djBIcL;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C16257egX(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull C19600gIj c19600gIj, @androidx.annotation.NonNull fTA fta, @androidx.annotation.NonNull Group group) {
        this.valueOf = constraintLayout;
        this.EZpvd = imageView;
        this.KWHzl = viewPager2;
        this.AEQbTJ = c52794wYp;
        this.copydefault = lottieAnimationView;
        this.OLrzqt = c19600gIj;
        this.AYXKKw = fta;
        this.djBIcL = group;
    }

    public static C16257egX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C16257egX OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.fJNWhG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16257egX copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.sbu;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C13754dXa.ActionBar.OxbLUn;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                i = C13754dXa.ActionBar.BVXAa;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C13754dXa.ActionBar.dNxZaP;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = C13754dXa.ActionBar.QSAYLr;
                        C19600gIj c19600gIj = (C19600gIj) ViewBindings.findChildViewById(view, i);
                        if (c19600gIj != null) {
                            i = C13754dXa.ActionBar.OWSZPf;
                            fTA fta = (fTA) ViewBindings.findChildViewById(view, i);
                            if (fta != null) {
                                i = C13754dXa.ActionBar.fromToken;
                                Group group = (Group) ViewBindings.findChildViewById(view, i);
                                if (group != null) {
                                    return new C16257egX((ConstraintLayout) view, imageView, viewPager2, c52794wYp, lottieAnimationView, c19600gIj, fta, group);
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
