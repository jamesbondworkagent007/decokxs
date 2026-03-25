package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23525hzq implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final gUB EZpvd;
    public final android.widget.TextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C23525hzq(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull gUB gub, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = view;
        this.AEQbTJ = textView;
        this.EZpvd = gub;
        this.OLrzqt = textView2;
    }

    public static C23525hzq copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.QCjLjM, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C23525hzq KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fHqPtx;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.MediaControllerCompatCallbackMessageHandler;
            gUB gub = (gUB) ViewBindings.findChildViewById(view, i);
            if (gub != null) {
                i = C23274hvD.Application.setDrawerArrowDrawable;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C23525hzq(view, textView, gub, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
