package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hHK implements ViewBinding {
    public final C25325iub AEQbTJ;
    public final C25325iub EZpvd;
    public final C25332iui OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public hHK(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C25325iub c25325iub, @androidx.annotation.NonNull C25332iui c25332iui, @androidx.annotation.NonNull C25325iub c25325iub2) {
        this.copydefault = linearLayout;
        this.AEQbTJ = c25325iub;
        this.OLrzqt = c25332iui;
        this.EZpvd = c25325iub2;
    }

    public static hHK copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OeawrH, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hHK OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.onCreatePanelMenu;
        C25325iub c25325iub = (C25325iub) ViewBindings.findChildViewById(view, i);
        if (c25325iub != null) {
            i = C23274hvD.Application.PipHintTrackerKttrackPipAnimationHintView2;
            C25332iui c25332iui = (C25332iui) ViewBindings.findChildViewById(view, i);
            if (c25332iui != null) {
                i = C23274hvD.Application.SupportActionModeWrapperCallbackWrapper;
                C25325iub c25325iub2 = (C25325iub) ViewBindings.findChildViewById(view, i);
                if (c25325iub2 != null) {
                    return new hHK((android.widget.LinearLayout) view, c25325iub, c25332iui, c25325iub2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
