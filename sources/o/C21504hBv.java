package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21504hBv implements ViewBinding {
    public final C25248itD EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C21504hBv(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C25248itD c25248itD) {
        this.KWHzl = frameLayout;
        this.OLrzqt = frameLayout2;
        this.EZpvd = c25248itD;
    }

    public static C21504hBv AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.aJZHYI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21504hBv KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ReportDrawnKtReportDrawn1;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.setDuration;
            C25248itD c25248itD = (C25248itD) ViewBindings.findChildViewById(view, i);
            if (c25248itD != null) {
                return new C21504hBv((android.widget.FrameLayout) view, frameLayout, c25248itD);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
