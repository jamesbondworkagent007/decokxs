package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C48452uRy implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.view.View EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C51971vxA copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C48452uRy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C51971vxA c51971vxA, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = c52794wYp;
        this.KWHzl = textView;
        this.EZpvd = view;
        this.copydefault = c51971vxA;
        this.AYXKKw = textView2;
        this.valueOf = textView3;
        this.gEmmrt = textView4;
        this.AhwBna = textView5;
        this.djBIcL = textView6;
        this.values = textView7;
        this.AkhnZx = textView8;
    }

    public static C48452uRy OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DIIpTV, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C48452uRy KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C48033uCm.Application.getUserContextRegisteredStatus;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C48033uCm.Application.sFt;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.getFlags))) != null) {
                i = C48033uCm.Application.LocalFullyDrawnReporterOwner;
                C51971vxA c51971vxA = (C51971vxA) ViewBindings.findChildViewById(view, i);
                if (c51971vxA != null) {
                    i = C48033uCm.Application.ActivityResultContractsTakePicture;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C48033uCm.Application.allOf;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C48033uCm.Application.VisibleForTesting;
                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = C48033uCm.Application.createSpinner;
                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = C48033uCm.Application.flush;
                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        i = C48033uCm.Application.ToolbarActionBarMenuBuilderCallback;
                                        android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView7 != null) {
                                            i = C48033uCm.Application.setEnterFadeDuration;
                                            android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView8 != null) {
                                                return new C48452uRy((ConstraintLayout) view, c52794wYp, textView, viewFindChildViewById, c51971vxA, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
