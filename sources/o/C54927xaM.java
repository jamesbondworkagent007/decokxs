package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54927xaM implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.view.View AYXKKw;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55291xhF OLrzqt;
    public final C55291xhF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55291xhF getRoot() {
        return this.OLrzqt;
    }

    public C54927xaM(@androidx.annotation.NonNull C55291xhF c55291xhF, @androidx.annotation.NonNull C55291xhF c55291xhF2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.view.View view) {
        this.OLrzqt = c55291xhF;
        this.copydefault = c55291xhF2;
        this.EZpvd = linearLayout;
        this.AEQbTJ = recyclerView;
        this.KWHzl = textView;
        this.AYXKKw = view;
    }

    public static C54927xaM OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.DarRvM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C54927xaM copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        C55291xhF c55291xhF = (C55291xhF) view;
        int i = C52761wXj.FragmentManager.USBtdM;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C52761wXj.FragmentManager.fXHmeK;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C52761wXj.FragmentManager.RvdRAu;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C52761wXj.FragmentManager.iHkeWl))) != null) {
                    return new C54927xaM(c55291xhF, c55291xhF, linearLayout, recyclerView, textView, viewFindChildViewById);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
