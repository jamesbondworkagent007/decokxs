package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes23.dex */
public final class hAZ implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C28057kNh AhwBna;
    public final C55113xdn EZpvd;
    public final C55173xeu KWHzl;
    public final RecyclerView OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public hAZ(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C28057kNh c28057kNh) {
        this.AEQbTJ = frameLayout;
        this.KWHzl = c55173xeu;
        this.copydefault = linearLayout;
        this.EZpvd = c55113xdn;
        this.OLrzqt = recyclerView;
        this.AhwBna = c28057kNh;
    }

    public static hAZ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DIIpTV, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hAZ EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.sZqaRl;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C23274hvD.Application.getLaunchPendingIntent;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = C23274hvD.Application.onBackPressedDispatcherlambda1;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C23274hvD.Application.rememberLauncherForActivityResult;
                        C28057kNh c28057kNh = (C28057kNh) ViewBindings.findChildViewById(view, i);
                        if (c28057kNh != null) {
                            return new hAZ((android.widget.FrameLayout) view, c55173xeu, linearLayout, c55113xdn, recyclerView, c28057kNh);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
