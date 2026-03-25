package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.market.widget.FlowedChipsView;
import o.qZH;

/* JADX INFO: renamed from: o.rdC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42793rdC implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55258xgZ AYXKKw;
    public final C55258xgZ AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55173xeu OLrzqt;
    public final C55113xdn copydefault;
    public final jHY djBIcL;
    public final FlowedChipsView gEmmrt;
    public final ConstraintLayout valueOf;
    public final C25955jMo values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C42793rdC(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull jHY jhy, @androidx.annotation.NonNull C55258xgZ c55258xgZ2, @androidx.annotation.NonNull FlowedChipsView flowedChipsView, @androidx.annotation.NonNull C25955jMo c25955jMo) {
        this.valueOf = constraintLayout;
        this.EZpvd = linearLayout;
        this.KWHzl = textView;
        this.AEQbTJ = linearLayout2;
        this.OLrzqt = c55173xeu;
        this.copydefault = c55113xdn;
        this.AYXKKw = c55258xgZ;
        this.djBIcL = jhy;
        this.AhwBna = c55258xgZ2;
        this.gEmmrt = flowedChipsView;
        this.values = c25955jMo;
    }

    public static C42793rdC copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.dvImUD;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = qZH.StateListAnimator.DTg;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = qZH.StateListAnimator.getPriority;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = qZH.StateListAnimator.fkESqH;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = qZH.StateListAnimator.pXZxY;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = qZH.StateListAnimator.HJWChPfvRMlC;
                            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                            if (c55258xgZ != null) {
                                i = qZH.StateListAnimator.gLWkOL;
                                jHY jhy = (jHY) ViewBindings.findChildViewById(view, i);
                                if (jhy != null) {
                                    i = qZH.StateListAnimator.hfeTOA;
                                    C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                    if (c55258xgZ2 != null) {
                                        i = qZH.StateListAnimator.QSusPL;
                                        FlowedChipsView flowedChipsView = (FlowedChipsView) ViewBindings.findChildViewById(view, i);
                                        if (flowedChipsView != null) {
                                            i = qZH.StateListAnimator.sFt;
                                            C25955jMo c25955jMo = (C25955jMo) ViewBindings.findChildViewById(view, i);
                                            if (c25955jMo != null) {
                                                return new C42793rdC((ConstraintLayout) view, linearLayout, textView, linearLayout2, c55173xeu, c55113xdn, c55258xgZ, jhy, c55258xgZ2, flowedChipsView, c25955jMo);
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
