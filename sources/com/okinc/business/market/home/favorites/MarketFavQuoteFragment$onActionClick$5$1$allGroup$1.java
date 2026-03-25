package com.okinc.business.market.home.favorites;

import com.okinc.market.watch.data.UserGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C55686xod;
import o.C56391yDq;
import o.C56442yFn;
import o.qWO;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$onActionClick$5$1$allGroup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserGroup>, Object> {
    final /* synthetic */ String $currentGroupName;
    final /* synthetic */ qWO $repo;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$onActionClick$5$1$allGroup$1(qWO qwo, String str, Continuation<? super MarketFavQuoteFragment$onActionClick$5$1$allGroup$1> continuation) {
        super(2, continuation);
        this.$repo = qwo;
        this.$currentGroupName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavQuoteFragment$onActionClick$5$1$allGroup$1(this.$repo, this.$currentGroupName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserGroup> continuation) {
        return ((MarketFavQuoteFragment$onActionClick$5$1$allGroup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            qWO qwo = this.$repo;
            String strKWHzl = C55686xod.KWHzl();
            this.label = 1;
            obj = qwo.AEQbTJ(strKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        }
        String str = this.$currentGroupName;
        for (Object obj2 : (Iterable) obj) {
            if (Intrinsics.EZpvd((Object) ((UserGroup) obj2).getGroupName(), (Object) str)) {
                return obj2;
            }
        }
        return null;
    }
}
