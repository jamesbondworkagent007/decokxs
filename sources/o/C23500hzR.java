package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23500hzR implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.RelativeLayout KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final ConstraintLayout copydefault;
    public final C25266itV djBIcL;
    public final AppCompatTextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C23500hzR(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull C25266itV c25266itV) {
        this.copydefault = constraintLayout;
        this.KWHzl = relativeLayout;
        this.EZpvd = frameLayout;
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = appCompatTextView;
        this.gEmmrt = appCompatTextView2;
        this.djBIcL = c25266itV;
    }

    public static C23500hzR KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DBxZfM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23500hzR EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DcMfJKDcMfJK;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = C23274hvD.Application.gwwzsY;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C23274hvD.Application.MediaControllerCompatMediaControllerExtraData;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C23274hvD.Application.RawRes;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C23274hvD.Application.hideForActionMode;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C23274hvD.Application.setExclusiveCheckable;
                            C25266itV c25266itV = (C25266itV) ViewBindings.findChildViewById(view, i);
                            if (c25266itV != null) {
                                return new C23500hzR((ConstraintLayout) view, relativeLayout, frameLayout, linearLayoutCompat, appCompatTextView, appCompatTextView2, c25266itV);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
