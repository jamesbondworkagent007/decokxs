package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48427uRL implements ViewBinding {
    public final wYD AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final C55320xhi KWHzl;
    public final C55320xhi OLrzqt;
    public final C55320xhi copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C48427uRL(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYD wyd, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull C55320xhi c55320xhi2, @androidx.annotation.NonNull C55320xhi c55320xhi3) {
        this.EZpvd = linearLayout;
        this.AEQbTJ = wyd;
        this.copydefault = c55320xhi;
        this.KWHzl = c55320xhi2;
        this.OLrzqt = c55320xhi3;
    }

    public static C48427uRL OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.abAflu;
        wYD wyd = (wYD) ViewBindings.findChildViewById(view, i);
        if (wyd != null) {
            i = C48033uCm.Application.vqBjd;
            C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
            if (c55320xhi != null) {
                i = C48033uCm.Application.zHQtTQ;
                C55320xhi c55320xhi2 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                if (c55320xhi2 != null) {
                    i = C48033uCm.Application.getVolumeControl;
                    C55320xhi c55320xhi3 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                    if (c55320xhi3 != null) {
                        return new C48427uRL((android.widget.LinearLayout) view, wyd, c55320xhi, c55320xhi2, c55320xhi3);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
