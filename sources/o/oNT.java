package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes18.dex */
public final class oNT implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.RelativeLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.view.View OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.EZpvd;
    }

    public oNT(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.EZpvd = relativeLayout;
        this.OLrzqt = view;
        this.copydefault = appCompatImageView;
        this.AEQbTJ = textView;
        this.KWHzl = textView2;
    }

    public static oNT copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.Ufzxmz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static oNT OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.finishInit;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C35964oKf.StateListAnimator.config;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C35964oKf.StateListAnimator.setMediaController;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C35964oKf.StateListAnimator.getMediaController;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new oNT((android.widget.RelativeLayout) view, viewFindChildViewById, appCompatImageView, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
