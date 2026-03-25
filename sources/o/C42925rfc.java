package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42925rfc implements ViewBinding {
    public final C55052xcf AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C42925rfc(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.KWHzl = view;
        this.AEQbTJ = c55052xcf;
        this.copydefault = textView;
        this.OLrzqt = textView2;
        this.EZpvd = textView3;
    }

    public static C42925rfc EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.DzkRMH, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C42925rfc KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.aPFruk;
        C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
        if (c55052xcf != null) {
            i = qZH.StateListAnimator.sWlOSi;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = qZH.StateListAnimator.INotificationSideChannel;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = qZH.StateListAnimator.unsubscribe;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        return new C42925rfc(view, c55052xcf, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
