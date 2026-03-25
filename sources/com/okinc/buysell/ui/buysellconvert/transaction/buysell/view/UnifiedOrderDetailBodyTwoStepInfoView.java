package com.okinc.buysell.ui.buysellconvert.transaction.buysell.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.okinc.buysell.api.BuySellTradeType;
import com.okinc.buysell.ui.buysellconvert.transaction.buysell.view.UnifiedOrderDetailBodyTwoStepInfoView;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.HistoryOrderStatus;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C30041lJs;
import o.C31351lsQ;
import o.C33070mpX;
import o.C3682AqZ;
import o.C3715ArF;
import o.C43251rlk;
import o.C52761wXj;
import o.C54819xWm;
import o.C56444yFp;
import o.InterfaceC47251tmX;
import o.InterfaceC56445yFq;
import o.lSZ;
import o.lxM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class UnifiedOrderDetailBodyTwoStepInfoView extends FrameLayout {
    public final lxM EZpvd;
    public static final Companion Companion = new Companion(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Companion.TopUpOrderStatus.values().length];
            try {
                iArr[Companion.TopUpOrderStatus.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.TopUpOrderStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Companion.TopUpOrderStatus.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Companion.TopUpOrderStatus.REVERSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Companion.TopUpOrderStatus.REVERSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Companion.TopUpOrderStatus.NOT_STARTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnifiedOrderDetailBodyTwoStepInfoView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:30) call: com.okinc.buysell.ui.buysellconvert.transaction.buysell.view.UnifiedOrderDetailBodyTwoStepInfoView.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ UnifiedOrderDetailBodyTwoStepInfoView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedOrderDetailBodyTwoStepInfoView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), C31351lsQ.ActionBar.htlTjW, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (lxM) viewDataBindingInflate;
    }

    public final void setData(@NotNull final C3682AqZ c3682AqZ, @NotNull final C3715ArF c3715ArF, @NotNull final C3715ArF c3715ArF2) {
        Intrinsics.checkNotNullParameter(c3682AqZ, "");
        Intrinsics.checkNotNullParameter(c3715ArF, "");
        Intrinsics.checkNotNullParameter(c3715ArF2, "");
        lxM lxm = this.EZpvd;
        lxm.OLrzqt.setText(c3715ArF.AEQbTJ());
        Companion.TopUpOrderStatus topUpOrderStatusCopydefault = copydefault(c3715ArF);
        int[] iArr = Activity.OLrzqt;
        int i = iArr[topUpOrderStatusCopydefault.ordinal()];
        if (i == 1) {
            lxm.EZpvd.setImageResource(C52761wXj.TaskDescription.RXzakW);
        } else if (i == 2) {
            lxm.EZpvd.setImageDrawable(ResourcesCompat.getDrawable(getResources(), C52761wXj.TaskDescription.TarCU, null));
            lxm.EZpvd.setColorFilter(getResources().getColor(C52761wXj.Activity.fdOvFl, null));
        } else if (i == 3) {
            lxm.EZpvd.setImageResource(C52761wXj.TaskDescription.gqESXP);
        } else if (i == 4) {
            lxm.EZpvd.setImageResource(C52761wXj.TaskDescription.RXzakW);
            lxm.KWHzl.setVisibility(0);
            lxm.KWHzl.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.hrjNmC));
        } else if (i == 5) {
            lxm.EZpvd.setImageResource(C52761wXj.TaskDescription.QVMIlxQVMIlx);
            lxm.KWHzl.setVisibility(0);
            lxm.KWHzl.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fGQ));
        } else {
            lxm.djBIcL.setVisibility(8);
            lxm.AEQbTJ.setVisibility(8);
        }
        if (c3715ArF.KWHzl()) {
            lxm.KWHzl.setVisibility(0);
            lxm.KWHzl.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.YqksP));
            lxm.copydefault.setVisibility(0);
            lxm.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.lIY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    UnifiedOrderDetailBodyTwoStepInfoView.setData$lambda$5$lambda$2(this.copydefault, c3682AqZ, c3715ArF, c3715ArF2, view);
                }
            });
        } else {
            lxm.copydefault.setVisibility(8);
            lxm.djBIcL.setOnClickListener(null);
        }
        lxm.gEmmrt.setText(c3715ArF2.AEQbTJ());
        Companion.TopUpOrderStatus topUpOrderStatusOLrzqt = OLrzqt(c3715ArF2);
        int i2 = iArr[topUpOrderStatusOLrzqt.ordinal()];
        if (i2 == 1) {
            lxm.AEQbTJ.setColorFilter(getResources().getColor(C52761wXj.Activity.fdOvFl, null));
            lxm.AhwBna.setImageResource(C52761wXj.TaskDescription.RXzakW);
        } else if (i2 == 2) {
            lxm.AEQbTJ.setColorFilter(getResources().getColor(C52761wXj.Activity.fdOvFl, null));
            lxm.AhwBna.setImageDrawable(ResourcesCompat.getDrawable(getResources(), C52761wXj.TaskDescription.TarCU, null));
            lxm.AhwBna.setColorFilter(getResources().getColor(C52761wXj.Activity.fdOvFl, null));
        } else if (i2 == 3) {
            lxm.AEQbTJ.setColorFilter(getResources().getColor(C52761wXj.Activity.fdOvFl, null));
            lxm.AhwBna.setImageResource(C52761wXj.TaskDescription.gqESXP);
        } else if (i2 == 6) {
            lxm.AEQbTJ.setColorFilter(getResources().getColor(C52761wXj.Activity.QwvEab, null));
            lxm.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            lxm.AhwBna.setImageDrawable(ResourcesCompat.getDrawable(getResources(), C52761wXj.TaskDescription.QqiRNA, null));
            lxm.AhwBna.setColorFilter(getResources().getColor(C52761wXj.Activity.QwvEab, null));
        } else {
            lxm.AEQbTJ.setVisibility(8);
            lxm.valueOf.setVisibility(8);
        }
        if (c3715ArF2.KWHzl()) {
            lxm.AYXKKw.setVisibility(0);
            lxm.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.lJf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    UnifiedOrderDetailBodyTwoStepInfoView.setData$lambda$5$lambda$4(this.EZpvd, c3715ArF2, view);
                }
            });
        } else {
            lxm.AYXKKw.setVisibility(8);
            lxm.valueOf.setOnClickListener(null);
        }
        Companion.TopUpOrderStatus topUpOrderStatus = Companion.TopUpOrderStatus.UNKNOWN;
        if (topUpOrderStatusCopydefault == topUpOrderStatus && topUpOrderStatusOLrzqt == topUpOrderStatus) {
            this.EZpvd.getRoot().setVisibility(8);
        }
    }

    public static final void setData$lambda$5$lambda$2(UnifiedOrderDetailBodyTwoStepInfoView unifiedOrderDetailBodyTwoStepInfoView, C3682AqZ c3682AqZ, C3715ArF c3715ArF, C3715ArF c3715ArF2, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction fragmentTransactionBeginTransaction;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (unifiedOrderDetailBodyTwoStepInfoView.copydefault(c3682AqZ.fetchVPNInfo())) {
            if (fragmentActivity != null) {
                InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class), fragmentActivity, new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositHistoryDetailPage(c3715ArF.OLrzqt(), null, 2, null), C30041lJs.EZpvd.AEQbTJ(c3682AqZ) ? OKPaymentSource.TOPUP_PIX_ORDER_DETAIL : OKPaymentSource.UNKNOWN_SOURCE), null, null, 12, null);
            }
        } else {
            if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction()) == null) {
                return;
            }
            int i = C31351lsQ.Application.OxVOHk;
            lSZ.TaskDescription taskDescription = lSZ.Companion;
            String strOLrzqt = c3715ArF.OLrzqt();
            BuySellTradeType buySellTradeTypeAEQbTJ = BuySellTradeType.Companion.AEQbTJ(c3715ArF2.EZpvd());
            if (buySellTradeTypeAEQbTJ == null) {
                buySellTradeTypeAEQbTJ = BuySellTradeType.BUY;
            }
            fragmentTransactionBeginTransaction.replace(i, taskDescription.EZpvd(strOLrzqt, "topup", buySellTradeTypeAEQbTJ, false));
            fragmentTransactionBeginTransaction.addToBackStack(null);
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static final void setData$lambda$5$lambda$4(UnifiedOrderDetailBodyTwoStepInfoView unifiedOrderDetailBodyTwoStepInfoView, C3715ArF c3715ArF, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction fragmentTransactionBeginTransaction;
        Context context = unifiedOrderDetailBodyTwoStepInfoView.getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction()) == null) {
            return;
        }
        int i = C31351lsQ.Application.OxVOHk;
        lSZ.TaskDescription taskDescription = lSZ.Companion;
        String strOLrzqt = c3715ArF.OLrzqt();
        BuySellTradeType buySellTradeTypeAEQbTJ = BuySellTradeType.Companion.AEQbTJ(c3715ArF.EZpvd());
        if (buySellTradeTypeAEQbTJ == null) {
            buySellTradeTypeAEQbTJ = BuySellTradeType.BUY;
        }
        fragmentTransactionBeginTransaction.replace(i, taskDescription.EZpvd(strOLrzqt, "topup", buySellTradeTypeAEQbTJ, false));
        fragmentTransactionBeginTransaction.addToBackStack(null);
        fragmentTransactionBeginTransaction.commit();
    }

    public final Companion.TopUpOrderStatus copydefault(C3715ArF c3715ArF) {
        int iCopydefault = c3715ArF.copydefault();
        if (iCopydefault == HistoryOrderStatus.PENDING.getValue() || iCopydefault == HistoryOrderStatus.PROCESSING.getValue()) {
            return Companion.TopUpOrderStatus.PROCESSING;
        }
        if (iCopydefault == HistoryOrderStatus.FAILED.getValue() || iCopydefault == HistoryOrderStatus.REFUNDED.getValue() || iCopydefault == HistoryOrderStatus.EXPIRED.getValue() || iCopydefault == HistoryOrderStatus.CANCELLED.getValue()) {
            return Companion.TopUpOrderStatus.FAILED;
        }
        if (iCopydefault == HistoryOrderStatus.COMPLETED.getValue()) {
            return Companion.TopUpOrderStatus.COMPLETED;
        }
        if (iCopydefault == HistoryOrderStatus.REVERSING.getValue()) {
            return Companion.TopUpOrderStatus.REVERSING;
        }
        if (iCopydefault == HistoryOrderStatus.REVERSED.getValue()) {
            return Companion.TopUpOrderStatus.REVERSED;
        }
        return Companion.TopUpOrderStatus.UNKNOWN;
    }

    public final Companion.TopUpOrderStatus OLrzqt(C3715ArF c3715ArF) {
        int iCopydefault = c3715ArF.copydefault();
        if (iCopydefault == HistoryOrderStatus.COMPLETED.getValue()) {
            return Companion.TopUpOrderStatus.COMPLETED;
        }
        if (iCopydefault == HistoryOrderStatus.FAILED.getValue()) {
            return Companion.TopUpOrderStatus.FAILED;
        }
        if (iCopydefault == HistoryOrderStatus.PENDING.getValue()) {
            return Companion.TopUpOrderStatus.NOT_STARTED;
        }
        if (iCopydefault == HistoryOrderStatus.PROCESSING.getValue()) {
            return Companion.TopUpOrderStatus.PROCESSING;
        }
        return Companion.TopUpOrderStatus.UNKNOWN;
    }

    public final boolean copydefault(String str) {
        return Intrinsics.EZpvd((Object) str, (Object) ChannelPlatformCode.ACH_BUY.getCode()) || Intrinsics.EZpvd((Object) str, (Object) ChannelPlatformCode.BUY_IDEAL.getCode()) || Intrinsics.EZpvd((Object) str, (Object) ChannelPlatformCode.BUY_PAYPAL.getCode()) || Intrinsics.EZpvd((Object) str, (Object) ChannelPlatformCode.PIX_BUY.getCode());
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.buysellconvert.transaction.buysell.view.UnifiedOrderDetailBodyTwoStepInfoView.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: classes15.dex */
        public static final class TopUpOrderStatus {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ TopUpOrderStatus[] $VALUES;
            private final int status;
            public static final TopUpOrderStatus UNKNOWN = new TopUpOrderStatus("UNKNOWN", 0, -1);
            public static final TopUpOrderStatus NOT_STARTED = new TopUpOrderStatus("NOT_STARTED", 1, 0);
            public static final TopUpOrderStatus PROCESSING = new TopUpOrderStatus("PROCESSING", 2, 1);
            public static final TopUpOrderStatus FAILED = new TopUpOrderStatus(CardSyncResponse.FAILED, 3, 2);
            public static final TopUpOrderStatus COMPLETED = new TopUpOrderStatus("COMPLETED", 4, 3);
            public static final TopUpOrderStatus REVERSING = new TopUpOrderStatus("REVERSING", 5, 4);
            public static final TopUpOrderStatus REVERSED = new TopUpOrderStatus("REVERSED", 6, 5);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ TopUpOrderStatus[] $values() {
                return new TopUpOrderStatus[]{UNKNOWN, NOT_STARTED, PROCESSING, FAILED, COMPLETED, REVERSING, REVERSED};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<TopUpOrderStatus> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getStatus() {
                return this.status;
            }

            private TopUpOrderStatus(String str, int i, int i2) {
                this.status = i2;
            }

            static {
                TopUpOrderStatus[] topUpOrderStatusArr$values = $values();
                $VALUES = topUpOrderStatusArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(topUpOrderStatusArr$values);
            }

            public static TopUpOrderStatus valueOf(String str) {
                return (TopUpOrderStatus) Enum.valueOf(TopUpOrderStatus.class, str);
            }

            public static TopUpOrderStatus[] values() {
                return (TopUpOrderStatus[]) $VALUES.clone();
            }
        }
    }
}
