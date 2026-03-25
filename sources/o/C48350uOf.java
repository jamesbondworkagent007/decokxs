package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uOf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48350uOf implements ViewBinding {
    public final NestedScrollView AEQbTJ;
    public final RecyclerView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final ConstraintLayout AkhnZx;
    public final vTL AuCTel;
    public final android.widget.TextView DbNXlk;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final Flow OLrzqt;
    public final wYK copydefault;
    public final android.widget.TextView djBIcL;
    public final C55251xgS ejfBZ;
    public final C55251xgS fARcdN;
    public final C55251xgS fIwbmz;
    public final C55251xgS fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final C55251xgS gEmmrt;
    public final C55251xgS getFieldNames;
    public final C55251xgS hDKMBd;
    public final C55251xgS isConnected;
    public final C55251xgS iwGUEr;
    public final C55251xgS uzCIH;
    public final android.widget.ImageView valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AkhnZx;
    }

    public C48350uOf(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull C55251xgS c55251xgS3, @androidx.annotation.NonNull C55251xgS c55251xgS4, @androidx.annotation.NonNull vTL vtl, @androidx.annotation.NonNull C55251xgS c55251xgS5, @androidx.annotation.NonNull C55251xgS c55251xgS6, @androidx.annotation.NonNull C55251xgS c55251xgS7, @androidx.annotation.NonNull C55251xgS c55251xgS8, @androidx.annotation.NonNull C55251xgS c55251xgS9, @androidx.annotation.NonNull C55251xgS c55251xgS10) {
        this.AkhnZx = constraintLayout;
        this.copydefault = wyk;
        this.OLrzqt = flow;
        this.EZpvd = textView;
        this.AEQbTJ = nestedScrollView;
        this.KWHzl = constraintLayout2;
        this.gEmmrt = c55251xgS;
        this.AYXKKw = recyclerView;
        this.valueOf = imageView;
        this.djBIcL = textView2;
        this.AhwBna = constraintLayout3;
        this.DbNXlk = textView3;
        this.values = view;
        this.fetchVPNInfo = textView4;
        this.isConnected = c55251xgS2;
        this.ejfBZ = c55251xgS3;
        this.fIwbmz = c55251xgS4;
        this.AuCTel = vtl;
        this.fJNWhG = c55251xgS5;
        this.fARcdN = c55251xgS6;
        this.getFieldNames = c55251xgS7;
        this.iwGUEr = c55251xgS8;
        this.uzCIH = c55251xgS9;
        this.hDKMBd = c55251xgS10;
    }

    public static C48350uOf KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.QkdxfA, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C48350uOf KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C48033uCm.Application.DlABUU;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            i = C48033uCm.Application.fVjYLc;
            Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
            if (flow != null) {
                i = C48033uCm.Application.QiTXOm;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C48033uCm.Application.GcnicV;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (nestedScrollView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = C48033uCm.Application.MediaSessionCompatMediaSessionImplBase1;
                        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                        if (c55251xgS != null) {
                            i = C48033uCm.Application.ActivityViewModelLazyKtviewModels1;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C48033uCm.Application.getSavedStateRegistry;
                                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C48033uCm.Application.getLifecycle;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C48033uCm.Application.onActivityResult;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = C48033uCm.Application.onBackPressed;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.getResultContract))) != null) {
                                                i = C48033uCm.Application.ActivityResultContractsStartActivityForResult;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = C48033uCm.Application.CallSuper;
                                                    C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                    if (c55251xgS2 != null) {
                                                        i = C48033uCm.Application.DimensionCompanion;
                                                        C55251xgS c55251xgS3 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                        if (c55251xgS3 != null) {
                                                            i = C48033uCm.Application.HalfFloat;
                                                            C55251xgS c55251xgS4 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                            if (c55251xgS4 != null) {
                                                                i = C48033uCm.Application.getNavigationMode;
                                                                vTL vtl = (vTL) ViewBindings.findChildViewById(view, i);
                                                                if (vtl != null) {
                                                                    i = C48033uCm.Application.setShowHideAnimationEnabled;
                                                                    C55251xgS c55251xgS5 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                                    if (c55251xgS5 != null) {
                                                                        i = C48033uCm.Application.setDisplayHomeAsUpEnabled;
                                                                        C55251xgS c55251xgS6 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                                        if (c55251xgS6 != null) {
                                                                            i = C48033uCm.Application.ActionBarTabListener;
                                                                            C55251xgS c55251xgS7 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                                            if (c55251xgS7 != null) {
                                                                                i = C48033uCm.Application.onScroll;
                                                                                C55251xgS c55251xgS8 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                                                if (c55251xgS8 != null) {
                                                                                    i = C48033uCm.Application.hasStableIds;
                                                                                    C55251xgS c55251xgS9 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                                                    if (c55251xgS9 != null) {
                                                                                        i = C48033uCm.Application.setIconAttribute;
                                                                                        C55251xgS c55251xgS10 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                                                        if (c55251xgS10 != null) {
                                                                                            return new C48350uOf(constraintLayout, wyk, flow, textView, nestedScrollView, constraintLayout, c55251xgS, recyclerView, imageView, textView2, constraintLayout2, textView3, viewFindChildViewById, textView4, c55251xgS2, c55251xgS3, c55251xgS4, vtl, c55251xgS5, c55251xgS6, c55251xgS7, c55251xgS8, c55251xgS9, c55251xgS10);
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
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
