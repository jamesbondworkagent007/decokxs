package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57382yhP implements ViewBinding {
    public final android.widget.ImageView EZpvd;
    public final C57486yjN KWHzl;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C57382yhP(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C57486yjN c57486yjN) {
        this.copydefault = view;
        this.EZpvd = imageView;
        this.KWHzl = c57486yjN;
    }

    public static C57382yhP OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.AuCTelauCTel, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C57382yhP EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.RcXXUw;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C57406yhn.StateListAnimator.UlJrfe;
            C57486yjN c57486yjN = (C57486yjN) ViewBindings.findChildViewById(view, i);
            if (c57486yjN != null) {
                return new C57382yhP(view, imageView, c57486yjN);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
