package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEI implements ViewBinding {
    public final C55001xbh AEQbTJ;
    public final TextInputLayout AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C55001xbh copydefault;
    public final android.widget.TextView djBIcL;
    public final TextInputLayout gEmmrt;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AhwBna;
    }

    public hEI(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55001xbh c55001xbh, @androidx.annotation.NonNull C55001xbh c55001xbh2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull TextInputLayout textInputLayout, @androidx.annotation.NonNull TextInputLayout textInputLayout2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.AhwBna = linearLayoutCompat;
        this.EZpvd = textView;
        this.AEQbTJ = c55001xbh;
        this.copydefault = c55001xbh2;
        this.KWHzl = textView2;
        this.OLrzqt = imageView;
        this.AYXKKw = textInputLayout;
        this.gEmmrt = textInputLayout2;
        this.djBIcL = textView3;
        this.valueOf = linearLayoutCompat2;
    }

    public static hEI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ORWKdN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hEI KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.aBDePw;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.HJWChPzRXNTw;
            C55001xbh c55001xbh = (C55001xbh) ViewBindings.findChildViewById(view, i);
            if (c55001xbh != null) {
                i = C23274hvD.Application.geAOna;
                C55001xbh c55001xbh2 = (C55001xbh) ViewBindings.findChildViewById(view, i);
                if (c55001xbh2 != null) {
                    i = C23274hvD.Application.DAgZj;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C23274hvD.Application.MediaBrowserCompatSearchResultReceiver;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C23274hvD.Application.IntentSenderRequest;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                            if (textInputLayout != null) {
                                i = C23274hvD.Application.ActivityResultRegistryOwner;
                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                if (textInputLayout2 != null) {
                                    i = C23274hvD.Application.setArrowHeadLength;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C23274hvD.Application.onActionViewExpanded;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat != null) {
                                            return new hEI((LinearLayoutCompat) view, textView, c55001xbh, c55001xbh2, textView2, imageView, textInputLayout, textInputLayout2, textView3, linearLayoutCompat);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
