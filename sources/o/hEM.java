package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEM implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final RecyclerView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final android.view.View EZpvd;
    public final C55064xcr KWHzl;
    public final AppCompatImageView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final AppCompatImageView valueOf;
    public final C52794wYp values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public hEM(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55064xcr c55064xcr, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AhwBna = constraintLayout;
        this.EZpvd = view;
        this.KWHzl = c55064xcr;
        this.copydefault = linearLayout;
        this.OLrzqt = appCompatImageView;
        this.AEQbTJ = textView;
        this.djBIcL = linearLayout2;
        this.valueOf = appCompatImageView2;
        this.AYXKKw = textView2;
        this.gEmmrt = textView3;
        this.isConnected = textView4;
        this.fetchVPNInfo = textView5;
        this.DbNXlk = textView6;
        this.values = c52794wYp;
        this.AkhnZx = recyclerView;
    }

    public static hEM EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DBAlnt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hEM KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.hGuIrQ;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.resume;
            C55064xcr c55064xcr = (C55064xcr) ViewBindings.findChildViewById(view, i);
            if (c55064xcr != null) {
                i = C23274hvD.Application.isInitInProgress;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C23274hvD.Application.MediaSessionCompatApi24;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C23274hvD.Application.toKeyCode;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C23274hvD.Application.ActivityResultContract;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C23274hvD.Application.getMaxItemsactivity_release;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView2 != null) {
                                    i = C23274hvD.Application.isSystemPickerAvailableactivity_release;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C23274hvD.Application.isSystemFallbackPickerAvailableactivity_release;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = C23274hvD.Application.isGmsPickerAvailableactivity_release;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C23274hvD.Application.getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAXannotations;
                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = C23274hvD.Application.ActivityResultContractsPickVisualMediaSingleMimeType;
                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        i = C23274hvD.Application.BinderThread;
                                                        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                                        if (c52794wYp != null) {
                                                            i = C23274hvD.Application.DimenRes;
                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                            if (recyclerView != null) {
                                                                return new hEM((ConstraintLayout) view, viewFindChildViewById, c55064xcr, linearLayout, appCompatImageView, textView, linearLayout2, appCompatImageView2, textView2, textView3, textView4, textView5, textView6, c52794wYp, recyclerView);
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
