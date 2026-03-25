package o;

import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayout;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21659hHo implements ViewBinding {
    public final FlexboxLayout EZpvd;
    public final FlexboxLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public FlexboxLayout getRoot() {
        return this.EZpvd;
    }

    public C21659hHo(@androidx.annotation.NonNull FlexboxLayout flexboxLayout, @androidx.annotation.NonNull FlexboxLayout flexboxLayout2) {
        this.EZpvd = flexboxLayout;
        this.copydefault = flexboxLayout2;
    }

    public static C21659hHo EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fJk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21659hHo copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        FlexboxLayout flexboxLayout = (FlexboxLayout) view;
        return new C21659hHo(flexboxLayout, flexboxLayout);
    }
}
