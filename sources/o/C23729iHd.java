package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23729iHd implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final C27439jvH AhwBna;
    public final C27212jqt AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final C55251xgS KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C27212jqt copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final C55251xgS isConnected;
    public final LinearLayoutCompat valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C23729iHd(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27212jqt c27212jqt, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat5, @androidx.annotation.NonNull C27439jvH c27439jvH, @androidx.annotation.NonNull C27212jqt c27212jqt2, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.djBIcL = constraintLayout;
        this.copydefault = c27212jqt;
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = linearLayoutCompat2;
        this.KWHzl = c55251xgS;
        this.EZpvd = imageView;
        this.gEmmrt = linearLayoutCompat3;
        this.AYXKKw = linearLayoutCompat4;
        this.valueOf = linearLayoutCompat5;
        this.AhwBna = c27439jvH;
        this.AkhnZx = c27212jqt2;
        this.isConnected = c55251xgS2;
        this.DbNXlk = textView;
        this.values = textView2;
        this.fetchVPNInfo = textView3;
        this.fJNWhG = textView4;
        this.fIwbmz = textView5;
    }

    public static C23729iHd copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.isConnected, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23729iHd copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.QKVWgx;
        C27212jqt c27212jqt = (C27212jqt) ViewBindings.findChildViewById(view, i);
        if (c27212jqt != null) {
            i = C25493ixk.ActionBar.FQMcgEfQMcgE;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C25493ixk.ActionBar.zDGrpR;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    i = C25493ixk.ActionBar.fTEjYi;
                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS != null) {
                        i = C25493ixk.ActionBar.GGlJim;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C25493ixk.ActionBar.iLWfRf;
                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat3 != null) {
                                i = C25493ixk.ActionBar.OEsIKP;
                                LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat4 != null) {
                                    i = C25493ixk.ActionBar.aChkwz;
                                    LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat5 != null) {
                                        i = C25493ixk.ActionBar.isScanInProgress;
                                        C27439jvH c27439jvH = (C27439jvH) ViewBindings.findChildViewById(view, i);
                                        if (c27439jvH != null) {
                                            i = C25493ixk.ActionBar.UPbYzn;
                                            C27212jqt c27212jqt2 = (C27212jqt) ViewBindings.findChildViewById(view, i);
                                            if (c27212jqt2 != null) {
                                                i = C25493ixk.ActionBar.rsEnD;
                                                C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                if (c55251xgS2 != null) {
                                                    i = C25493ixk.ActionBar.cancelNotification;
                                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView != null) {
                                                        i = C25493ixk.ActionBar.onConnectionSuspended;
                                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView2 != null) {
                                                            i = C25493ixk.ActionBar.setInternalConnectionCallback;
                                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView3 != null) {
                                                                i = C25493ixk.ActionBar.MediaBrowserCompatCustomActionCallback;
                                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView4 != null) {
                                                                    i = C25493ixk.ActionBar.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
                                                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView5 != null) {
                                                                        return new C23729iHd((ConstraintLayout) view, c27212jqt, linearLayoutCompat, linearLayoutCompat2, c55251xgS, imageView, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, c27439jvH, c27212jqt2, c55251xgS2, textView, textView2, textView3, textView4, textView5);
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
