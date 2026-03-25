package com.okinc.im.usecase.group;

import com.okinc.okimcore.model.remote.GroupRecommendations;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C35775oDf;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class GetTrendingGroupsUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends GroupRecommendations>>>, Object> {
    final /* synthetic */ Boolean $excludePaidGroups;
    final /* synthetic */ Integer $maxGroupCount;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35775oDf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrendingGroupsUseCase$invoke$2(C35775oDf c35775oDf, Boolean bool, Integer num, Continuation<? super GetTrendingGroupsUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c35775oDf;
        this.$excludePaidGroups = bool;
        this.$maxGroupCount = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetTrendingGroupsUseCase$invoke$2 getTrendingGroupsUseCase$invoke$2 = new GetTrendingGroupsUseCase$invoke$2(this.this$0, this.$excludePaidGroups, this.$maxGroupCount, continuation);
        getTrendingGroupsUseCase$invoke$2.L$0 = obj;
        return getTrendingGroupsUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends GroupRecommendations>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<GroupRecommendations>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<GroupRecommendations>>> continuation) {
        return ((GetTrendingGroupsUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Integer num;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35775oDf c35775oDf = this.this$0;
                Boolean bool = this.$excludePaidGroups;
                Integer num2 = this.$maxGroupCount;
                Result.Application application = Result.Companion;
                Flow<List<GroupRecommendations>> flowKWHzl = c35775oDf.EZpvd.KWHzl(bool);
                this.L$0 = num2;
                this.label = 1;
                obj = FlowKt.firstOrNull(flowKWHzl, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                num = num2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                num = (Integer) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            List listAhwBna = (List) obj;
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            if (num != null) {
                listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) listAhwBna, num.intValue());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
