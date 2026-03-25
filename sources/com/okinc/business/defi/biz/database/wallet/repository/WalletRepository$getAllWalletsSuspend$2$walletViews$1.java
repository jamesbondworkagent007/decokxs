package com.okinc.business.defi.biz.database.wallet.repository;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C11571cTe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC11384cMf;
import o.cQM;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletRepository$getAllWalletsSuspend$2$walletViews$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends C11571cTe>>, Object> {
    int label;
    final /* synthetic */ cQM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletRepository$getAllWalletsSuspend$2$walletViews$1(cQM cqm, Continuation<? super WalletRepository$getAllWalletsSuspend$2$walletViews$1> continuation) {
        super(2, continuation);
        this.this$0 = cqm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletRepository$getAllWalletsSuspend$2$walletViews$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends C11571cTe>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<C11571cTe>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<C11571cTe>> continuation) {
        return ((WalletRepository$getAllWalletsSuspend$2$walletViews$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC11384cMf interfaceC11384cMf = this.this$0.copydefault;
            this.label = 1;
            obj = interfaceC11384cMf.KWHzl(this);
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
