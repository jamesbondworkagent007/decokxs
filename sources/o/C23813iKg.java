package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23813iKg implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.LinearLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C23813iKg(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C52794wYp c52794wYp) {
        this.AEQbTJ = view;
        this.OLrzqt = linearLayout;
        this.EZpvd = textView;
        this.KWHzl = c52794wYp;
    }

    public static C23813iKg KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.alsFma, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C23813iKg EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.unregister;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C25493ixk.ActionBar.MediaDescriptionCompat;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C25493ixk.ActionBar.isThumbUp;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    return new C23813iKg(view, linearLayout, textView, c52794wYp);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
