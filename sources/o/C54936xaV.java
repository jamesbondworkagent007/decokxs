package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54936xaV implements ViewBinding {
    public final android.widget.RelativeLayout AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final OKEditText KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final wYC gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C54936xaV(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull wYC wyc) {
        this.copydefault = linearLayout;
        this.OLrzqt = textView;
        this.EZpvd = imageView;
        this.AEQbTJ = relativeLayout;
        this.KWHzl = oKEditText;
        this.gEmmrt = wyc;
    }

    public static C54936xaV KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.dHguZz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C54936xaV copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.hDKMBd;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C52761wXj.FragmentManager.AuCTelauCTel;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C52761wXj.FragmentManager.igXuih;
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = C52761wXj.FragmentManager.swzYdv;
                    OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
                    if (oKEditText != null) {
                        i = C52761wXj.FragmentManager.hvKCwS;
                        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                        if (wyc != null) {
                            return new C54936xaV((android.widget.LinearLayout) view, textView, imageView, relativeLayout, oKEditText, wyc);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
