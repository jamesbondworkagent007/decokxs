package com.okinc.business.defi.deeplink;

import androidx.fragment.app.FragmentActivity;
import com.okinc.biz.model.SupportService;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.C6811aWS;
import o.InterfaceC6804aWL;
import o.InterfaceC6817aWY;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5(FragmentActivity fragmentActivity, Continuation<? super DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5 defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5 = new DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5(this.$activity, continuation);
        defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5.L$0 = obj;
        return defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentActivity fragmentActivity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            fragmentActivity = this.$activity;
            Result.Application application2 = Result.Companion;
            C6811aWS c6811aWS = new C6811aWS("web3_user_center_support", null, null, null, 14, null);
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43248rlh.KWHzl.AEQbTJ(InterfaceC6804aWL.class);
            this.L$0 = fragmentActivity;
            this.label = 1;
            obj = interfaceC6804aWL.AEQbTJ(c6811aWS, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            fragmentActivity = (FragmentActivity) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC6817aWY serviceAction = ((SupportService) obj).getServiceAction();
        this.L$0 = null;
        this.label = 2;
        if (serviceAction.OLrzqt(fragmentActivity, this) == objCopydefault) {
            return objCopydefault;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
