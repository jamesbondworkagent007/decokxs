package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17120ewm implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C17120ewm(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.copydefault = linearLayout;
        this.AEQbTJ = recyclerView;
    }

    public static C17120ewm copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.MediaControllerCompatMediaControllerImplApi23;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C17120ewm((android.widget.LinearLayout) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
