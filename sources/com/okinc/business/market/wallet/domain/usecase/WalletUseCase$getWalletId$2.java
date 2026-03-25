package com.okinc.business.market.wallet.domain.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.kKG;

/* JADX INFO: loaded from: classes7.dex */
public final class WalletUseCase$getWalletId$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ kKG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUseCase$getWalletId$2(kKG kkg, Continuation<? super WalletUseCase$getWalletId$2> continuation) {
        super(2, continuation);
        this.this$0 = kkg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletUseCase$getWalletId$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((WalletUseCase$getWalletId$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<Boolean> flowAYXKKw = this.this$0.OLrzqt.AYXKKw();
            this.label = 1;
            obj = FlowKt.first(flowAYXKKw, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
                String strDbNXlk = interfaceC9738bbJ == null ? interfaceC9738bbJ.DbNXlk() : null;
                return strDbNXlk != null ? "" : strDbNXlk;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Flow<InterfaceC9738bbJ> flowOLrzqt = this.this$0.OLrzqt.OLrzqt();
            this.label = 2;
            obj = FlowKt.firstOrNull(flowOLrzqt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) obj;
            if (interfaceC9738bbJ2 == null) {
            }
            if (strDbNXlk != null) {
            }
        }
    }
}
