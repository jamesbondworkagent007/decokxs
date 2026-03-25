package com.okinc.business.market.features.holdings.domain;

import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C28434kah;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class GetHoldingsUseCase$triggerDebouncedAssetUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C28434kah this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHoldingsUseCase$triggerDebouncedAssetUpdate$1(C28434kah c28434kah, Continuation<? super GetHoldingsUseCase$triggerDebouncedAssetUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = c28434kah;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetHoldingsUseCase$triggerDebouncedAssetUpdate$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetHoldingsUseCase$triggerDebouncedAssetUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        ConcurrentHashMap concurrentHashMap = this.this$0.gEmmrt;
        C28434kah c28434kah = this.this$0;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            HoldingAsset holdingAsset = (HoldingAsset) entry.getValue();
            Pair pairKWHzl = c28434kah.KWHzl(str);
            String str2 = (String) pairKWHzl.component1();
            String str3 = (String) pairKWHzl.component2();
            Iterator it = c28434kah.values.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                HoldingAsset holdingAsset2 = (HoldingAsset) it.next();
                if (Intrinsics.EZpvd((Object) holdingAsset2.fetchVPNInfo(), (Object) str2) && Intrinsics.EZpvd((Object) holdingAsset2.OLrzqt(), (Object) str3)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                c28434kah.values.set(i2, holdingAsset);
                C28434kah.updatePnLByPrice$default(c28434kah, str, null, 2, null);
            }
        }
        this.this$0.gEmmrt.clear();
        MutableSharedFlow mutableSharedFlow = this.this$0.valueOf;
        List list = this.this$0.values;
        this.label = 2;
        if (mutableSharedFlow.emit(list, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
