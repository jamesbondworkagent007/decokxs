package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21612hFv implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final android.widget.RelativeLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.copydefault;
    }

    public C21612hFv(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.copydefault = relativeLayout;
        this.EZpvd = frameLayout;
        this.OLrzqt = appCompatImageView;
        this.KWHzl = appCompatTextView;
    }

    public static C21612hFv copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RcvFxC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21612hFv OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.SlnMSS;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.SdSTJp;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.setDisplayShowTitleEnabled;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    return new C21612hFv((android.widget.RelativeLayout) view, frameLayout, appCompatImageView, appCompatTextView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
