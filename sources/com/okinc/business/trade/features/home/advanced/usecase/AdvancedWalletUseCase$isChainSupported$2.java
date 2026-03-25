package com.okinc.business.trade.features.home.advanced.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28196kSl;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedWalletUseCase$isChainSupported$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ C28196kSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedWalletUseCase$isChainSupported$2(C28196kSl c28196kSl, String str, Continuation<? super AdvancedWalletUseCase$isChainSupported$2> continuation) {
        super(2, continuation);
        this.this$0 = c28196kSl;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedWalletUseCase$isChainSupported$2(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((AdvancedWalletUseCase$isChainSupported$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28196kSl c28196kSl = this.this$0;
            this.label = 1;
            obj = c28196kSl.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        if (interfaceC9738bbJ == null) {
            return null;
        }
        return C56443yFo.KWHzl(interfaceC9738bbJ.djSkpj() & interfaceC9738bbJ.gEmmrt(C33129mqd.valueOf(this.$chainId)));
    }
}
