package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hAX implements ViewBinding {
    public final C55052xcf AEQbTJ;
    public final SwitchCompat AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final OKSortTextView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final C55258xgZ djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public hAX(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull SwitchCompat switchCompat, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = linearLayoutCompat;
        this.AEQbTJ = c55052xcf;
        this.copydefault = imageView;
        this.OLrzqt = oKSortTextView;
        this.EZpvd = linearLayoutCompat2;
        this.AhwBna = switchCompat;
        this.djBIcL = c55258xgZ;
        this.gEmmrt = textView;
    }

    public static hAX KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fBE, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hAX copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OqCbbx;
        C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
        if (c55052xcf != null) {
            i = C23274hvD.Application.hijVBL;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.build;
                OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                if (oKSortTextView != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                    i = C23274hvD.Application.ContextAwareHelper;
                    SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                    if (switchCompat != null) {
                        i = C23274hvD.Application.flag;
                        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ != null) {
                            i = C23274hvD.Application.dispatchKeyEvent;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new hAX(linearLayoutCompat, c55052xcf, imageView, oKSortTextView, linearLayoutCompat, switchCompat, c55258xgZ, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
