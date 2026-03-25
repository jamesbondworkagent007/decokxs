package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21492hBj implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final AppCompatTextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C55320xhi OLrzqt;
    public final AppCompatTextView copydefault;
    public final ConstraintLayout djBIcL;
    public final ConstraintLayout gEmmrt;
    public final android.widget.LinearLayout isConnected;
    public final android.widget.ImageView valueOf;
    public final android.widget.ImageView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C21492hBj(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5) {
        this.djBIcL = constraintLayout;
        this.OLrzqt = c55320xhi;
        this.KWHzl = imageView;
        this.EZpvd = appCompatTextView;
        this.copydefault = appCompatTextView2;
        this.AEQbTJ = appCompatImageView;
        this.valueOf = imageView2;
        this.AYXKKw = frameLayout;
        this.gEmmrt = constraintLayout2;
        this.AhwBna = appCompatTextView3;
        this.isConnected = linearLayout;
        this.values = imageView3;
        this.AkhnZx = appCompatTextView4;
        this.DbNXlk = appCompatTextView5;
    }

    public static C21492hBj AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gwwfep, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21492hBj copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dIjzlO;
        C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
        if (c55320xhi != null) {
            i = C23274hvD.Application.atDTRm;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.aKhcqp;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C23274hvD.Application.gBtXYZ;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C23274hvD.Application.zEHIKV;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = C23274hvD.Application.DhEJvI;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C23274hvD.Application.setIconUri;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = C23274hvD.Application.setSessionActivity;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = C23274hvD.Application.BackHandlerlambda0;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            i = C23274hvD.Application.BackHandler;
                                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = C23274hvD.Application.dispose;
                                                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView3 != null) {
                                                    i = C23274hvD.Application.BackHandlerKt;
                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView4 != null) {
                                                        i = C23274hvD.Application.setCursor;
                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView5 != null) {
                                                            return new C21492hBj((ConstraintLayout) view, c55320xhi, imageView, appCompatTextView, appCompatTextView2, appCompatImageView, imageView2, frameLayout, constraintLayout, appCompatTextView3, linearLayout, imageView3, appCompatTextView4, appCompatTextView5);
                                                        }
                                                    }
                                                }
                                            }
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
