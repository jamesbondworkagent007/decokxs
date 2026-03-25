package com.okinc.okmarket.home;

import com.okinc.core.util.SPUtils;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.qTC;
import o.yEE;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2Fragment$checkNewCoinFuturesRedDot$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ MarketHomeV2Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2Fragment$checkNewCoinFuturesRedDot$2(MarketHomeV2Fragment marketHomeV2Fragment, Continuation<? super MarketHomeV2Fragment$checkNewCoinFuturesRedDot$2> continuation) {
        super(2, continuation);
        this.this$0 = marketHomeV2Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2Fragment$checkNewCoinFuturesRedDot$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((MarketHomeV2Fragment$checkNewCoinFuturesRedDot$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        NewCoinInfo newCoinInfo;
        Set setCopydefault;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Intrinsics.EZpvd((Object) qTC.copydefault.AEQbTJ(), (Object) "USDT") && (newCoinInfo = this.this$0.hDKMBd) != null) {
                Set<String> stringSet = SPUtils.getStringSet("SP_KEY_TOTAL_NEW_FUTURES_COIN_STR", new LinkedHashSet());
                Set<String> stringSet2 = SPUtils.getStringSet("SP_KEY_CURRENT_NEW_FUTURES_COIN_STR", new LinkedHashSet());
                List<String> futuresName = newCoinInfo.getFuturesName();
                if (futuresName == null || (setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(futuresName)) == null) {
                    setCopydefault = yEE.copydefault();
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Intrinsics.copydefault(stringSet2);
                linkedHashSet.addAll(stringSet2);
                linkedHashSet.addAll(setCopydefault);
                if (!linkedHashSet.isEmpty() && !stringSet.containsAll(linkedHashSet)) {
                    SPUtils.putStringSet("SP_KEY_CURRENT_NEW_FUTURES_COIN_STR", linkedHashSet, null);
                    return C56443yFo.KWHzl(true);
                }
                return C56443yFo.KWHzl(false);
            }
            return C56443yFo.KWHzl(false);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
