package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBV implements ViewBinding {
    public final C54984xbQ AEQbTJ;
    public final C54984xbQ AhwBna;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C55008xbo copydefault;
    public final C54984xbQ djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public hBV(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C54984xbQ c54984xbQ, @androidx.annotation.NonNull C54984xbQ c54984xbQ2, @androidx.annotation.NonNull C54984xbQ c54984xbQ3) {
        this.KWHzl = constraintLayout;
        this.copydefault = c55008xbo;
        this.EZpvd = textView;
        this.OLrzqt = textView2;
        this.AEQbTJ = c54984xbQ;
        this.djBIcL = c54984xbQ2;
        this.AhwBna = c54984xbQ3;
    }

    public static hBV AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.iqMDAV, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hBV OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.onReceive;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C23274hvD.Application.InspectablePropertyValueType;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C23274hvD.Application.createConfigurationContext;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C23274hvD.Application.setStyle;
                    C54984xbQ c54984xbQ = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                    if (c54984xbQ != null) {
                        i = C23274hvD.Application.animate;
                        C54984xbQ c54984xbQ2 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                        if (c54984xbQ2 != null) {
                            i = C23274hvD.Application.isSpinEnabled;
                            C54984xbQ c54984xbQ3 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                            if (c54984xbQ3 != null) {
                                return new hBV((ConstraintLayout) view, c55008xbo, textView, textView2, c54984xbQ, c54984xbQ2, c54984xbQ3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
