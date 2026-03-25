package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.bsc.AvailableCurrencyBalanceBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31764mDa;
import o.lyS;

/* JADX INFO: loaded from: classes23.dex */
public final class GetCryptoBalanceUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super lyS.TaskDescription>, Object> {
    final /* synthetic */ String $currencyId;
    int label;
    final /* synthetic */ lyS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoBalanceUseCase$invoke$2(lyS lys, String str, Continuation<? super GetCryptoBalanceUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = lys;
        this.$currencyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetCryptoBalanceUseCase$invoke$2(this.this$0, this.$currencyId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super lyS.TaskDescription> continuation) {
        return ((GetCryptoBalanceUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC31764mDa interfaceC31764mDa = this.this$0.EZpvd;
                String str = this.$currencyId;
                this.label = 1;
                obj = InterfaceC31764mDa.ActionBar.getCurrencyBalance$default(interfaceC31764mDa, null, str, this, 1, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            AvailableCurrencyBalanceBean availableCurrencyBalanceBean = (AvailableCurrencyBalanceBean) ((AbstractC43419rot) obj).AEQbTJ();
            return new lyS.TaskDescription.Application(C33129mqd.OLrzqt((Object) availableCurrencyBalanceBean.getAvailableBalance()), C33129mqd.OLrzqt((Object) availableCurrencyBalanceBean.getMaxWithdrawalBalance()), C33129mqd.OLrzqt((Object) availableCurrencyBalanceBean.getUnavailableBalance()));
        } catch (OKServerException e) {
            return new lyS.TaskDescription.StateListAnimator(e);
        }
    }
}
