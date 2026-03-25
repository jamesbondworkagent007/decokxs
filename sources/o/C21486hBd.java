package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21486hBd implements ViewBinding {
    public final wYK AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final C55113xdn EZpvd;
    public final OKSortTextView KWHzl;
    public final OKSortTextView OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final RecyclerView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AYXKKw;
    }

    public C21486hBd(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AYXKKw = frameLayout;
        this.AEQbTJ = wyk;
        this.OLrzqt = oKSortTextView;
        this.KWHzl = oKSortTextView2;
        this.copydefault = linearLayoutCompat;
        this.EZpvd = c55113xdn;
        this.gEmmrt = recyclerView;
    }

    public static C21486hBd copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QfJbVf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21486hBd KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.RZNAhV;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            i = C23274hvD.Application.getOptionsList;
            OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
            if (oKSortTextView != null) {
                i = C23274hvD.Application.getIconBitmap;
                OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                if (oKSortTextView2 != null) {
                    i = C23274hvD.Application.playFromUri;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C23274hvD.Application.Api19Impl;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                return new C21486hBd((android.widget.FrameLayout) view, wyk, oKSortTextView, oKSortTextView2, linearLayoutCompat, c55113xdn, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
