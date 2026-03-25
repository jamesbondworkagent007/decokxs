package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEV implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final C55113xdn EZpvd;
    public final C55173xeu KWHzl;
    public final ConstraintLayout OLrzqt;
    public final RecyclerView copydefault;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public hEV(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.AEQbTJ = linearLayoutCompat;
        this.KWHzl = c55173xeu;
        this.OLrzqt = constraintLayout;
        this.EZpvd = c55113xdn;
        this.copydefault = recyclerView;
        this.AhwBna = textView;
        this.valueOf = textView2;
        this.gEmmrt = textView3;
    }

    public static hEV KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DQnQnb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hEV AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.HJWChPDXdlte;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C23274hvD.Application.isRated;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = C23274hvD.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C23274hvD.Application.LayoutRes;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C23274hvD.Application.bypassDispatchKeyEvent;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C23274hvD.Application.getDrawable;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new hEV((LinearLayoutCompat) view, c55173xeu, constraintLayout, c55113xdn, recyclerView, textView, textView2, textView3);
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
