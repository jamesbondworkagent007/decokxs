package o;

import androidx.appcompat.widget.MyLinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ety, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16973ety implements ViewBinding {
    public final MyLinearLayout AEQbTJ;
    public final MyLinearLayout AYXKKw;
    public final C17018euq AhwBna;
    public final C17120ewm EZpvd;
    public final android.widget.Space KWHzl;
    public final C17118ewk OLrzqt;
    public final C17122ewo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public MyLinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C16973ety(@androidx.annotation.NonNull MyLinearLayout myLinearLayout, @androidx.annotation.NonNull C17120ewm c17120ewm, @androidx.annotation.NonNull C17118ewk c17118ewk, @androidx.annotation.NonNull C17122ewo c17122ewo, @androidx.annotation.NonNull android.widget.Space space, @androidx.annotation.NonNull MyLinearLayout myLinearLayout2, @androidx.annotation.NonNull C17018euq c17018euq) {
        this.AEQbTJ = myLinearLayout;
        this.EZpvd = c17120ewm;
        this.OLrzqt = c17118ewk;
        this.copydefault = c17122ewo;
        this.KWHzl = space;
        this.AYXKKw = myLinearLayout2;
        this.AhwBna = c17018euq;
    }

    public static C16973ety copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DuQ;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C17120ewm c17120ewmCopydefault = C17120ewm.copydefault(viewFindChildViewById);
            i = C13754dXa.ActionBar.ZaDspl;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById2 != null) {
                C17118ewk c17118ewkKWHzl = C17118ewk.KWHzl(viewFindChildViewById2);
                i = C13754dXa.ActionBar.dESsmu;
                android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById3 != null) {
                    C17122ewo c17122ewoEZpvd = C17122ewo.EZpvd(viewFindChildViewById3);
                    i = C13754dXa.ActionBar.removeSubscription;
                    android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
                    if (space != null) {
                        MyLinearLayout myLinearLayout = (MyLinearLayout) view;
                        i = C13754dXa.ActionBar.getNavigationItemCount;
                        android.view.View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                        if (viewFindChildViewById4 != null) {
                            return new C16973ety(myLinearLayout, c17120ewmCopydefault, c17118ewkKWHzl, c17122ewoEZpvd, space, myLinearLayout, C17018euq.EZpvd(viewFindChildViewById4));
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
