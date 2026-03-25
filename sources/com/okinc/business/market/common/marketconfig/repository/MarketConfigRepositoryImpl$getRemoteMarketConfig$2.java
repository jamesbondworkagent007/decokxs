package com.okinc.business.market.common.marketconfig.repository;

import com.okinc.business.market.data.model.HolderConfigData;
import com.okinc.business.market.data.model.MarketConfigData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC43419rot;
import o.C27637jyu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketConfigRepositoryImpl$getRemoteMarketConfig$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MarketConfigData>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C27637jyu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketConfigRepositoryImpl$getRemoteMarketConfig$2(C27637jyu c27637jyu, Continuation<? super MarketConfigRepositoryImpl$getRemoteMarketConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = c27637jyu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketConfigRepositoryImpl$getRemoteMarketConfig$2 marketConfigRepositoryImpl$getRemoteMarketConfig$2 = new MarketConfigRepositoryImpl$getRemoteMarketConfig$2(this.this$0, continuation);
        marketConfigRepositoryImpl$getRemoteMarketConfig$2.L$0 = obj;
        return marketConfigRepositoryImpl$getRemoteMarketConfig$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MarketConfigData> continuation) {
        return ((MarketConfigRepositoryImpl$getRemoteMarketConfig$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v17, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.okinc.business.market.data.model.MarketConfigData] */
    /* JADX WARN: Type inference failed for: r13v18, types: [T, com.okinc.business.market.data.model.MarketConfigData] */
    /* JADX WARN: Type inference failed for: r2v14, types: [T, com.okinc.business.market.data.model.MarketConfigData] */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.okinc.business.market.data.model.MarketConfigData] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MarketConfigRepositoryImpl$getRemoteMarketConfig$2$marketDeferred$1(this.this$0, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MarketConfigRepositoryImpl$getRemoteMarketConfig$2$bannerDeferred$1(this.this$0, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot2 = (AbstractC43419rot) obj;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = new MarketConfigData((List) null, (List) null, (HolderConfigData) null, (List) null, 15, (DefaultConstructorMarker) null);
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    objectRef.element = (MarketConfigData) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                }
                C27637jyu c27637jyu = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    MarketConfigData marketConfigDataKWHzl = c27637jyu.KWHzl();
                    T marketConfigData = marketConfigDataKWHzl;
                    if (marketConfigDataKWHzl == null) {
                        marketConfigData = new MarketConfigData((List) null, (List) null, (HolderConfigData) null, (List) null, 15, (DefaultConstructorMarker) null);
                    }
                    objectRef.element = marketConfigData;
                }
                if (abstractC43419rot2 instanceof AbstractC43419rot.StateListAnimator) {
                    objectRef.element = MarketConfigData.copy$default((MarketConfigData) objectRef.element, null, (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot2).KWHzl(), null, null, 13, null);
                }
                C27637jyu c27637jyu2 = this.this$0;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                    MarketConfigData marketConfigDataKWHzl2 = c27637jyu2.KWHzl();
                    if (marketConfigDataKWHzl2 == null) {
                        marketConfigDataKWHzl2 = new MarketConfigData((List) null, (List) null, (HolderConfigData) null, (List) null, 15, (DefaultConstructorMarker) null);
                    }
                    objectRef.element = MarketConfigData.copy$default((MarketConfigData) objectRef.element, null, marketConfigDataKWHzl2.KWHzl(), null, null, 13, null);
                }
                this.this$0.copydefault((MarketConfigData) objectRef.element);
                return objectRef.element;
            }
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot3 = (AbstractC43419rot) obj;
        this.L$0 = abstractC43419rot3;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = abstractC43419rot3;
        obj = objAwait2;
        abstractC43419rot2 = (AbstractC43419rot) obj;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new MarketConfigData((List) null, (List) null, (HolderConfigData) null, (List) null, 15, (DefaultConstructorMarker) null);
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        C27637jyu c27637jyu3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        if (abstractC43419rot2 instanceof AbstractC43419rot.StateListAnimator) {
        }
        C27637jyu c27637jyu22 = this.this$0;
        if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
        }
        this.this$0.copydefault((MarketConfigData) objectRef2.element);
        return objectRef2.element;
    }
}
