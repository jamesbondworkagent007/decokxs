package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16918esw implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final C55251xgS EZpvd;
    public final C55251xgS KWHzl;
    public final C55251xgS OLrzqt;
    public final C57440yiU copydefault;
    public final ConstraintLayout djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C16918esw(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull C55251xgS c55251xgS3, @androidx.annotation.NonNull C57440yiU c57440yiU, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.djBIcL = constraintLayout;
        this.AEQbTJ = appCompatImageView;
        this.OLrzqt = c55251xgS;
        this.KWHzl = c55251xgS2;
        this.EZpvd = c55251xgS3;
        this.copydefault = c57440yiU;
        this.AhwBna = textView;
    }

    public static C16918esw EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.fhUrPt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16918esw copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.setPageName;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C13754dXa.ActionBar.FYtjSf;
            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
            if (c55251xgS != null) {
                i = C13754dXa.ActionBar.dlRikr;
                C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                if (c55251xgS2 != null) {
                    i = C13754dXa.ActionBar.UJEglR;
                    C55251xgS c55251xgS3 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS3 != null) {
                        i = C13754dXa.ActionBar.MediaMetadataCompatBuilder;
                        C57440yiU c57440yiU = (C57440yiU) ViewBindings.findChildViewById(view, i);
                        if (c57440yiU != null) {
                            i = C13754dXa.ActionBar.getActivityResultRegistry;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new C16918esw((ConstraintLayout) view, appCompatImageView, c55251xgS, c55251xgS2, c55251xgS3, c57440yiU, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
