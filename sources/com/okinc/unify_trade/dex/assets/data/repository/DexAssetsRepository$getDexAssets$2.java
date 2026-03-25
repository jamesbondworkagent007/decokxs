package com.okinc.unify_trade.dex.assets.data.repository;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C54426xHz;
import o.C56391yDq;
import o.C56442yFn;
import o.xHD;

/* JADX INFO: loaded from: classes12.dex */
public final class DexAssetsRepository$getDexAssets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends DexAssetsResponse>>>, Object> {
    final /* synthetic */ Integer $hideSmallBalance;
    final /* synthetic */ Integer $pageNumber;
    final /* synthetic */ Integer $pageSize;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ C54426xHz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexAssetsRepository$getDexAssets$2(C54426xHz c54426xHz, Integer num, Integer num2, Integer num3, String str, Continuation<? super DexAssetsRepository$getDexAssets$2> continuation) {
        super(2, continuation);
        this.this$0 = c54426xHz;
        this.$hideSmallBalance = num;
        this.$pageNumber = num2;
        this.$pageSize = num3;
        this.$valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexAssetsRepository$getDexAssets$2(this.this$0, this.$hideSmallBalance, this.$pageNumber, this.$pageSize, this.$valuationUnit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends DexAssetsResponse>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<DexAssetsResponse>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<DexAssetsResponse>>> continuation) {
        return ((DexAssetsRepository$getDexAssets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            xHD xhd = this.this$0.AEQbTJ;
            Integer num = this.$hideSmallBalance;
            Integer num2 = this.$pageNumber;
            Integer num3 = this.$pageSize;
            String str = this.$valuationUnit;
            this.label = 1;
            obj = xhd.copydefault(num, num2, num3, str, this);
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
