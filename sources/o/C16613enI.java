package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16613enI implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final C16494ekw EZpvd;
    public final android.widget.TextView KWHzl;
    public final C16494ekw copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C16613enI(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C16494ekw c16494ekw, @androidx.annotation.NonNull C16494ekw c16494ekw2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = linearLayoutCompat;
        this.copydefault = c16494ekw;
        this.EZpvd = c16494ekw2;
        this.KWHzl = textView;
    }

    public static C16613enI AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.invokespecialaVhqwO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16613enI KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.RkASWs;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C16494ekw c16494ekwOLrzqt = C16494ekw.OLrzqt(viewFindChildViewById);
            int i2 = C13754dXa.ActionBar.RbVjfb;
            android.view.View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                C16494ekw c16494ekwOLrzqt2 = C16494ekw.OLrzqt(viewFindChildViewById2);
                int i3 = C13754dXa.ActionBar.CheckResult;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i3);
                if (textView != null) {
                    return new C16613enI((LinearLayoutCompat) view, c16494ekwOLrzqt, c16494ekwOLrzqt2, textView);
                }
                i = i3;
            } else {
                i = i2;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
