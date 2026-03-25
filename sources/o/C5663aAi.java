package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.uilab.edit.OKEditText;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5663aAi implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final C52794wYp EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.view.View OLrzqt;
    public final SimpleToolBar copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.LinearLayout fetchVPNInfo;
    public final OKEditText gEmmrt;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.LinearLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public C5663aAi(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull SimpleToolBar simpleToolBar, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout4, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout5) {
        this.valueOf = linearLayout;
        this.copydefault = simpleToolBar;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = imageView;
        this.KWHzl = linearLayout2;
        this.OLrzqt = view;
        this.AYXKKw = textView;
        this.gEmmrt = oKEditText;
        this.djBIcL = linearLayout3;
        this.AhwBna = textView2;
        this.AkhnZx = textView3;
        this.values = linearLayout4;
        this.DbNXlk = textView4;
        this.fetchVPNInfo = linearLayout5;
    }

    public static C5663aAi copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.iZzfmt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C5663aAi copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C8206ayP.StateListAnimator.AEQbTJ;
        SimpleToolBar simpleToolBar = (SimpleToolBar) ViewBindings.findChildViewById(view, i);
        if (simpleToolBar != null) {
            i = C8206ayP.StateListAnimator.QVAiDq;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C8206ayP.StateListAnimator.fvQaOB;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C8206ayP.StateListAnimator.giSNqX;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C8206ayP.StateListAnimator.DAIeex))) != null) {
                        i = C8206ayP.StateListAnimator.DCJXGO;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C8206ayP.StateListAnimator.QDqgQU;
                            OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
                            if (oKEditText != null) {
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view;
                                i = C8206ayP.StateListAnimator.zSsVtY;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C8206ayP.StateListAnimator.DPhTBN;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C8206ayP.StateListAnimator.fkESqH;
                                        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout3 != null) {
                                            i = C8206ayP.StateListAnimator.isReflectionWorking;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C8206ayP.StateListAnimator.invokespecialODCBUN;
                                                android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout4 != null) {
                                                    return new C5663aAi(linearLayout2, simpleToolBar, c52794wYp, imageView, linearLayout, viewFindChildViewById, textView, oKEditText, linearLayout2, textView2, textView3, linearLayout3, textView4, linearLayout4);
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
