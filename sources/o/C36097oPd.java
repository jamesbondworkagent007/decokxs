package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36097oPd implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final C54984xbQ AkhnZx;
    public final C55237xgE AuCTel;
    public final C54984xbQ DbNXlk;
    public final C54984xbQ EZpvd;
    public final RecyclerView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C55237xgE copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.HorizontalScrollView ejfBZ;
    public final AppCompatTextView fJNWhG;
    public final C39778pyk fetchVPNInfo;
    public final C54984xbQ gEmmrt;
    public final C55237xgE isConnected;
    public final C36112oPs valueOf;
    public final android.widget.FrameLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55237xgE getRoot() {
        return this.isConnected;
    }

    public C36097oPd(@androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull C54984xbQ c54984xbQ, @androidx.annotation.NonNull C55237xgE c55237xgE2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C36112oPs c36112oPs, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C54984xbQ c54984xbQ2, @androidx.annotation.NonNull C54984xbQ c54984xbQ3, @androidx.annotation.NonNull C54984xbQ c54984xbQ4, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C39778pyk c39778pyk, @androidx.annotation.NonNull C55237xgE c55237xgE3, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.isConnected = c55237xgE;
        this.EZpvd = c54984xbQ;
        this.copydefault = c55237xgE2;
        this.KWHzl = recyclerView;
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = linearLayout;
        this.AhwBna = imageView;
        this.djBIcL = textView;
        this.valueOf = c36112oPs;
        this.AYXKKw = textView2;
        this.gEmmrt = c54984xbQ2;
        this.DbNXlk = c54984xbQ3;
        this.AkhnZx = c54984xbQ4;
        this.values = frameLayout;
        this.fetchVPNInfo = c39778pyk;
        this.AuCTel = c55237xgE3;
        this.ejfBZ = horizontalScrollView;
        this.fJNWhG = appCompatTextView;
    }

    public static C36097oPd OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.isConnected;
        C54984xbQ c54984xbQ = (C54984xbQ) ViewBindings.findChildViewById(view, i);
        if (c54984xbQ != null) {
            i = C35964oKf.StateListAnimator.zuWLRA;
            C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
            if (c55237xgE != null) {
                i = C35964oKf.StateListAnimator.zKcAg;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C35964oKf.StateListAnimator.zOIQXb;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C35964oKf.StateListAnimator.aVhqwO;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C35964oKf.StateListAnimator.fupbxE;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C35964oKf.StateListAnimator.getUserContextRegisteredStatus;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.DfrfUJ))) != null) {
                                    C36112oPs c36112oPsAEQbTJ = C36112oPs.AEQbTJ(viewFindChildViewById);
                                    i = C35964oKf.StateListAnimator.QgUVrU;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C35964oKf.StateListAnimator.OYuSWK;
                                        C54984xbQ c54984xbQ2 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                                        if (c54984xbQ2 != null) {
                                            i = C35964oKf.StateListAnimator.DDNONI;
                                            C54984xbQ c54984xbQ3 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                                            if (c54984xbQ3 != null) {
                                                i = C35964oKf.StateListAnimator.fOrBHg;
                                                C54984xbQ c54984xbQ4 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                                                if (c54984xbQ4 != null) {
                                                    i = C35964oKf.StateListAnimator.dHAKvv;
                                                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout != null) {
                                                        i = C35964oKf.StateListAnimator.DbvGUJ;
                                                        C39778pyk c39778pyk = (C39778pyk) ViewBindings.findChildViewById(view, i);
                                                        if (c39778pyk != null) {
                                                            C55237xgE c55237xgE2 = (C55237xgE) view;
                                                            i = C35964oKf.StateListAnimator.MediaBrowserCompatItemCallbackItemCallbackApi23;
                                                            android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                                                            if (horizontalScrollView != null) {
                                                                i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView != null) {
                                                                    return new C36097oPd(c55237xgE2, c54984xbQ, c55237xgE, recyclerView, constraintLayout, linearLayout, imageView, textView, c36112oPsAEQbTJ, textView2, c54984xbQ2, c54984xbQ3, c54984xbQ4, frameLayout, c39778pyk, c55237xgE2, horizontalScrollView, appCompatTextView);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
