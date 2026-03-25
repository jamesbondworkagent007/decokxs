package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21553hDq implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final wYC KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final wYC copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C21553hDq(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = linearLayout;
        this.copydefault = wyc;
        this.KWHzl = wyc2;
        this.AEQbTJ = imageView;
        this.OLrzqt = imageView2;
        this.valueOf = textView;
    }

    public static C21553hDq OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.getAdvertisingId, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21553hDq EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OFnBcz;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C23274hvD.Application.INotificationSideChannel_Parcel;
            wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc2 != null) {
                i = C23274hvD.Application.onReceiveResult;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C23274hvD.Application.indexOfTransition;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new C21553hDq((android.widget.LinearLayout) view, wyc, wyc2, imageView, imageView2, textView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
