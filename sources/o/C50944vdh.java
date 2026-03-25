package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50944vdh implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final android.widget.LinearLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C50944vdh(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = linearLayout;
        this.KWHzl = textView;
        this.AEQbTJ = textView2;
    }

    public static C50944vdh copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.setButton;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C48033uCm.Application.AlertController2;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new C50944vdh((android.widget.LinearLayout) view, textView, textView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
