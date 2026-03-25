package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21550hDn implements ViewBinding {
    public final wYC AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final AppCompatTextView AuCTel;
    public final android.widget.TextView AubY;
    public final SwitchCompat DbNXlk;
    public final wYC EZpvd;
    public final ConstraintLayout KWHzl;
    public final C55052xcf OLrzqt;
    public final wYC copydefault;
    public final ConstraintLayout djBIcL;
    public final AppCompatTextView ejfBZ;
    public final C55258xgZ fARcdN;
    public final AppCompatTextView fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final android.widget.TextView getNewProxyInstance;
    public final AppCompatTextView hDKMBd;
    public final ConstraintLayout isConnected;
    public final android.widget.TextView iwGUEr;
    public final android.widget.TextView uzCIH;
    public final android.widget.LinearLayout valueOf;
    public final ConstraintLayout values;
    public final android.widget.TextView zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.values;
    }

    public C21550hDn(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull wYC wyc3, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull SwitchCompat switchCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8) {
        this.values = constraintLayout;
        this.KWHzl = constraintLayout2;
        this.OLrzqt = c55052xcf;
        this.copydefault = wyc;
        this.EZpvd = wyc2;
        this.AEQbTJ = wyc3;
        this.gEmmrt = imageView;
        this.AYXKKw = linearLayoutCompat;
        this.djBIcL = constraintLayout3;
        this.AhwBna = linearLayout;
        this.valueOf = linearLayout2;
        this.isConnected = constraintLayout4;
        this.DbNXlk = switchCompat;
        this.fetchVPNInfo = textView;
        this.AkhnZx = textView2;
        this.fARcdN = c55258xgZ;
        this.fJNWhG = appCompatTextView;
        this.ejfBZ = appCompatTextView2;
        this.fIwbmz = appCompatTextView3;
        this.AuCTel = appCompatTextView4;
        this.getNewProxyInstance = textView3;
        this.hDKMBd = appCompatTextView5;
        this.getFieldNames = textView4;
        this.iwGUEr = textView5;
        this.uzCIH = textView6;
        this.AubY = textView7;
        this.zLjUOn = textView8;
    }

    public static C21550hDn EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DcMfJKfNLfdT, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21550hDn copydefault(@androidx.annotation.NonNull android.view.View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C23274hvD.Application.onStatusChanged;
        C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
        if (c55052xcf != null) {
            i = C23274hvD.Application.RIsQag;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C23274hvD.Application.zFZsbn;
                wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                if (wyc2 != null) {
                    i = C23274hvD.Application.RsCxkX;
                    wYC wyc3 = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc3 != null) {
                        i = C23274hvD.Application.DuQ;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C23274hvD.Application.isCaptioningEnabled;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = C23274hvD.Application.isShuffleModeEnabledRemoved;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = C23274hvD.Application.rateWithExtras;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = C23274hvD.Application.MediaControllerCompat;
                                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout2 != null) {
                                            i = C23274hvD.Application.MediaControllerCompatTransportControlsBase;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout3 != null) {
                                                i = C23274hvD.Application.ContextAwareHelper;
                                                SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                                                if (switchCompat != null) {
                                                    i = C23274hvD.Application.PickVisualMediaRequest;
                                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView != null) {
                                                        i = C23274hvD.Application.PickVisualMediaRequestBuilder;
                                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView2 != null) {
                                                            i = C23274hvD.Application.flag;
                                                            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                                            if (c55258xgZ != null) {
                                                                i = C23274hvD.Application.RequiresOptInLevel;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView != null) {
                                                                    i = C23274hvD.Application.allOf;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView2 != null) {
                                                                        i = C23274hvD.Application.anyOf;
                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView3 != null) {
                                                                            i = C23274hvD.Application.conditional;
                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView4 != null) {
                                                                                i = C23274hvD.Application.setButton;
                                                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView3 != null) {
                                                                                    i = C23274hvD.Application.onKeyDown;
                                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (appCompatTextView5 != null) {
                                                                                        i = C23274hvD.Application.checkShowingFlags;
                                                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView4 != null) {
                                                                                            i = C23274hvD.Application.getAlpha;
                                                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView5 != null) {
                                                                                                i = C23274hvD.Application.isAutoMirrored;
                                                                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView6 != null) {
                                                                                                    i = C23274hvD.Application.onBoundsChange;
                                                                                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView7 != null) {
                                                                                                        i = C23274hvD.Application.getStateDrawable;
                                                                                                        android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView8 != null) {
                                                                                                            return new C21550hDn(constraintLayout, constraintLayout, c55052xcf, wyc, wyc2, wyc3, imageView, linearLayoutCompat, constraintLayout2, linearLayout, linearLayout2, constraintLayout3, switchCompat, textView, textView2, c55258xgZ, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, textView3, appCompatTextView5, textView4, textView5, textView6, textView7, textView8);
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
