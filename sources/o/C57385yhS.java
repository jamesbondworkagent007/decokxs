package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57385yhS implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C57488yjP EZpvd;
    public final AppCompatImageView KWHzl;
    public final C57488yjP OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C57385yhS(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C57488yjP c57488yjP, @androidx.annotation.NonNull C57488yjP c57488yjP2) {
        this.AEQbTJ = view;
        this.KWHzl = appCompatImageView;
        this.OLrzqt = c57488yjP;
        this.EZpvd = c57488yjP2;
    }

    public static C57385yhS copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.zuBGHE, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C57385yhS KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.RJOkX;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C57406yhn.StateListAnimator.AxsJAYaxsJAY;
            C57488yjP c57488yjP = (C57488yjP) ViewBindings.findChildViewById(view, i);
            if (c57488yjP != null) {
                i = C57406yhn.StateListAnimator.gkJEwt;
                C57488yjP c57488yjP2 = (C57488yjP) ViewBindings.findChildViewById(view, i);
                if (c57488yjP2 != null) {
                    return new C57385yhS(view, appCompatImageView, c57488yjP, c57488yjP2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
