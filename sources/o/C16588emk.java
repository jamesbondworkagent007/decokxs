package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16588emk implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C16489ekr OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C16588emk(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull C16489ekr c16489ekr) {
        this.KWHzl = frameLayout;
        this.copydefault = frameLayout2;
        this.EZpvd = frameLayout3;
        this.OLrzqt = c16489ekr;
    }

    public static C16588emk AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.cBPFI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16588emk AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.XW;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) view;
            int i2 = C13754dXa.ActionBar.IResultReceiverDefault;
            android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById != null) {
                return new C16588emk(frameLayout2, frameLayout, frameLayout2, C16489ekr.KWHzl(viewFindChildViewById));
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
