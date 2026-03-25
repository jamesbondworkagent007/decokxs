package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23736iHk implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C27212jqt copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C23736iHk(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27212jqt c27212jqt, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.KWHzl = constraintLayout;
        this.copydefault = c27212jqt;
        this.EZpvd = linearLayoutCompat;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.djBIcL = textView3;
    }

    public static C23736iHk OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.fARcdN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23736iHk EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.QKVWgx;
        C27212jqt c27212jqt = (C27212jqt) ViewBindings.findChildViewById(view, i);
        if (c27212jqt != null) {
            i = C25493ixk.ActionBar.DcNNRp;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C25493ixk.ActionBar.OBzZra;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C25493ixk.ActionBar.IPostMessageServiceStub;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C25493ixk.ActionBar.getIconBitmap;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new C23736iHk((ConstraintLayout) view, c27212jqt, linearLayoutCompat, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
