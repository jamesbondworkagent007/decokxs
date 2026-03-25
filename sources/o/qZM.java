package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes19.dex */
public final class qZM implements ViewBinding {
    public final C28001kLf AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final C33542myS valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public qZM(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C28001kLf c28001kLf, @androidx.annotation.NonNull C33542myS c33542myS) {
        this.OLrzqt = linearLayout;
        this.copydefault = frameLayout;
        this.KWHzl = view;
        this.EZpvd = frameLayout2;
        this.AEQbTJ = c28001kLf;
        this.valueOf = c33542myS;
    }

    public static qZM copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.DbNXlk;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.hrjNmC))) != null) {
            i = qZH.StateListAnimator.OKSWiw;
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = qZH.StateListAnimator.clearCurrentKeyboardTarget;
                C28001kLf c28001kLf = (C28001kLf) ViewBindings.findChildViewById(view, i);
                if (c28001kLf != null) {
                    i = qZH.StateListAnimator.writeToParcel;
                    C33542myS c33542myS = (C33542myS) ViewBindings.findChildViewById(view, i);
                    if (c33542myS != null) {
                        return new qZM((android.widget.LinearLayout) view, frameLayout, viewFindChildViewById, frameLayout2, c28001kLf, c33542myS);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
