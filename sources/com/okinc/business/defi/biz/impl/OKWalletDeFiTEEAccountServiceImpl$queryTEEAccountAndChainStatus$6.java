package com.okinc.business.defi.biz.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ Ref.BooleanRef $needFetchMetaData;
    final /* synthetic */ Ref.BooleanRef $needFetchTeeStatus;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, String str, Continuation<? super OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6> continuation) {
        super(2, continuation);
        this.$needFetchMetaData = booleanRef;
        this.$needFetchTeeStatus = booleanRef2;
        this.$accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6 oKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6 = new OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6(this.$needFetchMetaData, this.$needFetchTeeStatus, this.$accountId, continuation);
        oKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6.L$0 = obj;
        return oKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Ref.BooleanRef booleanRef = this.$needFetchMetaData;
                Ref.BooleanRef booleanRef2 = this.$needFetchTeeStatus;
                String str = this.$accountId;
                Result.Application application = Result.Companion;
                ArrayList arrayList = new ArrayList();
                if (booleanRef.element) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6$1$1(null), 3, null));
                }
                if (booleanRef2.element) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6$1$2(str, null), 3, null));
                }
                this.label = 1;
                obj = AwaitKt.awaitAll(arrayList, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl((List) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
