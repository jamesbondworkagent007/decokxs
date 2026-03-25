package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48648uZe implements ViewBinding {
    public final C55258xgZ AEQbTJ;
    public final Flow EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final FlexboxLayout OLrzqt;
    public final C49858uwV copydefault;
    public final C55258xgZ gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C48648uZe(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull C49858uwV c49858uwV, @androidx.annotation.NonNull FlexboxLayout flexboxLayout, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C55258xgZ c55258xgZ2) {
        this.KWHzl = linearLayout;
        this.EZpvd = flow;
        this.copydefault = c49858uwV;
        this.OLrzqt = flexboxLayout;
        this.AEQbTJ = c55258xgZ;
        this.gEmmrt = c55258xgZ2;
    }

    public static C48648uZe OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.GiPPlLQAswws, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C48648uZe copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.fdazkH;
        Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
        if (flow != null) {
            i = C48033uCm.Application.fhwtiV;
            C49858uwV c49858uwV = (C49858uwV) ViewBindings.findChildViewById(view, i);
            if (c49858uwV != null) {
                i = C48033uCm.Application.FontRes;
                FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                if (flexboxLayout != null) {
                    i = C48033uCm.Application.setupButtons;
                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ != null) {
                        i = C48033uCm.Application.setCursor;
                        C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ2 != null) {
                            return new C48648uZe((android.widget.LinearLayout) view, flow, c49858uwV, flexboxLayout, c55258xgZ, c55258xgZ2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
