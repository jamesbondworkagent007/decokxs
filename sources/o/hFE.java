package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hFE implements ViewBinding {
    public final C29040kmD AEQbTJ;
    public final C29040kmD AYXKKw;
    public final android.view.View AhwBna;
    public final ConstraintLayout AkhnZx;
    public final android.widget.HorizontalScrollView DbNXlk;
    public final android.view.View EZpvd;
    public final C29040kmD KWHzl;
    public final C29040kmD OLrzqt;
    public final AppCompatImageView copydefault;
    public final LinearLayoutCompat djBIcL;
    public final C29040kmD gEmmrt;
    public final C29040kmD valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AhwBna;
    }

    public hFE(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C29040kmD c29040kmD, @androidx.annotation.NonNull C29040kmD c29040kmD2, @androidx.annotation.NonNull C29040kmD c29040kmD3, @androidx.annotation.NonNull C29040kmD c29040kmD4, @androidx.annotation.NonNull C29040kmD c29040kmD5, @androidx.annotation.NonNull C29040kmD c29040kmD6, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.AhwBna = view;
        this.EZpvd = view2;
        this.copydefault = appCompatImageView;
        this.AEQbTJ = c29040kmD;
        this.OLrzqt = c29040kmD2;
        this.KWHzl = c29040kmD3;
        this.gEmmrt = c29040kmD4;
        this.AYXKKw = c29040kmD5;
        this.valueOf = c29040kmD6;
        this.djBIcL = linearLayoutCompat;
        this.DbNXlk = horizontalScrollView;
        this.AkhnZx = constraintLayout;
    }

    public static hFE copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.GiPPlLRPuVlr, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static hFE AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.hCiIDQ;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.IPostMessageService;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.MediaBrowserCompatSubscriptionCallback;
                C29040kmD c29040kmD = (C29040kmD) ViewBindings.findChildViewById(view, i);
                if (c29040kmD != null) {
                    i = C23274hvD.Application.MediaDescriptionCompat;
                    C29040kmD c29040kmD2 = (C29040kmD) ViewBindings.findChildViewById(view, i);
                    if (c29040kmD2 != null) {
                        i = C23274hvD.Application.getIconUri;
                        C29040kmD c29040kmD3 = (C29040kmD) ViewBindings.findChildViewById(view, i);
                        if (c29040kmD3 != null) {
                            i = C23274hvD.Application.getSubtitle;
                            C29040kmD c29040kmD4 = (C29040kmD) ViewBindings.findChildViewById(view, i);
                            if (c29040kmD4 != null) {
                                i = C23274hvD.Application.getTitle;
                                C29040kmD c29040kmD5 = (C29040kmD) ViewBindings.findChildViewById(view, i);
                                if (c29040kmD5 != null) {
                                    i = C23274hvD.Application.MediaDescriptionCompat1;
                                    C29040kmD c29040kmD6 = (C29040kmD) ViewBindings.findChildViewById(view, i);
                                    if (c29040kmD6 != null) {
                                        i = C23274hvD.Application.seekTo;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat != null) {
                                            i = C23274hvD.Application.remove;
                                            android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                                            if (horizontalScrollView != null) {
                                                i = C23274hvD.Application.isCheckable;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    return new hFE(view, viewFindChildViewById, appCompatImageView, c29040kmD, c29040kmD2, c29040kmD3, c29040kmD4, c29040kmD5, c29040kmD6, linearLayoutCompat, horizontalScrollView, constraintLayout);
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
