package com.okinc.okex.center.viewmodel;

import com.okinc.okex.center.bean.TroubleshootResultPageData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45350soD;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTroubleshootViewModel$fetchResult$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TroubleshootResultPageData>>, Object> {
    final /* synthetic */ Integer $queryChainId;
    final /* synthetic */ int $queryCurrencyId;
    final /* synthetic */ String $queryTxid;
    int label;
    final /* synthetic */ SupportTroubleshootViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootViewModel$fetchResult$1$1$1(SupportTroubleshootViewModel supportTroubleshootViewModel, int i, Integer num, String str, Continuation<? super SupportTroubleshootViewModel$fetchResult$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = supportTroubleshootViewModel;
        this.$queryCurrencyId = i;
        this.$queryChainId = num;
        this.$queryTxid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportTroubleshootViewModel$fetchResult$1$1$1(this.this$0, this.$queryCurrencyId, this.$queryChainId, this.$queryTxid, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TroubleshootResultPageData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<TroubleshootResultPageData>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<TroubleshootResultPageData>> continuation) {
        return ((SupportTroubleshootViewModel$fetchResult$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45350soD c45350soD = this.this$0.DbNXlk;
            int i2 = this.$queryCurrencyId;
            Integer num = this.$queryChainId;
            String str = this.$queryTxid;
            this.label = 1;
            objAEQbTJ = c45350soD.AEQbTJ(i2, num, str, this);
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
        return Result.m7376boximpl(objAEQbTJ);
    }
}
