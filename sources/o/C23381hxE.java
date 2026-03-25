package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.business.dexui.main.swap.history.detail.widget.OrderInstructionView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23381hxE implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final C52794wYp AYXKKw;
    public final NestedScrollView AhwBna;
    public final hXK EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final ConstraintLayout djBIcL;
    public final OrderInstructionView gEmmrt;
    public final C22093hXq valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C23381hxE(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull hXK hxk, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C22093hXq c22093hXq, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull OrderInstructionView orderInstructionView) {
        this.djBIcL = constraintLayout;
        this.EZpvd = hxk;
        this.OLrzqt = frameLayout;
        this.AEQbTJ = c55173xeu;
        this.copydefault = frameLayout2;
        this.KWHzl = frameLayout3;
        this.AYXKKw = c52794wYp;
        this.valueOf = c22093hXq;
        this.AhwBna = nestedScrollView;
        this.gEmmrt = orderInstructionView;
    }

    public static C23381hxE OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C23381hxE EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.AubY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23381hxE AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fFgQHt;
        hXK hxk = (hXK) ViewBindings.findChildViewById(view, i);
        if (hxk != null) {
            i = C23274hvD.Application.XW;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C23274hvD.Application.OxbLUn;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C23274hvD.Application.setProfilesSinceInitCount;
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        i = C23274hvD.Application.getCallingPackage;
                        android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout3 != null) {
                            i = C23274hvD.Application.MediaSessionCompatMediaSessionImplBaseMediaSessionStub;
                            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                            if (c52794wYp != null) {
                                i = C23274hvD.Application.readGroup;
                                C22093hXq c22093hXq = (C22093hXq) ViewBindings.findChildViewById(view, i);
                                if (c22093hXq != null) {
                                    i = C23274hvD.Application.setItem;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (nestedScrollView != null) {
                                        i = C23274hvD.Application.getMenuInfo;
                                        OrderInstructionView orderInstructionView = (OrderInstructionView) ViewBindings.findChildViewById(view, i);
                                        if (orderInstructionView != null) {
                                            return new C23381hxE((ConstraintLayout) view, hxk, frameLayout, c55173xeu, frameLayout2, frameLayout3, c52794wYp, c22093hXq, nestedScrollView, orderInstructionView);
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
