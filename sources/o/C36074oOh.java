package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36074oOh implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final wYC KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public C36074oOh(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = linearLayoutCompat;
        this.KWHzl = wyc;
        this.AEQbTJ = textView;
    }

    public static C36074oOh EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.fsSxsn, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C36074oOh AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.QWpYiD;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C35964oKf.StateListAnimator.onCaptioningEnabledChanged;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C36074oOh((LinearLayoutCompat) view, wyc, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
