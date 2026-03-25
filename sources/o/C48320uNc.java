package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48320uNc implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C48441uRn AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final Flow OLrzqt;
    public final Flow copydefault;
    public final ConstraintLayout djBIcL;
    public final ConstraintLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C48320uNc(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull Flow flow2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C48441uRn c48441uRn) {
        this.djBIcL = constraintLayout;
        this.AEQbTJ = textView;
        this.KWHzl = textView2;
        this.copydefault = flow;
        this.OLrzqt = flow2;
        this.EZpvd = textView3;
        this.gEmmrt = constraintLayout2;
        this.AhwBna = textView4;
        this.AYXKKw = c48441uRn;
    }

    public static C48320uNc copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.QOLQEE, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C48320uNc KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C48033uCm.Application.hUfVAv;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C48033uCm.Application.AxsJAYaxsJAY;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C48033uCm.Application.QVMIlxQVMIlx;
                Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                if (flow != null) {
                    i = C48033uCm.Application.QezThh;
                    Flow flow2 = (Flow) ViewBindings.findChildViewById(view, i);
                    if (flow2 != null) {
                        i = C48033uCm.Application.getMediaMetadata;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C48033uCm.Application.getText;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C48033uCm.Application.MediaMetadataCompat1;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.getMinimumHeight))) != null) {
                                    return new C48320uNc((ConstraintLayout) view, textView, textView2, flow, flow2, textView3, constraintLayout, textView4, C48441uRn.copydefault(viewFindChildViewById));
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
