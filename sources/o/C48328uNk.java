package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48328uNk implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final uNN KWHzl;
    public final ConstraintLayout OLrzqt;
    public final uNN copydefault;
    public final C55258xgZ gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C48328uNk(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull uNN unn, @androidx.annotation.NonNull uNN unn2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = unn;
        this.copydefault = unn2;
        this.EZpvd = textView;
        this.AEQbTJ = textView2;
        this.gEmmrt = c55258xgZ;
    }

    public static C48328uNk KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.QfsBiF, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C48328uNk AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.onServiceConnected;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            uNN unnKWHzl = uNN.KWHzl(viewFindChildViewById);
            i = C48033uCm.Application.RxVVQC;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById2 != null) {
                uNN unnKWHzl2 = uNN.KWHzl(viewFindChildViewById2);
                i = C48033uCm.Application.AlertController4;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C48033uCm.Application.setMultiChoiceItems;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C48033uCm.Application.setNegativeButton;
                        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ != null) {
                            return new C48328uNk((ConstraintLayout) view, unnKWHzl, unnKWHzl2, textView, textView2, c55258xgZ);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
