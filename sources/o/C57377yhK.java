package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57377yhK implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.view.View EZpvd;
    public final C55251xgS KWHzl;
    public final RecyclerView OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C57377yhK(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = view;
        this.copydefault = imageView;
        this.OLrzqt = recyclerView;
        this.AEQbTJ = linearLayout;
        this.KWHzl = c55251xgS;
        this.AhwBna = textView;
    }

    public static C57377yhK OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.iwGUEr, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C57377yhK AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.QUSxYX;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C57406yhn.StateListAnimator.QKudOq;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C57406yhn.StateListAnimator.DXXBbs;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C57406yhn.StateListAnimator.OHqIaq;
                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS != null) {
                        i = C57406yhn.StateListAnimator.spnCvw;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new C57377yhK(view, imageView, recyclerView, linearLayout, c55251xgS, textView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
