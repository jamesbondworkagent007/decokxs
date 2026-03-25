package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57388yhV implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.view.View EZpvd;
    public final RecyclerView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C57388yhV(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull RecyclerView recyclerView2) {
        this.EZpvd = view;
        this.AEQbTJ = textView;
        this.KWHzl = recyclerView;
        this.OLrzqt = textView2;
        this.copydefault = recyclerView2;
    }

    public static C57388yhV KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.sSMYrx, viewGroup);
        return copydefault(viewGroup);
    }

    public static C57388yhV copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.AuCTelauCTel;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C57406yhn.StateListAnimator.zLjUOn;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C57406yhn.StateListAnimator.zuWLRA;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C57406yhn.StateListAnimator.OuxcSI;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView2 != null) {
                        return new C57388yhV(view, textView, recyclerView, textView2, recyclerView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
