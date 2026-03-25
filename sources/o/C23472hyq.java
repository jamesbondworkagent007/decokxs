package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23472hyq implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final OKSortTextView AhwBna;
    public final C55173xeu EZpvd;
    public final android.widget.HorizontalScrollView KWHzl;
    public final OKSortTextView OLrzqt;
    public final OKSortTextView copydefault;
    public final C55113xdn djBIcL;
    public final NestedScrollView gEmmrt;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.gEmmrt;
    }

    public C23472hyq(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.gEmmrt = nestedScrollView;
        this.AEQbTJ = linearLayoutCompat;
        this.EZpvd = c55173xeu;
        this.KWHzl = horizontalScrollView;
        this.OLrzqt = oKSortTextView;
        this.copydefault = oKSortTextView2;
        this.AhwBna = oKSortTextView3;
        this.AYXKKw = linearLayoutCompat2;
        this.djBIcL = c55113xdn;
        this.valueOf = recyclerView;
    }

    public static C23472hyq EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QKudOq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23472hyq OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fVjYLc;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C23274hvD.Application.QOjuYg;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C23274hvD.Application.QVMIlx;
                android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                if (horizontalScrollView != null) {
                    i = C23274hvD.Application.isEmpty;
                    OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                    if (oKSortTextView != null) {
                        i = C23274hvD.Application.fromMediaDescription;
                        OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                        if (oKSortTextView2 != null) {
                            i = C23274hvD.Application.build;
                            OKSortTextView oKSortTextView3 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                            if (oKSortTextView3 != null) {
                                i = C23274hvD.Application.hasHeart;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                    if (c55113xdn != null) {
                                        i = C23274hvD.Application.ComponentActivityExternalSyntheticLambda0;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            return new C23472hyq((NestedScrollView) view, linearLayoutCompat, c55173xeu, horizontalScrollView, oKSortTextView, oKSortTextView2, oKSortTextView3, linearLayoutCompat2, c55113xdn, recyclerView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
