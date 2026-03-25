package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57448yic implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.view.View EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C57448yic(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.copydefault = view;
        this.KWHzl = appCompatImageView;
        this.AEQbTJ = view2;
        this.EZpvd = view3;
        this.OLrzqt = appCompatTextView;
    }

    public static C57448yic OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.RJOkX, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C57448yic OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C57406yhn.StateListAnimator.AwvSrB;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C57406yhn.StateListAnimator.iZzfmt))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C57406yhn.StateListAnimator.hUfVAv))) != null) {
            i = C57406yhn.StateListAnimator.Ufzxmz;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new C57448yic(view, appCompatImageView, viewFindChildViewById, viewFindChildViewById2, appCompatTextView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
