package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21467hAl implements ViewBinding {
    public final NestedScrollView AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final C55113xdn KWHzl;
    public final C55173xeu OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.AEQbTJ;
    }

    public C21467hAl(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AEQbTJ = nestedScrollView;
        this.OLrzqt = c55173xeu;
        this.EZpvd = linearLayoutCompat;
        this.KWHzl = c55113xdn;
        this.copydefault = recyclerView;
    }

    public static C21467hAl KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.alsFma, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21467hAl KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.QOjuYg;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C23274hvD.Application.vqBjd;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new C21467hAl((NestedScrollView) view, c55173xeu, linearLayoutCompat, c55113xdn, recyclerView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
