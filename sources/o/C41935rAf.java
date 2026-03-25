package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rAf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41935rAf implements ViewBinding {
    public final android.widget.RadioGroup AEQbTJ;
    public final android.widget.RadioButton EZpvd;
    public final C55097xdX KWHzl;
    public final android.widget.RadioButton OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.view.View djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C41935rAf(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55097xdX c55097xdX, @androidx.annotation.NonNull android.widget.RadioButton radioButton, @androidx.annotation.NonNull android.widget.RadioButton radioButton2, @androidx.annotation.NonNull android.widget.RadioGroup radioGroup, @androidx.annotation.NonNull android.view.View view) {
        this.copydefault = linearLayout;
        this.KWHzl = c55097xdX;
        this.OLrzqt = radioButton;
        this.EZpvd = radioButton2;
        this.AEQbTJ = radioGroup;
        this.djBIcL = view;
    }

    public static C41935rAf copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.RVsVBY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C41935rAf EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C43662rtX.ActionBar.gdmIOq;
        C55097xdX c55097xdX = (C55097xdX) ViewBindings.findChildViewById(view, i);
        if (c55097xdX != null) {
            i = C43662rtX.ActionBar.Th;
            android.widget.RadioButton radioButton = (android.widget.RadioButton) ViewBindings.findChildViewById(view, i);
            if (radioButton != null) {
                i = C43662rtX.ActionBar.DTeKQX;
                android.widget.RadioButton radioButton2 = (android.widget.RadioButton) ViewBindings.findChildViewById(view, i);
                if (radioButton2 != null) {
                    i = C43662rtX.ActionBar.invokespecialDaTmkG;
                    android.widget.RadioGroup radioGroup = (android.widget.RadioGroup) ViewBindings.findChildViewById(view, i);
                    if (radioGroup != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C43662rtX.ActionBar.DztXDE))) != null) {
                        return new C41935rAf((android.widget.LinearLayout) view, c55097xdX, radioButton, radioButton2, radioGroup, viewFindChildViewById);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
