package com.okinc.business.defi.jwt.domain;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC58260yxt;
import o.C11607cUn;
import o.C13600dRi;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class GenerateSignArgsUseCase$getWalletId$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ C13600dRi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateSignArgsUseCase$getWalletId$2(C13600dRi c13600dRi, Continuation<? super GenerateSignArgsUseCase$getWalletId$2> continuation) {
        super(2, continuation);
        this.this$0 = c13600dRi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateSignArgsUseCase$getWalletId$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((GenerateSignArgsUseCase$getWalletId$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowM7441catch = FlowKt.m7441catch(C11607cUn.copydefault((AbstractC58260yxt) this.this$0.AEQbTJ.OLrzqt(false)), new GenerateSignArgsUseCase$getWalletId$2$isWalletExist$1(null));
            this.label = 1;
            obj = FlowKt.first(flowM7441catch, this);
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
                String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
                return strDbNXlk != null ? "" : strDbNXlk;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Flow flowOLrzqt = C11607cUn.OLrzqt(this.this$0.AEQbTJ.KWHzl());
            this.label = 2;
            obj = FlowKt.firstOrNull(flowOLrzqt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) obj;
            if (interfaceC9738bbJ2 != null) {
            }
            if (strDbNXlk != null) {
            }
        } else {
            pUU.copydefault("GenerateSignArgsUseCase", "getWalletId is empty");
        }
    }
}
