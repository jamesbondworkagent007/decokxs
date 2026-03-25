package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes19.dex */
public final class uSU implements ViewBinding {
    public final C55372xih AEQbTJ;
    public final RecyclerView EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55372xih OLrzqt;
    public final LinearLayoutCompat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public uSU(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55372xih c55372xih, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55372xih c55372xih2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = linearLayoutCompat;
        this.OLrzqt = c55372xih;
        this.EZpvd = recyclerView;
        this.AEQbTJ = c55372xih2;
        this.KWHzl = textView;
    }

    public static uSU EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.Rtjmuc, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static uSU AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.onLoadChildren;
        C55372xih c55372xih = (C55372xih) ViewBindings.findChildViewById(view, i);
        if (c55372xih != null) {
            i = C48033uCm.Application.ActivityViewModelLazyKtviewModels1;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C48033uCm.Application.onSaveInstanceState;
                C55372xih c55372xih2 = (C55372xih) ViewBindings.findChildViewById(view, i);
                if (c55372xih2 != null) {
                    i = C48033uCm.Application.ReturnThis;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new uSU((LinearLayoutCompat) view, c55372xih, recyclerView, c55372xih2, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
