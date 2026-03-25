package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C33160mrH;

/* JADX INFO: renamed from: o.mtj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33294mtj implements ViewBinding {
    public final C33302mtr EZpvd;
    public final C33302mtr KWHzl;
    public final C33302mtr OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C33294mtj(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33302mtr c33302mtr, @androidx.annotation.NonNull C33302mtr c33302mtr2, @androidx.annotation.NonNull C33302mtr c33302mtr3) {
        this.copydefault = linearLayout;
        this.EZpvd = c33302mtr;
        this.OLrzqt = c33302mtr2;
        this.KWHzl = c33302mtr3;
    }

    public static C33294mtj KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C33160mrH.Application.AhwBna, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C33294mtj EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C33160mrH.StateListAnimator.gEmmrt;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C33302mtr c33302mtrEZpvd = C33302mtr.EZpvd(viewFindChildViewById);
            int i2 = C33160mrH.StateListAnimator.AYXKKw;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                C33302mtr c33302mtrEZpvd2 = C33302mtr.EZpvd(viewFindChildViewById2);
                int i3 = C33160mrH.StateListAnimator.fetchVPNInfo;
                android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i3);
                if (viewFindChildViewById3 != null) {
                    return new C33294mtj((android.widget.LinearLayout) view, c33302mtrEZpvd, c33302mtrEZpvd2, C33302mtr.EZpvd(viewFindChildViewById3));
                }
                i = i3;
            } else {
                i = i2;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
