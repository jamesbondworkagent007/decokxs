package com.okinc.business.market.features.holders.ui;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27633jyq;
import o.C56391yDq;
import o.C56442yFn;
import o.jNY;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenHoldersViewModel$getNativeTokenPrice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ TokenHoldersViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenHoldersViewModel$getNativeTokenPrice$1(TokenHoldersViewModel tokenHoldersViewModel, String str, Continuation<? super TokenHoldersViewModel$getNativeTokenPrice$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenHoldersViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenHoldersViewModel$getNativeTokenPrice$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenHoldersViewModel$getNativeTokenPrice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27633jyq c27633jyq = this.this$0.ejfBZ;
            String str = this.$chainId;
            this.label = 1;
            objAEQbTJ = c27633jyq.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        TokenHoldersViewModel tokenHoldersViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            tokenHoldersViewModel.fIwbmz = (jNY) objAEQbTJ;
        }
        return Unit.INSTANCE;
    }
}
