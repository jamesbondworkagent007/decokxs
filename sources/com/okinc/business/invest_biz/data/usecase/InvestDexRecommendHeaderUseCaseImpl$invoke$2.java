package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23635iDr;
import o.iFX;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestDexRecommendHeaderUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends SearchHeaderInfoResponse>>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ iFX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestDexRecommendHeaderUseCaseImpl$invoke$2(iFX ifx, long j, String str, Continuation<? super InvestDexRecommendHeaderUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = ifx;
        this.$chainId = j;
        this.$tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestDexRecommendHeaderUseCaseImpl$invoke$2(this.this$0, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends SearchHeaderInfoResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<SearchHeaderInfoResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<SearchHeaderInfoResponse>> continuation) {
        return ((InvestDexRecommendHeaderUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23635iDr interfaceC23635iDr = this.this$0.KWHzl;
            long j = this.$chainId;
            String str = this.$tokenAddress;
            this.label = 1;
            objOLrzqt = interfaceC23635iDr.OLrzqt(j, str, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objOLrzqt);
    }
}
