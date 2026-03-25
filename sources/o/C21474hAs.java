package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21474hAs implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final hZI EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final C22141hZk OLrzqt;
    public final C24278ian copydefault;
    public final C22117hYn djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public C21474hAs(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull hZI hzi, @androidx.annotation.NonNull C22141hZk c22141hZk, @androidx.annotation.NonNull C24278ian c24278ian, @androidx.annotation.NonNull C22117hYn c22117hYn) {
        this.KWHzl = linearLayoutCompat;
        this.AEQbTJ = frameLayout;
        this.EZpvd = hzi;
        this.OLrzqt = c22141hZk;
        this.copydefault = c24278ian;
        this.djBIcL = c22117hYn;
    }

    public static C21474hAs OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fXHmeK, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21474hAs KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.UccSpe;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.PipHintTrackerKttrackPipAnimationHintViewflow11;
            hZI hzi = (hZI) ViewBindings.findChildViewById(view, i);
            if (hzi != null) {
                i = C23274hvD.Application.get;
                C22141hZk c22141hZk = (C22141hZk) ViewBindings.findChildViewById(view, i);
                if (c22141hZk != null) {
                    i = C23274hvD.Application.getTransformation;
                    C24278ian c24278ian = (C24278ian) ViewBindings.findChildViewById(view, i);
                    if (c24278ian != null) {
                        i = C23274hvD.Application.ViewPropertyAnimatorCompatSet;
                        C22117hYn c22117hYn = (C22117hYn) ViewBindings.findChildViewById(view, i);
                        if (c22117hYn != null) {
                            return new C21474hAs((LinearLayoutCompat) view, frameLayout, hzi, c22141hZk, c24278ian, c22117hYn);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
