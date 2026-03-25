package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21655hHk implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55258xgZ AhwBna;
    public final C55258xgZ AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final wYC EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final LinearLayoutCompat djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final C55258xgZ hDKMBd;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView uzCIH;
    public final LinearLayoutCompat valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.valueOf;
    }

    public C21655hHk(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat5, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat6, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat7, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55258xgZ c55258xgZ2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull android.widget.TextView textView9, @androidx.annotation.NonNull android.widget.TextView textView10, @androidx.annotation.NonNull android.widget.TextView textView11, @androidx.annotation.NonNull android.widget.TextView textView12, @androidx.annotation.NonNull C55258xgZ c55258xgZ3) {
        this.valueOf = linearLayoutCompat;
        this.KWHzl = linearLayoutCompat2;
        this.copydefault = linearLayoutCompat3;
        this.AEQbTJ = linearLayoutCompat4;
        this.OLrzqt = linearLayoutCompat5;
        this.EZpvd = wyc;
        this.gEmmrt = linearLayoutCompat6;
        this.djBIcL = linearLayoutCompat7;
        this.AYXKKw = textView;
        this.AhwBna = c55258xgZ;
        this.values = textView2;
        this.AkhnZx = c55258xgZ2;
        this.DbNXlk = textView3;
        this.fetchVPNInfo = textView4;
        this.isConnected = textView5;
        this.fIwbmz = textView6;
        this.fARcdN = textView7;
        this.fJNWhG = textView8;
        this.ejfBZ = textView9;
        this.AuCTel = textView10;
        this.uzCIH = textView11;
        this.getFieldNames = textView12;
        this.hDKMBd = c55258xgZ3;
    }

    public static C21655hHk KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.IYdWPz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21655hHk EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.sbu;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C23274hvD.Application.cancel;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = C23274hvD.Application.glVQsU;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat3 != null) {
                    i = C23274hvD.Application.QslYrK;
                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat4 != null) {
                        i = C23274hvD.Application.ikcuIV;
                        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                        if (wyc != null) {
                            i = C23274hvD.Application.ParcelableVolumeInfo1;
                            LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat5 != null) {
                                i = C23274hvD.Application.AnyRes;
                                LinearLayoutCompat linearLayoutCompat6 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat6 != null) {
                                    i = C23274hvD.Application.level;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C23274hvD.Application.RequiresPermission;
                                        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                        if (c55258xgZ != null) {
                                            i = C23274hvD.Application.RequiresPermissionWrite;
                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = C23274hvD.Application.addOnMenuVisibilityListener;
                                                C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                                if (c55258xgZ2 != null) {
                                                    i = C23274hvD.Application.setSupportActionBar;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = C23274hvD.Application.AppCompatDelegateImplPanelFeatureStateSavedState;
                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            i = C23274hvD.Application.AppCompatDelegateImplPanelFeatureStateSavedState1;
                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                i = C23274hvD.Application.readFromParcel;
                                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView6 != null) {
                                                                    i = C23274hvD.Application.getCurrentIndex;
                                                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView7 != null) {
                                                                        i = C23274hvD.Application.unwrap;
                                                                        android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView8 != null) {
                                                                            i = C23274hvD.Application.computeConstantSize;
                                                                            android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView9 != null) {
                                                                                i = C23274hvD.Application.canConstantState;
                                                                                android.widget.TextView textView10 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView10 != null) {
                                                                                    i = C23274hvD.Application.addChild;
                                                                                    android.widget.TextView textView11 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView11 != null) {
                                                                                        i = C23274hvD.Application.setBarLength;
                                                                                        android.widget.TextView textView12 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView12 != null) {
                                                                                            i = C23274hvD.Application.setArrowShaftLength;
                                                                                            C55258xgZ c55258xgZ3 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                                                                            if (c55258xgZ3 != null) {
                                                                                                return new C21655hHk((LinearLayoutCompat) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, wyc, linearLayoutCompat5, linearLayoutCompat6, textView, c55258xgZ, textView2, c55258xgZ2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, c55258xgZ3);
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
