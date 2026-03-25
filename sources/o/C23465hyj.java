package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23465hyj implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final LinearLayoutCompat AhwBna;
    public final wYC EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final C52794wYp OLrzqt;
    public final OKRegularCell copydefault;
    public final android.view.View djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AhwBna;
    }

    public C23465hyj(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.view.View view) {
        this.AhwBna = linearLayoutCompat;
        this.OLrzqt = c52794wYp;
        this.copydefault = oKRegularCell;
        this.AEQbTJ = recyclerView;
        this.EZpvd = wyc;
        this.KWHzl = linearLayoutCompat2;
        this.djBIcL = view;
    }

    public static C23465hyj copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gkJEwt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23465hyj EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DCUTEIddSDPG;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.DLGVGj;
            OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
            if (oKRegularCell != null) {
                i = C23274hvD.Application.DztXDE;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C23274hvD.Application.dcEsSD;
                    wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc != null) {
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                        i = C23274hvD.Application.dispatchPopulateAccessibilityEvent;
                        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
                        if (viewFindChildViewById != null) {
                            return new C23465hyj(linearLayoutCompat, c52794wYp, oKRegularCell, recyclerView, wyc, linearLayoutCompat, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
