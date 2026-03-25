package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21516hCg implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.view.View AhwBna;
    public final android.widget.ImageView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final AppCompatImageView EZpvd;
    public final C55113xdn KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.ViewFlipper fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final kMT valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.djBIcL;
    }

    public C21516hCg(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull kMT kmt, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.ViewFlipper viewFlipper, @androidx.annotation.NonNull android.widget.ImageView imageView3) {
        this.djBIcL = linearLayout;
        this.AEQbTJ = textView;
        this.EZpvd = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.KWHzl = c55113xdn;
        this.OLrzqt = imageView;
        this.gEmmrt = constraintLayout;
        this.AYXKKw = imageView2;
        this.valueOf = kmt;
        this.AhwBna = view;
        this.values = textView2;
        this.DbNXlk = textView3;
        this.isConnected = textView4;
        this.fetchVPNInfo = viewFlipper;
        this.AkhnZx = imageView3;
    }

    public static C21516hCg copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C21516hCg KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.invokespecialatDTRm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21516hCg AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.setPageName;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.ddauOi;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.getSmallIconId;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        i = C23274hvD.Application.onMetadataUpdate;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C23274hvD.Application.equals;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C23274hvD.Application.setActiveQueueItemId;
                                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = C23274hvD.Application.ComponentDialogExternalSyntheticLambda1;
                                    kMT kmt = (kMT) ViewBindings.findChildViewById(view, i);
                                    if (kmt != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.emit))) != null) {
                                        i = C23274hvD.Application.getToolbarNavigationClickListener;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = C23274hvD.Application.onDrawerStateChanged;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = C23274hvD.Application.AppCompatDelegateImpl5;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = C23274hvD.Application.ContextThemeWrapperApi17Impl;
                                                    android.widget.ViewFlipper viewFlipper = (android.widget.ViewFlipper) ViewBindings.findChildViewById(view, i);
                                                    if (viewFlipper != null) {
                                                        i = C23274hvD.Application.needsDividerBefore;
                                                        android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView3 != null) {
                                                            return new C21516hCg((android.widget.LinearLayout) view, textView, appCompatImageView, appCompatImageView2, c55113xdn, imageView, constraintLayout, imageView2, kmt, viewFindChildViewById, textView2, textView3, textView4, viewFlipper, imageView3);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
