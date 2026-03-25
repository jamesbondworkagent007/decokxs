package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23490hzH implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final wYK EZpvd;
    public final AppCompatTextView KWHzl;
    public final NestedScrollView OLrzqt;
    public final Barrier copydefault;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.OLrzqt;
    }

    public C23490hzH(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.OLrzqt = nestedScrollView;
        this.copydefault = barrier;
        this.EZpvd = wyk;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = appCompatTextView;
        this.valueOf = appCompatTextView2;
        this.AYXKKw = appCompatTextView3;
    }

    public static C23490hzH AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.call, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23490hzH KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DCUTEI;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C23274hvD.Application.RZNAhV;
            wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
            if (wyk != null) {
                i = C23274hvD.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C23274hvD.Application.setDisplayShowTitleEnabled;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C23274hvD.Application.parseItem;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C23274hvD.Application.DrawerArrowDrawableArrowDirection;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                return new C23490hzH((NestedScrollView) view, barrier, wyk, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
