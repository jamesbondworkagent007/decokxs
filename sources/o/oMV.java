package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oMV implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.LinearLayout EZpvd;
    public final RecyclerView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final RecyclerView copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public oMV(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = linearLayout;
        this.EZpvd = linearLayout2;
        this.OLrzqt = linearLayout3;
        this.copydefault = recyclerView;
        this.KWHzl = recyclerView2;
        this.djBIcL = textView;
        this.AYXKKw = textView2;
    }

    public static oMV AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.hUfVAv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static oMV EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.iOIMNp;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C35964oKf.StateListAnimator.OHsvZP;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = C35964oKf.StateListAnimator.ITrustedWebActivityCallback;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C35964oKf.StateListAnimator.IPostMessageServiceStub;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView2 != null) {
                        i = C35964oKf.StateListAnimator.unregisterCallback;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C35964oKf.StateListAnimator.getOptionsList;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new oMV((android.widget.LinearLayout) view, linearLayout, linearLayout2, recyclerView, recyclerView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
