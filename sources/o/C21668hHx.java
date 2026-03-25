package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21668hHx implements ViewBinding {
    public final C30800lhw AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C30756lhE AhwBna;
    public final android.widget.ImageView AkhnZx;
    public final C30755lhD DbNXlk;
    public final C30757lhF EZpvd;
    public final android.widget.TextView KWHzl;
    public final C30567ldb OLrzqt;
    public final android.widget.ImageView copydefault;
    public final C30795lhr djBIcL;
    public final LinearLayoutCompat ejfBZ;
    public final ConstraintLayout fetchVPNInfo;
    public final C30753lhB gEmmrt;
    public final android.widget.ImageView isConnected;
    public final C31225lpx valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.ejfBZ;
    }

    public C21668hHx(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C30567ldb c30567ldb, @androidx.annotation.NonNull C30800lhw c30800lhw, @androidx.annotation.NonNull C30757lhF c30757lhF, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C30795lhr c30795lhr, @androidx.annotation.NonNull C30756lhE c30756lhE, @androidx.annotation.NonNull C30753lhB c30753lhB, @androidx.annotation.NonNull C31225lpx c31225lpx, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C30755lhD c30755lhD, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3) {
        this.ejfBZ = linearLayoutCompat;
        this.OLrzqt = c30567ldb;
        this.AEQbTJ = c30800lhw;
        this.EZpvd = c30757lhF;
        this.KWHzl = textView;
        this.copydefault = imageView;
        this.AYXKKw = textView2;
        this.djBIcL = c30795lhr;
        this.AhwBna = c30756lhE;
        this.gEmmrt = c30753lhB;
        this.valueOf = c31225lpx;
        this.fetchVPNInfo = constraintLayout;
        this.values = constraintLayout2;
        this.DbNXlk = c30755lhD;
        this.isConnected = imageView2;
        this.AkhnZx = imageView3;
    }

    public static C21668hHx copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zbGDDc, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21668hHx copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.zsXlph;
        C30567ldb c30567ldb = (C30567ldb) ViewBindings.findChildViewById(view, i);
        if (c30567ldb != null) {
            i = C23274hvD.Application.AxsJAY;
            C30800lhw c30800lhw = (C30800lhw) ViewBindings.findChildViewById(view, i);
            if (c30800lhw != null) {
                i = C23274hvD.Application.zuBGHE;
                C30757lhF c30757lhF = (C30757lhF) ViewBindings.findChildViewById(view, i);
                if (c30757lhF != null) {
                    i = C23274hvD.Application.gHZMYf;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C23274hvD.Application.AwvSrB;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C23274hvD.Application.ORxRYg;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C23274hvD.Application.QKVWgx;
                                C30795lhr c30795lhr = (C30795lhr) ViewBindings.findChildViewById(view, i);
                                if (c30795lhr != null) {
                                    i = C23274hvD.Application.OcIXYQ;
                                    C30756lhE c30756lhE = (C30756lhE) ViewBindings.findChildViewById(view, i);
                                    if (c30756lhE != null) {
                                        i = C23274hvD.Application.QUSxYX;
                                        C30753lhB c30753lhB = (C30753lhB) ViewBindings.findChildViewById(view, i);
                                        if (c30753lhB != null) {
                                            i = C23274hvD.Application.QfsBiF;
                                            C31225lpx c31225lpx = (C31225lpx) ViewBindings.findChildViewById(view, i);
                                            if (c31225lpx != null) {
                                                i = C23274hvD.Application.fromParcel;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    i = C23274hvD.Application.setMediaUri;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout2 != null) {
                                                        i = C23274hvD.Application.getBitmap;
                                                        C30755lhD c30755lhD = (C30755lhD) ViewBindings.findChildViewById(view, i);
                                                        if (c30755lhD != null) {
                                                            i = C23274hvD.Application.MediaSessionCompatResultReceiverWrapper1;
                                                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView2 != null) {
                                                                i = C23274hvD.Application.getAction;
                                                                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView3 != null) {
                                                                    return new C21668hHx((LinearLayoutCompat) view, c30567ldb, c30800lhw, c30757lhF, textView, imageView, textView2, c30795lhr, c30756lhE, c30753lhB, c31225lpx, constraintLayout, constraintLayout2, c30755lhD, imageView2, imageView3);
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
