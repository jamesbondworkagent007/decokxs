package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21464hAi implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.FrameLayout OLrzqt;
    public final C57591ylM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C21464hAi(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C57591ylM c57591ylM, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.EZpvd = linearLayout;
        this.AEQbTJ = frameLayout;
        this.copydefault = c57591ylM;
        this.OLrzqt = frameLayout2;
    }

    public static C21464hAi copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.Ufzxmz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21464hAi EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DFbvW;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.ComponentActivityKt;
            C57591ylM c57591ylM = (C57591ylM) ViewBindings.findChildViewById(view, i);
            if (c57591ylM != null) {
                i = C23274hvD.Application.ActivityResultContractsStartIntentSenderForResultCompanion;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    return new C21464hAi((android.widget.LinearLayout) view, frameLayout, c57591ylM, frameLayout2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
