package com.okinc.unify_trade.dex.assets.data.repository;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.DexAssets;
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
public final class DexAssetsRepository$getDexAsset$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends DexAssets>>>, Object> {
    final /* synthetic */ String $chainIndex;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ C54426xHz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexAssetsRepository$getDexAsset$2(C54426xHz c54426xHz, String str, String str2, Continuation<? super DexAssetsRepository$getDexAsset$2> continuation) {
        super(2, continuation);
        this.this$0 = c54426xHz;
        this.$chainIndex = str;
        this.$tokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexAssetsRepository$getDexAsset$2(this.this$0, this.$chainIndex, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends DexAssets>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<DexAssets>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<DexAssets>>> continuation) {
        return ((DexAssetsRepository$getDexAsset$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            xHD xhd = this.this$0.AEQbTJ;
            String str = this.$chainIndex;
            String str2 = this.$tokenAddress;
            this.label = 1;
            obj = xhd.KWHzl(str, str2, this);
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
