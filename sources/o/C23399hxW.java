package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23399hxW implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final RecyclerView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C23399hxW(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2) {
        this.KWHzl = frameLayout;
        this.EZpvd = recyclerView;
        this.copydefault = view;
        this.AEQbTJ = view2;
    }

    public static C23399hxW AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.UeEOUB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23399hxW AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C23274hvD.Application.onLaunch;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.onPointerCaptureChanged))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.onActionModeFinished))) != null) {
            return new C23399hxW((android.widget.FrameLayout) view, recyclerView, viewFindChildViewById, viewFindChildViewById2);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
