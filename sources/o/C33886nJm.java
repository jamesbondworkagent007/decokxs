package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.okinc.uilab.edit.OKEditText;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33886nJm implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55254xgV AYXKKw;
    public final C52794wYp AhwBna;
    public final TextInputLayout AkhnZx;
    public final android.view.View AuCTel;
    public final TextInputLayout DbNXlk;
    public final OKEditText EZpvd;
    public final OKEditText KWHzl;
    public final OKEditText OLrzqt;
    public final android.widget.ImageView copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.LinearLayout fARcdN;
    public final TextInputLayout fetchVPNInfo;
    public final C52794wYp gEmmrt;
    public final android.widget.TextView isConnected;
    public final ConstraintLayout valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C33886nJm(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull OKEditText oKEditText2, @androidx.annotation.NonNull OKEditText oKEditText3, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull TextInputLayout textInputLayout, @androidx.annotation.NonNull TextInputLayout textInputLayout2, @androidx.annotation.NonNull TextInputLayout textInputLayout3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.djBIcL = constraintLayout;
        this.copydefault = imageView;
        this.AEQbTJ = textView;
        this.OLrzqt = oKEditText;
        this.EZpvd = oKEditText2;
        this.KWHzl = oKEditText3;
        this.valueOf = constraintLayout2;
        this.AYXKKw = c55254xgV;
        this.gEmmrt = c52794wYp;
        this.AhwBna = c52794wYp2;
        this.AkhnZx = textInputLayout;
        this.DbNXlk = textInputLayout2;
        this.fetchVPNInfo = textInputLayout3;
        this.values = textView2;
        this.isConnected = textView3;
        this.AuCTel = view;
        this.fARcdN = linearLayout;
    }

    public static C33886nJm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.fZBcTu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C33886nJm OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.isConnected;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C35399nuc.StateListAnimator.aHXSQp;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C35399nuc.StateListAnimator.vLaW;
                OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
                if (oKEditText != null) {
                    i = C35399nuc.StateListAnimator.zDUObI;
                    OKEditText oKEditText2 = (OKEditText) ViewBindings.findChildViewById(view, i);
                    if (oKEditText2 != null) {
                        i = C35399nuc.StateListAnimator.zKcAg;
                        OKEditText oKEditText3 = (OKEditText) ViewBindings.findChildViewById(view, i);
                        if (oKEditText3 != null) {
                            i = C35399nuc.StateListAnimator.invokespecialaKhcqp;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C35399nuc.StateListAnimator.UJEglR;
                                C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                                if (c55254xgV != null) {
                                    i = C35399nuc.StateListAnimator.HJWChPOKBmQNaCIdOM;
                                    C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                    if (c52794wYp != null) {
                                        i = C35399nuc.StateListAnimator.QsIRgs;
                                        C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                        if (c52794wYp2 != null) {
                                            i = C35399nuc.StateListAnimator.OAjjVP;
                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                            if (textInputLayout != null) {
                                                i = C35399nuc.StateListAnimator.hpmliR;
                                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                if (textInputLayout2 != null) {
                                                    i = C35399nuc.StateListAnimator.aWuQzD;
                                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                    if (textInputLayout3 != null) {
                                                        i = C35399nuc.StateListAnimator.QzqeNH;
                                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView2 != null) {
                                                            i = C35399nuc.StateListAnimator.OeawrHOeawrH;
                                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.RgaQzq))) != null) {
                                                                i = C35399nuc.StateListAnimator.RAaltf;
                                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout != null) {
                                                                    return new C33886nJm((ConstraintLayout) view, imageView, textView, oKEditText, oKEditText2, oKEditText3, constraintLayout, c55254xgV, c52794wYp, c52794wYp2, textInputLayout, textInputLayout2, textInputLayout3, textView2, textView3, viewFindChildViewById, linearLayout);
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
