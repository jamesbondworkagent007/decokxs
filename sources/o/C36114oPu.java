package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36114oPu implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.HorizontalScrollView AhwBna;
    public final pGX EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.RelativeLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public C36114oPu(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull pGX pgx, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.valueOf = linearLayout;
        this.EZpvd = pgx;
        this.KWHzl = imageView;
        this.copydefault = imageView2;
        this.OLrzqt = relativeLayout;
        this.AEQbTJ = linearLayoutCompat;
        this.AhwBna = horizontalScrollView;
        this.gEmmrt = textView;
        this.djBIcL = textView2;
    }

    public static C36114oPu OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.valueOf;
        pGX pgx = (pGX) ViewBindings.findChildViewById(view, i);
        if (pgx != null) {
            i = C35964oKf.StateListAnimator.Dfm;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C35964oKf.StateListAnimator.QnnRaN;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C35964oKf.StateListAnimator.HrFqwD;
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = C35964oKf.StateListAnimator.gwwzsY;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = C35964oKf.StateListAnimator.getActiveNotifications;
                            android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                            if (horizontalScrollView != null) {
                                i = C35964oKf.StateListAnimator.getBundle;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C35964oKf.StateListAnimator.newHeartRating;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new C36114oPu((android.widget.LinearLayout) view, pgx, imageView, imageView2, relativeLayout, linearLayoutCompat, horizontalScrollView, textView, textView2);
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
