package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43958rzB implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final C55042xcV AYXKKw;
    public final C55230xfy AhwBna;
    public final android.widget.ImageView EZpvd;
    public final C42267rMn KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final LinearLayoutCompat djBIcL;
    public final android.widget.RelativeLayout fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.djBIcL;
    }

    public C43958rzB(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C42267rMn c42267rMn, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55042xcV c55042xcV, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout) {
        this.djBIcL = linearLayoutCompat;
        this.AEQbTJ = c55113xdn;
        this.KWHzl = c42267rMn;
        this.OLrzqt = textView;
        this.EZpvd = imageView;
        this.copydefault = constraintLayout;
        this.gEmmrt = textView2;
        this.valueOf = recyclerView;
        this.AhwBna = c55230xfy;
        this.AYXKKw = c55042xcV;
        this.fetchVPNInfo = relativeLayout;
    }

    public static C43958rzB copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.run, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C43958rzB KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C43662rtX.ActionBar.ORxRYg;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C43662rtX.ActionBar.QVAiDq;
            C42267rMn c42267rMn = (C42267rMn) ViewBindings.findChildViewById(view, i);
            if (c42267rMn != null) {
                i = C43662rtX.ActionBar.finit;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C43662rtX.ActionBar.dxcTrN;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C43662rtX.ActionBar.dvKsVJ;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = C43662rtX.ActionBar.fvQaOB;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C43662rtX.ActionBar.gasjUx;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C43662rtX.ActionBar.giSNqX;
                                    C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                                    if (c55230xfy != null) {
                                        i = C43662rtX.ActionBar.DQzvGNdrmXxu;
                                        C55042xcV c55042xcV = (C55042xcV) ViewBindings.findChildViewById(view, i);
                                        if (c55042xcV != null) {
                                            i = C43662rtX.ActionBar.deregisterUser;
                                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout != null) {
                                                return new C43958rzB((LinearLayoutCompat) view, c55113xdn, c42267rMn, textView, imageView, constraintLayout, textView2, recyclerView, c55230xfy, c55042xcV, relativeLayout);
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
