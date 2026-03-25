package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43960rzD implements ViewBinding {
    public final C42513rVq AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final ConstraintLayout DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final C55251xgS KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.LinearLayout fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.view.View isConnected;
    public final android.widget.TextView valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.values;
    }

    public C43960rzD(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C42513rVq c42513rVq, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.values = constraintLayout;
        this.copydefault = imageView;
        this.KWHzl = c55251xgS;
        this.AEQbTJ = c42513rVq;
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = imageView2;
        this.AYXKKw = constraintLayout2;
        this.valueOf = textView;
        this.gEmmrt = imageView3;
        this.djBIcL = textView2;
        this.AhwBna = textView3;
        this.DbNXlk = constraintLayout3;
        this.isConnected = view;
        this.fetchVPNInfo = linearLayout;
        this.AkhnZx = textView4;
        this.ejfBZ = textView5;
    }

    public static C43960rzD AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.DCUTEIdCUTEI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C43960rzD OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C43662rtX.ActionBar.QUSxYX;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C43662rtX.ActionBar.RJOkX;
            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
            if (c55251xgS != null) {
                i = C43662rtX.ActionBar.QbewEr;
                C42513rVq c42513rVq = (C42513rVq) ViewBindings.findChildViewById(view, i);
                if (c42513rVq != null) {
                    i = C43662rtX.ActionBar.RcXXUw;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C43662rtX.ActionBar.djSkpj;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C43662rtX.ActionBar.UeEOUB;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C43662rtX.ActionBar.dNCPSb;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C43662rtX.ActionBar.fFgQHt;
                                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView3 != null) {
                                        i = C43662rtX.ActionBar.fZBcTu;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = C43662rtX.ActionBar.flVtFt;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                i = C43662rtX.ActionBar.DLGVGj;
                                                android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
                                                if (viewFindChildViewById != null) {
                                                    i = C43662rtX.ActionBar.aJZHYI;
                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout != null) {
                                                        i = C43662rtX.ActionBar.DcMfJKDSqxTE;
                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            i = C43662rtX.ActionBar.jh;
                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                return new C43960rzD(constraintLayout2, imageView, c55251xgS, c42513rVq, linearLayoutCompat, imageView2, constraintLayout, textView, imageView3, textView2, textView3, constraintLayout2, viewFindChildViewById, linearLayout, textView4, textView5);
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
