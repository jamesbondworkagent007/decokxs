package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16415ejW implements ViewBinding {
    public final wYC AEQbTJ;
    public final OKEditText EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final wYC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C16415ejW(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull wYC wyc2) {
        this.KWHzl = linearLayout;
        this.copydefault = wyc;
        this.EZpvd = oKEditText;
        this.AEQbTJ = wyc2;
    }

    public static C16415ejW copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DCUTEIdCUTEI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C16415ejW OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DcMfJKDDUqPf;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C13754dXa.ActionBar.OzhFjl;
            OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
            if (oKEditText != null) {
                i = C13754dXa.ActionBar.MediaControllerCompatApi23;
                wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                if (wyc2 != null) {
                    return new C16415ejW((android.widget.LinearLayout) view, wyc, oKEditText, wyc2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
