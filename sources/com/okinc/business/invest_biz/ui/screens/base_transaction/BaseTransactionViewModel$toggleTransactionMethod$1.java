package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC24170iXm;
import o.C23642iDy;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC23639iDv;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseTransactionViewModel$toggleTransactionMethod$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ TransactionMethod $method;
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$toggleTransactionMethod$1(AbstractC24170iXm abstractC24170iXm, String str, TransactionMethod transactionMethod, Continuation<? super BaseTransactionViewModel$toggleTransactionMethod$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC24170iXm;
        this.$key = str;
        this.$method = transactionMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$toggleTransactionMethod$1(this.this$0, this.$key, this.$method, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$toggleTransactionMethod$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC23639iDv interfaceC23639iDv = this.this$0.iwGUEr;
                String str = this.$key;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(C33129mqd.AhwBna(this.$method.name()));
                Result.Application application = Result.Companion;
                Intrinsics.copydefault(interfaceC23639iDv, "");
                C23642iDy c23642iDy = (C23642iDy) interfaceC23639iDv;
                CoroutineDispatcher coroutineDispatcher = c23642iDy.AEQbTJ;
                BaseTransactionViewModel$toggleTransactionMethod$1$invokeSuspend$$inlined$putObject$1 baseTransactionViewModel$toggleTransactionMethod$1$invokeSuspend$$inlined$putObject$1 = new BaseTransactionViewModel$toggleTransactionMethod$1$invokeSuspend$$inlined$putObject$1(null, c23642iDy, str, numAEQbTJ);
                this.label = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, baseTransactionViewModel$toggleTransactionMethod$1$invokeSuspend$$inlined$putObject$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            C56391yDq.AEQbTJ(objM7386unboximpl);
            Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) objM7386unboximpl).booleanValue()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
