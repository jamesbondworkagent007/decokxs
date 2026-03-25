package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uSq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48471uSq implements ViewBinding {
    public final C55230xfy AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final RecyclerView KWHzl;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public C48471uSq(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = linearLayoutCompat;
        this.KWHzl = recyclerView;
        this.AEQbTJ = c55230xfy;
        this.copydefault = textView;
    }

    public static C48471uSq OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.fXYAwm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C48471uSq AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.ActivityViewModelLazyKtviewModels1;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C48033uCm.Application.FullyDrawnReporterKtreportWhenComplete1;
            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
            if (c55230xfy != null) {
                i = C48033uCm.Application.enforcement;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C48471uSq((LinearLayoutCompat) view, recyclerView, c55230xfy, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
