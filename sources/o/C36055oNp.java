package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36055oNp implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final RecyclerView EZpvd;
    public final LinearLayoutCompat OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C36055oNp(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33537myN c33537myN) {
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = recyclerView;
        this.AEQbTJ = c33537myN;
    }

    public static C36055oNp AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C36055oNp copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DGOPHZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C36055oNp EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.writeTypedObject;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212;
            C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
            if (c33537myN != null) {
                return new C36055oNp((LinearLayoutCompat) view, recyclerView, c33537myN);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
