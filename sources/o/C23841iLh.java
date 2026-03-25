package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iLh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23841iLh implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final RecyclerView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final NestedScrollView DbNXlk;
    public final ConstraintLayout EZpvd;
    public final C27386juH KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final C55258xgZ fetchVPNInfo;
    public final android.widget.FrameLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final C55113xdn valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.gEmmrt;
    }

    public C23841iLh(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C27386juH c27386juH, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.gEmmrt = frameLayout;
        this.KWHzl = c27386juH;
        this.OLrzqt = frameLayout2;
        this.EZpvd = constraintLayout;
        this.copydefault = view;
        this.AEQbTJ = c55173xeu;
        this.valueOf = c55113xdn;
        this.djBIcL = linearLayout;
        this.AYXKKw = linearLayout2;
        this.AhwBna = linearLayoutCompat;
        this.AkhnZx = recyclerView;
        this.DbNXlk = nestedScrollView;
        this.values = textView;
        this.fetchVPNInfo = c55258xgZ;
        this.isConnected = textView2;
        this.fARcdN = textView3;
        this.AuCTel = textView4;
        this.ejfBZ = textView5;
    }

    public static C23841iLh copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C23841iLh copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.DrqXHJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23841iLh AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C25493ixk.ActionBar.fZBcTu;
        C27386juH c27386juH = (C27386juH) ViewBindings.findChildViewById(view, i);
        if (c27386juH != null) {
            i = C25493ixk.ActionBar.dxcTrN;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C25493ixk.ActionBar.TarCU;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.DGUQLIdZmdUa))) != null) {
                    i = C25493ixk.ActionBar.DLGVGj;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = C25493ixk.ActionBar.invokespecialDaTmkG;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C25493ixk.ActionBar.OStAOF;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C25493ixk.ActionBar.GiPPlL;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C25493ixk.ActionBar.config;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat != null) {
                                        i = C25493ixk.ActionBar.DDjgSw;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            i = C25493ixk.ActionBar.DkGEDn;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView != null) {
                                                i = C25493ixk.ActionBar.zNQIcI;
                                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null) {
                                                    i = C25493ixk.ActionBar.hQkvHM;
                                                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                                    if (c55258xgZ != null) {
                                                        i = C25493ixk.ActionBar.onRelationshipValidationResult;
                                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView2 != null) {
                                                            i = C25493ixk.ActionBar.extraCallbackWithResult;
                                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView3 != null) {
                                                                i = C25493ixk.ActionBar.ITrustedWebActivityCallback;
                                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView4 != null) {
                                                                    i = C25493ixk.ActionBar.onExtraCallback;
                                                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView5 != null) {
                                                                        return new C23841iLh((android.widget.FrameLayout) view, c27386juH, frameLayout, constraintLayout, viewFindChildViewById, c55173xeu, c55113xdn, linearLayout, linearLayout2, linearLayoutCompat, recyclerView, nestedScrollView, textView, c55258xgZ, textView2, textView3, textView4, textView5);
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
