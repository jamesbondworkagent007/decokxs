package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hEx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21587hEx implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final AppCompatImageView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final Barrier EZpvd;
    public final Barrier KWHzl;
    public final C52794wYp OLrzqt;
    public final Barrier copydefault;
    public final ConstraintLayout djBIcL;
    public final android.view.View ejfBZ;
    public final C21983hTo fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C21587hEx(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Barrier barrier2, @androidx.annotation.NonNull Barrier barrier3, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull C21983hTo c21983hTo, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2) {
        this.djBIcL = constraintLayout;
        this.EZpvd = barrier;
        this.copydefault = barrier2;
        this.KWHzl = barrier3;
        this.OLrzqt = c52794wYp;
        this.AEQbTJ = constraintLayout2;
        this.AYXKKw = linearLayoutCompat;
        this.AhwBna = appCompatImageView;
        this.valueOf = appCompatTextView;
        this.gEmmrt = appCompatTextView2;
        this.isConnected = appCompatTextView3;
        this.AkhnZx = appCompatTextView4;
        this.DbNXlk = appCompatTextView5;
        this.fetchVPNInfo = c21983hTo;
        this.values = view;
        this.ejfBZ = view2;
    }

    public static C21587hEx OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gVEiQJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21587hEx OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C23274hvD.Application.AubY;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C23274hvD.Application.getPostValueLengthLimit;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null) {
                i = C23274hvD.Application.hBpjJd;
                Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i);
                if (barrier3 != null) {
                    i = C23274hvD.Application.getSessionID;
                    C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp != null) {
                        i = C23274hvD.Application.DcMfJKsgNvtZ;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = C23274hvD.Application.gGNlxh;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = C23274hvD.Application.getDefaultImpl;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView != null) {
                                    i = C23274hvD.Application.AppCompatActivity1;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        i = C23274hvD.Application.setDither;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            i = C23274hvD.Application.setTint;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView3 != null) {
                                                i = C23274hvD.Application.AnimatedStateListDrawableCompatAnimatedStateListState;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView4 != null) {
                                                    i = C23274hvD.Application.generateTransitionKey;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        i = C23274hvD.Application.resetGroup;
                                                        C21983hTo c21983hTo = (C21983hTo) ViewBindings.findChildViewById(view, i);
                                                        if (c21983hTo != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.dispatchTrackballEvent))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.getWrapped))) != null) {
                                                            return new C21587hEx((ConstraintLayout) view, barrier, barrier2, barrier3, c52794wYp, constraintLayout, linearLayoutCompat, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, c21983hTo, viewFindChildViewById, viewFindChildViewById2);
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
