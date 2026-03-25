package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.market.widget.FlowedChipsView;
import o.qZH;

/* JADX INFO: renamed from: o.rbs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42729rbs implements ViewBinding {
    public final Group AEQbTJ;
    public final C55249xgQ AYXKKw;
    public final C34888nku AhwBna;
    public final C55071xcy AkhnZx;
    public final AppCompatImageView EZpvd;
    public final Group KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C55173xeu copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final FlowedChipsView gEmmrt;
    public final android.widget.TextView isConnected;
    public final ConstraintLayout valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C42729rbs(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C34888nku c34888nku, @androidx.annotation.NonNull FlowedChipsView flowedChipsView, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull C55071xcy c55071xcy, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.valueOf = constraintLayout;
        this.copydefault = c55173xeu;
        this.AEQbTJ = group;
        this.KWHzl = group2;
        this.OLrzqt = imageView;
        this.EZpvd = appCompatImageView;
        this.AhwBna = c34888nku;
        this.gEmmrt = flowedChipsView;
        this.AYXKKw = c55249xgQ;
        this.djBIcL = textView;
        this.isConnected = textView2;
        this.fetchVPNInfo = textView3;
        this.AkhnZx = c55071xcy;
        this.values = textView4;
    }

    public static C42729rbs KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.Swccd;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = qZH.StateListAnimator.RuDPQV;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = qZH.StateListAnimator.dPnHjp;
                Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                if (group2 != null) {
                    i = qZH.StateListAnimator.DwQSDd;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = qZH.StateListAnimator.ExKek;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = qZH.StateListAnimator.sYcwUD;
                            C34888nku c34888nku = (C34888nku) ViewBindings.findChildViewById(view, i);
                            if (c34888nku != null) {
                                i = qZH.StateListAnimator.OFqMGB;
                                FlowedChipsView flowedChipsView = (FlowedChipsView) ViewBindings.findChildViewById(view, i);
                                if (flowedChipsView != null) {
                                    i = qZH.StateListAnimator.zEkrwr;
                                    C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                                    if (c55249xgQ != null) {
                                        i = qZH.StateListAnimator.fObYrO;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = qZH.StateListAnimator.DLl;
                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = qZH.StateListAnimator.DYICSh;
                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    i = qZH.StateListAnimator.sSi;
                                                    C55071xcy c55071xcy = (C55071xcy) ViewBindings.findChildViewById(view, i);
                                                    if (c55071xcy != null) {
                                                        i = qZH.StateListAnimator.getNotifyChildrenChangedOptions;
                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            return new C42729rbs((ConstraintLayout) view, c55173xeu, group, group2, imageView, appCompatImageView, c34888nku, flowedChipsView, c55249xgQ, textView, textView2, textView3, c55071xcy, textView4);
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
