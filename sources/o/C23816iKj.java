package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23816iKj implements ViewBinding {
    public final C55118xds AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C55118xds copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55118xds getRoot() {
        return this.AEQbTJ;
    }

    public C23816iKj(@androidx.annotation.NonNull C55118xds c55118xds, @androidx.annotation.NonNull C55118xds c55118xds2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = c55118xds;
        this.copydefault = c55118xds2;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
    }

    public static C23816iKj AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C23816iKj copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.apNbdB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23816iKj KWHzl(@androidx.annotation.NonNull android.view.View view) {
        C55118xds c55118xds = (C55118xds) view;
        int i = C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImpl;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C25493ixk.ActionBar.MediaBrowserCompatSearchResultReceiver;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new C23816iKj(c55118xds, c55118xds, textView, textView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
