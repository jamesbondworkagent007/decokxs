package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.im.imui.utils.OKIMStateAwareFrameLayout;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nJF implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final C55258xgZ AhwBna;
    public final android.widget.TextView AkhnZx;
    public final C55113xdn AuCTel;
    public final NestedScrollView DbNXlk;
    public final C55173xeu EZpvd;
    public final OKIMStateAwareFrameLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final C55239xgG ejfBZ;
    public final ConstraintLayout fARcdN;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final C55018xby fetchVPNInfo;
    public final C55001xbh gEmmrt;
    public final C52794wYp isConnected;
    public final ConstraintLayout valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.values;
    }

    public nJF(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull OKIMStateAwareFrameLayout oKIMStateAwareFrameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55001xbh c55001xbh, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55018xby c55018xby, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull ConstraintLayout constraintLayout5, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.values = constraintLayout;
        this.KWHzl = oKIMStateAwareFrameLayout;
        this.OLrzqt = constraintLayout2;
        this.copydefault = constraintLayout3;
        this.AEQbTJ = linearLayout;
        this.EZpvd = c55173xeu;
        this.AhwBna = c55258xgZ;
        this.djBIcL = textView;
        this.valueOf = constraintLayout4;
        this.AYXKKw = frameLayout;
        this.gEmmrt = c55001xbh;
        this.AkhnZx = textView2;
        this.isConnected = c52794wYp;
        this.DbNXlk = nestedScrollView;
        this.fetchVPNInfo = c55018xby;
        this.ejfBZ = c55239xgG;
        this.fARcdN = constraintLayout5;
        this.fIwbmz = textView3;
        this.fJNWhG = textView4;
        this.AuCTel = c55113xdn;
    }

    public static nJF KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.OuxcSI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static nJF copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.AhwBna;
        OKIMStateAwareFrameLayout oKIMStateAwareFrameLayout = (OKIMStateAwareFrameLayout) ViewBindings.findChildViewById(view, i);
        if (oKIMStateAwareFrameLayout != null) {
            i = C35399nuc.StateListAnimator.DCUTEIddSDPG;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C35399nuc.StateListAnimator.KDccX;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = C35399nuc.StateListAnimator.akftKQ;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C35399nuc.StateListAnimator.sTzBva;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C35399nuc.StateListAnimator.invokespecialDaTmkG;
                            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                            if (c55258xgZ != null) {
                                i = C35399nuc.StateListAnimator.invokespecialODCBUN;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                    i = C35399nuc.StateListAnimator.glVQsU;
                                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = C35399nuc.StateListAnimator.hdpuIA;
                                        C55001xbh c55001xbh = (C55001xbh) ViewBindings.findChildViewById(view, i);
                                        if (c55001xbh != null) {
                                            i = C35399nuc.StateListAnimator.sRzUNh;
                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = C35399nuc.StateListAnimator.DjwCMv;
                                                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                                if (c52794wYp != null) {
                                                    i = C35399nuc.StateListAnimator.HJWChPQPAeHI;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                    if (nestedScrollView != null) {
                                                        i = C35399nuc.StateListAnimator.sanrWj;
                                                        C55018xby c55018xby = (C55018xby) ViewBindings.findChildViewById(view, i);
                                                        if (c55018xby != null) {
                                                            i = C35399nuc.StateListAnimator.sEAkxl;
                                                            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                                                            if (c55239xgG != null) {
                                                                i = C35399nuc.StateListAnimator.hPlhRW;
                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout4 != null) {
                                                                    i = C35399nuc.StateListAnimator.DsfknC;
                                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView3 != null) {
                                                                        i = C35399nuc.StateListAnimator.zlzhuY;
                                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView4 != null) {
                                                                            i = C35399nuc.StateListAnimator.getUriFromString;
                                                                            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                                            if (c55113xdn != null) {
                                                                                return new nJF(constraintLayout3, oKIMStateAwareFrameLayout, constraintLayout, constraintLayout2, linearLayout, c55173xeu, c55258xgZ, textView, constraintLayout3, frameLayout, c55001xbh, textView2, c52794wYp, nestedScrollView, c55018xby, c55239xgG, constraintLayout4, textView3, textView4, c55113xdn);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
