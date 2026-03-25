package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hER implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.LinearLayout AuCTel;
    public final android.widget.TextView DbNXlk;
    public final C55064xcr EZpvd;
    public final android.view.View KWHzl;
    public final C52794wYp OLrzqt;
    public final AppCompatImageView copydefault;
    public final AppCompatImageView djBIcL;
    public final RecyclerView fARcdN;
    public final android.widget.TextView fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AYXKKw;
    }

    public hER(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55064xcr c55064xcr, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.AYXKKw = linearLayout;
        this.AEQbTJ = textView;
        this.OLrzqt = c52794wYp;
        this.KWHzl = view;
        this.EZpvd = c55064xcr;
        this.copydefault = appCompatImageView;
        this.djBIcL = appCompatImageView2;
        this.AhwBna = textView2;
        this.gEmmrt = appCompatImageView3;
        this.valueOf = textView3;
        this.isConnected = textView4;
        this.fetchVPNInfo = textView5;
        this.DbNXlk = textView6;
        this.AkhnZx = textView7;
        this.values = textView8;
        this.fARcdN = recyclerView;
        this.AuCTel = linearLayout2;
    }

    public static hER copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.sILrnl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hER AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.AuCTelauCTel;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.fBE;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.hGuIrQ))) != null) {
                i = C23274hvD.Application.resume;
                C55064xcr c55064xcr = (C55064xcr) ViewBindings.findChildViewById(view, i);
                if (c55064xcr != null) {
                    i = C23274hvD.Application.HJWChPUUMfbK;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C23274hvD.Application.MediaSessionCompatApi24;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView2 != null) {
                            i = C23274hvD.Application.setActions;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C23274hvD.Application.getMaxItemsactivity_release;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView3 != null) {
                                    i = C23274hvD.Application.isSystemPickerAvailableactivity_release;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C23274hvD.Application.isSystemFallbackPickerAvailableactivity_release;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = C23274hvD.Application.isGmsPickerAvailableactivity_release;
                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                i = C23274hvD.Application.getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAXannotations;
                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView6 != null) {
                                                    i = C23274hvD.Application.ActivityResultContractsPickVisualMediaSingleMimeType;
                                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView7 != null) {
                                                        i = C23274hvD.Application.ActivityResultContractsTakeVideo;
                                                        android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView8 != null) {
                                                            i = C23274hvD.Application.DimenRes;
                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                            if (recyclerView != null) {
                                                                i = C23274hvD.Application.ContentView;
                                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout != null) {
                                                                    return new hER((android.widget.LinearLayout) view, textView, c52794wYp, viewFindChildViewById, c55064xcr, appCompatImageView, appCompatImageView2, textView2, appCompatImageView3, textView3, textView4, textView5, textView6, textView7, textView8, recyclerView, linearLayout);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
