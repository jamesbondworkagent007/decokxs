package com.okinc.buysell.ui.transaction.buysell.view;

import android.app.Activity;
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
import com.okinc.buysell.ui.transaction.buysell.view.UnifiedOrderDetailBodyTwoStepInfoView;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.SubOrderDetailBean;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.HistoryOrderStatus;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC31613lxo;
import o.C31351lsQ;
import o.C33070mpX;
import o.C43251rlk;
import o.C52761wXj;
import o.C54819xWm;
import o.C56444yFp;
import o.InterfaceC47251tmX;
import o.InterfaceC56445yFq;
import o.lSZ;
import o.lTJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class UnifiedOrderDetailBodyTwoStepInfoView extends FrameLayout {
    public static final Companion Companion = new Companion(null);
    public static final int EZpvd = 8;
    public final AbstractC31613lxo copydefault;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
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
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:31) call: com.okinc.buysell.ui.transaction.buysell.view.UnifiedOrderDetailBodyTwoStepInfoView.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ UnifiedOrderDetailBodyTwoStepInfoView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedOrderDetailBodyTwoStepInfoView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), C31351lsQ.ActionBar.ODXsMY, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC31613lxo) viewDataBindingInflate;
    }

    public final void setData(@NotNull final OrderDetailBean orderDetailBean, @NotNull final SubOrderDetailBean subOrderDetailBean, @NotNull final SubOrderDetailBean subOrderDetailBean2) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        Intrinsics.checkNotNullParameter(subOrderDetailBean, "");
        Intrinsics.checkNotNullParameter(subOrderDetailBean2, "");
        AbstractC31613lxo abstractC31613lxo = this.copydefault;
        abstractC31613lxo.KWHzl.setText(subOrderDetailBean.getDisplayTitle());
        Companion.TopUpOrderStatus topUpOrderStatusCopydefault = copydefault(subOrderDetailBean);
        int[] iArr = ActionBar.copydefault;
        int i = iArr[topUpOrderStatusCopydefault.ordinal()];
        if (i == 1) {
            abstractC31613lxo.EZpvd.setImageResource(C52761wXj.TaskDescription.RXzakW);
        } else if (i == 2) {
            abstractC31613lxo.EZpvd.setImageDrawable(ResourcesCompat.getDrawable(getResources(), C52761wXj.TaskDescription.TarCU, null));
            abstractC31613lxo.EZpvd.setColorFilter(getResources().getColor(C52761wXj.Activity.fdOvFl, null));
        } else if (i == 3) {
            abstractC31613lxo.EZpvd.setImageResource(C52761wXj.TaskDescription.gqESXP);
        } else if (i == 4) {
            abstractC31613lxo.EZpvd.setImageResource(C52761wXj.TaskDescription.RXzakW);
            abstractC31613lxo.AEQbTJ.setVisibility(0);
            abstractC31613lxo.AEQbTJ.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.hrjNmC));
        } else if (i == 5) {
            abstractC31613lxo.EZpvd.setImageResource(C52761wXj.TaskDescription.QVMIlxQVMIlx);
            abstractC31613lxo.AEQbTJ.setVisibility(0);
            abstractC31613lxo.AEQbTJ.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fGQ));
        } else {
            abstractC31613lxo.gEmmrt.setVisibility(8);
            abstractC31613lxo.OLrzqt.setVisibility(8);
        }
        if (subOrderDetailBean.getClickable()) {
            abstractC31613lxo.AEQbTJ.setVisibility(0);
            abstractC31613lxo.AEQbTJ.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.YqksP));
            abstractC31613lxo.copydefault.setVisibility(0);
            abstractC31613lxo.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lTq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    UnifiedOrderDetailBodyTwoStepInfoView.setData$lambda$5$lambda$2(this.KWHzl, orderDetailBean, subOrderDetailBean, view);
                }
            });
        } else {
            abstractC31613lxo.copydefault.setVisibility(8);
            abstractC31613lxo.gEmmrt.setOnClickListener(null);
        }
        abstractC31613lxo.AhwBna.setText(subOrderDetailBean2.getDisplayTitle());
        Companion.TopUpOrderStatus topUpOrderStatusAEQbTJ = AEQbTJ(subOrderDetailBean2);
        int i2 = iArr[topUpOrderStatusAEQbTJ.ordinal()];
        if (i2 == 1) {
            abstractC31613lxo.OLrzqt.setColorFilter(getResources().getColor(C52761wXj.Activity.fdOvFl, null));
            abstractC31613lxo.valueOf.setImageResource(C52761wXj.TaskDescription.RXzakW);
        } else if (i2 == 2) {
            abstractC31613lxo.OLrzqt.setColorFilter(getResources().getColor(C52761wXj.Activity.fdOvFl, null));
            abstractC31613lxo.valueOf.setImageDrawable(ResourcesCompat.getDrawable(getResources(), C52761wXj.TaskDescription.TarCU, null));
            abstractC31613lxo.valueOf.setColorFilter(getResources().getColor(C52761wXj.Activity.fdOvFl, null));
        } else if (i2 == 3) {
            abstractC31613lxo.OLrzqt.setColorFilter(getResources().getColor(C52761wXj.Activity.fdOvFl, null));
            abstractC31613lxo.valueOf.setImageResource(C52761wXj.TaskDescription.gqESXP);
        } else if (i2 == 6) {
            abstractC31613lxo.OLrzqt.setColorFilter(getResources().getColor(C52761wXj.Activity.QwvEab, null));
            abstractC31613lxo.AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            abstractC31613lxo.valueOf.setImageDrawable(ResourcesCompat.getDrawable(getResources(), C52761wXj.TaskDescription.QqiRNA, null));
            abstractC31613lxo.valueOf.setColorFilter(getResources().getColor(C52761wXj.Activity.QwvEab, null));
        } else {
            abstractC31613lxo.OLrzqt.setVisibility(8);
            abstractC31613lxo.AYXKKw.setVisibility(8);
        }
        if (subOrderDetailBean2.getClickable()) {
            abstractC31613lxo.djBIcL.setVisibility(0);
            abstractC31613lxo.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.lTr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    UnifiedOrderDetailBodyTwoStepInfoView.setData$lambda$5$lambda$4(this.EZpvd, subOrderDetailBean2, view);
                }
            });
        } else {
            abstractC31613lxo.djBIcL.setVisibility(8);
            abstractC31613lxo.AYXKKw.setOnClickListener(null);
        }
        Companion.TopUpOrderStatus topUpOrderStatus = Companion.TopUpOrderStatus.UNKNOWN;
        if (topUpOrderStatusCopydefault == topUpOrderStatus && topUpOrderStatusAEQbTJ == topUpOrderStatus) {
            this.copydefault.getRoot().setVisibility(8);
        }
    }

    public static final void setData$lambda$5$lambda$2(UnifiedOrderDetailBodyTwoStepInfoView unifiedOrderDetailBodyTwoStepInfoView, OrderDetailBean orderDetailBean, SubOrderDetailBean subOrderDetailBean, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction fragmentTransactionBeginTransaction;
        String upperCase;
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (unifiedOrderDetailBodyTwoStepInfoView.KWHzl(orderDetailBean.getDepositPlatformCode())) {
            if (fragmentActivity != null) {
                InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class), fragmentActivity, new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositHistoryDetailPage(subOrderDetailBean.getOrderNo(), null, 2, null), lTJ.KWHzl.EZpvd(orderDetailBean) ? OKPaymentSource.TOPUP_PIX_ORDER_DETAIL : OKPaymentSource.UNKNOWN_SOURCE), null, null, 12, null);
                return;
            }
            return;
        }
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction()) == null) {
            return;
        }
        int i = C31351lsQ.Application.OxVOHk;
        lSZ.TaskDescription taskDescription = lSZ.Companion;
        String orderNo = subOrderDetailBean.getOrderNo();
        String tradeType = subOrderDetailBean.getTradeType();
        if (tradeType != null) {
            upperCase = tradeType.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        } else {
            upperCase = null;
        }
        fragmentTransactionBeginTransaction.replace(i, taskDescription.EZpvd(orderNo, "topup", Intrinsics.EZpvd((Object) upperCase, (Object) "SELL") ? BuySellTradeType.SELL : BuySellTradeType.BUY, false));
        fragmentTransactionBeginTransaction.addToBackStack(null);
        fragmentTransactionBeginTransaction.commit();
    }

    public static final void setData$lambda$5$lambda$4(UnifiedOrderDetailBodyTwoStepInfoView unifiedOrderDetailBodyTwoStepInfoView, SubOrderDetailBean subOrderDetailBean, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction fragmentTransactionBeginTransaction;
        String upperCase;
        Context context = unifiedOrderDetailBodyTwoStepInfoView.getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction()) == null) {
            return;
        }
        int i = C31351lsQ.Application.OxVOHk;
        lSZ.TaskDescription taskDescription = lSZ.Companion;
        String orderNo = subOrderDetailBean.getOrderNo();
        String tradeType = subOrderDetailBean.getTradeType();
        if (tradeType != null) {
            upperCase = tradeType.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        } else {
            upperCase = null;
        }
        fragmentTransactionBeginTransaction.replace(i, taskDescription.EZpvd(orderNo, "topup", Intrinsics.EZpvd((Object) upperCase, (Object) "SELL") ? BuySellTradeType.SELL : BuySellTradeType.BUY, false));
        fragmentTransactionBeginTransaction.addToBackStack(null);
        fragmentTransactionBeginTransaction.commit();
    }

    public final Companion.TopUpOrderStatus copydefault(SubOrderDetailBean subOrderDetailBean) {
        int status = subOrderDetailBean.getStatus();
        if (status == HistoryOrderStatus.PENDING.getValue() || status == HistoryOrderStatus.PROCESSING.getValue()) {
            return Companion.TopUpOrderStatus.PROCESSING;
        }
        if (status == HistoryOrderStatus.FAILED.getValue() || status == HistoryOrderStatus.REFUNDED.getValue() || status == HistoryOrderStatus.EXPIRED.getValue() || status == HistoryOrderStatus.CANCELLED.getValue()) {
            return Companion.TopUpOrderStatus.FAILED;
        }
        if (status == HistoryOrderStatus.COMPLETED.getValue()) {
            return Companion.TopUpOrderStatus.COMPLETED;
        }
        if (status == HistoryOrderStatus.REVERSING.getValue()) {
            return Companion.TopUpOrderStatus.REVERSING;
        }
        if (status == HistoryOrderStatus.REVERSED.getValue()) {
            return Companion.TopUpOrderStatus.REVERSED;
        }
        return Companion.TopUpOrderStatus.UNKNOWN;
    }

    public final Companion.TopUpOrderStatus AEQbTJ(SubOrderDetailBean subOrderDetailBean) {
        int status = subOrderDetailBean.getStatus();
        if (status == HistoryOrderStatus.COMPLETED.getValue()) {
            return Companion.TopUpOrderStatus.COMPLETED;
        }
        if (status == HistoryOrderStatus.FAILED.getValue()) {
            return Companion.TopUpOrderStatus.FAILED;
        }
        if (status == HistoryOrderStatus.PENDING.getValue()) {
            return Companion.TopUpOrderStatus.NOT_STARTED;
        }
        if (status == HistoryOrderStatus.PROCESSING.getValue()) {
            return Companion.TopUpOrderStatus.PROCESSING;
        }
        return Companion.TopUpOrderStatus.UNKNOWN;
    }

    public final boolean KWHzl(String str) {
        return Intrinsics.EZpvd((Object) str, (Object) ChannelPlatformCode.ACH_BUY.getCode()) || Intrinsics.EZpvd((Object) str, (Object) ChannelPlatformCode.BUY_IDEAL.getCode()) || Intrinsics.EZpvd((Object) str, (Object) ChannelPlatformCode.BUY_PAYPAL.getCode()) || Intrinsics.EZpvd((Object) str, (Object) ChannelPlatformCode.PIX_BUY.getCode());
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.transaction.buysell.view.UnifiedOrderDetailBodyTwoStepInfoView.Companion.<init>():void type: THIS */
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
            public static final TaskDescription Companion;
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
                Companion = new TaskDescription(null);
            }

            /* JADX INFO: loaded from: classes23.dex */
            public static final class TaskDescription {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.transaction.buysell.view.UnifiedOrderDetailBodyTwoStepInfoView.Companion.TopUpOrderStatus.TaskDescription.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private TaskDescription() {
                }
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
