package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21463hAh implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C31216lpo EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C21463hAh(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C31216lpo c31216lpo, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.AEQbTJ = constraintLayout;
        this.EZpvd = c31216lpo;
        this.KWHzl = linearLayoutCompat;
        this.copydefault = appCompatImageView;
        this.OLrzqt = appCompatTextView;
    }

    public static C21463hAh EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RXzakW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21463hAh KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.cBPFI;
        C31216lpo c31216lpo = (C31216lpo) ViewBindings.findChildViewById(view, i);
        if (c31216lpo != null) {
            i = C23274hvD.Application.fiXcQa;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C23274hvD.Application.UnZVfqExternalSyntheticApiModelOutline0;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C23274hvD.Application.hasIcon;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        return new C21463hAh((ConstraintLayout) view, c31216lpo, linearLayoutCompat, appCompatImageView, appCompatTextView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
