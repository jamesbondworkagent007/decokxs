package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23730iHe implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C27207jqo AYXKKw;
    public final android.widget.FrameLayout AhwBna;
    public final C27204jql AkhnZx;
    public final C27206jqn AuCTel;
    public final C27271jrz DbNXlk;
    public final C27449jvR EZpvd;
    public final C33537myN KWHzl;
    public final android.widget.ScrollView OLrzqt;
    public final ConstraintLayout copydefault;
    public final C27131jpR djBIcL;
    public final C27220jrA ejfBZ;
    public final C27187jqU fJNWhG;
    public final C27265jrt fetchVPNInfo;
    public final C27137jpX gEmmrt;
    public final android.view.View isConnected;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C27204jql getRoot() {
        return this.AkhnZx;
    }

    public C23730iHe(@androidx.annotation.NonNull C27204jql c27204jql, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull C27449jvR c27449jvR, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C27131jpR c27131jpR, @androidx.annotation.NonNull C27137jpX c27137jpX, @androidx.annotation.NonNull C27207jqo c27207jqo, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C27271jrz c27271jrz, @androidx.annotation.NonNull C27265jrt c27265jrt, @androidx.annotation.NonNull C27220jrA c27220jrA, @androidx.annotation.NonNull C27206jqn c27206jqn, @androidx.annotation.NonNull C27187jqU c27187jqU) {
        this.AkhnZx = c27204jql;
        this.KWHzl = c33537myN;
        this.AEQbTJ = frameLayout;
        this.copydefault = constraintLayout;
        this.OLrzqt = scrollView;
        this.EZpvd = c27449jvR;
        this.valueOf = linearLayout;
        this.djBIcL = c27131jpR;
        this.gEmmrt = c27137jpX;
        this.AYXKKw = c27207jqo;
        this.AhwBna = frameLayout2;
        this.isConnected = view;
        this.values = textView;
        this.DbNXlk = c27271jrz;
        this.fetchVPNInfo = c27265jrt;
        this.ejfBZ = c27220jrA;
        this.AuCTel = c27206jqn;
        this.fJNWhG = c27187jqU;
    }

    public static C23730iHe KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C23730iHe KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.DbNXlk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23730iHe KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C25493ixk.ActionBar.fJNWhG;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C25493ixk.ActionBar.finit;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C25493ixk.ActionBar.OTwTPd;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C25493ixk.ActionBar.DsrFlB;
                    android.widget.ScrollView scrollView = (android.widget.ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = C25493ixk.ActionBar.DNMMPQ;
                        C27449jvR c27449jvR = (C27449jvR) ViewBindings.findChildViewById(view, i);
                        if (c27449jvR != null) {
                            i = C25493ixk.ActionBar.UhxbNG;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C25493ixk.ActionBar.dLBcXg;
                                C27131jpR c27131jpR = (C27131jpR) ViewBindings.findChildViewById(view, i);
                                if (c27131jpR != null) {
                                    i = C25493ixk.ActionBar.gtdfxv;
                                    C27137jpX c27137jpX = (C27137jpX) ViewBindings.findChildViewById(view, i);
                                    if (c27137jpX != null) {
                                        i = C25493ixk.ActionBar.DcMfJKfNUfqk;
                                        C27207jqo c27207jqo = (C27207jqo) ViewBindings.findChildViewById(view, i);
                                        if (c27207jqo != null) {
                                            i = C25493ixk.ActionBar.DpxfQh;
                                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                            if (frameLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.QSusPL))) != null) {
                                                i = C25493ixk.ActionBar.wtf;
                                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null) {
                                                    i = C25493ixk.ActionBar.getMediaMetadata;
                                                    C27271jrz c27271jrz = (C27271jrz) ViewBindings.findChildViewById(view, i);
                                                    if (c27271jrz != null) {
                                                        i = C25493ixk.ActionBar.MediaMetadataCompatBuilder;
                                                        C27265jrt c27265jrt = (C27265jrt) ViewBindings.findChildViewById(view, i);
                                                        if (c27265jrt != null) {
                                                            i = C25493ixk.ActionBar.size;
                                                            C27220jrA c27220jrA = (C27220jrA) ViewBindings.findChildViewById(view, i);
                                                            if (c27220jrA != null) {
                                                                i = C25493ixk.ActionBar.scaleBitmap;
                                                                C27206jqn c27206jqn = (C27206jqn) ViewBindings.findChildViewById(view, i);
                                                                if (c27206jqn != null) {
                                                                    i = C25493ixk.ActionBar.putLong;
                                                                    C27187jqU c27187jqU = (C27187jqU) ViewBindings.findChildViewById(view, i);
                                                                    if (c27187jqU != null) {
                                                                        return new C23730iHe((C27204jql) view, c33537myN, frameLayout, constraintLayout, scrollView, c27449jvR, linearLayout, c27131jpR, c27137jpX, c27207jqo, frameLayout2, viewFindChildViewById, textView, c27271jrz, c27265jrt, c27220jrA, c27206jqn, c27187jqU);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
