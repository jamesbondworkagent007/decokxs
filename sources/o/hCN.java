package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hCN implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public hCN(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = imageView;
        this.EZpvd = linearLayoutCompat2;
        this.KWHzl = textView;
    }

    public static hCN KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.onComplete, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hCN AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.AudioAttributesImplApi21Parcelizer;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            int i2 = C23274hvD.Application.cleanup;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new hCN(linearLayoutCompat, imageView, linearLayoutCompat, textView);
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
