package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hAS implements ViewBinding {
    public final C36250oUv AEQbTJ;
    public final C55173xeu AYXKKw;
    public final AppCompatImageView AhwBna;
    public final C55113xdn AkhnZx;
    public final android.widget.RelativeLayout EZpvd;
    public final C21970hTb KWHzl;
    public final android.view.View OLrzqt;
    public final pGX copydefault;
    public final AppCompatImageView djBIcL;
    public final Group gEmmrt;
    public final ConstraintLayout isConnected;
    public final pGY valueOf;
    public final android.widget.LinearLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.isConnected;
    }

    public hAS(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C21970hTb c21970hTb, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C36250oUv c36250oUv, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull pGX pgx, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull pGY pgy, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.isConnected = constraintLayout;
        this.KWHzl = c21970hTb;
        this.OLrzqt = view;
        this.AEQbTJ = c36250oUv;
        this.EZpvd = relativeLayout;
        this.copydefault = pgx;
        this.AYXKKw = c55173xeu;
        this.gEmmrt = group;
        this.valueOf = pgy;
        this.AhwBna = appCompatImageView;
        this.djBIcL = appCompatImageView2;
        this.values = linearLayout;
        this.AkhnZx = c55113xdn;
    }

    public static hAS AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DGUQLIOvDItG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hAS KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.DcMfJK;
        C21970hTb c21970hTb = (C21970hTb) ViewBindings.findChildViewById(view, i);
        if (c21970hTb != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.RkASWs))) != null) {
            i = C23274hvD.Application.RbVjfb;
            C36250oUv c36250oUv = (C36250oUv) ViewBindings.findChildViewById(view, i);
            if (c36250oUv != null) {
                i = C23274hvD.Application.DuXjdv;
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = C23274hvD.Application.GFUIi;
                    pGX pgx = (pGX) ViewBindings.findChildViewById(view, i);
                    if (pgx != null) {
                        i = C23274hvD.Application.aappFQ;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C23274hvD.Application.gCiISl;
                            Group group = (Group) ViewBindings.findChildViewById(view, i);
                            if (group != null) {
                                i = C23274hvD.Application.DdI;
                                pGY pgy = (pGY) ViewBindings.findChildViewById(view, i);
                                if (pgy != null) {
                                    i = C23274hvD.Application.setDefaultImpl;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatImageView != null) {
                                        i = C23274hvD.Application.onProgressUpdate;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatImageView2 != null) {
                                            i = C23274hvD.Application.onPlay;
                                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = C23274hvD.Application.applyIconTint;
                                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                if (c55113xdn != null) {
                                                    return new hAS((ConstraintLayout) view, c21970hTb, viewFindChildViewById, c36250oUv, relativeLayout, pgx, c55173xeu, group, pgy, appCompatImageView, appCompatImageView2, linearLayout, c55113xdn);
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
