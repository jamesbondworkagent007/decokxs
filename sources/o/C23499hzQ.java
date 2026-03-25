package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23499hzQ implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.view.ViewStub OLrzqt;
    public final android.view.ViewStub copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C23499hzQ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.view.ViewStub viewStub, @androidx.annotation.NonNull android.view.ViewStub viewStub2) {
        this.KWHzl = linearLayout;
        this.EZpvd = frameLayout;
        this.AEQbTJ = linearLayout2;
        this.OLrzqt = viewStub;
        this.copydefault = viewStub2;
    }

    public static C23499hzQ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.hCLrkq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23499hzQ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OxVOHk;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            i = C23274hvD.Application.sendCaptioningEnabled;
            android.view.ViewStub viewStub = (android.view.ViewStub) ViewBindings.findChildViewById(view, i);
            if (viewStub != null) {
                i = C23274hvD.Application.OnBackPressedDispatcher2;
                android.view.ViewStub viewStub2 = (android.view.ViewStub) ViewBindings.findChildViewById(view, i);
                if (viewStub2 != null) {
                    return new C23499hzQ(linearLayout, frameLayout, linearLayout, viewStub, viewStub2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
