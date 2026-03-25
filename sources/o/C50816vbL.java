package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50816vbL implements ViewBinding {
    public final C55251xgS AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C52794wYp EZpvd;
    public final RecyclerView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C55251xgS copydefault;
    public final ConstraintLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C50816vbL(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.gEmmrt = constraintLayout;
        this.copydefault = c55251xgS;
        this.OLrzqt = constraintLayout2;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = c55251xgS2;
        this.KWHzl = recyclerView;
        this.AYXKKw = textView;
    }

    public static C50816vbL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.onLocationChanged, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C50816vbL AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.sbu;
        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
        if (c55251xgS != null) {
            i = C48033uCm.Application.hErYDe;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C48033uCm.Application.getRemoteControlClient;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C48033uCm.Application.setQueue;
                    C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS2 != null) {
                        i = C48033uCm.Application.ActivityViewModelLazyKtviewModels1;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C48033uCm.Application.ActivityResultContractsPickMultipleVisualMediaExternalSyntheticApiModelOutline0;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new C50816vbL((ConstraintLayout) view, c55251xgS, constraintLayout, c52794wYp, c55251xgS2, recyclerView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
