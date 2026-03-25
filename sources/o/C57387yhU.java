package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57387yhU implements ViewBinding {
    public final android.view.View EZpvd;
    public final android.view.View KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C57387yhU(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.KWHzl = view;
        this.EZpvd = view2;
        this.copydefault = appCompatTextView;
        this.OLrzqt = appCompatTextView2;
    }

    public static C57387yhU copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.gHZMYf, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C57387yhU EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.DarRvM;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C57406yhn.StateListAnimator.DLWbHP;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C57406yhn.StateListAnimator.alsFma;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    return new C57387yhU(view, viewFindChildViewById, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
