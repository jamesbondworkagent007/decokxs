package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33874nJa implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final C35893oHp KWHzl;
    public final OKEditText copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C33874nJa(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.AEQbTJ = linearLayout;
        this.copydefault = oKEditText;
        this.KWHzl = c35893oHp;
        this.EZpvd = linearLayout2;
    }

    public static C33874nJa EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.zqTOFw;
        OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
        if (oKEditText != null) {
            i = C35399nuc.StateListAnimator.invokespecialsiEkQe;
            C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
            if (c35893oHp != null) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                return new C33874nJa(linearLayout, oKEditText, c35893oHp, linearLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
