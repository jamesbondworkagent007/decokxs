package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54922xaH implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final C55055xci KWHzl;
    public final android.view.View OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C54922xaH(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55055xci c55055xci, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.OLrzqt = view;
        this.KWHzl = c55055xci;
        this.AEQbTJ = appCompatTextView;
        this.copydefault = recyclerView;
        this.EZpvd = appCompatTextView2;
    }

    public static C54922xaH KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.iRxXKY, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C54922xaH AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.QOLQEE;
        C55055xci c55055xci = (C55055xci) ViewBindings.findChildViewById(view, i);
        if (c55055xci != null) {
            i = C52761wXj.FragmentManager.fZBcTu;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C52761wXj.FragmentManager.hlkKmr;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C52761wXj.FragmentManager.RAQtXZ;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        return new C54922xaH(view, c55055xci, appCompatTextView, recyclerView, appCompatTextView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
