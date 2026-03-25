package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50820vbP implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final C55251xgS fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C50820vbP(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull C55251xgS c55251xgS) {
        this.AhwBna = constraintLayout;
        this.copydefault = imageView;
        this.OLrzqt = imageView2;
        this.EZpvd = linearLayout;
        this.KWHzl = textView;
        this.AEQbTJ = recyclerView;
        this.valueOf = textView2;
        this.AYXKKw = textView3;
        this.gEmmrt = textView4;
        this.djBIcL = textView5;
        this.AkhnZx = textView6;
        this.isConnected = textView7;
        this.DbNXlk = textView8;
        this.fetchVPNInfo = c55251xgS;
    }

    public static C50820vbP AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.sEAkxl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C50820vbP OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.INotificationSideChannelStub;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C48033uCm.Application.getNotifyChildrenChangedOptions;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C48033uCm.Application.MediaDescriptionCompatApi21Builder;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C48033uCm.Application.onQueueChanged;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C48033uCm.Application.IResultReceiverStub;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C48033uCm.Application.calculateNightMode;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C48033uCm.Application.ensureSubDecor;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C48033uCm.Application.throwFeatureRequestIfSubDecorInstalled;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = C48033uCm.Application.shouldAnimateActionModeView;
                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            i = C48033uCm.Application.AppCompatDelegateImplActionBarMenuCallback;
                                            android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView6 != null) {
                                                i = C48033uCm.Application.detect;
                                                android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView7 != null) {
                                                    i = C48033uCm.Application.onNothingSelected;
                                                    android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView8 != null) {
                                                        i = C48033uCm.Application.flushMarshmallows;
                                                        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                        if (c55251xgS != null) {
                                                            return new C50820vbP((ConstraintLayout) view, imageView, imageView2, linearLayout, textView, recyclerView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, c55251xgS);
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
