package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oMP implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final android.view.View KWHzl;
    public final RecyclerView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public oMP(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = linearLayout;
        this.KWHzl = view;
        this.AEQbTJ = c55173xeu;
        this.OLrzqt = recyclerView;
        this.EZpvd = linearLayout2;
        this.gEmmrt = textView;
        this.AhwBna = textView2;
    }

    public static oMP AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.dxcTrN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static oMP AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.DLGVGj;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C35964oKf.StateListAnimator.sendSocketRequest;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C35964oKf.StateListAnimator.addSocket;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C35964oKf.StateListAnimator.hkDICb;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C35964oKf.StateListAnimator.getShuffleMode;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C35964oKf.StateListAnimator.rewind;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new oMP((android.widget.LinearLayout) view, viewFindChildViewById, c55173xeu, recyclerView, linearLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
