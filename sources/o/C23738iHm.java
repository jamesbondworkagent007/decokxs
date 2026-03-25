package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23738iHm implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C23738iHm(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = textView;
        this.copydefault = textView2;
    }

    public static C23738iHm copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.fIwbmz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23738iHm copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.gAnGwV;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C25493ixk.ActionBar.onSessionReady;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new C23738iHm((LinearLayoutCompat) view, textView, textView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
