package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC18493fjT;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fAJ extends AbstractC52796wYr {
    public Function1<? super java.lang.Integer, Unit> EZpvd;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public java.lang.String KWHzl = "";
    public java.lang.String copydefault = "";
    public int djBIcL = WalletType.HDWallet.ordinal();
    public java.lang.String valueOf = "";
    public boolean OLrzqt = true;
    public boolean AhwBna = true;
    public boolean gEmmrt = true;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fAJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final fAJ AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, boolean z, boolean z2, boolean z3, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(function1, "");
            fAJ faj = new fAJ();
            faj.EZpvd = function1;
            faj.KWHzl = str;
            faj.copydefault = str2;
            faj.djBIcL = i;
            faj.valueOf = str3;
            faj.OLrzqt = z;
            faj.AhwBna = z2;
            faj.gEmmrt = z3;
            return faj;
        }
    }

    @Override // o.AbstractC52796wYr, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AEQbTJ();
        constraintLayout.post(new java.lang.Runnable() { // from class: o.fAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fAJ.gEmmrt(this.AEQbTJ);
            }
        });
    }

    public static final void gEmmrt(fAJ faj) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) faj, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wYr.setHeaderType$default(o.wYr, int, int, java.lang.Object):void */
    private final void AEQbTJ() {
        ConstraintLayout constraintLayout;
        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        boolean z = false;
        boolean z2 = dtq != null && dtq.copydefault();
        android.widget.TextView textViewFARcdN = fARcdN();
        if (textViewFARcdN != null) {
            textViewFARcdN.setVisibility(0);
        }
        android.widget.TextView textViewFARcdN2 = fARcdN();
        if (textViewFARcdN2 != null) {
            textViewFARcdN2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hasEnabledCallbacks));
        }
        AbstractC52796wYr.setHeaderType$default(this, 0, 1, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C55377xim c55377xim = new C55377xim(fragmentActivityRequireActivity, null, 2, null);
        c55377xim.setStartDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.OmPrLP));
        android.graphics.drawable.Drawable drawableDjBIcL = c55377xim.djBIcL();
        if (drawableDjBIcL != null) {
            drawableDjBIcL.setTint(C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
        }
        if (z2) {
            c55377xim.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.vqBjd));
            c55377xim.setDescriptionText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sJPPOI));
        } else {
            c55377xim.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RAaltf));
            c55377xim.setDescriptionText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DRuYWY));
        }
        c55377xim.setEndDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLI));
        android.graphics.drawable.Drawable drawableAEQbTJ = c55377xim.AEQbTJ();
        if (drawableAEQbTJ != null) {
            drawableAEQbTJ.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        c55377xim.setClickCallback(new Function0() { // from class: o.fAR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fAJ.AYXKKw(this.AEQbTJ);
            }
        });
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        C55377xim c55377xim2 = new C55377xim(fragmentActivityRequireActivity2, null, 2, null);
        c55377xim2.setStartDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.QWSkGZ));
        android.graphics.drawable.Drawable drawableDjBIcL2 = c55377xim2.djBIcL();
        if (drawableDjBIcL2 != null) {
            drawableDjBIcL2.setTint(C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
        }
        c55377xim2.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OqhRBM));
        c55377xim2.setDescriptionText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OqhRBMiKdSzF));
        c55377xim2.setEndDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLI));
        android.graphics.drawable.Drawable drawableAEQbTJ2 = c55377xim2.AEQbTJ();
        if (drawableAEQbTJ2 != null) {
            drawableAEQbTJ2.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        c55377xim2.setClickCallback(new Function0() { // from class: o.fAT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fAJ.valueOf(this.AEQbTJ);
            }
        });
        FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
        C55377xim c55377xim3 = new C55377xim(fragmentActivityRequireActivity3, null, 2, null);
        c55377xim3.setStartDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.OLrzqt));
        android.graphics.drawable.Drawable drawableDjBIcL3 = c55377xim3.djBIcL();
        if (drawableDjBIcL3 != null) {
            drawableDjBIcL3.setTint(C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
        }
        c55377xim3.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dPaqAf));
        c55377xim3.setDescriptionText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DvMhtu));
        c55377xim3.setEndDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLI));
        android.graphics.drawable.Drawable drawableAEQbTJ3 = c55377xim3.AEQbTJ();
        if (drawableAEQbTJ3 != null) {
            drawableAEQbTJ3.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        c55377xim3.setClickCallback(new Function0() { // from class: o.fAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fAJ.copydefault(this.KWHzl);
            }
        });
        FragmentActivity fragmentActivityRequireActivity4 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity4, "");
        final C55377xim c55377xim4 = new C55377xim(fragmentActivityRequireActivity4, null, 2, null);
        c55377xim4.setStartDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.sSi));
        android.graphics.drawable.Drawable drawableDjBIcL4 = c55377xim4.djBIcL();
        if (drawableDjBIcL4 != null) {
            drawableDjBIcL4.setTint(C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
        }
        c55377xim4.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setCallbacksMessenger));
        c55377xim4.setDescriptionText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onProgressUpdate));
        c55377xim4.setEndDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLI));
        android.graphics.drawable.Drawable drawableAEQbTJ4 = c55377xim4.AEQbTJ();
        if (drawableAEQbTJ4 != null) {
            drawableAEQbTJ4.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        c55377xim4.setClickCallback(new Function0() { // from class: o.fAV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fAJ.AEQbTJ(c55377xim4, this);
            }
        });
        if (z2 && this.djBIcL == WalletType.HDWallet.ordinal()) {
            z = true;
        }
        if (this.gEmmrt) {
            arrayList.add(c55377xim);
            if (z) {
                arrayList.add(c55377xim2);
            }
        }
        if (this.OLrzqt) {
            arrayList.add(c55377xim3);
        }
        if (!z && this.copydefault.length() > 0 && !C14728dqt.KWHzl.OLrzqt() && this.AhwBna) {
            arrayList.add(c55377xim4);
        }
        EZpvd(arrayList);
        C54946xaf binding = getBinding();
        ViewGroup.LayoutParams layoutParams = (binding == null || (constraintLayout = binding.AEQbTJ) == null) ? null : constraintLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = C55298xhM.dp2px$default(40.0f, null, 1, null);
        }
    }

    public static final Unit AYXKKw(fAJ faj) {
        C32866mlf.onEvent$default("Web3WalletManagement_Sheet_AddAccountList_Click", (TrackChannel[]) null, new Function1() { // from class: o.fAN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fAJ.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (faj.djBIcL == WalletType.MPCWallet.ordinal()) {
            C32866mlf.onEvent$default("Web3CreatMPCWallet_Button_Api_Click", (TrackChannel[]) null, new Function1() { // from class: o.fAM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fAJ.djBIcL((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        Function1<? super java.lang.Integer, Unit> function1 = faj.EZpvd;
        if (function1 != null) {
            function1.invoke(1);
        }
        faj.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("add_option", "basic_account", true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("derived_type", TxToastCheckRes.EOA_ADDRESS_TYPE, true));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(fAJ faj) {
        C32866mlf.onEvent$default("Web3WalletManagement_Popup_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        Function1<? super java.lang.Integer, Unit> function1 = faj.EZpvd;
        if (function1 != null) {
            function1.invoke(3);
        }
        faj.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(fAJ faj) {
        C32866mlf.onEvent$default("Web3WalletManagement_AccountSheet_SmartAccount_Click", (TrackChannel[]) null, new Function1() { // from class: o.fAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fAJ.AhwBna((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C32866mlf.onEvent$default("Web3WalletManagement_Sheet_AddAccountList_Click", (TrackChannel[]) null, new Function1() { // from class: o.fAQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fAJ.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (faj.djBIcL == WalletType.MPCWallet.ordinal()) {
            C32866mlf.onEvent$default("Web3CreatMPCWallet_Button_Api_Click", (TrackChannel[]) null, new Function1() { // from class: o.fAP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fAJ.AYXKKw((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        Function1<? super java.lang.Integer, Unit> function1 = faj.EZpvd;
        if (function1 != null) {
            function1.invoke(2);
        }
        faj.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("wallet_type", fNC.OLrzqt.AEQbTJ(WalletType.HDWallet), true));
        eventParamsList.add(new EventParam("resource", "wallet_management", true));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("add_option", "aa_account", true));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("derived_type", "aa", true));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C55377xim c55377xim, fAJ faj) {
        ActivityC18493fjT.Application application = ActivityC18493fjT.Companion;
        android.content.Context context = c55377xim.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        application.OLrzqt(context, faj.KWHzl, faj.copydefault, faj.djBIcL, faj.valueOf);
        faj.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
