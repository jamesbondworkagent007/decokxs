package o;

import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes18.dex */
public final class iMQ implements ViewBinding {
    public final C55001xbh AEQbTJ;
    public final Group AYXKKw;
    public final android.widget.TextView AhwBna;
    public final AppCompatSeekBar EZpvd;
    public final android.view.View KWHzl;
    public final C55251xgS OLrzqt;
    public final C55251xgS copydefault;
    public final C55251xgS djBIcL;
    public final C55251xgS gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public iMQ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55001xbh c55001xbh, @androidx.annotation.NonNull AppCompatSeekBar appCompatSeekBar, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull C55251xgS c55251xgS3, @androidx.annotation.NonNull C55251xgS c55251xgS4, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull Group group) {
        this.KWHzl = view;
        this.AEQbTJ = c55001xbh;
        this.EZpvd = appCompatSeekBar;
        this.OLrzqt = c55251xgS;
        this.copydefault = c55251xgS2;
        this.gEmmrt = c55251xgS3;
        this.djBIcL = c55251xgS4;
        this.AhwBna = textView;
        this.AYXKKw = group;
    }

    public static iMQ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.invokespecialhOMIpD, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static iMQ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.DrNnAm;
        C55001xbh c55001xbh = (C55001xbh) ViewBindings.findChildViewById(view, i);
        if (c55001xbh != null) {
            i = C25493ixk.ActionBar.hrnhsO;
            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) ViewBindings.findChildViewById(view, i);
            if (appCompatSeekBar != null) {
                i = C25493ixk.ActionBar.hErYDe;
                C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                if (c55251xgS != null) {
                    i = C25493ixk.ActionBar.iluEmO;
                    C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS2 != null) {
                        i = C25493ixk.ActionBar.sanitizeSessionIdIgnoreCase;
                        C55251xgS c55251xgS3 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                        if (c55251xgS3 != null) {
                            i = C25493ixk.ActionBar.zUtmHU;
                            C55251xgS c55251xgS4 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                            if (c55251xgS4 != null) {
                                i = C25493ixk.ActionBar.onResult;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C25493ixk.ActionBar.onQueueChanged;
                                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                                    if (group != null) {
                                        return new iMQ(view, c55001xbh, appCompatSeekBar, c55251xgS, c55251xgS2, c55251xgS3, c55251xgS4, textView, group);
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
