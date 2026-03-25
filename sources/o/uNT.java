package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uNT implements ViewBinding {
    public final C55320xhi AEQbTJ;
    public final C55320xhi EZpvd;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public uNT(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull C55320xhi c55320xhi2) {
        this.copydefault = linearLayout;
        this.AEQbTJ = c55320xhi;
        this.EZpvd = c55320xhi2;
    }

    public static uNT copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.onSkipToQueueItem;
        C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
        if (c55320xhi != null) {
            i = C48033uCm.Application.onSkipToPrevious;
            C55320xhi c55320xhi2 = (C55320xhi) ViewBindings.findChildViewById(view, i);
            if (c55320xhi2 != null) {
                return new uNT((android.widget.LinearLayout) view, c55320xhi, c55320xhi2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
