package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16640enj implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C52794wYp EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final ConstraintLayout copydefault;
    public final NestedScrollView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.djBIcL;
    }

    public C16640enj(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6) {
        this.djBIcL = nestedScrollView;
        this.EZpvd = c52794wYp;
        this.copydefault = constraintLayout;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = imageView;
        this.OLrzqt = imageView2;
        this.AYXKKw = appCompatTextView;
        this.AhwBna = appCompatTextView2;
        this.valueOf = appCompatTextView3;
        this.gEmmrt = appCompatTextView4;
        this.isConnected = appCompatTextView5;
        this.values = appCompatTextView6;
    }

    public static C16640enj copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.RSDDiY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16640enj KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.aHXSQp;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.QslYrK;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C13754dXa.ActionBar.OFqMGB;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C13754dXa.ActionBar.hrnhsO;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C13754dXa.ActionBar.UUsvzUhTFPAC;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplBaseCommand;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                i = C13754dXa.ActionBar.setActions;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView2 != null) {
                                    i = C13754dXa.ActionBar.addOnPictureInPictureModeChangedListener;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView3 != null) {
                                        i = C13754dXa.ActionBar.addOnTrimMemoryListener;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView4 != null) {
                                            i = C13754dXa.ActionBar.onRetainCustomNonConfigurationInstance;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView5 != null) {
                                                i = C13754dXa.ActionBar.ComponentActivityExternalSyntheticLambda0;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView6 != null) {
                                                    return new C16640enj((NestedScrollView) view, c52794wYp, constraintLayout, appCompatImageView, imageView, imageView2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6);
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
