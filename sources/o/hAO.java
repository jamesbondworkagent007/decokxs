package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hAO implements ViewBinding {
    public final C29037kmA AEQbTJ;
    public final C29055kmS AYXKKw;
    public final NestedScrollView AhwBna;
    public final C29044kmH AkhnZx;
    public final C29053kmQ AuCTel;
    public final C29068kmf DbNXlk;
    public final C55173xeu EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C55113xdn OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final C33603mza djBIcL;
    public final C29060kmX ejfBZ;
    public final C29057kmU fIwbmz;
    public final C29069kmg fetchVPNInfo;
    public final C33546myW gEmmrt;
    public final C29049kmM isConnected;
    public final ConstraintLayout valueOf;
    public final C29086kmx values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public hAO(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C29037kmA c29037kmA, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C29055kmS c29055kmS, @androidx.annotation.NonNull C29068kmf c29068kmf, @androidx.annotation.NonNull C29069kmg c29069kmg, @androidx.annotation.NonNull C29086kmx c29086kmx, @androidx.annotation.NonNull C29044kmH c29044kmH, @androidx.annotation.NonNull C29049kmM c29049kmM, @androidx.annotation.NonNull C29053kmQ c29053kmQ, @androidx.annotation.NonNull C29057kmU c29057kmU, @androidx.annotation.NonNull C29060kmX c29060kmX) {
        this.valueOf = constraintLayout;
        this.EZpvd = c55173xeu;
        this.KWHzl = frameLayout;
        this.copydefault = linearLayoutCompat;
        this.OLrzqt = c55113xdn;
        this.AEQbTJ = c29037kmA;
        this.AhwBna = nestedScrollView;
        this.djBIcL = c33603mza;
        this.gEmmrt = c33546myW;
        this.AYXKKw = c29055kmS;
        this.DbNXlk = c29068kmf;
        this.fetchVPNInfo = c29069kmg;
        this.values = c29086kmx;
        this.AkhnZx = c29044kmH;
        this.isConnected = c29049kmM;
        this.AuCTel = c29053kmQ;
        this.fIwbmz = c29057kmU;
        this.ejfBZ = c29060kmX;
    }

    public static hAO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DGUQLIDGUQLI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hAO OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.sZqaRl;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C23274hvD.Application.hPlhRW;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C23274hvD.Application.MediaControllerCompatTransportControls;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        i = C23274hvD.Application.onPrepare;
                        C29037kmA c29037kmA = (C29037kmA) ViewBindings.findChildViewById(view, i);
                        if (c29037kmA != null) {
                            i = C23274hvD.Application.fromBundle;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = C23274hvD.Application.lambdanew0;
                                C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                if (c33603mza != null) {
                                    i = C23274hvD.Application.launch;
                                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                    if (c33546myW != null) {
                                        i = C23274hvD.Application.ActionMenuItemViewActionMenuItemForwardingListener;
                                        C29055kmS c29055kmS = (C29055kmS) ViewBindings.findChildViewById(view, i);
                                        if (c29055kmS != null) {
                                            i = C23274hvD.Application.ActionMenuItemViewPopupCallback;
                                            C29068kmf c29068kmf = (C29068kmf) ViewBindings.findChildViewById(view, i);
                                            if (c29068kmf != null) {
                                                i = C23274hvD.Application.showsIcon;
                                                C29069kmg c29069kmg = (C29069kmg) ViewBindings.findChildViewById(view, i);
                                                if (c29069kmg != null) {
                                                    i = C23274hvD.Application.addItemView;
                                                    C29086kmx c29086kmx = (C29086kmx) ViewBindings.findChildViewById(view, i);
                                                    if (c29086kmx != null) {
                                                        i = C23274hvD.Application.createItemView;
                                                        C29044kmH c29044kmH = (C29044kmH) ViewBindings.findChildViewById(view, i);
                                                        if (c29044kmH != null) {
                                                            i = C23274hvD.Application.BaseMenuPresenter;
                                                            C29049kmM c29049kmM = (C29049kmM) ViewBindings.findChildViewById(view, i);
                                                            if (c29049kmM != null) {
                                                                i = C23274hvD.Application.bindItemView;
                                                                C29053kmQ c29053kmQ = (C29053kmQ) ViewBindings.findChildViewById(view, i);
                                                                if (c29053kmQ != null) {
                                                                    i = C23274hvD.Application.internalRemoveGroup;
                                                                    C29057kmU c29057kmU = (C29057kmU) ViewBindings.findChildViewById(view, i);
                                                                    if (c29057kmU != null) {
                                                                        i = C23274hvD.Application.findMenuItemForSubmenu;
                                                                        C29060kmX c29060kmX = (C29060kmX) ViewBindings.findChildViewById(view, i);
                                                                        if (c29060kmX != null) {
                                                                            return new hAO((ConstraintLayout) view, c55173xeu, frameLayout, linearLayoutCompat, c55113xdn, c29037kmA, nestedScrollView, c33603mza, c33546myW, c29055kmS, c29068kmf, c29069kmg, c29086kmx, c29044kmH, c29049kmM, c29053kmQ, c29057kmU, c29060kmX);
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
