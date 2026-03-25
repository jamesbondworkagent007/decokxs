package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21625hGh implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final RecyclerView EZpvd;
    public final android.view.View KWHzl;
    public final C52794wYp OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C21625hGh(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.view.View view) {
        this.copydefault = constraintLayout;
        this.AEQbTJ = linearLayout;
        this.EZpvd = recyclerView;
        this.OLrzqt = c52794wYp;
        this.KWHzl = view;
    }

    public static C21625hGh EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ONJgbh, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21625hGh KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.AuCTel;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C23274hvD.Application.r8lambdaKrBLxNpMJdSxVU3Lsj65hn0UyA;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C23274hvD.Application.initializeReflectiveFields;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.emit))) != null) {
                    return new C21625hGh((ConstraintLayout) view, linearLayout, recyclerView, c52794wYp, viewFindChildViewById);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
