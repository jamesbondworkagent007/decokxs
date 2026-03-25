package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.business.dexui.main.swap.history.detail.widget.OrderInstructionView;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23377hxA implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final C52794wYp AYXKKw;
    public final android.view.View AhwBna;
    public final OKAlertBanner AkhnZx;
    public final OrderInstructionView AuCTel;
    public final NestedScrollView DbNXlk;
    public final LinearLayoutCompat EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C22313hcx OLrzqt;
    public final hXK copydefault;
    public final hMY djBIcL;
    public final C21808hNb ejfBZ;
    public final C52794wYp fARcdN;
    public final C21808hNb fJNWhG;
    public final ConstraintLayout fetchVPNInfo;
    public final android.widget.FrameLayout gEmmrt;
    public final C52794wYp isConnected;
    public final hMU valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.fetchVPNInfo;
    }

    public C23377hxA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull hXK hxk, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C22313hcx c22313hcx, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull hMU hmu, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull hMY hmy, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull C21808hNb c21808hNb, @androidx.annotation.NonNull OrderInstructionView orderInstructionView, @androidx.annotation.NonNull C52794wYp c52794wYp3, @androidx.annotation.NonNull C21808hNb c21808hNb2) {
        this.fetchVPNInfo = constraintLayout;
        this.copydefault = hxk;
        this.KWHzl = frameLayout;
        this.EZpvd = linearLayoutCompat;
        this.OLrzqt = c22313hcx;
        this.AEQbTJ = c55173xeu;
        this.valueOf = hmu;
        this.AhwBna = view;
        this.gEmmrt = frameLayout2;
        this.djBIcL = hmy;
        this.AYXKKw = c52794wYp;
        this.AkhnZx = oKAlertBanner;
        this.values = appCompatTextView;
        this.DbNXlk = nestedScrollView;
        this.isConnected = c52794wYp2;
        this.fJNWhG = c21808hNb;
        this.AuCTel = orderInstructionView;
        this.fARcdN = c52794wYp3;
        this.ejfBZ = c21808hNb2;
    }

    public static C23377hxA KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static C23377hxA AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.hDKMBd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23377hxA copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.fFgQHt;
        hXK hxk = (hXK) ViewBindings.findChildViewById(view, i);
        if (hxk != null) {
            i = C23274hvD.Application.svY;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C23274hvD.Application.XW;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C23274hvD.Application.iLWfRf;
                    C22313hcx c22313hcx = (C22313hcx) ViewBindings.findChildViewById(view, i);
                    if (c22313hcx != null) {
                        i = C23274hvD.Application.OxbLUn;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C23274hvD.Application.iqeXgQ;
                            hMU hmu = (hMU) ViewBindings.findChildViewById(view, i);
                            if (hmu != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.MediaMetadataCompatBuilder))) != null) {
                                i = C23274hvD.Application.getCallingPackage;
                                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout2 != null) {
                                    i = C23274hvD.Application.MediaSessionCompat3;
                                    hMY hmy = (hMY) ViewBindings.findChildViewById(view, i);
                                    if (hmy != null) {
                                        i = C23274hvD.Application.MediaSessionCompatMediaSessionImplBaseMediaSessionStub;
                                        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                        if (c52794wYp != null) {
                                            i = C23274hvD.Application.getQueueItem;
                                            OKAlertBanner oKAlertBanner = (OKAlertBanner) ViewBindings.findChildViewById(view, i);
                                            if (oKAlertBanner != null) {
                                                i = C23274hvD.Application.lambdanew2;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView != null) {
                                                    i = C23274hvD.Application.accessgetOnBackPressedCallbacksp;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                    if (nestedScrollView != null) {
                                                        i = C23274hvD.Application.onAnimationsEnded;
                                                        C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                                        if (c52794wYp2 != null) {
                                                            i = C23274hvD.Application.onAttachedToWindow;
                                                            C21808hNb c21808hNb = (C21808hNb) ViewBindings.findChildViewById(view, i);
                                                            if (c21808hNb != null) {
                                                                i = C23274hvD.Application.getMenuInfo;
                                                                OrderInstructionView orderInstructionView = (OrderInstructionView) ViewBindings.findChildViewById(view, i);
                                                                if (orderInstructionView != null) {
                                                                    i = C23274hvD.Application.getTooltipText;
                                                                    C52794wYp c52794wYp3 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                                                    if (c52794wYp3 != null) {
                                                                        i = C23274hvD.Application.setIconTintList;
                                                                        C21808hNb c21808hNb2 = (C21808hNb) ViewBindings.findChildViewById(view, i);
                                                                        if (c21808hNb2 != null) {
                                                                            return new C23377hxA((ConstraintLayout) view, hxk, frameLayout, linearLayoutCompat, c22313hcx, c55173xeu, hmu, viewFindChildViewById, frameLayout2, hmy, c52794wYp, oKAlertBanner, appCompatTextView, nestedScrollView, c52794wYp2, c21808hNb, orderInstructionView, c52794wYp3, c21808hNb2);
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
