package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21556hDt implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C21556hDt(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = linearLayoutCompat;
        this.KWHzl = imageView;
        this.EZpvd = imageView2;
        this.OLrzqt = imageView3;
        this.copydefault = textView;
    }

    public static C21556hDt copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DcMfJKsuEgdN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21556hDt KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OFnBcz;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C23274hvD.Application.onRelationshipValidationResult;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C23274hvD.Application.notifyNotificationWithChannel;
                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = C23274hvD.Application.onKeyUp;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C21556hDt((LinearLayoutCompat) view, imageView, imageView2, imageView3, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
