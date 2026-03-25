package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21502hBt implements ViewBinding {
    public final C55251xgS AEQbTJ;
    public final C55251xgS EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final ConstraintLayout copydefault;
    public final C55258xgZ djBIcL;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C21502hBt(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat) {
        this.copydefault = constraintLayout;
        this.OLrzqt = imageView;
        this.AEQbTJ = c55251xgS;
        this.EZpvd = c55251xgS2;
        this.KWHzl = textView;
        this.djBIcL = c55258xgZ;
        this.valueOf = linearLayoutCompat;
    }

    public static C21502hBt AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DrNnAm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21502hBt EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getInterfaceDescriptor;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C23274hvD.Application.getResultContract;
            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
            if (c55251xgS != null) {
                i = C23274hvD.Application.getCallerInput;
                C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                if (c55251xgS2 != null) {
                    i = C23274hvD.Application.setDisplayShowTitleEnabled;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C23274hvD.Application.parseItem;
                        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ != null) {
                            i = C23274hvD.Application.setInterpolator;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                return new C21502hBt((ConstraintLayout) view, imageView, c55251xgS, c55251xgS2, textView, c55258xgZ, linearLayoutCompat);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
