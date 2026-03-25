package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54950xaj implements ViewBinding {
    public final C55237xgE AEQbTJ;
    public final android.widget.RelativeLayout AYXKKw;
    public final RecyclerView AhwBna;
    public final RecyclerView EZpvd;
    public final C55230xfy KWHzl;
    public final C55042xcV OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C54950xaj(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55042xcV c55042xcV, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull RecyclerView recyclerView2) {
        this.copydefault = view;
        this.OLrzqt = c55042xcV;
        this.KWHzl = c55230xfy;
        this.AEQbTJ = c55237xgE;
        this.EZpvd = recyclerView;
        this.AYXKKw = relativeLayout;
        this.AhwBna = recyclerView2;
    }

    public static C54950xaj KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.zsXlph, viewGroup);
        return copydefault(viewGroup);
    }

    public static C54950xaj copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.DBxZfM;
        C55042xcV c55042xcV = (C55042xcV) ViewBindings.findChildViewById(view, i);
        if (c55042xcV != null) {
            i = C52761wXj.FragmentManager.sVXHln;
            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
            if (c55230xfy != null) {
                i = C52761wXj.FragmentManager.iPSTqm;
                C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                if (c55237xgE != null) {
                    i = C52761wXj.FragmentManager.tIwhY;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C52761wXj.FragmentManager.zOIQXb;
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = C52761wXj.FragmentManager.Swccd;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView2 != null) {
                                return new C54950xaj(view, c55042xcV, c55230xfy, c55237xgE, recyclerView, relativeLayout, recyclerView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
