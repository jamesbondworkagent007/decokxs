package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hFF implements ViewBinding {
    public final FlexboxLayout AEQbTJ;
    public final FlexboxLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public hFF(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull FlexboxLayout flexboxLayout, @androidx.annotation.NonNull FlexboxLayout flexboxLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = view;
        this.AEQbTJ = flexboxLayout;
        this.EZpvd = flexboxLayout2;
        this.KWHzl = textView;
        this.copydefault = textView2;
    }

    public static hFF OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.unregister, viewGroup);
        return KWHzl(viewGroup);
    }

    public static hFF KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fJk;
        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
        if (flexboxLayout != null) {
            i = C23274hvD.Application.hpmliR;
            FlexboxLayout flexboxLayout2 = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
            if (flexboxLayout2 != null) {
                i = C23274hvD.Application.setSingleChoiceItems;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C23274hvD.Application.AppCompatActivity;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new hFF(view, flexboxLayout, flexboxLayout2, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
