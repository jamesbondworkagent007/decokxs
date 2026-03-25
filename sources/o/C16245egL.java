package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16245egL implements ViewBinding {
    public final C55008xbo AEQbTJ;
    public final RecyclerView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C33537myN EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C52794wYp copydefault;
    public final AppCompatTextView djBIcL;
    public final NestedScrollView gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C16245egL(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.OLrzqt = constraintLayout;
        this.copydefault = c52794wYp;
        this.EZpvd = c33537myN;
        this.AEQbTJ = c55008xbo;
        this.KWHzl = linearLayoutCompat;
        this.gEmmrt = nestedScrollView;
        this.AYXKKw = recyclerView;
        this.AhwBna = appCompatTextView;
        this.valueOf = appCompatTextView2;
        this.djBIcL = appCompatTextView3;
    }

    public static C16245egL OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C16245egL OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16245egL EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.tIwhY;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.DTeKQX;
            C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
            if (c33537myN != null) {
                i = C13754dXa.ActionBar.RFmUsE;
                C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
                if (c55008xbo != null) {
                    i = C13754dXa.ActionBar.hQkvHM;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C13754dXa.ActionBar.isSessionReady;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                        if (nestedScrollView != null) {
                            i = C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C13754dXa.ActionBar.getMaxItemsactivity_release;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C13754dXa.ActionBar.ActivityResultContractsPickVisualMedia;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = C13754dXa.ActionBar.ActivityResultContractsTakePicture;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            return new C16245egL((ConstraintLayout) view, c52794wYp, c33537myN, c55008xbo, linearLayoutCompat, nestedScrollView, recyclerView, appCompatTextView, appCompatTextView2, appCompatTextView3);
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
