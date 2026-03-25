package com.okinc.business.market.features.holdings.domain;

import com.okinc.business.defi.api.bean.OKWalletCloseTokenModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9852bdR;

/* JADX INFO: loaded from: classes7.dex */
public final class GetHoldingsUseCase$getActivePositionFilter$2$1$walletBlacklist$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends OKWalletCloseTokenModel>>, Object> {
    final /* synthetic */ String $walletId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHoldingsUseCase$getActivePositionFilter$2$1$walletBlacklist$1(String str, Continuation<? super GetHoldingsUseCase$getActivePositionFilter$2$1$walletBlacklist$1> continuation) {
        super(2, continuation);
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetHoldingsUseCase$getActivePositionFilter$2$1$walletBlacklist$1(this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends OKWalletCloseTokenModel>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<OKWalletCloseTokenModel>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<OKWalletCloseTokenModel>> continuation) {
        return ((GetHoldingsUseCase$getActivePositionFilter$2$1$walletBlacklist$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<List<OKWalletCloseTokenModel>> abstractC58260yxtAEQbTJ = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).AEQbTJ(this.$walletId);
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
