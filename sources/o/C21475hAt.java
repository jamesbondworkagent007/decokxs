package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21475hAt implements ViewBinding {
    public final C55113xdn EZpvd;
    public final android.widget.RelativeLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.copydefault;
    }

    public C21475hAt(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.copydefault = relativeLayout;
        this.EZpvd = c55113xdn;
    }

    public static C21475hAt copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fLIjIY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21475hAt AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            return new C21475hAt((android.widget.RelativeLayout) view, c55113xdn);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
