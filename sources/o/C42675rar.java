package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import o.qZH;

/* JADX INFO: renamed from: o.rar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42675rar implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.view.View EZpvd;
    public final FlexboxLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public FlexboxLayout getRoot() {
        return this.KWHzl;
    }

    public C42675rar(@androidx.annotation.NonNull FlexboxLayout flexboxLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.KWHzl = flexboxLayout;
        this.EZpvd = view;
        this.copydefault = view2;
        this.OLrzqt = textView;
        this.AEQbTJ = textView2;
    }

    public static C42675rar copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.accept, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42675rar AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.djSkpj;
        android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.UeEOUB))) != null) {
            i = qZH.StateListAnimator.SQPLEi;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = qZH.StateListAnimator.SFHvfSaKzXkR;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C42675rar((FlexboxLayout) view, viewFindChildViewById2, viewFindChildViewById, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
