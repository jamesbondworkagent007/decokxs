package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uMN implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final RecyclerView OLrzqt;
    public final android.widget.RelativeLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.copydefault;
    }

    public uMN(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = relativeLayout;
        this.EZpvd = textView;
        this.OLrzqt = recyclerView;
        this.AEQbTJ = linearLayout;
        this.KWHzl = textView2;
    }

    public static uMN copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.zLjUOn, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static uMN KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.DuR;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C48033uCm.Application.ActivityViewModelLazyKtviewModels1;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C48033uCm.Application.ActivityResultContractsOpenDocumentTree;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C48033uCm.Application.ReturnThis;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new uMN((android.widget.RelativeLayout) view, textView, recyclerView, linearLayout, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
