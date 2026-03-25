package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iJv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23801iJv implements ViewBinding {
    public final C27212jqt AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final C52794wYp KWHzl;
    public final wYC OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AYXKKw;
    }

    public C23801iJv(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C27212jqt c27212jqt, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.AYXKKw = linearLayoutCompat;
        this.copydefault = imageView;
        this.AEQbTJ = c27212jqt;
        this.KWHzl = c52794wYp;
        this.EZpvd = linearLayoutCompat2;
        this.OLrzqt = wyc;
        this.AhwBna = linearLayoutCompat3;
        this.djBIcL = textView;
        this.valueOf = textView2;
        this.gEmmrt = textView3;
    }

    public static C23801iJv KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.ixgjPv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23801iJv KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.QOLQEE;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25493ixk.ActionBar.QKVWgx;
            C27212jqt c27212jqt = (C27212jqt) ViewBindings.findChildViewById(view, i);
            if (c27212jqt != null) {
                i = C25493ixk.ActionBar.RlQdEF;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                    i = C25493ixk.ActionBar.sCB;
                    wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc != null) {
                        i = C25493ixk.ActionBar.DcNNRp;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat2 != null) {
                            i = C25493ixk.ActionBar.OBzZra;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C25493ixk.ActionBar.IPostMessageServiceStub;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C25493ixk.ActionBar.getIconBitmap;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new C23801iJv(linearLayoutCompat, imageView, c27212jqt, c52794wYp, linearLayoutCompat, wyc, linearLayoutCompat2, textView, textView2, textView3);
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
