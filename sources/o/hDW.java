package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hDW implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final C54984xbQ KWHzl;
    public final C54984xbQ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public hDW(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C54984xbQ c54984xbQ, @androidx.annotation.NonNull C54984xbQ c54984xbQ2, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.EZpvd = linearLayoutCompat;
        this.KWHzl = c54984xbQ;
        this.OLrzqt = c54984xbQ2;
        this.AEQbTJ = recyclerView;
    }

    public static hDW copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.apAOXX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hDW KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DGUQLI;
        C54984xbQ c54984xbQ = (C54984xbQ) ViewBindings.findChildViewById(view, i);
        if (c54984xbQ != null) {
            i = C23274hvD.Application.QIZEnU;
            C54984xbQ c54984xbQ2 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
            if (c54984xbQ2 != null) {
                i = C23274hvD.Application.onStateChanged;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new hDW((LinearLayoutCompat) view, c54984xbQ, c54984xbQ2, recyclerView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
