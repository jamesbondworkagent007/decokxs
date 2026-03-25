package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uNB implements ViewBinding {
    public final C53573wnz AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C53573wnz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public uNB(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C53573wnz c53573wnz, @androidx.annotation.NonNull C53573wnz c53573wnz2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.AYXKKw = constraintLayout;
        this.AEQbTJ = c53573wnz;
        this.copydefault = c53573wnz2;
        this.OLrzqt = frameLayout;
        this.EZpvd = appCompatTextView;
        this.KWHzl = appCompatTextView2;
    }

    public static uNB copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.giSNqX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static uNB KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.AubY;
        C53573wnz c53573wnz = (C53573wnz) ViewBindings.findChildViewById(view, i);
        if (c53573wnz != null) {
            i = C48033uCm.Application.sVXHln;
            C53573wnz c53573wnz2 = (C53573wnz) ViewBindings.findChildViewById(view, i);
            if (c53573wnz2 != null) {
                i = C48033uCm.Application.DzCpqu;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C48033uCm.Application.handleMessage;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C48033uCm.Application.MediaBrowserCompatConnectionCallback;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            return new uNB((ConstraintLayout) view, c53573wnz, c53573wnz2, frameLayout, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
