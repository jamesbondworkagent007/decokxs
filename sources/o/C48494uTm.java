package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48494uTm implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C48494uTm(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = linearLayout;
        this.KWHzl = view;
        this.copydefault = view2;
        this.EZpvd = textView;
        this.AEQbTJ = textView2;
    }

    public static C48494uTm EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.fupbxE, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C48494uTm KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C48033uCm.Application.zYHWMc;
        android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C48033uCm.Application.zOIQXb))) != null) {
            i = C48033uCm.Application.AlertControllerAlertParams2;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C48033uCm.Application.AlertControllerRecycleListView;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C48494uTm((android.widget.LinearLayout) view, viewFindChildViewById2, viewFindChildViewById, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
