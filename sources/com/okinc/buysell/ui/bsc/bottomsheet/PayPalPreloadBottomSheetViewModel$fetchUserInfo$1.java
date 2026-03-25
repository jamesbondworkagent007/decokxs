package com.okinc.buysell.ui.bsc.bottomsheet;

import com.okinc.crcore.shared.net.responsebean.bsc.UserInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.lyY;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class PayPalPreloadBottomSheetViewModel$fetchUserInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PayPalPreloadBottomSheetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayPalPreloadBottomSheetViewModel$fetchUserInfo$1(PayPalPreloadBottomSheetViewModel payPalPreloadBottomSheetViewModel, Continuation<? super PayPalPreloadBottomSheetViewModel$fetchUserInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = payPalPreloadBottomSheetViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayPalPreloadBottomSheetViewModel$fetchUserInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PayPalPreloadBottomSheetViewModel$fetchUserInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        PayPalPreloadBottomSheetViewModel payPalPreloadBottomSheetViewModel;
        AbstractC43419rot abstractC43419rot2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyY lyy = this.this$0.EZpvd;
            this.label = 1;
            obj = lyy.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC43419rot2 = (AbstractC43419rot) this.L$1;
                payPalPreloadBottomSheetViewModel = (PayPalPreloadBottomSheetViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                payPalPreloadBottomSheetViewModel.KWHzl(false);
                abstractC43419rot = abstractC43419rot2;
                PayPalPreloadBottomSheetViewModel payPalPreloadBottomSheetViewModel2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    payPalPreloadBottomSheetViewModel2.EZpvd(true);
                    payPalPreloadBottomSheetViewModel2.KWHzl(false);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        payPalPreloadBottomSheetViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            mHA.OLrzqt.AEQbTJ(payPalPreloadBottomSheetViewModel.AEQbTJ, (UserInfoBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
            this.L$0 = payPalPreloadBottomSheetViewModel;
            this.L$1 = abstractC43419rot;
            this.label = 2;
            if (DelayKt.delay(300L, this) == objCopydefault) {
                return objCopydefault;
            }
            abstractC43419rot2 = abstractC43419rot;
            payPalPreloadBottomSheetViewModel.KWHzl(false);
            abstractC43419rot = abstractC43419rot2;
        }
        PayPalPreloadBottomSheetViewModel payPalPreloadBottomSheetViewModel22 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
