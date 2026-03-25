package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hFV implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.view.ViewStub EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C55173xeu OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public hFV(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.view.ViewStub viewStub) {
        this.AEQbTJ = frameLayout;
        this.OLrzqt = c55173xeu;
        this.KWHzl = frameLayout2;
        this.EZpvd = viewStub;
    }

    public static hFV AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.QOjuYg;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C23274hvD.Application.ReportDrawnKtReportDrawnAfterfullyDrawnReporter1;
                android.view.ViewStub viewStub = (android.view.ViewStub) ViewBindings.findChildViewById(view, i);
                if (viewStub != null) {
                    return new hFV((android.widget.FrameLayout) view, c55173xeu, frameLayout, viewStub);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
