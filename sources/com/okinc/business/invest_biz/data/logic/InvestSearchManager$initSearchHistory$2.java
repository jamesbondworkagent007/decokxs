package com.okinc.business.invest_biz.data.logic;

import com.okinc.business.invest_biz.data.bean.FilterRecord;
import java.util.List;
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
import o.C23542iAf;
import o.C23642iDy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23639iDv;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class InvestSearchManager$initSearchHistory$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends FilterRecord>>, Object> {
    int label;
    final /* synthetic */ C23542iAf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSearchManager$initSearchHistory$2(C23542iAf c23542iAf, Continuation<? super InvestSearchManager$initSearchHistory$2> continuation) {
        super(2, continuation);
        this.this$0 = c23542iAf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestSearchManager$initSearchHistory$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends FilterRecord>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<FilterRecord>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<FilterRecord>> continuation) {
        return ((InvestSearchManager$initSearchHistory$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC23639iDv interfaceC23639iDv = this.this$0.copydefault;
                Result.Application application = Result.Companion;
                Intrinsics.copydefault(interfaceC23639iDv, "");
                C23642iDy c23642iDy = (C23642iDy) interfaceC23639iDv;
                CoroutineDispatcher coroutineDispatcher = c23642iDy.AEQbTJ;
                InvestSearchManager$initSearchHistory$2$invokeSuspend$$inlined$getObject$1 investSearchManager$initSearchHistory$2$invokeSuspend$$inlined$getObject$1 = new InvestSearchManager$initSearchHistory$2$invokeSuspend$$inlined$getObject$1(null, c23642iDy, "sp.key.invest_search_history_2");
                this.label = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, investSearchManager$initSearchHistory$2$invokeSuspend$$inlined$getObject$1, this);
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
            objM7377constructorimpl = Result.m7377constructorimpl(objM7386unboximpl);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7383isFailureimpl(objM7377constructorimpl) ? yDY.AhwBna() : objM7377constructorimpl;
    }
}
