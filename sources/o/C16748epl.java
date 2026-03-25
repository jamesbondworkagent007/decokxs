package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16748epl implements ViewBinding {
    public final Barrier AEQbTJ;
    public final android.widget.ImageView AhwBna;
    public final android.view.View EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.ImageView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C16748epl(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ImageView imageView4) {
        this.gEmmrt = constraintLayout;
        this.AEQbTJ = barrier;
        this.OLrzqt = textView;
        this.KWHzl = imageView;
        this.copydefault = imageView2;
        this.EZpvd = view;
        this.djBIcL = imageView3;
        this.valueOf = textView2;
        this.AhwBna = imageView4;
    }

    public static C16748epl copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DcMfJKRKUgwx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16748epl copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.USBtdM;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C13754dXa.ActionBar.invokespecialatDTRm;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C13754dXa.ActionBar.DvMhtu;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C13754dXa.ActionBar.UUsvzU;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.GVpNrsfQMcgE))) != null) {
                        i = C13754dXa.ActionBar.fromMediaItemList;
                        android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = C13754dXa.ActionBar.getDescription;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C13754dXa.ActionBar.removeQueueItem;
                                android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    return new C16748epl((ConstraintLayout) view, barrier, textView, imageView, imageView2, viewFindChildViewById, imageView3, textView2, imageView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
