package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54921xaG implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C55258xgZ AhwBna;
    public final android.view.View EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C54921xaG(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.EZpvd = view;
        this.KWHzl = textView;
        this.OLrzqt = imageView;
        this.AEQbTJ = imageView2;
        this.copydefault = linearLayout;
        this.AhwBna = c55258xgZ;
    }

    public static C54921xaG copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.DAIeex, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C54921xaG EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.fZBcTu;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C52761wXj.FragmentManager.ODXsMY;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C52761wXj.FragmentManager.DLWbHP;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C52761wXj.FragmentManager.spnCvw;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C52761wXj.FragmentManager.geLlBI;
                        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ != null) {
                            return new C54921xaG(view, textView, imageView, imageView2, linearLayout, c55258xgZ);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
