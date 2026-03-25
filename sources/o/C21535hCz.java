package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21535hCz implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final AppCompatTextView OLrzqt;
    public final wYC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C21535hCz(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.AEQbTJ = linearLayoutCompat;
        this.copydefault = wyc;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = appCompatTextView;
    }

    public static C21535hCz AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.hTAtCx;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C23274hvD.Application.DhEJvI;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.isTitleTruncated;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    return new C21535hCz((LinearLayoutCompat) view, wyc, appCompatImageView, appCompatTextView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
