package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36041oNb implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.view.View EZpvd;
    public final oQU KWHzl;
    public final AppCompatTextView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatImageView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C36041oNb(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull oQU oqu, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat) {
        this.AhwBna = constraintLayout;
        this.EZpvd = view;
        this.KWHzl = oqu;
        this.OLrzqt = appCompatTextView;
        this.copydefault = linearLayout;
        this.AEQbTJ = appCompatTextView2;
        this.djBIcL = appCompatTextView3;
        this.gEmmrt = appCompatTextView4;
        this.valueOf = appCompatImageView;
        this.AYXKKw = linearLayoutCompat;
    }

    public static C36041oNb AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.OFhtUX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C36041oNb KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.aJZHYI;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C35964oKf.StateListAnimator.fkESqH;
            oQU oqu = (oQU) ViewBindings.findChildViewById(view, i);
            if (oqu != null) {
                i = C35964oKf.StateListAnimator.Rtjmuc;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C35964oKf.StateListAnimator.RuDPQV;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C35964oKf.StateListAnimator.aGOrKO;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C35964oKf.StateListAnimator.dPnHjp;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                i = C35964oKf.StateListAnimator.aKhcqp;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    i = C35964oKf.StateListAnimator.AudioAttributesCompatParcelizer;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatImageView != null) {
                                        i = C35964oKf.StateListAnimator.MediaBrowserCompat;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat != null) {
                                            return new C36041oNb((ConstraintLayout) view, viewFindChildViewById, oqu, appCompatTextView, linearLayout, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatImageView, linearLayoutCompat);
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
