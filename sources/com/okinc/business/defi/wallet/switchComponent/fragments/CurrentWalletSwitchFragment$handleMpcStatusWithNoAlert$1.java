package com.okinc.business.defi.wallet.switchComponent.fragments;

import androidx.fragment.app.FragmentActivity;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C17734fQh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC17773fRt;
import o.fQI;

/* JADX INFO: loaded from: classes5.dex */
public final class CurrentWalletSwitchFragment$handleMpcStatusWithNoAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C17734fQh $mpcTipBean;
    int label;
    final /* synthetic */ fQI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentWalletSwitchFragment$handleMpcStatusWithNoAlert$1(fQI fqi, C17734fQh c17734fQh, Continuation<? super CurrentWalletSwitchFragment$handleMpcStatusWithNoAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = fqi;
        this.$mpcTipBean = c17734fQh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrentWalletSwitchFragment$handleMpcStatusWithNoAlert$1(this.this$0, this.$mpcTipBean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrentWalletSwitchFragment$handleMpcStatusWithNoAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                FragmentActivity activity = this.this$0.getActivity();
                if (activity == null) {
                    return Unit.INSTANCE;
                }
                this.this$0.showLoading();
                InterfaceC17773fRt interfaceC17773fRt = this.this$0.valueOf;
                MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatusEZpvd = this.$mpcTipBean.EZpvd();
                AbstractC12782ctV abstractC12782ctVOLrzqt = this.$mpcTipBean.OLrzqt();
                this.label = 1;
                if (interfaceC17773fRt.AEQbTJ(mpcWalletAbleStatusEZpvd, abstractC12782ctVOLrzqt, activity, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            this.this$0.djBIcL().ejfBZ();
            this.this$0.dismissLoading();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.dismissLoading();
            throw th;
        }
    }
}
