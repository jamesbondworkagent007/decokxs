package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes24.dex */
public final class uRM implements ViewBinding {
    public final uNT AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final AppCompatTextView EZpvd;
    public final uNT KWHzl;
    public final uNT OLrzqt;
    public final uNT copydefault;
    public final uNT gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public uRM(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull uNT unt, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull uNT unt2, @androidx.annotation.NonNull uNT unt3, @androidx.annotation.NonNull uNT unt4, @androidx.annotation.NonNull uNT unt5) {
        this.AYXKKw = constraintLayout;
        this.OLrzqt = unt;
        this.EZpvd = appCompatTextView;
        this.AEQbTJ = unt2;
        this.KWHzl = unt3;
        this.copydefault = unt4;
        this.gEmmrt = unt5;
    }

    public static uRM EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C48033uCm.Application.fjfviF;
        android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            uNT untCopydefault = uNT.copydefault(viewFindChildViewById2);
            i = C48033uCm.Application.invokespecialDaTmkG;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.invokespecialhrnhsO))) != null) {
                uNT untCopydefault2 = uNT.copydefault(viewFindChildViewById);
                i = C48033uCm.Application.MediaSessionCompatCallbackStubApi23;
                android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById3 != null) {
                    uNT untCopydefault3 = uNT.copydefault(viewFindChildViewById3);
                    i = C48033uCm.Application.fromPlaybackState;
                    android.view.View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById4 != null) {
                        uNT untCopydefault4 = uNT.copydefault(viewFindChildViewById4);
                        i = C48033uCm.Application.IResultReceiver2Default;
                        android.view.View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
                        if (viewFindChildViewById5 != null) {
                            return new uRM((ConstraintLayout) view, untCopydefault, appCompatTextView, untCopydefault2, untCopydefault3, untCopydefault4, uNT.copydefault(viewFindChildViewById5));
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
