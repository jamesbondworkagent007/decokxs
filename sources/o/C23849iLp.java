package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iLp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23849iLp implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.view.View OLrzqt;
    public final LinearLayoutCompat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public C23849iLp(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = linearLayoutCompat;
        this.OLrzqt = view;
        this.AEQbTJ = textView;
    }

    public static C23849iLp KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.gwwfep, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23849iLp OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.ITrustedWebActivityCallbackStubProxy;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C25493ixk.ActionBar.AudioAttributesImplApi21Parcelizer;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C23849iLp((LinearLayoutCompat) view, viewFindChildViewById, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
