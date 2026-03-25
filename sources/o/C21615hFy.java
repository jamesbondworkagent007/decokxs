package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21615hFy implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final C57468yiw AYXKKw;
    public final RecyclerView AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final C57431yiL KWHzl;
    public final C57436yiQ OLrzqt;
    public final android.view.View copydefault;
    public final NestedScrollView djBIcL;
    public final C55113xdn gEmmrt;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.valueOf;
    }

    public C21615hFy(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C57431yiL c57431yiL, @androidx.annotation.NonNull C57436yiQ c57436yiQ, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C57468yiw c57468yiw) {
        this.valueOf = linearLayoutCompat;
        this.EZpvd = linearLayout;
        this.AEQbTJ = c55173xeu;
        this.copydefault = view;
        this.KWHzl = c57431yiL;
        this.OLrzqt = c57436yiQ;
        this.AhwBna = recyclerView;
        this.djBIcL = nestedScrollView;
        this.gEmmrt = c55113xdn;
        this.AYXKKw = c57468yiw;
    }

    public static C21615hFy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.QCjLjM;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C23274hvD.Application.sZqaRl;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.MediaMetadataCompat1))) != null) {
                i = C23274hvD.Application.getRccStateFromState;
                C57431yiL c57431yiL = (C57431yiL) ViewBindings.findChildViewById(view, i);
                if (c57431yiL != null) {
                    i = C23274hvD.Application.MediaSessionCompatMediaSessionImplBase1;
                    C57436yiQ c57436yiQ = (C57436yiQ) ViewBindings.findChildViewById(view, i);
                    if (c57436yiQ != null) {
                        i = C23274hvD.Application.reportWhenComplete;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C23274hvD.Application.addCancellableCallbackactivity_release;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = C23274hvD.Application.CheckResult;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    i = C23274hvD.Application.DeprecatedSinceApi;
                                    C57468yiw c57468yiw = (C57468yiw) ViewBindings.findChildViewById(view, i);
                                    if (c57468yiw != null) {
                                        return new C21615hFy((LinearLayoutCompat) view, linearLayout, c55173xeu, viewFindChildViewById, c57431yiL, c57436yiQ, recyclerView, nestedScrollView, c55113xdn, c57468yiw);
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
