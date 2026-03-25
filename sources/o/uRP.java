package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uRP implements ViewBinding {
    public final C48427uRL EZpvd;
    public final C48427uRL KWHzl;
    public final LinearLayoutCompat OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public uRP(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C48427uRL c48427uRL, @androidx.annotation.NonNull C48427uRL c48427uRL2) {
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = c48427uRL;
        this.KWHzl = c48427uRL2;
    }

    public static uRP copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.requestPostMessageChannelWithExtras;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C48427uRL c48427uRLOLrzqt = C48427uRL.OLrzqt(viewFindChildViewById);
            int i2 = C48033uCm.Application.updateVisuals;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                return new uRP((LinearLayoutCompat) view, c48427uRLOLrzqt, C48427uRL.OLrzqt(viewFindChildViewById2));
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
