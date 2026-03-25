package o;

import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iMR implements ViewBinding {
    public final android.widget.TextView EZpvd;
    public final C57461yip KWHzl;
    public final AppCompatSeekBar OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public iMR(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C57461yip c57461yip, @androidx.annotation.NonNull AppCompatSeekBar appCompatSeekBar, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = view;
        this.KWHzl = c57461yip;
        this.OLrzqt = appCompatSeekBar;
        this.EZpvd = textView;
    }

    public static iMR KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.invokespecialhlXVux, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static iMR AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.DrNnAm;
        C57461yip c57461yip = (C57461yip) ViewBindings.findChildViewById(view, i);
        if (c57461yip != null) {
            i = C25493ixk.ActionBar.hrnhsO;
            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) ViewBindings.findChildViewById(view, i);
            if (appCompatSeekBar != null) {
                i = C25493ixk.ActionBar.onResult;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new iMR(view, c57461yip, appCompatSeekBar, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
