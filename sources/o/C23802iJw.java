package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iJw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23802iJw implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final C27212jqt EZpvd;
    public final wYC KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C27291jsS copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.gEmmrt;
    }

    public C23802iJw(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C27212jqt c27212jqt, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27291jsS c27291jsS, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.gEmmrt = linearLayoutCompat;
        this.EZpvd = c27212jqt;
        this.KWHzl = wyc;
        this.AEQbTJ = linearLayoutCompat2;
        this.OLrzqt = constraintLayout;
        this.copydefault = c27291jsS;
        this.AhwBna = linearLayoutCompat3;
        this.valueOf = textView;
        this.AYXKKw = textView2;
        this.djBIcL = textView3;
        this.fetchVPNInfo = textView4;
        this.values = textView5;
    }

    public static C23802iJw KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.DCUTEIdCUTEI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23802iJw OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.QKVWgx;
        C27212jqt c27212jqt = (C27212jqt) ViewBindings.findChildViewById(view, i);
        if (c27212jqt != null) {
            i = C25493ixk.ActionBar.GFUIi;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C25493ixk.ActionBar.iLWfRf;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C25493ixk.ActionBar.hPlhRW;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C25493ixk.ActionBar.zlzhuY;
                        C27291jsS c27291jsS = (C27291jsS) ViewBindings.findChildViewById(view, i);
                        if (c27291jsS != null) {
                            i = C25493ixk.ActionBar.aChkwz;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = C25493ixk.ActionBar.onConnectionSuspended;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C25493ixk.ActionBar.MediaBrowserCompatCustomActionCallback;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C25493ixk.ActionBar.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = C25493ixk.ActionBar.GVpNrs;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C25493ixk.ActionBar.newInstance;
                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    return new C23802iJw((LinearLayoutCompat) view, c27212jqt, wyc, linearLayoutCompat, constraintLayout, c27291jsS, linearLayoutCompat2, textView, textView2, textView3, textView4, textView5);
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
