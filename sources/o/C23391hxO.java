package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23391hxO implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final FragmentContainerView AYXKKw;
    public final Guideline AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.LinearLayout DbNXlk;
    public final C52794wYp EZpvd;
    public final AppCompatImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final AppCompatImageView djBIcL;
    public final android.widget.TextView ejfBZ;
    public final AppCompatImageView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.widget.LinearLayout fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final RecyclerView isConnected;
    public final AppCompatImageView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.DbNXlk;
    }

    public C23391hxO(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout4, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull AppCompatImageView appCompatImageView4) {
        this.DbNXlk = linearLayout;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = constraintLayout;
        this.KWHzl = appCompatImageView;
        this.OLrzqt = constraintLayout2;
        this.copydefault = linearLayout2;
        this.gEmmrt = linearLayout3;
        this.AYXKKw = fragmentContainerView;
        this.AhwBna = guideline;
        this.djBIcL = appCompatImageView2;
        this.valueOf = appCompatImageView3;
        this.isConnected = recyclerView;
        this.fetchVPNInfo = linearLayout4;
        this.values = textView;
        this.AkhnZx = textView2;
        this.ejfBZ = textView3;
        this.fJNWhG = textView4;
        this.fIwbmz = appCompatImageView4;
    }

    public static C23391hxO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C23391hxO OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.AwvSrB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23391hxO AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.QbewEr;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.fvQaOB;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C23274hvD.Application.accept;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C23274hvD.Application.QSLkRj;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = C23274hvD.Application.hlkKmr;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C23274hvD.Application.zhUgOk;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C23274hvD.Application.iOIMNp;
                                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                if (fragmentContainerView != null) {
                                    i = C23274hvD.Application.compare;
                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline != null) {
                                        i = C23274hvD.Application.addPreRequisiteCollector;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatImageView2 != null) {
                                            i = C23274hvD.Application.MediaSessionCompatMediaSessionImpl;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatImageView3 != null) {
                                                i = C23274hvD.Application.ComponentActivity;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView != null) {
                                                    i = C23274hvD.Application.OnBackPressedDispatcherApi33Impl;
                                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout3 != null) {
                                                        i = C23274hvD.Application.getCREATORannotations;
                                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView != null) {
                                                            i = C23274hvD.Application.getSubDecor;
                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                i = C23274hvD.Application.createSeekBar;
                                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView3 != null) {
                                                                    i = C23274hvD.Application.getProgress;
                                                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView4 != null) {
                                                                        i = C23274hvD.Application.getTitleOptionalHint;
                                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatImageView4 != null) {
                                                                            return new C23391hxO((android.widget.LinearLayout) view, c52794wYp, constraintLayout, appCompatImageView, constraintLayout2, linearLayout, linearLayout2, fragmentContainerView, guideline, appCompatImageView2, appCompatImageView3, recyclerView, linearLayout3, textView, textView2, textView3, textView4, appCompatImageView4);
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
