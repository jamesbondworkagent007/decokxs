package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iKK implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C27138jpY AYXKKw;
    public final C27187jqU AhwBna;
    public final C27449jvR DbNXlk;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final C27206jqn djBIcL;
    public final C27265jrt gEmmrt;
    public final C27271jrz valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public iKK(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C27265jrt c27265jrt, @androidx.annotation.NonNull C27271jrz c27271jrz, @androidx.annotation.NonNull C27138jpY c27138jpY, @androidx.annotation.NonNull C27206jqn c27206jqn, @androidx.annotation.NonNull C27187jqU c27187jqU, @androidx.annotation.NonNull C27449jvR c27449jvR) {
        this.AEQbTJ = view;
        this.copydefault = frameLayout;
        this.KWHzl = textView;
        this.EZpvd = textView2;
        this.OLrzqt = linearLayout;
        this.gEmmrt = c27265jrt;
        this.valueOf = c27271jrz;
        this.AYXKKw = c27138jpY;
        this.djBIcL = c27206jqn;
        this.AhwBna = c27187jqU;
        this.DbNXlk = c27449jvR;
    }

    public static iKK AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.zlvcHA, viewGroup);
        return KWHzl(viewGroup);
    }

    public static iKK KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.HJWChPzRXNTw;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C25493ixk.ActionBar.dESsmu;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C25493ixk.ActionBar.containsKey;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C25493ixk.ActionBar.fromMediaMetadata;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C25493ixk.ActionBar.keySet;
                        C27265jrt c27265jrt = (C27265jrt) ViewBindings.findChildViewById(view, i);
                        if (c27265jrt != null) {
                            i = C25493ixk.ActionBar.getMediaMetadata;
                            C27271jrz c27271jrz = (C27271jrz) ViewBindings.findChildViewById(view, i);
                            if (c27271jrz != null) {
                                i = C25493ixk.ActionBar.getRating;
                                C27138jpY c27138jpY = (C27138jpY) ViewBindings.findChildViewById(view, i);
                                if (c27138jpY != null) {
                                    i = C25493ixk.ActionBar.getString;
                                    C27206jqn c27206jqn = (C27206jqn) ViewBindings.findChildViewById(view, i);
                                    if (c27206jqn != null) {
                                        i = C25493ixk.ActionBar.getText;
                                        C27187jqU c27187jqU = (C27187jqU) ViewBindings.findChildViewById(view, i);
                                        if (c27187jqU != null) {
                                            i = C25493ixk.ActionBar.MediaMetadataCompatBitmapKey;
                                            C27449jvR c27449jvR = (C27449jvR) ViewBindings.findChildViewById(view, i);
                                            if (c27449jvR != null) {
                                                return new iKK(view, frameLayout, textView, textView2, linearLayout, c27265jrt, c27271jrz, c27138jpY, c27206jqn, c27187jqU, c27449jvR);
                                            }
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
