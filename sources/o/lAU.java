package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.buysell.analytics.PaymentsTrackerAttrType;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.okx.paymentapi.service.BscDepositBottomSheetParameters;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.InterfaceC47251tmX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lAU extends AbstractC52780wYb {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ = true;
    public Function0<Unit> KWHzl;
    public boolean copydefault;

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DsL);
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("fiat_currency") : null;
        java.lang.String str = string == null ? "" : string;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("crypto_currency") : null;
        C31354lsT.trackBuyFlowDepositBottomSheetViewOrButtonClick$default(C31354lsT.KWHzl, null, string2 == null ? "" : string2, str, false, 9, null);
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        c54953xam.OLrzqt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.sendBehavioSecData));
        c54953xam.OLrzqt.setTextColor(requireContext().getColorStateList(C52761wXj.Activity.DCUTEIddSDPG));
        c54953xam.KWHzl.setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        android.os.Bundle arguments = getArguments();
        final java.lang.String string = arguments != null ? arguments.getString("fiat_currency") : null;
        if (string == null) {
            string = "";
        }
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("crypto_currency") : null;
        final java.lang.String str = string2 != null ? string2 : "";
        android.os.Bundle arguments3 = getArguments();
        final int iAhwBna = C33129mqd.AhwBna(arguments3 != null ? java.lang.Integer.valueOf(arguments3.getInt("crypto_currency_id")) : null);
        wyf.setType(7);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        wyf.setPrimaryText(C33070mpX.AYXKKw(C31351lsQ.Activity.getStatusCode));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C31351lsQ.Activity.fbC));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.lAT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lAU.EZpvd(this.KWHzl, str, string, view);
                }
            });
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.lAW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lAU.EZpvd(this.OLrzqt, str, string, iAhwBna, view);
                }
            });
        }
    }

    public static final void EZpvd(lAU lau, java.lang.String str, java.lang.String str2, android.view.View view) {
        lau.EZpvd(str, str2);
    }

    public static final void EZpvd(lAU lau, java.lang.String str, java.lang.String str2, int i, android.view.View view) {
        lau.AEQbTJ(str, str2, i);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        C31354lsT.trackBuyFlowDepositBottomSheetViewOrButtonClick$default(C31354lsT.KWHzl, PaymentsTrackerAttrType.BUTTON_CLICK, str, str2, false, 8, null);
        dismissAllowingStateLoss();
        DepositWithdrawPageParameters depositWithdrawPageParameters = new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositPage(str2, null, null, 6, null), OKPaymentSource.PAYMENT_INTERNAL_FLOW);
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default(interfaceC47251tmX, fragmentActivityRequireActivity, depositWithdrawPageParameters, null, null, 12, null);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, int i) {
        kotlin.Pair pairOLrzqt;
        C31354lsT.KWHzl.KWHzl(PaymentsTrackerAttrType.BUTTON_CLICK, str, str2, true);
        dismissAllowingStateLoss();
        ABTestFeatureFlag aBTestFeatureFlag = ABTestFeatureFlag.BSC_TRADING_ACCOUNT;
        if (C30327lUg.AEQbTJ(aBTestFeatureFlag) && this.AEQbTJ) {
            Function0<Unit> function0 = this.KWHzl;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (C30327lUg.AEQbTJ(aBTestFeatureFlag)) {
            pairOLrzqt = C56390yDp.OLrzqt(6, 18);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(18, 6);
        }
        TransferDetail transferDetail = new TransferDetail(new TransferDetail.Target(java.lang.Integer.valueOf(((java.lang.Number) pairOLrzqt.component1()).intValue())), new TransferDetail.Target(java.lang.Integer.valueOf(((java.lang.Number) pairOLrzqt.component2()).intValue())), java.lang.Integer.valueOf(i), null, false, false, null, 120, null);
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC31670lzr.copydefault(fragmentActivityRequireActivity, transferDetail);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lAU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final lAU KWHzl(@NotNull BscDepositBottomSheetParameters bscDepositBottomSheetParameters) {
            Intrinsics.checkNotNullParameter(bscDepositBottomSheetParameters, "");
            lAU lau = new lAU();
            lau.copydefault = bscDepositBottomSheetParameters.AYXKKw();
            lau.AEQbTJ = bscDepositBottomSheetParameters.KWHzl();
            lau.KWHzl = bscDepositBottomSheetParameters.copydefault();
            lau.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("fiat_currency", bscDepositBottomSheetParameters.AEQbTJ()), C56390yDp.OLrzqt("crypto_currency", bscDepositBottomSheetParameters.EZpvd()), C56390yDp.OLrzqt("crypto_currency_id", java.lang.Integer.valueOf(bscDepositBottomSheetParameters.OLrzqt()))));
            return lau;
        }
    }
}
