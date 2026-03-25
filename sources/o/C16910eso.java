package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eso, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16910eso implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final Barrier AYXKKw;
    public final C55251xgS EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C52794wYp copydefault;
    public final android.view.View djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public C16910eso(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull Barrier barrier) {
        this.djBIcL = view;
        this.copydefault = c52794wYp;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.EZpvd = c55251xgS;
        this.KWHzl = imageView;
        this.AYXKKw = barrier;
    }

    public static C16910eso EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C13754dXa.TaskDescription.GiPPlL, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C16910eso KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.OEgNct;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.FQMcgE;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C13754dXa.ActionBar.UfveVb;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C13754dXa.ActionBar.OijiEz;
                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS != null) {
                        i = C13754dXa.ActionBar.hfdhUn;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C13754dXa.ActionBar.sendCommand;
                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                            if (barrier != null) {
                                return new C16910eso(view, c52794wYp, textView, textView2, c55251xgS, imageView, barrier);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
