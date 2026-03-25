package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23735iHj implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.FrameLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final C55251xgS AuCTel;
    public final android.widget.TextView DbNXlk;
    public final android.widget.LinearLayout EZpvd;
    public final wYC KWHzl;
    public final C55113xdn OLrzqt;
    public final ConstraintLayout copydefault;
    public final OKReminder djBIcL;
    public final android.widget.TextView fARcdN;
    public final wYC fIwbmz;
    public final LinearLayoutCompat fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final android.widget.TextView isConnected;
    public final RecyclerView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AhwBna;
    }

    public C23735iHj(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull wYC wyc2) {
        this.AhwBna = frameLayout;
        this.copydefault = constraintLayout;
        this.AEQbTJ = view;
        this.KWHzl = wyc;
        this.EZpvd = linearLayout;
        this.OLrzqt = c55113xdn;
        this.djBIcL = oKReminder;
        this.AYXKKw = linearLayout2;
        this.valueOf = recyclerView;
        this.gEmmrt = linearLayoutCompat;
        this.fetchVPNInfo = textView;
        this.AkhnZx = textView2;
        this.values = textView3;
        this.DbNXlk = textView4;
        this.isConnected = textView5;
        this.AuCTel = c55251xgS;
        this.fARcdN = textView6;
        this.fJNWhG = linearLayoutCompat2;
        this.fIwbmz = wyc2;
    }

    public static C23735iHj AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C23735iHj copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.ejfBZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23735iHj OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C25493ixk.ActionBar.RXzakW;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.DTg))) != null) {
            i = C25493ixk.ActionBar.DcMfJKDGTeJD;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C25493ixk.ActionBar.iWlNch;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C25493ixk.ActionBar.HJWChPRAkuRW;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        i = C25493ixk.ActionBar.fGT;
                        OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                        if (oKReminder != null) {
                            i = C25493ixk.ActionBar.OUcgGI;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C25493ixk.ActionBar.OqhRBM;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C25493ixk.ActionBar.putCallback;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat != null) {
                                        i = C25493ixk.ActionBar.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = C25493ixk.ActionBar.MediaDescriptionCompat1;
                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = C25493ixk.ActionBar.setExtras;
                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    i = C25493ixk.ActionBar.setMediaUri;
                                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        i = C25493ixk.ActionBar.MediaDescriptionCompatApi23;
                                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView5 != null) {
                                                            i = C25493ixk.ActionBar.MediaDescriptionCompatApi23Builder;
                                                            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                            if (c55251xgS != null) {
                                                                i = C25493ixk.ActionBar.newInstance;
                                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView6 != null) {
                                                                    i = C25493ixk.ActionBar.fastForward;
                                                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayoutCompat2 != null) {
                                                                        i = C25493ixk.ActionBar.adjustVolume;
                                                                        wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                                                                        if (wyc2 != null) {
                                                                            return new C23735iHj((android.widget.FrameLayout) view, constraintLayout, viewFindChildViewById, wyc, linearLayout, c55113xdn, oKReminder, linearLayout2, recyclerView, linearLayoutCompat, textView, textView2, textView3, textView4, textView5, c55251xgS, textView6, linearLayoutCompat2, wyc2);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
