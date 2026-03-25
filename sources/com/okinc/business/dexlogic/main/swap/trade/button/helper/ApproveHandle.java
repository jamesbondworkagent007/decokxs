package com.okinc.business.dexlogic.main.swap.trade.button.helper;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.business.dexlogic.main.swap.trade.button.helper.ApproveHandle;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStatePool;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC23101hrq;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C22380heK;
import o.C22901hoB;
import o.C33050mpD;
import o.C33129mqd;
import o.C55326xho;
import o.InterfaceC22693hkF;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ApproveHandle {
    public static final int $stable = 8;
    private Object approve;
    private ApproveStatusGroup approveStatusGroup;
    private final AbstractC23101hrq viewModel;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ApproveStatus.values().length];
            try {
                iArr[ApproveStatus.APPROVING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApproveStatus.CANCEL_APPROVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveStatusGroup getApproveStatusGroup() {
        return this.approveStatusGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApproveStatusGroup(ApproveStatusGroup approveStatusGroup) {
        this.approveStatusGroup = approveStatusGroup;
    }

    public ApproveHandle(@NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.viewModel = abstractC23101hrq;
        this.approve = new Object();
    }

    public final void checkApproveState(final DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull final String str, @NotNull final TradeStatePool tradeStatePool, @NotNull final String str2, final DexMultiTokenInfoBean dexMultiTokenInfoBean2, final Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C33050mpD.OLrzqt(this.approve);
        C22901hoB c22901hoBZuBGHE = this.viewModel.zuBGHE();
        if (c22901hoBZuBGHE == null || !c22901hoBZuBGHE.valueOf()) {
            return;
        }
        if ((this.viewModel.UlJrfe() && this.viewModel.DarRvM().length() == 0) || dexMultiTokenInfoBean == null) {
            return;
        }
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(str2).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hmw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ApproveHandle.checkApproveState$lambda$8$lambda$4(num, dexMultiTokenInfoBean, tradeStatePool, str2, str, this, dexMultiTokenInfoBean2, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hmt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ApproveHandle.checkApproveState$lambda$8$lambda$6(tradeStatePool, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hmx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.approve);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkApproveState$lambda$8$lambda$4(Integer num, DexMultiTokenInfoBean dexMultiTokenInfoBean, final TradeStatePool tradeStatePool, String str, String str2, final ApproveHandle approveHandle, DexMultiTokenInfoBean dexMultiTokenInfoBean2, InterfaceC9738bbJ interfaceC9738bbJ) {
        String strEZpvd;
        String str3 = (num == null || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.getChainId(), (Object) "0") ? (strEZpvd = interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(dexMultiTokenInfoBean.getChainId()))) != null : (strEZpvd = interfaceC9738bbJ.copydefault(C33129mqd.valueOf(dexMultiTokenInfoBean.getChainId()), num.intValue())) != null) ? strEZpvd : "";
        if (str3.length() == 0) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_ERROR, true, false));
            return Unit.INSTANCE;
        }
        AbstractC58185ywX<ApproveStatusGroup> abstractC58185ywXCopydefault = C22380heK.OLrzqt.copydefault(str).DbNXlk().copydefault(str2, str3, dexMultiTokenInfoBean, approveHandle.viewModel.zLjUOn(), dexMultiTokenInfoBean2, approveHandle.viewModel.uzCIH());
        final Function1 function1 = new Function1() { // from class: o.hmA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ApproveHandle.checkApproveState$lambda$8$lambda$4$lambda$0(this.EZpvd, tradeStatePool, (ApproveStatusGroup) obj);
            }
        };
        InterfaceC58227yxM<? super ApproveStatusGroup> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hmz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hmn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ApproveHandle.checkApproveState$lambda$8$lambda$4$lambda$2(this.AEQbTJ, tradeStatePool, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, approveHandle.approve);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkApproveState$lambda$8$lambda$4$lambda$0(ApproveHandle approveHandle, TradeStatePool tradeStatePool, ApproveStatusGroup approveStatusGroup) {
        SwapState swapState;
        approveHandle.approveStatusGroup = approveStatusGroup;
        boolean z = true;
        if (approveStatusGroup.getNeedApprove()) {
            if (approveStatusGroup.isRegisterType()) {
                swapState = SwapState.REGISTER;
            } else if (approveStatusGroup.getApproveStatus() == ApproveStatus.APPROVED_NEED_CANCEL_APPROVE) {
                swapState = SwapState.APPROVED_AND_NEED_CANCEL_APPROVE;
            } else if (approveStatusGroup.getApproveStatus() == ApproveStatus.CANCEL_APPROVING) {
                swapState = SwapState.CANCEL_APPROVING;
            } else {
                swapState = SwapState.APPROVE;
            }
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, swapState, true, false));
            MutableLiveData<Boolean> mutableLiveDataFJNWhG = approveHandle.viewModel.fJNWhG();
            if (swapState != SwapState.APPROVED_AND_NEED_CANCEL_APPROVE && swapState != SwapState.CANCEL_APPROVING) {
                z = false;
            }
            mutableLiveDataFJNWhG.setValue(Boolean.valueOf(z));
        } else {
            int i = StateListAnimator.EZpvd[approveStatusGroup.getApproveStatus().ordinal()];
            if (i == 1) {
                tradeStatePool.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, approveStatusGroup.isRegisterType() ? SwapState.REGISTERING : SwapState.APPROVING, true, false));
                approveHandle.viewModel.fJNWhG().setValue(Boolean.FALSE);
            } else if (i == 2) {
                tradeStatePool.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.CANCEL_APPROVING, true, false));
                approveHandle.viewModel.fJNWhG().setValue(Boolean.TRUE);
            } else {
                tradeStatePool.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_SUCCESS, false, true));
                approveHandle.viewModel.fJNWhG().setValue(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkApproveState$lambda$8$lambda$4$lambda$2(ApproveHandle approveHandle, TradeStatePool tradeStatePool, Throwable th) {
        approveHandle.viewModel.fJNWhG().setValue(Boolean.FALSE);
        C55326xho.toast$default(th.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_ERROR, true, false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkApproveState$lambda$8$lambda$6(TradeStatePool tradeStatePool, Throwable th) {
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_ERROR, true, false));
        C55326xho.toast$default(th.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        return Unit.INSTANCE;
    }

    public final void getTokenApprovalData(@NotNull String str, @NotNull final Function1<? super ApproveSwapData, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC23101hrq abstractC23101hrq = this.viewModel;
        QuotePriceRes quotePrice = abstractC23101hrq.RlQdEF().getQuotePrice();
        if (quotePrice == null || abstractC23101hrq.QUSxYX().copydefault() == null) {
            return;
        }
        String platformId = quotePrice.getPlatformId(this.viewModel.Dmq());
        String platformName = quotePrice.getPlatformName(this.viewModel.Dmq());
        String platformLogo = quotePrice.getPlatformLogo();
        InterfaceC22693hkF interfaceC22693hkFDbNXlk = C22380heK.OLrzqt.copydefault(abstractC23101hrq.ffGIBT()).DbNXlk();
        boolean zUlJrfe = abstractC23101hrq.UlJrfe();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault();
        Intrinsics.copydefault(dexMultiTokenInfoBeanCopydefault);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = abstractC23101hrq.QUSxYX().valueOf();
        Intrinsics.copydefault(dexMultiTokenInfoBeanValueOf);
        int iCopydefault = abstractC23101hrq.wlaJM().copydefault();
        AbstractC58185ywX<ApproveSwapData> abstractC58185ywXEZpvd = interfaceC22693hkFDbNXlk.EZpvd(zUlJrfe, dexMultiTokenInfoBeanCopydefault, dexMultiTokenInfoBeanValueOf, platformId, platformName, platformLogo, Integer.valueOf(iCopydefault), abstractC23101hrq.gEmmrt(), str);
        final Function1 function12 = new Function1() { // from class: o.hmp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ApproveHandle.getTokenApprovalData$lambda$13$lambda$9(function1, (ApproveSwapData) obj);
            }
        };
        InterfaceC58227yxM<? super ApproveSwapData> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hmo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hmv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ApproveHandle.getTokenApprovalData$lambda$13$lambda$11((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hmu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function13.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.approve);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTokenApprovalData$lambda$13$lambda$9(Function1 function1, ApproveSwapData approveSwapData) {
        Intrinsics.copydefault(approveSwapData);
        function1.invoke(approveSwapData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTokenApprovalData$lambda$13$lambda$11(Throwable th) {
        C55326xho.toast$default(th.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        return Unit.INSTANCE;
    }

    public final void disposeApprove() {
        C33050mpD.OLrzqt(this.approve);
    }
}
