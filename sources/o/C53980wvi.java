package o;

import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.ConfirmInfoForSpotGridAddInvestment;
import com.okinc.unify_trade.biz.bot.SmartEarnProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wvi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53980wvi extends wXX {
    public final InterfaceC56387yDm AhwBna;
    public final boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final Function0<Unit> OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public C48391uPt djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    public C53980wvi(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wvm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53980wvi.djBIcL(this.AEQbTJ);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wvj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53980wvi.valueOf(this.copydefault);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wvl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C53980wvi.AYXKKw(this.AEQbTJ));
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wvk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53980wvi.gEmmrt(this.KWHzl);
            }
        });
        this.EZpvd = true;
    }

    /* JADX INFO: renamed from: o.wvi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wvi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C53980wvi EZpvd(@NotNull ConfirmInfoForSpotGridAddInvestment confirmInfoForSpotGridAddInvestment, @NotNull java.lang.String str, int i, @NotNull Function0<Unit> function0, SmartEarnProperties smartEarnProperties) {
            Intrinsics.checkNotNullParameter(confirmInfoForSpotGridAddInvestment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C53980wvi c53980wvi = new C53980wvi(function0);
            c53980wvi.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_CONFIRM_INFO", confirmInfoForSpotGridAddInvestment), C56390yDp.OLrzqt("KEY_SYMBOL", str), C56390yDp.OLrzqt("KEY_PRECISION", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("SmartEarnParamKey", smartEarnProperties)));
            return c53980wvi;
        }
    }

    public final ConfirmInfoForSpotGridAddInvestment OLrzqt() {
        return (ConfirmInfoForSpotGridAddInvestment) this.KWHzl.getValue();
    }

    public static final ConfirmInfoForSpotGridAddInvestment djBIcL(C53980wvi c53980wvi) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = c53980wvi.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("KEY_CONFIRM_INFO", ConfirmInfoForSpotGridAddInvestment.class);
        } else {
            java.lang.Object parcelable2 = arguments.getParcelable("KEY_CONFIRM_INFO");
            parcelable = (ConfirmInfoForSpotGridAddInvestment) (parcelable2 instanceof ConfirmInfoForSpotGridAddInvestment ? parcelable2 : null);
        }
        return (ConfirmInfoForSpotGridAddInvestment) parcelable;
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String valueOf(C53980wvi c53980wvi) {
        java.lang.String string;
        android.os.Bundle arguments = c53980wvi.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_SYMBOL")) == null) ? "USDT" : string;
    }

    private final int AEQbTJ() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final int AYXKKw(C53980wvi c53980wvi) {
        android.os.Bundle arguments = c53980wvi.getArguments();
        if (arguments != null) {
            return arguments.getInt("KEY_PRECISION");
        }
        return 2;
    }

    public final SmartEarnProperties EZpvd() {
        return (SmartEarnProperties) this.AhwBna.getValue();
    }

    public static final SmartEarnProperties gEmmrt(C53980wvi c53980wvi) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = c53980wvi.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("SmartEarnParamKey", SmartEarnProperties.class);
        } else {
            java.lang.Object parcelable2 = arguments.getParcelable("SmartEarnParamKey");
            parcelable = (SmartEarnProperties) (parcelable2 instanceof SmartEarnProperties ? parcelable2 : null);
        }
        return (SmartEarnProperties) parcelable;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(5);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setTitle("");
        wxq.setDividerVisibility(false);
        wxq.KWHzl().setVisibility(0);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = C48391uPt.AEQbTJ(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        copydefault();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOnClickListener(new Application(wyf, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
        }
    }

    private final void copydefault() {
        ConstraintLayout constraintLayout;
        SmartEarnProperties smartEarnPropertiesEZpvd;
        android.widget.TextView textView;
        java.lang.String trailingDownFund;
        ConstraintLayout constraintLayout2;
        android.widget.TextView textView2;
        java.lang.String reinvestProfitsQuoteAmount;
        android.widget.TextView textView3;
        java.lang.String topUpQuoteAmount;
        android.widget.TextView textView4;
        java.lang.String totalAddQuoteAmount;
        android.widget.ImageView imageView;
        java.lang.String strValueOf;
        C48391uPt c48391uPt = this.djBIcL;
        if (c48391uPt != null && (imageView = c48391uPt.isConnected) != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (strValueOf = interfaceC54581xNrOLrzqt.valueOf(KWHzl())) == null) {
                strValueOf = "";
            }
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(requireContext());
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, strValueOf, "lfit", 26, 26).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getContext())).djBIcL().EZpvd(imageView);
        }
        C48391uPt c48391uPt2 = this.djBIcL;
        java.lang.String str = "0";
        if (c48391uPt2 != null && (textView4 = c48391uPt2.EZpvd) != null) {
            ConfirmInfoForSpotGridAddInvestment confirmInfoForSpotGridAddInvestmentOLrzqt = OLrzqt();
            if (confirmInfoForSpotGridAddInvestmentOLrzqt == null || (totalAddQuoteAmount = confirmInfoForSpotGridAddInvestmentOLrzqt.getTotalAddQuoteAmount()) == null) {
                totalAddQuoteAmount = "0";
            }
            textView4.setText(C53930wul.copydefault(pTB.formatRoundToFixed$default(pTB.OLrzqt((java.lang.Object) totalAddQuoteAmount), AEQbTJ(), null, 2, null), KWHzl()));
        }
        C48391uPt c48391uPt3 = this.djBIcL;
        if (c48391uPt3 != null && (textView3 = c48391uPt3.valueOf) != null) {
            ConfirmInfoForSpotGridAddInvestment confirmInfoForSpotGridAddInvestmentOLrzqt2 = OLrzqt();
            if (confirmInfoForSpotGridAddInvestmentOLrzqt2 == null || (topUpQuoteAmount = confirmInfoForSpotGridAddInvestmentOLrzqt2.getTopUpQuoteAmount()) == null) {
                topUpQuoteAmount = "0";
            }
            textView3.setText(C53930wul.copydefault(pTB.formatRoundToFixed$default(pTB.OLrzqt((java.lang.Object) topUpQuoteAmount), AEQbTJ(), null, 2, null), KWHzl()));
        }
        C48391uPt c48391uPt4 = this.djBIcL;
        if (c48391uPt4 != null && (textView2 = c48391uPt4.AYXKKw) != null) {
            ConfirmInfoForSpotGridAddInvestment confirmInfoForSpotGridAddInvestmentOLrzqt3 = OLrzqt();
            if (confirmInfoForSpotGridAddInvestmentOLrzqt3 == null || (reinvestProfitsQuoteAmount = confirmInfoForSpotGridAddInvestmentOLrzqt3.getReinvestProfitsQuoteAmount()) == null) {
                reinvestProfitsQuoteAmount = "0";
            }
            textView2.setText(C53930wul.copydefault(pTB.formatRoundToFixed$default(pTB.OLrzqt((java.lang.Object) reinvestProfitsQuoteAmount), AEQbTJ(), null, 2, null), KWHzl()));
        }
        ConfirmInfoForSpotGridAddInvestment confirmInfoForSpotGridAddInvestmentOLrzqt4 = OLrzqt();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (confirmInfoForSpotGridAddInvestmentOLrzqt4 != null ? confirmInfoForSpotGridAddInvestmentOLrzqt4.getTrailingDownFund() : null))) {
            C48391uPt c48391uPt5 = this.djBIcL;
            if (c48391uPt5 != null && (constraintLayout2 = c48391uPt5.gEmmrt) != null) {
                constraintLayout2.setVisibility(0);
            }
            C48391uPt c48391uPt6 = this.djBIcL;
            if (c48391uPt6 != null && (textView = c48391uPt6.djBIcL) != null) {
                ConfirmInfoForSpotGridAddInvestment confirmInfoForSpotGridAddInvestmentOLrzqt5 = OLrzqt();
                if (confirmInfoForSpotGridAddInvestmentOLrzqt5 != null && (trailingDownFund = confirmInfoForSpotGridAddInvestmentOLrzqt5.getTrailingDownFund()) != null) {
                    str = trailingDownFund;
                }
                textView.setText(C53930wul.copydefault(pTB.formatRoundToFixed$default(pTB.OLrzqt((java.lang.Object) str), AEQbTJ(), null, 2, null), KWHzl()));
            }
        } else {
            C48391uPt c48391uPt7 = this.djBIcL;
            if (c48391uPt7 != null && (constraintLayout = c48391uPt7.gEmmrt) != null) {
                constraintLayout.setVisibility(8);
            }
        }
        C48391uPt c48391uPt8 = this.djBIcL;
        if (c48391uPt8 == null || (smartEarnPropertiesEZpvd = EZpvd()) == null || !smartEarnPropertiesEZpvd.getHasParametersSet()) {
            return;
        }
        OKReminder oKReminder = c48391uPt8.AhwBna;
        Intrinsics.copydefault(oKReminder);
        oKReminder.setVisibility(0);
        oKReminder.setStyle(2);
        oKReminder.setMessage((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.QSAYLr));
        oKReminder.setCloseIconVisibility(false);
    }

    /* JADX INFO: renamed from: o.wvi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53980wvi KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53980wvi c53980wvi) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c53980wvi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke();
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wvi$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C53980wvi AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53980wvi c53980wvi) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c53980wvi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
