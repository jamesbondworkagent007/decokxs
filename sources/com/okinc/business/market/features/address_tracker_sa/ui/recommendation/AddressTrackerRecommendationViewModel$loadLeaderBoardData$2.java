package com.okinc.business.market.features.address_tracker_sa.ui.recommendation;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C25983jNp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class AddressTrackerRecommendationViewModel$loadLeaderBoardData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<List<MarketChainBean>> $chainList;
    Object L$0;
    int label;
    final /* synthetic */ AddressTrackerRecommendationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressTrackerRecommendationViewModel$loadLeaderBoardData$2(AddressTrackerRecommendationViewModel addressTrackerRecommendationViewModel, Ref.ObjectRef<List<MarketChainBean>> objectRef, Continuation<? super AddressTrackerRecommendationViewModel$loadLeaderBoardData$2> continuation) {
        super(2, continuation);
        this.this$0 = addressTrackerRecommendationViewModel;
        this.$chainList = objectRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressTrackerRecommendationViewModel$loadLeaderBoardData$2(this.this$0, this.$chainList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressTrackerRecommendationViewModel$loadLeaderBoardData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.util.ArrayList, java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef<List<MarketChainBean>> objectRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25983jNp c25983jNp = this.this$0.KWHzl;
            this.label = 1;
            if (c25983jNp.OLrzqt(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                ?? arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (Intrinsics.EZpvd((Object) ((MarketChainBean) obj2).getChainId(), (Object) "501")) {
                        arrayList.add(obj2);
                    }
                }
                objectRef.element = arrayList;
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        Ref.ObjectRef<List<MarketChainBean>> objectRef2 = this.$chainList;
        C25983jNp c25983jNp2 = this.this$0.KWHzl;
        this.L$0 = objectRef2;
        this.label = 2;
        Object objKWHzl = c25983jNp2.KWHzl(this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        objectRef = objectRef2;
        obj = objKWHzl;
        ?? arrayList2 = new ArrayList();
        while (r6.hasNext()) {
        }
        objectRef.element = arrayList2;
        return Unit.INSTANCE;
    }
}
