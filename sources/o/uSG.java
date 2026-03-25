package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes19.dex */
public final class uSG implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.RelativeLayout AhwBna;
    public final android.widget.TextView EZpvd;
    public final C52794wYp KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.view.View djBIcL;
    public final RecyclerView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.AhwBna;
    }

    public uSG(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AhwBna = relativeLayout;
        this.AEQbTJ = view;
        this.EZpvd = textView;
        this.KWHzl = c52794wYp;
        this.OLrzqt = linearLayoutCompat;
        this.copydefault = imageView;
        this.gEmmrt = recyclerView;
        this.djBIcL = view2;
        this.AYXKKw = textView2;
    }

    public static uSG copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.invokespecialDPHOMC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static uSG OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C48033uCm.Application.YFmri;
        android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            i = C48033uCm.Application.zvzmfz;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C48033uCm.Application.isElapsedRealtimeNanosAvailable;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C48033uCm.Application.HJWChPdIKEqB;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C48033uCm.Application.onStatusChanged;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C48033uCm.Application.ActivityViewModelLazyKtviewModels1;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.OptIn))) != null) {
                                i = C48033uCm.Application.ReturnThis;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new uSG((android.widget.RelativeLayout) view, viewFindChildViewById2, textView, c52794wYp, linearLayoutCompat, imageView, recyclerView, viewFindChildViewById, textView2);
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
